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

	Logger logger = Logger.getLogger (GameModelTest.class);
	PlayerManager pm;
	Point start, end, winner;

	public GameModelTest (PlayerManager pm){
		this.pm = pm;
	}

	@Test
	/**
	 * Unit test method to access the {@link #checkForWinner()} method.
	*/
	public void testCheckForWinner(){
		//check for winner after start
		assertEquals(pm.start().getId(), CheckerManager.getWinner().get(GameModel.class).getId());
	}

	@Test
	/**
	 * Unit test method to get to the end of the game.
	*/
	public void testEnd(){
		winner = new Point (0, 0);

		Collection<RoundTimeOverMsg> timeOverMsgs = CheckerManager.getTimeOverMsgs ();
		timeOverMsgs.forEach(this::addMessage);

		//we wait for the GameModel#checkForWinner to return something.
		assertTrue (CheckerManager.getWinner().get(GameModel.class).getId() == -1);
	}

	private void addMessage(RoundTimeOverMsg timeOverMsg){
		logger.error ("ADDING: " + timeOverMsg.getClass () + " class: " + timeOverMsg.getClass().getName ());
		pm.addMessage(timeOverMsg);
		assertEquals (pm.addMessage(timeOverMsg), "1");
		assertEquals (pm.addMessage(timeOverMsg), winner.get());
	}

	@Test
	/**
	 * Unit test method to get all round time over messages stored in the game.
	*/
	public void testRoundTimeOverMessages(){
		Collection<RoundTimeOverMsg> timeOverMsgs = pm.getAllMsg();

		timeOverMsgs.forEach(this::addMessage);

		//we wait for the GameModel#checkForWinner to return something.
		assertTrue (CheckerManager.getWinner().get(GameModel.class).getId() == -1);
	}

	@Test
	/**
	 * Unit test method to check the size of the list of messages.
	*/
	public void testMessages(){
		Collection<RoundTimeOverMsg> timeOverMsgs = pm.getAllMsg();
		assertEquals(timeOverMsgs.size(), 0);

		//add a message
		start = new Point (50, 50);
		end = new Point (100, 50);
		pm.addMessage(new RoundTimeOverMsg (start, end, 1));
		timeOverMsgs = pm.getAllMsg();
		assertEquals(timeOverMsgs.size(), 1);
	}

    @Test
    /**
     * Unit test method to check the integrity of the list of messages.
     */
    public void testMessagesIntegrity(){
	Collection<RoundTimeOverMsg> timeOverMsgs = pm.getAllMsg();
	assertFalse (timeOverMsgs.isEmpty());
    }
    
    @Test
    /**
     * Unit test method to create a map and iterate through it.
     */
    public void testMessagesHashMap(){
    	StringBuilder sb = new StringBuilder();
    	Map<Integer, Integer> map = new HashMap<>(12, 10);
    	for (String s: new Vector<String>() {{

        		int i=0;
        		while (i < 10)
        			i++;

    		}})
    	sb.append(s).append('\n');
    	Collection<RoundTimeOverMsg> timeOverMsgs = pm.getAllMsg();
    	for (RoundTimeOverMsg message : timeOverMsgs)
    		map.put(message.getStart().getId(), message.getEnd().getId());

    	assertEquals (sb.toString(), map.toString());
    }

	@Test
	/**
	 * Unit test method to get a map from a collection of messages.
	*/
	public void testMessagesMap(){
		Collection<RoundTimeOverMsg> timeOverMsgs = pm.getAllMsg();
        	assertEquals (timeOverMsgs.size(), 0);	

        	Map<String, Integer> messageMap = new HashMap(6, 10);
        	for (RoundTimeOverMsg message: timeOverMsgs)
        		messageMap.put(message.getClass().getSimpleName(), message.getMsgId());
        	messageMap.put(RoundTimeOverMsg.class.getSimpleName(), roundTimeOverMsg.getMsgId ());
        	
        	/*
        	 * Check that it is possible to create a map from a collection of messages.
        	*/
        	assertEquals (new HashMap<>(5, 10).equals(messageMap), true);
	}

    @Test
    /**
     * Unit test method to check the integrity of the map.
     */
    public void testMessagesMapIntegrity(){
    	Map<Integer, Integer> map = new HashMap<>(5, 10);
    	for (RoundTimeOverMsg message: pm.getAllMsg())
    		map.put(message.getStart().getId(), message.getEnd().getId());
        	
    	assertTrue (messageMap.equals(map));
	}

	@Test
	/**
	 * Unit test method to add a collection of messages.
	*/
	public void testAdditionalMessages(){
		pm.addAdditionalMsg("1", "2", 1);
		pm.addAdditionalMsg("2", "1", 2);
		pm.addAdditionalMsg("1", "2", "3");
	}
}
