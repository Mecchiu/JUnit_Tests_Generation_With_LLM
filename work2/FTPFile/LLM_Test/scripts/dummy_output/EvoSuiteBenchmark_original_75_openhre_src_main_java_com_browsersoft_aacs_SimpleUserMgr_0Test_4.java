// SimpleUserMgr_0Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getUser(String, String, String)} method.
*/
class SimpleUserMgr_0Test {
		
	/**
	 * Main Method and unit test with null parameters.
	 * @throws IOException
	 */
    @Test
    public void getUser_null_withName() {
        
        // Testing getUser() with null name
        User u = null;
        String errorMsg = "Name couldn't be null or empty.";
        int exitValue = u.get_user("", null, errorMsg);
        assertEquals(0, exitValue);
        assertTrue("Invalid ErrorMsg: " + errorMsg,!errorMsg.equalsIgnoreCase(u.get_user("", null, null)));
        
    }

    /**
     * Main Method and unit test with null properties.
     * @throws IOException
     */
    @Test
    public void getUser_null_properties() {
        
        // Testing getUser() with null properties
        String prop = null;
        User u = new SimpleUserMgr_0().getUser("", prop, "some username");
        assertEquals(0, u.get_user("", prop, "some username").getCount());

    }
    
	/**
	 * Main Method and unit test with null properties.
	 * @throws IOException
	 */
    @Test
    public void getUser_null_referrer() {
    
        // Testing getUser() with null properties
        User u = new SimpleUserMgr_0().getUser("", "some username");
        assertEquals(0, u.get_user("", "some username").getCount());

    }

}