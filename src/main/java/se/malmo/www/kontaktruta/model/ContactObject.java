/**
 * 
 */
package se.malmo.www.kontaktruta.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author HEKA
 *
 */
public class ContactObject {
    private final Log logger = LogFactory.getLog(this.getClass());

    private Contact contact;
    private APIContact apiContact;
    private String name;
    private String title;
    private String mail;
    private String telephone;
    private String mobile;
    private String fax;
    private List<String> telephoneHours;
    private String postalAddress;
    private String postalCode;
    private String town;
    private String visitingAddress;
    private String homepage;
    private List<String> visitingHours; 
    private Boolean primecase;
    private String cn;
    private String guid;
    private String defaultAvatar;
    private List<AvatarObject> avatarList;

    public ContactObject(Contact contact, APIContact apiContact) {
        super();
        this.contact = contact;
        this.apiContact = apiContact;
        avatarList = new ArrayList<AvatarObject>();
        getAvatarList();
    }
    
    public String getName() {
        if (name == null && apiContact != null) {
            if (contact.isPerson()) {
                name = apiContact.getFirst_name() + " " + apiContact.getLast_name();
            }
            else {
                name = apiContact.getName();
            }
        }
        return name;
    }
    
    public String getTitle() {
        if (title == null && apiContact != null && checkValue(apiContact.getTitle())) {
            title = apiContact.getTitle();
        }
        return title;            
    }
    
    public String getMail() {
        if (mail == null && apiContact != null && checkValue(apiContact.getEmail())) {
            mail = apiContact.getEmail();
        }
        return mail;            
    }

    public String getTelephone() {
        if (telephone == null && apiContact != null && checkValue(apiContact.getPhone())) {
           telephone = apiContact.getPhone();
        }
        return telephone;            
    }

    public String getFax() {
        if (fax == null && apiContact != null && checkValue(apiContact.getFax())) {
            fax = apiContact.getFax();
        }
        return fax;            
    }

    public String getMobile() {
        if (mobile == null && apiContact != null && checkValue(apiContact.getCell_phone())) {
            mobile = apiContact.getCell_phone();
        }
        return mobile;            
    }

    public List<String> getTelephoneHours() {
        if (telephoneHours == null && apiContact != null && checkValue(apiContact.getPhone_hours())) {
            String apiHours = apiContact.getPhone_hours();
            if (apiHours != null){
                telephoneHours = Arrays.asList(apiHours);
            }
        }
        return telephoneHours;            
    }

    public List<String> getVisitingHours() {
       
        if (visitingHours == null && apiContact != null) {
            
            String apiHours = apiContact.getHours();
            Address address = apiContact.getVisiting();
            if (address != null && (apiContact.getHours() == null || apiContact.getHours().length() == 0) ){
                apiHours = address.getHours();
            }
            if (apiHours != null){
                visitingHours = Arrays.asList(apiHours);
            }
        }
        return visitingHours;            
    }
    
    public String getPostalAddress() {
        if (postalAddress == null && apiContact != null && checkValue(apiContact.getAddress())) {
            postalAddress = apiContact.getAddress();
        }
        return postalAddress;            
    }
    
    public String getPostalCode() {
        if (postalCode == null && apiContact != null && checkValue(apiContact.getZip_code())) {
            postalCode = apiContact.getZip_code();
        }
        return postalCode;            
    }
    
    public String getTown() {
        if (town == null && apiContact != null && checkValue(apiContact.getPostal_town())) {
            town = apiContact.getPostal_town();
        }
        return town;            
    }
    
    public String getVisitingAddress() {
        if (visitingAddress == null && apiContact != null && checkValue(apiContact.getVisitingAddress())) {
            visitingAddress = apiContact.getVisitingAddress();
        }
        return visitingAddress;            
    }

    public String getHomepage() {
        if (homepage == null && apiContact != null && checkValue(apiContact.getHomepage())) {
            homepage = apiContact.getHomepage();
           
        }
        return homepage;            
    }
    
    public boolean isPrimeCase() {
        if (primecase == null && apiContact != null) {
            primecase = apiContact.isPrimecase();
        }
        if (primecase != null)
            return primecase.booleanValue();
        else
            return false;
    }

    public String getCn() {
        if (cn == null && apiContact != null) {
            cn = apiContact.getCatalog_id();            
        }
        return cn;            
    }
    
    public String getGuid() {
        if (guid == null) {
            // possible fix create a UUID.
        }
        return guid;
    }
    
    public String getDefaultAvatar() {
        if(defaultAvatar == null && apiContact != null 
                && checkValue(apiContact.getAvatars().getSmall())) {
            
            defaultAvatar = apiContact.getAvatars().getSmall();
        }
        return defaultAvatar;
    }
    
    public List<AvatarObject> getAvatarList() {
        if(avatarList.isEmpty() && apiContact != null
                && apiContact.getAvatars() != null) {
            Avatars avatars = apiContact.getAvatars();
            if(checkValue(avatars.getXlarge())) {
                avatarList.add(new AvatarObject(avatars.getXlarge(), "600"));
            }
            if(checkValue(avatars.getLarge())) {
                avatarList.add(new AvatarObject(avatars.getLarge(), "300"));
            }
            if(checkValue(avatars.getMedium())) {
                avatarList.add(new AvatarObject(avatars.getMedium(), "180"));
            }
            if(checkValue(avatars.getSmall())) {
                avatarList.add(new AvatarObject(avatars.getSmall(), "120"));
            }
        }
        return avatarList;
    }
    
    private boolean checkValue(String value){
        return value != null && value.trim().length()>0;
    }
    
}
