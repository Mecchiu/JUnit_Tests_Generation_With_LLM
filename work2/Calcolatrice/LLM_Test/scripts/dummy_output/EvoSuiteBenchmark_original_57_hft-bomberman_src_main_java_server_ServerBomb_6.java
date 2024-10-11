// ServerBombTest.java
package server;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.Vector;
import messages.round.BombExplodedMsg;
import org.apache.log4j.Logger;
import common.Bomb;
import common.Constants;
import common.GameObject;
import common.Player;
import common.PowerUp;
import common.Tile;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerBomb}.
* It contains one unit test case for the {@link ServerBomb#tick()} method.
*/
class ServerBombTest {
		
	/**
	 * The log for this class
	 */
	private static Logger LOG = Logger.getLogger(ServerBombTest.class);

	/**
	 * A collection to store gameobjects
	 */
	private Vector<GameObject> aVector = new Vector<GameObject>(100);
	/**
	 * The collection to store the server objects
	 */
	private Vector<ServerGameSession> aVectorC = new Vector<ServerGameSession>(100);
	/**
	 * Bounding tiles that can be used for explosion-hit-testing
	 */
	private Rectangle bingetubes = new Rectangle();
	/**
	 * A vector of hits that can be returned by {@link ServerBomb#getHitCount(Collection, Board)}
	 */
	private Collection<Integer> hits = new Vector<Integer>();
	/**
	 * A vector of tiles that can be reached by the bomb
	 */
	private Vector<Tile> tiles = new Vector<Tile>();

	/**
	 * Starts all game objects and player objects
	 * @throws DBException
	 */
	@Test
	public void startGame() throws DBException {
		for(int i=0; i<aVector.size(); i++) {
			GameObject gameObj = aVector.get(i);
			Player player = DBServiceFactory.getPlayer(gameObj.getPlayerNumber());
			if (player == null) {
				player = DBServiceFactory.getDummyPlayer();
			}
			ServerGameSession serverGameSession = DBServiceFactory.getGameSession(gameObj);
			if (serverGameSession == null) {
				serverGameSession = new ServerGameSession();
				DBServiceFactory.addGameSession(serverGameSession);
				serverGameSession.addPlayer(player);
			}
			serverGameSession.getTileHandler().updateTile(TET_GROUND, null);
			serverGameSession.addPlayer(player);
			aVector.set(i, gameObj);
			DBServiceFactory.updateServer(aVector);
		}
	}

	/**
	 * Updates the server tiles and returns the tiles that can be reached by the bomb.
	 * @throws DBException
	 */
	@Test
	public void updateTiles() throws DBException {
		for(int i=0; i<ongroundTasks(); i++) {
			Tile tile = DBServiceFactory.getTile(i);
			if (tile!= null) {
				tiles.add(tile);
			} else {
				continue;
			}
			Vector<Tile> tileList = DBServiceFactory.getTiles(tile);
			for (int j = 0; j < tileList.size(); j++) {
						
				boolean success = false;
				Vector<Point> points = new Vector<Point>(2);
				for (int jj = 0; jk = tiles.size(); jj++) {
					if (ttanks() >= points.size()) {
						points = tiles.get(jj);
					}
					Tile temp = tiles.get(jj);
					if (temp.getTileX() == tileList.get(j).getTileX()
							&& temp.getTileY() == tileList.get(j).getTileY()) {
						if (temp.hit(tanks())) {
							tanks().remove(tileList.get(j).getTile());
							success = true;
						}
					}
				} //end for
				if (!success) {
					success = tile.hit();
				} //end for
				if (!success) {continue;}
				success = tile.explode();
				Vector<Point> points0 = (Vector<Point>) tile.getProperties().clone();
				for (int jj = 0;!success && jj < points0.size(); jj++) {
					points.add(new Point((int) points0.get(jj).getX(), (int) points0.get(jj).getY()));
				}
				tanks().add(tiles.get(jj));
			} //end for
		} // end for
	}

	@Test
	public void updateBounds() throws DBException {
		bingetubes.setLocation((long) (5 * Constants.DEGTORAD), (long) (5 * Constants.DEGTORAD));
		bingetubes.setSize((long) (6 * Constants.DEGTORAD));
		bingetubes.setLocation(0, 0);
		bingetubes.setSize(0);
		bingetubes.setLocation(0, bingetubes.getY());
		bingetubes.setSize(bingetubes.getX());
		ingoreHits().add("1");
		for (int i = 0; i < 6; i++) {
			ingoreHits()
					.add((Long) tiles.get((long) (i)).getProperties()
							.getProperty("damage"));
		}
		bingetubes
				.setLocation(Constants.TILE_WIDTH * ((long ) (0.1f * tiles.size()))
						- Constants.TILE_WIDTH, 0);
}
}