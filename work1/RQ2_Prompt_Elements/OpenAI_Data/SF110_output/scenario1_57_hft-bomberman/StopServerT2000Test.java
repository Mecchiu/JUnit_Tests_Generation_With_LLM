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
	* It tests if the connection to the server is established.
	*/
	@Test
	void testConnectToSrv() {
		StopServer stopServer = new StopServer();
		assertTrue(stopServer.connectToSrv());
	}
}