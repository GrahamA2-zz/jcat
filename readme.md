

# Hyper/CAT Java Library

A simple in memory HYPER/CAT using Spring Boot




Requires Gradle 2.4 and Java 1.7 to be installed

To run the cat just type `gradle bootRun `



The application supports automated deployment, create a gradle.properties file and add the following:


    devHostname=<host>
    devUsername = <name>
    devPassword = <password>
    prodHostname = <host>
    prodUsername = <name>
    prodPassword = <password>


The Gradle tasks deployToDev and deployToPRod can then be used to push the cat to dev and production Tomcat servers.
Tomcat needs to be running and have the manager-script role enabled 


