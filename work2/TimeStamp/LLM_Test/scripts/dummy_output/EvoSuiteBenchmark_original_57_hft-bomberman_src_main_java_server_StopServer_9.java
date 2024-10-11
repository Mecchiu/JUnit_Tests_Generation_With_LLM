// StopServerTest.java
package server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import messages.Message;
import messages.global.StopServerMsg;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StopServer}.
* It contains one unit test case for the {@link StopServer#connectToSrv()} method.
*/
class StopServerTest {
		
	/**
	* Test method of {@link StopServer#connectToSrv()}
	*
	*/
	@Test
	void connectToSrv(){
		
		// Connect to the server
		try {
			client.connectToServer(serverName,serverPort);

			// create a new message
			ServerMessage msg = new ServerMessage();
			msg.addByte(0);
			msg.addByte(2);
			msg.addByte(0);
			
	        // Send a message to the server
	        client.sendToServer(msg);
			
		} catch (IOException e) {
			fail("Exception occured while connecting to the server");
		}
	}

	/**
	* Test method of {@link StopServer#sendMsg(Message)}
	*
	*/
	@Test
	void sendMsg(){
		// create a new message
        Message msg = new ServerMessage();
        msg.addInt(1);
		
        // Send a message to the server.
        client.sendToServer(msg);

        obj = new ObjectOutputStream(client.getOutputStream());
        // Read the message to be sent on the client (ServerMessage from Client)
        obj.writeObject(msg);
        // Read the object from the server reply on the client
        Object inputObj = obj.readObject();
        // Check that the object from the client read as server message
        assertNotNull("the client did not send a message to the server",inputObj);
        // The message is correct
        assertEquals("the message is incorrect",msg,inputObj);
	}

	/**
	* Test method of {@link StopServer#callingStopServer(StopServer)}
	*
	*/
	@Test
	void callingStopServer(){
		
		// Connect to the server
		try {
			client.connectToServer(serverName,serverPort);

			// Call the method to stop the server
			client.callingStopServer(new StopServer(serverName,serverPort));

		} catch (IOException e) {
			fail("Exception occured while calling to stop the server");
		}
	}
}