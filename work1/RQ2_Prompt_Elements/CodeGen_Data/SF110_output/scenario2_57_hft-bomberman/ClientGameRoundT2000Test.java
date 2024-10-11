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

    /** Logger. */
    static Logger logger = Logger.getLogger(ClientGameRoundTest.class);
    
    /**
     * Constructs a new test object for the given map.
     * @param gameModel The {@link GameModel} object to use.
     * @return The newly created test object.
     */
    public static ClientGameRoundTest createTestingTarget(GameModel gameModel){
    	return new ClientGameRoundTest((LocalControl) GameObjectFactory.createLocalGame(gameModel));
    }
    
    /**
     * Constructs a test object for the given map.
     * @param control The {@link LocalControl} object to use.
     */
    static ClientGameRoundTest createTestingTarget(LocalControl control){
    	return new ClientGameRoundTest(control);
    }
    
    /**
     * Initializes a test object for the given map.
     * @param control The {@link LocalControl} object to use.
     */
    ClientGameRoundTest(LocalControl control){
    	super();
    	model = control.getModel();
    	control.addObserver(this);
    }
    
	/**
	 * Initializes the test object for the given map.
	 * @param control The {@link LocalControl} object to use.
	 */
	ClientGameRoundTest(LocalControl control, Constants constants{
			Constants.GAME_MOVIE,
			Constants.MOVIE_BOMBAS,
			Constants.MOVIE_GOOMBA,
			Constants.MOVIE_HILLS,
			Constants.MOVIE_WATER
		}) {
    	super(control);
    	this.constants = constants;
    }
    
    /**
     * Obtains and returns the constants object from the control.
     * @return The constants object.
     */
    public static Constants getConstant(){
    	return constants;
    }
    
    /**
     * Returns the {@link GameModel} object from the map.
     */
    protected GameModel createGameModel(){
    	return new GameModel(map, constants.GAME_MOVIE, map.getWidth() - 2, map.getHeight() - 2);
    }
    
    /**
	 * Returns the {@link LocalControl} object from the map.
	 */
	protected LocalControl createControl(){
		return model.createLocalControl(true);
	}
    

	/**
	 * A test observer for the test object.
	 */
	private class TestObserver extends ForwardingObserver implements Observer {

        private final HashMap<Integer, GameObject> gameMap = new HashMap<>();

        public TestObserver(){
            super();
        }

        @Override
		public void update(Observable o, Object o1) {
			GameObject gameObject = getGameObject(o1);
			if (gameObject!= null) {
				GameObject existingGameObject = getGameObject(gameObject.getID());
				if (existingGameObject!= null) {
					if (existingGameObject.isAlive() || gameObject.isAlive()) {
					}
					else {
						return;
					}
				}
				
				gameMap.put(existingGameObject.getID(), gameObject);
			}
		}
        
        public HashMap<Integer, GameObject> getGameMap(){
            return gameMap;
        }
        
	}
    
    /**
     * A test observer for the test object.
     */
    private class TestObserver2 extends ForwardingObserver implements Observer {

        private final HashMap<Integer, GameObject> gameMap = new HashMap<>();

        public TestObserver2(){
            super();
        }

        @Override
		public void update(Observable o, Object o1) {
			GameObject gameObject = (GameObject) o1;
			if (gameObject!= null) {
				GameObject existingGameObject = getGameObject( gameObject.getID() );
				if (existingGameObject!= null) {
					if (existingGameObject.isAlive() || gameObject.isAlive()) {
					}
					else {
						return;
					}
				}
				
				gameMap.put(existingGameObject.getID(), gameObject);
			}
		}
        
        public HashMap<Integer, GameObject> getGameMap(){
            return gameMap;
        }
        
	}
    
 /**
  * A player view object.
  */
 private class PlayerView2 extends PlayerView {



        public PlayerView2(Player player) {

            super(player);
        }

 // Override default tile class from PlayerView with our own TileView.

     protected TileView getTileView() {
     	return (TileView) getGfxFactory().createTileView(getPlayer().getLocation());
     }

	protected Vector<Tile> getTiles() {
		Vector<Tile> tileVector = new Vector<>();
		PlayerView2 player = this;
		for (int i = 0; i< 2; i++) {
			Player player1 = this.getPlayer(i);
			for (int j = 0; j < 2; j++) {
				Player player2 = this.getPlayer(j);
			    TileView tile = new TestTileView(j, player1);
			    player2.getMap().getTiles().add(tile);
			    tile = new TestTileView(j, player2);
			    player1.getMap().getTiles().add(tile);
			    tileVector.add(tile);
			}
		}
		return tileVector;
	