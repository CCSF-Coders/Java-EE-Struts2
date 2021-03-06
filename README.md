# Java-EE-Struts2
Simple exploratory project using basic Java EE technologies and Apache Struts2

The code from each week is saved as a "release" in this repository. Each release runs on it's own, but if you want to step through the weeks yourself as shown below, then download each release and run it under Apache Tomcat.

### Week1 - Installing Apache Tomcat
We downloaded and installed [Apache Tomcat](https://tomcat.apache.org). A couple of notes and issues.
  
  * You want to install it in your user directory, not a root or admin directory. This is better for development. In windows for example, in /users/username or in mac /usr/whatever. Typical instructions found online tend to instruct you to install it in an admin or other protected area. 
  * Tomcat 9 and 8.5 are out, but install an 8.0 version. That works better with Eclipse and other IDE's.
  * Important directories to know about are **conf** and **logs**. You don't have to make any changes out of the box, but it's good to know about them.
  * Running tomcat means executing the bin/startup.bat or bin/startup.sh. If running on a linux/mac system, be sure that all the .sh files are executable. Use `(chmod +x *.sh)` from bin for that.
  * Once it's running then use a browser to open http://localhost:8080. If everythings is running properly you will see the Tomcat start page. Looking at the examples is instructive.
  * Look into configuring tomcat in Eclipse or your IDE. This is the best option for running and debugging the Java we will be writing in this project.  

### Week2 - Development Environment and Two Simple Servlets
  * We ran tomcat under the IDE. This is important because the IDE runs tomcat in a development mode. This allows you to debug apps running under tomcat and also to run different servers and configurations.
  * Created a "Dynamic Web Project" in Eclipse. Set the tomcat server as the runtime environment. This is important so that Eclipse knows to bring the Tomcat jars into the project. The most important jar at this time is the servlet jar that has the HttpServlet code for writing servlets.  
  * Created an HttpServlet by hand. The we deleted that and had Eclipse create one for us. Eclipse automatically added an annotation for the URL endpoint.
  * Run the project and open `http://localhost:8080/Java-EE-Struts2/Hello` 
  * Simplified the HelloWorldServlet and added some additional HTML code to the output.
  * Created a GoodBye servlet, basically the same as the HelloServlet, and create links on the HTML output to link back and forth to each servlet. 
  * Changed to WEB-INF/web.xml based configuration just to cover the topic of configuration in greater detail.
  
### Week3 - Add JSP pages
  * Created a Hello.jsp and a GoodBye.jsp. 
  * Removed the simple html code from the servlets and put it into the JSP pages.
  * Added redirects in the servlets to point to the to the jsp pages.
  * Fixed up the HTML in the JSP pages to look a little like menus.
      
### Week 4 - Finish HTML portion
  * Changed names to lower case. 
  * Renamed hello jsp and java to index jsp and index 
  * Updated web.xml to reflect changes. 
  * Changed web.xml to use "" (context root) as URL for index. 
  * Added a simple form to goodbye.jsp and doPost processing to Goodbye.java.

### Week 5 - Add JDBC driver
  * Added a StartStop Listener to the application to capture initialization and shutdown
  * removed Index.java's init method because it was not used
  * Downloaded HSQLDB pure Java database engine.
  * Added hsqldb.jar to the WEB-INF/lib directory 
  * Added code to open database connection, create a table, and add a row to the StartStopListener
  * Added code to (re) open a database connection and retrieve rows to the Index.java servlet.

### Week 6 - Add model.Registration class
  * Added a model.Registration class to represent the database table.
  * passed the model.Registration to a jsp page.
  * displayed values from the passed Java Bean on the jsp page. 
