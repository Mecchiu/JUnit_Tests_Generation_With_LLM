// BomberClient_1Test.java
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
* It contains one unit test case for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {

		/** The logger object. */
		private static final Logger logger = Logger.getLogger(BomberClient_1Test.class);

		/**
		* Connect to the server.
		*
		* @return
		*/
		private boolean connectToSrv() {
                logger.severe("STARTING CLIENT CLIENT: " + bomberName + " Server: " + serverName + " Port: " + port);

                Socket mySocket = null;
                try {
                        mySocket = new Socket(serverName, port);
                        logger.severe("Connected to " + mySocket.getInetAddress().toString());
                        logger.severe("Server name: " + serverName);
                        logger.severe(serverName);

                        //create client messages
                        msgSender = new ClientMsgSender(mySocket);
                        msgSender.start();

                        // create the map
                        Vector mapList = new Vector();
                        Message mapMsg = new MapInfo();
                        mapList.add(mapMsg);
                        msgSender.sendMsg(mapMsg);

                        // create session list (join request)
                        HashMap sessionList = new HashMap();
                        sessionMessage = new SessionDetailsMsg(bomberPlayer2Name, bomberType2Name, sessionList);
                        msgSender.sendMsgToMsgReceive(sessionMessage);

                        // create session list (join session)
                        sessionList = new HashMap();
                        sessionMessage = new JoinSessionMsg(bomberPlayer1Name, bomberType1Name, sessionList);
                        msgSender.sendMsgToMsgReceive(sessionMessage);

                        // read the map list
                        ClientMsgReceiver.readClientClients(mapList);

                        // get the map for the bomber1
                        BomberMap map2 = (BomberMap) mapList.get(0);
                        //send request to change bomber name from bomber1 to bomber2
                        mapMsg = new MapInfo();
                        mapMsg.setBomberName(BomberName.getLocalizedForName(map2.getBomber1Player())+" - " + map2.getBomber2Player());
                        listToSend.add(mapMsg);

                        // set bomber2 player as bomber2 player
                        BomberName.setLocalPlayerByBomber(map2.getBomber2Player());

                        //set bomber1 player as bomber1 player
                        BomberName.setLocalPlayerByBomber(map2.getBomber1Player());

                        //send request to show the map for bomber1
                        mapMsg = new MapInfo();
                        mapMsg.setBomberType(map2.getBomberType().getLocalizedName());
                        listToSend.add(mapMsg);

                        // get map list containing the map
                        ClientMsgReceiver.readClientClients(mapList);

                        // get the map and clear map list
                        mapList = new Vector();
                        ClientMsgReceiver.readClientClients(mapList);
                        BomberMap bomber1 = (BomberMap) mapList.get(0);
                        //clear list
                        listToSend.clear();

                        // set bomber1 player as bomber2 player
                        BomberName.setLocalPlayerByBomber(bomber1.getBomber1Player());

                        // set bomber1 player as bomber1 player
                        BomberName.setLocalPlayerByBomber(bomber2.getBomber1Player());

                        //set bomber1 player as bomber1 player
                        BomberName.setLocalPlayerByBomber(bomber2.getBomber1Player());

                        // set bomber2 player as bomber2 player
                        BomberName.setLocalPlayerByBomber(bomber2.getBomber2Player());

                        //send request to start map
                        if(player1.getName().equals(map1.getBomber1Player())){
                            startMapMsg = new MapInfo();
                            startMapMsg.setBomberName(startMapMsg);
                            listToSend.add(startMapMsg);
                        }
                        else
                        {
                            startMapMsg = new MapInfo();
                            startMapMsg.setBomberName(startMapMsg);
                            listToSend.add(startMapMsg);
                        }

                        // send request to change location
                        BomberMap bomber3 = (BomberMap) listToSend.get(0);
                        //TODO
                    /*  if (player2.getName().equals(map1.getBomber2Player()))
                   {*/
                    /*  }*/
                        
                        // get bomber1 player
                        BomberName.setLocalPlayerByBomber(bomber1.getBomber1Player());

                        // get bomber2 player
                        BomberName.setLocalPlayerByBomber(bomber2.getBomber1Player());

                        // send bomberMessage
                        BomberMessage bombermess = new BomberMessage(player2, BomberMessage.REQUEST_SHOW_MAP, startMapMsg);
                        msgSender.sendMsgToMsgReceive(bombermess);
                        ClientMsgReceiver.readClientClients(listToSend);
                        BomberMap map = (BomberMap) ClientMsgReceiver.readClientClients(mapList);
                        BomberMessage bomber3mess = new BomberMessage(player2,BomberMessage.SHOW_MAP, startMapMsg);
                        msgSender.sendMsgToMsgReceive(bomber3mess);

                        // set current location (on the bomber3 player)
                        