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
		public static final int idOffset = -1;
		public static final int MAX_SESSION_ID = 0xfff;
		public static final int MAX_MAP_ID = 256;

		/**
     * Instantiates a new bomber client.
     */
    public BomberClient_0Test() {

    }

    /**
     * Tests the constructor.
     *
     * @throws IOException
     *             if there is a network error.
     */
}