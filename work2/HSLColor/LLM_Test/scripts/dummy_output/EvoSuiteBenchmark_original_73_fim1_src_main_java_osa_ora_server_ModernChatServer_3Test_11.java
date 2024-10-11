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
		
	private final User admin = new User();
	private final ClientInterface client = new ClientInterface();
	private ClientInterface client2 = new ClientInterface();
	private final User user = new User();
	
	@Test
    public void test() throws URISyntaxException, RemoteException {
    	admin.setEmail(Constants.Admin_Email);
        
        client.setEmail(Constants.test_admin_email);

        // Login
        final String server_host = "localhost";
        final int server_port = 12345;
        final String url = Constants.RMI_URL + "server" + ";" + "password=";
        ClientInterface.login = (login) -> {
            Object rmi_reg = null, rmi_user = null;
            final String login_ret = login.Login(Constants, url, server_host, server_port, Constants.test_admin_password);
            System.out.println("RMDL " + url + login_ret);
            rmi_reg = Naming.lookup("//" + login_ret);

            final String login_ret2 = login.Login(Constants, url, server_host, server_port, Constants.admin_password);
            System.out.println("RLD " + url + login_ret);
            System.out.println("ALI " + login_ret2);
            rmi_user = Naming.lookup("");

            return rmi_reg;
        };
        
        // Check service login
        final int port = Constants.getServiceURL().port;
        final String login_ret = UsersBD.login(Constants, url, Constants.admin_password, port, Constants.test);
        assertEquals("RMDL "+Constants.getServiceURL()+" "+url, login_ret, login_ret2);
        
        final ResultBean result = ModifyGroupService.changePassword(server_host, user.getEmail(), user.getUsername(), Constants.test_pwd);
        assertEquals("ServerPassword Changed for user: ", Constants.test_pwd, result.getPassword());
        
        // Check service check out
        final int port2 = client.getServiceURL().port;
        login = (login) -> {
            Object rmi_reg = null, rmi_user = null;
            final String login_ret2 = UsersBD.login(Constants, url, Constants.test, port2, Constants.test);
            System.out.println("RMDL " + url + login_ret);
            rmi_reg = Naming.lookup("//" + login_ret);
            
            final String login_ret22 = UsersBD.checkOut(Constants, login, Constants.test, port2, Constants.test);
            System.out.println("CRL: "+ login_ret2+" "+ login_ret22);

            return rmi_reg;
        };

        final ResultBean login_ret = ModifyUserService.checkOut(user.getEmail(), Constants.test);
        assertEquals("ServerUserChanged for user: ", Constants.test, login_ret.getPassword());
        
        // Check service delete
        logout = (logout) -> {
            Object rmi_reg = null, rmi_user = null;
            final int logouts_ret = UsersBD.logout(Constants, Constants.admin, port, Constants.test);
            rmi_user = Naming.lookup("//" + logouts_ret);
            
            rmi_reg = Naming.lookup("");
            return rmi_reg;
        };
        
}
}