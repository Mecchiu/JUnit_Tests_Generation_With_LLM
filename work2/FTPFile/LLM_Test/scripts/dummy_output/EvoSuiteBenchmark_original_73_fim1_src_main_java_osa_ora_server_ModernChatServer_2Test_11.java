// ModernChatServer_2Test.java
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
* It contains one unit test case for the {@link ModernChatServer#signIn(ClientInterface, String, String, String)} method.
*/
class ModernChatServer_2Test {
		
    /**
    * Basic test scenario.
    *
    * @throws java.lang.Exception
    */
    @Test
    public void test1() throws Exception {
        // create two users
        ClientInterface cf = new ClientInterface();
        User user1 = new User(null,null);
        user1.setEmailAddr("test1@example.com");
        client = UnicastRemoteObject.exportObject(user1, cf);
        user1.setAccessLevel(4);
        String ipAddr = cf.getIPAddress();
        String name = cf.getName();
        String password = cf.getPassword();
        User user2 = new User(ipAddr,name);
        user2.setEmailAddr("test2@example.com");
        client2 = UnicastRemoteObject.exportObject(user2, cf);
        user2.setAccessLevel(5);
        // create user be a client
        ClientInterface cf2 = new ClientInterface();
        User user3 = new User(null,null);
        user3.setEmailAddr("test3@example.com");
        client2 = UnicastRemoteObject.exportObject(user3, cf2);
       
        // test signature
        LoginBean result = signIn(cf, user1.getEmailAddr(), user1.getPassword(), cf2.getIPAddress());
        assertNotNull(result);
        // test the correct result
        if(result.getAccessLevel()!=3) { 
            System.out.println("signIn failed, result: " + result.getAccessLevel().toString());
            fail();
            // assert false;
            } 
        // all tests ok
       
        // test update data
        client.setPassword(user2.getPassword());
        User user4 = new User(null,user2.getEmailAddr());
        client1.setPassword(user2.getPassword());
        ClientInterface cf3 = new ClientInterface();
        User user5 = new User(cf3,"test5@example.com");
        user5.setEmailAddr("test5@example.com");
        client3 = UnicastRemoteObject.exportObject(user5, cf3);
        ServerSettingBean setting = new ServerSettingBean();
        StringEncoder64 se = new StringEncoder64(2);
        setting.setMaxClients("25");
        setting.setMaxTimeClients("0");
        setting.setDefaultClients("10");
        setting.setMinClients("10");
        setting.setTimeoutClients("4");
        setting.setUserDataEncoder("UTF-8");
                
        cf3.setPassword(se.encode(password));
        
        // Update users and all them users
        updateUser(user1,user2);
        updateUser(user3,user4);
        updateUser(user4,user5);
        
        // test user list
        Vector<User> users = loginList(setting);
		
		// loop
        for (User user1 : users) {
               // test get password for user
            if (cf3.getPassword().compareTo(user1.getPassword())) {
                System.out.println("signIn successful, user: "+user1);
            } else {
                System.out.println("signIn failed, user1: "+user1);
                fail();
            }
        }
        
	}
	
}