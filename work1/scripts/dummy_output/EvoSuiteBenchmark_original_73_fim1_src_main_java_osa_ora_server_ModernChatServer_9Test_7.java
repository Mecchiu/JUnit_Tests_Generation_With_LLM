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
		
	/**
	 * Test for setting up Realm (to avoid any local host changes)
	 */
	@Test
    public void RealmIsUnused() throws Exception {
        log.use(Logger.getLogger(""));
		
        Realm realm = new RealmAdapter();
        realm.bind(new BasicRemoteObject(new RealUser().createObject()));
        
        RealmContext context = realm.lookup("realm/defaultContext");

        context = new RealmContext(context, new ClientInterface(RealmAdapter.class));
        
        BinaryMessage message = new BinaryMessage();
        
        // test a simple message to the user
        userM.sendBinaryMessage(message, message.getData());
        userM.writeBinaryMessages();
        
        System.out.println("******" + message);
        
        assertEquals(message.getData(), BinaryMessage.BINARY_MESSAGE_ROOM_MSG);
    }
   
    /**
     * Test for server setting and restart
     */
    @Test
    public void ServerSettingAndRestart() {
        log.use(Logger.getLogger(""));
        
        Realm realm = new RealmAdapter();
        realm.bind(new BasicRemoteObject(new RealmDBAdaptor(realm).createObject()));
        
        RealmContext context = realm.lookup("realm/defaultContext");
        context = new RealmContext(context, new ClientInterface(BasicRemoteObject.class, BasicRemoteObject.newInstance(realm)));
        
        BinaryMessage message = new BinaryMessage();
        
        // test a simple message to the user
        userM.sendBinaryMessage(message, message.getData());
        userM.writeBinaryMessages();
        
        assertEquals(message.getData(), BinaryMessage.BINARY_MESSAGE_ROOM_MSG);
        
        realm.destroy();
        
        // we cannot test the behaviour of this thread.
        Thread sendKeepAlive = new SendKeepAliveThread();
        sendKeepAlive.run();
    }
	
	/**
		ServerSettingBean object is created after login.
		As in the test for server setting and restart.
	*/
	@Test
	public void ServerSettingAndRestart() {
        log.use(Logger.getLogger(""));
        
        Realm realm = new RealmAdapter();
        realm.bind(new BasicRemoteObject(new RealmDBAdaptor(realm)));
        
        RealmContext context = realm.lookup("realm/defaultContext");
        context = new RealmContext(context, new ClientInterface(BasicRemoteObject.class, BasicRemoteObject.newInstance(realm)));
        
        BinaryMessage message = new BinaryMessage();

        // test a simple message to the user
        userM.sendBinaryMessage(message, message.getData());
        userM.writeBinaryMessages();
        
        assertEquals(message.getData(), BinaryMessage.BINARY_MESSAGE_ROOM_MSG);
        
        realm.destroy();
        
        // we cannot test the behaviour of this thread.
        Thread sendKeepAlive = new SendKeepAliveThread();
        sendKeepAlive.run();
	}

	/**
		StringEncrypter class is create after login.
		As in the test for server setting and restart.
	*/
	@Test
    public void StringEncrypterAndRestart() {
        log.use(Logger.getLogger(""));
        
        Realm realm = new RealmAdapter();
}
}