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
		
	// Test for {@link #signIn(ClientInterface, String, String, String)}
	private StringEncoder64 encoder = new StringEncoder64();
    private ClientInterface cf = null;

    private ClientInterface signIn_Server = null;
    private ClientInterface get_Client=null;
	private UsersBD userBD=null;
	private IConstant ic=(IConstant)Naming.lookup(StringEncrypter.class.getCanonicalName());
	private IConstant ic_Server=(IConstant)Naming.lookup(StringEncrypter.class.getCanonicalName());
	
	//Test
	private String encodedPass = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Hello,", "Hello!", JOptionPane.INFORMATION_MESSAGE);
	}

	// Test : ping users thread
	@Test
    public void testPingByLogin(){
	    final String pongStr = "Test ping user";
	    // Test run
	    boolean flag = true;
        try{
        	cf = new ClientInterface("192.168.0.15", "192.168.0.15");
	        userBD=init(cf);
	        if(userBD!=null){
	        	initSocket(cf);
	        	if(userBD.isConnected()){
	        		flag = false;
	        		JOptionPane.showMessageDialog(null, pongStr, "test pong", JOptionPane.INFORMATION_MESSAGE);
	        		System.out.println("pong success");
	        	}
	        	userBD.setLogin(true);
	        	userBD.login();
	        	System.out.println("Login");
	        }
	        
	        assertTrue(userBD.isConnected());
	        assertEquals(pongStr, "test pong");
            }catch(JOptionPane.CanceledException ignored){
				System.out.println("test cancel");
				while(flag){
					try{
		            Thread.sleep(2000);
			        }catch(InterruptedException ignored){
			        	break;
			        }
			        if(flag){ //Check if quit button is enabled
			        	flag=false;
			        }
				}
            }
            
}
}