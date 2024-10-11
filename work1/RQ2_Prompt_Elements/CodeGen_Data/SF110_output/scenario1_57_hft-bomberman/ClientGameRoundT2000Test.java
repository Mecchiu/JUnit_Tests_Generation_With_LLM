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

  private static Logger myLogger = Logger.getLogger(ClientGameRoundTest.class);
	private static boolean firstTime = true;
	
	GameModel model;
	//GameView gameView, StatusView statusView;
		
	//GameView gameView;
	ClientGameRound modelInstance;
	
	//Vector<Player> players;
	PlayerView playerView;
	
	//Vector<Player> players;
		
	GfxFactory gfxfactory;
	
	boolean myFirstTime = true;
	@Test
	public void test1GetGameObjectById() {			
		if (myFirstTime == true) {
			myFirstTime = false;
			model = new GameModel(Constants.POWERUP_ID, Constants.BOMB_ID);
			modelInstance = new ClientGameRound(model);
			playerView = new PlayerView(modelInstance);
			playerView.init();
			statusView = new StatusView(model.getServer(), modelInstance);
			gfxfactory = GfxFactory.instance();			
		}
			
		BattleView battleView = new BattleView(modelInstance, new HashMap<String, Player>(), new HashMap<String, Player>());		
		gameView = new GameCanvas(map, battleView, myFirstTime);		
		//gameView = new GameCanvas(map, battleView, battleView.getOwner());
		
		Vector<Tile> tilePickedUp = new Vector<Tile>();
		Vector<Player> tilePickedUp2 = new Vector<Player>();
				
	    //playerPickedUp = new Vector<Player>();
	    
	    players = new Vector<Player>();
	    players.add(model.getOwner());
	    
	    
	    //players.add(model.getOwner());
	      
	    tilePickedUp = gfxfactory.getTilePicking(model, Tile.getRendererTop());
	    ArrayList<Tile> tilePickedUp2 = new ArrayList<Tile>();
	    tilePickedUp2.addAll(tilePickedUp);
	    playerView.setPickedUpTiles(tilePickedUp2);
	    BattleView battleView2 = new BattleView(modelInstance, new HashMap<String, Player>(), new HashMap<String, Player>());
	    gameView = new GameCanvas(map, battleView2, modelInstance);
	    //gameView = new GameCanvas(map, battleView2, battleView);
	    */
    
		Vector<Tile> tilePickedUp = new Vector<Tile>();
		Vector<Player> tilePickedUp2 = new Vector<Player>();
		
		//playerPickedUp = new Vector<Player>();
		//players.add(model.getOwner());
	 
		
		tilePickedUp = gfxfactory.getTilePicking(model, Tile.getRendererTop());	
		ArrayList<Tile> tilePickedUp2 = new ArrayList<Tile>();
		tilePickedUp2.addAll(tilePickedUp);
		playerView.setPickedUpTiles(tilePickedUp2);
				
		//ArrayList<Player> tilePickedUp2 = new ArrayList<Player>();
	    playerView.setPickedUpTiles(tilePickedUp2);
		//ArrayList<Player> tilePickedUp2 = new ArrayList<Player>();
		gameView.setPickedUpTiles(tilePickedUp2);
				
		mapWindow.setPlayer(modelInstance, model);
		mapWindow.setPlayView(modelInstance);
		myLogger.info("Starting game...");		
		gameView.start();		
		myFirstTime = true;
		
		while (modelInstance.isGameStarted() == false) {
			if (mapWindow.checkGameStarts() == true && myFirstTime == true) {
				break;
			}
			try {
				Thread.sleep(Constants.FIVE_SECOND);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		//assert (mapWindow.getPlayer()!= null);
		//mapWindow.changeViewToPlayer(modelInstance.getMap().getOwningPlayer());
		//mapWindow.changeViewToBomb();
		
		GameRound game = mapWindow.getGameWindow();
		ArrayList<Map> games = game.getGames();
		//GameRound game = mapWindow.getGameWindow();
        for (GameModel game2 : games) {
        	System.out.println("1: " + game2.getGame() );
        	System.out.println("2: " + game2.getRound() );
        }

//        for (int i = 0; i < games.size(); i++) {
//			System.out.println(i + ": " + games.get(i).getRound());
//		}
//		ArrayList<GameModel> gamesInWindow =
//	                mapWindow.getAllGameModels();
//        for (int i = 0; i < gamesInWindow.size(); i++) {
//			System.out.println(i + ": " + gamesInWindow.get(i).getGame());
//   }
	}

	
	
	@Test
	public void test2GetGameObjectById2() {
		
		//playerView.setPlayer((Player) model.getPlayer().get(0));
		//playerView.setBombs((Bomb) model.getBombs().get(0));
		
		
		/*Vector<Tile> tilePickedUp = new Vector<Tile>();
		Vector<Player> tilePickedUp2 = new Vector<Player>();
		
		playerView.setPickedUpTiles(tilePickedUp2);
		ArrayList<Tile> tilePicked