// SimpleUserMgr_1Test.java
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
* It contains one unit test case for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {
		@Test
		public void test_getNamesbyOrg() throws Exception {
			SimpleUserMgr sm = new SimpleUserMgr();
			String name = sm.getNamesbyOrg("o1", "o2", "o3", "o4");
			assertEquals("o1_o2_o3", name);
		}
}