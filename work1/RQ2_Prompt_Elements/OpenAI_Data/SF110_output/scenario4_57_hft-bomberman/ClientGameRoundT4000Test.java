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
		
		private ClientGameRound clientGameRound;
		
		private GameModel model;
		
		private GameView view;
		
		private ClientGameLoop gameLoop;
		
		private GfxFactory gfxFactory;
		
		private Player localPlayer;
		
		private ClientGameSession session;
		
		private Thread offGamePainter;
		
		private GameCanvas gameCanvas;
		
		private ForwardingObserver forwardingObserver;
		
		private int id;
		
		private ClientPlayer player;
		
		private Bomb bomb;
		
		private Map map;
		
		private LocalControl localControl;
		
		private Observable o;
		
		private Object arg;
		
		private GameObject gameObject;
		
		private int countdown;
		
		private String string;
		
		private long time;
		
		private Point point;
		
		private String type;
		
		private boolean bombable;
		
		private boolean accessible;
		
		private boolean active;
		
		private HashMap<String, Integer> rndscore;
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_1() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_2() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_3() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_4() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_5() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_6() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_7() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_8() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_9() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);
				clientGameRound.setMap(map);
				clientGameRound.start();
				clientGameRound.setLocalControl(localControl);
				clientGameRound.update(o, arg);
				clientGameRound.getGameObjectById(id);
				clientGameRound.countdown(countdown);
				clientGameRound.setLocalPlayer(localPlayer);
				clientGameRound.doPostRoundProcessing();
				clientGameRound.snapToGrid(bomb);
				clientGameRound.setStatus(string);
				clientGameRound.endRound();
				clientGameRound.terminateRound();
				clientGameRound.getTime();
				clientGameRound.setTime(time);
				clientGameRound.createNewTile(point, id, type, bombable, accessible, active);
				clientGameRound.toggleDisplayNames();
				clientGameRound.setRoundScore(rndscore);
				assertNull(clientGameRound.getGameObjectById(id));
		}
		
		/**
		* Test case for {@link ClientGameRound#getGameObjectById(int)}.
		* It tests the case when the id is unknown.
		*/
		@Test
		void testGetGameObjectById_10() {
				clientGameRound = new ClientGameRound(session, gameCanvas);
				clientGameRound.addPlayer(id, player);
				clientGameRound.addBomb(id, bomb);