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
		private static final int DEPTH_BETWEEN_TEST_SOCKET_MADE_ALIVE = 1;
        private static final String TEST_SESS_MAPPING_XDSM_FILE = "src/main/java/server/testXDSM.xdsMapping";
        private static final String TEST_SESS_MAPPING_XDSM_NAME = "XDSM test.xdsMapping";
        // XDSM test has the following structure:
        //
        // <map file>:
        // map is a string representing the Map Name
        // i_d is the string representing the number of Players
        // nr of Players is the int representing the number of players
        // map is the content of a Map-File
        // <session-name>"s_d_p_n"_map"
       /*  <session-name>
        <name><server>
        </session-name>
        <session-name>
        <name><server>
        </session-name>
        <session-name>

     xdsMapping test
  i_d is the number of players
    i_n is the number of map
    nr_map is the number of map
       map name
       nr_name is the number of map
       total is the size of map
  session-name is the server
   name is the server (default)
*/

    private final String xdMapping = "src/main/java/server/testXDSM.xdsMapping";
    private final String xdMappingName = "XDSM test.";

    private List<Message> receivedMessages = new Vector<Message>();

    private int numOfConnectedClients = -1;

    private ClientInfo cli;

    private static jdbcDataSource setupDataSource();


    /**
     * Starts our server and tests if it started working.
     * @throws IOException
     *
     */
    private void testServer(int port) throws IOException {
            Server server = null;
}
}