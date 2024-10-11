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
		
	private static final boolean TRYING_SESSION_ON_ERROR = false;
	
    private static String userID = "BomberServerTest";
	private String gameName;
	
	public BomberServerTest() {
		userID = "BomberServerTest";
	}
	
	/**
	 * Saves a session in the database.
	 */
	public void sessionCreated(SessionDetailsMsg sessionDetailsMsg);
	
	/**
	 * Saves a session in the list for the users that have not yet joined the lobby.
	 */
	public void sessionJoined(SessionListMsg sessionListMsg);
	
	/**
	 * Saves all the clients for the currently joined session.
	 */
	public void sessionListUpdated();
	
	/**
	 * Sends the message to the client who has started the session, where the client
	 * ID is returned. The client is identified by the name of the client.
	 */
	public void sessionStarted();
	
	/**
	 * Returns the server-ID associated with the given username.
	 *
	 * @param username
	 *            The username.
	 * @return The server-ID of the given username.
	 */
	public String getServerID(String username);
	
	private Server server = null;
	
	public static void main(String[] args) throws IOException {
		new BomberServerTest();
	}
	
	/**
	 * Sets the default settings.
	 */
	public void setUp();

	/**
	 * @return A new Server object configured for the bomber-server.
	 */
	public static Server getServer();

	/**
	 * @return A new ServerSocket object configured for the bomber-server.
	 */
	public ServerSocket getSerSocket();
	
	/**
	 * Shuts down the server-object.
	 */
	public void shutDownServer();

	/**
	 * The sessionListMsg object that is contained in all new sessions that are
	 * started remotely.
	 */
	public SessionListMsg getSessionListMessage();

	/**
	 * This should only be used for testing
	 */
	public void setServerName(String serverName);

}

// bomberServer.jsp