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
		
// This tests the setBowlBoms method.
	@Test
	public void testSetBowlBoms() {
		ClientPlayer testObject = new ClientPlayer(new Point(1, 0), 1);
		boolean canPaintBombs = testObject.canBowlBombs();
		testObject.setBowlBoms();
		// assert(canPaintBombs).
	}
//  @Test
//	public void testResetBowlBoms() {
//		ClientPlayer testObject = new ClientPlayer(new Point(1, 0), 1);
//		boolean canPaintBombs = testObject.canBowlBombs();
//		testObject.setBowlBoms();
//		// assert(canPaintBombs).
//		// testObj.resetBowlBoms();
//	}
	@Test
	public void testAddBomb() {
		ClientPlayer testObject = new ClientPlayer(new Point(1, 0), 1);
		boolean canBePlanted = testObject.canBowlBombs();
		testObject.addBomb();
		// assert(canBePlanted).
	}
//  @Test
//	public void testRemoveBomb() {
//		ClientPlayer testObject = new ClientPlayer(new Point(1, 0), 1);
//		boolean canBePlanted = testObject.canBowlBombs();
//		testObject.addBomb();
//		testObject.removeBomb();
//		// assert(!canBePlanted).
//	}
    @Test
    public void testPlantBomb() {
        ClientPlayer testObject = new ClientPlayer(new Point(1, 0), 1);
        boolean canPlantBomb = testObject.canBowlBombs();
        testObject.addBomb();
        // assert(canPlantBomb);
    }
}