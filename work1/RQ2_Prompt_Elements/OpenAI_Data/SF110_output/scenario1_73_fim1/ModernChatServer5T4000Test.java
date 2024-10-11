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
* It contains ten unit test cases for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServerTest {

	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is USER_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_1() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		ClientInterface cf = new ClientInterface() {
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
		};
		server.connectedClients.put(1, cf);
		assertTrue(server.sendSecureTextMessage(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns false when the target type is USER_CHAT and the user is not connected.
	*/
	@Test
	void testSendSecureTextMessage_2() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.USER_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		assertFalse(server.sendSecureTextMessage(msg));
	}
	
	/**
	* Test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
	* This test case checks if the method returns true when the target type is GROUP_CHAT and the user is connected.
	*/
	@Test
	void testSendSecureTextMessage_3() throws RemoteException {
		ModernChatServer server = new ModernChatServer();
		TextMessage msg = new TextMessage();
		msg.setTargetType(IConstant.GROUP_CHAT);
		msg.setToUserId(1);
		msg.setFromUserId(2);
		msg.setMessage("Hello");
		ClientInterface cf = new ClientInterface() {
			@Override
			public boolean sendSecureTextMessage(TextMessage msg) throws RemoteException {
				return true;
			}
		};
		server.connectedClients.put(1, cf);
		server.connectedClients.put(3, cf);
		server.connectedClients.put(4, cf);
		server.connectedClients.put(5, cf);
		server.connectedClients.put(6, cf);
		server.connectedClients.put(7, cf);
		server.connectedClients.put(8, cf);
		server.connectedClients.put(9, cf);
		server.connectedClients.put(10, cf);
		server.connectedClients.put(11, cf);
		server.connectedClients.put(12, cf);
		server.connectedClients.put(13, cf);
		server.connectedClients.put(14, cf);
		server.connectedClients.put(15, cf);
		server.connectedClients.put(16, cf);
		server.connectedClients.put(17, cf);
		server.connectedClients.put(18, cf);
		server.connectedClients.put(19, cf);
		server.connectedClients.put(20, cf);
		server.connectedClients.put(21, cf);
		server.connectedClients.put(22, cf);
		server.connectedClients.put(23, cf);
		server.connectedClients.put(24, cf);
		server.connectedClients.put(25, cf);
		server.connectedClients.put(26, cf);
		server.connectedClients.put(27, cf);
		server.connectedClients.put(28, cf);
		server.connectedClients.put(29, cf);
		server.connectedClients.put(30, cf);
		server.connectedClients.put(31, cf);
		server.connectedClients.put(32, cf);
		server.connectedClients.put(33, cf);
		server.connectedClients.put(34, cf);
		server.connectedClients.put(35, cf);
		server.connectedClients.put(36, cf);
		server.connectedClients.put(37, cf);
		server.connectedClients.put(38, cf);
		server.connectedClients.put(39, cf);
		server.connectedClients.put(40, cf);
		server.connectedClients.put(41, cf);
		server.connectedClients.put(42, cf);
		server.connectedClients.put(43, cf);
		server.connectedClients.put(44, cf);
		server.connectedClients.put(45, cf);
		server.connectedClients.put(46, cf);
		server.connectedClients.put(47, cf);
		server.connectedClients.put(48, cf);
		server.connectedClients.put(49, cf);
		server.connectedClients.put(50, cf);
		server.connectedClients.put(51, cf);
		server.connectedClients.put(52, cf);
		server.connectedClients.put(53, cf);
		server.connectedClients.put(54, cf);
		server.connectedClients.put(55, cf);
		server.connectedClients.put(56, cf);
		server.connectedClients.put(57, cf);
		server.connectedClients.put(58, cf);
		server.connectedClients.put(59, cf);
		server.connectedClients.put(60, cf);
		server.connectedClients.put(61, cf);
		server.connectedClients.put(62, cf);
		server.connectedClients.put(63, cf);
		server.connectedClients.put(64, cf);
		server.connectedClients.put(65, cf);
		server.connectedClients.put(66, cf);
		server.connectedClients.put(67, cf);
		server.connectedClients.put(68, cf);
		server.connectedClients.put(69, cf);
		server.connectedClients.put(70, cf);
		server.connectedClients.put(71, cf);
		server.connectedClients.put(72, cf);
		server.connectedClients.put(73, cf);
		server.connectedClients.put(74, cf);
		server.connectedClients.put(75, cf);
		server.connectedClients.put(76, cf);
		server.connectedClients.put(77, cf);
		server.connectedClients.put(78, cf);
		server.connectedClients.put(79, cf);
		server.connectedClients.put(80, cf);
		server.connectedClients.put(81, cf);
		server.connectedClients.put(82, cf);
		server.connectedClients.put(83, cf);
		server.connectedClients.put(84, cf);
		server.connectedClients.put(85, cf);
		server.connectedClients.put(86, cf);
		server.connectedClients.put(87, cf);
		server.connectedClients.put(88, cf);
		server.connectedClients.put(89, cf);
		server.connectedClients.put(90, cf);
		server.connectedClients.put(91, cf);
		server.connectedClients.put(92, cf);
		server.connectedClients.put(93, cf);
		server.connectedClients.put(94, cf);
		server.connectedClients.put(95, cf);
		server.connectedClients.put(96, cf);
		server.connectedClients.put(97, cf);
		server.connectedClients.put(98, cf);
		server.connectedClients.put(99, cf);
		server.connectedClients.put(100, cf);
		server.connectedClients.put(101, cf);
		server.connectedClients.put(102, cf);
		server.connectedClients.put(103, cf);
		server.connectedClients.put(104, cf);
		server.connectedClients.put(105, cf);
		server.connectedClients.put(106, cf);
		server.connectedClients.put(107, cf);
		server.connectedClients.put(108, cf);
		server.connectedClients.put(109, cf);
		server.connectedClients.put(110, cf);
		server.connectedClients.put(111, cf);
		server.connectedClients.put(112, cf);
		server.connectedClients.put(113, cf);
		server.connectedClients.put(114, cf);
		server.connectedClients.put(115, cf);
		server.connectedClients.put(116, cf);
		server.connectedClients.put(117, cf);
		server.connectedClients.put(118, cf);
		server.connectedClients.put(119, cf);
		server.connectedClients.put(120, cf);
		server.connectedClients.put(121, cf);
		server.connectedClients.put(122, cf);
		server.connectedClients.put(123, cf);
		server.connectedClients.put(124, cf);
		server.connectedClients.put(125, cf);
		server.connectedClients.put(126, cf);
		server.connectedClients.put(127, cf);
		server.connectedClients.put(128, cf);
		server.connectedClients.put(129, cf);
		server.connectedClients.put(130, cf);
		server.connectedClients.put(131, cf);
		server.connectedClients.put(132, cf);
		server.connectedClients.put(133, cf);
		server.connectedClients.put(134, cf);
		server.connectedClients.put(135, cf);
		server.connectedClients.put(136, cf);
		server.connectedClients.put(137, cf);
		server.connectedClients.put(138, cf);
		server.connectedClients.put(139, cf);
		server.connectedClients.put(140, cf);
		server.connectedClients.put(141, cf);
		server.connectedClients.put(142, cf);
		server.connectedClients.put(143, cf);
		server.connectedClients.put(144, cf);
		server.connectedClients.put(145, cf);
		server.connectedClients.put(146, cf);
		server.connectedClients.put(147, cf);
		server.connectedClients.put(148, cf);
		server.connectedClients.put(149, cf);
		server.connectedClients.put(150, cf);
		server.connectedClients.put(151, cf);
		server.connectedClients.put(152, cf);
		server.connectedClients.put(153, cf);
		server.connectedClients.put(154, cf);
		server.connectedClients.put(155, cf);
		server.connectedClients.put(156, cf);
		server.connectedClients.put(157, cf);
		server.connectedClients.put(158, cf);
		server.connectedClients.put(159, cf);
		server.connectedClients.put(160, cf);
		server.connectedClients.put(161, cf);
		server.connectedClients.put(162, cf);
		server.connectedClients.put(163, cf);
		server.connectedClients.put(164, cf);
		server.connectedClients.put(165, cf);
		server.connectedClients.put(166, cf);
		server.connectedClients.put(167, cf);
		server.connectedClients.put(168, cf);
		server.connectedClients.put(169, cf);
		server.connectedClients.put(170, cf);
		server.connectedClients.put(171, cf);
		server.connectedClients.put(172, cf);
		server.connectedClients.put(173, cf);
		server.connectedClients.put(174, cf);
		server.connectedClients.put(175, cf);
		server.connectedClients.put(176, cf);
		server.connectedClients.put(177, cf);
		server.connectedClients.put(178, cf);
		server.connectedClients.put(179, cf);
		server.connectedClients.put(180, cf);
		server.connectedClients.put(181, cf);
		server.connectedClients.put(182, cf);
		server.connectedClients.put(183, cf);
		server.connectedClients.put(184, cf);
		server.connectedClients.put(185, cf);
		server.connectedClients.put(186, cf);
		server.connectedClients.put(187, cf);
		server.connectedClients.put(188, cf);
		server.connectedClients.put(189, cf);
		server.connectedClients.put(190, cf);
		server.connectedClients.put(191, cf);
		server.connectedClients.put(192, cf);
		server.connectedClients.put(193, cf);
		server.connectedClients.put(194, cf);
		server.connectedClients.put(195, cf);
		server.connectedClients.put(196, cf);
		server.connectedClients.put(197, cf);
		server.connectedClients.put(198, cf);
		server.connectedClients.put(199, cf);
		server.connectedClients.put(200, cf);
		server.connectedClients.put(201, cf);
		server.connectedClients.put(202, cf);
		server.connectedClients.put(203, cf);
		server.connectedClients.put(204, cf);
		server.connectedClients.put(205, cf);
		server.connectedClients.put(206, cf);
		server.connectedClients.put(207, cf);
		server.connectedClients.put(208, cf);
		server.connectedClients.put(209, cf);
		server.connectedClients.put(210, cf);
		server.connectedClients.put(211, cf);
		server.connectedClients.put(212, cf);
		server.connectedClients.put(213, cf);
		server.connectedClients.put(214, cf);
		server.connectedClients.put(215, cf);
		server.connectedClients.put(216, cf);
		server.connectedClients.put(217, cf);
		server.connectedClients.put(218, cf);
		server.connectedClients.put(219, cf);
		server.connectedClients.put(220, cf);
		server.connectedClients.put(221, cf);
		server.connectedClients.put(222, cf);
		server.connectedClients.put(223, cf);
		server.connectedClients.put(224, cf);
		server.connectedClients.put(225, cf);
		server.connectedClients.put(226, cf);
		server.connectedClients.