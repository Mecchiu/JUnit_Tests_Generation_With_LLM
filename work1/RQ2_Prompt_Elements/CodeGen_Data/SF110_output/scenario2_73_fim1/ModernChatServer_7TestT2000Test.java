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
    public ResultBean sendSecureBinaryMessage(BinaryMessage msg) throws RemoteException {
        ClientInterface cf = connectedClients.get(msg.getToUserId());
        if (cf == null) {
            return new ResultBean(false, IConstant.OFFLINE, null);
        } else {
            try {
                //online message, send it..
                if (msg.getAction() == IConstant.REQUEST) {
                    getLogger().log(Level.FINE, "Request send");
                    return cf.receiveSecureBinaryMessageRequest(msg);
                } else {
                    getLogger().log(Level.FINE, "Online BinaryMessage size=" + msg.getData().length + " From=" + msg.getFromUserId() + " To=" + msg.getToUserId());
                    cf.receiveSecureBinaryMessageLoad(msg);
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
     * Test Method for {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
     */
    @Test
    void testSecureBinaryMessage()
    {
        try {
            // Get the password of the connected client
            ClientInterface cf = connectedClients.get(MyConstant.USER_ID);

            // get the current time and the calendar using the registry
            Calendar c = Calendar.getInstance();
            Enumeration names = Registry.list();
            String name = null;
            String time = null;
            while (names.hasMoreElements()) {
                name = (String)names.nextElement();
                // we cannot use getTime() since in java8, Calendar is an Enumeration, and java8 will throw an
                // UnsupportedOperationException.
                c.set(Calendar.MILLISECOND, 0);
                Calendar currentTime = Calendar.getInstance(c);
                time = currentTime.toString();
            }

            // get the users
            UsersBD usersBD = new UsersBD();
            Vector<String> usersList = usersBD.getUserIDsList(name, name, time);
            System.out.println("The users="+usersList);
            String usersPassword = usersBD.getUserPassword(usersList.get(0));
            String usersPasswordDecrypted;

            // Test the method, when userId is empty
            ClientInterface cf1 = null;
            for (int i=0; i<5; i++)
            {
                // get the password with the same to userId
                usersPassword = UserPasswordClient.getPassword(MyConstant.USER_ID, name, time);
                System.out.println("Current Server setting - " + UsersSettingClient.getServerSetting()
                        + "\tPassword: " + usersPassword);

                // if the to userId is empty or is the same
                // to userId, we send a secure Binary Message, so the same Password will be used
                if (cf == null && usersList.get(0).equals(""))
                {
                    cf1 = new ClientInterface();

                    String encodedPassword = StringEncrypter.encrypt("1234567", usersPassword);
                    cf1.setPassword(encodedPassword);
                    cf1.setId(0);
                    cf1.