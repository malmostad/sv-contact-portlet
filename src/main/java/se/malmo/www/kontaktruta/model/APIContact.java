/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.malmo.www.kontaktruta.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author rbolton
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString(callSuper = true)
public class APIContact extends APISuggestion {
    @Getter @Setter protected String title;
    @Getter @Setter protected String email;
    @Getter @Setter protected String company;
    @Getter @Setter protected String department;
    @Getter @Setter protected String phone;
    @Getter @Setter protected String phone_hours;
    @Getter @Setter protected String cell_phone;
    @Getter @Setter protected String fax;
    @Getter @Setter protected String address;
    @Getter @Setter protected String zip_code;
    @Getter @Setter protected String postal_town;
    @Getter @Setter protected String district;
    @Getter @Setter protected Address visiting;
    @Getter @Setter protected String hours;
    @Getter @Setter protected String room;
    @Getter @Setter protected String legacy_dn;    
    @Getter @Setter protected String homepage;
    @Getter @Setter protected boolean primecase;
    @Getter @Setter protected Avatars avatars;
    
    public String getVisitingAddress(){
        if (visiting != null){
            return visiting.getAddress();
        }
        return null;
    }
        
    @Override
    public String getName(){
        if (name != null && name.length() > 0){
            return name;
        } else {
            return first_name + " " + last_name;
        }
    }
}
