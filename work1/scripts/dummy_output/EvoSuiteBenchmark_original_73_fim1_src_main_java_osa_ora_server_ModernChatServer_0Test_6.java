// ModernChatServer_0Test.java
package osa.ora.server;

import java.net.URISyntaxException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import javax.swing.JOptionPane;
import osa.ora.server.bd.UsersBD;
import osa.ora.server.beans.BinaryMessage;
import osa.ora.server.beans.Group;
import osa.ora.server.beans.IConstant;
import osa.ora.server.beans.LoginBean;
import osa.ora.server.beans.ResultBean;
import osa.ora.server.beans.Room;
import osa.ora.server.beans.ServerSettingBean;
import osa.ora.server.beans.TextMessage;
import osa.ora.server.beans.User;
import osa.ora.server.client.ClientInterface;
import osa.ora.server.threads.SendKickOffByLoginMessageThread;
import osa.ora.server.threads.SendKickOffMessageThread;
import osa.ora.server.threads.SendRefreshContactThread;
import osa.ora.server.threads.SendUserUpdatedStatusThread;
import osa.ora.server.utils.StringEncoder64;
import osa.ora.server.utils.StringEncrypter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModernChatServer}.
* It contains one unit test case for the {@link ModernChatServer#getLogger()} method.
*/
class ModernChatServer_0Test {
		
    static Logger LOGGER;
    static UsersBD _usersBD;
    static ClientInterface _networkClient;
    static ClientInterface _serverClient;
    static UsersBD _usersBD;
    static ClientInterface _networkClient;

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
        		MainWindow.main();
        } else {
        		MainWindow.main(args);
        }
    }
    public static void main(String[] args) throws Exception {
        _usersBD = new UsersBD(null);
        _networkClient = new ClientInterface();
        _serverClient = new ClientInterface();
        _usersBD.open();

        LOGGER = Logger.getLogger("Test");
    }

    @Test public void basicOperation() throws Exception {

        SendRefreshContactThread runThread = new SendRefreshContactThread(
                _networkClient, "127.0.0.1",
                _usersBD.users, "1");

        new Thread(runThread).start();

        UsersBD.join();

        _networkClient.login("pandhi", "pandhi");

        assertTrue(!runThread.isAlive());

        Thread.sleep(2000);

        assertNotNull(runThread.sT);

        Thread.sleep(1000);

        assertNotNull(runThread.sT);

        assertNotNull(runThread.sT);

    }
    
}

class TestRunnable implements Runnable {
	
	private boolean alive = true;
	private String sT;
	
	public Thread t;

	public TestRunnable(String sT) {
		this.sT = sT;
	}

	@Override
	public void run() {
		try {
			System.out.println(sT);
		} catch (Throwable t) {
			unsupportedOperation("Run() is not supported");
		}	
	}
	
	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public String getS() {
		return sT;
	}
	
	public void unsetS() {
		sT = null;
	}
}


class Client extends UnicastRemoteObject implements ClientInterface {
    JOptionPane runServer;
	public Client() throws RemoteException {
		super();
	}

	public void run() {
		runServer = new JOptionPane();
	}

	public void print() {
		runServer.showMessage("");
	}

	public void println(String s) {
	   runServer.showMessage(s);
	}
	
	public void sendMessage(BinaryMessage binary) throws RemoteException {
		runServer.showMessage("sendMessage(" +
				StringEncrypter.encrypt(binary.getMessage(), _sEncryptKey) + ")");
	}

	public void sendMessageToArray(BinaryMessage binary, Object[] anArray)
							throws RemoteException {
        runServer.showMessage("sendMessageToArray(" + StringEncrypter.encrypt(binary.getMessage(), _sEncryptKey) + ", " + anArray.length + ")");
	}

	public void sendRefreshContactToArray() throws RemoteException {
		runServer.showMessage("sendRefreshContactToArray()");
	}

	public void sendGroup(Group group) throws RemoteException {
		runServer.showMessage("sendGroup(" + group.name + ")");
	}

	public void sendRoom(Room room) throws RemoteException {
		runServer.showMessage("sendRoom(" + room.name + ")");
	}

	public void sendRoomForGroup(Group group) throws RemoteException {
		runServer.showMessage("sendRoomForGroup(" + room.name + ", " + group.name + ")");
	}

}