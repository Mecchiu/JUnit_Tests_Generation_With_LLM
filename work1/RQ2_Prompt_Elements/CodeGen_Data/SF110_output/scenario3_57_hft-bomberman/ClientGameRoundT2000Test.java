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
private static final Logger log = Logger.getLogger(ClientGameRoundTest.class.getName());
	
	//TODO: Implement these two variables.
    
    // GameObject of the game
    private GameObject m_GameObject;
    
    // Canvas of the game
    private GameCanvas m_Canvas;
    
    // Canvas of the game with OffGamePainter
    private GameCanvas m_OffGameCanvas;
    
    // Player of the game
    private Player m_Player;
    
  // Canvas of the game with PlayerView and PowerUpView
   private GameCanvas m_MainCanvas;
   private PowerUpView m_PowerUpView;
   
    // Turn number (0 = North)
    private int m_TurnNumber;
    
    // GameObject for the bomb
    private Bomb m_Bomb;
    
    // Canvas (the main view) of the game
    private GameCanvas m_mainCanvas;
    
    // Canvas (Offgame view) for the game
    private GameCanvas m_offCanvas;
    
    // List of Map and GameObjects 
    private Vector<Map> m_MapList;
    
    // Map and GameObjects
    private HashMap<String, GameObject> m_GameObjectList;
    
    // Player of the game
    private Player m_Player;
    
  /**
   * This constructor is just a place holder for the {@link ClientGameRoundTest#testGetGameObjectById()} method. 
   * It is intended for future use.
   */
    public ClientGameRoundTest(){}
  
    /**
     * This constructor creates and initializes a new client game frame.
     *
     * @param player The current player.
     * @param turnNumber The current turn number.
     * @param gfxFactory The gfx factory.
     * @param playerList The player list.
     */
    public ClientGameRoundTest(int player, int turnNumber, GfxFactory gfxFactory,Vector<Player> playerList, Vector<Map> mapList) {
        m_TurnNumber = turnNumber;
        m_GameObject = gfxFactory.createGameObject(player);
        m_GameObject.setTick(Constants.START_TICK);
        m_MapList = mapList;
        m_GameObjectList = gfxFactory.createGameObjectList(player);
        m_OffGameCanvas = new GameView(player);
        m_mainCanvas = new GameView(player);
        
        PlayerView mainPlayerView = new PlayerView();
        PlayerView offGamePlayerView = new PlayerView();
        OffGamePainter offGamePainter = new OffGamePainter();
        
        log.debug("new create");
        if(player == 1){
            m_OffGameCanvas = new StatusView();
            m_mainCanvas = new PowerUpView();
            m_mainCanvas.setPlayerObject(player);
            
            MainFrame frame = new StartFrame();
            frame.addView(m_OffGameCanvas);
            frame.addView(m_mainCanvas);
            frame.addView(offGamePlayerView);
            frame.addView(mainPlayerView);
            frame.addFrameListener(player);
            frame.launchFrame();
        }else if(player == 2){
            m_OffGameCanvas = new StatusView();
            m_mainCanvas = new PowerUpView();
            m_mainCanvas.setPlayerObject(player);
            
            OffGamePainter offFrame = new OffGamePainter();
            m_OffGameCanvas.addView(offFrame);
            m_OffGameCanvas.addView(m_mainCanvas);
            m_mainCanvas.addFrameListener(player);
            m_offGameView = new PowerUpView();
            m_offGamePainter = new OffGamePainter();
            m_offGameView.setPlayerObject(player);
            
            offFrame.addView(m_offGameCanvas);
            offFrame.addView(m_offGamePainter);
            offFrame.addView(m_mainCanvas);
            offFrame.addFrameListener(player);
            offFrame.launchFrame();
        }
        log.debug("creating list and map of gfx");
        for (Map map : mapList)
            gfxFactory.createGameObjectList(map);
        
        
        // Create Map views
        m_mainCanvas = new GameView(1);
        m_offCanvas  = new GameView(2);
	
        TileView mainTileView = new TileView();
        TileView offTileView = new TileView();
        m_offCanvas.addView(offTileView);
        m_offCanvas.addView(mainTileView);

        TileView mainTilesView = new TileView();
        TileView mainTileWithPowerUp = new TileView();
        
        for (Map map: mapList)
        {
            Tile mainTile = gfxFactory.createTile(map.getId());
            Tile offTile = gfxFactory.createTile(Constants.OFFGAME_TILE);

            TileView tileView = new TileView(map.getId());
            addTileIntoListView(mainTileView, mainTile);
            tileView.addTileIntoView(m_offTileView);

            addTileIntoListView(offTileView, offTile);

            m_mainCanvas.addTileIntoView(tileView);
                
            TileView tileViewWithPowerUp = new TileView(map.getId());
            addTileIntoListView(m_mainTilesView, mainTileWithPowerUp);
            