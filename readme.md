

![](http://www.hypercat.io/uploads/1/2/4/4/12443814/8787830.png)


# Hyper/CAT Java Library
[http://www.hypercat.io/](http://www.hypercat.io/ "HYPERCAT")

A simple in memory HYPER/CAT using Spring Boot


Requires Gradle 2.4 and Java 1.7 to be installed

To run the cat just type `gradle bootRun`, you must add a gradle.properties properties file to the project to allow it to compile but it can be empty 

The hypercat will be located at locahost:8080 (if you deploy to an existing Tomcat container it will be at /cat)

The application supports automated deployment, add  add the following to the gradle.properties file:


    devHostname=<host>
    devUsername=<name>
    devPassword=<password>
    prodHostname=<host>
    prodUsername=<name>
    prodPassword=<password>


The Gradle tasks deployToDev and deployToProd can then be used to push the cat to dev and production Tomcat servers.
Tomcat needs to be running and have the manager-script role enabled 


