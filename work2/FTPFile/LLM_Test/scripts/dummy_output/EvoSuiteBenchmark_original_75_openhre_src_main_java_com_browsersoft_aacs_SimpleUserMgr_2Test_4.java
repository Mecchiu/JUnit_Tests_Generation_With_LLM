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
		
    private final int maxsize = 15;
    private UserMgr _userMgr;
    private String _testMail = "test@localhost";
    private String _userMail = "user@localhost";
    private String _password = "password";

    /**
     * Constructor for SimpleUserMgr_2Test
     */
    public SimpleUserMgr_2Test() {
    }
	
    /**
     * Gets the {@link UserMgr}
     *
     * @return UserMgr
     */
    public UserMgr get_userMgr() {
        return _userMgr;
    }

    /**
     * get Test case for SimpleUserMgr_2Test
     * @throws IOException 
     */
    @Test
    public void testGetMailbyOrg() throws IOException {
        
        String userMgrName = "SimpleUserMgr";
        System.out.println("--- Running test case 1 for SimpleUserMgr_2Test---");
        
        String result = null;
        int i = 0;
        String[] orgs = null;
        
        try {
            JDBMEnumeration.getAll(JDBMEnumeration.TYPE_ROOT);
            orgs = JDBMEnumeration.getAll(JDBMEnumeration.TYPE_ROOT);
        } catch (IOException e) {
            e.printStackTrace();
        }
	
        ArrayList emails = new ArrayList();
        System.out.println("------ Executing UserManager test case 1 for GetMailbyOrg---");
        ArrayList ids = getMailbyOrg(userMgrName);
        System.out.println("Found "+ids.size()+ " records in: "+userMgrName);

        // we try to read some of the records and we set its data
        JDBMEnumeration.getAll (JDBMEnumeration.TYPE_ROOT);
        if (ids.size() > maxsize) {
            // check if records can fit into the arraylist of strings we want to read
            System.out.println("Records count:"+ids.size());
            if(ids.size() == maxsize)
            {
                System.out.println("Setting maxsize to "+maxsize);
                emails = setTestMaxsize(ids,maxsize);
                i = 0;
                System.out.println("Checking results for: "+userMgrName);
                result = _userMgr.getMailbyOrg(userMgrName);
                if(result == null) {
                    System.out.println("ERROR: No results");
                }
                // check if it was successful
                else {
                    for(i=0;i<emails.size();i++) {
                        if(emails.get(i).contains(_userMail)) {
                            System.out.println("EMAIL: "+emails.get(i));
                            emails.remove(i);
                            break;
                        }
                    }
                    System.out.println("Found "+i+ " records in: "+userMgrName);
                    assertEquals(emails.size(),i);
                    System.out.println("Checking results for:"+userMgrName);
                    result = _userMgr.getMailbyOrg(userMgrName);
                }
            }
            else {
                if(ids.size() < maxsize) {
                    System.out.println("Setting maxsize to "+maxsize);
                    emails = setTestMaxsize(ids,maxsize);
                    i = 0;
                    System.out.println("Checking results for: "+userMgrName);
                    result = _userMgr.getMailbyOrg(userMgrName);
                    if (result == null) {
                        System.out.println("ERROR");
                        i = 0;
                        return;
                    }
                    // check if it was successful
                    else {
                        for(i=0;i<emails.size();i++) {
                            if(emails.get(i).contains(_userMail)) {
                                System.out.println("EMAIL: "+emails.get(i));
                                emails.remove(i);
                                System.out.println("Found "+i+ " records in: "+userMgrName);
                                result = _userMgr.getMailbyOrg(userMgrName);
                                if(result == null) {
                                    System.out.println("ERROR: No results");
                                }
                                else {
                                    assertEquals(emails.size(),i);
                                    System.out.println("Checking results for:"+userMgrName);
                                    result = _userMgr.getMailbyOrg(userMgrName);
                                }
                            }
                        }
                        System.out.println("Found "+i+ " records in: "+userMgrName);
                        assertEquals(emails.size(),i);
                        System.out.println("Checking results for:"+userMgrName);
                        result = _userMgr.getMailbyOrg(userMgrName);
                    }
                }
                else {
                    result = _userMgr.getMailbyOrg(userMgrName);
                }
            }
        }
        else {
            if(_testMail.equals(emails.get(0))) {
                if(_userMgr.getMailbyOrg(userMgrName) == null) {
                    throw new AssertionError("Test testcase 1 for SimpleUserMgr_2Test failed");
                }
                else {
                    return _userMgr.getMailbyOrg(userMgrName);
                }
            }
            else {
                System.out.println("--- WARNING --- Not found for UserManager Testcase 2 : " + email);
            }
        }
    }

    public ArrayList setTestMaxsize(ArrayList ids,int limit) throws IOException {
        Vector  idsV = new Vector();
        String [] newids = new String[maxsize];
        JDBMEnumeration.getAll(JDBMEnumeration.TYPE_ROOT);

        // we try to read some of the records and we set its data
        int i = 0;
        JDBMHashtable emails = JDBMHashtable.create();

        while(ids.size() > i) {
            emails.set(""+ids.size()+i);
            ids.remove(ids.size() - i - 1);
        }

        // finally add the new records, we create a new hashtable because otherwise it would be garbage collected
}
}