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

   /**
   * A generic test case.
   * @throws IOException In case of an error.
   * @throws SQLException If the database could not be connected or loaded.
   */
	static void test(BomberServer bomberServer) throws IOException, SQLException {
		
    Server server = bomberServer.getInstance();
		String serverAddr = "localhost";
		String game = "server-test";

        // First create a Server with a port number that is different from 2190. The second port is for testing purposes of the port.
		Integer portNumberOfServer = 2191;

		// Create a new ServerSocket that listens to a port Number for server connection, port number two191
		ServerSocket serverSocket = new ServerSocket(portNumberOfServer);

        // Start the Server using the new ServerSocket to listen on the new ServerSocket.
		Server serverTemp = Server.create(serverSocket, portNumberOfServer);

		// Create and start a ConnectionFactory for a connection to a Client running on serverTemp
        ConnectionFactoryFactory factory =new ConnectionFactoryFactory();
        javax.sql.DataSource ds = new javax.sql.PooledDataSource();
        ds.setURL(new java.net.URL("jdbc:hsqldb:hsql://localhost:1919/world"));

        Connection conn = factory.createConnection(serverTemp, "Tester", "Tester", "Tester");
        conn.createStatement().execute("INSERT INTO users(id, name) VALUES(2, " + Constants.SYDNEY_USER + ");");
		
        HashMap<String, String> players = new HashMap<String, String>() {{
							put("ID1", "Tester");
							put("ID2", Constants.SEGA);   
						}};
        
        conn.createStatement().executeUpdate("INSERT INTO players (name, id) VALUES ('" + Constants.TESTER + "', 2);");

        // Execute the PlayerInsertStatement above one Player.
        Vector<Object> playersVector = new Vector<Object>();
        playersVector.addElement("ID1");
		playersVector.addElement("ID2");
		factory.updateConnection(conn, playersVector);
        factory.stop();
		
		// Create a connection to a Client running on a Server
		Connection connServer = serverTemp.connect(serverAddr, Constants.GAME_PORT);

        // Execute a PlayerInsertStatement below one Player.
        playersVector = new Vector<Object>();
        playersVector.addElement("ID1");        
        playersVector.addElement("ID2");
        factory.updateConnection(connServer, playersVector);
		
        // Disconnect both Server.
        serverTemp.disconnect();
		
		// Shut down the ServerSocket.
		serverSocket.close();

		// Shut down the ConnectionFactory.
		ds.disconnect();
    }

	/**
	* @return Server
	*/
    private static Server getServer() {
        try {
            Server server = Server.createServer();
            return server;
        } catch (IOException ioe) {
            Logger.getLogger("BomberServer.test").log(Logger.LOG_SEVERE,"Could not start the server", ioe);
        }
        return null;
    }

    /**
     * @return Server
     */
    private static BomberServer getBomberServer() {
        return getInstance();
    }

    /**
     * @return  BOMBER SERVER
     * @throws  IOException  IOException
     * @throws  SQLException SQLException
     */
    private static BomberServer getBomberServer(boolean isConnected) throws IOException, SQLException {
        return getBomberServer(isConnected, Constants.GAME_PORT);
    }

    /**
     * @return  BOMBER SERVER
     * @throws  IOException  IOException
     * @throws  SQLException SQLException
     */
    private static BomberServer getBomberServer(boolean isConnected, int gameNumber) throws IOException, SQLException {
        String game = "server-" + gameNumber;
        BomberServer bomberServer = getBomberServer();
        serverAddr = "localhost";
        player1Server = new bomberServer.BomberServer("Tester", Constants.GAME_PORT, Constants.SERVER_ROOT);
        player2Server = new bomberServer.BomberServer(game, Constants.GAME_PORT, Constants.SERVER_ROOT);
        
        // Create a new ConnectionFactory for a connection to a Client running on server1Server.
        ConnectionFactoryFactory factory = new ConnectionFactoryFactory();
        javax.sql.DataSource ds = new javax.sql.PooledDataSource();
        ds.setURL(new java.net.URL("jdbc:hsqldb:hsql://localhost:1919/world"));
        conn1 = factory.createConnection(player1Server, "Tester", "Tester", "Tester");
		
		// Create and start a ConnectionFactory for a connection to a Client running on server2Server.
		ConnectionFactoryFactory factory2 = new ConnectionFactoryFactory();
		javax.sql.DataSource ds2 = new javax.sql.PooledDataSource();
		ds2.setURL(new java.net.URL("jdbc:hsqldb:hsql://localhost:1919/world"));
		conn2 = factory2.createConnection(server2Server, "Tester", "Tester", "Tester");
      
		// Execute a PlayerInsertStatement above one Player...
        Vector<Object> playersVector = new Vector<Object>();
        playersVector.addElement("ID1");
		playersVector.addElement("ID2");
		factory.updateConnection(conn1, playersVector);
		
		// Execute a PlayerInsertStatement above one Player...
        playersVector = new Vector<Object>();
        playersVector.addElement("ID1");
		playersVector.addElement("ID2");
		factory.updateConnection(conn2, playersVector);
		
		// Disconnect both Server.
		server1Server.disconnect();
		server2Server.disconnect();
