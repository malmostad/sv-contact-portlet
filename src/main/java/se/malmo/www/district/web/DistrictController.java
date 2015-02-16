/**
 * 
 */
package se.malmo.www.district.web;

import java.io.IOException;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.google.gson.Gson;

import se.malmo.www.kontaktruta.model.AutocompleteResult;

/**
 * @author Henrik Karlsson, Pulsen
 *
 */
@Controller
public class DistrictController {
    private final Log logger = LogFactory.getLog(this.getClass());

    private final Gson gson = new Gson();
    
    public static final String PARAM_DISTRICT = "district";
    public static final String COOKIE_DISTRICT = "district";
    private static final String HEADER_REFERER = "Referer";
    private static final int MAXAGE = 60*60*24*365;

    private static final String addressSQL = "SELECT adressomr_lc AS address, sdf AS district FROM poi.adress_sdf WHERE adressomr LIKE ? ORDER BY adressomr";
    
    private static final String addressAreasSQL = "SELECT adressomr_lc AS address, stadsomr AS district FROM poi.adress_stadsomr WHERE adressomr LIKE ? ORDER BY adressomr";
            
    private DataSource datasource;
    private MapListHandler handler = new MapListHandler();
        
    /**
     * 
     */
    @Autowired
    public DistrictController(DataSource datasource) {
        this.datasource = datasource;
    }


    @RequestMapping("/select.do")
    public String selectDistrict(@RequestParam(PARAM_DISTRICT) String district, HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            request.setCharacterEncoding("UTF-8");
            String referer = request.getHeader(HEADER_REFERER);
            if (district != null && referer != null) {
                Cookie cookie;
                if (district.equals("ALLA")) {
                    cookie = new Cookie(COOKIE_DISTRICT, "");
                    cookie.setMaxAge(0);
                }
                else {
                    cookie = new Cookie(COOKIE_DISTRICT, URLEncoder.encode(district, "UTF-8"));
                    cookie.setMaxAge(MAXAGE);
                }
                cookie.setPath("/");

                response.addCookie(cookie);
                
                if (logger.isDebugEnabled()) 
                    logger.debug("Setting cookie: "+COOKIE_DISTRICT+"="+district);
    
                return "redirect:"+referer;
            }
            else {
                return "error";
            }
    }
    

    @SuppressWarnings("unchecked")
    @RequestMapping("/search.do")
    public String doAddressSearchJSON(ModelMap model, @RequestParam("query") String query, HttpServletRequest request) {
        
        QueryRunner runner = new QueryRunner(datasource);
        try {
            AutocompleteResult ar = new AutocompleteResult();
            ar.setQuery(query);
            query = query.toUpperCase(request.getLocale())+"%";
            List result = (List)runner.query(addressSQL, query, handler);
            String[] suggestions = new String[result.size()];
            String[] data = new String[result.size()];
            for (int i=0; i<result.size(); i++) {
                Map row = (Map)result.get(i);
                suggestions[i] = (String)row.get("address");
                data[i] = (String)row.get("district");
            }
            ar.setSuggestions(suggestions);
            ar.setData(data);
            String content = gson.toJson(ar);
            model.addAttribute("content", content);
        } catch (SQLException e) {
            logger.error(e.getMessage(), e);
        }
        
        return "searchJSON";
    }
    
    @SuppressWarnings("unchecked")
    @RequestMapping("/searchareas.do")
    public String doAddressSearchAreasJSON(ModelMap model, @RequestParam("query") String query, HttpServletRequest request) {
        
        QueryRunner runner = new QueryRunner(datasource);
        try {
            AutocompleteResult ar = new AutocompleteResult();
            ar.setQuery(query);
            query = query.toUpperCase(request.getLocale())+"%";
            List result = (List)runner.query(addressAreasSQL, query, handler);
            String[] suggestions = new String[result.size()];
            String[] data = new String[result.size()];
            for (int i=0; i<result.size(); i++) {
                Map row = (Map)result.get(i);
                suggestions[i] = (String)row.get("address");
                data[i] = (String)row.get("district");
            }
            ar.setSuggestions(suggestions);
            ar.setData(data);
            String content = gson.toJson(ar);
            model.addAttribute("content", content);
        } catch (SQLException e) {
            logger.error(e.getMessage(), e);
        }
        
        return "searchJSON";
    }
    
}
