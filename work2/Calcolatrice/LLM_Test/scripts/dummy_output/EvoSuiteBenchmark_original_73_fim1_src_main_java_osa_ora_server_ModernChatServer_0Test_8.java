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
		
	//private static MiniChatServer server;
	private BasicDummyServer server;
	
	/**
	 * Test method for {@link osa.ora.server.server.ServerInterface#run()}.
	 */
	@Test
    public void serverTest() {
		
		BinaryMessage msg=new BinaryMessage();
		//ServerSettingBean serverSettingBean=new ServerSettingBean();
		LoginBean loginBean=new LoginBean();
		MessageToServerToBinaryMessageMessageThread thread=new MessageToServerToBinaryMessageMessageThread(server.getUserList().iterator(), 0);
		
		server.getUserList().add(loginBean);
		server.getBinaryMessageList().add(msg);
		server.getUserList().remove(loginBean);
		
		thread.start();
		
		Thread.sleep(10000);
		
		int messageSize=server.getBinaryMessageList().size();
		System.out.println("Size is "+String.valueOf(messageSize)+" and "+String.valueOf(server.getSocketAddress().toString()));
		
		assertNotNull(String.valueOf(messageSize));
		assertEquals(StringEncrypter.encode(server.getUserList().iterator().next()), "1");
		


		int count=0;
}
}