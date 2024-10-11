// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
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
     * Send text message but securly (i.e. encrypted)
     *
     * @param msg : the message to be send
     * @return boolean : true/false if the text message send or not.
     * @throws RemoteException
     */
    public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException;
}

// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
		
	static final BinaryMessage[] bin = new BinaryMessage[1024];
	static final Group[]  group = new Group[1024];
	static final User[]   usergroup = new User[1024];
	static final Room[]   room = new Room[1024];
	static {
		for (int i = 0; i < 1024; i++) {
			BinaryMessage msg = new BinaryMessage(i);
			bin[i] = msg;
		}
		for (int i = 0; i < 1024; i++) {
			Group g = new Group();
			group[i] = g;
			g.setName("testgroup" + i);
			g.setColor(i % 256);
		}
		for (int i = 0; i < 1024; i++) {
			User u = new User();
			usergroup[i] = u;
			u.setName("testuser" + i);
			u.setEmail("testuser"+i);
			u.setServerID(i);
			u.setServer(i % 2);
			u.setGroup(null);
			u.setLastLoginTimestamp(Calendar.getInstance().getTime());
			u.setLastLogoutTimestamp(Calendar.getInstance().getTime());
		}
		for (int i = 0; i < 1024; i++) {
			room[i] = new Room();
			room[i].setColor(i % 256);
		}
	}

    @Test
    public void testExec() throws Exception {
    	ServerSettingBean setting = new ServerSettingBean();
    	setting.setBinaryEncryption(Integer.toString(setting.getBinaryEncryption() & 0101));
    	setting.setConsoleEncryption(Integer.toString(setting.getConsoleEncryption() & 0101));
    	setting.setEncryptionType(Integer.toString(setting.getEncryptionType() & 0101));
    	setting.setEncryptionEnabled(Boolean.toString(setting.getEncryptionEnabled() & 010));
    	setting.setEncryptionPassWords(Boolean.toString(setting.getEncryptionPassWords() & 011));
    	setting.setEncryptionMinLetters(Integer.toString(setting.getEncryptionMinLetters() & 010));
    	setting.setEncryptionMaxLetters(Integer.toString(setting.getEncryptionMaxLetters() & 010));
    	setting.setEncryptionMaxChars(Integer.toString(setting.getEncryptionMaxChars() & 010));
    	setting.setEncryptionPassWords(Integer.toString(setting.getEncryptionPassWords() & 010));
    	setting.setEncryptionLevel(Integer.toString(setting.getEncryptionLevel() & 010));
    	setting.setEncoding(Integer.toString(setting.getEncoding() & 010));

    	Registry reg = LocateRegistry.getRegistry();
    	LocateRegistry.getRegistry();
    	Object session = Naming.lookup("/localhost:7474");
    	User.loginByLogin("tester", Integer.toString(setting.getServerID()), "tester"+Integer.toString(setting.getServerID() & 0001), false, setting.getPassword(), setting.getEncryptionType(), setting.getEncryptionType(), setting.getServerID() & 0001, setting.getConsoleEncryption());
    	Hashtable<String, String> table = new Hashtable<String, String>();
    	table.put("", "N/A");
    	table.put("PASSWORD", setting.getPassword());
    	table = new Hashtable<String, String>();
    	table.put("SERVER