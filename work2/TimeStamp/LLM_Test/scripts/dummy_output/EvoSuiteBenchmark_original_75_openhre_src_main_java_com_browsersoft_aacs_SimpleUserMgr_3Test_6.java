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
		
    @Test
    public void test1() {
        String expectedOutput = 
            "Name";
        Class<?> c = SimpleUserMgr.class;
        ArrayList<String> names = new ArrayList<String>();
        names.add("root");
        Vector<String> users_found = new Vector<String>();
        Object users = null;
        try {
            users_found = SimpleUserMgr.export();
            
            for (Object o:users_found) {
            	users = o;
            }
                
            assertNotNull(users);
            System.err.println(users.getClass().getName() + ":\n");
            for (String s : users.getClass().getEnumConstants()) {
                System.err.println("|" + s + "|");
            }
            System.err.println("\n");
            
        } catch (Throwable ignore) {
        	if (users instanceof ArrayList) {  // for arraylist,
                for (Object key:users_found) {
                	System.err.println("user " + key + " --> " + users.getClass().getName() + ":\n");
                    for (Object o:users.getClass().getEnumConstants()) {
                        System.err.println("|" + o + "|");
                        System.err.println("\n");
                    }
                    System.err.println("\n");
                }
                System.err.println("\n***Expected error: all users not in " + c.getName() + "***");
            	for (Object o:users.getClass().getEnumConstants()) {
            		System.err.println( o + " -> No User found" );
            	}
                
            } else {
                System.err.println("Exception");
                ignore.printStackTrace(System.err);
            }
        }
    }
           
    @Test
    public void test2() {
        String expectedOutput = 
            "Name";
        Class<?> c = SimpleUserMgr.class;
        ArrayList<String> names = new ArrayList<String>();
        names.add("root");
        User u = null;
        try {
            names = SimpleUserMgr.export();
            
            for (Object o:names) {
            	if ((u = SimpleUserMgr.mgr.findUser(o))) {
            		System.err.println("" + u.getFullName() + " --> " + u.getUserName() + " (" + u.getPassword() + "): ");
            		System.err.print("\n");
            	} else {
            		System.err.println("User not found.");
            	}
            }
            
        } catch (Throwable ignore) {
            if (names instanceof Vector) {
                for (Object name:names) {
                	System.err.println("user " + name + " --> " + name + " (" + name + "): ");
                    u = SimpleUserMgr.mgr.findUser(name);
                    System.err.println("User found.");
                }
            }
        }
        names.clear();
        for (String s : SimpleUserMgr.test.testNames) {
            try {
                System.err.println("Test: " + s);
                users = SimpleUserMgr.export(s);
                
                for (Object o:users.getClass().getEnumConstants()) {
                	System.err.println("- user " + o + " --> " + SimpleUserMgr.mgr.findUser(o).getName());
                	System.err.println("\n");
                }
                
            } catch (Throwable ignore) {
            	System.err.println("Exception");
            	ignore.printStackTrace(System.err);
            }
        }
        for (String s:SimpleUserMgr.test1) {
        	users = null;
        	try {
        		users = SimpleUserMgr.export(s);
        	} catch (Throwable ignore1) {
        		System.err.println("Test in 1: unexpected Exception");
        		ignore1.printStackTrace(System.err);
        	}
        	System.err.println("Test in 1: expected Exception:");
        	
        	if (users!= null) {
        		System.err.println(s + " (" + users.getClass().getName() + "): ");
        		ArrayList<User> users_found = new ArrayList<User>();
        		for (Object o:SimpleUserMgr.mgr.findUsers(s)) {
        			user_found.add(SimpleUserMgr.mgr.findUser(o));
            	}
        		
        		for (User u:users()) {
        			System.err.println(u.getFullName() + " (" + u.getPassword() + "): ");
            		user_found.add(u);
        			System.err.println("\n");
        		}
            	System.err.println(user_found);
        	        System.err.println("\n");
        	} else {
        		System.err.println(s + " (" + s + "): ");
        	}
        }
 	}

}