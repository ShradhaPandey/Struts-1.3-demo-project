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
3. Now we have pom.xml available, here we need to add dependencies for out struts application.
   
