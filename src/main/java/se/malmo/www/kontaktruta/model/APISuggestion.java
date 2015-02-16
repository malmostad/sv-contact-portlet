/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.malmo.www.kontaktruta.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author rbolton
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class APISuggestion {
    
    @Getter @Setter protected String catalog_id;
    @Getter @Setter protected String id;
    @Getter @Setter protected String first_name;
    @Getter @Setter protected String last_name;
    @Getter @Setter protected String name;
   
    
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        if (catalog_id != null && catalog_id.length() > 0){
            builder.append(catalog_id).append(", ");
        }
        if (name != null && name.length() > 0){
            builder.append(name);
        } else {
            builder.append(first_name).append(" ").append(last_name);
        }
        return builder.toString();
    }
    
}
