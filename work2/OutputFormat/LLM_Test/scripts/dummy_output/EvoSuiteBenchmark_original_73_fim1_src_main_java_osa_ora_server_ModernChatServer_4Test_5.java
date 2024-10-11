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
		* Tests if password update does not affect server state
		*
		* @throws RemoteException
		*/
    @Test
    void testChangeAffectsServerState() throws RemoteException {
        ServerSettingBean settingBean1 = new ServerSettingBean(settingValue1);
        ServerSettingBean settingBean2 = new ServerSettingBean(settingValue2);

        String encoder = "<password old='" + settingBean1.password + "' new=\"password\"/>";

        newString();

        assertEquals(settingBean1,settingBean2);
    }

    /**
     * Tests if change admin password does not affect server state
     *
     * @throws RemoteException
     */
    @Test
    void testChangeAffectsServerState2() throws RemoteException {
        ServerSettingBean settingBean1 = new ServerSettingBean(settingValue1);
        settingBean1.password = "password";

        ServerSettingBean settingBean2 = new ServerSettingBean(settingValue2);
        settingBean2.password = "not password";

        String encoder = "<password old='password' new=\"none of the above\">";

        newString();

        assertEquals("nope\nas password was not changed\nexpected:\r\n" +
                "  old='nope\nas password'\ntext: none of the above'\nexiting: \r\n" +
                "  old='password'\ntext: none of the above'\n",settingBean1);
    }

    /**
     * Tests if change admin password does not affect server state
     *
     * @throws RemoteException
     */
    @Test
    void testChangeAffectsServerState3() throws RemoteException {
        ServerSettingBean settingBean1 = new ServerSettingBean(settingValue1);
        settingBean1.password = "password";

        ServerSettingBean settingBean2 = new ServerSettingBean(settingValue2);
        settingBean2.password = "password";

        //This method uses the old password to create a message for changeAdminPassword test
        String oldPassword = settingBean1.password;
        settingBean1.password = "password";

        //This method uses the new password to create a message, it assumes it created a message for changeAdminPassword in the previous process
        String newPassword = settingBean2.password;

        String encoder = "<password old='" + settingBean1.password + "' new=\"password\"/>";

        newString();

        assertEquals("\r\n" +
                "  <password old=\"nope\nas password\">\r\n" +
                        "    <text:password/>  \r\n" +
                "  </password>\r\n" +
                "\r\n" +
                "\r\n" +
                "\nOK\nas password was not changed\nexpected:\r\n" +
                "  <password old=\"password\" new=\"none of the above\"> \r\n" +
                "  </password>\r\n\n", settingBean1);
    }

    /**
     * Tests if change admin password does not affects server state
     *
     * @throws RemoteException
     */
    @Test
    void testChangeAffectsServerState4() throws RemoteException {
        ServerSettingBean settingBean1 = new ServerSettingBean(settingValue1);
        settingBean1.password = "password";
        settingBean1.password = "whatever";

        ServerSettingBean settingBean2 = new ServerSettingBean(settingValue2);
}
}