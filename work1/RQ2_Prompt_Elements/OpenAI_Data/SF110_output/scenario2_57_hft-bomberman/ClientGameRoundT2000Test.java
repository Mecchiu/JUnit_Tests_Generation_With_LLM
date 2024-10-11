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
	* It tests if the method returns the correct GameObject.
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
	* It tests if the method returns null if the id is unknown.
	*/
	@Test
	void testGetGameObjectByIdUnknownId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(2));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is negative.
	*/
	@Test
	void testGetGameObjectByIdNegativeId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(-1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is zero.
	*/
	@Test
	void testGetGameObjectByIdZeroId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(0));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the maximum integer value.
	*/
	@Test
	void testGetGameObjectByIdMaxId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MAX_VALUE));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the minimum integer value.
	*/
	@Test
	void testGetGameObjectByIdMinId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MIN_VALUE));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the maximum integer value minus one.
	*/
	@Test
	void testGetGameObjectByIdMaxIdMinusOne() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MAX_VALUE - 1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the minimum integer value plus one.
	*/
	@Test
	void testGetGameObjectByIdMinIdPlusOne() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MIN_VALUE + 1));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the maximum integer value divided by two.
	*/
	@Test
	void testGetGameObjectByIdMaxIdDividedByTwo() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MAX_VALUE / 2));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObjectById(int)} method.
	* It tests if the method returns null if the id is the minimum integer value divided by two.
	*/
	@Test
	void testGetGameObjectByIdMinIdDividedByTwo() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(Integer.MIN_VALUE / 2));
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
	* It tests if the method returns the correct GameObject.
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
	* It tests if the method returns null if the id is unknown.
	*/
	@Test
	void testGetGameObjectByIdUnknownId() {
		ClientGameRound cgr = new ClientGameRound();
		GameObject go = new GameObject(1, new Point(1, 1));
		cgr.model.addGameObject(go);
		assertEquals(null, cgr.getGameObjectById(2));
	}
	
	/**
	* Test case for {@link ClientGameRound#getGameObject