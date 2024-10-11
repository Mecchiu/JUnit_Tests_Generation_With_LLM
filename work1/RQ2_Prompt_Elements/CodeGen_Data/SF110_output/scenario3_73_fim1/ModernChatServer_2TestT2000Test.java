// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
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
     * Method to sing in..
     *
     * @param cf : user client interface to communicate with the client
     * @param emailAddr : user email
     * @param password : user password
     * @param ipAddress : user ip address
     * @return User object if authentication correctly, or null if not exist.
     * @throws RemoteException
     */
    public LoginBean signIn(ClientInterface cf, String emailAddr, String password, String ipAddress) throws RemoteException;
}

// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
		
    /**
     * Test method.
     * It sets up logging, environment, RMI and JMX interfaces to be used by the test.
     */
    @Test
    public void testStartServer() throws ServerSetupLog, ClientSetupLog {
        ServerSetupLog serverSetupLog = new ServerSetupLog("RMI", "Test");
    	ClientSetupLog clientSetupLog = new ClientSetupLog("RMI", "Test");
    	serverSetupLog.start();
    	System.out.println(serverSetupLog.getLogMsg());
        Registry reg = LocateRegistry.getRegistry();
        int timeout = 100;
        try {
            reg.rebind( "RegUserMux", this );
        } catch (RemoteException e) {
            e.printStackTrace();
            timeout = Integer.parseInt( e.getMessage() );
        }
        while (System.currentTimeMillis() < (timeout + Calendar.getInstance().getTimeInMillis())) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {Thread.currentThread().interrupt();}
        }
        serverSetupLog.stop();
        System.out.println(clientSetupLog.getLogMsg());
        clientSetupLog.stop();
    }
    
    @Test
    public void testSignIn() throws Exception {
        int numRooms = 1;
        int numUserGroups = 4;
        String strAddr = "RegUserMuxAddress";
        int numThreads = 2;
        String userName2 = "NewUserName";
        String password2 = "NewPass";
        String addr2 = "MyAddress2";
        String hostAddr = "MyAddress1";
        ServerSettingBean setting = new ServerSettingBean();
        setting.setUsers("name" + userName2 +
                "," + "password" + password2 +
                "," + "groups" + numUserGroups +
                "," + "addresses" + addr2 +
                "," + "hostAddr" + hostAddr +
                "," + "port" + 12345 + "," +
        		   setting.getDebug());
        setting.setRoom(2);
        setting.setHostAddr(addr2);
        setting.setPort(12345);
        setting.setName(UserServer.NAME);
        setting.setPassword(setting.getPassword());
        setting.setUserGroup(("group" + numUserGroups).toUpperCase());
        setting.setUserAddress(("address" + addr2).toUpperCase());
        setting.setServerEnabled(setting.getDebug());
        setting.setDebug(false);
        setting.setAdminPassword(setting.getAdminPassword());
        setting.setAdminIPv4(setting.getAdminIPv4());
        setting.setAdminIDv4(setting.getAdminIDv4());
        setting.setAdminPassword(setting.getAdminPassword());
        setting.setAdminClientEnable(setting.getDebug());
        setting.setAdminClientIPv4(setting.getAdminClientIPv4());
        setting.setServerIPv4(setting.getServerIPv4());
        setting.setLoggedInServer(null);
        setting.setLoggedInServerIpv4(setting.getServerIPv4());
        setting.setServerPort(setting.getPort());
        setting.setServerName("Server");
        setting.setLoggedInServerPassword(setting.getLoggedInServerPassword());
        setting.setTimeOut(setting.getDebug());
        ServerSetupLog serverSetup