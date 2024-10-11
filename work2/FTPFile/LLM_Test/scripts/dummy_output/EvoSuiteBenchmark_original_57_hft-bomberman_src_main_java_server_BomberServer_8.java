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
     * Constructor. Creates an instance of the class.
     */
    public BomberServerTest() {
    }

    /**
     * The {@link Server#getPort()} of the server.
     *
     * @return The port number of the server.
     */
    public static int getPort() {
        return port;
    }

    /**
     * Waits the server, i.e. waits for a connection from client to server
     * <i>after</i> waiting for {@link #waitForClients() for a client</i>
     *
     * @throws InterruptedException If the waiting was interrupted
     * @throws java.io.IOException An I/O error was encountered
     */
    @Test
    public void waitForClients() throws InterruptedException,
            IOException {
        // setup server socket
        srvSocket = new ServerSocket(port);

        System.out.println("waitForClients");

        // create a client and wait it
        Server s = new Server();
        s.setName("Server");
		s.createServerSession(null, "");

        System.out.println("waiting for a new client");
        for (int i = 0; i < 20; i++) {
            try {
                Socket s2 = srvSocket.accept();
                logger.info("Got a new connection from client " + s2);
                // if we got an accepted client
                if (s!= null) {
                    break; // break out of the for-loop
                }
                System.out.println("Waiting for a client to connect");
                try {
                    s2.connect(new java.net.InetAddress("127.0.0.1", port));
                } catch (IOException e) {
                    // ignore connection error
                    // logger.debug("Error while trying to connect with: "+e);
                }
            } catch (IOException e) {
                // ignore connection error
                // logger.debug("Error while trying to wait for new connection: "+e);
            }
            // we want to be a bit on the start again
            Runtime.getRuntime().addShutdownHook(new Thread(() -> { s.closeServerSession(s); }));
        }
        // test end
        assertNotNull("waitForClients not received a valid (server is up) client", s);

        // tear down server if we connect() to the server
        if (s.getName().endsWith("server")) {
            s.closeServerSession(s);
        }
    }
    
}