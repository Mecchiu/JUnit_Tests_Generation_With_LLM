// BomberServerTest.java
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.jdbc.jdbcDataSource;
import common.Constants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberServer}.
* It contains one unit test case for the {@link BomberServer#getInstance()} method.
*/
class BomberServerTest {
		public static final int TESTING_PORT = Constants.DEFAULT_SERVER_PORT;
	/**
	 * A temporary instance
	 *
	 * @return A temporary instance
	 */
	public static synchronized BomberServer getInstance() {
		if (bomberServer == null) {
			try {
				bomberServer = new BomberServer();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
						return bomberServer;
	}

	/**
	 * Destructor.
	 *
	 * @throws Exception
	 */
	@Test
	public void test() throws Exception {
		// This test is done in the static block above, just after the constructor call.
		jdbcServer = Server.createServer(TESTING_PORT, Constants.PORT, true);

		jdbcServer.connect();
		try {
			for (;;) {
				// Test is done in the loop.

				// Get a client from this server.
				// This client is not the sender.
				ServerGameSession gameSession = jdbcServer.getGameSession();
				assertNotNull(gameSession);

				// Get a GameSession object from this client.
				GameSession gameSessionFromClient = gameSession.getGameSession();
				assertNotNull(gameSessionFromClient);
			}
		} finally {
			// Release the db connection before closing the server
			jdbcServer.releaseDBConnection();
			jdbcServer.stopServer();
			jdbcServer.shutDown();
		}
	}
}