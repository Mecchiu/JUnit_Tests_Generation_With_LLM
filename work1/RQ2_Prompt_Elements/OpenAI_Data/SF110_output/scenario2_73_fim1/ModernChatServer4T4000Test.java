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
	* Test case 1 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 1 checks if the method returns the correct result when the old password is correct.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword1() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 2 checks if the method returns the correct result when the old password is incorrect.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword2() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin1";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 3 checks if the method returns the correct result when the old password is null.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword3() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = null;
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 4 checks if the method returns the correct result when the old password is empty.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword4() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 5 checks if the method returns the correct result when the new password is correct.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword5() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 6 checks if the method returns the correct result when the new password is incorrect.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword6() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin1";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 7 checks if the method returns the correct result when the new password is null.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword7() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = null;
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 8 checks if the method returns the correct result when the new password is empty.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword8() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 9 checks if the method returns the correct result when the email address is correct.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword9() throws RemoteException {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 10 checks if the method returns the correct result when the email address is incorrect.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword10() throws RemoteException {
		// Arrange
		String emailAddr = "admin1@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 11 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 11 checks if the method returns the correct result when the email address is null.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword11() throws RemoteException {
		// Arrange
		String emailAddr = null;
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 12 for method {@link ModernChatServer#changeAdminPassword(String, String, String)}.
	* Test case 12 checks if the method returns the correct result when the email address is empty.
	* @throws RemoteException
	*/
	@Test
	void testChangeAdminPassword12() throws RemoteException {
		// Arrange
		String emailAddr = "";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		// Act
		ResultBean actual = changeAdminPassword(emailAddr, oldPass, newPass);
		// Assert
		assertEquals(expected, actual);
	}
}