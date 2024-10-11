// ExtBoolArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArrayTest {

	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 0</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_0() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true};
		assertFalse(extBoolArray.isFalse(0, 0));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 1</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_1() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false};
		assertFalse(extBoolArray.isFalse(0, 1));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 2</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_2() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false};
		assertFalse(extBoolArray.isFalse(0, 2));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 3</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_3() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 3));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 4</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_4() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 4));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 5</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_5() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 5));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 6</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_6() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 6));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 7</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_7() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 7));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 8</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_8() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 8));
	}
	
	/**
	* Test case for {@link ExtBoolArray#isFalse(int, int)}
	* with the following input:
	* <ul>
	* <li>a = 0</li>
	* <li>b = 9</li>
	* </ul>
	* and the following expected output:
	* <ul>
	* <li>false</li>
	* </ul>
	*/
	@Test
	void testIsFalse_0_9() {
		ExtBoolArray extBoolArray = new ExtBoolArray();
		extBoolArray.werte = new boolean[] {true, false, false, false, false, false, false, false, false, false};
		assertFalse(extBoolArray.isFalse(0, 9));
	}
	
}

// ExtIntArray.java
package de.beiri22.stringincrementor.helper;

/**
 * @author Rico
 */
public final class ExtIntArray {

    public int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += werte[i];
        }
        return sum;
    }
}

// ExtIntArrayTest.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit