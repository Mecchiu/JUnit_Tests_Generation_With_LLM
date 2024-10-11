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
		private String org;
		private SimpleUserMgr mgr;
        
    /**
     * Constructs a SimpleUserMgr object.
     *
     * @param org the organization name (o field in LDAP);
     */
    public SimpleUserMgr_1Test(String org) {
        this.org = org;
        mgr = new SimpleUserMgr();
    }
    
    /**
     * Test of getNamesbyOrg method, of class SimpleUserMgr.
     */
    @Test
    public final void testGetNamesbyOrg(){
        System.out.println("testGetNamesbyOrg");
        mgr.clearMgr();
        
        /*
         * The orgName of the organization should also be set to the current value (org name is not retrieved here)
         */
        assertEquals(org, mgr.getNamesbyOrg(org));
    }
     
    /**
     * Test of getUserNameByUserLogin method, of class SimpleUserMgr.
     */
    @Test
    public final void testGetUserNameByUserLogin(){
        System.out.println("testGetUserNameByUserLogin");
         mgr.clearMgr();
        
        // The User must exist and name is in it 
        String userLogin = "test_userlogin";
        // Create a new record with the passed in login name
        Vector<String> vecNames = new Vector<String>();
        String pass = userLogin + "123";
        Object[] vecs = new String[] {pass};
        try {
            JDBMRecordManager dm = new JDBMRecordManager();
            JDBMHashtable table = dm.initialiseTable();
            JDBMRecordManager mgr = new JDBMRecordManager();
            mgr.initialiseTable();
            Vector<String> vec = new Vector<String>();
            vec.addElement(userLogin);
            vec.addElement(pass);
            dm.insert(vecNames, vecs);
            
            // Get the record for the org and create it again with different login name
            try {
                dm.get(new JDBMName("organization_o"), vecs);
                fail("Exception should have been thrown for non existent name in the db");
            }  catch(NullPointerException e) {
                assertEquals("Non existent user for " + vecs[0], e.getMessage());
            }
        } finally {
            try {
                dm.closeTable();
                dm.closeRecordManager();
                mgr.closeRecordManager();
                mgr.closeTable();
            } catch (IOException ignore) {
            }
        }
        
        // The orgName of the organization has not been set yet
        assertEquals("", mgr.getNamesbyOrg(org));
        
        // The uuid will be used for the names
        String uuid = mgr.getNamebyUuid();
        assertNotNull(uuid);
        // The uuid has been set
        assertNotNull(mgr.getUuid(uuid));
        
        int nrOfName = mgr.getNrOfName(uuid);
        assertEquals(1, nrOfName);
    }
    
    /**
     * Test of clearAll method, of class SimpleUserMgr.
     */
    @Test
    public final void testClearAll(){
        System.out.println("testClearAll");
        
        // The UUID of the LDAP record manager and DB should not match
        assertNotSame("", mgr.getUuid(null));
        assertNotSame("", null);
        
        // Create a new record manager
        JDBMRecordManager mgr = new JDBMRecordManager();
        
        // Register the UUID
        String uuid = mgr.getUuid(null);
        Object[] objs = new String[] {uuid};
        

        Vector<Vector<String>> udpList = null;
        try {
            // Get the list from the DB
            udpList = new Vector<Vector<String>>();
            JDBMHashtable db = mgr.initialiseTable();
            db.insert(objs);
            ArrayList<String> arr = db.get(new Vector<String>(objs));
            if (arr!= null) {
                for (int idx = 0; idx < arr.size(); idx++) {
                    udpList.add(new Vector<String>(arr.get(idx)));
                }
            } else {
                System.out.println("Can't create the udp list in the table");
            }
    
            // Perform the clear
            mgr.clearAll();
    
            // Check the list is empty
            assertNull(udpList);
    
            // Perform the clear again
            mgr.clearAll();
            
            // Check the list is not empty
            Vector<String> v1 = new Vector<String>();
            v1.addElement("org");
            v1.addElement(uuid);
            assertEquals(1, udpList.size());
            assertEquals("org", udpList.get(0).get(0));
            assertEquals("uuid", udpList.get(0).get(1));
        }  finally {
            try {
                mgr.closeTable();
                mgr.closeRecordManager();
                mgr.closeTable();
            } catch (IOException ignore) {
            }
        }
        
        // The uuid of the LDAP record manager and DB should not match
        String uuid2 = mgr.getUuid(null);
        assertNotSame("", mgr.getUuid(null));
    }
}