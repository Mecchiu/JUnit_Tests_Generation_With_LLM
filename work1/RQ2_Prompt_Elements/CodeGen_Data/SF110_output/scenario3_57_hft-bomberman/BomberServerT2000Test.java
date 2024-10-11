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

	private static final String serverName = "Hsqldb-BomberServer-Test";
	
	/**
	 * Test of {@link bomberServer#run()} method, of the class {@link BomberServer}.
	 */
	@Test
	public void testGetInstance() {
		
		Server server = Server.getInstance();
		assertNotNull(server);
		assertTrue(server instanceof BomberServer);
	}

	/**
	 * Test of {@link bomberServer#run()} method, of the class {@link SessionHandler}.
	 */
	@Test
	public void testRun() throws SQLException {
				
        int port = Integer.parseInt(Constants.Jdbc_Port);
        System.setProperty("db.port", "" + port);
	
		System.out.println("Connecting to the sever");
        log.info("Connecting to the sever");
        String host = Constants.DB_Address + ":" + port;
        Server server = new Server(host, port);
        
		log.info("Starting DB connection");
        Connection conn = new javax.sql.DataSource().getConnection();
        
        log.info("Starting Session Handler");
        
        javax.sql.DataSource datasource =  new javax.sql.DataSource();
        conn.setDataSource(datasource);
        
        SessionHandler handler = new SessionHandler(conn);
        Thread th = new Thread(handler);
        th.start();
        Thread.sleep(1000);
        log.debug("Stopped Session Handler");
    
        server.stop();
        sessionHandler.join(30000);
        
        //wait for the client to come up
        Thread.sleep(60000);
        log.debug(server.getPort() + ": Successful session handler test");
        
		System.out.println("Test complete");
	}
	/**
	 * Test of {@link SessionHandler#waitUntilReady()} method, of the class {@link SessionHandler}.
	 */
	@Test
	public void testWaitUntilReady() throws SQLException {
		
		System.out.println("Starting DB connection");
        Connection conn = new javax.sql.DataSource().getConnection();
        
		System.out.println("Stopping Session Handler");
        sessionHandler.stop();
        Thread.sleep(1000);
        
        log.info("Stopped Session Handler");
    
        server.stop();
		
        sessionHandler.join(30000);
       
		//wait for the client to come up
        Thread.sleep(60000);
        
		System.out.println("Waiting for client to come up");
		SessionHolder holder = new SessionHolder(conn);
		holder.join(30000);
		log.debug(holder.getPort() + ": Client connected");
		
		System.out.println("Waiting for client to disconnect");
		holder.join(10000);
		log.debug(holder.getPort() + ": Client disconnected");
		
		System.out.println(sessionHandler.waitUntilReady().get();
			
		//check that all data are present
		Collection<Message> allMessages = sessionHandler.getMessagesSent();
        	Collection<Integer> allSays =  sessionHandler.getDetermineSaysList();
    
        	//now that all data are present, read them out by a method call
        	List<Message> messageList = sessionHandler.getMessagesAndSays();
        
        	//now that all data are present, read them out by a method call
    
        	Vector<SessionDetailsMsg> sessionDetailList = sessionHandler.getSessionDetailsList();
            
        	Vector<Integer> sessionDetailVector = sessionDetailList.get(0).getSays().get(0);
    
        	//check that all session details are present
        	for (int i = 1; i < sessionDetailList.size(); i++) {
	            	log.debug(sessionDetailList.get(i).getKey() + " - Value: " + sessionDetailList.get(i).getValue());
					assertTrue(sessionDetailList.get(i).getSessionDetails().containsKey("say")); //the key must be present
        	}	    
        	for ( int i = 0; i < sessionDetailList.size(); i++) {
	            	log.debug(sessionDetailList.get(i).getKey() + " - Value: " + sessionDetailList.get(i).getValue());
					assertTrue(sessionDetailList.get(i).getSessionDetails().containsKey("say"));
					assertTrue(sessionDetailList.get(i).getSent().add("message") >= 0);
					assertTrue(sessionDetailList.get(i).getSent().add("say") >= 0);
					assertTrue(sessionDetailList.get(i).getDetermined().add("says") >= 0);
					assertTrue(sessionDetailList.get(i).getDetermined().add("says") >= 0); //the key must be present
    	        }
    
	        //check that all session details are present
	        for (int i = 0; i < sessionDetailList.size(); i++) {
	            	log.debug(sessionDetailList.get(i).getKey() + " - Value: " + sessionDetailList.get(i).getValue());
					assertTrue(sessionDetailList.get(i).getSessionDetails().containsKey("say"));
    	        }
        	
          
        	log.info(sessionDetailVector);
        
    	
        //reconnect
        conn.setAutoCommit(false);
        
        log.info("Connecting to the sever again");
        server = new Server(host, port);
    
        log.info("Starting DB connection");
        conn = new javax.sql.DataSource().getConnection();
        
        log.info("Stopping Session Handler2");
        sessionHandler.stop();
        
        log.info("Stopped Session Handler2");
    
        server.stop();
		
        sessionHandler.join(30000);
       
		//wait for the client to come up
        Thread.sleep(60000);
        
		System.out.println