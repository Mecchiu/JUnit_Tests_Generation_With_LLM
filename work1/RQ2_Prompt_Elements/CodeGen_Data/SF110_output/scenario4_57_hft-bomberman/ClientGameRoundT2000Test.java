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

	private final static Logger logger = Logger.getLogger(ClientGameRoundedTest.class);

    private ClientGameRound gameRound = null;

    private GameModel model = null;

    /**
     * Sets the model to be used for this game.
     * The GameModel instance may be created from another game without a Model
     * as input but it is not required to be created yet.
     */
    public void setModel(GameModel model) {
        if (this.model!= null) {
            this.model.uninit();
        }
        this.model = model;


    }

    /**
     * Retrieves the model used for the game as input.
     *
     * @return The game model this game will be used for.
     */
    public GameModel getModel() {
        return model;
    }

    /**
     * Sets the