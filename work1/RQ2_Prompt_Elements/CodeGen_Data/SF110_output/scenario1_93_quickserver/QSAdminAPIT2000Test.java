// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
/**
    * Test method to logon using {@link QSAdminAPI#logon()} method.
    */
    @Test
    public final void testLogon() throws IOException {
        QSAdminAPI qsAdminApi = new QSAdminAPI("127.0.0.1", 9080);
        if(!qsAdminApi.logon()) {
            System.out.println("Bad Login");
            if(!qsAdminApi.logon()) {
            } else {
            }
        } else {
            System.out.println("Logged in");
        }
    }
    /**
    * Test method to logon using {@link QSAdminAPI#close()} method.
    */
    @Test
    public final void testClose() throws IOException {
        QSAdminAPI qsAdminApi= new QSAdminAPI("127.0.0.1", 9080);
        if(!qsAdminApi.close()) {
            System.out.println("Bad Login");
            if(!qsAdminApi.close()) {
            } else {
            }
        } else {
            try {
                Thread.sleep(2000);    // sleep 3 secs until the service closes the connection.
            } catch (InterruptedException e) {
                System.out.println("Server closed abnormally");
                throw e;
            }

        }
    }
    }
