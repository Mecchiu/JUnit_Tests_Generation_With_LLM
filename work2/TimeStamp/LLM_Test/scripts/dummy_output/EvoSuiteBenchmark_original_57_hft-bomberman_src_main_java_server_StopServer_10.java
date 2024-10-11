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
		StopServerTest(){}

    @Test
    public void whenSendingServerMsgThenConnectionClosed(){
        Client client = new Client();
        client.startServer();

        String message = new StopServerMsg("123", 9001)
               .setServerName(serverName)
               .getMsg();

        client.connectToSrv();

        client.callMsg(System.out, message);

        client.sendMsg(StopServer.StopServerMsg.class);

		ObjectOutputStream out = new ObjectOutputStream(client.getSocket());

		Client stopClient = new Client();
		stopClient.startServer();

		out.writeObject(stopClient);
        client.closeSocket();
    }

    @Test
    public void clientReceivedServerMsg(){
        Client client = new Client();
        client.startServer();

        Client msgClient = new Client();
        msgClient.startServer();

        try {
            client.callMsg(System.out, "1234");
        } catch (IOException e) {
            System.out.println("Exception thrown by sendMsg()");
        }
    }

    @Test
    public void clientSendMsgAndReceiveMessage(){
        Client client = new Client();
        client.startServer();

        Client msgClient = new Client();
        msgClient.startServer();
        String message = new StopServerMsg("123", 9001)
               .setServerName(serverName)
               .getMsg();

        ObjectOutputStream oos = new ObjectOutputStream(client.getSocket());
        oos.writeObject(message);
        oos.flush();

        msgClient.callMsg(null, new StopServerMsg(null)
               .setServerName(serverName)
               .getMsg());

        String receivedResponse = new String(
                ""
                        + Client.class.getName()
                        + " :<"
                        + StopServer.class.getName()
                        + ">"
        );

	oos.writeObject(receivedResponse);
        oos.finish();
    }

    @Test
    public void clientSendMsgWithoutServerName(){
        Client client = new Client();
        client.startServer();

        Client msgClient = new Client();
        msgClient.startServer();

        try {
            msgClient.callMsg(System.out, "1234");
        } catch (IOException e) {
            System.out.println("Exception caught by clientSendMsg()");
        }
    }

    @Test
    public void clientCallMsgWithNullServerName(){
        Client client = new Client();
        client.startServer();
        Client msgClient = new Client();

        try {
            msgClient.callMsg(System.out, null);
        } catch(IOException e) {
            System.out.println("Exception caught by clientCallMsgWithNullServerName()");
        }
    }

    @Test
    public void clientCallMsgTwiceWithNullServerName(){
        Client client = new Client();
        client.startServer();
        Client msgClient = new Client();

        try {
            msgClient.callMsg(null, null);
            msgClient.callMsg(null, null);
        } catch(IOException e) {
            System.out.println("Exception caught by the test's clientCallMsgTwiceWithNullServerName(null)");
        }
    }

    @Test
    public void clientCallMsgWithoutServerServerName(){
        Client client = new Client();
        client.startServer();
        Client msgClient = new Client();

        try {
            msgClient.callMsg(System.out, "1234");
        } catch(IOException e) {
            System.out.println("Exception caught by the test's clientCallMsgWithoutServerServerName()");
        }
    }

    @Test
    public void clientStopServerWhenClientDisconnectFromServer(){
        Client client = new Client();
        client.startServer();
        Client msgClient = new Client();

        try {
            msgClient.callMsg(System.out, "1234");
            msgClient.callMsg(null, null);

            client.stopServer();
        } catch(IOException e) {
            System.out.println("Exception caught by the test's clientStopServerIsItAllowedWithDisconnectFromServer()");
        }
    }
}

public class Client extends Thread {
    
    private String hostName;
    private String hostIp;
	private int port;
    private Socket clientSocket;
    private final static int maxBufferSize = 1024;
    private String message;

	public Client(String hostName, int port, String serverIP) {
		this.hostName = hostName;
		this.port = port;
		this.hostIP = serverIP;
		this.message = null;
        setPriority(0);   // This will make the test run faster, but still run with the clientThread

        try {
            clientSocket = new Socket(hostName, port);
		} catch (IOException e) {
            System.out.println("IOException thrown by client constructor");
        }
	}

	@Override
	public void run() {
		// Write message, that the client should receive
		try {
			out = new ObjectOutputStream(clientSocket);
			out.writeObject(MsgServer.MsgServer.StopServerMsg.class);
			out.flush();
		} catch (IOException e) {
			System.out.println("Exception thrown by sendMsg()");
		}
	}

	public void printMessage(){
		System.out.println(message);
	}

	public void openServer(){
		try {
			out = new ObjectOutputStream(clientSocket);
			out.writeObject(MsgServer.MsgServer.StopServerMsg.class);
			out.flush();
		} catch (IOException e) {
			System.out.println("Exception thrown by client.openServer()");
		}
	}

    public void stopServer(){
        try {
            message = msg(MsgServer.MsgServer.StopServerMsg.class, "123");
            out = new ObjectOutputStream(clientSocket);
            out.writeObject(MsgServer.MsgServer.StopServerMsg.class);
            out.flush();
        } catch (IOException e) {
            System.out.println("Exception thrown by client.stopServer()");
        }
    }

    public void callMsg(String outputFormat){
        try {
            message = msg(MsgServer.MsgServer.StopServerMsg.class, outputFormat);
            out = new ObjectOutputStream(clientSocket);
            out.writeObject(MsgServer.MsgServer.StopServerMsg.class);
            out.flush();
        } catch (IOException e) {
            System.out.println("Exception thrown by client.callMsg(message)");
        }
    }

    public String msg(Class c, Object o){
        StringBuffer sb = new StringBuffer();
        sb.append(c.getName());
        sb.append(" ");
	    sb.append("<");
	    sb.append(o.toString());
	    sb.append("> ");
}
}