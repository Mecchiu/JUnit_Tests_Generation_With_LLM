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
		
	private static ServerBomb ball = null;
	private static ServerBomb explodingBubble = null;

    /**
     * It calls through {@link Object#getClass()} (Server)
     * the get the class of the Server. This does not change the value
     * of the Server instance of that class.
     */
    @ClassRule
    public static final ServerGameSession SERVER_GAME_SESSION = DBServiceFactory.getServerGameSession();

    @Test
    public void testGetClass() {
        System.out.println("Testing Class of Server Bomb...");
        Server.setGameSession(SERVER_GAME_SESSION);
        try {
            //Test all the classes in this object
            assertNotEquals(null, Server.class, Server.class.getSuperclass()
                   .getSuperclass());
            assertNotEquals(null, Server.getClass(), Server.class
                   .getSuperclass());
        } catch (ClassCastException e) {
            fail(
                    "Not enough classes in this class hierarchy to call super.clase on. Server class isn't derived from abstract class: "
                            + Server.class.getName() + ". Server class is: "
                            + Server.getClass().getName());
        }
    }
    
    @Test
    public void testGetVerticalHitBox(){
        System.out.println("Testing GetVerticalHitBox on Server...");
        Server.setGameSession(SERVER_GAME_SESSION);
        Server.getGameSession().tick();
        Rectangle hitbox = Server.getHitbox();
        assertNotNull("The hit-box was null",hitbox);
        assertEquals(hitbox.getX(), Server.HITBOX_HEIGHT,0);
        assertEquals(hitbox.getY(), Server.HITBOX_HEIGHT,0);
    }
    
    @Test
    public void testGetHorizontalHitBox(){
        System.out.println("Testing GetHorizontalHitBox on Server...");
        Server.setGameSession(SERVER_GAME_SESSION);
        Server.getGameSession().tick();
        Rectangle hitbox = Server.getHitbox();
        assertNotNull("The hit-box was null",hitbox);
        assertEquals(hitbox.getX(), Server.HITBOX_WIDTH,0);
        assertEquals(hitbox.getY(), Server.HITBOX_HEIGHT,0);
    }
    
	/**
	 * Test if only the bomb has a hit-box and if only one has a hit-box
	 */
	@Test
    public void testBallBubbleHitbox(){
        System.out.println("Testing only the bomb has a hitbox and one has a hitbox");
        Server.setGameSession(SERVER_GAME_SESSION);
        Server.getGameSession().tick();
        assertEquals(Server.ball.getHitbox().getY(), Server.HITBOX_HEIGHT,0);
    }
    
    /**
     * Test if the bomb bubbles up on right side of the player
     */
    @Test
    public void testRightSide() {
        Server.setGameSession(SERVER_GAME_SESSION);
        Server.getGameSession().tick();
        Vector<Point> possibleExplosionPoint = new Vector<Point>();
        Vector<Point> possibleHitPoint = new Vector<Point>();
        int rightSide = 0;
        do {
            possibleExplosionPoint = Server.explode(possibleExplosionPoint);
            possibleHitPoint = Server.hit(possibleHitPoint);
            rightSide = (rightSide + 1) % 2;
        } while(possibleHitPoint.size()!= 0);
        if (possibleExplosionPoint.size()!= 0) {
            assertEquals("Bomb exploded",true,possibleExplosionPoint.get(0).equals(possibleHitPoint.get(0)));
        }else {
            System.out.println("Explosion failed");
        }
    }
	
	/**
	 * Test if the bomb doesn't drop anything
	 */
	@Test
    public void testBubbleBubble(){
        Server.setGameSession(SERVER_GAME_SESSION);
        Server.getGameSession().tick();
        assertEquals(0,Server.getBall().getHitbox().getY(),0);
        assertEquals(0,Server.ball.getHitbox().getX(),0);
    }

    /**
    * Returns the hit-box of the bomb.
    */
    public Rectangle getHitbox(){
        return Server.getHitbox();
    }
}