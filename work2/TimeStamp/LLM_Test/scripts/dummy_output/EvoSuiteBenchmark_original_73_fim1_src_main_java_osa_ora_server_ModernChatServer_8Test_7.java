// ModernChatServer_8Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServer_8Test {
		private final static Vector<Vector<String>> tests = new Vector<>();

		private static final int TEST_COUNT = 5;
		private static void runTest(int count, int threadCount, int testNumber) throws RemoteException, InterruptedException {
			for (int i = 0; i < count; i++) {
				Vector<String> testVector = new Vector<>();

				testVector.add(new String("test" + (i + 1) + ".txt"));
				for (int j = 1; j <= threadCount; j++) {
					testVector = new Vector<>();

					testVector.add("test" + (i + j) + ".txt");
				}

				String test = StringEncrypter.getRandomString(TestConstants.TEST_VALUE_DEFAULT_CODE_LENGTH);
				testVector.add(test);

				testVector.add("test" + (testNumber + 1) + ".txt");

				tests.add(testVector);
			}

			TEST_COUNT = count;
			for (Vector<String> testVector : tests) {
				SecureChatMessage.generateRandomMessage(StringEncrypter.getRandomString(TestConstants.TEST_VALUE_DEFAULT_CODE_LENGTH), 1);
				String message = testVector.elementAt(0);

				StringEncoder64.encodeStringBinary(new UnicastRemoteObject(TextMessage.class), message, TestConstants.TEST_VALUE_DEFAULT_CODE_LENGTH);
				assertTrue("TEST_COUNT=" + count + ", threadCount=" + threadCount, Message.isSameMessageString(testVector.elementAt(0), message));

			}
		}

		@Test
		void runTestTEST() throws RemoteException, InterruptedException {
			int testNumber = 0;
			Hashtable<String, String> params = new Hashtable<>();

			for (int i = 0; i < tests.size(); i++) {
				Vector<String> testVector = tests.get(i);

				String msg = "";
				for (int j = 0; j < (testVector.size() - 1); j++) {
					msg = msg + encodeMessage(StringEncrypter.getRandomString(TestConstants.TEST_VALUE_DEFAULT_CODE_LENGTH), "message" + testVector.size() + StringEscapeUtils.escapeJava(tostr(j)) + "." + tostr(testVector.size() + 1), testVector.size() + 1);
					assertFalse("TEST_NUMBER_TEST_COUNT=" + testNumber + ", TEST_NUMBER_TEST_COUNT_MAX=" + (testVector.size() - 1), testVector.size() >= TEST_NUMBER_TEST_COUNT_MAX);
				}
			}
		}

		@Test
		void runTest_TEST() throws RemoteException, InterruptedException {
			//runTest(TEST_COUNT, TestConstants.TEST_THREAD_NUMBER, testNumber);
		}

		/**
		 * Decode the message encoded by a binary message.
		 *
		 * @param msg : the message to be decoded
		 * @param codeLenth : the code length
		 * @param text : the message text
		 * @return : the decoded message
		 */
		private String decodeMessage(String message, int codeLenth, String text) throws RemoteException{
			StringEncoder64.decodeStringBinary(new UnicastRemoteObject(TextMessage.class), message, codeLenth, text);
			return text;
		}

		private User getUser(String username) throws RemoteException, InterruptedException {
}
}