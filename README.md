Sitevision Contact Portlet
==========================

A portlet application built on the Spring Portlet MVC framework. Displays contact information on the City of Malmo's external web site.

The application contains a portlet (kontaktruta-stadsomraden) and a servlet (district) which serves as back-end for the "Find city area by address" autocomplete function of the portlet.      

## Dependencies
* Sitevision Server 3
* Maven 3

## Build & Deployment
* Use the `config/kontaktruta.properties.example` as a template and copy it to the folder that corresponds to the environment that you are going to build the project for, for example `config/external/test/kontaktruta.properties`. Update `kontaktruta.properties` with current passwords and URLs but do not commit the file to source control.
* in the project's folder, run the command `mvn -P[malmo-komin-prod/malmo-komin-test/malmo-external-prod/malmo-external-test] clean install` for example `C:\git\sitevision-contact-portlet>mvn -Pmalmo-external-test clean install`
* Deploy manually to the server by copying the resulting file `/target/kontaktruta.war` to `[Path to Sitevision server]/tomcat/webapps`
 
 
## Development
The project can be imported into Eclipse as a Java project

## Licence
Released under AGPL version 3.
 
