// ModernChatServer_7Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_7Test {
		
    final String _username1 = "";
    final String _password1 = "";
    final String _username2 = "";
    final String _password2 = "";
    
    final String _nickname = "Orani";
    final String _realNickname = "Orani";
    final String _group1 = "";
    final String _group2 = "";
    
    final int port;
    final int port2;
    Logger logger;
    
    ModernChatServer_7Test(Runnable thread) {
        // Create logger and add a file handler
        SimpleFormatter fmt = new SimpleFormatter();
        fmt.setLevel(Level.INFO);
        logger = Logger.getLogger(this.getClass().getName());
        logger.addHandler(new FileHandler("logs/test-log-file-log.fqdn-test")); // this is the default output level
        
		this.logger = logger;

        // Create some ports
        port = Configure.PORTS.get("port");
        port2 = Configure.PORTS2.get("port2");
    }    	


    // Method for unit testing:
    @Test
    public void executeThread() throws UnavailableSystemResourcesEx {

       final int PORT_THREAD = Configure.MESSAGECOUNT_THREAD;

       


}
}