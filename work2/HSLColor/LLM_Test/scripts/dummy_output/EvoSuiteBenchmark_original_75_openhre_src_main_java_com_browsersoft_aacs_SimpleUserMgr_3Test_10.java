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
		public final static String DURATION_NAME = SimpleUserMgr.class.getCanonicalName() 
				+ ":durea";
		
		@Test
		public void test_export(){
			UserMgr uMgr = new SimpleUserMgr();
			String res = uMgr.export();
			System.out.println("Exported " + res);
			
			String exp = SimpleUserMgr.DURATION_NAME + " " +
				Long.toString(30 * 60 * 1000L) + " " +
				"users" +
				".users";
			assertEquals("Wrong value of " + exp, res, exp);
			
		}
		
}