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
		
    private static final Logger logger = Logger.getLogger(BomberServerTest.class);

    private Vector<ClientInfo> tempGlobal = new Vector<ClientInfo>();

    private final int MAX_NUM_SERVERS = 4;

    private static Server server = null;

    /**
     * Returns a {@link Server} object. To retrieve the instances, use
     * {@link #getInstance()}. To get a session with no name, use
     * {@link #getSession(String)}, or directly use the
     * {@link bomberServer#getGlobalSession()}-method.
     *
     * @return Server
     */
    public static Server getServer() {
        if (server == null)    {
            server = new Server();
        }
        return server;
    }
   
    /**
     * Returns a {@link ServerSession} object. To retrieve the instances, use
     * {@link #getSession(String)}. To get a session with no name, use
     * {@link #getGlobalSession()}-method.
     *
     * @return ServerSession
     */
    public static ServerSession getSession(String name) {
        ServerSession result = null;
        try {
            result = server.getGlobalSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
   
    /**
     * Starts the server with a given port.
     *
     * @param name The name of the session.
     */
    public static void startDB(String name) {
        //create a new Server object
        Server serverObj = Server.createServer(false);
        String ports[] = serverObj.getPorts();
        if (ports == null) ports = new String[0];
        String portsArray[] = ports;
        int n = 2;
        while (n<=MAX_NUM_SERVERS) {
            try {
                ServerPort serverPortInstance = new ServerPort(portsArray[n], name);
                n++;
                server.addServerPort(serverPortInstance);
                break;
            }catch (IOException ioe) {
                n++;
            }
        }
        assertEquals("MAX_NUM_SERVERS", MAX_NUM_SERVERS, n);

        serverObj.shutdownConnection();
        serverObj.start();
        serverObj.reconnect();
    }

    /**
     * Starts the server with a default port number.
     *
     * @throws IOException
     * @throws SQLException
     */
    public static void start() throws IOException, SQLException {
}
}