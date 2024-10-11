// ModernChatServer_1Test.java
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
* It contains one unit test case for the {@link ModernChatServer#ping()} method.
*/
class ModernChatServer_1Test {
		// 1.  1) {@linkplain ClientInterface client can be defined with the class name osa.ora.ServerSettingBean}
		// 2. {@linkplain User#setLoginBean(LoginBean) LoginBean}
		// 3. {@linkplain ClientInterface client can set the time for the server to listen  the time
		// 4.  1) {@linkplain Runnable runnable}
		// 5....
    @Test
    public void Run() throws RemoteException{
        String strEncryption = "MD5-BASE64";
        String strServerId = "FOURHOURFAST8452343";
        String strServerPasswd = "12345678";
        Integer iMinute = 15;
        Hashtable<String, String> params = new Hashtable<String, String>();
        params.put("iMinute", Integer.toString(iMinute));
                /*
                1) {@linkplain ClientInterface client can be defined with the class name osa.ora.ServerSettingBean}
                2) {@linkplain User#setParam(String, String) LoginBean}
                   */
        ClientInterface c = new ClientInterface();
        String strLogin = c.getLogin(params);
        // String strServerParam = "{iMinute='"+iMinute+"'}";
        ClientInterface c2 = new ClientInterface();
        c.setParam(strServerId+"_"+strMinute, strLogin);
        int i2 = c2.GetMyRPCClientConnect(c);
        if (i2!= 2) {
        // {@linkplain ClientInterface client cannot connect the RMI server, should return 2!}
        // {@linkplain ClientInterface client can set the server password}
        // TODO: {@linkplain ClientInterface client can ping them}

        }else{
        // Client connected but his password is not changed
        // {@linkplain ClientInterface client can ping them}
        }
        // TODO: {@linkplain ClientInterface client can ping them}
        ClientInterface c3 = new ClientInterface();
        c.setParam(strServerId+"_"+strMinute, c3.GetMyRPCClientConnect(c2));

        int i3 = c3.GetMyRPCClientConnect(c);
        // {@linkplain ClientInterface client can set his password}
        ClientInterface c4 = new ClientInterface();
        c4.setParam(strServerPassword,"123456");
        int i4 = c4.GetMyRPCClientConnect(c5);
        if (i4!= 2) {
        // {@linkplain ClientInterface client cannot connect the RMI server, should return 2!}
        // {@linkplain ServerInterface server cannot be registered}
        }else{
        // server registered
        System.out.println(c4.getServerId() + "  " + c4.getLocalHost() + "  " + i4 + "  " + c4.getLocalHostByPort());
        }
    }

        final double dStartTime = Calendar.getInstance().getTimeInMillis();
        /*
        1) {@linkplain Runnable runnable}
        2) {@linkplain ClientInterface client can be defined with the class name osa.ora.ServerSettingBean}
        */

    //@Test
    public void ping_Test() throws RemoteException{
        int iMinute = 15;
        Hashtable<String, String> params = new Hashtable<String, String>();
        params.put("iMinute", Integer.toString(iMinute));
        ClientInterface c = new ClientInterface();
        c.setParam(strServerId+"_"+strMinute, Integer.toString(iMinute));
        int iTime = Integer.parseInt(StringEncrypter.encrypt(((Object[])c.GetParam(3)).length));
}
}