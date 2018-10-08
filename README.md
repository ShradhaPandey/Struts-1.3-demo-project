# Struts-1.3-demo-project

I created this basic project based on Struts 1.3 to revise the complete process of setting up a struts application from the scrach.
Understanding the pom.xml, web.xml, struts-config.xml, Action and ActionForm etc in struts and how they work.

Functionality of project is quiet simple: 
1. when  user enters the url: http://localhost:8080/Struts1.3DemoProject/helloUser.jsp on the local machine.
2. the jsp page is displayed with a input box, the user needs to enter a username.
3. if user enters username "Shradha", then user is redirected to welcome page and a new welcome message is displayed,
   along with the username.
4. If username enters any name other than "Shradha", the error msg is returned on the page that "Username entered is not Shradha!" 

Steps to setup a Struts 1.3 application:


1. create a new dynamic web project in your IDE, do click check on the option "generate web.xml"
2. Once project is ready, right click --> configure --> convert into maven project
3. pom.xml (Project Object Model):
   Now we have pom.xml available, here we need to add dependencies for out struts application.
   we can remove the build tag from the pom.xml and 
   go to mvnrepository.com and add following dependencies from there in our pom.xml:
   Servlet 3.1.0
   struts core
   struts tag lib
   Save the pom.xml and build the project.
4. web.xml (Web Deployment descriptor):
   Web-content --> web-inf --> web.xml
   Remove the welcome tag. Here we need to register the struts application's "Action Servlet", Action servlet act as a            controller in MVC model of struts.
   Action Servlet name and class are provided, Servlet mapping is done to map the servlet with the url.
5. struts-config.xml:
   in web-inf folder, create a new xml file with this name.
   copy the DOCTYPE from internet for 1.3 version of struts-config.xml
   
   
