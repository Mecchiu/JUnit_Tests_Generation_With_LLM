// ClientPlayerTest.java
package client;

import java.awt.Point;
import org.apache.log4j.Logger;
import sound.SoundPlayer;
import common.Actor;
import common.Constants;
import common.Player;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientPlayer}.
* It contains one unit test case for the {@link ClientPlayer#canBowlBombs()} method.
*/
class ClientPlayerTest {
		private static final Point p1 = new Point(2,2);
		private static final Point p2 = new Point(3,3);
		private static final Point p3 = new Point(4,4);
		private static final Point p4 = new Point(5,5);

		private static final Point p5 = new Point(4, 4);
		private static final Point p6 = new Point(5, 5);
		private static final Point p7 = new Point(3, 3);
		private static final Point p8 = new Point(5, 5);

		private static final Point p10 = new Point(2, 5);

		private static final Point p11 = new Point(3, 6);
		private static final Point p12 = new Point(5, 6);
		private static final Point p13 = new Point(4, 6);

		private static final Point p15 = new Point(2, 7);
		private static final Point p16 = new Point(3, 7);
		private static final Point p17 = new Point(4, 7);

		private static final Point p20 = new Point(2, 8);
		private static final Point p21 = new Point(3, 8);
		private static final Point p22 = new Point(4, 8);

		private static final Point p25 = new Point(2, 9);
		private static final Point p26 = new Point(3, 9);
		private static final Point p27 = new Point(4, 9);

		private Player[] players;

		/**
		 * Creates a new instance of the {@link ClientPlayerTest} class.
		 */
		public ClientPlayerTest() {
			players = new Player[9];
			players[0] = new Actor(5, 0, 0, p1.x, p1.y, 0, 0, null, p1, 0,
					new int[] { p5.x, p5.y, p6.x, p6.y });
			players[1] = new Actor(9, p10.x, 0, p11.x, p11.y, 0, 0, null, p11,
					p12.x, p12.y, new int[] { p4.x, p4.y, p6.x, p6.y });
			players[2] = new Actor(12, p20.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p8.x, p8.y, p7.x, p7.y });
			players[3] = new Actor(13, p21.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p15.x, p15.y, p16.x, p16.y });
			players[4] = new Actor(14, p20.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p2.x, p2.y, p6.x, p6.y });
			players[5] = new Actor(15, p21.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p3.x, p3.y, p7.x, p7.y });
			players[6] = new Actor(16, p20.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p4.x, p4.y, p5.x, p5.y });
			players[7] = new Actor(17, p21.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p6.x, p6.y, p7.x, p7.y });
			players[8] = new Actor(18, p21.x, p25.x, p26.x, p26.y, 0, 0, null, p26,
					p27.x, p27.y, new int[] { p8.x, p8.y, p10.x, p10.y });
		}

		/**
		 * Creates a clone of the instance of the {@link ClientPlayerTest}.
		 *
		 * @return a clone of the instance of the {@link ClientPlayerTest}.
		 */
		@SuppressWarnings("deprecation")
		public static ClientPlayerTest clone() {
			return new ClientPlayerTest();
		}
}