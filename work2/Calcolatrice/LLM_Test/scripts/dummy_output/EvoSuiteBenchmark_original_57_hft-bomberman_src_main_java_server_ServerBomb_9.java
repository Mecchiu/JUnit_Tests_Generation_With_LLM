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
		
	@Test
	public void shouldTick() {
		session = new ServerGameSession();
		//
		
		// Check that the server has been run
		assertNotNull(new ServerBomb().tick());
	}
	
	@Test
	public void shouldExamineCollision()
	{
			
		
	
		// Test whether the server's own bullet-targets are taken into account in the hit tests
		Collection<GameObject> bulletObjects = new ServerBomb(Constants.BULLET_TARGET_NANO_X,session).attack(new Player("player01"),1);
		determineHits(bulletObjects);
		
		assertNotNull("should have a bullet target",Bullet.class.isAssignableFrom(bulletObjects.iterator().next().getClass()));
		determineHits(bulletObjects);
}

/**
* Test class of {@link ServerBomb.ServerBomb}.
* It contains one unit test case for a {@link ServerBomb}.
*/
class ServerBombTest extends ServerBomb {
	
	Player player1;
	Player player2;
	
	/**
    public ServerBombTest(Player player1, Player player2)
    {
    this.player1 = player1;
    this.player2 = player2;
    }
	*/
	
	@Test
	public void shouldAttack()
	{
		Battle b = new Battle(new ServerBomb(Constants.NANO_BULLET_TARGET_X, player1, player2, true), player1, player2, new ServerGameSession());
	}
	
	@Test
	public void shouldAttack()
	{
	//
		DBServiceFactory.getDBService().createEntity(new Entity(null, Constants.NANO_BULLET_TARGET_X, 0));
	}
	
	
}
}