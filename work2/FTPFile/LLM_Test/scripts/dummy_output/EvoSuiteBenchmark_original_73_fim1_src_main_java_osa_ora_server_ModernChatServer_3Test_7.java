// ModernChatServer_3Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changePassword(String, String, String)} method.
*/
class ModernChatServer_3Test {
		
	/**
	 * @see Runnable
	 * */
	@Test
	public void testPingUser() {
        runPingThread();
	}

	/**
     * Server needs to be started using its parameters.
     * */
    private void startUp() {
        System.out.println("Starting RemoteObject's server");
        
        try {

            boolean running = Runnable.EXECUTE_WAIT_FOR_STARTING_CLIENT;
        if (running) {
            startServerAsync();
        }
        System.out.println("Successfully started server");
        } catch (Exception e) {
            System.out.println("Could not start server. Error: " + e);
        //e.printStackTrace();
            startServer();
        }
    }

	@Test
	public void testStartServer() {
        startUp();
    }
	
    /**
     * test thread started using {@link Runnable#start()} has to be completed, this is why the test starts as a separate thread.
     * */
    private void runPingThread() {
        try {
        for (int i = 0; i < 10; i++) {
            ServerSettingBean sb = new ServerSettingBean();
            sb.newServer = new StringEncoder64();
            ServerSettingBean.newServer = sb;
            runPingThreadAsync(i);
        }
    } catch (Exception err) {
       assertEquals(NullPointerException.class, err.getClass());
       //Error during runPingThread
       //System.out.println("Error happened during runPingThread");
    }
    }
    
    @Test
    public void testStartServerAsync() {
        try {
            StartServerAsync async = new StartServerAsync();

            //Run thread
            ServerInterface threadServer = runPingThreadAsync(0);
            ServerInterface threadAsync = runPingThreadAsync(1);
            Thread.sleep(3);//Wait until the asynchronous threads are started up
            try {
                Thread.sleep(2000);//Wait until the thread is started up
            } catch(java.lang.InterruptedException e) {
                //Ignore Exception
            }
            runPingThreadAsync(2);
            //Wait for async thread to finish
            threadAsync.setResult(new ResultBean(true));//send back result
            System.out.println("After startServer");
            
            ServerSettingBean sb = new ServerSettingBean();
            sb.newServer = new StringEncoder64();
            ServerSettingBean.newServer = sb;
            Thread.sleep(250);//Wait until Thread is started up
		runPingThreadAsync(6);
        } catch (Exception e) {
            System.out.println("runPingThreadAsync got error. Error: " + e);
        }
    }
    
    /** Runnable. */
    public static class StartServerAsync extends UnicastRemoteObject implements Runnable {

	
		
}
}