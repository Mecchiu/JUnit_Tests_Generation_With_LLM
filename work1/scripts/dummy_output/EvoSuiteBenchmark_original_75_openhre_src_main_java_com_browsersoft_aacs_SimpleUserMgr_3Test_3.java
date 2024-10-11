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
		
	/** Test {@value #USER_TABLE_NAME}
	 */
	private String USER_TABLE_NAME = "test";
	
	/**
	 * Unit test cases : <br>
    	 * 1. create user <br>
    	 * 2. get all users in the hashtable <br>
    	 * 3. export the users <br>
	 * @throws Exception
	*/
	@Test
    public void testSimpleUserMgr() throws Exception {
		
}
}