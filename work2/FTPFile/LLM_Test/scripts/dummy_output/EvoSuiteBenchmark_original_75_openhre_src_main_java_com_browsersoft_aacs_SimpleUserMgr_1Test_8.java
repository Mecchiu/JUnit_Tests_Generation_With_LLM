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
		
    @Test
	public void test(String org) {	
        JDBMEnumeration jdbm_org = new JDBMEnumeration("jdbm:"+org); 
        System.out.println("Getting Users from "+org+"");
        Vector<String> v = jdbm_org.getNames(User.USER);
        for (String str:v) {
            System.out.println(str);
        }
    }
    
    @Test(timeout=30000)
	public void simple(String org) throws Exception {
		if (org.equals("admin")) {
			JDBMEnumeration jdbm_org = new JDBMEnumeration("jdbm:"+org+"admin");
			Vector<String> v = jdbm_org.getNames(User.USER);
			for (String str:v) {
				System.out.println(str);
			}
		} else {
			JDBMEnumeration jdbm_org = new JDBMEnumeration("jdbm:"+org);
			Vector<String> v = jdbm_org.getNames(User.USER);
			for (String str:v) {
				System.out.println(str);
			}
		}
    }
    
}

// JUnit tests in class SimpleUserMgr_1Test