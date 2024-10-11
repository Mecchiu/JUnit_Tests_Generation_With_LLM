// QuickServer_0Test.java
package org.quickserver.net.server;

import java.io.*;
import java.lang.management.ManagementFactory;
import java.net.*;
import org.quickserver.net.*;
//v1.1
import org.quickserver.net.qsadmin.*;
//v1.2
import java.util.logging.*;
//v1.3
import org.quickserver.util.pool.*;
import org.quickserver.util.pool.thread.*;
import org.apache.commons.pool.*;
import org.quickserver.util.xmlreader.*;
import org.quickserver.sql.*;
//v1.3.1
import java.util.logging.Formatter;
import java.util.*;
//v1.3.2
import org.quickserver.util.*;
//v1.3.3
import org.quickserver.security.*;
//v1.4.0
import javax.net.ssl.*;
import javax.net.*;
import java.security.*;
import java.security.cert.*;
//v1.4.5
import java.nio.channels.*;
import org.quickserver.net.server.impl.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QuickServer}.
* It contains one unit test case for the {@link QuickServer#getVersion()} method.
*/
class QuickServer_0Test {

    public static void main(String[] args) {
        boolean autoInit = false;
        try {
            quickServerClass = Class.forName("org.quickserver.net.server.QuickServer")
                   .getDeclaredConstructor().newInstance();
            quickServerClass.getMethod("init").invoke(null);
            System.out.format("Version:%s  %8s%n",
                    quickServerClass.getMethod("getVersion").invoke(quickServerClass).toString(),
                    smartName(quickServerClass.getMethod("getVersion").invoke(quickServerClass)));
            assertTrue("The QuickServer is not initialized properly",
                    System.getSecurityManager()!= null);
            quickServer.getVersion();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                System.getSecurityManager().checkPermission(
                        SecurityConstants.PROPERTY_INIT_QUICKSERVER_ONLY);
            } catch (SecurityException se) {
                warn("Permission is not granted.");
            }
        }
    }
    
    private static String smartName(Method m) {
        return m.getName()
           .replace("/", ".")
           .replace(":", "_")
           .replace(" ", "_");
    }

    public static Object clone(Object o) {
        return o;
    }
    
    public void run() {
        // Create a service object
        Object serviceObject = null;
        try {
            final ServiceReference ref = quickServerClass.getMethod(
                  "getComponent").invoke(quickServerClass);
            serviceObject = ref.createService();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Service svc = (Service)serviceObject;

        // Create the instance of the Service
        quickServer = (quickServer)svc.getProperty(
                "quickserver.quickserver.xmlreader.serviceinstance");
        quickServer.setName("Echo Server");
        quickServer.setAutoInit(autoInit);

        // Call the start() method of the singleton service
        try {
            quickServer.start();
        } catch(AppException ae) {
            System.out.println("The program exited with an error.");
            if(ae.getCause() instanceof IOException) {
                System.out.println("The error was because an I/O error occurred in the socket socket used");
                System.