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
BomberClient_0Test() {
	}

	/**
     * Test method for
     * {@link client.ClientGameSession#SessionDetailsMsg(java.util.List)}
     *.
     */
	@Test
    public void testSessionDetailsMsgList() {
        try {
            /**
             * Passing in an empty list for a session does not throw an exception.
             */
            SessionDetailsMsg tempMsg = new SessionDetailsMsg();
            