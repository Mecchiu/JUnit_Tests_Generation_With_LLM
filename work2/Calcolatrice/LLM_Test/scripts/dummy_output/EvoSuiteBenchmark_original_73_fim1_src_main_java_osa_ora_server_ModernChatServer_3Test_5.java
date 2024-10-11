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
		 * Test {@link AncientChatServer#setMessage(String, String)}.
		 * It does not test {@link ModernChatServer} the {@link ServerInterface} which is used as a {@link ClientInterface}.
		 *
		 * @throws Exception
		 */
		@Test
		public void testSetMessage() throws Exception {
			System.out.println("setMessage() method of ModernChatServer_3Test");
			final User u1 = new User("user1", "password1", "user1@gmail.com", "user1@gmail.com");
			final User u2 = new User("user2", "password2", "user2@gmail.com", "user2@gmail.com");

				u1.setPassword("pass1");
				u2.setPassword("pass1");
				if (!(new String(u1.getGravatar()).equals("user1@gmail.com"))) {
					fail("Unsetted users are not saved as well");
				}
				if (!(new String(u2.getGravatar()).equals("user2@gmail.com"))) {
					fail("Unsetted users are not saved as well");
				}

				final Vector<String> dataNames = new Vector<String>();
				dataNames.add("user1");
				dataNames.add("user2");
				final String[][] data = new String[][] { new String[] { "user1", "password1" },
				                                        new String[] { "user2", "password2" } };
				final Object[] data2 = dataNames.toArray();

				final Hashtable<String, Object> attributes = new Hashtable<String, Object>();
				attributes.put("data1", data[0][1]);
				attributes.put("data2", data2);

				final String message = "{\"name\":" + StringEncoder64.encode(u1.getFirstName()) +
					",\"lastName\":" + StringEncoder64.encode(u1.getLastName()) + "}";
				final BinaryMessage messageBe = new BinaryMessage(BinaryMessage.ROOM_MSG, message.getBytes());
}
}