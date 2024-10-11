// ModernChatServer_8Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextAnnouncement(TextMessage)} method.
*/
class ModernChatServer_8Test {
		
    /**
     * It must be called at the end of {@link CreateAndAddTestServer()} method of
     * {@link ModernChatServer#createAndAddTestServer()} class.
     */
    @Test
    public void sendSecureTextAnnouncement() throws Exception {
        new Test();
        
    }
	
    @Test
    public void getStatusFromAdmin() throws Exception {
        assertEquals("Online", modernChatServer.getStatus());
    }

    @Test
    public void getStatusAsString() throws Exception {
        
        ClassicChatServer classicChatServer = (ClassicChatServer)(new ClientInterface()).getClient();
	
        classicChatServer.getStatus();
        
    }

    @Test
    public void sendRoomId_sendKick_createRoom() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_sendRefreshContact_createRoom() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_sendRefreshContact_destroyRoom() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_sendRefreshContact_sendRoomNotExist() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_setNewRoom_createNewRoom() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_sendKickOffByLoginMessage_createRoom_sendUserUpdatedStatus() throws Exception {
        new Test();
        
    }

    @Test
    public void sendRoomId_sendKickOffByLoginMessage_destroyRoom_sendUserUpdatedStatus() throws Exception {
        new Test();
        
    }

    @Test
    public void sendUserUpdatedStatus_sendUserUpdatedStatus() throws Exception {
        new Test();
        
    }

    private void newTest() {
        classicChatServer.destroy();
        new Test();
        
    }

    class Test implements Runnable {

}
}