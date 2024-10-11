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
		private static final double DELAY_TIME = 0.2;

		/**
		 *
		 */
		private static final int MIN_SESSION_ID = -2;

		private static final int MAX_SESSION_ID = 20;

		private static final int ONE_GALLON_ID = 1;

		private static final int ONE_ROOMID = 1111;

}