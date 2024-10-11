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
		
    private UsersBD users;
    private ClientInterface client;
    private ClientInterface admin;

    public ModernChatServer_2Test(){}

	@Test
    public void test_signIn(){	
        //create the server, and register the client interface for sending messages.
        String test1 = "Tekt_test1";
        String test2 = "Tekt_test2";
        String test3 = "Tekt_test3";
        String test4 = "Tekt_test4";
        String test5 = "Tekt_test5";
        String test6 = "Tekt_test6";
        ClientInterface tc = new DefaultClientInterface("TektDemo", null); //get the default client interface
        registerLoginMessageBean(tc);
        tc.logIn();

        //Register user 1 as admin
        RegisterUserBean rb1 = new RegisterUserBean();
        rb1.username = test1;
        rb1.password = new StringEncoder64(System.getProperty("users.admin.password"));
        rb1.register(tc);
        admin = rb1.init();

        //Register user 2 as user 3
        RegisterUserBean rb2 = new RegisterUserBean();
        rb2.username = test2;
        rb2.password = new StringEncoder64(System.getProperty("users.admin2.password"));
        rb2.register(tc);
        tc.setAdmin(rb2);
 
        //Register user 4 as user 5
        RegisterUserBean rb3 = new RegisterUserBean();
        rb3.username =test3;        
        rb3.password = new StringEncoder64(System.getProperty("users.admin3.password"));
        rb3.register(tc);
        tc.setAdmin(rb3);

        //Register user 5 as a user 6
        RegisterUserBean rb4 = new RegisterUserBean();
        rb4.username =test4;        
        rb4.password = new StringEncoder64(System.getProperty("users.admin4.password"));
        rb4.register(tc);
        tc.setAdmin(rb4);

        // Register user 6 as user 5
        RegisterUserBean rb5 = new RegisterUserBean();
        rb5.username = test5;
        rb5.password = new StringEncoder64(System.getProperty("users.admin5.password"));
        rb5.register(tc);
        tc.setAdmin(rb5);

        Registry pRegistry = LocateRegistry.getRegistry();
    	try {
    		pRegistry.rebind("o", new Object());
    	} catch (RemoteException e) {
    		fail(e.getMessage());
    	}

    	//Test authentication
    //  TEST 1-1
    	//Register user 6 as a user 3
    	Hashtable<String, Object> user = new Hashtable<String, Object>();
        user.put("username", test5);
        users.register(tc, user);
        //Test authentication
        //TEST 1-2
        //Register user 4 as a user 2
        user.clear();
        user.put("username", test4);
        users.register(tc, user);
        //Test authentication
        //TEST 1-3
        //Register user 2 as a user 1
        user.clear();
        user.put("username", test1);
        users.register(tc, user);
        //Test authentication
        //TEST 1-4
}
}