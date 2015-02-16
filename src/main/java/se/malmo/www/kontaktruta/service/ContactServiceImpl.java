/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.malmo.www.kontaktruta.service;

import com.googlecode.ehcache.annotations.Cacheable;
import com.googlecode.ehcache.annotations.KeyGenerator;
import com.googlecode.ehcache.annotations.PartialCacheKey;
import com.googlecode.ehcache.annotations.Property;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import se.malmo.www.kontaktruta.model.APISuggestion;

/**
 *
 * @author rbolton
 */
@Component
public class ContactServiceImpl implements ContactService {
    
    private RestTemplate restTemplate;
    @Autowired
    public void setRestTemplate(RestTemplate restTemplate){
        HostnameVerifier verifier = new NullHostnameVerifier();
        AppSimpleClientHttpRequestFactory factory = new AppSimpleClientHttpRequestFactory(verifier);
        restTemplate.setRequestFactory(factory);
        this.restTemplate = restTemplate;
    }
    
    @Value("${contact.api.baseurl}")
    private String BASEURL;
    
    @Override
    @Cacheable(cacheName="contacts", 
        cacheNull = false,
        keyGenerator = @KeyGenerator (
            name = "StringCacheKeyGenerator",
            properties = {
                    @Property( name="includeMethod", value="false" ),
                    @Property( name="includeParameterTypes", value="false" )
                    
            }
        )
    )
    public <T extends APISuggestion> T getContact(@PartialCacheKey String contactType, @PartialCacheKey String id, Class<T> classType) {
        T contact = null;
        try {
            contact = restTemplate.getForObject(String.format(BASEURL, contactType, id).replace("&app_token", "?app_token"), classType);
            Logger.getLogger(ContactServiceImpl.class.getName()).log(Level.INFO, new StringBuilder(" found: ").append(contact.getName()).append(" for id:").append(id).toString());
        } catch (HttpClientErrorException ex){
            Logger.getLogger(ContactServiceImpl.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return contact;
        }   
        return contact;
    }

    @Override
    public <T extends APISuggestion> T getContactByName(String contactType, String name, Class<T> classType) {       
        APISuggestion[] contacts = getContactList(contactType, name, APISuggestion[].class);
        if (contacts != null && contacts.length > 0){
            String id = contacts[0].getId();
            return getContact(contactType, id, classType);
        }
        return null;
    }

    @Override
    public <T> T getContactList(String contactType, String query, Class<T> type) {
        query = "search?q=" + query;
        T contacts = null;
        try {
            contacts = restTemplate.getForObject(String.format(BASEURL, contactType, query), type);
        } catch (HttpClientErrorException ex){
            Logger.getLogger(ContactServiceImpl.class.getName()).log(Level.SEVERE, ex.getMessage(), ex);
            return contacts;
        }   
        return contacts;
    }

}
