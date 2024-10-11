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
	 * @author Doviela
	 *
	 * Test Server-method.
	 */
	@Test(expected=UnsupportedOperationException.class)
	public void ServerGameSession_getGameSession_failsIfGameSessionNotInit();
		@Test(expected=UnsupportedOperationException.class)
		public void ServerGameSession_getGameSession_failsIfNoGame() throws SQLException;
		@Test(expected=UnsupportedOperationException.class)
		public void ServerGameSession_getGameSession_failsIfGameSessionOpenEnded();
	 public ServerGameSession getGameSession();
	public ServerGameSession getGameSession();
	@Test(expected=UnsupportedOperationException.class)
	public void ServerGameSession_getGameSession_failsIfNoGameSessionOpenEnded();
	@Test(expected=UnsupportedOperationException.class)
	public void ServerGameSession_getGameSession_failsIfGameSessionClosed();
	@Test(expected=UnsupportedOperationException.class)
	public void ServerGameSession_getGameSession_failsIfNoClientRegistered();
	@Test(expected=UnsupportedOperationException.class)
	public void ServerGameSession_getGameSession_failsIfSessionClosed();

	public void addClientToGlobal(ClientInfo clientInfo);

	public void removeClientToGlobal(ClientInfo clientInfo);

	public void removeClientNotInGame(ClientInfo clientInfo);
	public void addClientsToGame(Collection<ClientInfo> list);
	public void removeClientsNotInGame(Collection<ClientInfo> list);
	public void broadcastSessionList();
	public void multicastMsg(Message message);
	public void broadcastMsg(Message message);
	

	private ServerGameSession createSession(String name, List<String> maps, ImageIcon mapPreview, int nrOfPlayers,int totalRounds, ClientInfo sender) throws SQLException,IOException,ClassNotFoundException {
		Logger logger = Logger.getLogger(BomberServerTest.class);
		Server server = Server.getInstance();
		logger.info("BOMBOMBER DATASOURCE STARTED");
		server.initDatabase();
		Connection cx = server.getConnection();
		Connection db = setupDataSource();

}
}