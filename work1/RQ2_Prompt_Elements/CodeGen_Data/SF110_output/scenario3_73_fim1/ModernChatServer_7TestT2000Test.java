// ModernChatServer_7Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {
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
     * Send Binary message (files) but secure (files not secure)
     *
     * @param msg : the message to be send
     * @return ResultBean include the status of message send or not.
     * @throws RemoteException
     */
    public ResultBean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException;
}

// ModernChatServer_7Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {
		
    /**
     * The {@link User} who will be used in this unit test.
     */
    private User user; 

    /** The main application container for this unit test. */
    private MainContainer mainContainer;

    /** Instance of {@link MainContainer} */
    private MainContainer _container;
    
    /** Instance of the {@link UsersBD}: It stores all users but just the one that be used the second time it's run (in the testing suite). */
    private UsersBD usersBD;
    
//    /**
//     * Instance of {@link ClientInterface}. One client is used both as an example server and as an example proxy (Proxy).
//     */
//    private ClientInterface clientInterface = ClientInterface.createLocal();
//    /** Instance of {@link ServerSettingBean} */
//    private ServerSettingBean serverSettings = ServerSettingBean.createLocal();

    /**
     * An example remote object of {@link User}.
     */
    private UnicastRemoteObject remoteObject;
	
    /**
     *  A remote object of the Admin Interface Remotely.
     */
    private UnicastRemoteObject adminRemoteObject;

    /**
     * Starts the server.
     * @throws Exception Throw if any error in starting the server.
     */
    @Test
    public void StartServer() throws Exception {
	System.out.println("Starting the Servers.");
	Registry registry = LocateRegistry.getRegistry("localhost", 0);
	UsersBD usersBD = UsersBD.createRemoteObject(registry);
	ClientInterface clientInterface = ClientInterface.createRemoteObject(registry);
        System.out.println("Instance of ClientInterface is created." );
	
	StringEncoder64 text = new StringEncoder64(20);
        ServerSettingBean settingBean = ServerSettingBean.createLocal();
	settingBean.setName("SettingBean");
        settingBean.setServer("Modern Chat Server");
	settingBean.setDefaultPassword("1234");
	settingBean.setVersion("1.9");
	SettingBean settingBean2 = ServerSettingBean.createLocal();
	settingBean2.setName("SettingBean");
        settingBean2.setServer("Default");
	settingBean2.setDefaultPassword("6");
	settingBean2.setVersion("2");
	settingBean2.setClient(clientInterface);
	settingBean2.setUsersList(user = UsersBD.createLocal());
	
	ServerSettingBean settingBean3 = ServerSettingBean.createRemote();
	settingBean3.setName("SettingBean");
        settingBean3.setServer("Server");
     //  settingBean3.setDefaultPassword("5");
        settingBean3.setVersion("1.8");
        settingBean3.setUsersList(user = UsersBD.createLocal());
        
        SettingBean settingBean4 = ServerSettingBean.createLocal();
	settingBean4.setName("SettingBean");
        settingBean4.setServer("Server");
	settingBean4.setDefaultPassword("6");
	settingBean4.setVersion("2");
	SettingBean settingBean5 = ServerSettingBean.createLocal();
	settingBean5.setName("SettingBean");
		
	settingBean3.setUsersList(user = UsersBD.createLocal());
	settingBean4.setUsersList(user = UsersBD.createLocal());
	settingBean5.setUsersList(user = UsersBD.createLocal());

        UsersBD.setupNewConfiguration(usersBD, settingBean2, settingBean3, settingBean5);
