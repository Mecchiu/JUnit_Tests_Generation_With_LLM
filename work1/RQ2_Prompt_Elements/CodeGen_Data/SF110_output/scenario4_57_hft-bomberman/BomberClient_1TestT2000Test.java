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

	/**
	 * Returns the instance.
	 *
	 * @return
	 */
	public static BomberClient getInstance() {
		if (instance == null) {
			// Instance has not been created yet.
			instance = new BomberClient(Player.getPlayerName());
		}
		assertTrue(instance!= null,
                   "A class cannot be created on an initialisation.");
		return instance;
	}
	
	/**