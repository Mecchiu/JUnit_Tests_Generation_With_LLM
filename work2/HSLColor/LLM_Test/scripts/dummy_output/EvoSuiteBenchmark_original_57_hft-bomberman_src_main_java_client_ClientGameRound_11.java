// ClientGameRoundTest.java
package client;

import java.awt.Point;
import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import org.apache.log4j.Logger;
import client.controller.LocalControl;
import client.gui.StartFrame;
import client.network.ForwardingObserver;
import client.view.BombView;
import client.view.GameCanvas;
import client.view.GameView;
import client.view.GfxFactory;
import client.view.OffGamePainter;
import client.view.PlayerView;
import client.view.PowerUpView;
import client.view.StatusView;
import client.view.TileView;
import common.Bomb;
import common.Constants;
import common.GameModel;
import common.GameObject;
import common.GameRound;
import common.Map;
import common.Player;
import common.PowerUp;
import common.Tile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientGameRound}.
* It contains one unit test case for the {@link ClientGameRound#getGameObjectById(int)} method.
*/
class ClientGameRoundTest {
		
	private static final Logger log = Logger.getLogger(ClientGameRoundTest.class);
		
	private ClientGameRound instance;
	
	private boolean offGamePaintterStopped = false;
		
	public ClientGameRoundTest(){
	}
	
	/**
	 * Sets up the test.
	 */
	@Test
	public void testCreaturesAreCreated(){		
		assertNotNull(((ClientGameSession) instance.getSession()).engine);
	}

	/**
	 * Gets a unique GameObject from the GameModel.
	 *
	 * @param player
	 * @return GameObject
	 */
	public GameObject getGameObjectById(int id) {
		return (GameObject)this.model.getGameObjectById(id);
	}

}