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
		public static boolean firstRun = true;

        private static final Logger logger = Logger.getLogger(GameModelTest.class);

    @Test
    public void test() {
    	
        if (!firstRun) {
            logger.debug("First run : ");
        }
        
        logger.debug("Time of test : " + time);
        
        
        if (time == Constants.time) {
            assertNotNull(getWinner());
        }
        
}
        
	
	
        
}