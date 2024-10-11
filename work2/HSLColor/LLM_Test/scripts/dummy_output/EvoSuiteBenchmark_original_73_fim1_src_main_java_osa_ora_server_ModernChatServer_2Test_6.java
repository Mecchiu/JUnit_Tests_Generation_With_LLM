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
	* Method to Test sign out
	*
	*/
	@Test
	    public void sendUserUpdatedMessage() {

		// Initialize the bean
		LoginBean ln = new LoginBean("12345", "12345", "", "");
		Vector<String> roles = new Vector<String>();
		roles.add("Guest");
		roles.add("Operate");
		users = new UsersBD(roles, ln, 3, 3);

		// Construct the request
		Map request = new Hashtable();

		// Put the data back
		request.putAll(new Hashtable());
		request.putAll(new Hashtable());
		request.putAll(new Hashtable());

		TextMessage tm = new TextMessage();
		tm.setMessage("Message to be send to a user, the name of the user and his email"
		   + " is informed by the administrator. Check mail if his name is correct.");

		request.put("UserEmail", ln.getEmail());
		request.put("Message", tm);

		Logger.getLogger(ModernChatServer_2Test.class.getName()).log(Level.INFO, "Send UserUpdatedMessage. request=" + request.toString());

		// Send the request
		Object[] obj = new Object[5];
		obj[0] = "UserEmail";
		obj[1] = ln.getEmail();
		obj[2] = "Message";
		obj[3] = tm.getMessage();
		obj[4] = String.class;

		Object res = UnicastRemoteObject.exportObject(obj, 0);
		assertTrue(res!= null);

		// Execute and verify the request if any
		ResponseBean resBean = UsersBD.sendUserUpdatedMessage(request.toString());
		assertTrue(resBean.success);
	}

	/**
	* Method to Test kickoff a user
	*
	*/
	@Test
	    public void sendKickOffMail() {

		// Construct the request
		Map request = new Hashtable();

		// Put the data back
		request.putAll(new Hashtable());
		request.putAll(new Hashtable());
		request.putAll(new Hashtable());

		TextMessage tm = new TextMessage();
		tm.setMessage("Message"
		   + " to be send to a user, the first name of the user"
		   + " and his first or last name"
		   + " is informed by the administrator. Check mail"
		   + " if the first or last name is correct.");

		request.put("UserEmail", "LN");
		request.put("Message", tm);

		Logger.getLogger(ModernChatServer_2Test.class.getName()).log(Level.INFO, "Send ChatMail. request=" + request.toString());

		// Send the request
		Object[] obj = new Object[5];
		obj[0] = "UserEmail";
		obj[1] = "LN";
		obj[2] = "Message";
		obj[3] = tm.getMessage();
		obj[4] = String.class;

		Object res = UnicastRemoteObject.exportObject(obj, 0);
		assertTrue(res!= null);

		// Execute and verify the request if any
		ResponseBean resBean = UsersBD.sendKickOffMail(request.toString());
		assertTrue(resBean.success);
	}

	public boolean messageReceived = false;

}