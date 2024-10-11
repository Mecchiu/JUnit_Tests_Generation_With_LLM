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
		
    /**
     * Test of getMailbyOrg method, of class SimpleUserMgr.
     * @throws Exception
     */
	@Test
    public void testGetMailbyOrg() throws Exception {
        this.testGetMailbyOrgByURL("test/users/simple/", "*");
    }
    /* 
     * test getMailbyOrg by URL using a special string for org and testcase
     * @param testdir the testdir
     * @param name the name of the domain
     * @throws Exception
     */
    private void testGetMailbyOrgByURL(String testdir, String name) throws Exception {
    	URL url = getClass().getClassLoader().getResource(name);
        Properties userDefaults = new Properties();
        jdbm.init(url,userDefaults);

        System.out.println("Test for the simple users.");
        String data = "";
        System.out.println("Testing jdbm.getUser(\"" + name + "\")");
        String user = jdbm.getUser(testdir + name + "/", false, true);
        JDBMHashtable jh0, jh1;
        
        // the empty string will be the "simple_domain" column for the test table
 		
        boolean found = false;
 		
        System.out.println("Getting empty jdbm record for \"" + name + "\". Using default values.");
        Vector users0 = new Vector();
        
        probes.reinit(jdbm,user, false);
        
        InputStream jdbstrm = new JDBMInputStream("test/users/" + name + "/", 0);
        
        bufferedReader reader = new BufferedReader(new InputStreamReader(jdbstrm));
        try
        {
        	String line = reader.readLine();
        	while (line!= null) {
                 if (line.length() > 0) {
                	 users0.add(line);
                 }
                 line = reader.readLine();
 		}
        }
        catch (IOException ioe) {
        	
        }
        finally {
        	reader.close();
        }
        
        while(users0.hasNext()) {//while there are users in there
        	String userName = users0.nextElement();
        	
 		
        	
        	System.out.println("Checking \"" + userName + "\" in the table.");
	        
    		
    		Vector users_jdb = jdbm.getUsersByName(userName, false);
    		jh0 = (JDBMHashtable)users_jdb.getAt(0);

    		if (!found && users_jdb.size() > 0 ) {
    			found = (jh0 == jh1);
    		}
    		
    		if (found)
    		{
    			if(org > 0 && org!= name){
    				System.out.println("Organization was not added correctly.");
    				continue;
    			}
    			
    			if(email && email.length() > 0){
    				System.out.println("Email was not added correctly.");
    				continue;
    			}
    			/*
    			String mailStr = jh0.getString("mail","","");
    			if (mailStr.length() > 0){
    				
    				int l = (((int) mailStr.charAt(4))))+7;
    				if (l < mailStr.length()-1){
    					mailStr = mailStr.substring(0,l)+mailStr.substring(l,mailStr.length());
    				}
    				StringTokenizer st = new StringTokenizer(mailStr, "!#$%&'());/?:@[]",false);
    				System.out.println(email+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement()+" \n"+st.nextElement());
    				
    			}else{
    				System.out.println("Mail empty string.");
    			}
    			*/
    			if(name=="LDAP")
    			{
    				System.out.println("LDAP test set");
    			}else if(name.startsWith("LDAP.ATTRS") || name.startsWith("LDAP.SYNTAX"))
    			{
    				if(org > 0 && org!= name){
    					System.out.print("Org does not add attribute values properly in table. \n");
    					continue;    		
    				}
    				Vector attrValues = jh0.get("attributes","");
    				//System.out.println("Number of attributes in the table " + attrValues.size() + "\n");
    				
    				System.out.println(jh0.getString("name_attr_value","","")  + "\n");
    				
    				Boolean flag =  jh0.getBoolean("flag_active","",false);
    				if((flag == true)&&(name.startsWith("LDAP.ATTRS.") && org == "LDAP.ATTRS.") && false){
    					System.out.print("Checking additional attribute values in LDAP.ATTRS table. \n");
					}
    			}
    		
    		}
        }
    	

    }

}