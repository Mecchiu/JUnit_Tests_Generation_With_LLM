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
		  // class under test -
	
	// public SimpleUserMgr Test;
	SimpleUserMgrTest mTest;
		/**
		 * Constructor
		 */
		public SimpleUserMgr_2Test(){
			 System.out.println("TestSimpleUserMgr_2Test:constructor");
		}
	/**
	* Tests the class SimpleUserMgr#getMailbyOrg(String arg0).
	*/
	@Test
	 public void getMailbyOrg_1arg() {
		  //System.out.println("getMailbyOrg");
		  // test class SimpleUserMgr_1
	      System.out.println("getMailbyOrg");
	      SimpleUserMgr u= new SimpleUserMgr("username", "pw");
	      System.out.println("SimpleUserMgr#getMailbyOrg method result " + u.getMailbyOrg(null));

	}
	
	/**
	* Tests the class SimpleUserMgr#getAllUsersInOrg(String arg0).
	*/
	@Test
	public void getAllUsersInOrg_1arg(){
	  //System.out.println("getAllUsersInOrg");
		  // test class SimpleUserMgr_1
	      System.out.println("getAllUsersInOrg");
		  SimpleUserMgr[] p = new SimpleUserMgr[]{new SimpleUserMgr("username", "pw")};

		  System.out.println("SimpleUserMgr#getAllUsersInOrg result is " + p[0].getAllUsersInOrg());
	}
	/**
	* Tests the class SimpleUserMgr#getMailById(String arg0).
	*/
	@Test
	public void getMailById_1arg(){
		  //System.out.println("getMailById");
		  // test class SimpleUserMgr_1
		  SimpleUserMgr u= new SimpleUserMgr("username", "pw");
		  System.out.println("SimpleUserMgr#getMailById method result " + u.getMailById(null));

	}
	/**
	* Tests the class SimpleUserMgr#getMailByOrg(String arg0).
	*/
	@Test
	public void getMailByOrg_1arg(){
		  //System.out.println("getMailByOrg");
		  // test class SimpleUserMgr_1
		  SimpleUserMgr u= new SimpleUserMgr("username", "pw");
		  System.out.println("SimpleUserMgr#getMailByOrg method result " + u.getMailByOrg(null));

	}
	/**
	* Tests the class SimpleUserMgr#getMailByID_Unique.
	*/
	@Test
	public void getMailByID_Unique_1arg(){
		  //System.out.println("getMailByID");
		  // Test class SimpleUserMgr_1
		  String id="";
		  SimpleUserMgr u = new SimpleUserMgr("username", "pw");	
		  System.out.println("SimpleUserMgr#getMail by ID");

		  try {
			u.getMailByID(id);
			return;
		} catch (Exception e) {
			return;
		}

	}
	/**
	* Tests the class SimpleUserMgr#getUserID().
	*/
	@Test
	public void getUserID_1arg(){
		  //System.out.println("getUserID");
		  // Test class SimpleUserMgr
		  System.out.println("getUserID");
		  // Class Object:
		  SimpleUserMgr u = new SimpleUserMgr_2Test();
		  // return: string "1";
		  String id="";
	        System.out.println("SimpleUserMgr.getUserID:return value " + u.getUserID(id));

	}

	/**
	* Tests the class SimpleUserMgr#getAllUsersInOrg(String arg0).
	*/
	@Test
	public void getAllUsersInOrg_1arg(){
		  //System.out.println("getAllUsersInOrg");
		  // Test class SimpleUserMgr
		  System.out.println("getAllUsers in org");
	        SimpleUserMgr u=new SimpleUserMgr("username","pw");
	        System.out.println("SimpleUserMgr#getAllUsersInOrg method result is " + u.getAllUsersInOrg());

	}
}