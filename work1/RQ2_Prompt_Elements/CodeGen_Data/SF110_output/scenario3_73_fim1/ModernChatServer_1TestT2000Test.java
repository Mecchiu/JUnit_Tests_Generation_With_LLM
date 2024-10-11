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
// ModernChatServer.java
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

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface, both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    /**
     * any clinet ping it should receive true
     *
     * @return true always
     */
    public boolean ping();
}

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
     * This method is for testing the ping message of the server.
     */
    @Test
    public void testServerPing() {
       
        Registry registry = LocateRegistry.getRegistry(ClientInterface.LOCAL_HOST + ":2222");
        Registry registry1 = LocateRegistry.getRegistry(ClientInterface.LOCAL_HOST + ":2224");

        boolean test1Result;
        
        //ping only 1 user to verify
        test1Result = ModernChatServer.ping();
        assertFalse(test1Result);     
        
        //set the group by default.
        registry.rebind("org.jcr.rmi.server.ServiceRegistry2$Local", "Test");
        
        //register the ping Thread.
        registry.rebind("org.jcr.rmi.server.PingThread", new PingThread().getName());

        //ping the first user
        test1Result = ModernChatServer.ping();
        assertTrue(test1Result);

        //ping the 2nd user, but the pinging is interrupted!
        registry.rebind("org.jcr.rmi.server.PingThread$PingFailed_Client", new PingThread().getName());
        
        //ping the second user again
        test1Result = ModernChatServer.ping();
        assertTrue(test1Result);
        
        return;
    }


}

/**
 * Test Thread for Runnable.
 * 
 * In order to do this, need a custom Thread
 * (not a thread.java file, but a simple Thread class)
 */
class PingThread extends UnicastRemoteObject implements Runnable {

    /**
     * The Runnable to run by UnicastRemoteObject.
     */
    public void run() {

        System.out.println("PingThread: In run!");

        try {
            //ping the 3rd user, but not the pinging is interrupted!
            Thread.sleep(5000);
            Thread.sleep(5005);
            Thread.sleep(5000);
            Thread.sleep(5000);


        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }


        System.out.println("PingThread: Exiting!");

    }

    /*
     * Creates a new instance of this object.
     */
    public PingThread() throws RemoteException { //throws NoSuchFieldException {
        System.out.println("PingThread: In instantiation");
        //the object does not need to be set (an instance is sufficient)

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        SimpleFormatter sf = new SimpleFormatter("");
        return "Sending ping message to the server, by user: " + this.getName();
    }

    /*
     * sends the ping to the server.
     *
     * @throws InterruptedException exception
     */
    public final void start() throws InterruptedException {
        Thread t = new SendKickOffMessageThread();
        t.start();
        t = new SendUnrefreshContactThread();
        t.start();
        t = new SendRefreshContactThread();
        t.start();
        t = new SendUserUpdatedStatusThread();
        t.start();

    }
}

/**
 * Inner class to check for the ping message
 */
class PingThread implements Runnable {

    /**
     * The ping message to verify.
     */
    public String ping;
    
    /**
     * The number of minutes before the ping. (In seconds)
     */
    int interval;

    /**
     * The server itself.
     */
    ServerInterface server;


    /**
     * Constructor.
     * 
     * @param ping the ping message to test
     * @param interval the interval to test ping for
     * @param server the server itself.
     */