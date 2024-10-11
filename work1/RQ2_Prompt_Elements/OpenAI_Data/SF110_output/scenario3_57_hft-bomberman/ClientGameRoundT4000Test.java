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
* It contains ten unit test cases for the {@link ClientGameRound#getGameObjectById(int)} method.
*/
class ClientGameRoundTest {

	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id.
	*/
	@Test
	void testGetGameObjectByIdValidId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(gameObject, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with an invalid id.
	*/
	@Test
	void testGetGameObjectByIdInvalidId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(2));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a negative id.
	*/
	@Test
	void testGetGameObjectByIdNegativeId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(-1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a zero id.
	*/
	@Test
	void testGetGameObjectByIdZeroId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(0));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a null id.
	*/
	@Test
	void testGetGameObjectByIdNullId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(null));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject() {
		ClientGameRound clientGameRound = new ClientGameRound();
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject2() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject3() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject4() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject5() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject6() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject7() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject8() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject9() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject10() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
}

// ClientGameRound.java
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

/**
 * Represents a game on the client side. This class serves as a connection
 * between the model, view and game loop.
 *
 * @author Andi, Bj�rn
 */
public class ClientGameRound extends GameRound implements Observer {

    /**
     * Searches and returns a GameObject by its id.
     *
     * @param id The id of the GameObject that should be returned.
     * @return The matching GameObject or null if the id is unknown.
     */
    public GameObject getGameObjectById(int id);
}

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
* It contains ten unit test cases for the {@link ClientGameRound#getGameObjectById(int)} method.
*/
class ClientGameRoundTest {
		
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id.
	*/
	@Test
	void testGetGameObjectByIdValidId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(gameObject, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with an invalid id.
	*/
	@Test
	void testGetGameObjectByIdInvalidId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(2));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a negative id.
	*/
	@Test
	void testGetGameObjectByIdNegativeId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(-1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a zero id.
	*/
	@Test
	void testGetGameObjectByIdZeroId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(0));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a null id.
	*/
	@Test
	void testGetGameObjectByIdNullId() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(null));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject() {
		ClientGameRound clientGameRound = new ClientGameRound();
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject2() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the method with a valid id and a null gameObject.
	*/
	@Test
	void testGetGameObjectByIdValidIdNullGameObject3() {
		ClientGameRound clientGameRound = new ClientGameRound();
		GameObject gameObject = new GameObject(1, new Point(1, 1));
		clientGameRound.addGameObject(gameObject);
		clientGameRound.removeGameObject(gameObject);
		assertEquals(null, clientGameRound.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* The test case tests the