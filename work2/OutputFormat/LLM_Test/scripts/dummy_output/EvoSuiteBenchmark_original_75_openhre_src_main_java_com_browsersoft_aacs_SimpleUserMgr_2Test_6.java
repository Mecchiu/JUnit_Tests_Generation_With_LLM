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
		
    private final static String org = "user1@aacs.org";
	public SimpleUserMgr_2Test(){
    }

    /**
     * Tests {@link SimpleUserMgr#getMailbyOrg(String)} on LDAP entries.
     * Tests cases where LDAP entries were not in the user's membership array.
     */
    @Test
    public void LDAPtestCases01(){
		String userMgrProperties;
		
		userMgrProperties = System.getProperty("user.mgr");
		System.err.println("user mgr.properties "+userMgrProperties);
		
		//Test that org is empty
		assertTrue(false);
        	
        	
    	
        	System.err.println("Test01.LDAP test cases "+ org);
    	String[] entries = getMailbyOrg("");
    	
    	assertEquals(0, entries.length);
    	
    	System.err.println("Test02.LDAP test case "+org);
		entries = getMailbyOrg(org);
	    
	    assertEquals(0, entries.length);
    }
  
	/**
     * Tests {@link SimpleUserMgr#getMailbyOrg(String)} on local JDBC record managers.
     * Test cases where local JDBC record managers were in the user's Membership array.
     */
    @Test
    public void testLDAPtestCases02(){
		String userMgrProperties;
		
		userMgrProperties = System.getProperty("user.mgr");
		System.err.println("user mgr.properties "+userMgrProperties);
		
		//Test that org is empty
		assertTrue(false);
        	
        	
    	
        	System.err.println("Test01.LDAP test cases "+ org);
    	JDBMRecordManager mgr;
    	String result;
    	String[] entries;
    	ArrayList<String> orgList;
    	
    	JDBMHashtable memberEntries;
		result = "";
    		
		
		try {
			
		
			mgr = new JDBMRecordManager(new JDBMHashtable(), "default", "user", new JDBMHashtable());
			
			orgList = new ArrayList<String>();
			orgList.add(org);
			
			memberEntries = new JDBMHashtable(new HashSet(orgList), "org", new JDBMRecordManager(mgr, "", "user", new JDBMHashtable()));
			
		
			
			entries = getMailbyOrg(org);
			
			assertEquals(entries.length, 0);
            		
			entries = getMailbyOrg("user1");
			assertTrue(entries.length==0);
            	
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

    /**
     * Tests {@link SimpleUserMgr#getMailbyOrg(String)} on JNDI.
     * It tests cases where JDBC records were in the user's Membership array.
     */
    @Test
    public void testJNDI() throws IOException{
		String userMgrProperties;
		
		userMgrProperties = System.getProperty("user.mgr");
		System.err.println("user mgr.properties "+userMgrProperties);
		
		Vector<String> entries;
		Vector<String> orgList;
		
		JDBMRecordManager memberMgr;
		
		JDBMHashtable memberEntries;
		
		URL jndiURL = null;
		jndiURL = new URL("java:comp/env/user/user1@jdbm.oaldeps.oars.aacs.org");
		
			
		String hostName = System.getProperty("user.realm");
		
		if(hostName==null){
			String userName = "user1";
			Properties ocsps = new Properties();
			
			ocsps.put("org", org);
			
			ArrayList<String> orgList = new ArrayList<String>();
			orgList.add(org);
			
			memberMgr = new JDBMRecordManager(new JDBMHashtable(new HashSet(orgList), "dcip", new JDBMRecordManager(ocsps)), "default", "user", new JDBMHashtable() );
			
		} else {
	        
			hostName = hostName.substring(3);
			System.err.println("hostName "+hostName);
			
			Vector<String> orgs = getMailbyOrg(hostName);
			orgList = new ArrayList<String>();
			orgList.addAll(orgs);
			
			memberMgr = new JDBMRecordManager(new JDBMHashtable(new HashSet(orgList), "dcip", new JDBMRecordManager(new String[]{hostName})), "default", "user", new JDBMHashtable());
		}
		
		entries = getMailbyOrg(hostName);
		orgList = new ArrayList<String>();
		orgList.addAll(orgs);
		memberEntries = new JDBMHashtable(new HashSet(orgList), "dcip", new JDBMRecordManager(memberMgr, "", "user"));
		
			
			entries = getMailbyOrg("user1");
			orgList = new ArrayList<String>();
			orgList.add("user");
			memberEntries = new JDBMHashtable(new HashSet(orgList), "dcip", new JDBMRecordManager(memberMgr, "", "user"));
			
		System.out.println("userMgrEntries  = "+ entries);

    }

    //TestCases02JNDITests.java
    /**
     * Tests {@link SimpleUserMgr#getMailbyOrg(String)} on JDBC and local records
     */
    @Test
    public void testJNDI2(){
        String userMgrProperties;
        
        userMgrProperties = System.getProperty("user.mgr");
        System.err.println("user mgr.properties "+userMgrProperties);
        
        Vector<String> entries;
        Vector<String> orgList;

		JDBMRecordManager memberMgr;
		
		JDBMHashtable memberEntries;
		
      	 
        URL jndiURL = null;
}
}