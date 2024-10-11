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
		private static final Logger log = Logger.getLogger(ServerBombTest.class);
		private static Client session;

        /**
         * Sets up the test case suite.
         */
        @Test
        public void testInit() {
          log.info("Setting up ServerBomb instance and ServerBombTest.");
                Vector<GameObject> gameObjects = new Vector<GameObject>();
                int numOfPlayers = 7;
                int numOfTilesTested = 20;

				GameObject go = newGameObject(numOfPlayers - 1);
                 GameObject go2 = newGameObject(numOfPlayers - 1);

				session = newGameSession(0).asPlayer(1, false);
                session.getGameLogic().put(Constants.GAME_USER_ID_PROPERTY, session.getUser(0).getUniqueId() + "");

                Bombs bombCollide1 = newBomb(1, numOfPlayers, 12, true);
                bombCollide1.setExploded(false);
                bombCollide1.explode(); // No explode of bomb. It's a hit, but doesn't mean it is hit.
                bombCollide1.disconnect();
                gameObjects.add(bombCollide1);

                Bombs bombCollide2 = newBomb(1, numOfPlayers, 11, true);
                bombCollide2.setExploded(false);
                bombCollide2.explode();

				GO goCollide2 = go2.explode();
                bombCollide2.setExploded(true);
                bombCollide2.explode();

                Bombs bomb = newBomb(1, numOfPlayers, 0, true).explense();
                bomb.setExplosive();
                bomb.setExploded(false);
                bomb.disconnect();
                gameObjects.add(bomb);

                GO goCollide = go.explode();
                bombCollide1.setExploded(true);
                bombCollide1.explose();
                bombCollide1.disconnect();
                gameObjects.add(bombCollide1);
                
                GO goCollide2 = go2.explose();
                bombCollide2.setExploded(true);
                bombCollide2.explose();
                bombCollide2.disconnect();
                gameObjects.add(bombCollide2);

                session.getGameUser().getAllPlayerList().addAll(goCollide,  go2.explose());
                for(int x=0; x<numOfPlayers+1; x++) {
                    session.getGameSessionLogic().put("Player " + x, session.getUser(x).getUniqueId());
                }
                session.getGameLogic().putAll(gameObjects);
        }

        synchronized public void setTickTime(int tickTime) {
            this.tickTime = tickTime;
        }

        /**
         * Checks if the bomb is exploded.
         */
        synchronized void assertExploded(final Collection<GameObject> gameObjects) {
            Assertions.assertTrue(hasExploded);
        }


        /**
         * sets the has already exploded variable
         *
         * @param hasAlreadyExploded
         * @return
         */
        synchronized protected boolean hasExploded() {
            log.info("is exploded: " + hasExploded);
            return hasExploded;
        }


        /**
         * Sets the has already hitbox variable
         *
         * @param hasAlreadyHitbox
         * @return
         */
        synchronized protected boolean hasHitbox(final Rectangle hitbox) {
            log.info("is hitbox: " + hasHitbox);
            return hasHitbox;
        }

        /**
         * checks the hitbox of the bomb
         *
         * @param hitbox
         */
        private Point checkHitbox(final Point hitbox) {
            log.info("test : checkHitbox");
            return hitbox;
        }

        /**
         * checks the vertical hitbox
         *
         * @return The hitbox of the bomb in the vertical direction
         */
        @Test
        public void checkHitbox() {
            log.info("test: checkHitbox");
            Point finalHitbox1 = newPoint(100, 1);
            Point finalHitbox2 = newPoint(125, 3);

           // finalHitbox1=(Point) finalHitbox2.toString();//not possible here!!
            Point finalHitbox3 = newPoint(50, 3);
            Point finalHitbox4 = newPoint(50, 1);
            Point finalHitbox5 = newPoint(125, 1);
            Point finalHitbox6 = newPoint(10, 1);
            Bombs bombGoHitbox1 = newBomb(1).explose().move();
            bombGoHitbox1.setExploded(true);
            bombGoHitbox1.explose();
            Bombs bombGoHitbox2 = newBomb(1).explose().move();
            bombGoHitbox2.setExploded(true);
            bombGoHitbox2.explose();
            Bombs bombGoHitbox3 = newBomb(1).explose().move();
            bombGoHitbox3.setExploded(true);
}
}