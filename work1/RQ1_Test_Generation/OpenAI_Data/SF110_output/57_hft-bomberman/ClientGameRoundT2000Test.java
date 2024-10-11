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

		private static final Logger logger = Logger.getLogger(ClientGameRoundTest.class);
		
		/**
		 * Test case for {@link ClientGameRound#getGameObjectById(int)}
		 * 
		 * @author Andi, Bj�rn
		 */
		@Test
		void testGetGameObjectById() {
				ClientGameRound clientGameRound = new ClientGameRound(null, null);
				
				// Test case 1
				GameObject gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(1);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(1));
				
				// Test case 2
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(2);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(2));
				
				// Test case 3
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(3);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(3));
				
				// Test case 4
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(4);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(4));
				
				// Test case 5
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(5);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(5));
				
				// Test case 6
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(6);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(6));
				
				// Test case 7
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(7);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(7));
				
				// Test case 8
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(8);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(8));
				
				// Test case 9
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(9);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(9));
				
				// Test case 10
				gameObject = new GameObject(new Point(0, 0));
				gameObject.setId(10);
				clientGameRound.model.addGameObject(gameObject.getId(), gameObject);
				assertEquals(gameObject, clientGameRound.getGameObjectById(10));
		}
}

// GameModel.java
/**
 */
package common;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;
import org.apache.log4j.Logger;

/**
 * Represents the model of the game. This class contains all game objects that
 * are currently in the game.
 *
 * @author Andi, Bj�rn
 */
public class GameModel extends Observable {

    /**
     * The game objects that are currently in the game.
     */
    private HashMap<Integer, GameObject> gameObjects;

    /**
     * The time that has passed since the game started.
     */
    private long time;

    /**
     * The observers that are observing this model.
     */
    private Vector<Observer> observers;

    private static final Logger logger = Logger.getLogger(GameModel.class);

    /**
     * Creates a new GameModel.
     */
    public GameModel() {
        gameObjects = new HashMap<Integer, GameObject>();
        observers = new Vector<Observer>();
    }

    /**
     * Adds a game object to this model.
     *
     * @param gameObject
     *            The game object to add.
     */
    public void addGameObject(int id, GameObject gameObject) {
        gameObjects.put(id, gameObject);
        setChanged();
        notifyObservers(gameObject);
    }

    /**
     * Removes a game object from this model.
     *
     * @param gameObject
     *            The game object to remove.
     */
    public void removeGameObject(GameObject gameObject) {
        gameObjects.remove(gameObject.getId());
        setChanged();
        notifyObservers(gameObject);
    }

    /**
     * Returns the game object with the given id.
     *
     * @param id
     *            The id of the game object to return.
     * @return The game object with the given id or null if no such object
     *         exists.
     */
    public GameObject getGameObjectById(int id) {
        return gameObjects.get(id);
    }

    /**
     * Returns the time that has passed since the game started.
     *
     * @return The time that has passed since the game started.
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets the time that has passed since the game started.
     *
     * @param time
     *            The time that has passed since the game started.
     */
    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Adds an observer to this model.
     *
     * @param observer
     *            The observer to add.
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Removes an observer from this model.
     *
     * @param observer
     *            The observer to remove.
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Notifies all observers that this model has changed.
     */
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this, null);
        }
    }

    /**
     * Notifies all observers that this model has changed.
     *
     * @param arg
     *            The argument that will be passed to the observers.
     */
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }

    /**
     * Snaps the location of the given bomb to the next intersection on the
     * grid.
     *
     * @param bomb
     *            The