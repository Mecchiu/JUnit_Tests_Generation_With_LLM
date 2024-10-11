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
    * SimpleUserMgr class constructor
    */
	public SimpleUserMgr_0Test() {
		
	}
	/**

	* Test -getUser for user with email
	*/
	@Test
	public void testGetUserEmail() {
		// test is a success case

		User user = getUser("user", "sales.aacs@gmail.com", "test");
		
	}
	/**

	* test is a successful case
	*/
	@Test
	public void testGetUser() {
		// test is a success case

		User user = getUser("user", "sales.aacs@gmail.com", "test");
		
	}
	/**
	* Test for the constructor 
	*/
	@Test
	public void testInitUser() {
		
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		assertNotNull(simpleUserMgr);

	}
	/**
	* Test method for create
	*/
	@Test
	public void testCreate() {
		//Test
		JDBMRecordManager simpleUserMgr1 = new JDBMRecordManager();
		simpleUserMgr1.setRecordPath(simpleUserMgr.getUserFilePath());
		// test createUser with the record path
		String str1 = "User2";
		Vector<String> vect1 = new Vector<String>();
		vect1.addElement(str1);
		Vector<String> vect2 = new Vector<String>();
		vect2.addElement("pass");
		ArrayList<String> vect3 = new ArrayList<String>(2);
		vect3.addElement("user1");
		vect3.addElement("sales.aacs@gmail.com");
		ArrayList<String> vect4 = new ArrayList<String>(2);
		vect4.addElement("user2");
		ArrayList<String> vect5 = new ArrayList<String>(2);
		vect5.addElement("user3");
		ArrayList<String> vect6 = new ArrayList<String>(2);
		vect6.addElement("sales.aacs@gmail.com");
		HashSet<HashSet<String>> hashSet1 = new HashSet<HashSet<String>>();
		
		
		vect1.addElement("first_user");
		vect1.addElement("sales");
		vect2.addElement("passwd");
		
		vect3.addElement("sales.aacs@gmail.com"); 
		
		vect4.addElement("user1");
		vect5.addElement("sales");
		vect6.addElement("passwd");
		
		vect4.addElement("user2");
		vect5.addElement("sales4");
		vect4.addElement("passwd");
		vect5.addElement("sales5");
		vect6.addElement("passwd");
		
		vect4.addElement("user3");
		vect5.addElement("sales5");
		vect6.addElement("passwd");
		
		vect4.addElement("sales6");
		
		vect1.addElement("sales7");
		vect2.addElement("passwd");
		
		vect3.addElement("sales8");
		vect4.addElement("passwd");
		
		vect1.addElement("user1");
		vect2.addElement("passwd");
		// test that a simple user can not be created
		assertTrue("Test", simpleUserMgr1.create(vect1, vect1));
		assertFalse("test", simpleUserMgr1.create(vect1, vect1));
		assertEquals("Test", vect1.size(), simpleUserMgr1.getSize(vect3));
		
		// test getAllUsers
		ArrayList<HashSet<HashSet<String>>> list = simpleUserMgr1.getAllUsers();
		assertEquals(4, list.size());
		HashSet<HashSet<String>> hashSet1H = list.get(1);
		assertNotNull(hashSet1H);
		HashSet<String> str1Set1H = new HashSet<String>(1);
		str1Set1H.add("first_user");
		assertFalse(hashSet1H.contains(str1Set1H)); 
		
		
}

            
                
                
                    
        
        
        
        
        
        
        
        