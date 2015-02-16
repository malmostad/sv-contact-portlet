/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.malmo.www.kontaktruta.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import org.springframework.http.client.SimpleClientHttpRequestFactory;

/**
 *
 * @author rbolton
 */
public class AppSimpleClientHttpRequestFactory extends SimpleClientHttpRequestFactory {

   private final HostnameVerifier verifier;

   public AppSimpleClientHttpRequestFactory(HostnameVerifier verifier) {
      this.verifier = verifier;
   }

   @Override
   protected void prepareConnection(HttpURLConnection connection, String httpMethod) throws IOException {
      if (connection instanceof HttpsURLConnection) {
         ((HttpsURLConnection) connection).setHostnameVerifier(verifier);
      }
      super.prepareConnection(connection, httpMethod);
   }

}
