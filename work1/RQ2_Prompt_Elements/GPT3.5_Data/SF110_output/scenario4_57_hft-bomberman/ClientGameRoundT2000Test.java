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
     * Test case for getting a player object by its id.
     */
    @Test
    void testGetPlayerById() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        Player player = new Player(1, "testPlayer");
        gameRound.addPlayer(1, new ClientPlayer(player));
        assertEquals(player, gameRound.getGameObjectById(1));
    }
    
    /**
     * Test case for getting a bomb object by its id.
     */
    @Test
    void testGetBombById() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        Bomb bomb = new Bomb(1, new Player(1, "testPlayer"), new Point(0, 0), 3, 1000);
        gameRound.addBomb(1, bomb);
        assertEquals(bomb, gameRound.getGameObjectById(1));
    }
    
    /**
     * Test case for getting a power-up object by its id.
     */
    @Test
    void testGetPowerUpById() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        PowerUp powerUp = new PowerUp(1, new Point(0, 0), Constants.POWERUP_BOMB);
        gameRound.addPowerUp(1, powerUp);
        assertEquals(powerUp, gameRound.getGameObjectById(1));
    }
    
    /**
     * Test case for getting a tile object by its id.
     */
    @Test
    void testGetTileById() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        Tile tile = new Tile(1, new Point(0, 0), Constants.TILE_TYPE_WALL, true, false, false);
        gameRound.createNewTile(new Point(0, 0), 1, Constants.TILE_TYPE_WALL, true, false, false);
        assertEquals(tile, gameRound.getGameObjectById(1));
    }
    
    /**
     * Test case for getting a non-existing object by its id.
     */
    @Test
    void testGetNonExistingObjectById() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        assertNull(gameRound.getGameObjectById(1));
    }
    
    /**
     * Test case for getting a player object with a non-existing id.
     */
    @Test
    void testGetPlayerWithNonExistingId() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        Player player = new Player(1, "testPlayer");
        gameRound.addPlayer(1, new ClientPlayer(player));
        assertNull(gameRound.getGameObjectById(2));
    }
    
    /**
     * Test case for getting a bomb object with a non-existing id.
     */
    @Test
    void testGetBombWithNonExistingId() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        Bomb bomb = new Bomb(1, new Player(1, "testPlayer"), new Point(0, 0), 3, 1000);
        gameRound.addBomb(1, bomb);
        assertNull(gameRound.getGameObjectById(2));
    }
    
    /**
     * Test case for getting a power-up object with a non-existing id.
     */
    @Test
    void testGetPowerUpWithNonExistingId() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        PowerUp powerUp = new PowerUp(1, new Point(0, 0), Constants.POWERUP_BOMB);
        gameRound.addPowerUp(1, powerUp);
        assertNull(gameRound.getGameObjectById(2));
    }
    
    /**
     * Test case for getting a tile object with a non-existing id.
     */
    @Test
    void testGetTileWithNonExistingId() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        gameRound.createNewTile(new Point(0, 0), 1, Constants.TILE_TYPE_WALL, true, false, false);
        assertNull(gameRound.getGameObjectById(2));
    }
    
    /**
     * Test case for getting a game object with an id of 0.
     */
    @Test
    void testGetGameObjectWithIdZero() {
        ClientGameRound gameRound = new ClientGameRound(null, null);
        assertNull(gameRound.getGameObjectById(0));
    }
}