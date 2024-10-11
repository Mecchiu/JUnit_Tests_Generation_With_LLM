// ModernChatServer_9Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
*/
class ModernChatServer_9Test {
		
    //JUnit's log category -
    private static final String LOG_NAMESPACE = "TEST";

	/**
	 * Start test.
     * @throws java.rmi.RemoteException
             An unexpected remote exception was thrown by the running unit test case.
*/
	@Test
	public void testSignInAsAdmin_StartTest() throws RemoteException {
		String emailAddr = "test@test.test";
		String password = "pass";
		User user = new User();
		user.setEmailAddress(emailAddr);
		client.setUser(user);
		groupBean.setMember(group);
		ClientInterface clientInterface = createClient();
        LoginBean loginBean = signInAsAdmin(emailAddr, password);
        assertNotNull("Check LoginBean",loginBean);
		assertTrue(loginBean.getClient() == clientInterface);
        assertTrue(loginBean.valid());
	}

	
	@Test
	public void testSender() {
		MessageBean messageBean;

		messageBean = new MessageBean();
		messageBean.getServer().getText();
		assertEquals("Test Message From Server",messageBean.getText());
        //Check the Text Message is not send because of the error when getting a String from the server
        
		messageBean = new MessageBean();

		messageBean.getServer().getText();
		
		//Check the Text Message is not sent because of the error when getting a String from the server
		Enumeration<TextMessage> resultEnumeration = MessageBean.getSendTextMessages().elements();
		
		boolean isListeningForTextMessage = resultEnumeration.hasMoreElements();
        resultEnumeration.nextElement();

		assertFalse(isListeningForTextMessage);

  	/*
     * The code below checks if the exception is thrown by the message receiver thread,
         * if not, it throws the exception and tests it with the assertion.
         */
     
		try {
			/*
             * The code below tests if an exception is thrown by the client's receiver thread
             * and not if it just checks it with the assertion, if not, it throws
             * the AssertionError thrown by the message receiver.
			 */
        	MessageBean messageBean = new MessageBean();
			messageBean.getServer().getText();
			assertTrue("The exception is not thrown by the client's receiver thread",false);
			assertTrue("The exception is not thrown by the client's receiver thread",false);
        } catch (AssertionError e) {
			assertTrue("The exception did not throw the AssertionError",e.getMessage() == "The exception is not thrown by the client's receiver thread" ||
    					    		        e.getMessage() == 
				              "The exception is not thrown by the client's receiver thread");
		}
        
	}
	
        /**
         * Gets the user bean which provides interface between the user and server.
         * @return  A object which provide interface
         * @throws RemoteException RemoteException
         */
		@Test
		public void testClientInterface() throws RemoteException {
			String address = "123.123.123.123";
            String encoded = StringEncrypter.StringEncrypter64.encode(address);
            String decrypted = StringEncrypter.StringEncrypter64.decrypt(encoded);
			assertNotNull("No client interface", nam);
		}
	
}