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
public String[] namesbyOrg(String org) {
			ArrayList nameList = new ArrayList();
			try {
				JDBMRecordManager rm = JDBMRecordManager.getManager("SimpleUserMgr_1Test");
				JDBMEnumeration oj = rm.keys();
				while (oj.hasMoreElements()) {
					String e = oj.nextElement();

					// Check if organization exists.
					JDBMHashtable users = rm.getHashtable(e);
					if (users.contains(org)){
						JDBMEnumeration e1 = users.keys();
						while (e1.hasMoreElements()) {
							String u=e1.nextElement();
							nameList.add(u);
						}
					}
				}
			} catch (IOException e) {
				cat.error("getNamesbyOrg: " + e);
			} catch (jdbm.DBError e) {
				cat.error("getNamesbyOrg: " + e);
			} catch (jdbm.DBNotFound e2) {
				cat.error("getNamesbyOrg: " +
				this.getClass().getName() + " doesn't seem to exist!");
			}

			Vector v = new Vector();
			v.addElement("Fred");
			v.addElement("Harry");
			v.addElement("Mike");
			nameList.addAll(v);
			v.removeAllElements();
			return v.toArray(new String[v.size()]);
		}
}
