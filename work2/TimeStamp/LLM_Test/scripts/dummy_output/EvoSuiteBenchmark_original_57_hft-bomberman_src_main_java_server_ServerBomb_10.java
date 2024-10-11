// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains one unit test case for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
		
	/**
	 * The {@link ServerBomb} object.
	 */
	private ServerBomb serverbomb;

	/**
	 * Returns {@link ServerBomb} object.
	 * @return
	 */
	ServerBomb getServerbomb() {
		return serverbomb;
	}

	private static final Logger logger = Logger.getLogger(ServerBombTest.class);

	/**
	 * The ServerBombTest object.
	 */
	private ServerBombTest() {
		serverbomb = new ServerBomb(new Point(0, 0), null);
		player = new Player(playerid);
		serverbomb.setPlayer(player);
	}
	
	@Test
	public void testTick() {
		//serverbomb.tickTest();

		// TODO: add another test
		if(serverbomb.tickTest()) {
			assertNotNull(serverbomb.bombs);
			assertTrue(serverbomb.bombs.size()>0);		
		}
				
		logger.info("--- testTick ---"); 
	}
	
	/**
	 * Test execution
	*/
	public void tickTest() {
		if(!serverbomb.tick("test"))
			fail();
	}

	/**
	 * Returns the time of the next frame.
	 * @return
	 */
	private int nextFrame() {
		if(session == null) {
			session = DBServiceFactory.createGameSession();
			session.init();
			session.setCurrentPlayerId(player.getId());
			session.setCurrentPlayer(player);
			session.setGameState(0);				
		}
		//System.out.println("session: "+session+ ", t0: "+session.getStartTime());
		int t = serverbomb.tick(session);
		//System.out.println("session: "+session+ ", t: "+t);
     	//System.out.println("server: "+serverbomb.getServerbomb()+ ", tick: "+t);		   	
		session = null;
		if (t == Player.STATE_DIE)
			throw new ThreadDeath();
				
		return t;
	}

	/**
	 * Test of fire method.
	 */
	public void testFire() {
		// TODO add test for fire

		Vector<GameObject> toBeExploded = new Vector<GameObject>();
	
		for (int j = 0; j < 4; j++) {
			// TODO add test for a loop below
			for (int i = 0; i < 4; i++) {
				Tile tile = DBServiceFactory.createTile("a");
				player.move(tile);
				// TODO add test for a loop above
				// Tile.generateNewTile(player.getId());
				
				//System.out.println("creating a tile: "+tile.toString()+ ", player is moving: "+tile.getPlayer().toString()+ ", x: "+tile.getX()+ ", y: "+tile.getY()+", width: "+tile.getWidth()+", height: "+tile.getHeight());
				Tile.generateNewTile(player.getId(), tile.getX(), tile.getY() + i);
				Tile.generateNewTile(player.getId(), tile.getX(), tile.getY() + (4 - i));
				Tile.generateNewTile(player.getId(), tile.getX() + (4 - i), tile.getY());
			}
		}
	
		serverbomb.fire(player);
		
		if (toBeExploded!= null) {
			for (int j=0; j < toBeExploded.size(); j++) {
				GameObject toBeExploded = toBeExploded.get(j);
				
				serverbomb.fire(toBeExploded);
				assertEquals(Session.STATE_READY, toBeExploded.getGameState());
			}
		}
	}

	/**
	 * Returns the server bomb.
	 * @return
	 */
	private ServerBomb getServerbomb() {
		return this.serverbomb;
	}
}