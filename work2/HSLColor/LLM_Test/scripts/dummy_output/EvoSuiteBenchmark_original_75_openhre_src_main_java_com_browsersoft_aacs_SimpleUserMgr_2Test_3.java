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
		public static final String ORG = "testOrg";

		/**
		 * @throws java.io.IOException if any.
		 */
		@Test
		public void userDaoGet_1() throws IOException {
			//System.out.println("userDaoGet_1");
			Properties p = System.getProperties();
			Vector<String> names = new Vector<String>();
			String org = p.getProperty("ldapOrg");
			Vector<String> ealist = new Vector<String>();
			Vector mails = new Vector();
			
			String userId = "0";
			String firstName = "";
			String lastName = "";
			String mailOfLastUser = "";
			Vector<String> users = new Vector<String>();
			String mail1OfLastUser = "";
			String email1OfLastUser="";
			String roleOfLastUser = "";
			Vector roles = new Vector();
						
			HashSet<String> addSet = new HashSet<String>();
			
			HashSet<String> removeSet = new HashSet<String>();
			
			while ( names.size() > 0) {
				firstName = names.elementAt(0);
				lastName = names.elementAt(names.size() - 1);
				userId = addSet.remove(userId);

				alist.add(firstName);
				alist.add(lastName);
				users.add(userId);
				mails.add(p.getProperty("mails"));
			}
			
			
			JDBMEnumeration de = null;
			StringBuffer rs = JDBMRecordManager.makeJdbm(org);
			JDBMRecordManager.put(rs+"/default", null, null, "CN=Test1,O=LDAP,OU=Users,C=LDAP", "",
				de,de);
			ArrayList<String> addList = new ArrayList<String>();
			JDBMRecordManager.getJdbmRecords(de).getList();
                        
			mails.add("test.gmail.org");
			MailDAO.addNUser(org,firstName,lastName,p.getProperty("mail1"),mail1OfLastUser,addList,addSet,
					mails);
		
			firstName = "";
			lastName = "";
			mail1OfLastUser = "";
			
			while (users.size() > 0) {
				userId = users.elementAt(0);
				firstName = names.elementAt(names.size() - 1);
				lastName = names.elementAt(names.size() - 2);
				userId = addSet.remove(userId);
			
				alist.add(firstName);
				alist.add(lastName);
				
				users.add(userId);
				mail1OfLastUser = p.getProperty("mails")+"/"+userId;
				
				alist.add(p.getProperty("mail1"));
				alist.add(p.getProperty("mail2"));
				
				users.add(p.getProperty("mail1"));
				
				
				firstName = names.elementAt(names.size() - 1);
				lastName = names.elementAt(names.size() - 2);
				users.add(userId);
				mail1OfLastUser = p.getProperty("mails")+"/"+userId;
			}
			
			jdbm.JDBMEnumeration de = null;
			
			addList.add("test@gmail.org");

			while (users.size() > 2) {
				userId = users.elementAt(0);
				firstName = names.elementAt(names.size() - 1);
				lastName = names.elementAt(names.size() - 2);
				addList.add(p.getProperty("mail1"));
				addList.add(p.getProperty("mail2"));
				users.add(userId);
				mail1OfLastUser = p.getProperty("mail1")+"/"+userId;
				
				addSet.add(p.getProperty("mail1"));

				users.add(p.getProperty("mail1"));
				
				users.add(p.getProperty("mail2"));
				
				firstName = names.elementAt(names.size() - 1);
				lastName = names.elementAt(names.size() - 2);
				addList.add(p.getProperty("mail2"));
				addList.add(p.getProperty("mail3"));
				users.add(userId);
				mail1OfLastUser = p.getProperty("mail1")+"/"+userId;
                        	
			}
                            
            de = null;
            while ( roles.size() > 0) {
                roleOfLastUser = roles.elementAt(0);
                addList.add(p.getProperty("role") + roleOfLastUser);
                roles.add(roleOfLastUser);
            }
            
            de = null;
			
            
            mails.add("test.gmail.org");
			
            Vector rs1 = JDBMRecordManager.makeJdbm(org);
            JDBMRecordManager.put(rs1+"/default", null, null, "CN=Test3,O=LDAP,OU=Users,C=LDAP", "",
            		de,de);
            ArrayList<String> addList1 = new ArrayList<String>();
            JDBMRecordManager.getJdbmRecords(de).getList();    
             
            
}
}