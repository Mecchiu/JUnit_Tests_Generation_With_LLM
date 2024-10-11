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
* It contains ten unit test cases for the {@link BomberServer#getInstance()} method.
*/
class BomberServerTest {

	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance2() {
		BomberServer bomberServer = BomberServer.getInstance();
		BomberServer bomberServer2 = BomberServer.getInstance();
		assertEquals(bomberServer, bomberServer2);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance3() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance4() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance5() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance6() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance7() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance8() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance9() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
	
	/**
	* Test case for {@link BomberServer#getInstance()} method.
	* It tests if the method returns a {@link BomberServer} object.
	*/
	@Test
	void testGetInstance10() {
		BomberServer bomberServer = BomberServer.getInstance();
		assertNotNull(bomberServer);
	}
}

// ClientInfo.java
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import common.Constants;

/**
 * This class represents a client connected to the server. It contains the
 * client's socket and the streams to communicate with the client.
 *
 * @author Steffen, Bj�rn, Daniel
 */
public class ClientInfo {

    private static final Logger logger = Logger.getLogger(ClientInfo.class);

    /**
     * The socket on which the client is connected.
     */
    private Socket socket;

    /**
     * The stream to send messages to the client.
     */
    private ObjectOutputStream out;

    /**
     * The stream to receive messages from the client.
     */
    private ObjectInputStream in;

    /**
     * The name of the client.
     */
    private String name;

    /**
     * The session the client is currently in.
     */
    private ServerGameSession session;

    /**
     * The thread that listens for incoming messages from the client.
     */
    private ClientListener clientListener;

    /**
     * Creates a new ClientInfo object.
     *
     * @param socket
     *            The socket on which the client is connected.
     * @param name
     *            The name of the client.
     * @throws IOException
     */
    public ClientInfo(Socket socket, String name) throws IOException {
        this.socket = socket;
        this.name = name;
        out = new ObjectOutputStream(socket.getOutputStream());
        in = new ObjectInputStream(socket.getInputStream());
        clientListener = new ClientListener(this);
        clientListener.start();
    }

    /**
     * Sends a message to the client.
     *
     * @param msg
     *            The message to be sent.
     */
    public void sendMsg(Message msg);

    /**
     * Returns the name of the client.
     *
     * @return The name of the client.
     */
    public String getName();

    /**
     * Returns the session the client is currently in.
     *
     * @return The session the client is currently in.
     */
    public ServerGameSession getSession();

    /**
     * Sets the session the client is currently in.
     *
     * @param session
     *            The session the client is currently in.
     */
    public void setSession(ServerGameSession session);

    /**
     * Returns the socket on which the client is connected.
     *
     * @return The socket on which the client is connected.
     */
    public Socket getSocket();

    /**
     * Returns the stream to send messages to the client.
     *
     * @return The stream to send messages to the client.
     */
    public ObjectOutputStream getOut();

    /**
     * Returns the stream to receive messages from the client.
     *
     * @return The stream to receive messages from the client.
     */
    public ObjectInputStream getIn();

    /**
     * Returns the thread that listens for incoming messages from the client.
     *
     * @return The thread that listens for incoming messages from the client.
     */
    public ClientListener getClientListener();

    /**
     * Closes the socket and the streams.
     */
    public void close();
}

// ClientListener.java
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import common.Constants;

/**
 * This class represents a thread that listens for incoming messages from a
 * client.
 *
 * @author Steffen, Bj�rn, Daniel
 */
public class ClientListener extends Thread {

    private static final Logger logger = Logger.getLogger(ClientListener.class);

    /**
     * The client this thread listens for.
     */
    private ClientInfo clientInfo;

    /**
     * Creates a new ClientListener object.
     *
     * @param clientInfo
     *            The client this thread listens for.
     */
    public ClientListener(ClientInfo clientInfo);

    /**
     * Listens for incoming messages from the client.
     */
    public void run();

    /**
     * Returns the client this thread listens for.
     *
     * @return The client this thread listens for.
     */
    public ClientInfo getClientInfo();
}

// ServerGameSession.java
package server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import common.Constants;

/**
 * This class represents a game session. It contains the clients that are
 * currently in the session and the session's name.
 *
 * @author Steffen, Bj�rn, Daniel
 */
public class ServerGameSession {

    private static final Logger logger = Logger.getLogger(ServerGameSession.class);

    /**
     * The name of the session.
     */
    private String name;

    /**
     * The clients that are currently in the session.
     */
    private Vector<ClientInfo> clients = new Vector<ClientInfo>();

    /**
     * The maps that are available in this session.
     */
    private List<String> maps;

    /**
     * The preview image of the map.
     */
    private ImageIcon mapPreview;

    /**
     * The number of players that are needed to start the game.
     */
    private int nrOfPlayers;

    /**
     * The number of rounds that are played in this session.
     */
    private int totalRounds;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsWon;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLost;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsDrawn;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsLeft;

    /**
     * The number of rounds that have already been played.
     */
    private int roundsPlayed;

