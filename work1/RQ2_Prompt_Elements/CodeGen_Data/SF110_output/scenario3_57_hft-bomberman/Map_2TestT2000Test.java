// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {

	private int  playerNo = 1;
	private Position position;
	// private Map map;
	private Vector<PowerUp> powerUpList = new Vector<PowerUp>();
    private Map map;
    /**
     * test constructor
     * @throws Exception - exception thrown to test if all fields are set
     */
    public Map_2Test() throws Exception {
		
		// map = new Map();      
        map = createMapWithPos();
        
        for (Tile tile : map) {
            System.out.println("Tile : " + tile);
        }
    }

    /**
     * test with no position set
     */
    @Test
    public void testGetNoPosition() {
        // map = new Map();
        System.out.println("No position set");
        assertNull(map.getStartPoint(playerNo));
    }

    /**
     * test with position set
     */
    @Test
    public void testWithPosition() {
        pos = new Position(new Point(23, 34), new Date(342347.541));
        System.out.println("pos : " + pos);
        Map map1 = createMapWithPos();
//        System.out.println("map1 : " + map1);
        System.out.println(map1);
        // assertTrue(map1 == map);
        assertEquals(pos.getX(), map1.getStartPoint(playerNo).getX());
        assertEquals(pos.getY(), map1.getStartPoint(playerNo).getY());
        assertEquals(pos.getLatitude().getLatitude(), map1.getStartPoint(playerNo).getLatitude().getLatitude());
        assertEquals(pos.getLongitude().getLongitude(), map1.getStartPoint(playerNo).getLongitude().getLongitude());
        System.out.println("start point of tile : " + map1.getStartPoint(playerNo)
                            .getX());
        System.out.println("end point of tile : " + map1.getEndPoint(playerNo).getX());
        System.out.println("start point of tile : " + map1.getEndPoint(playerNo).getY());
        System.out.println("end point of tile : " + map.getEndPoint(playerNo).getX());
        System.out.println(map.getPosition());
        assertEquals(pos.getLatitude(), map.getPosition().getLatitude());
        assertEquals(pos.getLongitude(), map.getPosition().getLongitude());
    }
	
	/**
     * get end point coordinates for tile with powerup with no position set
     * @return Point with coordinates
     */
	public Point getEndPointTile() {
		return map.getEndPoint(playerNo);
	}

	/**
     * get start point coordinates for tile with powerup with no position set
     * @return Point with coordinates
     */
	public Point getStartPointTile() {
		return map.getStartPoint(playerNo);
	}

	/**
     * create map with playerNo position set
     * @return 
     */
    public Map createMapWithPos() {
        Position  start = new Position(23, 34);
        Position  end = new Position(64, 75);
        Vector<PowerUp> powerUps = new Vector<PowerUp>();
        // powerUps.add(new PowerUp(new Point(50, 35), new Point(0, 2), new
        // Point(30.6, 15.2), new Vector<String>(), new Date(361371.541),
        powerUpList.size()));
        Iterator<PowerUp> it = powerUps.iterator();
        powerUpList.iterator();
        // powerUps.add(new PowerUp(new Point(50, 33), new Point(0, 2), new
        // Point(30, 1), new Vector<String>(), new Date(361371.543),
        // it)//
        // powerUps.iterator();
        while (powerUpList.size() < 2) {
            powerUpList.add(it.next());
            powerUps.add(it.next());
        }
        System.out.println(powerUps);
        System.out.println(powerUpList);
        pos = start;
		map = new Map(powerUps,
				pos.getLatitude().getLatitude(),
				pos.getLongitude().getLongitude(),
				3);
		return map;
    }

	/**
     * create map with pos set with powerup position set
     * @return 
     */
    public Map createMapWithPosAndPowerup() {
        MoveToPos   pos = new MoveToPos(new Point(23, 34), new Date(342347.541));
        Position posi = new Position(new Point(23, 34), new Date(342347.541 + 2000));
        Vector<PowerUp> powerUps = new Vector<PowerUp>();
        powerUps.add(new PowerUp(new Point(50, 33), new Point(0, 2), new Point(30,
                1), new Vector<String>(), new Date(361371.543), it));
        Iterator<PowerUp> it = powerUps.iterator();
        powerUps.iterator();
        System.out.println(powerUps);
        System.out.println(powerUpList);
        posi = new Position(new Point(23, 34), new Date(342347.541 + 1000));
        map = new Map(powerUps, posi.getLatitude().getLatitude(), pos
               .getLongitude().getLongitude(), 3);
        return map;
    }

    /**
     * delete powerUpList if powerup is NULL
     */
    public void deletePowerUpIfNull() {
        if (powerUpList.isEmpty()) {
            powerUps = null;
        }
    }

	/**
     * @return
     */
    public Vector<Tile> getTiles() {
        Vector<Tile> tiles = new Vector<Tile>();
        System.out.println("");
        Tile tile = new Tile(new Point(23, 34), new Date(342347.541), new Vector<String>()
                              , new Vector<PowerUp>(), 3);
        System.out.println(tile);
        System.out.println("tiles : " + tiles);
        tiles.add(tile);
        return tiles;
    }
}
