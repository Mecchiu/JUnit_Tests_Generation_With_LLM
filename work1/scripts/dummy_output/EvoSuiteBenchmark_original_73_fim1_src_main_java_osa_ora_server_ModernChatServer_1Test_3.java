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
		
    private ClientInterface client;
    public RealmClient2 client2 = null;
    
    private ClientInterface loginClient;
    final Vector<ResultBean> results;

    /**
     * Constructor for the unit test class.
     */
    public ModernChatServer_1Test(){
        // create a fake client
        client = ClientInterface.getInstance();
        this.client2 = new RealmClient2();
        results = new Vector<>();        
    }
    
    @Test
    void ping(){
        boolean sendKickOff = false;
        boolean sendUserUpdatedStatus = false;
        boolean isConnected = false;
        boolean isServerShutted = false;
        try {
           // start ping thread
           PingServer pingThread = new PingServer();
           sendUserUpdatedStatus = pingThread.start();

           // sleep a while as the thread will need to run again to be ping server
           /*
           for (int i = 0; i < 50; i++){
               Thread.sleep(50);
            }
           */
           
           // wait for all threads to shut down
           ClientInterface[] clients = client.getClients();
            for (ClientInterface client : clients ) {
                isConnected = client.isConnected();
                if ( isConnected ){
                    if ( clients.length == 0 ) {
                        sendUserUpdatedStatus = client.disconnect();
                    }
                    Thread.sleep(50);
                }
            }
        }catch( Exception e){
            fail(e.getMessage());
        }
        assertTrue(sendUserUpdatedStatus);
        assertTrue( sendUserUpdatedStatus );
        assertTrue( sendPingThreads );
        assertFalse( loginClient.isConnected() );    
        assertFalse( loginClient.isLoggedIn() );
        assertFalse( loginClient.connectAdmin( client2 ) );
        assertFalse( loginClient.ping() );
    }
    
    @Test
    void pingThreadShouldPokeServerTwice(){
           PingServer pingThread = new PingServer();
           try {
               System.out.println("pingThread is running");
                sendUserUpdatedStatus = pingThread.start(); 
               
               sendUserUpdatedStatus = pingThread.start();
               sendUserUpdatedStatus = pingThread.start();
               sendPingThreads = pingThread.start();
           }catch( Exception e){
               fail(e.getMessage());
           }                
           assertTrue( sendUserUpdatedStatus );
           
           assertTrue( sendPingThreads );
        }
    /**
     * Test method for {@link osa.ora.server.threads.SendRefreshContactThread#sendRefreshContactSignal()}.
     */
    @Test
    void sendRefreshContactSignal_1() throws RemoteException, Exception {
        ClientInterface client = null;
        ClientInterface client2 = null;
        try {
            ClientInterface client3 = ClientInterface.getInstance();
            client = client2;
            // start sending signal
            SendRefreshContactThread signal = new SendRefreshContactThread();
            signal.start();
            System.out.println("the first thread sends this signal");
            SendRefreshContactThread signal2 = new SendRefreshContactThread();
            assertTrue(signal2.start());
            System.out.println("the second thread should send this signal");
            SendRefreshContactThread signal3 = new SendRefreshContactThread();
            assertTrue(signal3.start());
        }catch( Throwable e){
            fail(StringEncrypter.encode(e.getClass().getSimpleName(),"UTF-16"));
        }        

        assertTrue( client.isConnected());
        assertFalse( client.isLoggedIn() );
        assertFalse( client.getClients().length == 1 );
        assertFalse( client.disconnect() );
        assertEquals( 0.0d, client.getLastPingTime() );
}
}