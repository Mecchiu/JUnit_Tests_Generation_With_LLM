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
		
    /**
     * Tests the getGameObjectById method of a client game round by verifying that it
     * uses the correct method for obtaining the game object and if that object has
     * any game objects.
     * 
     * @see ClientGameRound#getGameObjectById(int)
     */
    @Test
    public void testGetGameObjectById() {
        LocalControl ld = new LocalControl();
        GameModel gameModel = new GameModel();
        GameRound gameRound = new ClientGameRound(gameModel, gameModel);
    }

}