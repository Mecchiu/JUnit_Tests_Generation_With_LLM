// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains one unit test case for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		private String serverName = "196.142.139.191";

		@Test
		/**
		 * Test method for
		* {@link StopServer#connectToSrv()} field.
		* @throws IOException
		*/
		public void testConnectToSrv() throws IOException {
			// Create server object with correct server name
			ObjectOutputStream out = new ObjectOutputStream(new
					SocketConnection(serverName, serverPort));

			// Send the message
			Message msg = new StopServerMsg(serverName, serverPort, true, true);
			out.writeObject(msg);

			// Check if the connection went in success
			assertTrue(out.waitForReading(1000));
			assertTrue(out.readObject().equals(new StopServerMsg(serverName,
					serverPort, true, true)));

			// Check if the connection went in success in second half of the test
			assertFalse(out.waitForReading(1000));

			// Check Server is still connected
			assertTrue(connectToSrv());
		}

	/**
	 * Test method for
	* {@link StopServer#callSrv()} field.
	* @throws IOException
		*/
		@Test
		public void testCallSrv() throws IOException {
			// Connect to the server
			ObjectOutputStream out = new ObjectOutputStream(new
					SocketConnection(serverName, serverPort));

			// Send the message
			System.out.println("TestServer: test message");
			Message msg = new StopServerMsg(serverName, serverPort, false, false);
			out.writeObject(msg);

			// Check if the connection was sent as expected
			assertTrue(out.waitForWriting(1000));
			assertTrue(out.readObject().equals(new StopServerMsg(serverName,
					serverPort, false, false)));

			// Try closing the connection, which is now in closed state
			connectToSrv();
		}

		/**
		 * Creates a new connection for the server, checks if
		 * the connection is correct and starts the server object.
		 * @throws IOException
		 */
		@Test
		public void testCreateNewConnection() throws IOException {

			// Connect to the server
			ObjectOutputStream out = new ObjectOutputStream(new
					SocketConnection(serverName, serverPort));

			// Send message
			Message msg = new StopServerMsg(serverName, serverPort, false,
					false);
			out.writeObject(msg);

			// Check if the connection went in success
			assertTrue(out.waitForReading(1000));
			assertTrue(out.readObject().equals(new StopServerMsg(serverName,
					serverPort, false, false)));

			// Check if the connection goes in success in second half of the test
			assertFalse(out.waitForReading(1000));

			// Start the server object
			connectToSrv();
		}
}

class SocketConnection implements
    java.io.Closeable {

	// The server name
	private String serverName;

	// The port
	private int port;

	public SocketConnection(String serverName, int port) {
		setServerName(serverName);
		setPort(port);
	}

	// We need something for the test
	public void setServerName(String serverName) {
		this.serverName = serverName;
	}

	public void setPort(int port) {
		this.port = port;
	}

	// Check if server is open
	public boolean isConnected() {
		return server!= null && server.isConnected();
	}

	// Connect to the Server
	public void connectToSrv() throws IOException {
		server = new Socket(serverName, serverPort);
	}

	// Check if connection succeeded
	public void sendMessage() throws IOException {
		System.out.println("Waiting for server to close client connection!");
		Thread.sleep(500);
		assertTrue(isConnected());
		// TODO Close
	}

	// Read object
	public static void main(String[] args) {
		SocketConnection sc = new SocketConnection("192.196.142.191", 9999);
		try {
			System.out.println("Waiting for connection");
			while (!sc.isConnected());
			System.out.println("Connection successful!");
			Connection cn = new Connection();
			cn.writeObject(sc);
			cn.socket.close();
		} catch (IOException io) {
			System.out.println("Unable to set up the connection");
		}
	}
}

class Connection implements
    java.io.Closeable {

	// The socket to the Server
	private Socket socket;

	// The Server object
	private Server obj;

	/**
	 * @param serverName
	 * @param port
	 * @param serverPort
	 */
	public Connection(Server obj, String serverName, int port, int serverPort) {
		super();
		this.obj = obj;
		this.socket = new Socket(serverName, serverPort);
		try {
			socket.connect(new java.net.InetSocketAddress(
					org.jibble.papi.NetworkAddress.resolve(socket.getInetAddress())));
		} catch (java.net.UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// write
	private void writeObject(Object o) throws IOException {
		ObjectOutputStream os = new ObjectOutputStream(socket);
		os.writeObject(o);
	}

	// read
	private Object readObject() throws IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(socket);
		return is.readObject();
	}

	// Send the message
	public void sendMessage() throws IOException {
		Object o = writeObject();

		System.out.println("Write connection to server");
		writeObject(o);
	}

	// Read object
	public static Object readObject(Object o) throws ClassNotFoundException,
			IOException {
		ObjectInputStream is = new ObjectInputStream(socket);
		return is.readObject();
	}

	// @Override
	public void close() {
		System.out.println("Server socket closed");
		obj.destroy();
	}
}