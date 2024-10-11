// GameModelTest.java
package common;

import java.awt.Point;
import java.util.Collection;
import java.util.HashMap;
import java.util.Vector;
import java.util.Map.Entry;
import messages.round.RoundTimeOverMsg;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameModel}.
* It contains one unit test case for the {@link GameModel#checkForWinner()} method.
*/
class GameModelTest {
		
	// GameModelTest class variables
	public static long GameModelTestTime = System.currentTimeMillis();

	public void startTest();
	
	public void createGame();

	public void update();
	public void snapToGrid();
	public int getRoundedTime(GameObject obj);
	public Collection<GameObject> getGameObjects();
	public boolean checkForWinner();
}