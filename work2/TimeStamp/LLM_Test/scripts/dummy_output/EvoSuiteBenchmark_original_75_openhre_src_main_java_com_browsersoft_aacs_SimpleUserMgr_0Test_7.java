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
		
    // Constructor
    public SimpleUserMgr_0Test(){};
    
    /**
     * Run simple test cases {@link SimpleUserMgr#getUser(String, String, String)}
     */
    @Test("suite = '7.5', tc=6)
    public void testGetUser(){ }
    
    // Get User from the default config file
    @Test("suite = '10', tc=7)
    void testGetUserNoConfig(){ }
    
    
}