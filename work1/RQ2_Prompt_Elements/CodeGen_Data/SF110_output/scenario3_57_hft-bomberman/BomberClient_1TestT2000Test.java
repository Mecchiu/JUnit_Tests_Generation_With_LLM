// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains one unit test case for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {
/**
		 * Default constructor.
		*/
    public BomberClient_1Test() {
        super();
        log("Starting test");
    }
    
	/**
	 * Starts a connection test using the client.
	*
	* @throws IOException Thrown when the connection attempt was not successful.
	*/
	@Test
    public void testConnectSrv() throws IOException {
        new BomberClient().connectToSrv();
    }
	
	
	/**
	 * Checks that a server could connect.
	*/
	@Test
    public void testCanConnectSrv() {
        assertFalse(new BomberClient().connectToSrv());
    }

	
	/**
	 * Checks that a server could send a message to us.
	*/
	@Test
    public void testCanSendMsgToSrv() {
        new BomberClient().connectToSrv();

        // Connect the client.
        boolean result;
        result = new BomberClient().connectToSrv();
        assertTrue(result);

		// Send a message.
		Message msg = new ClientMsgSender().
				buildMessage("Message from client.").
				addParameter("Message from server.").
				build();

		// SEND a message over the connection.
		msg.addParameter("This was sent");
        Result msgResult = new ClientMsgSender().
                buildMessage("Message reply").
                build();
        
        assertTrue(new ClientMsgSender().sendMessage(msg)).
                isSucceeded().andThen(msgResult.getSuccessKeyword());
    }

	/**
	 * Checks that a client could send map information.
	*/
	@Test
    public void testCanSendMaps_1() {
        new BomberClient().connectToSrv();

        // Connect the client.
        boolean result;
        result = new BomberClient().connectToSrv();
        assertTrue(result);

		// Send an message.
        MapInfo map = new MapInfo();
        result = new ClientMsgSender().
				buildMessage("Message from client.").
				addParameter("Message from server.").
				build();
        
        assertTrue(new ClientMsgSender().sendMessage(map)).
                isSucceeded().andThen(result);
    }

	/**
	* Checks that the client receive a map information sent to the server.
	*/
	@Test
    public void testCanRecieveMaps_1() {
        new BomberClient().connectToSrv();

        // Connect the client.
        boolean result;
        result = new BomberClient().connectToSrv();
        assertTrue(result);

        // Send an message.
        result = new ClientMsgReceiver().
                buildMessage("Message from server.").
                addParameter("Message from client.").
                build();
        
        assertTrue(new ClientMsgReceiver().recieveMessage().isSucceeded());
    }
    
    private static class Result {
        private boolean succeed;
        private final String succeedKeyword;


        private Result(String succeedKeyword) {
            this.succeedKeyword = succeedKeyword;
        }

        private Result(boolean succeed, String succeedKeyword) {
            this.succeedKeyword = succeedKeyword;
            this.succeed = succeed;
        }

        /**
         * Gets the set of successful keywors if a succeed.
         */
        public boolean isSuccess() {
            return succeed;
        }

        /**
         * Sets the complete message to be sent.
         */
        public void setSucceeded(boolean succeed) {
            this.succeed = succeed;
        }

        /**
         * Sets the complete message response as the keyword to be sent.
         */
        public void setSucceededKeyword(String succeedKeyword) {
            this.succeedKeyword = succeedKeyword;
        }
    }
    
    /**
     * Sends one message to the server.
     */
    private void assertTrue(boolean condition) {
        getAndAdvance(condition).checkedAndUnchecked();
    }

    private Observable<Boolean> getAndAdvance(boolean condition) {
        return System.err.getObservable("Succeeded")
               .filter(condition)
               .map(Boolean.class::cast);
    }

    /**
     * Sends an array of ClientMessage to the server.
     */
    private void assertNotNull(Object o) {
        assertNotNull("Message from client.",o);
    }
    
}