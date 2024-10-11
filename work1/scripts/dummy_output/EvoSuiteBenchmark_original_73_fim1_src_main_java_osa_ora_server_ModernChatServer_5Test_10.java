// ModernChatServer_5Test.java
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
* It contains one unit test case for the {@link ModernChatServer#sendSecureTextMessage(TextMessage)} method.
*/
class ModernChatServer_5Test {
		int serverServerId =0;


	@Test
	public void testSendSecureTextMessage(){
		System.out.println("Server ID: "+StringEncoder64.encode(this.serverServerId ));
	}
}

/**
 * Main class for the testing.
 * @author ooransa
 *
 */
public class MainTestClass {

	/**
	 * Main method to test the constructor of the server.
	 * @param args : ignored.
	 * @throws java.lang.Exception
	 * @throws net.jini.unnamed.RemoteException
	 * @throws URISyntaxException
	 */
	public static void main(String[] args) throws Exception{
		NewClientCreator creator = new NewClientCreator();
		creator.setServerServerId(42);
		ServerSettingBean bean = creator.createNewNewServer();
		System.out.format("Server created:\n%s%n",  bean );
		// create the server
		ModernChatServer server = new ModernChatServer();
		server.run();
}
}

class NewClientCreator implements IClientCreator {
	
	@SuppressWarnings("hiding")
	private final ClientConfiguration config = new ClientConfiguration("localhost:9000");
	
	/**
	 * Class for the creation of servers.
	 * @return ServerSettingBean : the server setting bean class object.
	 */
	public final ClientConfiguration createClientConfiguration()
	{
		ClientConfiguration conf = new ClientConfiguration.ClientConfigurationImpl( config );
		return conf;
	}
	
	public final ServerSettingBean createServerSettingBean(String ipAddress, boolean authenticatedServer)
	{
		ServerSettingBean bean = new ServerSettingBean();
		bean.setIpAddress(ipAddress);
		bean.setAuthenticatedServer(authenticatedServer);
		return bean;
	}
	
	
	public final ClientInterface createNewNewServer() throws RemoteException, URISyntaxException
	{
		ServerSettingBean bean = createServerSettingBean( config.getHttpServerIp(), config.isAuthenticatedServer() );
		return new ClientInterface( createClientConfiguration(), new ClientInterface.ClientFactoryImpl( config, new ServerSettingBean() ) );
	}
     
}