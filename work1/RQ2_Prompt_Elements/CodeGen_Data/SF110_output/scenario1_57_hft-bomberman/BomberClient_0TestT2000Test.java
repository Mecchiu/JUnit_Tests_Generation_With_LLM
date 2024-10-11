// BomberClient_0Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains one unit test case for the {@link BomberClient#getInstance()} method.
*/
class BomberClient_0Test {
public static final Logger logger = Logger.getLogger(BomberClient_0Test.class.getName());

		public static ArrayList<Integer> getIntArray1() {

		List<Integer> listIntArray = new ArrayList<Integer>();
		listIntArray.add(44);
		listIntArray.add(55);
		return listIntArray;
		}

		public static HashMap<String, Object> getMapHash() {
			//TODO: test code
			HashMap <String, Object> hashMaptemp = new HashMap<String, Object>();
				hashMaptemp.put("Key1", "Value1");
				hashMaptemp.put("Key2", "Value2");
			return hashMaptemp;
		}

		public static List<Object>  getListObject1() {
				List<Object> listListObject = new ArrayList<Object>();
				listListObject.add("Hello");
				listListObject.add("World");
				return listListObject;
		}

		/**
		* Test method for {@link client.network.ClientMsgReceiver#processClientMessage(java.lang.String)}.
		*/
		@Test
		public void testProcessClientMessage() throws IOException {
				BomberClient bomberClient =getInstance();
				ClientMsgReceiver clientMsgReceiver = new ClientMsgReceiver();

	        ClientMsgSender client_sender = new ClientMsgSender();
	        List<Message> messages_sender = new ArrayList<Message>();
				/*
				Client msgReceiver = clientMsgReceiver;
		    Vector<Vector<String> > listVector = bomberClient.getIntArray1();
				*/
	        
				String str_temp = "Hello world!";
				String str_message = bomberClient.getIntArray1()
		.get(0).toString();


				String str_temp_1 = "Hello world!";
				String str_message_1 = bomberClient.getIntArray1().get(
		1.5)
		.toString();

				int int_result = str_temp.length();
		String str_temp_2 = "Hello world!";

//	        str_temp_1 = str_temp.substring(1, 5);
				str_temp_1 = bomberClient.getIntArray1().get(0).toString();
//	        str_temp_2 = bomberClient.getIntArray1().get(5).toString();
		
				int int_result_1 = str_temp.length();
				str_temp_1 = bomberClient.getIntArray1().get(0).toString();

				clientMsgReceiver.processClientMessage(str_message);
				clientMsgReceiver.processClientMessage(str_temp_1);
			
				messageList = clientMsgReceiver.getClientMessages();
				boolean temp = false;
		
				//client_sender.setReceivingOn(true);
		
				System.out.println("Message List: " + messageList);
				
		
				System.out.println();
				System.out.println("test1");
				System.out.println(temp);
				System.out.println(ClientGui_1.testString);
		
				client_sender.setReceivingOn(true);
				System.out.println("Message List: " + messageList);
				assertTrue(str_temp.substring(0, 1).equalsIgnoreCase(str_temp_1));
				assertTrue(str_temp_1.substring(0, 1).equalsIgnoreCase(str_temp_2));
				
				return;
		}
		@Test
		public void testSetReceivingOn() {
				BomberClient bomberClient =getInstance();
				ClientMsgSender client_sender = new ClientMsgSender();
				
				Vector<Vector<String> > listVector = new ArrayList<Vector<String>>();
				listVector.add(new Vector<String>());
				listVector.add(new Vector<String>());

				ClientGui_1 clientMsgReceiverGui = new ClientGui_1("ClientGUI");
				ClientGui_2 clientMsgReceiverGui1 = new ClientGui_2("ClientGUI");
				
				
				
	
			
//				client_sender.setReceivingOn(true);
//			client_sender.setReceivingOn(false);

				clientMsgReceiverGui.testSetReceivingOn_1();
				System.out.println();
				

	
	
	clientMsgReceiverGui1.testSetReceivingOn_11();
				System.out.println();


				
				clientMsgReceiverGui1.testSetReceivingOn_2();
				System.out.println();
				
		
				clientMsgReceiverGui1.testSetReceivingOn_2_2();
				System.out.println();
		
		
		/*
		 * Test method  for   {@link client.network.ClientMsgReceiver#processClientMessage(java.lang.String)}.
		*/
						System.out.println();
						ClientMsgReceiver clientMsgReceiver = new ClientMsgReceiver();
		//	    String str_message = bomberClient.getIntArray1()
		.get(0).toString();
		
			
			
				clientMsgReceiver.processClientMessage(str_message);

			//clientMsgReceiver.processingInfoMsg (String,String,String,String,String);
			


	

							 
			/*
			
			String str_temp = "Hello world!";
			String str_message = bomberClient.getIntArray1()
		.get(0).toString();
		int int_result = str_temp.length();
				str_temp = bomberClient.getIntArray1().get(0).toString();
			*/
				
		
				int int_result = str_temp.length();
				str_temp = bomberClient.getIntArray1().get(0).toString();



	

				
		return;

	}
}


//  Class to hold all client messages received by the client.
class ClientMsgReceiver {

	
	
	
	
	
		/*
		 * This class contains the information about