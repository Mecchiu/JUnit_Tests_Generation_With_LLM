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
		
    @ServerGameSession
    private ServerGameSession session;
    
    @ServerGameSession
    public ServerGameSession getSession() {
        return session;
    }
    
    @ServerGameSession
    private DBGameUser createNewSession() throws DBException;

    @ServerGameSession
    private DBGameUser createNewSession(String playerName,
            Collection<GameObject> gameObjects) throws DBException;

    /**
     * Initialize the server and create a new connection to the server.
     */
    @ServerGameSession
    private DBGameUser createNewSession();

	@Test
	public void testTick() throws DBException {
		this.createNewSession();
		assertNotNull(this.session.tick());
	}

	@Test
	public void testTickWithAlreadyExploded() throws DBException {
		this.getSession().setPlayer(1);
		this.getSession().getUser().setMaxGameState(GameObject.State.PLAYER_INACTIVE);
		this.getSession().getUser().setState(Player.State.INACTIVE);
		this.session = this.createNewSession();
		assertNull(this.session.tick());
	}

	@Test
	public void testTickWithoutAlreadyExploded() throws DBException {
		this.getSession().removeGameObject();
		this.getSession().getUser().setMaxGameState(GameObject.State.PLAYER_INACTIVE);
		this.getSession().getUser().setState(Player.State.INACTIVE);
		this.session = this.createNewSession();
		assertEquals(false, this.session.tick());
	}

	@Test
	public void testTickWithoutExploded() throws DBException {
		this.session = this.getSession();
		Collection<GameObject> gameObjects = new Vector<>();
		int numOfGAMEOBJECTS = 5;
		for (int i=0; i<numOfGAMEOBJECTS; i++) {  
			Entity entity = new Player(this.session, "Player-"+i);
			entity.setOwner(this.session);
			entity.setState(Player.State.ACTIVE);
			if (i<7)
				gameObjects.add(entity);
			else
				entity.explode();
		}
		this.getSession().removeGameObject();
		this.getSession().addGameObjects(gameObjects);
		assertTrue("ServerBomb should have only reached the next state.", this.getSession().getState() == Player.State.ACTIVE);
		this.getSession().getGameState();
	}

	@Test
	public void testTickWithTooManyExploded() throws DBException {
		this.getSession().setPlayer(1);
		this.getSession().setTileEntity(0, 5);
		this.getSession().getUser().setMaxGameState(GameObject.State.WON);
		this.getSession().getUser().setState(Player.State.WON);
		this.session = this.createNewSession();
		try {
			this.session.tick();
			this.getSession().tick();
			fail("ServerBomb should have reached a broken state.");
		}
		catch (DBException e) {
			logger.debug(e.getStackTrace());
			checkHit(null);
		}
		catch (AssertionFailedError e) {
			logger.debug(e.getStackTrace());
			fail("ServerBomb should not reach a broken state.");
		}
	}

	@Test
	public void testTickWithExploded() throws DBException {

		this.getSession().getUser().setMaxGameState(GameObject.State.WON);
		this.getSession().getUser().setState(Player.State.WON);
		this.getSession().setTileEntity(0, 5);
		this.getSession().setPlayer(3);
		this.session = this.createNewSession();
		this.session.tick();
		this.session.removeGameObject();
		this.session.addGameObjects(Constants.PLAYER_TABLE_WONO);
		int numOfExplodedGameObjects = 5;
		int tile = 0;
		int tileX = 9;
		int tileY = 8;

}
}