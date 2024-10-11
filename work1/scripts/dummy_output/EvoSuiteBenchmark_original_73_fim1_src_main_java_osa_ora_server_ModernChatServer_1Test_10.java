// ModernChatServer_1Test.java
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
* It contains one unit test case for the {@link ModernChatServer#ping()} method.
*/
class ModernChatServer_1Test {
		
	/**
	* Unit test for ping().
	*/
	@Test
    public void testPing() throws Exception{
		
		// instantiate the server
		new MyServer();
		
		// connect to the server
		try {
			MyServer.conn.connect(new String[] {"localhost", 1234, "password"});
		} catch (Exception ex) {
			// if the connection failed, print out the exception
			System.err.println(StringEncrypter.encode(ex.getMessage(), "UTF-8"));
			return;
		}
		
		// get the new connection 
		MyServer.conn.receive(new BinaryMessage(null, null));
		MyServer.conn.receive(new BinaryMessage(null, null));
		
		// if not there anymore, set the connection as null
		MyServer.conn.receive(new BinaryMessage(null, null));
	}

}

/**
* Main test class for the server class.
* Contains one test case for the {@link UnicastRemoteObject#recreate()} method
*/
class UnicastRemoteObject_1Test extends UnicastRemoteObject implements Runnable {

	/**
	 * Constructor.
	 */
	public UnicastRemoteObject_1Test() {
		// Create an instance of the UnicastRemoteObject class 
		super();
	}

	/**
	 * method to create a new UnicastRemoteObject, after the connection has been made by the remote client.
	 * @throws RemoteException
	 */
    @Override
	public void run() throws RemoteException {

		// create a new UnicastRemoteObject, which can accept multiple clients
		MyServer.createUnicastRemoteObject();
		
		// set the remote reference of an object to be used by the UnicastRemoteObject.receive(BinaryMessage),
		// which allows you to receive the message.
		System.out.println("remote reference: "+MyServer.conn.getRemoteRef());
		
		// the send message method of the UnicastRemoteObject receives the BinaryMessage object.
		MyServer.conn.receive(new BinaryMessage(null, null));
		// the receive method of the UnicastRemoteObject receieves the BinaryMessage object.
		System.out.println("receive: "+MyServer.conn.receive(new BinaryMessage(null, null)));
	}

}

/**
* Main test class for the myserver interface.
* Contains only one test case for the {@link UnicastRemoteObject#recreate()} method.
*/
class MyServer {

	/**
	 * creates an instance of the the myserver class.
	 */
	static MyServer instance;
	
	// creates the UnicastRemoteObject object that allows
	// the UnicastRemoteObject.receive(BinaryMessage) method to receives the message.
	private UnicastRemoteObject conn;
	
	// initializes the UnicastRemoteObject object
	private void initializeUnicastRemoteObject() throws RemoteException {
		// create the UnicastRemoteObject object
		try {
			System.out.println("Calling UnicastRemoteObject.receive");
			conn = new UnicastRemoteObject(new MyServer_1Test());
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
			ex.printStackTrace();
			System.exit(1);
		}
	}

	/**
	 * main method of the myserver class.
	 * It launches the UnicastRemoteObject created in the initializeUnicastRemoteObject method.
	 * After that the UnicastRemoteObject is created with the remote object and starts to receive events in the UnicastRemoteObject.receive(BinaryMessage) method.
	 * @throws java.rmi.RemoteException is any exception occurred
	 */
	@Override
	public void run() throws RemoteException {
		
		System.out.println("MyServer is started...");
		// call unicast re-connected method of the UnicastRemoteObject class.
}
}