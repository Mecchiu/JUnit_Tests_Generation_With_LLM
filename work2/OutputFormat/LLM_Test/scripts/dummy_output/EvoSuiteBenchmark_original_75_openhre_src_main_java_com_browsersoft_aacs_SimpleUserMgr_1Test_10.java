// SimpleUserMgr_1Test.java
package com.browsersoft.aacs;

import jdbm.JDBMEnumeration;
import jdbm.JDBMHashtable;
import jdbm.JDBMRecordManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleUserMgr}.
* It contains one unit test case for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {
		
    /**
     *  Method that initializes the class by supplying the configuration file name to the
     *  user manager from which the test is performed.
     */
    @jdbm.JDBMConstructor
    public SimpleUserMgr()
    {
        Properties config = new Properties();
        
        //Load configuration params
        config.setProperty("ldap.server", "ldap://127.0.0.1:389");
        config.setProperty("browsers.path", "/tmp/jdbm");
        config.setProperty("browsers.location", "classpath:/data/users.properties");
        config.setProperty("browsers.server", "ldap://127.0.0.1:389");
        config.setProperty("browsers.base.path", "/tmp/jdbm");
        config.setProperty("browsers.base.location", "classpath:/data/users.properties");
        
        InputStream file = null;
        try {
        
            file = this.getClass().getClassLoader()
                                           .getResourceAsStream(
        		                    "user_manager2.properties");

        } 
        catch (Exception e) {
            fail(
                "Exception thrown while loading the file: " +
                e.getMessage()
            );
    
        }

}
}