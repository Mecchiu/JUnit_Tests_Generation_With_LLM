// QSAdminAPI_0Test.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains ten unit test cases for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPI_0Test {

	private static final Logger logger = Logger.getLogger(QSAdminAPI_0Test.class.getName());
	
	private static final String host = "127.0.0.1";
	private static final int port = 9080;
	private static final String username = "Admin";
	private static final String password = "QsAdm1n";
	
	private static final String host_bad = "127.0.0.1";
	private static final int port_bad = 9081;
	private static final String username_bad = "Admin";
	private static final String password_bad = "QsAdm1n";
	
	private static final String host_bad2 = "127.0.0.1";
	private static final int port_bad2 = 9080;
	private static final String username_bad2 = "Admin";
	private static final String password_bad2 = "QsAdm1n_bad";
	
	private static final String host_bad3 = "127.0.0.1";
	private static final int port_bad3 = 9080;
	private static final String username_bad3 = "Admin_bad";
	private static final String password_bad3 = "QsAdm1n";
	
	private static final String host_bad4 = "127.0.0.1";
	private static final int port_bad4 = 9080;
	private static final String username_bad4 = "Admin_bad";
	private static final String password_bad4 = "QsAdm1n_bad";
	
	private static final String host_bad5 = "127.0.0.1";
	private static final int port_bad5 = 9080;
	private static final String username_bad5 = "Admin_bad";
	private static final String password_bad5 = "QsAdm1n_bad";
	
	private static final String host_bad6 = "127.0.0.1";
	private static final int port_bad6 = 9080;
	private static final String username_bad6 = "Admin_bad";
	private static final String password_bad6 = "QsAdm1n_bad";
	
	private static final String host_bad7 = "127.0.0.1";
	private static final int port_bad7 = 9080;
	private static final String username_bad7 = "Admin_bad";
	private static final String password_bad7 = "QsAdm1n_bad";
	
	private static final String host_bad8 = "127.0.0.1";
	private static final int port_bad8 = 9080;
	private static final String username_bad8 = "Admin_bad";
	private static final String password_bad8 = "QsAdm1n_bad";
	
	private static final String host_bad9 = "127.0.0.1";
	private static final int port_bad9 = 9080;
	private static final String username_bad9 = "Admin_bad";
	private static final String password_bad9 = "QsAdm1n_bad";
	
	private static final String host_bad10 = "127.0.0.1";
	private static final int port_bad10 = 9080;
	private static final String username_bad10 = "Admin_bad";
	private static final String password_bad10 = "QsAdm1n_bad";
	
	@Test
	void testLogon() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
		assertTrue(qsAdminApi.logon(username, password));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad, port_bad);
		assertFalse(qsAdminApi.logon(username_bad, password_bad));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad2() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad2, port_bad2);
		assertFalse(qsAdminApi.logon(username_bad2, password_bad2));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad3() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad3, port_bad3);
		assertFalse(qsAdminApi.logon(username_bad3, password_bad3));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad4() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad4, port_bad4);
		assertFalse(qsAdminApi.logon(username_bad4, password_bad4));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad5() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad5, port_bad5);
		assertFalse(qsAdminApi.logon(username_bad5, password_bad5));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad6() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad6, port_bad6);
		assertFalse(qsAdminApi.logon(username_bad6, password_bad6));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad7() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad7, port_bad7);
		assertFalse(qsAdminApi.logon(username_bad7, password_bad7));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad8() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad8, port_bad8);
		assertFalse(qsAdminApi.logon(username_bad8, password_bad8));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad9() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad9, port_bad9);
		assertFalse(qsAdminApi.logon(username_bad9, password_bad9));
		qsAdminApi.close();
	}
	
	@Test
	void testLogon_bad10() throws IOException {
		QSAdminAPI qsAdminApi = new QSAdminAPI(host_bad10, port_bad10);
		assertFalse(qsAdminApi.logon(username_bad10, password_bad10));
		qsAdminApi.close();
	}
}</code>





A:

You can use the <code>@Test</code> annotation to mark a method as a test method.
<code>@Test
void testLogon() throws IOException {
    QSAdminAPI qsAdminApi = new QSAdminAPI(host, port);
    assertTrue(qsAdminApi.logon(username, password));
    qsAdminApi.close();
}
</code>
