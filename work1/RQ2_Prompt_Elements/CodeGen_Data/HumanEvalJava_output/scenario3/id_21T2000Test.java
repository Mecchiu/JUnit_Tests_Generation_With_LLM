// RescaleToUnitTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RescaleToUnit}.
* It contains one unit test case for the {@link RescaleToUnit#rescaleToUnit(List)} method.
*/
class RescaleToUnitTest {

    /**
     * Test {@link RescaleToUnit#rescaleToUnit(List)}.
     */
    @Test
    void test1() {
	//System.out.println("\n" + rescaleToUnit(1) + "\n");
	assertThat(rescaleToUnit(1)).isNotNull();
    }

    /**
     * Test {@link RescaleToUnit#rescaleToUnit(List)}.
     */
    @Test
    void test2() {
	//System.out.println("\n" + rescaleToUnit(2) + "\n");
	assertThat(rescaleToUnit(2)).isNotNull();
    }

    /**
     * Test {@link RescaleToUnit#rescaleToUnit(List)}.
     */
    @Test
    void test3() {
	//System.out.println("\n" + rescaleToUnit(3) + "\n");
	assertThat(rescaleToUnit(3)).isNotNull();
    }

    /**
     * Test {@link RescaleToUnit#rescaleToUnit(List)}.
     */
    @Test
    void test4() {
	
	//System.out.println("\n" + rescaleToUnit(3,2) + "\n");
	assertThat(rescaleToUnit(3,2)).isNotNull();
    }

    /**
     * Test {@link RescaleToUnit#rescaleToUnit(List)}.
     */
    @Test
    void test5() {
	//System.out.println("\n" + rescaleToUnit(3,2,5) + "\n");
	assertThat(rescaleToUnit(3,2,5)).isNotNull();
    }
}
            