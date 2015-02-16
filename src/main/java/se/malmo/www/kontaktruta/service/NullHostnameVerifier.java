/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.malmo.www.kontaktruta.service;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/**
 *
 * @author rbolton
 */
public class NullHostnameVerifier implements HostnameVerifier {
   @Override
   public boolean verify(String hostname, SSLSession session) {
      return true;
   }
}
