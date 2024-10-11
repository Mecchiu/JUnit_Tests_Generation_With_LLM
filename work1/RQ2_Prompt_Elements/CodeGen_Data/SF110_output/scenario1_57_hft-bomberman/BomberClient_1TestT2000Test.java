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

    // Test data.
    // Each message is sent and sent to all clients in {@link client.Network#SOCKET Server}
    public final List<Message> data = new Vector<>();

    // Number of clients is set before the connection is established.
    public int countSender, countReceiver;

    private final static Logger logger = Logger.getLogger(BomberClient.class.getName());

    // The default constructor receives one message, one client.
    public BomberClient(String... nw) throws IOException {
        int i = 0;
    	for(String id : nw) {
    		Message m = new Message(id, -1, -1);
    		data.add(m);
    	}
    	countSender = data.size();
    	countReceiver = data.size();
    }

    @Test
    public void testReceivedOneMessage() throws IOException {
        ClientMsgReceiver r = new ClientMsgReceiver(server, this);
        ClientMsgSender s = new ClientMsgSender(server);
        s.start();
        s.waitForMessagesReceived();
        r.waitForMessage(countSender);
        r.waitForMessage(countReceiver);
        System.out.println("Sender: " + s.msgSender.getId() + "; Receiver: " + r.msgReceiver.getId());
        Message m = s.getLast();
        assert(m!= null);
        assert(countSender == 1);
        assert(countReceiver == 1);
        assert(s.msgReceiver.msgs.size() == 1);
        assert(s.msgReceiver.msgs.peek().getMsg()!= null);
        assert(s.msgSender!= null);
        assert(m.getMsg()!= null);
    }

    static class Listener implements ClientReceiver.ClientReceiverCallback {
    	
    	List<Message> msgs;
    	@Override
    	public void callback(ClientReceiver cb) {
    		msgs = cb.msgs;
    	}
    }

    // Method to test client.Network.SOCKET.newListener
    public void notifyListener(Socket s) {
    	synchronized(msgs) {
    		msgs.add(0, s);
    	}
    }

    // Unit test for {@linkplain ClientMsgSender#waitForMessage()} method.
    public void waitForMsgSend() throws IOException {
        // Wait until {@link Message#getMsg()} is set.
        Message m = ServerSocketFactory.get(server, port).getMessage();
        List<Message> msgs = ServerSocketFactory.pollAndWaitForMessages(server, 1000, new Listener());
        if (msgs == null) {
            //no messages received
            return;
        }
        System.out.println("Server: " + m.getServer()
                            + "; Port: " + port
                            + "; Msg: " + msgs.get(msgSender.msgSender.getId()));
        assert(m.getMsg()!= null);
    }
    
    @Test
    public void testReceivedJoinSession() {
    	// Connect to the server.
    	logger.info("Connecting to " + serverName, this);

    	// Create server socket.
    	Socket s = new Socket(serverName, serverPort);
        List<Message> msgs = new Vector<>();
        msgs.add(new SessionDetailsMsg(1, 11, "", 0, new HashMap<>()));
        msgs.add(new SessionDetailsMsg(1, 11, "", 1, new HashMap<>()));
        ClientMsgSender s = new ClientMsgSender(sock, this, msgs);
        s.waitForConnected();

        // Send one message.
        logger.info("Waiting for connection...");
        s.sendMsg(new JoinSessionMsg(1, 0, "", 1, new HashMap<>()));
        s.sendMsg(new JoinSessionMsg(1, 0, "", 2, new HashMap<>()));
        s.sendMsg(new JoinSessionMsg(1, 0, "", 3, new HashMap<>()));

        logger.info("Sent one, received " + s.msgSender.getId() + " received " + s.msgReceiver.getId());

        // Wait for the sent messages to be received.
        msgs = ServerSocketFactory.pollAndWaitForMessages(sock, 1000, new Listener());
        logger.info("Received msgs: " + msgs);
        assert(2 == msgs.size());
    }

    @Test
    public void testConnectAndSendJoinSession() throws IOException {
    	ServerSocket s = new ServerSocket(port, 10, host);
        logger.info("Server starting listening on " + port);
    	List<Message> msgs = new Vector<>();

    	MsgReceiver r = new MsgReceiver(new StartFrame(), this);
        ClientMsgSender c = new ClientMsgSender(sock, this);
    	c.start();
        r.waitForStart();
        msgs.add(r.msgReceiver.msgs.peek());
        logger.info(r.msgReceiver.msgs.peek().getServer());
        c.conn.connectToServer();
    	while (true) {
    		if (1 == countSender) {
    			if (sendJoinSession(c, r)) {
    				break;
    			}
    		}
    		MsgsTo