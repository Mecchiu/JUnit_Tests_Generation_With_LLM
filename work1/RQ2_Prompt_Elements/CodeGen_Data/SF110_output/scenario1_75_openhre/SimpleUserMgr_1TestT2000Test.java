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

    public final static String DATABASE_PROP_NAME = "databas";
    public final static String PROPERTIES_FILE_PATH = "propertiyXml1";
	final static String COOKIE_NAME = "cookiename";
        final HashSet set = new HashSet();
    public static Vector recordManagers = null;

    {
        JDBMRecordManager rm = new JDBMRecordManager(PROPERTIES_FILE_PATH);

        rm.setProperty(DATABASE_PROP_NAME, DATABASE_PROPNAME);
        set.add(COOKIE_NAME);
        set.add("COOKIE");

        recordManagers = new Vector();
        recordManagers.add(rm);

    }

    @Test
		public void test1() throws IOException, ClassNotFoundException {
            Vector vec = new Vector();

            Properties p = new Properties();
            ArrayList <String> orgs = new ArrayList();
            
            p.put(DATABASE_PROP_NAME, DATABASE_PROPNAME);
            orgs.add(orgs[0]); // Orgname set to A/R

            p.put("cookiename", COOKIE_NAME);
            p.put("orgs.0", orgs.get(0)); // Orgname set to A/R

			
            // test of getNamesbyOrg method.
			Vector v = new Vector();
			JDBMEnumeration s = null;
            try {
                s = recman.getEnumeration(p.getProperty(COOKIE_NAME));
                v.add(null); // The vector will contain the NULL element. 
                v.add('a'); // The vector will contain a valid element.
            } catch (Exception e) {
                cat.error("getNamesbyOrg: " + e);                
            }

            assertTrue(v.contains(COOKIE_NAME));
            assertFalse(v.contains("a"));
            assertEquals(v.size(), 1, "testSizeOfVector");
            Vector tempv = (Vector)v.get(0);
            assertTrue(tempv.size() > 0, "testNonNullElement");
            assertTrue(set.contains(COOKIE_NAME), "Set isEmpty");

			
            // test of createFile.
            
            //test of set of users.
            
	    
            // test of createRecordManager.
			
            JDBMEnumeration r = null;
            try {
                r = recman.getEnumeration(p.getProperty(COOKIE_NAME));
            } catch (Exception e) {
                cat.error("getNamesbyOrg: " + e);
                return;
            }

		    test_createRecordManager(set, orgs); 
            
		    r.close();


            
        } catch (IOException e) {
            cat.error(e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            cat.error(e.getMessage());
            e.printStackTrace();
        } finally {
            if (rm!= null) rm.close();
        }
    }

    private void test_createRecordManager(HashSet set, Vector orgs  ) {

        JDBMEnumeration r = null;

        try {
            r = recman.getEnumeration(COOKIE_NAME);
        } catch (Exception e) {
            cat.error("test1: " + e);
            e.printStackTrace();
        }
        try {
	        JDBMRecordManager temp = null;
		        try {
	            test_isValidRecordManager(set, temp = 
	                              new JDBMRecordManager(PROPERTIES_FILE_PATH));
	            assertFalse(set.contains(COOKIE_NAME), "addRecordManager");
		        } catch (Exception e) {
                    e.printStackTrace();
		    }

		        
	        // clear the list of record manager
		        r = null;
		        try {
	            JDBMRecordManager temp = null;
		            try {
	                test_isValidRecordManager(set, temp = 
	                              new JDBMRecordManager(PROPERTIES_FILE_PATH));
	                assertFalse(set.contains(COOKIE_NAME), "addRecordManager");
		            } catch (Exception e) {
                        e.printStackTrace();
		        }       
		        } finally {
		            // r will be cleared in the catch block
		        }			
			
		        // add record manager to set.
		        r = recman.addEnumeration(set);
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            r.close();
	        }


        } catch (IOException e) {
            cat.error(e.getMessage());
            e.printStackTrace();
        }

    }

    private void test_isValidRecordManager(HashSet set,
			JDBMRecordManager temp) {

        JDBMEnumeration s = null;

        try {
            s = recman.getEnumeration(COOKIE_NAME);
        } catch (Exception e) {
            cat.error("test3: " + e);
            e.printStackTrace();
        }
        try {
            test_isValidRecordManager(set, s);
        } catch (Exception e) {
            e.printStackTrace();
        }



    }

    private void test_createFile(Vector vec) throws IOException {
        try {
            JDBMRecordManager r = recman.createRecordManager(
			        DATABASE_PROP_NAME, PROPERTIES_FILE_PATH, vec);

            try {
                BufferedReader rr = new BufferedReader(
                        new InputStreamReader(r.getInputSource()));
                for (int c = 0; c < 10; c++) {
                    assertEquals("c", rr.readLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

