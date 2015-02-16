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
@ToString
public class Address {
    @Getter @Setter private String address;
    @Getter @Setter private String zip_code;
    @Getter @Setter private String postal_town;
    @Getter @Setter private String district;
    @Getter @Setter private GeoPosition geo_position;
    @Getter @Setter private String hours;
}
