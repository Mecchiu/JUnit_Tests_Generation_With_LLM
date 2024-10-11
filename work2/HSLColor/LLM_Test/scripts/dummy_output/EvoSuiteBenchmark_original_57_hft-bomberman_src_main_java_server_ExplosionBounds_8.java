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
		
    /**
     * Checks
     */
    @Test
    public void testCanContainPixels() {
		
        new ServerTest<ExplosionBounds>("Test of ExplosionBounds.containPixels().") {
            {
                // Tests the method for a valid Point.
                this.testValidPoint = new Point(3, 2);
                this.testInvalidPoint = new Point(1, 0);
                assertTrue(this.contain(this.testValidPoint));
                
                 // Tests the method for a valid Point.
                this.testValidPoint = new Point(0, 5);
                this.testInvalidPoint = new Point(-10, 4);
                assertTrue(this.contain(this.testValidPoint));
                
                 // Tests the method for a valid Point.
                this.testValidPoint = new Point(0, 0);
                this.testInvalidPoint = new Point(10, 0);
                assertFalse(this.contain(this.testValidPoint));
                
               // Tests the method for a valid Point.
                this.testInvalidPoint = new Point(10, 4);
                this.testValidPoint = new Point(-10, 5);
                assertFalse(this.contain(this.testInvalidPoint));
                
                // Tests the method for a valid Point.
                this.testInvalidPoint = new Point(0, 0);
                this.testInvalidPoint = new Point(0, -4);
                assertFalse(this.contain(this.testInvalidPoint));
                
             // Tests the method for a valid Point.
                this.testValidPoint = new Point(5, 5);
                this.testInvalidPoint = new Point(-5, 4);
                assertFalse(this.contain(this.testValidPoint));
                
							

            }
            
        };
    }
    
    /**
     * Checks
     */
    @Test
    public void testValidPoint() {
		
        new ServerTest<ExplosionBounds>("Test of ExplosionBounds.contain(Point).") {

            {
                this.testValidPoint = new Point(0, 0);
                assertTrue(this.contain(this.testValidPoint));
                
                this.testValidPoint = new Point(0, 10);
                assertTrue(this.contain(this.testValidPoint));
                
                this.testValidPoint = new Point(5, 5);
                assertTrue(this.contain(this.testValidPoint));
                
            }
            
        };
    }
    
    @Test
    public void testInvalidPoint() {
		
        new ServerTest<ExplosionBounds>("Test of ExplosionBounds.contain(Point).") {

            {
                this.testInvalidPoint = new Point(0, 0);
                assertFalse(this.contain(this.testInvalidPoint));
                
                this.testInvalidPoint = new Point(3, 2);
                assertFalse(this.contain(this.testInvalidPoint));
                
                this.testInvalidPoint = new Point(3, 2);
                assertFalse(this.contain(this.testInvalidPoint));
                
                this.testInvalidPoint = new Point(3, -10);
                assertFalse(this.contain(this.testInvalidPoint));
                
            }
            
        };
    }
}