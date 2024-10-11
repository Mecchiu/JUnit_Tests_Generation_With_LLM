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
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance4() {
		BomberServer bomberServer = BomberServer.getInstance();
		BomberServer bomberServer2 = BomberServer.getInstance();
		assertEquals(bomberServer, bomberServer2);
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
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance6() {
		BomberServer bomberServer = BomberServer.getInstance();
		BomberServer bomberServer2 = BomberServer.getInstance();
		assertEquals(bomberServer, bomberServer2);
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
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance8() {
		BomberServer bomberServer = BomberServer.getInstance();
		BomberServer bomberServer2 = BomberServer.getInstance();
		assertEquals(bomberServer, bomberServer2);
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
	* It tests if the method returns the same {@link BomberServer} object.
	*/
	@Test
	void testGetInstance10() {
		BomberServer bomberServer = BomberServer.getInstance();
		BomberServer bomberServer2 = BomberServer.getInstance();
		assertEquals(bomberServer, bomberServer2);
	}
}

// ServerGameSession.java
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

/**
 * This class represents a game session. It is responsible for managing the
 * clients in the session and starting the game.
 *
 * @author Steffen, Bj�rn, Daniel
 */
public class ServerGameSession {

    private static final Logger logger = Logger.getLogger(ServerGameSession.class);

    /**
     * The name of this session.
     */
    private String name;

    /**
     * The clients currently in this session.
     */
    private Vector<ClientInfo> clients = new Vector<ClientInfo>();

    /**
     * The server this session is running on.
     */
    private BomberServer server;

    /**
     * The number of rounds to be played in this session.
     */
    private int totalRounds;

    /**
     * The number of the current round.
     */
    private int currentRound;

    /**
     * The map to be played in this session.
     */
    private String map;

    /**
     * The preview image of the map.
     */
    private ImageIcon mapPreview;

    /**
     * The number of players in this session.
     */
    private int nrOfPlayers;

    /**
     * The game currently running in this session.
     */
    private ServerGame game;

    /**
     * Creates a new ServerGameSession.
     *
     * @param name
     *            The name of the session.
     * @param totalRounds
     *            The number of rounds to be played in this session.
     * @param map
     *            The map to be played in this session.
     * @param mapPreview
     *            The preview image of the map.
     * @param nrOfPlayers
     *            The number of players in this session.
     * @param server
     *            The server this session is running on.
     */
    public ServerGameSession(String name, List<String> maps, ImageIcon mapPreview, int nrOfPlayers, int totalRounds, BomberServer server);

    /**
     * Adds a client to this session.
     *
     * @param clientInfo
     *            The client to be added.
     */
    public void addClient(ClientInfo clientInfo);

    /**
     * Removes a client from this session.
     *
     * @param clientInfo
     *            The client to be removed.
     */
    public void removeClient(ClientInfo clientInfo);

    /**
     * Starts the game in this session.
     */
    public void startGame();

    /**
     * Returns the name of this session.
     *
     * @return The name of this session.
     */
    public String getName();

    /**
     * Returns the number of rounds to be played in this session.
     *
     * @return The number of rounds to be played in this session.
     */
    public int getTotalRounds();

    /**
     * Returns the number of the current round.
     *
     * @return The number of the current round.
     */
    public int getCurrentRound();

    /**
     * Returns the map to be played in this session.
     *
     * @return The map to be played in this session.
     */
    public String getMap();

    /**
     * Returns the preview image of the map.
     *
     * @return The preview image of the map.
     */
    public ImageIcon getMapPreview();

    /**
     * Returns the number of players in