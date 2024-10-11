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
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById2() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById3() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById4() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById5() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById6() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById7() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById8() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById9() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById10() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
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
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById2() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById3() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById4() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById5() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById6() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById7() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById8() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById9() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById10() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
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
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById2() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById3() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById4() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById5() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr.getGameObjectById(1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns the correct game object.
	*/
	@Test
	void testGetGameObjectById6() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(go, cgr