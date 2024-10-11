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

	/**
	 * Constructor for Test.
	 * @param logindata  Remote QSAdmin Server information.
	 */
	public QSAdminAPITest(String[] logindata) {
		//log.logAccess("Test: Remote server information : ");
	}

	@Test
	public void testLogon() {
        final String[] logindata = {"127.0.0.1:9080", "127.0.0.1:9090"};
		final boolean result = logon(logindata);
		assertTrue(result);
	}
	
	/**
	 * Tests communication by calling two methods of {@link QSAdminAPI}.
	 * Calling on the first method will login the given server if one is connected.
	 * If one fails, just logging that the server is not available.
	 * @param logindata List of strings
	 * @return boolean true if server is available and logged in
	 */
	private boolean logon(String[] logindata) {
		log.logAccess("Testing logon from QsAdmin API at ");
		boolean result = true;
		String info = "";
		try {
			if(logindata == null) {
				log.logAccess("Exception, trying to connect. Please check if Qs admin server is online.");
				log.logAccess("Server information was null. The last known information was : \n");
				for(int i = 0; i < logindata.length;i++) {
					log.logAccess("Server information :   ");
					log.logAccess(logindata[i]);
				}
				log.logAccess("End of the log information. Trying second log in...");
				result = login(logindata);
				log.logAccess("Server information :   ");
			} else {
				log.logAccess("Server information :   ");
				log.logAccess(logindata);
				result = login(logindata);
			}
			log.logAccess("End of logging. ");
			if(!result) {
				log.logAccess("Failed to login");
			} else {
				log.logAccess("Logged in");
			}
		} catch (Exception x) {
			log.logAccess("Exception: " + x.getMessage());
			log.logAccess("End of running test");
		}
		return result;
	} 
	
	/**
	 * Tests communication by connecting to remote QsAdminServer.
	 * @param logindata List of strings
	 * @throws java.net.UnknownHostException 
	 */
	private void login(String[] logindata) throws UnknownHostException {
		try {
			InetAddress addr = InetAddress.getByName("127.0.0.1");
			InetSocketAddress sockaddr = new InetSocketAddress(addr, 9080);
			Socket socket = new Socket(sockaddr);
			socket.setSoTimeout(60000);
			OutputStreamWriter wr = new OutputStreamWriter(socket.getOutputStream());
			writer = wr;
			InputStreamReader rr = new InputStreamReader(socket.getInputStream());
			reader = rr;
			
			String line = "";
			writer.write("login");
			while (!reader.ready()) {
				try {
					line = reader.readLine();
				} catch (IOException e) {}
			}
			writer.write(" ");
			writer.write(logindata[0]);
			writer.write(" ");
			writer.write(logindata[1]);

			writer.flush();
			reader.readLine();
			writer.write("quit\n");

			writer.flush();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.flush();
			reader.readLine();
			writer.write("quit\n");
			while (!reader.ready()) {
				try {
					line = reader.readLine();
				} catch (IOException e) {}
			}
			writer.write(line);
			writer.flush();
			reader.readLine();
			writer.write("quit\n");

			writer.flush();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.readLine();
			reader.flush();
			writer.write("quit\n");
		} catch (IOException e) {
			writer.close();
			reader.close();
			socket.close();
			log.logAccess("Test: exception : " + e.getMessage());
			log.logAccess("Logging failed.");
		}
	}
	
	private Socket socket;
	private final OutputStreamWriter writer = new OutputStreamWriter(socket.getOutputStream());
	private final InputStreamReader reader = new InputStreamReader(socket.getInputStream());
	private PrintWriter writerOut;
	private PrintWriter readerOut;

	private PrintWriter writer2;
	private PrintWriter reader2;
	private boolean isTryingServer;

	private boolean reader2IsFull;
	private boolean writer2IsFull;

	private boolean isClosed;

	private boolean isStopped;

	private Thread readerThread;	
	private Thread writerThread;

	private boolean isServerConnected;
	
	
	
	private static final Log log = LogFactory.getLog("QSAdmin API Test");
	/*
	 * (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		log.logAccess("Starting QsAdmin API test : ");

 		writerOut = new PrintWriter(writer, true);
		readerOut = new PrintWriter(reader, true);

		readerThread = new Thread(new Runnable() {
			public void run() {
				readerOut.write("ping\n");
			}
		});
		readerThread.setDaemon(true);
		readerThread.start();
	
		writerThread = new Thread(new Runnable() {
			public void run() {
				writerOut.write("pong\n");
			}
		});
		writerThread.setDaemon(true);
		writerThread.start();

		log.logAccess("Starting a thread to keep the connection while logging in... ");

		isTryingServer = true;
		while(isTryingServer) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Assert.fail("Timed out. Is QsAdmin server not online?");
			}
			log.logAccess("Trying to connect to QsAdmin server from thread : ");
			if(isServerConnected) {
				isServerConnected = send