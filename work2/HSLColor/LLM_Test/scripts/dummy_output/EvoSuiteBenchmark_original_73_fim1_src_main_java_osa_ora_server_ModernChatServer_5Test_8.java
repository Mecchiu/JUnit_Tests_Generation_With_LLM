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
		
    private IConstant constantServer;
    private ClientInterface rmiClient;
    private Logger logServer;
    private long checkServerKickedOffDelay;
    private FileHandler fileHandler;
    private static final String TEST_RESULT = "0x0a";
    private static final String[] SERVER_SETUP_ATT = {"Server Setting #1: Room: #5",
            "Server Setting #2: Room: #5",
    };
    private static final String[] LOGIN_ATT = {"Login: #1","Login: #3","Login: #3",
            "Login: #2","Login: #1"};
    private static final String[] LOGOUT_ATT = {"Login: #1","Login: #3","Login: #1",
            "Login: #3"};
    private static final String[] LOGGROUP_ATT = {"Group#1","Group#1","Group#1",
            "Group#2","Group#1","Group#2"};
    private static final String[] PING_OPTION = {"Ping option#1","Ping option #2"};
    private static final String[] GROUP_ATT = {"Group#1","Group#1","Group#2","Group#2" };
    private ServerSettingBean setting;
    private int numberOfClients;
    
    /**
     * A set object to be used for setting and fetching a user.<p>
     * Here is the set object with set as member name:<br>
     * <table>
     * <tbody>
     * <tr>
     * <th>key</th>
     * <th>value</th>
     * </tr>
     * </tbody>
     * </table>
     */
    public static final Hashtable<String, String> set = new Hashtable<String, String>();
  
    static class ServerSettingMessageBean implements Serializable {
        String getValue() { 
            return setting.getServerKey(); 
        }  
    }

    /**
     * Constructor of the class
     *
     * @param setting : server setting
     * @param numberOfClients : number of clients
     */
    public ModernChatServer_5Test(ServerSettingBean setting, int numberOfClients) {
        this.setting = setting;
        this.numberOfClients = numberOfClients;
    }
    
    /**
     * @return the setting
     */
   
    public ServerSettingBean getSetting() {
        return setting;
    }
        
        
   
    /**
     * @param setting: set the setting 
     */
       public void setSetting(ServerSettingBean setting) {
            this.setting = setting;   
       }

	
    private static boolean checkServerKickedOff(int time) {
        assertNotNull(time);
        return TimeUtils.isServerKickedOff(time, checkServerKickedOffDelay);
    }
    
    private static void waitForServerKickedOff(int time) {
    	long now = new Date().getTime();
        long timeToWait = time * 1000;
        while (timeToWait > now) {
            long elapsed = now -time;
            if (elapsed > 10) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ModernChatServer_5Test.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                break;
            }
        }
    }
    
    /**
     * A thread to run
     */
    @Test
    public void startServer() throws InterruptedException {
}
}