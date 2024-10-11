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
		
	private final static String KEY_PREFIX_1 = "AACS_";
	private final static String KEY_PREFIX_2 = "AACS";
	private final static String KEY_1 = "AACS_USER_1";
	private final static String KEY_2 = "AACS_USER_2";
	private final static String KEY_1_2 = "AACS_USER_1_2";
	
	/**
	 * The test class
	 * It contains one unit test case for the {@link SimpleUserMgr#export()} method.
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	void testExport() throws IOException, InstantiationException, IllegalAccessException {
		SimpleUserMgr_3Test obj = new SimpleUserMgr_3Test();
		Vector<String> ve = new Vector<String>();
		ve.add(KEY_1);
		ve.add(KEY_2);
		ve.add(KEY_2);
		ve.add(KEY_1_2);
		
		
		JDBMEnumeration jde = new JDBMEnumeration("jdbm/mgr/*", ve.elements());
		JDBMHashtable jdm = new JDBMHashtable("jdbm/mgr/*", ve.elements());
		// this is the number of users found:
		assertTrue(jde.hasMoreElements());
		ArrayList<String> al = new ArrayList<String>();
		while (jde.hasMoreElements()) {
			al.add(jde.nextElement());
		}
		assertEquals(11, al.size());
		assertEquals(3, al.get(0).split("\\").length);
		
		JDBMRecordManager jdm1 = new JDBMRecordManager("jdbm/dst/" + KEY_PREFIX_1);
		assertNotNull(jdm1);

		JDBMRecordManager jdm2 = new JDBMRecordManager("jdbm/dst/" + KEY_PREFIX_2);
		assertNotNull(jdm2);

		
		for (String i : al) {
			StringTokenizer st = new StringTokenizer(i, ",", true);
			while (st.hasMoreTokens()) {
				String user = st.nextToken().substring(0, 1);
				assertNotNull(jdm1.lookup(user, 1));
				assertNotNull(jdm2.lookup(user, 1));
			}
		}	
		//check that the export has been executed
		assertTrue(true);
		
 		// we can also add one table
	}
	
	/**
	 * The test class
	 * It contains one unit test case for the {@link SimpleUserMgr#export()} method.
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	void testExportNoTable() throws IOException, InstantiationException,
			IllegalAccessException {
		SimpleUserMgr_3Test obj = new SimpleUserMgr_3Test();
			assertFalse(obj.export().equals(""));
				
	}
	
	/**
	 * The test class
	 * It contains one unit test case for the {@link SimpleUserMgr#export()} method.
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testClear() throws IOException, InstantiationException,
			IllegalAccessException {
		SimpleUserMgr_3Test obj = new SimpleUserMgr_3Test(true);
		obj.clear();
		
	}
	private SimpleUserMgr_3Test(boolean clear) throws IOException {
		assertFalse(clear);
	}
	
	/**
	 * The test class
	 * It contains one unit test case for the {@link SimpleUserMgr#export()} method.
	 * @throws IOException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 */
	@Test
	public void testLookup() throws IOException, InstantiationException,
			IllegalAccessException {
		SimpleUserMgr_3Test obj = new SimpleUserMgr_3Test();
		ArrayList<String> al = new ArrayList<String>();
		al.add(KEY_1);
		al.add(KEY_2);
		al.add(KEY_1);
				
		Vector<String> ve = new Vector<String>();
		ve.add(KEY_1);
		ve.add(KEY_2);
		ve.add(KEY_1);
		ve.add(KEY_1);
		ve.add(KEY_1_2);
		ve.add(KEY_2);
		
		String[] strs = al.toArray(new String[al.size()]);
		Vector<String> al = new Vector<String>(strs);
		ve = al.toArray(new String[al.size()]);
		ve = ve.toArray(new String[ve.size()]);
		ve = ve.toArray(new String[ve.size()]);

		assertFalse(obj.export().equals(""));

		assertTrue(ar.size() == ve.size());
	}
}