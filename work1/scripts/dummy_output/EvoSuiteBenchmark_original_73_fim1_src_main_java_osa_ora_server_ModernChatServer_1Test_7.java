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
		
	//private Hashtable<String, Object> h = new Hashtable<String, Object>();
	
	private Vector<String> testdataList = new Vector<String>();
	
	@Test
	void testRun() throws Exception{
		
		testdataList.add("-1");
		
		// set data to the vector of test data
		// to start with -1
		
    	for(int i = 0; i < 3; i++){
    		Vector<Object> row = new Vector<Object>();
    		row.add(Double.toString(i));
    		row.add("user"+i);
    		table.setValueAt(""+i, testdataList.get(i), testdataList.get((i+1)));
    		
    	}
		
		// run the server
	    new SendServerSettingThread().start();
    }
	
	@Test
	void testRun2() throws Exception{

		/*	if(!testdataList.isEmpty()){
				System.out.println("Parsed server data " + testdataList + " " + "for test");
			} else{
				System.out.println("Parsing server data failed " + "for test");
				assertNotNull(StringEncrypter.decryptPassword(ServerSettingBean.getInstance().getServerSetting()));
			}*/
		
		//testdataList.clear();
		UnicastRemoteObject.exportObject(ClientInterface.IMS_SERVERBINDINGS_TMP, ClientInterface.IMS_SERVERBINDINGS_FILE, true);
		Vector<Object> row = new Vector<Object>();
//		Object[] tmp = {"client"+3, "test", "test", "test", "test"};
//		testdataList.add(tmp);
		
		
		
//		System.out.println("=========================");
		
		// if the server is already started, we have to stop it.
		System.out.println("Removing the old server: " + ServerSettingBean.getInstance().getServerSetting());
		
		Vector<String> list = new Vector<String>();
		list.add("server") ;
		list.add("1") ;
    	Enumeration<String> liste = list.elements();
    	while ( liste.hasMoreElements()){
    		
    		String str = liste.nextElement();
    		if(! list.contains(str) ) break;
    	}
	    
	    list.clear();
	    
	    list.add("server") ;
	    list.add("2") ;
	    list.add("new") ;
	    list.add("1") ;
	    list.add("2") ;
	    
	    
	    Enumeration<String> liste2 = list.elements();
	    while ( liste2.hasMoreElements()){
	    	String str = liste2.nextElement();
	    	if(! list.contains(str) ) break;
	    }
	    
    	new UnicastRemoteObject(ServerSettingBean.getInstance().getServerSetting().getBytes("UTF-8"));
    	
    	
	    
	    
	    Thread.sleep( 1000*10 );
    	// TODO: make run loop exit
//	    System.out.println("testRun2: test"+testdataList.get(3)+" = ");
		System.out.println(testdataList.get(3) + " = " + ServerSettingBean.getInstance().getServerSetting() + "\n");
		//send a message to the new server via UnicastRemoteObject
	    
		
    	
			table.setValueAt(testdataList.get(3), 1, 1);
		
		
		// send a message to the old one over UnicastRemoteObject
		//
}
}