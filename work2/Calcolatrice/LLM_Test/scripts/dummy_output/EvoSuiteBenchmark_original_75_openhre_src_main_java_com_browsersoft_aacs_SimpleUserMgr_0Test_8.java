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
     * Constructor - Default constructors.
     */
    public SimpleUserMgr_0Test(){}
    
    /**
     * Constructor - No default constructor.
     */
    public SimpleUserMgr_0Test(String username){}
    
    /**
     * Constructor.
     * @param username cn variable.
     */
    public SimpleUserMgr_0Test(String username){}
    
    /**
     * Constructor.
     * @param username cn variable.
     * @param org o variable.
     * @param email email variable.
     */
    public SimpleUserMgr_0Test(String username, String org, String email){}
    
    /**
     * Get User. 
     * 
     * @param username cn variable.
     * @param org o variable.
     * @param email email variable.
     * @return User
     */
    public User getUser(String username, String org, String email) throws IOException, Exception;
	
    /**
     * Get User from a given URL.
     * @param url URL of the user.
     * @return User
     */
    public User getUserFromURL(URL url) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream())); 
		String userName = reader.readLine(); 
		return new User(userName);
	}
	
    /**
     * Get User from a property file.
     * @param properties Property of the user.
     * @return User
     */
    public User getUserFromProperties(Properties properties) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(properties.getProperty("user.name")));
        String userName = reader.readLine(); 
		return new User(userName);
	}

    /**
     * Get User from a property file.
     * @param properties Property of the user.
     * @param defaultUser cn variable
     * @return User
     */
    public User getUserFromProperties(Properties properties, String defaultUser) throws Exception {
        String userName = properties.getProperty("user.name");
        return new User(jdbmLoginFromProperties(userName, defaultUser));
    }    
	
    /**
     * Get user by the first property in the user.properties file.
     * @param userName cn variable
     * @return User
     */
    public User getUserByProperty(String userName) throws Exception {
        String propFileContent = propertiesFileContent(userName, "");
		return getUserFromProperties(new Properties(new StringReader(propFileContent)).toString());
	}
    
    /**
     * Get user by the first property in the user.properties file.
     * @param userName cn variable
     * @param defaultUser cn variable
     * @return User
     */
    public User getUserByProperty(String userName, String defaultUser) throws Exception {
        String propFileContent = propertiesFileContent(userName, defaultUser);
		return getUserFromProperties(new Properties(new StringReader(propFileContent)).toString());
	}

	/**
	 * Returns a String to the properties file.
	 * @param userName cn variable
	 * @return the properties file
	 */
	private String propertiesFileContent(String userName) {
		String propFileContent = "";

		// User.name=userName
		// User.org=organization
		// User.email=email
		
		PropFile propFile = new PropFile(userName, null, null, null);
		StringTokenizer tokenizer = new StringTokenizer(propFile.toString(), "\r\n");
		assertEquals(3, tokenizer.countTokens());
		System.out.println("Tokenizer:");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		
		while (tokenizer.hasMoreTokens()) {
			propFileContent += tokenizer.nextToken() + "\r\n";
		}
		
		return propFileContent;
	}
    
    /**
     * Get User from the default user
     * @param userName cn variable
     * @return User
     */
    public User getUser(String userName) throws Exception {
        return new User(userName);
    }

    /**
     * Get User from the default user
     * @param userName cn variable
     * @param defaultUser cn variable
     * @return User
     */
    public User getUser(String userName, String defaultUser) throws Exception {
        return new User(userName);
    }

    /**
     * Get a User object by id.
     * 
     * @param id cn variable
     * @return User
     */
    public User getUser(String id) throws Exception {
        String userName = new String();
        Vector lineVector = new Vector();
        StringTokenizer tokenizer = new StringTokenizer(id, "\n");
        while (tokenizer.hasMoreTokens()) {
            lineVector.add(new String(tokenizer.nextToken()));
        }
        while (lineVector.size() > 0) {
            System.out.println(lineVector.elementAt(0));
            userName = (String)lineVector.elementAt(0);
            System.out.println(lineVector.size());

            lineVector = new Vector();
            tokenizer = new StringTokenizer(",", "\n");
            while (tokenizer.hasMoreTokens()) {
                lineVector.add(new String(tokenizer.nextToken()));
            }
        }
        return new User(userName);
    }

	/**
	 * Return an array of Users.
	 * @return an array of users
	 */
	public User[] getAllUsers(){
		
		ArrayList<User> users;
		
		Users[] usersArray = new Users[0];
        
	    String res = getUser("");
	    System.out.println(res);
		
	    users = new ArrayList<User>();
	    usersArray = new Users[1];
	    
	    res = getUser("");
	    System.out.println(res);
	   
	   users = new ArrayList<User>(0);
	    users.add(new User("test"));
	    usersArray[0] = users;
	    

	    res = getUser("");
	    System.out.println(res);
}
}