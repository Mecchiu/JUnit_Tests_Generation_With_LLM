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
		
    static ServerSettingBean SETTING_2;
     
    @BeforeAll
    static void InitSetting(){
        try{
            if(SETTING_2==null) SETTING_2 = (ServerSettingBean)Naming.lookup(_Server.class+":"+_ServerSetting.BINDING);
        }
        catch(RemoteException e){
            e.printStackTrace(); assert false;}
    }
    
    @org.junit.jupiter.api.AfterAll
    static void CloseSetting(){
       

        SETTING_2 = null;
    }
    
    int time_out = 30;


    @BeforeEach
    void SetUp(){
        time_out = 30;
    }
	
	@Test
    public void test(){
        SimpleFormatter sf = new SimpleFormatter(); 
        Logger LOGGER = Logger.getLogger(NewServer.class.getName());
        Logger.getLogger("").setLevel(Level.ALL);
        try {
			/*
            Registry r = LocateRegistry.getSystemRegistry();
            String b = r.lookup(_Server.BINDING);
            System.out.println(b);
            if (b.equals("")) return true;
            r.unregister(_Server.BINDING);
            r.close();
            */

            //Registry r = LocateRegistry.getRegistry(_Server.class);
            //String b = r.lookup(_Server.BINDING);
            //System.out.println(b);
            //if (b.equals("")) return true;
            
            LocateRegistry.getRegistry(SETTING_2.getProperty(_Server.CLASS,"localhost").getValue());
            System.out.println("Registry Created");
        }
        catch (Exception e){
            e.printStackTrace();  assert false;}
}
}