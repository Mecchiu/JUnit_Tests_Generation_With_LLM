// ExplosionBoundsTest.java
package server;

import java.awt.Point;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplosionBounds}.
* It contains one unit test case for the {@link ExplosionBounds#contain(Point)} method.
*/
class ExplosionBoundsTest {
		
    public ExplosionBoundsTest(){
    }
    
    @Test
    public void test() {
    	Point p = new Point(0,0);
    	assertTrue(contain(p));
    	p.x = 15;
    	assertTrue(!contain(p));
    	p.y = 15;
    	assertTrue(!contain(p));
    	p.x = 15;
    	p.y = 15;
    	assertTrue(contain(p));
    	p.x = 15;
    	p.y = 15;
    	assertTrue(!contain(p));
    }
 
}