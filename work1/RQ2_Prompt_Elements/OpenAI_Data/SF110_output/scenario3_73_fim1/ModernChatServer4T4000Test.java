// ModernChatServerTest.java
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
* It contains ten unit test cases for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_4() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_5() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_6() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_7() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_8() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_9() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_10() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
}

// ModernChatServer.java
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

/**
 * @author ooransa
 * Class implements 2 interfaces:
 * 1.Runnable for ping users thread : that ping users periodically to check if they are still connected or not.
 * 2.ServerInterface that extends 2 other interfaces : Admin Interface and Client Interface , both used
 * As the RMI view of the server for the connected client.
 */
public class ModernChatServer implements ServerInterface, Runnable {

    /**
     * Change admin password
     *
     * @param emailAddr : email of the admin
     * @param oldPass : current password
     * @param newPass : new password
     * @return ResultBean : return status
     * @throws RemoteException
     */
    public ResultBean changeAdminPassword(String emailAddr, String oldPass, String newPass) throws RemoteException {
        ResultBean result = new ResultBean();
        try {
            if (emailAddr == null || emailAddr.trim().length() == 0) {
                result.setStatus(IConstant.SERVER_ERROR);
                result.setMessage("Invalid email address");
                return result;
            }
            if (oldPass == null || oldPass.trim().length() == 0) {
                result.setStatus(IConstant.SERVER_ERROR);
                result.setMessage("Invalid old password");
                return result;
            }
            if (newPass == null || newPass.trim().length() == 0) {
                result.setStatus(IConstant.SERVER_ERROR);
                result.setMessage("Invalid new password");
                return result;
            }
            if (oldPass.equals(newPass)) {
                result.setStatus(IConstant.SERVER_ERROR);
                result.setMessage("New password must be different from the old one");
                return result;
            }
            if (emailAddr.equals(IConstant.ADMIN_EMAIL)) {
                if (oldPass.equals(IConstant.ADMIN_PASSWORD)) {
                    IConstant.ADMIN_PASSWORD = newPass;
                    result.setStatus(IConstant.OK);
                    result.setMessage("Password changed successfully");
                    return result;
                } else {
                    result.setStatus(IConstant.SERVER_ERROR);
                    result.setMessage("Invalid old password");
                    return result;
                }
            } else {
                result.setStatus(IConstant.SERVER_ERROR);
                result.setMessage("Invalid email address");
                return result;
            }
        } catch (Exception ex) {
            result.setStatus(IConstant.SERVER_ERROR);
            result.setMessage("Error while changing password");
            return result;
        }
    }
}

// ModernChatServerTest.java
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
* It contains ten unit test cases for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServerTest {
		
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_4() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result = server.changeAdminPassword("admin@gmail.com", "admin", "admin");
		assertEquals(IConstant.SERVER_ERROR, result.getStatus());
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns a {@link ResultBean} object with the status set to {@link IConstant#SERVER_ERROR}.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword_5() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		ResultBean result =