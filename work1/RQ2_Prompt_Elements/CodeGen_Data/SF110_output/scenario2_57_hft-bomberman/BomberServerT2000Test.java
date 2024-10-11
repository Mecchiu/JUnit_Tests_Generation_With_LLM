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

    private static Logger log = Logger.getLogger(BomberServerTest.class);	
    
    /**
     * Creates server instance given server object.
     *
     * @param server HSQLDB database.
     */
    public BomberServerTest(Server server) {
        this.server = server;
    }

    private Server             server;
    private static BomberServer    bomberServer = null;
    /**
     * @throws java.io.IOException Thrown in case of problems
     */
    @Test
    public void testCreationAndServer() throws IOException {
        log.info("Creating server");
        this.server = startServer();
        assertNotNull(server);
        log.info("Server is running at: " + server.getDisplayString());
    }


     /**
     * @throws ClassNotFoundException Thrown in case if problem
     *                                 gets thrown while starting the server.
     * @throws java.io.IOException Thrown in case if problems
     *                                 gets thrown while starting the server.
     */
    @Test
    public void testCreateAndServer() throws ClassNotFoundException, IOException {
        log.info("Creating a new server after server creation");
        System.setProperty("java.security.policy", "/tmp/test.security.policy");
        System.setProperty("java.security.policy.path", "/sec/test.policy");
        this.server = new Server("testServer", 9200, 3);
        assertNotNull(server);
    }
}
