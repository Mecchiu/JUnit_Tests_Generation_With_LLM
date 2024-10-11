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
		
	@SuppressWarnings("unused")
	private static FileHandler configLog;
	@SuppressWarnings("unused")
	private static Boolean debug;
	@SuppressWarnings("unused")
	private static java.util.logging.Formatter formatter =new SimpleFormatter();
	public static void main(String[] args) {
		String logfile = "/Users/o/data/logs/o-ora-server/server-3/" + new java.util.Date().toString() + ".log";
		try {
			configLog = FileHandler.getFileHandler("/Users/o/data/logs/o-ora-server/server-3/" + new java.util.Date().toString() + ".log");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			if (debug) {
				System.out.println("Starting debug mode");
			}
			configLog.setFormatter(formatter);
	}

	/**
     * The following will test the {@link ModificationLogoScreen} and related methods
     * 
     * @throws javax.rmi.CORBA.NamingException, IOException
     * @throws Exception
     */
    @Test
    public void modificationLogoScreenTest() throws NamingException, IOException, java.rmi.RemoteException {
        
        System.out.println("Testing modification logo screen");
        
        
}
}