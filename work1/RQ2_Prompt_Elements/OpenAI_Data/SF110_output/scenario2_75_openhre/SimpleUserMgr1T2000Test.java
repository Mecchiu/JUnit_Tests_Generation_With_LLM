// SimpleUserMgrTest.java
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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgrTest {

	/**
	* Test case 1 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg1() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 2 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg2() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 3 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg3() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 4 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg4() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 5 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg5() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 6 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg6() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 7 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg7() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 8 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg8() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 9 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg9() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
	
	/**
	* Test case 10 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws IOException
	*/
	@Test
	void testGetNamesbyOrg10() throws IOException {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org");
		assertEquals(0, names.length);
	}
}