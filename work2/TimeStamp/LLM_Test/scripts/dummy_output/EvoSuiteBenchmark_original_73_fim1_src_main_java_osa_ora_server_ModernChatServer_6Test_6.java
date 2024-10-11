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
		
	/**
	 * Test of run method, of class osa.ora.server.ModernChatServer.
	 */
	@Test
	public void testRun() throws Exception {
        Logger.getLogger("").setLevel(Level.WARNING);
        Logger logger = Logger.getLogger(BinaryMessage.class.getName());
        
        String strServer = "TestServer";
        String name = "Client";
        String password = "'password';";
        
        logger.addHandler(new FileHandler("tmp.log"));
        logger.getLogger().addHandler(new LogHandler());
        
        
        //New Client Interface class
        StringEncoder64 stringEncoder = new StringEncoder64();
        ClientInterface instance = new ClientInterface(strServer,name,stringEncoder.encode("password"),new ClientInterface.DefaultLoginInterface());
        
        assertNotNull(instance);
        
        
        //New user
        User user = new User(2,"admin","admin");
        instance.setLogin(user);
       
        //Send binary message first
        BinaryMessage bm = new BinaryMessage("test", 0, "test message first", 0);
        ResultBean result = instance.sendBinaryMessage(bm);
        assertNotNull(result);
        
        //Check ResultBean
        //String sBean = result.toString();
        //System.out.println(String.valueOf(sBean));
	String enc1 = stringEncoder.encode("test");
	String enc2 = "test";
        String decoded = result.getDecoded();
        
        //TODO: Check if decoded is equal string1 (binary -> Base64) but decoded is equal string2 (Base64)
	assertFalse(encoded.equals(decoded));
        
        //System.out.println(decoded);
        assertEquals("test", stringEncoder.decode(encoded));
         
        
	//Test getRoom()
	//new Binder();
	
    }
}

/**
 * Test class of {@link osa.ora.server.client.ClientInterface} interface. 
 * It can be used to test all the basics of a client interface.
 */
public class OldClientInterface extends UnicastRemoteObject implements ClientInterface {

	ClientInterface clientInterface;
    private String message;

	@Override
	public String getMessage() throws RemoteException {
		Object result = clientInterface.getMessage();		
		if (result instanceof TextMessage) {
			return ((TextMessage) result).toString();
		} else {
			return message;
		}

	}
	public void setMessage(String msg) throws RemoteException {
		clientInterface.setMessage(msg);
	}
    @Override
    public String getId() throws RemoteException {
        return this.clientInterface.getId();
    }

	/** 
	 * Returns the clients session ID (String). 
	 */
	 @Override
      public String getSession() throws RemoteException {
        return this.clientInterface.getSession();
      }

	/** 
	 * Updates the clients ID (String), the last time the client was kicked (Date) or the last time the logon from the GUI (System) was sent.
	 */
	 @Override
      public void setId(String id) throws RemoteException {
        clientInterface.setId(id);
      }

	/** 
	 * Logs the clients account (String). 
	 * @param serverLogonDate : last logon date (date format YYYY-MM-DD)
	 */
	 @Override
      public void setServerLogonDate(String serverLogonDate) throws RemoteException {
}
}