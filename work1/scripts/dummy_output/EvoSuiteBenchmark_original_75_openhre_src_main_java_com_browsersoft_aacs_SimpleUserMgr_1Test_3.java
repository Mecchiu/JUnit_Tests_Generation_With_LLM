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
    public void testFindUser() {
    
              JDBMEnumeration  enumeration = new JDBMEnumeration("user:");
    	 // JDBMEnumeration enumeration = new JDBMEnumeration("dc:/org/users/");
    	 String user = "sakarabkumar";

    String[]  testUser_1 = {"username", "uid_", "org_", "realm_", "mail_"};
    String[]  testUser_2 = {"name", "dn", "sakarabkumar", "user@example.com", "org."};
    
    SimpleUserMgr sm = new SimpleUserMgr("user");
    
    for (int index = 0; index < testUser_1.length; index++) {
    //    for (String token: testUser_1) {
    	  Vector<String> v = sm.getNamesbyOrg(testUser_1[index]);
    	  //System.out.println("tokens: "+ token);
    	  for (String token: v) {
    		  String real = token.substring(9);
    		  if (real.equals(user)) {
    			  // assertTrue(token.equals(testUser_1[index]));
    			  StringTokenizer st = new StringTokenizer(token, ":");
    			  assertTrue(st.hasMoreTokens());
    			  // assertTrue(st.getnext().startsWith("u="));
    			  assertEquals(testUser_1[index],st.nextToken());
    			  System.out.println("found with name: "+v.itemAt(v.indexOf(testUser_1[index])).toString());
    			  return;//return;
        		  }
    		  else if (user.equals(real)) {
    			  // assertTrue(real.equals(testUser_1[index]));
    			  assertFalse(st.hasMoreTokens());
    			  assertTrue(testUser_2[index].equals(st.nextToken()));
    			  System.out.println("not found with given name: "+testUser_2[index]);
    			  return;//return;
        		  }
    		  // assertTrue(st.hasMoreTokens());
    		  // assertTrue(v.itemAt(v.indexOf(testUser_1[index])).equals(token));
    	  }
    	  // assertTrue(st.hasMoreTokens());
    	  // assertTrue(testUser_1[index].equals(st.nextToken()));
    	// assertTrue(real.equals(testUser_2[index]));
    	  System.out.println("returning: "+testUser_2[index]); // TODO

    	}
        
    assertTrue(false);

     // System.out.println("found user named is: "+testUser_1[index]);
     // assertTrue(testUser_1[index].equals(user));
       
    
}
}