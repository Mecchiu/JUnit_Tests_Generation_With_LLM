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
		
    private UserMgr userMgr=new SimpleUserMgr();
    
    @Test
    public void  Jdbm_export() throws IOException {
        System.out.println("@Test");
				
        // create the property file
        Properties config=new Properties();
        config.put("user","aacs");

        // create a new record manager...
        JDBMRecordManager jdm=new JDBMRecordManager();
        jdm.loadFromConfig(config,"recordmanagers/");
        JDBMHashtable h=new Hashtable(8);
        h.insertRecord(userMgr,"name","");
        System.out.println("Created User mgr's hash table.");
        
        // write a record:
        Vector<Object> v=new Vector<Object>();
        v.add(userMgr);
        h.insertVector(userMgr,v);
        Vector<Object> v2=v.clone();
        System.out.println("Record: "+v2);    
        // check if something has been inserted
        System.out.println("Checking if something has been inserted.");
        String s=""+v2.size();
}
}