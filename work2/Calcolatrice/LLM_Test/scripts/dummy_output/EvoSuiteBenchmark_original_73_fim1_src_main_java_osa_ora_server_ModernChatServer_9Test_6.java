// ModernChatServer_9Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signInAsAdmin(String, String)} method.
*/
class ModernChatServer_9Test {
		
    /**
     * this class implements a server thread and starts to create and start the server.
     */
    private static Object mySelfServer = new Object();

    /**
     * this class implements a client side interface which allows to send a batch chat message to a particular user.
     */
    private static UsersBD myDB = new UsersBD();

    /**
     * the logger used by the main method.
     */
    private static Logger myLog = System.out;
    
    
    /**
     * Constructor of the class.
     */
    public ModernChatServer_9Test() {
    }

    /**
     * run the test. <br>
     * In this case we start the first user.<br>
     * And here is the main method of the class.
     */
    @Test
    public void runIt() {
	myLog.fine("testStarted");
	myDB.sendChat("Bib.txt," + Main.data.username, "test2");
	// Wait some time to make sure the p-login works.
	
        // Sleep to be sure the p-login is made
	Calendar.getInstance().add(Calendar.SECOND, 1);
	try { Thread.sleep(1000); } catch (Exception e) {}
        
        ServerSettingBean sb = Main.DB.find("username", "bib");
        assertEquals("bib not found in DB", "test2", sb.textValue);

        // Start the test
        mySelfServer.wait();

        // Stop the test
        mySelfServer.wait();
        
		myLog.fine("testEnded");    
    }
    
}