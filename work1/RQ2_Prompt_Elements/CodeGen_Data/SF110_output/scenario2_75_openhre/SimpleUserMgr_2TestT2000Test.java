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

    /**
     * Test cases - tests UserMgr.getMailbyOrg method
     * @throws IOException
     * @throws Exception
     * @see SimpleUserMgr.SimpleUserMgr_Test
     * @see java.io.File
     * @see java.io.InputStream
     */

    @Test
    public void testGetMailbyOrg_String() throws Exception {


		URL url;
		String urlString;
		try {
			url = new URL("file://"+Utility.getUserDataFile().getCanonicalPath());
		}
		catch (Exception e) {
			url = null;
		}
//		url = urlString = url.toURI().toURL();

		if ( url!= null ) {
			Vector v = new Vector();
			try {
				urlString = urlString.substring(1);
			}
			catch (Exception e) {
				urlString = null;
			}
			try {
				JDBMRecordManager dbm = null;
				try {
					dbm = JDBMRecordManager.getInstance(url);
				}
				catch (Exception e) {
					Utility.fail("getMailbyOrg: " + e);
				}
				JDBMEnumeration e = dbm.getEnumeration();
				while (e.hasMoreElements()) {
					JDBMHashtable table = (JDBMHashtable) e.nextElement();
					Vector v2 = table.getVector();
					for (int i = 0; i < v2.size(); ++i) {
						Vector v = (Vector) v2.get(i);
						if ( ( (String) v.elementAt(0).toString()).contains(urlString) ||
								 ( v.size() == 1 && (String) v.set(0).toString().equalsIgnoreCase(urlString))) {
//							Vector v3 = ArrayList.class.cast(v.elementAt(0)).toArray();
							System.out.println("User found in " + urlString);
							
						}
					}
				}
			}
			catch (Exception e1) {
				cat.error("getMailbyOrg: " + e1);
			}
		}
		Utility.getFile("users.properties", Utility.getUserDataFile());
    }

    /**
     * Test cases - tests UserMgr.getMailbyOrg method
     * @throws Exception
     * @see SimpleUserMgr.SimpleUserMgr_Test
     * @see java.io.File
     * @see java.io.InputStream
     */

  
    @Test
    public void testGetMailbyOrg_InputStream() throws Exception {


		Vector v = new Vector();
		BufferedReader br = new BufferedReader(new StringReader(Utility.getFile("users.properties")));
		String input;
		String key;
		while ((key = br.readLine())!= null) {
			if ( (this.getClass()).getName().equals("SimpleUserMgr_2Test") && 
					key.startsWith("#")) {
				continue;
			}
			StringTokenizer tokenizer = new StringTokenizer(key.trim(),Utility.","");
			while (tokenizer.hasMoreTokens()) {
				String token = tokenizer.nextToken(); // token without '#'
				int index = token.indexOf("="); // get index of key
				if (index == -1 && token.indexOf(".") == -1) {
					continue;
				}
				String key1 = token.substring(0,index).trim();
				String value = token.substring(index+1); //value after key
				
				if ("key".equals(key1)) {
					System.out.println("KEY: " + key + " " + value + " " + value);
				}
				else {
					Vector v2 = new Vector();
					JDBMEnumeration e = null;
					try {
						e = JDBMEnumeration.getEnumerator(key.toCharArray(), value.toCharArray());
					}
					catch (Exception e2) {
						cat.error("getMailbyOrg: " + e2);
					}
//					JDBMRecordManager dbm = null;
//					try {
//						dbm = JDBMRecordManager.getInstance(url);
//					}
//					catch (Exception e3) {
//						Utility.fail("getMailbyOrg: " + e3);
//					}
					
					Vector v3 = new Vector();
					while (e.hasMoreElements()) {
						JDBMRecordManager table = (JDBMRecordManager) e.nextElement();
						v3.add(table.getRecord(null, key.toCharArray(), value.toCharArray()));
					}
					JDBMHashtable table = new JDBMHashtable(v3);
					v3.clear();
					
					JDBMHashtable[] array = {table};
					v.addElement(array);
				}
			}
		}

		try {
			while ((input = br.readLine())!= null) {
				StringTokenizer tokenizer = new StringTokenizer(input, Utility.getLineBreak());
				while (tokenizer.hasMoreTokens()) {
					String token = tokenizer.nextToken().trim();
					Vector v2 = new Vector();
					JDBMEnumeration e = null;
//					e = JDBMEnumeration.getEnumerator(token, "\n");
					try {
						e = JDBMEnumeration.getEnumerator(token.toCharArray());
					}
					catch (Exception e2) {
						cat.error("getMailbyOrg: " + e2);
					}
//					JDBMRecordManager dbm = null;
//					try {
//						dbm = JDBMRecordManager.getInstance(url);
//					}
//					catch (Exception e3) {
