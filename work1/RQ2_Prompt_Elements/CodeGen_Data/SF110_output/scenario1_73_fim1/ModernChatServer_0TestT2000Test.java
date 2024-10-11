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

    public static Logger getLogger() {
        return logger;
    }
}

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
		
    protected static final Logger logger = Logger.getLogger(getBinaryMessageClass().getName());
    
    protected AdminInterface adminInterface;
    protected ClientInterface clientInterface;
    protected UnicastRemoteObject adminInterface_RemoteObject;
    protected UnicastRemoteObject clientInterface_RemoteObject;
    protected static int serverThreadCount_ = 2;
    
    protected void loginToTheServer() throws Exception {
        System.out.println("Running login");
        Object objServer = Naming.lookup("rmi:////" + "localhost" + ":" + "50051" + "/" + "server" + "?rmi/opengeo.registry");
        new Logger() {{
            setLevel(Level.FINER);
        }};
        String strObjServer = (String) objServer;
        System.out.println("Test running from server");
        System.setProperty("javax.net.ssl.trustStore", "/opt/myserver/myclient");
        System.setProperty("javax.net.ssl.trustStorePassword", "store");
        System.setProperty("javax.net.ssl.trustStoreType", "JKS");
        System.setProperty("javax.net.ssl.trustStorePassword", "_");
        
        if (!StringEncoder64.isEncoding(strObjServer)) {
            throw new RuntimeException("The server must have an encoding, no decoding");
        }
        
        System.out.println("Connecting to the server....");
        adminInterface = new AdminInterface();
        clientInterface = new ClientInterface();
        
        adminInterface.attachInterface(adminInterface_RemoteObject);
        clientInterface.attachInterface(clientInterface_RemoteObject);
    }
    
    /**
     * Test of execute method, of class osa.ora.server.admin.AdminInterface.
     */
    @Test
    public void test_execute_ShouldSendMessageIfMessageIsSent() throws Exception {
    	System.out.println("TEST: execute, message is transmitted");
        try {
            for (int i = 0; i < serverThreadCount_; ++i) {
                new SendRefreshContactThread().start();
            }
            Object objNewLoginBean = new LoginBean();
            adminInterface.setNewLoginBean(objNewLoginBean);
            adminInterface.setLoginTime(Calendar.getInstance());
            Object objSendRefreshContactThread = sendRefreshContactMessage();
            new SendRefreshContactThread().start();
            sendRefreshContactMessage(objNewLoginBean);
            new SendUserUpdatedStatusThread().start();
            sendUserUpdatedStatusMessage(objNewLoginBean);
            System.out.println("TEST: test has ended");
            for (int i = 0; i < serverThreadCount_; ++i) {
                new SendUserUpdatedStatusThread().start();
            }
            sendUserUpdatedStatusMessage(objNewLoginBean);
            Object objSendKickOffByLoginMessageThread = sendKickOffByLoginMessage();
            new SendKickOffByLoginMessageThread().start();
            sendKickOffByLoginMessageMessage(objNewLoginBean);
            new SendKickOffMessageThread().start();
            sendKickOffByLoginMessageMessage(objNewLoginBean);
        } catch (Exception e) {
            e.printStackTrace();
	    }
    }
    
	/**
	 * Test of getNewUsesThreadCount method, of class osa.ora.server.ClientInterface.
	 */
	@Test
    public void test_ShouldGetTheThreadsCountForLogin() throws Exception {
        System.out.println("Test of the class '{}' that extends '{}'.", new Object[] { ClientInterface.class, 
            NormalChatServer.class });
    	Object objNewLoginBean = new LoginBean();
    	ClientInterface cmdNewLogin = new ClientInterface();
    	System.out.println("TEST:  the method should return a new instance with login thread ");
        cmdNewLogin