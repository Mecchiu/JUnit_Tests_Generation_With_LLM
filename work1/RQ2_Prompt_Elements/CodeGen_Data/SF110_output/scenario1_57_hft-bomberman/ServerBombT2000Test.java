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
private ServerBomb me = null;
		private Logger log = Logger.getLogger("me");
		@Test
		public void TestTick() {
                log.debug("Starting test for {0}...", me);

                // Initializing a Player. It should always succeed, otherwise the server will
                // bomb
                Player player = new Player("testp", 24, 9);

                // Getting me for testing
                me = new ServerBomb(player);

                log.debug("Tick - 1: Stopping the bomb");
                me.tick();
                log.debug("Tick - 2: Exploding the player");
                player.setDead(true);
                me.tick();

                log.debug("t: Stopping the tile!");
                Tile tile = player.getTile();
                me.tick();
                tile.setColliding(true);
                tile.moveTo(Constants.NORTHEAST_POINT_FROM_PIXEL);
                tile.kill();
                tile.kill();

                log.debug("Tick - 3: Exploding tile at point ({0},{0})");
                me.tick();
                tile.moveTo(Constants.NORTHEAST_POINT_FROM_PIXEL);
                tile.explode();

                Tile tileInTile = tile;
                Point p;
                log.debug("t: Explosion at tile at ({0},{0})");
                me.tick();
                do {
                        tileInTile = tile;
                        tileInTile = tileInTile.explode();
                        log.debug("Explotion: tileInTile is exploding at ({0},{1})",
                                tileInTile.getAbsolutePosition(),
                                tileInTile.getAbsolutePosition().getX() + tile.getAbsolutePosition().getX());
                } while (tileInTile.getColliding());
                tile.kill();

                // The server is supposed to bomb (it tries to explode the tile and explodes again...).
                me.tick();
                tile.setColliding(false);
                tile.moveTo(Constants.NORTHEAST_POINT_FROM_PIXEL);
                tile.explode();
                tile.kill();
                tile.moveTo(new Point(Constants.FIRST_ZONE, 0));
                tile.kill();

                // The server should have no effect on the tile, because for this tile
                // only one player can destroy a bomb
                me.tick();
                tile.kill();

                log.debug("Tick - 4: Stopping the bomb");
                tile.setBlocked(false);
                me.tick();

                log.debug("Tick - 5: Explosing the bomb");
                tile.explode();

                me.tick();

                return tile.getColliding();
        }

        @Test
        public void TestExplode() {
                log.debug("Starting test for {0}...", me);

                // Initializing a Player. It should always succeed, otherwise the server will
                // bomb
                Player player = new Player("testp", 24, 9);

                // Getting me for testing
                me = new ServerBomb(player);

                log.debug("Tick - 1: Stopping the bomb");
                me.tick();
                log.debug("Tick - 2: Explosion the player");
                player.setDead(true);
                me.tick();
                tile.setBlocked(true);
                tile.kill();

                log.debug("Tick - 4: Exploding the player");
                player.explode();
                Tile tile1 = tile;
             tile = null; // This is so that we will not get infinite loops when exploding
                    tile1.explode(); // We prevent infinite loops with the "explode" call.

                log.debug("Tick - 4: Expanding tile");
                tile1.explode();

                Tile tile2 = tile;
                tile = null;
                tile2.kill();

                log.debug("Tick - 5: Exploding tile");
                tile = null;
                me.tick();
                tile.explode();

                Tile target = tile = tile.getBlockedTile();
                tile.moveTo(Constants.NORTHEAST_POINT_FROM_PIXEL);
                Tile secondInTile = tile;
                tile.explode();

                log.debug("Tick - 6: Exploding tile");
                tile2.explode();

                Tile thirdInTile = tile2;
                tile2.kill();

                log.debug("Exploding of tile ({0}->{1}) should not succeed as tile ({2}->{3}) are blocked and exploding ({4}->{5}) is killed",
                            Constants.FIRST_ZONE, Constants.FIRST_ZONE, tile1.getAbsolutePosition(),
                            tile2.getAbsolutePosition(), secondInTile.getAbsolutePosition(), target.getAbsolutePosition());

                Tile tileInTile = tile;
                Point p;
                Point newPos = new Point(Constants.FIRST_ZONE, Constants.FIRST_ZONE);
                Point target2 = new Point(Constants.FIRST_ZONE,Constants.FIRST_ZONE);
                Point target3 = new Point(Constants.FIRST_ZONE, Constants.FIRST_ZONE);
               tile.moveTo(Constants.NORTHEAST_POINT_FROM_PIXEL);
                tile.explode();
                tile2.kill();

                // The server is supposed to bomb (it tries to explode the tile and explodes again...).
                me.tick();
                tile.kill();

                log.debug("Tick - 6: Stopping the bomb");
                tile.setBlocked(true);
                me.tick();
                Tile tile2InTile = tile;
                tile = null;
                tile2InTile.explode();

                Tile tileInTile2 = tile2;
                log.debug("Exploding of tile ({0}->{1}) should not succeed as tile ({2}->{3}) are blocked and exploding ({4}->{5}) is killed",
                    Constants.FIRST_ZONE, Constants.FIRST_ZONE, tile1.getAbsolutePosition(),
                    tile2InTile.getAbsolutePosition(), secondInTile.getAbsolutePosition(), target2.getX() - tile.getAbsolutePosition().getX());

                log.debug("Tick - 7: Exploding tile");
                tile.explode();
                tile2.kill();
                tile.kill();

                Tile tile3 = tile;
                tile = null;
                tile2.explode();

                target4.setCenter(tile);
                target4.moveTo(tile.getDimension().getX(), tile.getDimension().getY());
                target5.setCenter(tile2);
                target5.moveTo(tile2.