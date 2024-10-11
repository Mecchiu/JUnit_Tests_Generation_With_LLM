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
/**
        *  constructor
        */
    	public UserTest() {
//        	hash = null; 			// this creates an implicit hash of 
        	sha = null;				// the SHA of the original identity
    	}

		/**	Constructor - creates a user and initializes its id.
		 *	@param name the name of the user, required.
		 */
    	public UserTest(String name) {
    		if (name == null)
				throw new IllegalArgumentException("null name");
			setIdentity(name);
		}

		/**	Constructor - creates a user and initializes its id.
		 *	@param name the name of the user, required.
		 * @param user the password for the created user.
		 */
    	public UserTest(String name, String user) {
    		if (name == null)
				throw new IllegalArgumentException("null name");
    		setIdentity(name);
			setPassword(user);
    	}

    	/**	Get the user name.
		*	@return the user name.
    	*/
    	public String getName() {
  			return getUser();
    	}

    	/**	Set the user name.
		*	@param name the user name.
    	*/
    	public void setName(String name) {
    		setIdentity(name);
    	}

    	/**	Get the identity which was used during the test.
		*	@return the user identity.
    	*/
    	public String getIdentity() {
  			return getUser();
    	}

    	/**	Set the identity which was used during the test.
		*	@param identity the user identity.
    	*/
    	public void setIdentity(String identity) {
	    	setUser(identity);
    	}

    	/** 	Get the password which was used during the test.
		 *	@return the password.
    	*/
    	public String getPassword() {
  			return getUser();
    	}

    	/**	Set the password which was used during the test.
		*	@param password the password.
    	*/
    	public void setPassword(String password) {
	    	setUser(password);
    	}

    	/** Get the User.get() returns a copy of the object.
		 * @return copy
		 */
    	public User get() {
    		if (getPassword().length() > 0) {
    			return new User(getName(), getPassword());
    		} else {
    			return new User(getName());
    		}
    	}
	
	}