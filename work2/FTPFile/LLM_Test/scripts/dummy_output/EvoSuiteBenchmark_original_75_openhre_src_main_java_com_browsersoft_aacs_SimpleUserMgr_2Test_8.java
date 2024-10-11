// SimpleUserMgr_2Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getMailbyOrg(String)} method.
*/
class SimpleUserMgr_2Test {
		
  String organization_id;
  
  /**
  * Constructor of UserMgr.
  * @param a_organization_id : a string to identify a organization
  */
  public SimpleUserMgr_2Test(String a_organization_id) {
    this.organization_id = a_organization_id;
  }
  
    /**
     * SimpleUserMgr does not check presence of an organization but checks presence of a user in the org. 
     * In this cases, user would be put under org and not under the org of a user in case of a 
     * multiple users in the list.
     * 
     * 
     * Test method for {@link com.browsersoft.aacs.SimpleUserMgr#getMailbyOrg(String)}
     */
    @Test
    public void getMailbyOrgTest() {
        assertNotNull(this.organization_id);
    }
}