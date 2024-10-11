// BomberClient_0Test.java
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
* It contains one unit test case for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_0Test {

    /**
     * This represents the class itself.
     *
     * @param arguments
     */
    BomberClient_0Test(String[] arguments){
        
    }
    
    /**
     * Runs the testing with the specified parameters to create a client frame to play
     * with.
     * The connection is automatically closed after a successful communication via a
     * given socket (sock) and the expected type of the incoming messages.
     *
     * @param arguments
     */
    public static void main(String[] arguments) {
        BomberClient b = new BomberClient_0Test(arguments);
    }
    /**
     * Tests if an instance of {@link BomberClient} correctly was created.
     */
    @Test
    public void testProperties(){
        assertTrue(b == getInstance());
    }
    
	@Test
	public void getInstance_test(){
        String[] b_getInstance = new String[] { "BomberClient" };
        BomberClient b = this.getInstance();
    }
	@Test
	public void setUp() throws IOException, InterruptedException {
        startSwing();
    }
	@Test
	public void receive_test() {
		String msg = null, msg1_1, msg1_2, msg2_1, msg2_2;
		try {
			// send message
	
		}
		catch (Exception e) {
		    msg = e.getMessage();
        }
		// check expected message
		assertNotNull("null returned", msg);
		boolean equal = msg.equals("Dummy message (1));");
		assertTrue("message does not have the same type (1)", equal);
		// check response message with info request
		msg1_1 = "InfoRequestMsg+2";
		msg1_2 = "/myInfo.xml";
		try {
			assertFalse("check info request msg with wrong type", msg1_1.equals("InfoRequestMsg+2"));  
			assertTrue("msg has wrong type",  msg1_2.equals("InfoRequestMsg+2"));
		}
		catch (ClassCastException cast_exception) {
        }
		// create a client and wait until the connection with connection
	  	// will be established
		Socket sock = new Socket(getInfo(msg1_1), Server.PORT);
         new Server();
         
		
		List<ClientMsgSender> clientMsgSender = new ArrayList<ClientMsgSender>();
	    
		// send msg2
		ClientMsgSender clientMsgSender1 = new ClientMsgSender();
		clientMsgSender.add(clientMsgSender1);
	    
		new SessionDetailsMsg(2);
	    
	}
}

class ClientMsgSender extends ClientMsgReceiver {
	    Vector<ClientMsgSender> clients = new Vector<ClientMsgSender>();
	    List<Message> messageVector = new ArrayList<Message>();
	    
	    @Override
	    public void receiveMESSAGE(Socket clientSocket, String message) {
	      messageVector.add(new ServerMessage(new Message(message)));
	    }
	
	    synchronized void add(Object message) {
			messageVector.add((Message)message);
		}
	}

class ServerMessage {
	final Message m;
	
	public ServerMessage(Message msg) {
		m = msg;
	}
	
	@Override
    public String toString() {
		return "{ message: "+ m.getMessage()+" }";
	}
}

