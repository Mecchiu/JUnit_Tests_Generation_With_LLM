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
		/**
         * {@link #sendSecureTextMessage(TextMessage)} method unit test. 
         * @throws RemoteException
         */
    @Test
    public void SendSecureTextMessage_01() throws RemoteException {
        Vector<String> vectors1 = new Vector<>();
        Vector<String> vectors2 = new Vector<>();
        Vector<String> vectors3 = new Vector<>();
    	Vector<String> vectors4 = new Vector<>();
        try {
            for (int i = 0; i < 1010; ++i) {
                Vector<String> vectors = new Vector<>();
                Vector<String> vectors1Temp = new Vector<>();
                Vector<String> vec = new Vector<>();
                vec.add("123");
                vec.add("456");
                vec.add(StringEncoder64.encode("test"));
                vec.add(StringEncoder64.encode("b"));
                vec.add(StringEncoder64.encode("test"));
                vec2 = vec.toArray(null);
                vecp = vec.toArray(null);
                vecs.add(vecp);
                vecs1.add(vecp);
                vecs2.add(vecp);
                vecs3.add(vecp);
            }
            vecs = Vector.concatenate(vecs,vecs1);
            vecs = Vector.concatenate(vecs,vecs2);
            vecs = Vector.concatenate(vecs,vecs3);
            ServerSettingBean serverSettingBean = new ServerSettingBean();
            User user = new User();
            user.setNickname("test");
            user.setLogin("test_Login");
            user.setAccount("test_Account");
            user.setUserID(542);
            user.setAvatar("test_Avatar");
            Vector<User> vecpTest = new Vector<>();
            vecpTest = new Vector<>();
            vecpTest.add(user);

            vecs = Vector.concatenate(vecs,vecpTest);

        } catch (NamingException | RemoteException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
            assertFalse("The test case has some failed", true);
        }
        Vector<String> vecp = Vector.concatenate(vecs,vecs3);
        BinaryMessage msg = new BinaryMessage();
        BinaryMessage msg2 = new BinaryMessage();
        BinaryMessage msg3 = new BinaryMessage();
    }
	/**
	 * Send a test user.
	 * @throws RemoteException
	 */
    @Test
    public void SendUserUpdatedStatusMessage_01() throws RemoteException {
		Vector<String> vectors1 = new Vector<>();
		Vector<String> vectors2 = new Vector<>();
		Vector<String> vectors3 = new Vector<>();
	    Vector<String> vectors4 = new Vector<>();
    	Vector<String> vectors5 = new Vector<>();
}
}