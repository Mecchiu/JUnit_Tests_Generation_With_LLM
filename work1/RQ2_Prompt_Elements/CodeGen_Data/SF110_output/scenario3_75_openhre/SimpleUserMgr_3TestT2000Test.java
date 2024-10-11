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
     * simple_user_manager_2_1 Test
     */
    @Test
    public void simple_user_manager_2_1() {
        final String TEST_USER = "root";
        final String TEST_PASS = "user";

        final String TEST_USER2 = "new_root";

        final SimpleUserMgr simpleUserMgr;

        // 1, init
        SimpleUserManager.initInstance();
        // 2 - check the properties
        try {
            Properties prop = new Properties();
            prop.put("defaultUser", TEST_USER);
            prop.put("defaultPassword", TEST_PASS);
            prop.put("maxNbUsers", 5L);
            prop.put("numRetries", 1L);
            prop.put("autoLogin", "true");
            prop.put("maxTime", "500");

            simpleUserMgr = new SimpleUserMgr(); 
            assertEquals(TEST_USER, simpleUserMgr.getCurrentUser().getUsername());
            assertEquals(TEST_PASS, simpleUserMgr.getCurrentUser().getPassword());
        
            // 3. init the properties in the persistent HashTable
            SimpleUserManager.initInstance(prop);
        	
            // 3.2 - delete the Properties file in the local disk
           new HashSet<>();
        }
        catch(Exception e) {
        System.err.println(e.getMessage());
        }
        // 3.3 - end of test case 6
    }
    
        private JDBMEnumeration getDBMEnum(String name) throws Exception {
		JDBMHashtable data = new JDBMHashtable();
                InputStream is = SimpleUserMgr.class.getClassLoader().getResourceAsStream(name);
                InputStreamReader isr = new InputStreamReader(is);
                BufferedReader brd = new BufferedReader(isr);
		String s;  
                int i;  
		while((s=brd.readLine())!=null){    // read till the end
                        i = s.indexOf("\n");
			String key = s.substring(0,i);
			String value = s.substring(i+1); 
			data.put(key,value);
		
		}
                isr.close();
		brd.close();
                return JDBMEnumeration.getInstance(data);
            
  } 
         public static void main(String args[]) throws Exception {
	String name = "";
        String root = "";
        try {
            BufferedReader br_1 = new BufferedReader(new InputStreamReader(System.in)); 
            BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in)); 

            while ((br_1.readLine())!= null) { //read until the end
                name = br_1.readLine();
                //br_1.readLine();
            }
            br2.readLine();
            br2.readLine();
            while ((br_1.readLine())!= null) { //read until the end
                root = br_1.readLine();
                //br_1.readLine();
            }  System.out.println("Welcome: " + name + " " + root+"\n");
            br_1.close();
            br2.close();
            Runtime.getRuntime().exit(0);
        } catch (IOException ioe) {
        System.err.println(ioe.getMessage());
        }
   }      
    
    private void doImport() throws Exception {
        JDBMRecordManager rm=new JDBMRecordManager();
        ArrayList<String> userList=new ArrayList<String>();
	Vector userVec = new Vector();
	try {
	Vector<String> v = new Vector<>();
	userVec=rm.getJdbmVec(userList);
	assertEquals(1,userVec.size());
	assertEquals(TEST_USER,userVec.elementAt(0));

	rm.initialize();

	userList.clear();
              v.clear();
	userVec=rm.getJdbmVec(userList);
        assertEquals(1,userVec.size());
	ArrayList<String> newUserList = new ArrayList<String>();
	userList.remove(0);
	String s;
	while ((s=userVec.elementAt(0))!= null) {
		newUserList.add(s);
	}

	userVec=new JDBMHashtable(userVec.size());
	for (Enumeration<String> it =userList.elements(); it.hasMoreElements();) {
	  String u= it.nextElement();
	  userVec.setElementAt(u,0);
         }

	//userVec=new JDBMHashtable();
	 
	//assertTrue("Test file : "+userVec, userVec.size() > 0);
	 

	rm.addRecord(new JDBMRecord(newUserList));
	rm.addRecord(new JDBMRecord(userVec));
	rm.close();
} 
    
    public void TestUserHashList() throws Exception  {
	
        ArrayList<String> usrList = new ArrayList<String>();
	Vector usrVec = new Vector<String>();
        JDBMRecordManager rm = new JDBMRecordManager();
        rm.initialize();
        usrList=rm.getJdbmVec(usrList);
	usrVec.clear();
	for (Enumeration<String> it = usrList.elements(); it.hasMoreElements();) {
	  String u = it.nextElement();
	 userVec.addElement(u);
	}} 
    public void TestUserHashTable() throws Exception {
 
        ArrayList<String> usrList = new ArrayList<String>();
        ArrayList<JDBMRecord.Record> usrRecords = new ArrayList<>();
        Vector usrVec = new Vector<>();
        JDBMHashtable newHash = new JDBMHashtable(usrVec);
        newHash.setElementAt("userlist",0);
        while ((usrList.size()!= 0) & (usrVec.size()!= 0)){
            for (Enumeration<JDBMHashtable.Record> it = usrVec.elements(); it.hasMoreElements();) {
		  if (it.nextElement().getName().equals("userlist")){   //if it found the userlist it means we have no more of this record
		  usrRecords.add