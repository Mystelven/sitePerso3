My Personal Website : JavaEE CDI + JSF 2 + Twitter Bootstrap
========================

What is it ?
-----------

This is the 3rd version of my personal website. 

This time, it's no longer in PhP but in JavaEE, deployable with Maven 3+ on a server JBoss Enterprise Application Platform 6.

The source code is compliant with JavaEE 6 using JSF 2.0, CDI 1.0, EJB 3.1 JPA 2.0 and Bean Validation 1.0

System requirements
-------------------

All you need to build this project is Java 6.0 (Java SDK 1.6+) and Maven 3.0+.

The application this project produces is designed to be run on a JBoss Enterprise Application Platform 6.
 
With the prerequisites out of the way, you're ready to build and deploy and use this personal website as a template for
yours.

Deploying the application
-------------------------
 
First you need to start JBoss Enterprise Application Platform 6.
To do this, run
  
    $JBOSS_HOME/bin/standalone.sh
  
or if you are using windows
 
    $JBOSS_HOME/bin/standalone.bat

To deploy the application, you first need to produce the archive to deploy using
the following Maven goal:

    mvn package

You can now deploy the artifact to JBoss AS by executing the following command:

    mvn jboss-as:deploy

This will deploy `target/sitePerso.war`.
 
The application will be running at the following URL <http://localhost:8080/sitePerso/>.

To undeploy from JBoss AS, run this command:

    mvn jboss-as:undeploy


Downloading the sources and Javadocs
====================================

If you want to be able to debug into the source code or look at the Javadocs
of any library in the project, you can run either of the following two
commands to pull them into your local repository. The IDE should then detect
them.

    mvn dependency:sources
    mvn dependency:resolve -Dclassifier=javadoc
