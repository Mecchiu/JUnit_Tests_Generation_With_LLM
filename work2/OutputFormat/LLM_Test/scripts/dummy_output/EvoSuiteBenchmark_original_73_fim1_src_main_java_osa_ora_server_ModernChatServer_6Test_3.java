// ModernChatServer_6Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendBinaryMessage(BinaryMessage)} method.
*/
class ModernChatServer_6Test {
		
    /**
     * Unit test for {@link User#run()}
     * The test create a Client and register in server and is calling the
     * method using the RPC, register Client and server is ping all client to check  who is his connection or not.
     */
    @Test
    public void runTest(@TestLogging(name = "Server", severity = Level.INFO) Logger targetLogger) throws Exception {
        User adminUser = getAdminUser();
        User newAdminUser = createAdminUser();
        
        UsersBD adminBD = new UsersBD(adminUser);
        UsersBD user1 = createNewUser(targetLogger);
        UsersBD user2 = createNewUser(targetLogger);
        
        UsersBD user3 = adminBD.createUser("Admin1");
        UsersBD admin2 = new UsersBD("Admin2");
        
        usersList.addUser(new User(user3, user2, admin2, user2));
        usersList.addUser(adminUser);
        usersList.addUser(adminUser);
        usersList.addUser(user1);
        
        try {
            getAdminUser().run();
            // This should cause the ping method to send ping to the new Admin User
            assertTrue(adminUser.getHostname().equals(user1.getHostname()));
        } catch (BinaryMessage.BinaryConnectionFailedException e) {
            fail("BinaryConnectionFailedException while calling ping()");
        }
        try {
            server.waitForConnection();
            assertTrue(adminUser.getHostname().equals(user1.getHostname()));
        } catch (Naming.NamingException e) {
            assertTrue(false);
        }
    }

       /*
    * Run an instance of the {@link UsersBD} in a new sub thread. Register a new user for the server. 
    * The main thread sends Ping method to the server and waits this until ack is come back.
    * 
    * The main thread communicates the new adminUser to every time an User is sent out.  
    */
    private User getAdminUser() throws RemoteException {
        UsersBD u = new UsersBD(adminUser);
        u.register(new User(adminUser, null, adminUser, null));
        return adminUser;
    }
    
    private User createAdminUser() throws RemoteException {
        User adminUser = createNewAdminUser(null);
        adminUser.setUserStatus("admin");
        return adminUser;
    }
   
    private User createNewAdminUser(String initialStatus) throws RemoteException {
        User adminUser = new User(null, null, null, initialStatus);
        adminUser = ClientSetting.initializeNewUser(adminUser);
        
         return adminUser;
    }
    
    private User updateUserNameForPong(String newName) throws RemoteException {
        ChatRoomDAO chatRoomDAO = new ChatRoomDAO();
        User newUser = new User(null, null, null, newName);
        newUser.update();
		
        return newUser;
    }
    
    private UsersBD checkForRoom(String name) throws RemoteException {
        String hostName = createNewRoom(name);
        
        ChatRoomDAO chatRoomDAO = new ChatRoomDAO();
        Room newUser = chatRoomDAO.getRoom(hostName);
        Vector<String> rooms = newUser.getHostname().split(":");
        if (rooms.size() == 2) {
            if (hostName.equals(rooms.elementAt(1))) {
                RoomsDAO roomsDAO = new RoomsDAO();
                return roomsDAO.getRoom(hostName);
            }
        }
}
}