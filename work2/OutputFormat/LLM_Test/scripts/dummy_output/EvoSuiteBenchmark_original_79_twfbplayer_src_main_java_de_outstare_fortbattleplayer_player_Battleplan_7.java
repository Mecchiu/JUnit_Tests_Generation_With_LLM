// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		
    /**
     * Test for NumberOfRounds method.
     */
    @Test
    public void testNumberOfRounds() {
        Battleplan bp=new Battleplan();
        
        assertEquals("Wrong number of rounds",0,bp.numberOfRounds());
    }

    /**
     * Test for numberOfRounds method.
     */
    @Test
    public void testNumberOfRoundsForRound() {
        Battleplan bp = new Battleplan();
        
        assertEquals("Wrong number of rounds for round",1,bp.numberOfRoundsForRound(0));
        assertEquals("Wrong number of rounds for round",1,bp.numberOfRoundsForRound(1));
        assertEquals("Wrong number of rounds for round",0,bp.numberOfRoundsForRound(5));
        assertEquals("Wrong number of rounds for round",1,bp.numberOfRoundsForRound(6));
        
    }
    
    @Test
    public void testGetPlayers() {
        Battleplan bp = new Battleplan();
        
        Collection<Player> players=bp.getPlayers();
        
        assertEquals("Wrong number of players in battleplan",3,players.size());
        assertEquals("Wrong number of players in battleplan",false,players.isEmpty());
        
    }
    
    @Test
    public void testGetPlayersFor() {
        Battleplan bp = new Battleplan();
        
        Collection<Player> players=bp.getPlayersFor(3);
        
        assertEquals("Wrong number of players in battleplan",2,players.size());
        assertEquals("Wrong number of players in battleplan",true,players.contains(new Player(3)));
        
    }

    @Test
    public void testGetPlayersForRange() {
        Battleplan bp = new Battleplan();
        
        Collection<Player> players=bp.getPlayersForRange(2);
        
        assertEquals("Wrong number of players in battleplan",2,players.size());
        assertEquals("Wrong number of players in battleplan",true,players.contains(new Player(2)));
        
    }

    @Test
    public void testEquals() {
        Battleplan b1 = new Battleplan();
        Battleplan b2 = new Battleplan();
        
        assertEquals("No battleplan objects should be identical",b1.equals(b2),true);
    }

    @Test
    public void testCompareTo() {
        Battleplan b1 = new Battleplan();
        Battleplan b2 = new Battleplan();
        int compareTo=0;
        
        
        assertEquals("A battleplan and an another battleplan is identical",0,b1.compareTo(b2));
        
    }

    @Test
    public void testSize() {
        Battleplan bp=new Battleplan();
        
 	assertEquals("Returned size isn't equal to 0",1,bp.size());
        
    }
    
    @Test
    public void testGetNumberOfRoundsMap() {
        Battleplan bp = new Battleplan();
        
        SortedMap <Integer, Integer> map=bp.getNumberOfRoundsMap();
        Collection <Integer> collection=map.keySet();
        
        assertEquals("Number of players is wrong",1,collection.size());
      
    }
    
    @Test
    public void testGetWinnerPosition() {
        Battleplan bp = new Battleplan();
        
        int w=0;
        int h=0;
        SortedMap <Tile, Integer> map=bp.getWinnerPosition(w,h);
        SortedMap <Integer, Integer> collection=map.keySet();
        
        assertEquals("Wrong winner position",w,collection.firstKey());
        assertEquals("Wrong winner position",tile(-8,-8),collection.get(w));
        assertEquals("Wrong winner position",h,collection.firstKey());
        assertEquals("Wrong winner position",tile(8,8),collection.get(h));

    }
    
    @Test
    public void testGetWinnerTileTile() {
        Battleplan bp = new Battleplan();
        
        Tile t=null;
        Tile tile=null;
        int w=-1;
        int h=-1;
        SortedMap <Tile, Integer> map=bp.getWinnerTileTile(t,w,h);
        SortedMap <Integer, Integer> collection=map.keySet();
        
        assertNull("Wrong winner tile",collection.firstKey());
        assertNull("Wrong winner tile",map.firstKey());
        assertEquals("Wrong winner tile",t,collection.firstKey());
        
    }

    private static final Logger LOG=Logger.getLogger(Battleplan.class.getName());
}