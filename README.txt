After you generate a starter project, these instructions will help you with what to do next.

The Open Liberty starter gives you a simple, quick way to get the necessary files to start building
an application on Open Liberty. There is no need to search how to find out what to add to your maven or 
gradle build files. A simple RestApplication.java file is generated for you to start creating a REST 
based application. A server.xml configuration file is provided with the necessary features for the 
MicroProfile and Jakarta EE versions that you previously selected.

If you plan on developing and/or deploying your app in a containerized environment, the included Dockerfile 
will make it easier to create your application image on top of the Open Liberty Docker image.
Zach added this
1) Once you download the starter project, unpackage the .zip file on your machine.
2) If you selected Maven as your build tool, then open a command line session, navigate to the 
   installation directory, and run `mvnw liberty:run`. This will install all required dependencies and 
   start the default server. When complete, you will see the necessary features installed and the message 
   "server is ready to run a smarter planet."

  A starter project using Maven is generated for you with the following files:
  * mvnw
  * mvnw.cmd
  * pom.xml
  * src/main/java/com/demo/rest/RestApplication.java
  * src/main/liberty/config/server.xml
  * Dockerfile
  * .dockerignore

3) If you selected Gradle as your build tool, then open a command line session, navigate to the installation 
   directory, and run `gradlew libertyStart` to start the default server. When complete, you will see the 
   necessary features installed from the installFeature task and the message "server is ready to run a smarter planet."

  A starter project using Gradle is generated for you with the following files:
  * build.gradle
  * gradlew.bat
  * gradlew
  * settings.gradle
  * src/main/java/com/demo/rest/RestApplication.java
  * src/main/liberty/config/server.xml
  * Dockerfile
  * .dockerignore

For information on developing your application in dev mode using either Maven or Gradle, see the dev mode documentation 
(https://openliberty.io/docs/latest/development-mode.html).

For further help on getting started actually developing your application, see some of our Microprofile guides 
(https://openliberty.io/guides/?search=microprofile&key=tag) and Jakarta EE guides 
(https://openliberty.io/guides/?search=jakarta%20ee&key=tag).

If you have problems building the starter project, make sure the Java SE version on your machine matches the Java SE version 
you picked from the Open Liberty starter on the downloads page (https://openliberty.io/downloads/). 
You can test this with the command `java -version`.

Open Liberty performs at its best when running using Open J9 which can be obtained via IBM Semeru 
(https://developer.ibm.com/languages/java/semeru-runtimes/downloads/). For a full list of supported Java SE versions 
and where to obtain them, reference the Java SE support page (https://openliberty.io/docs/latest/java-se.html).

If you find any issues with the starter project or have recommendations to improve it, open an issue in the starter GitHub repo (https://github.com/OpenLiberty/start.openliberty.io).
