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
* It contains ten unit test cases for the {@link SimpleUserMgr#getNamesbyOrg(String)} method.
*/
class SimpleUserMgr_1Test {

	/**
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUserMgr#getNamesbyOrg(String)}.
	* Test case 1 for method {@link SimpleUser