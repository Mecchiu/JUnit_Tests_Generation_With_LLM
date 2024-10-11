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
private final String orgName = "Org name2";

		private final String userEmail_;

        public SimpleUserMgr_2Test(String orgName, String userEmail) {
                this.orgName=orgName;
                this.userEmail_=userEmail;
        }
        @Test
        public void testGet_1stCase(){
                System.out.println("\nTest case 1: get all user's information...");
                ArrayList<String> result;

	        try {
	              JDBMEnumeration jdbmEnumerator =  JDBMEnumeration.getEnumeration(
	                          orgName, 1);
	              Properties userProperties = jdbmEnumerator.getProperties();
	              JDBMHashtable jdbmHashtable = new JDBMHashtable(userProperties);
	              HashSet<String> set = new HashSet<>();
	              result = new ArrayList<String>(jdbmHashtable.getNames());
	              Properties properties_ = new Properties();
	              properties_.setProperty("password1", userEmail_);
	              properties_.setProperty("user1", userEmail_);
	              jdbmEnumerator =  JDBMEnumeration.getEnumeration(orgName, 1);
	              assertNotNull(jdbmEnumerator.getUserName());
	              assertNotNull(jdbmEnumerator.getUserId());
	              assertNotNull(jdbmEnumerator.getUserId());
	              systemOut = new StringBuilder();
	              jdbmHashtable.getUserProperties();
	              systemOut.append("OK!");
	              ArrayList<String> emailList = new ArrayList<>();
	              jdbmHashtable.getEmails();
	              jdbmHashtable.getEmails();
	              if(! jdbmHashtable.getEmails().isEmpty()){
	                 emailList.addAll(jdbmHashtable.getEmails());
	              }
	      //          jdbmHashtable.getEmails();
	//              if(! set.isEmpty()){
	     //                 emailList.addAll(set);
	//              }
	      //          set.addAll(emailList);
	      //          System.out.println(System.getProperty("os.name"));
	      //          System.out.println(System.getProperty("os.version"));
	          
	      //          System.out.println(jdbmHashtable.getUserName());
	      //          System.out.println(jdbmHashtable.getUserId());
	              System.out.println("\nSystem Out");
	              System.out.printf("%s\n",System.getProperty("os.name"));
	      //          System.out.println(System.getProperty("os.version"));
	              systemOut.append(userProperties.toString());
	              systemOut.append("\n");
	      //      	  systemOut.append(jdbmHashtable.toStringAllUsers());
	      //      	  System.out.print(systemOut.toString());
	              System.out.printf("\n");
	      //      	  System.out.println(properties_.toString());
	      //          set = userProperties.stringPropertyNames();
	      //          for (String propName : set) {
	              System.out.printf("%s\n",userProperties.getProperty(propName));
	              System.out.printf("%s\n\n",properties_.getProperty(propName));
          //        	  
	          
	  //	      	  System.out.println("\n\n");
	              assertTrue(set.contains( "user1" ));
	              assertTrue(set.contains( "password1" ));
	              
	              //System.out.println(systemOut.toStringEscape());
	              //System.out.println(set);
	      //          }
	  //          assertEquals("OK!", systemOut.toString());
	      //          System.out.printf("%s\n\n",userProperties);
	      //          System.out.printf("%s\n\n",properties);
        }
        public void testGet_2ndCase() {
                System.out.println("\nTest case 2: get all user's information...");
                ArrayList<String> result;

        //	  	System.out.println(userName);
	        //	  	System.out.println(userId);
	  //	        
	  //        HashSet<String> set = new HashSet<>();
	  //        if(! (JDBMHashtable.GetUserNames2(userProperties).isEmpty())) set.addAll(JDBMHashtable
	  //               .GetUserNames2(userProperties));
	  //        if(! (JDBMHashtable.GetIdNames2(userProperties).isEmpty())) set.addAll(JDBMHashtable
	  //               .GetIdNames2(userProperties));
	//	        assertTrue(set.size()>0);
	//	        for (String user : set) {
	  //        System.out.println(user);
	  //       	  System.out.println(JDBMHashtable
	  //		     .GetProperties(user, 1));
	//	  	 
	  //	   	String userName = JDBMHashtable.GetUserName(user);
	  //	   	String userId = JDBMHashtable.GetUserId(user);
	//	   	
	//	  	   	if(userName.indexOf("#") <=0) set.remove(user);
	//	   	     
	//	   		systemOut = new StringBuilder();
	//	   		ArrayList<String> emailList = new ArrayList<>();
	//	   	  	  if(! (JDBMHashtable.GetEmailsAllUsers(userProperties).isEmpty())) set.addAll(JDBMHashtable
	//	   	         .GetEmailsAllUsers(userProperties));
	//	   	    assertTrue(set.isEmpty());
	//	   	    for (String email : set) {
	//	   	    	if("#".equals(email)) continue;
	//	   	        emailList.add(email);
	//	   	    	System.out.println("User: "+