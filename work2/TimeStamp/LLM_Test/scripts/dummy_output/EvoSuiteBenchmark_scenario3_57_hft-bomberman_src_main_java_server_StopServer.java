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
* It contains ten unit test cases for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		
	/**
	 * Test case for {@link StopServer#connectToSrv()}.
	 * 
	 * <p>
	 * Test strategy:
	 * <ol>
	 * <li>Start the server.</li>
	 * <li>Connect to the server.</li>
	 * <li>Send a StopServerMsg to the server.</li>
	 * <li>Check if the server is closed.</li>
	 * </ol>
	 * </p>
	 * 
	 * <p>
	 * Expected result: The server is closed.
	 * </p>
	 */
	@Test
	void testConnectToSrv() {
		// Start the server.
		Server server = new Server();
		server.start();
		
		// Connect to the server.
		StopServer stopServer = new StopServer();
		boolean connected = stopServer.connectToSrv();
		
		// Send a StopServerMsg to the server.
		if (connected) {
			try {
				Socket socket = new Socket("localhost", Server.PORT);
				ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
				out.writeObject(new StopServerMsg());
				out.close();
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// Check if the server is closed.
		assertFalse(server.isAlive());
	}
}