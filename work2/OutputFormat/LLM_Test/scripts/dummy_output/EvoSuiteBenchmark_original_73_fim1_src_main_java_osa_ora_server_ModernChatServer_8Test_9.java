// ModernChatServer_8Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServer_8Test {
		BinaryMessage chatMsg;
        Group group;
		UsersBD usersBD;
        ClientInterface clientInterface;
         User user;
        ServerInterface serverInterface;
	
    @Test
	public void runTestRunWithDifferentGroup() {
		String group1 = "group1";
		BinaryMessage chatMsg1;
		Vector<String> groups1 = new Vector<String>();
		groups1.add("group1");
		ArrayList<String> groups2 = new ArrayList<String>();
		groups2.add("group2");
		ArrayList<String> groups3 = new ArrayList<String>();
		groups3.add("group3");
		ArrayList<String> groups4 = new ArrayList<String>();
		groups4.add("group2");
		ArrayList<String> groups5 = new ArrayList<String>();
		groups5.add("group1");
		ArrayList<String> groups6 = new ArrayList<String>();
		groups6.add("group2");
		group = new Group(groups1, groups2, groups3, groups4, groups5, groups6);
        chatMsg = new BinaryMessage();
        chatMsg = new TextMessage(chatMsg.getMsgID(),"hello world", "my server", "123 server");
        StringEncoder64.encodeToString(((BinaryMessage) chatMsg).getEncryptedChatChat().getData(), chatMsg);
        usersBD = new UsersBD(chatMsg);
        serverInterface = new ServerInterface();
        serverInterface.setConfig(new Hashtable<String, ClientInterface.config>());
        clientInterface = new ClientInterface();
        SendUserUpdatedStatus().init(group, usersBD);
        serverInterface.setThreadSet(new Vector<Thread>());
		JOptionPane.showMessageDialog(null,
				new String(),
				chatMsg_2.getMsgID()+" is changed due to the chat message",
				JOptionPane.INFORMATION_MESSAGE);
		int status = SendUserUpdatedStatus().sendMsg(group, chatMsg);
		String msg = serverInterface.getThreadSet().elementAt(0).getInput().toString();
		assertTrue(msg.equals(CHAT_MESSAGE_SERVER_IS_DOWN_IN_GROUP_CHANGED) + msg.equals(CHAT_MESSAGE_SERVER_IS_UP) + msg.equals(CHAT_MESSAGE_USER_REMOVED));
	}
}