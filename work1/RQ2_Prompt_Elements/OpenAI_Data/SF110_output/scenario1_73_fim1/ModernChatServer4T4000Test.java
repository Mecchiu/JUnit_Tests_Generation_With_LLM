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
	* This test case checks if the method returns the correct result when the old password is invalid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(true, IConstant.SUCCESS, null);
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is invalid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_InvalidOldPassword_ValidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Invalid Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is invalid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_InvalidNewPassword() {
		// Arrange
		String emailAddr = "admin@admin.com";
		String oldPass = "admin";
		String newPass = "admin";
		ResultBean expected = new ResultBean(false, IConstant.ERROR, "Error During Applying New Password!");
		
		// Act
		ResultBean actual = ModernChatServer.changeAdminPassword(emailAddr, oldPass, newPass);
		
		// Assert
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
	* This test case checks if the method returns the correct result when the old password is valid and the new password is valid.
	*/
	@Test
	void testChangeAdminPassword_ValidOldPassword_ValidNewPassword() {
		// Arrange
		String email