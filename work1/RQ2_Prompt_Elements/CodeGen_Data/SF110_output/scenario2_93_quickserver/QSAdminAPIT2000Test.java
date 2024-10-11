// QSAdminAPITest.java
package org.quickserver.net.qsadmin;

import java.io.*;
import java.net.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link QSAdminAPI}.
* It contains one unit test case for the {@link QSAdminAPI#logon()} method.
*/
class QSAdminAPITest {
private String username = "testusername";
		private String password = "testpassword";
		private static Socket s = null;
        private static PrintStream os = null;
        private static Connection conn;
		private TestBase tester;
		public QSAdminAPITest() throws IOException {
			if( s==null ) {
				s = ServerSocketFactory.getDefault().createServerSocket(9080);
				os= s.getOutputStream();
			}

			if( conn==null ) {
				conn = s.accept();
				os.print("Server connected\r\n");
			}

			tester = new TestBase();
		}

	/**
	* Tests the Logon method, that will authenticate the user to the remote QsAdmin server with their password.
	*/
	@Test
	public void test() throws IOException, InterruptedException, ConnectException {
		new QSAdminAPITest().onConnect();
	}

	/**
	* Tests the SendCommand method, that will send a command to the remote QsAdminServer.
	*/
	@Test
	public void testSend() throws Exception {
		new QSAdminAPITest().sendCommand("info server");
	}

	/**
	* Tests logging in to the remote QsAdminServer.
	*/
	@Test
	public void testLogon() throws ConnectException, IOException, LoginException, InterruptedException {
		new QSAdminAPITest().logon();
	}

	/**
	* Tests closing the connection to QsAdminServer.
	*/
	@Test
	public void testCloseConnection() throws InterruptedException, LoginException {
		new QSAdminAPITest().closeConnection();
	}

	private void onConnect() {
		tester.onOpen();
		tester.onConnect();
	}

	private void onConnected() {
		assertNotNull(tester.outputStream);
		tester.onClose();
	}


	private String sendCommand(String command) {
		String res = tester.outputStream.toString();
		tester.outputStream.close();
		return res;
	}
}
