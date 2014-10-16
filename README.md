Sitevision Contact Portlet
==========================

A portlet application built on the Spring Portlet MVC framework. Displays contact information on the City of Malmo's external web site.

The application contains a portlet (kontaktruta-stadsomraden) and a servlet (district) which serves as back-end for the "Find city area by address" autocomplete function of the portlet.      

## Dependencies
* Sitevision Server 3
* Ant

## Build & Deployment
* Use the `config/kontaktruta.properties.example` as a template and copy it to the folder that corresponds to the environment that you are going to build the project for, for example `config/test/kontaktruta.properties`. Update `kontaktruta.properties` with current passwords and URLs but do not commit the file to source control.
* in the folder `/src/build` run the command `ant -Dsitevision.dir=[Path to Sitevision server] compile-deploy-[dev/prod/test]` for example `C:\git\sitevision-contact-portlet\src\build>ant -Dsitevision.dir=c:/Sitevision compile-deploy-dev`
* Deploy manually to the server by copying the resulting file `/dist/kontaktruta` to `[Path to Sitevision server]/tomcat/webapps`
* (Optionally, to have Ant deploy directly to the server: modify the Deploy-* target in the `/src/build/build.xml` file by uncommenting the SCP Task and entering current password/username to the server)  
 
 
## Development
The project can be imported into Eclipse as a Java project

## Licence
Released under AGPL version 3.
 