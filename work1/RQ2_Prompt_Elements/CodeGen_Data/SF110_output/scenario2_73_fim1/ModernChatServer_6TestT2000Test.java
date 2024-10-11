// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
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
     * Send Binary message (files)
     *
     * @param msg : the message to be send
     * @return ResultBean include the status of message send or not.
     * @throws RemoteException
     */
    public ResultBean sendBinaryMessage(BinaryMessage msg) throws RemoteException {
        ClientInterface cf = connectedClients.get(msg.getToUserId());
        if (cf == null) {
            return new ResultBean(false, IConstant.OFFLINE, null);
        } else {
            try {
                //online message, send it..
                if (msg.getAction() == IConstant.REQUEST) {
                    getLogger().log(Level.FINE, "Request send");
                    return cf.receiveBinaryMessageRequest(msg);
                } else {
                    getLogger().log(Level.FINE, "Online BinaryMessage size=" + msg.getData().length + " From=" + msg.getFromUserId() + " To=" + msg.getToUserId());
                    cf.receiveBinaryMessageLoad(msg);
                    return new ResultBean(true, IConstant.SUCCESS, null);
                }
            } catch (RemoteException ex) {
                try {
                    getLogger().log(Level.FINE, "Exception happen, will logoff this user");
                    connectedClients.remove(msg.getToUserId());
                    connectedClientsIPs.remove(msg.getToUserId());
                    offlineStatus(msg.getToUserId());
                } catch (RemoteException ex1) {
                }
                return new ResultBean(false, IConstant.EXCEPTION, ex.getMessage());
            }
        }
    }
}

// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
		
	public static final String LOGIN_USER = "test";
    static final String USER = "user";
    static final String ROOM = "room";
    private static final int TIMEOUT_SECOND = 30;
    private final DateFormat dateFormat = new SimpleFormatter(new StringEncrypter());
	
	private UsersBD userRepository = new UsersBD();
	private ClientInterface clientInterface = new ClientInterface();
	private ClientInterface clientInterfaceIP = new ClientInterface();
	private ServerSettingBean serverSetting;
	private Room room;
	
	@Test
	public void test() {
		ClientInterface cf = clientInterface;
		clientInterfaceIP = clientInterfaceIP;
        try {
            serverSetting = Naming.lookup(
                    "rmi://localhost:" + cf.getRMIPort() + "/server/user/"
                    + cf.getServerSettingBean().getServerSetting().getServerName()
                    + "/"
                    + cf.getClientSettingBean().getSetting());
        } catch (Exception ex) {
            System.err.println("Server setting could not be found...\n");
        }
        
		Hashtable<String, User> usersHash;
		usersHash = new Hashtable<String, User>(5);
		try {
			usersHash.put(USER, new User(USER));
			usersHash.put(ROOM, new Room(ROOM, USER, new Date()));
		} catch (RemoteException ex) {
			System.err.println("user has not been added to table ");
		}
        userRepository = new UsersBD(usersHash);
		
		try {
			String[] groupData;
            groupData = "groupData".toCharArray();
	        groupData[2] = "";
	        groupData[3] = "User";
            groupData[4] = "User";
	        groupData[5] = "User";
	        groupData[6] = "User";
	        
            Enumeration<String> groups = userRepository.enumerateGroups();
	        while (groups.hasMoreElements()) {
	            String groupName = groups.nextElement();
	            Vector<String> groupData2 = new Vector<String>();
	            String groupType = groupRepository.getGroupType(groupName);
	            groupData2.