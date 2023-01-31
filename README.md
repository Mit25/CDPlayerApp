# CDPlayerApp
This application is created to have a hands on experience for learning Java Sprint Framework.

### Functionality
#### v1.0
- Created Java Spring application which uses Java class based configuration.
	- This configurations uses auto scan feature to find beans in given package.
- Auto wiring used to inject dependency into a bean.
- Application is initialized using AnnotationConfigApplicationContext. 
#### v1.1
- Added configuration for initializing DispatcherServlet.
- Added build script to build the application and create war file to deploy it on tomcat server.
	- Root- User accessible html/jsp files
	- WEB-INF/classes- all java source code files
	- WEB-INF/lib- all library files
	- WEB-INF/views- jsp files for views
- #ToDo 
	- Add configuration for variables used in build file.
	- Learn about Spring Model and View and utilize that in home controller.
	- Add verbose functionality in build, run scripts
	- Add logging for Spring application
	- Store deploy password in configuration (deployer:cDplAYeraPP1211)

### Future Scope
- Create a logging library which can be imported as a jar and can be used with different levels of logging.
