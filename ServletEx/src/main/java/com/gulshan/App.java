package com.gulshan;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LifecycleException {
        System.out.println("Hello World!");

        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        // This is crucial: forces Tomcat to create the connector on port 8080
        tomcat.getConnector();

        tomcat.start();
        System.out.println("Tomcat started successfully and listening on port 8080!");
//
//        tomcat.getServer().await();

        String baseDir = new File(".").getAbsolutePath();
        tomcat.setBaseDir(baseDir);

        Context context = tomcat.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");

        tomcat.start();
        tomcat.getServer().await();
    }
}
