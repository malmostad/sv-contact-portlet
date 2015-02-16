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
public class GeoPosition {
    @Getter @Setter private String x;
    @Getter @Setter private String y;
}
