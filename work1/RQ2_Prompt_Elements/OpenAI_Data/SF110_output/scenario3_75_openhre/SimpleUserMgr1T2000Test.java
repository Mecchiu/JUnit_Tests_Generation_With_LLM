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
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg1() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org1");
		assertEquals(names.length, 2);
		assertEquals(names[0], "user1");
		assertEquals(names[1], "user2");
	}
	
	/**
	* Test case 2 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg2() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org2");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user3");
	}
	
	/**
	* Test case 3 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg3() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org3");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user4");
	}
	
	/**
	* Test case 4 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg4() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org4");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user5");
	}
	
	/**
	* Test case 5 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg5() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org5");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user6");
	}
	
	/**
	* Test case 6 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg6() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org6");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user7");
	}
	
	/**
	* Test case 7 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg7() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org7");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user8");
	}
	
	/**
	* Test case 8 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg8() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org8");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user9");
	}
	
	/**
	* Test case 9 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg9() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org9");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user10");
	}
	
	/**
	* Test case 10 for {@link SimpleUserMgr#getNamesbyOrg(String)}
	*
	* @throws Exception
	*/
	@Test
	public void testGetNamesbyOrg10() throws Exception {
		SimpleUserMgr simpleUserMgr = new SimpleUserMgr();
		String[] names = simpleUserMgr.getNamesbyOrg("org10");
		assertEquals(names.length, 1);
		assertEquals(names[0], "user11");
	}
}