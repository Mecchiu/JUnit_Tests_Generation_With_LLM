// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
    /**
     * Test case for {@link Realm.Admin#changePassword(String, String, String)}.
     * If admin fails, login should show the error message to the user.
     * @throws URISyntaxException
     */
	@Test
    void testChangeAdminPassword() throws URISyntaxException, RemoteException {
        BinaryMessage msg = new BinaryMessage();
        msg.setText("The text to say by the admin");
        msg.setSender("admin");
        msg.setParm1("admin");
        msg.setParm2("admin");
        msg.setParm3("admin");
        msg.setType("12");
        msg.setTextEncoded("6k6qf"+StringEncoder64.getEncodedStringEncoding(StringEncrypter.hash(msg, ClientInterface.PASSWORD_ENCRYPT_MESSAGE_LENGTH))+"\n"+ClientInterface.PASSWORD_ENCRYPT_MESSAGE_LENGTH+"\n"+ClientInterface.PASSWORD_ENCRYPT_MESSAGE_LENGTH+"\n"+ServerSettingBean.BINARYTEXT_LENGTH+"\n"+ServerSettingBean.PASSWORD_LENGTH+"\n"+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+"\n"+ServerSettingBean.MESSAGE_LENGTH+"\n"+ServerSettingBean.MESSAGE_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n"+ServerSettingBean.PUSHWALL_LENGTH+"\n");
        String emailAddr = "admin@oreana.org";
        String newPass = "secret";
        String oldPass = "secretold";
}
}