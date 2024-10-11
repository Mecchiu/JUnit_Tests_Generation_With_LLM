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
* It contains ten unit test cases for the {@link SimpleUserMgr#export()} method.
*/
class SimpleUserMgr_3Test {

	/**
	* Test case 1 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for a single user.
	*/
	@Test
	public void testExport_1() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft,c=US", "John Doe", "Doe", "jdoe@browsersoft.com", "user", "secret");
		String export = userMgr.export();
		assertEquals("cn=John Doe,o=Browsersoft,c=US\nJohn Doe\nDoe\njdoe@browsersoft.com\nuser\nsecret\n", export);
	}
	
	/**
	* Test case 2 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for two users.
	*/
	@Test
	public void testExport_2() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft,c=US", "John Doe", "Doe", "jdoe@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Doe,o=Browsersoft,c=US", "Jane Doe", "Doe", "jane@browsersoft.com", "user", "secret");
		String export = userMgr.export();
		assertEquals("cn=John Doe,o=Browsersoft,c=US\nJohn Doe\nDoe\njdoe@browsersoft.com\nuser\nsecret\ncn=Jane Doe,o=Browsersoft,c=US\nJane Doe\nDoe\njane@browsersoft.com\nuser\nsecret\n", export);
	}
	
	/**
	* Test case 3 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for three users.
	*/
	@Test
	public void testExport_3() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft,c=US", "John Doe", "Doe", "jdoe@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Doe,o=Browsersoft,c=US", "Jane Doe", "Doe", "jane@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=John Smith,o=Browsersoft,c=US", "John Smith", "Smith", "jsmith@browsersoft.com", "user", "secret");
		String export = userMgr.export();
		assertEquals("cn=John Doe,o=Browsersoft,c=US\nJohn Doe\nDoe\njdoe@browsersoft.com\nuser\nsecret\ncn=Jane Doe,o=Browsersoft,c=US\nJane Doe\nDoe\njane@browsersoft.com\nuser\nsecret\ncn=John Smith,o=Browsersoft,c=US\nJohn Smith\nSmith\njsmith@browsersoft.com\nuser\nsecret\n", export);
	}
	
	/**
	* Test case 4 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for four users.
	*/
	@Test
	public void testExport_4() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft,c=US", "John Doe", "Doe", "jdoe@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Doe,o=Browsersoft,c=US", "Jane Doe", "Doe", "jane@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=John Smith,o=Browsersoft,c=US", "John Smith", "Smith", "jsmith@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Smith,o=Browsersoft,c=US", "Jane Smith", "Smith", "jane@browsersoft.com", "user", "secret");
		String export = userMgr.export();
		assertEquals("cn=John Doe,o=Browsersoft,c=US\nJohn Doe\nDoe\njdoe@browsersoft.com\nuser\nsecret\ncn=Jane Doe,o=Browsersoft,c=US\nJane Doe\nDoe\njane@browsersoft.com\nuser\nsecret\ncn=John Smith,o=Browsersoft,c=US\nJohn Smith\nSmith\njsmith@browsersoft.com\nuser\nsecret\ncn=Jane Smith,o=Browsersoft,c=US\nJane Smith\nSmith\njane@browsersoft.com\nuser\nsecret\n", export);
	}
	
	/**
	* Test case 5 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for five users.
	*/
	@Test
	public void testExport_5() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft,c=US", "John Doe", "Doe", "jdoe@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Doe,o=Browsersoft,c=US", "Jane Doe", "Doe", "jane@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=John Smith,o=Browsersoft,c=US", "John Smith", "Smith", "jsmith@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=Jane Smith,o=Browsersoft,c=US", "Jane Smith", "Smith", "jane@browsersoft.com", "user", "secret");
		userMgr.addUser("cn=John Jones,o=Browsersoft,c=US", "John Jones", "Jones", "jjones@browsersoft.com", "user", "secret");
		String export = userMgr.export();
		assertEquals("cn=John Doe,o=Browsersoft,c=US\nJohn Doe\nDoe\njdoe@browsersoft.com\nuser\nsecret\ncn=Jane Doe,o=Browsersoft,c=US\nJane Doe\nDoe\njane@browsersoft.com\nuser\nsecret\ncn=John Smith,o=Browsersoft,c=US\nJohn Smith\nSmith\njsmith@browsersoft.com\nuser\nsecret\ncn=Jane Smith,o=Browsersoft,c=US\nJane Smith\nSmith\njane@browsersoft.com\nuser\nsecret\ncn=John Jones,o=Browsersoft,c=US\nJohn Jones\nJones\njjones@browsersoft.com\nuser\nsecret\n", export);
	}
	
	/**
	* Test case 6 for {@link SimpleUserMgr#export()}
	* <p>
	* This test case checks the export method for six users.
	*/
	@Test
	public void testExport_6() {
		SimpleUserMgr userMgr = new SimpleUserMgr();
		userMgr.addUser("cn=John Doe,o=Browsersoft