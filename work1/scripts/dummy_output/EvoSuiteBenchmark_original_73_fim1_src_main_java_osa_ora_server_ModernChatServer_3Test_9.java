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
		
    private ServerSettingBean setting;
    private UsersBD users;
    private ClientInterface client;

    public ModernChatServer_3Test() throws RemoteException, LoginException, MalformedURLException {

		try {
            Calendar c = Calendar.getInstance();
			c.set(Calendar.MILLISECOND, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.HOUR, 0);
			c.set(Calendar.DAY_OF_WEEK, 12);
            setting = UsersBD.getInstance().getSetSettingBd().setLoginSetting(c.getTime());
		} catch (LoginException le) {
            throw le;
		} catch (URISyntaxException e) {
            throw e;
        }
    }

    /**
     * This test case tests the method of {@link osa.ora.server.ClientInterface#changePassword(String, String, String)} for
     * the new password update, the change password procedure.
	 */
    @Test
    public void testClientServerInterfaceClassChangePassword() {

        ServerSettingBean serverSetting = UsersBD.getInstance().getSetSettingBd().getServerSetting();

        String pwd = ServerSettingBean.getPasswordFromSetting(serverSetting);
		
        ChangePasswordTestCase ctc = new ChangePasswordTestCase(pwd);
		
        ClientInterface client = ctc.createClient(setting);
        checkInterfaceCall(client);

        ClientInterface client2 = ctc.receiveServerSettingClientInterface();
        checkInterfaceCall(client2);

        result = ctc.changePassword(ServerSettingBean.getSettingEmailFromSetting(),ServerSettingBean.getSettingOldPasswordFromSetting(),ServerSettingBean.getSettingNewPasswordFromSetting());

        sendStringMessageAndWait();

        assertTrue(result.isOK());
        assertEquals(ServerSettingBean.getResult(setting), result.getResultBean());
    }


    @Test
    public void testSendByLoginMessageByClientLogin() {

        String test = "Login from this text...";
        String expectedResponse = ServerSettingBean.getResult(setting);
        System.out.println("sendByLoginMessageByClientLogin"+test);
        ServerSettingBean serverSetting = UsersBD.getInstance().getSetSettingBd().getServerSetting();
        assertEquals(expectedResponse, result.getResult());

        sendByLoginMessageByClientLogin(ServerSettingBean.getSettingOldPasswordFromSetting(), expectedResponse, false, ClientInterface.FORCE_ONLINE, ClientInterface.FORCE_ONLINE, test, ServerSettingBean.getSettingUserFromSetting(), false);



    }

    private void checkInterfaceCall(ClientInterface client) throws LoginException, RemoteException{

        ResultBean serverSetting = result.getResult();
        ServerSettingBean serverSetting2 = UsersBD.getInstance().getSetSettingBd().getServerSetting();
        assertEquals(serverSetting,serverSetting2);
    }


    public void sendByLoginMessageByClientLogin(String email, String oldPassword, boolean online, ClientInterface forceOnlineClient, ClientInterface forceOfflineClient, String message, ServerSettingBean serverSetting, boolean offline) throws Exception {


        String password = StringEncrypter.getInstance().encode2(password);

        TextMessage tm = new TextMessage(ServerSettingBean.getSettingEmailFromSetting()+"", message);

        StringEncrypter es = new StringEncrypter(password);
        es.run();

}
}