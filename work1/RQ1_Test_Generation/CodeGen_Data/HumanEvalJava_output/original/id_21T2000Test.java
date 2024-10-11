// RescaleToUnitTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains one unit test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

	/**
	* Test of rescaleToUnit method, of class RescaleToUnit.
	*/
    @Test
    void newArrayList() {
        System.out.println("rescaleToUnit");
        assertEquals(new ArrayList<Double>([-42.0, 9.1]), rescaleToUnit(new ArrayList<Double>([-42.0, 9.1])));
    }
    
	/**
	* Test of rescaleToUnit method, of class RescaleToUnit.
	*/
    @Test
    void newArrayList2() {
        System.out.println("rescaleToUnit2");
        assertEquals(new ArrayList<Double>([-42, 9.2]), rescaleToUnit(new ArrayList<Double>([-42, 9.2])));
    }
    
	/**
	* Test of rescaleToUnit method, of class RescaleToUnit.
	*/
    @Test
    void test2() {
        System.out.println("rescaleToUnit2");
        assertFalse(rescaleToUnit(new ArrayList<Double>([-42, 9.20])));
        assertTrue(rescaleToUnit(new ArrayList<Double>([-42, 9.2])));
    }
    
}

//RescaleToUnitTest.java