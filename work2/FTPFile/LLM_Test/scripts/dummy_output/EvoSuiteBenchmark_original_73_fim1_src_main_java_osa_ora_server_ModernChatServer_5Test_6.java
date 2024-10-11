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
		
  private Logger logger;
  private ClientInterface clientInterface;
  private ServerInterface serverInterface;

  @Test
  void sendBinaryMessageWithDifferentServer() throws RemoteException {
    logger = Logger.getLogger("MinecraftServerUtils");
    logger.setLevel(Level.ALL);
    serverInterface = new ServerInterface();
    clientInterface = new ClientInterface();
    String msg = "Hello World!";
    BinaryMessage binMsg = new BinaryMessage(msg);
    
    logger.info("start send secure text message...");
    logger.info("send text message!");
    serverInterface.sendSecureTextMessage(binMsg);
    
    assertNotNull("nullify result", binMsg.getResult());
  }
  
  @Test
  void sendBinaryMessageWithClient() throws java.rmi.RemoteException {
    logger = Logger.getLogger("MinecraftServerUtils");
    logger.setLevel(Level.ALL);
    try {
      clientInterface.sendTextMessage("Hi", "Hello World!");
    } catch (RemoteException e) {
      logger.info(e.toString());
    }
  }
  
  @Test
  void sendMessageWithDifferentSender() throws Exception {
    logger = Logger.getLogger("MinecraftServerUtils");
    logger.setLevel(Level.ALL);
    try {
      String msg = "Hi";
      logger.info("start send text message with different sender...");
      TextMessage msg1 = new TextMessage();
      logger.info("send text message with different sender!");
      StringEncoder64.encrypt(msg1, ClientInterface.CLIENT_ID);
      logger.info("encrypt: " + StringEncrypter.encode(msg1.getEncodedMessage(), ClientInterface.CLIENT_ID));
      logger.info("send text message with different sender...");
      TextMessage msg2 = new TextMessage();
      clientInterface.sendTextMessage("Hi", StringEncrypter.decrypt(msg1.getEncodedMessage(), ClientInterface.CLIENT_ID));      
      logger.info("decrypt: " + StringEncrypter.decrypt(msg2.getEncodedMessage(), ClientInterface.CLIENT_ID));
      assertNotEquals(msg1, msg2);
      assertNotEquals(msg1, "Hi");
    } catch (RemoteException e) {
      logger.info(e.toString());
    }
  }
  
  @Test
  void sendMessageWithDifferentReceiver() throws RemoteException {
}
}