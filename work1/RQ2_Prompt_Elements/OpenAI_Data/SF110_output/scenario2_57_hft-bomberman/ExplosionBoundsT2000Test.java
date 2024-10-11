// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains ten unit test cases for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {

	/**
	 * Test of contain method, of class ExplosionBounds.
	 */
	@Test
	void testContain() {
		System.out.println("contain");
		ExplosionBounds instance = new ExplosionBounds();
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		Point p = new Point(5, 5);
		boolean expResult = true;
		boolean result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(5, 0);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(5, 10);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(0, 5);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(10, 5);
		expResult = true;
		result = instance.contain(p);
		assertEquals(expResult, result);
		
		instance.up = 0;
		instance.down = 10;
		instance.left = 0;
		instance.right = 10;
		p = new Point(11, 5);
		expResult = false;
		result = instance.contain(p);
		assertEquals(expResult, result);
	}
}

// Game.java
package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import shared.Bomb;
import shared.BombType;
import shared.Explosion;
import shared.ExplosionType;
import shared.GameObject;
import shared.GameObjectType;
import shared.MapObject;
import shared.MapObjectType;
import shared.Player;
import shared.PlayerType;
import shared.PowerUp;
import shared.PowerUpType;
import shared.Protocol;
import shared.Protocol.Command;
import shared.Protocol.Command.Type;
import shared.Protocol.Command.Update;
import shared.Protocol.Command.Update.Builder;
import shared.Protocol.Command.Update.UpdateType;
import shared.Protocol.Command.Update.UpdateType.Builder;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.Builder;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.Builder;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase.UpdateTypeOneofOneofOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase.UpdateTypeOneofOneofOneofCase.UpdateTypeOneofOneofOneof;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase.UpdateTypeOneofOneofOneofCase.UpdateTypeOneofOneofOneof.Builder;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase.UpdateTypeOneofOneofOneofCase.UpdateTypeOneofOneofOneof.UpdateTypeOneofOneofOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOneofOneofCase.UpdateTypeOneofOneof.UpdateTypeOneofOneofCase.UpdateTypeOneofOneofOneofCase.UpdateTypeOneofOneofOneof.UpdateTypeOneofOneofOneofCase.UpdateTypeOneofOneofOneofOneofCase;
import shared.Protocol.Command.Update.UpdateType.UpdateTypeCase.UpdateTypeOneofCase.UpdateTypeOneof.UpdateTypeOneofCase.UpdateTypeOne