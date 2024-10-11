// SimpleUserMgr_3Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {
 /**
		      * The method for accessing the JDBMHashtable (in the new constructor).
		      * @return Properties
		      * @throws java.io.IOException
		      */
    private static Properties getProperties() throws IOException {
		   Properties pp = new Properties();
		   pp.load( new InputStreamReader(
		        new InputStream() {
					@Override
					public int read() throws IOException {
						return 'c';
					}
				       }) );
		   return pp;
	   }
		 /**
		      * Test constructor.
		      */
    private SimpleUserMgr_3Test() throws IOException {
	   Properties pp = getProperties();
	   id.clear();
	   id = new HashSet();
	   id.add("username");
          id.add("password1");
	   id.add("username2");
    }
		 /**
		     * The type of test to run.
		     * @param args arguments
		     */
    @Test
    public void getUsers(final String[] args) {
		   if (args.length == 1 ) {
			   // Check if the username is present in persistent hashtable.
			   JDBMRecordManager crm = new JDBMRecordManager();
			   JDBMEnumeration users = crm.enumerate("User");
			   Vector usersVector = users.next();
			   boolean found = false;
			   String nameString;
			   JDBMHashtable hash;
			   while(usersVector.hasMoreElements()) {
				   usersString = (String) usersVector.nextElement();
				   found = false;
				   if (usersString.toUpperCase().startsWith("USER") && id.containsKey(usersNameString)) {
					   nameString = getName(crm, usersString);
					   found = true;
					   break;
				   }
				   else if (usersString.toUpperCase().startsWith("USER2") && id.containsKey(usersNameString) && id.containsKey(nameString)) {
					   nameString = getName(crm, usersString);
					   found = true;
					   break;
				   }
				   if (nameString.equals(id.get(usersNameString))) {
					   found = true;
					   break;
				   }
			   }
			   if (found) {
				   System.out.println("User : '" + nameString + "' already exists.");
			   }
			   else {
				   id.add(usersNameString);
				   id.add(nameString);
				   hash = crm.get(nameString);
				   if (hash!= null) {
					   // add the hash table
					   System.out.println("Hash Table found:" + hash.getName());
				   }
				   else {
					   System.out.println("Hash table was not present.");
				   }
			   }
		   }
		   else if (args.length > 0) {
			   System.out.println("There is one argument with parameters: " +
				   args[0]);
		   }
    }
    
    public String getName(JDBMEnumeration crm, String user) {
        int index = user.toLowerCase().indexOf((String) id.get(user));
        do {
            crm.next();
            if(crm.next().toString().equals(user))
                return crm.next().toString();
        } while(index >= 0);
        return null;
    }
    
    /**
     * The tests for the {@link SimpleUserMgr_3Test#getUsers(String[])}.
     */
    @Test
    public void testGetAll() {
		  SimpleUserMgr sm = new SimpleUserMgr_3();
		  StringBuffer result = sm.getUsers(new String[] {} );
		  assertNotNull("Null users", result);
	}

	/**
	  The methods for {@link SimpleUserMgr#export()}.
	  @throws java.io.IOException
	  */
    @Test
    public void testExport() throws IOException {
		  SimpleUserMgr sm = new SimpleUserMgr_3();
		  String result = sm.export();
		  assertNotNull("Null", result);
	}
}
