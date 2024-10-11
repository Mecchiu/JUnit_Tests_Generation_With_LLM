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
static boolean firsttime = true;
		private static final Logger log = Logger.getLogger(
                BomberClient_0Test.class.getName()
                        );

// Test Methods
    /* -----------------*/
    /**
     * Creates a fixture for this class to work in.
     */
    private BomberClient_0Test() {
        start();
        // Get a reference to the ClientMessageSender instance.
        clientSender = ClientMsgReceiver.getInstance();
// Create a list of all the messages
            Message msg = new Message();
            msg.setText("test");
        // Create a list of all the messages in this list.
            Vector<Message> msgVector = new Vector<>(1);
        msgVector.add(msg);

        // Sends the message to the sender.
        clientSender.sendMessageToSender(msgVector);
    }
// ------------------*/

/*
*   Basic constructor test.
*/
    @Test
    public void testConstructor() {
        assertNotNull("The class isn't properly created!",
                clientSender);
    }

/* -----------------*/
/*
 * Sends the message to the sender.
 */
    private void start() {
        boolean test1 = false, test2 = false;

        // Create an instance of the class defined in this test.
        BomberClient instance =getInstance();

        // Send a test to the server.
        if (test1) {

            List<BomberClient> instanceList = new ArrayList<BomberClient>();
            BomberClient client = instanceList.get(0);
            // Send the message to client.
            logger.info("Sending message in a Session");
            client.handleInfoRequest();
            logger.info("Sending message in a Map in a Session");
            client.handleJoinSessionMessage();
            logger.info("Not sending message in a Map in a Session");
            client.handleMapInfoMessage();
            logger.info("Not sending message in a Map in a Session");
            }
            if (test2) {

            // Send a second to the Server
            List<BomberClient> instanceList = new ArrayList<BomberClient>();
            BomberClient client = instanceList.get(0);
            // Send the message to client.
            logger.info("Sending message in a session 0");
            client.handleMapInfoMessage();
            logger.info("Not sending message in a session 0");
            }
            }
        }
}

