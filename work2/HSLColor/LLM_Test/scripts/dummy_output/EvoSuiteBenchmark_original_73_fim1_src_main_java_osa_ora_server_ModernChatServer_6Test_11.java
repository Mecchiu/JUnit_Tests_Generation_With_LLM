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
		
    @Test
    void sendBinaryMessage() throws RemoteException {
		
        Registry registry = ServerSettingBean.getInstance().getRegistry();
    		registry.bind("User", User.class);
		User u = new User("Test User");	
    		registry.bind("Client", ClientInterface.class);
		try(ClientInterface client = (ClientInterface)RemoteConnectionThread.getRegistry().lookup("Client")){	
	    		new SendUserUpdatedStatusThread().start();// to be able to get notified
	    		
	    		BinaryMessage msg = new BinaryMessage("Test Message", ClientInterface.ClientID.getIDFromString("My_Client_ID"));
	    		new BinaryMessage("Test message", ClientInterface.ClientID.getIDFromString("Other_Client_ID")).setRoom(0, 1).setText("Test message_text").setRoom(1, 0);
	    		BinaryMessage result = new BinaryMessage("My message", ClientInterface.ClientID.getIDFromString("My_Client_ID"));
	    		ResultBean rb = new ResultBean(null, null);
	    		rb.setStatus(ResultBean.Status.PENDING);
	    		rb.setResult(null);
	    		rb.setSuccess(false);
	    		new SendUserUpdatedStatusThread().start();
			
			Hashtable<String, Object> ht = new Hashtable<>();
			ht.put("Room", 0);
			ht.put("Status", rb);
			ht.put("Text", new TextMessage("test text", "The text in the text message is going to be sent"));
			hrt.put("User", new Group(u));
			new ThreadSendContactToClient().start();
			
			new ThreadSendUserUpdatedStatusThread(new SendRefreshContactThread(), ht).start();
			
			// Sleep the sendBinaryMessage and the resultBean
			Thread.sleep(1000);
			
			new ServerSettingBean().saveServerSetting();
    	
    		new SendRefreshContactThread().start();
    	}	
		
		
	}	
		
	@Test
		public void chatTest() throws URISyntaxException, RemoteException, ServerNotReadyException, ServerSettingNotFoundException {
    		ServerSettingBean setting = new ServerSettingBean();
			setting.setServerSetting(ServerSettingBean.ServerSettingType.TEST);
			setting.saveServerSetting();
		}

		@Test
		public void logTest() throws RuntimeException, URISyntaxException, RemoteException, ServerNotReadyException {
		    ServerSettingBean setting = new ServerSettingBean();
			setting.setServerSetting(ServerSettingBean.ServerSettingType.LOGIN);
			setting.saveServerSetting();
		}

		@Test
		public void kickoffTest() throws URISyntaxException, RemoteException, ServerNotReadyException, ServerSettingNotFoundException {
	    	ServerSettingBean setting = new ServerSettingBean();
			setting.setServerSetting(ServerSettingBean.ServerSettingType.KICKOFF);
			setting.saveServerSetting();
		}

		@Test
		public void updateTest() throws URISyntaxException, RemoteException, ServerSettingNotFoundException {
			ServerSettingBean setting = new ServerSettingBean();
			setting.setServerSetting(ServerSettingBean.ServerSettingType.UPDATE);
			setting.saveServerSetting();
		}

}