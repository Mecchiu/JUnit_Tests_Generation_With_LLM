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
		* run test case.
		*/
        @Test
        public void createUser() {
             // create a user to test
                String cn="com.browsersoft";
                String org=cn + "\\";
                String email=cn + ".bbsons@gmail.com";
                Vector orgs = new Vector();
                orgs.add(org);
                Properties p;
                JDBMRecordManager mgr=new JDBMRecordManager("db1");
                mgr.createTable("users");
                ArrayList list=null;
                Vector users = new ArrayList(10);
}
}