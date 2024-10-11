// ModernChatServer_4Test.java
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
* It contains one unit test case for the {@link ModernChatServer#changeAdminPassword(String, String, String)} method.
*/
class ModernChatServer_4Test {
		
    /**
     * Test case for  "Change Admin Password" method of {@link ServerInterface}
     * @throws RemoteException
     * @throws java.lang.reflect.InvocationTargetException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    void pingToChangeAdminPasswordTest_1()
            throws RemoteException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, java.rmi.RemoteException, java.lang.reflect.InvocationTargetException {
        
        // Change the server
        ServerSettingBean newSetting = new ServerSettingBean();
        newSetting.setServerName("NewName");
        newSetting.setServerIP("192.168.1.2");
        ServerSettingBean oldSetting = new ServerSettingBean();
        oldSetting.setServerName("OldName");
        oldSetting.setServerIP("192.168.1.1");
        Registry registry = LocateRegistry.getRegistry(BinaryMessage.PORT);
        BinaryMessage.setServerName(newSetting.getServerName());
        BinaryMessage.setServerIP(newSetting.getServerIP());
        registry.rebind(BinaryMessage.class.getCanonicalName(), new UnicastRemoteObject(new BinaryMessage(newSetting, newSetting)), null);
        System.out.println("Server updated! :" + StringEncrypter.encryptPassword(newSetting.getToken(), StringEncrypter.getRandomString32()));
    }

    /**
     * Test case for the following method :
     *  Change Admin Password
     *  @throws RemoteException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
// TODO : to test with "change user login"
//    @Test
    void pingToChangeAdminPasswordTest_new()
            throws RemoteException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, java.rmi.RemoteException, java.lang.reflect.InvocationTargetException {
        
        // Change the server
        Registry registry = LocateRegistry.getRegistry(BinaryMessage.PORT);
        BinaryMessage.setServerName("Test2");
        BinaryMessage.setServerIP("192.168.1.1");
        registry.rebind(BinaryMessage.class.getCanonicalName(), new UnicastRemoteObject(new BinaryMessage(new ServerSettingBean(), new ServerSettingBean())), null);
        System.out.println("Server updated! :");
        System.out.println("Server updated! :" + StringEncrypter.encryptPassword(newServerSettingBean().getToken(), StringEncrypter.getRandomString32()));
    }

    /**
     * Test case for the following method :
     *  Change Admin Password
     *  @throws RemoteException
     * @throws IllegalAccessException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     */
//  @Test
    void pingToChangeAdminPasswordTest_old()
            throws RemoteException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, java.rmi.RemoteException, java.lang.reflect.InvocationTargetException {
        
        // Change the server
        Registry registry = LocateRegistry.getRegistry(BinaryMessage.PORT);
        BinaryMessage.setServerName("OldName");
        BinaryMessage.setServerIP("192.168.1.1");
}
}