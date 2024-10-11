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
		
	/**
	* Set the server name. Expected to be empty if there is no server name set.
	*/
    @Test
    void serverNameSetShouldSendMessage() {
        logger.info("BomberClient_0Test.serverNameSetShouldSendMessage");
		BomberClient_0Test.setServerName("");
        assertNull(BomberClient_0Test.getServerName());
}
}