// UserTest.java
package com.browsersoft.aacs;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.StringTokenizer;
import javax.naming.ldap.LdapContext;
import org.apache.xerces.impl.dv.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link User}.
* It contains one unit test case for the {@link User#checkDigest(String, String)} method.
*/
class UserTest {
		private final String testName = UserTest.class.getName()+":testUser";
    	private LdapContext context = null;
    	private String testUser = "testUser";
    	private String testUser2 = "testUser2";
    	private Set<String> groups = new HashSet<String>();
	
	 	@Test
	    public void testUser() {
	        checkNull();
	        getUserID();
	    }
	    
	    private void checkNull()
	    {
	    	users.add(null);
	    	users.add(null);
	    	users.add(null);
	    	users.add(null);
	    	users.add(null);
	    	users.add(null);
	    	// check that it is not possible to lookup a user without it's ID
	    	users.add(testUser);
	     	users.add(testUser1);
	    	// Check Digest with a null id
	    	String digest = user.checkDigest(null, null);
	     	assertNull(digest);
	    }	
		
		private void getUserID(){
			assertTrue(users.contains(null));
			users.remove(null);
			Set<String> s = users;
			while(!s.isEmpty()){
				String temp = s.iterator().next();
				assertNull(temp);
				s = s.iterator().next().equals(testUser)?users:s;
			}
		}	
	}