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
		// This value will be used to set the port
// This value is required with any QSServerSocket created from
	// or with this QSAdminAPI class for the TCP protocol
	private static final int PORT = 50000;
	// This value will be used to verify the status of logon server
// This value is required with any QSServerSocket created from
	// or with this QSAdminAPI class for the TCP protocol
	private static final int STATUS_PORT = PORT + 1;
    QSAdminAPI qsAdminApi;

	/**
	 * Constructs a QSAdminAPI.
	 * @param hostName: remote hostname
	 * @param statusPort: remote TCP port
	 * @throws IllegalArgumentException: if hostname is null
	 * @throws UnknownHostException: if hostname is not found in the system
	 */
	public QSAdminAPITest(String hostName, int statusPort)
		throws IllegalArgumentException, UnknownHostException,
			ConnectException, IOException {
		if(hostName == null) {
			throw new IllegalArgumentException(
				"hostname can not be null");
		}
		qsAdminApi = new QSAdminAPI(hostName, STATUS_PORT);
	}

	/**
	 * Logs on QsAdmin server on <b><i>i</i></b> port.
	 */
	@Test
	public void testLogon()
		throws InterruptedException, IOException {
			checkStatus(qsAdminApi, 200, statusPort);
	}

	/**
	 * Re-opens an existing {@link QSAdminSocket} for TCP communication and
	 * returns the status that was received.
	 * @param qsAdminApi: {@link QSAdminAPI} instance to which the server was
	 * connected
	 * @return the status of the QSAdmin socket. Status 200 (OK) means
	 * successful operation. (A successful operation means successful sending
	 * of a command that succeeded or failed. The return value for 100 (Bad
	 * login) is also handled.)
	 * @throws InterruptedException
	 */
	private boolean checkStatus(QSAdminAPI qsAdminApi, int expectedStatus,
		int statusPort)
	throws InterruptedException
	{

		QSServiceInfo qsServiceInfo = new QSServiceInfo(
			QSService.S_SERVER, QSService.S_OPERATIONAL, 0);
		QSServerSocketImpl qsServerSock
			= new QSServerSocketImpl(statusPort, qsServerSock,
			new QSServerSocketListener() {
				public void onClientConnectionEstablished(int port)
					throws IOException, UnknownHostException {
					qsAdminApi.close(); // just to get here
				}});

		try {
			qsServerSock.connect(new InetSocketAddress(statusPort));
			System.out.println("Connected to "+statusPort);
			int statusCode = qsServerSock.getStatusCode();
			if(statusCode == statusPort) {
				System.out.println("Waiting on status 200...");
				//Wait for a long time
				Thread.sleep(1000*10);
				statusCode = qsServerSock.getStatusCode();
				if(statusCode!= expectedStatus) {
					statusCode = expectedStatus;
					System.out.println(
						"Could not establish client connection!\t"
						+ "Server responded with "+statusCode);
				}
				System.out.println(
					"Starting server loop... ");
				qsAdminApi.setStatusPort(qsServerSock.getLocalPort());
				while(!qsAdminApi.logon()) {
					statusCode = qsServerSock.getStatusCode();
					if(statusCode!= expectedStatus) {
						checkStatus(
							qsAdminApi, expectedStatus,
							STATUS_PORT);
					}
				}
				statusCode = qsServerSock.getStatusCode();
				while(qsServerSock.isConnected()) {
					Thread.sleep(1000);
					qsAdminApi.close();
				}
			} else {
				checkStatus(
					qsAdminApi, expectedStatus, STATUS_PORT);
			}
			return true; // success
		} catch (IOException e) {
			checkStatus(qsAdminApi, 100, statusPort);
			return false;
		}
	}

	/**
	 * Destroys the {@link QSAdmin} and cleans up the QSDA
	 */
	public void tearDown()
		throws InterruptedException, IOException, UnknownHostException,
			ConnectException {
		QSServerSocketImpl qsServerSock =
			new QSServerSocketImpl(STATUS_PORT, qsAdminApi,
		new QSServerSocketListener());

		try {
			Thread.sleep(1000); // force close QSAdmin
			// make sure it gets closed!
			qsServerSock.logoff();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		qsAdminApi.close();
	}

//  protected final void tearDown() {
//    QSAdminApi._instance = null;
//  }
	/**
	 * This method opens and then closes a QSAdmin server socket.
	 */
	protected void closeAndLogout()
		throws UnknownHostException, InterruptedException
	{
		Thread.sleep(500);
		boolean done = true;
		while(!done) {
			done = qsAdminApi.logoff();
			if(done) {
				break;
			}
			Thread.sleep(500);
		}
		QSServerSocketImpl qsServerSock =
			new QSServerSocketImpl(STATUS_PORT, qsAdminApi,
		new QSServerSocketListener());
		try {
			qsServerSock.connect(new InetSocketAddress(
				STATUS_PORT, STATUS_PORT));
		} catch (IOException ioe) {
			qsServerSock.close();
			done = true;
		}
	}
}
/* vim: set ts=4 et sw=4 tw=72: tw=72:
 */
/*
 * Local variables:
 *  *indent-problems*
 *  *___indent-problems*
 *  *end-indent-problems*
 *  _TW_source_
 */