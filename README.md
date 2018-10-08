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
   The root element in thid xml file is <struts-config>
   -- <form-beans> tag contains:
      Form bean definition,
      declares the name of struts application's Form bean,
      declares the package and class name of the struts application's Form bean.
   -- <action-mapping> tag contains:
      Action definition,
      url of the action,
      name of the related Form bean (same as name given in form bean tag),
      declares the package and class name of the struts application's Action class,
      also the information that where to redirect the servlet if an error occurs,
      forward tag of action tells where to forward or redirect the servlet once the given operation has been executed.
   -- <message-resource> tag:
      provides simple ways to put text in the view page.
 6. create Message Resource file (file mentioned in the msg-resource tag of struts-config.xml)
    in the project I named id MessageBundle.properties, this properties file contains data in key value format.
    left of "=" sign is key, right of the sign is value.
    These properties can be made available to the view page by refering the key.
    In the project, when the username doesnt matches "Shradha", the error in application return the text from this file on the     view page.
 7. struts Form Bean class: HelloUserForm.java
    create this file with a file and package name as given in the struts-config.xml.
    This class extends "ActionForm" Interface.
    Contains properties and their getters/Setters, in this project just one property named "userName"
 8. struts Action class: HelloUserAction.java  
    create this file with a file and package name as given in the struts-config.xml.
    This class extends "Action" Interface.
    This acts as controller and thus takes request from client and pass it to business logic, get the response back from           business logic and gives it back to the client.
    This is done by the "execute" method of this class, which processes the specific http request and creates the                 corresponding response. 
    This method returns the instance of "actionForward" to describe where and how the control should be forwarded.
    FindForward returns the instance of "actionForward" with a specified name. So, for name = "success", it will return           specific actionForward.
 9. JSP pages, there are 2 jsp pages: 
    1st helloUser.jsp with bean taglib: it takes input from user and properta tag defines which property of the ActionForm  is     being entered by user,
    and action of the html form is set as the action path in action-mapping in struts-config.html. 
    This way the request will be sent to the Action class (HelloUserAction.java)
    2nd welcomeUser.jsp with html taglib: this page simply gives the response, which contains some msg and the property          (userName) from the ActionForm, thus we need to five name of the ActionForm (from form-bean tag in struts-config.xml)
    
    
    
   
    
      
     
      
   
   
