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
		/** Test case constructor */
	ArrayList<String> test;

	/**
	* Test case constructor for {@link SimpleUserMgr#getMailbyOrg(String)} method.
	*/
	public SimpleUserMgr_2Test() {
        test = new ArrayList<String>();
    }

	/**
	* Test case constructor for {@link SimpleUserMgr#getMailbyOrg(String)} method.
	* @param test
	*/
	public SimpleUserMgr_2Test(ArrayList<String> test) {
    	this.test = test;
    }

		// Test case - test for getEmailByOrg.
     	/**
	* Test case - test get_email_by_org method,  return email address array
	*/
    @Test
   	public void testGetMailByOrg() {
   		ArrayList<String> email = new ArrayList<String>();
   		for (int i = 0; i < test.size(); i++) {
   			email.add(test.get(i));
   		}
   		String[] result = getMailByOrg(email);
   		assertEquals(result.length, email.size());
   		for (int i = 0; i < result.length; i++) {
   			assertEquals(email.get(i), result[i]);
   		}
   		
   	}

   	// Test case - test get_email_by_org method,  return string array
    /**
     * Test case - test get_email_by_org method,  return string array
     * @param test
     * @return
     */
        @Test
    	public void testGetEmailByOrg_String() {
            String[] result;
            result = getMailByOrg(test);
            assertTrue(result.length > 0);

        }

        /**
	* Test case - test get_email_by_org method,  return string array
	* @param test
	* @return
	*/
	public String[] getMailByOrg(ArrayList<String> test) {
		ArrayList<String> temp = new ArrayList<String>();
		ArrayList<String> result = new ArrayList<String>();
		StringTokenizer str = new StringTokenizer(test.toString(), ",");
		while(str.hasMoreTokens()){
			temp.add(str.nextToken());			
		}
	 	String[] result2 =  temp.toArray(new String[test.size()]);
	        return result2;
	}



	/**
	* Test case - test get_email_by_organization_group.
	*/
    @Test
   	public void testGetMailByOrg_Group() {
   		ArrayList<String> result = new ArrayList<String>();
   		ArrayList<String> group = new ArrayList<String>();
   		group.add("BBS");
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> result2 = getMailByOrg(email, group);
        String[] result3 =  result2.toArray(new String[result2.size()]);
        assertTrue(result3.length == 1);
        assertTrue(result3.length == 1); // should be equal due to group set

   	}

	/**
	* Test case - test get_email_by_organization_test.
	* @param test
	* @param group
	* @return
	*/
	public String[] getMailByOrg_Test(ArrayList<String> test, ArrayList<String> group) {
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> result2 = getMailByOrg(email, group);
		String[] result3 =  result2.toArray(new String[result2.size()]);
        int i = result2.size();

        String [] arr = null;
        try {
            arr = result3;
        } catch (IndexOutOfBoundsException e) {
            assertTrue(false);
        }
        
        return arr;
    }

					/**
   	* Test case - test get_email_by_organization_group.
   	* @param test
   	* @param group
   	* @return
   	*/
    @Test
    public void testGetMailByOrg_Group_HashSet() {
   			ArrayList<String> result = new ArrayList<String>();
   			HashSet<String> result1 = new HashSet<String>();
        HashSet<String> group = new HashSet<String>();
        ArrayList<String> email = new ArrayList<String>();
        ArrayList<String> result2 = getMailByOrg(email, group);
        String[] result3 =  result2.toArray(new String[result2.size()]);
        int i = result2.size();

        String [] arr = null;
        try {
            arr = result3;
        } catch (IndexOutOfBoundsException e) {
            assertTrue(false);
        }
    	
    }

    /**
     *  
     * Test case - test get_email_by_organization_group.
     * @param test
     * @param group
     * @return
     */
	public String[] getMailByOrg_HashSet(ArrayList<String> test, ArrayList<String> group) {
		ArrayList<String> email = new ArrayList<String>();
		ArrayList<String> result2 = getMailByOrg(email, group);
		String[] result3 =  result2.toArray(new String[result2.size()]);
        int i = result2.size();

        String [] arr = null;
        try {
            arr = result3;
        } catch (IndexOutOfBoundsException e) {
            assertTrue(false);
        }
    
        return arr;
    }

	
// SimpleUserMgr.java ends here

}