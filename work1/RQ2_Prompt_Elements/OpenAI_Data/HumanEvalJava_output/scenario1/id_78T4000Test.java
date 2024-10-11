// HexKeyTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {

		/**
		* Test case 1 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey1() {
				String hex = "0x2A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey2() {
				String hex = "0x3F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey3() {
				String hex = "0x5A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey4() {
				String hex = "0x7F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey5() {
				String hex = "0xBA";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey6() {
				String hex = "0xDF";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey7() {
				String hex = "0x2A3F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey8() {
				String hex = "0x5A7F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey9() {
				String hex = "0xBADF";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey10() {
				String hex = "0x2A3F5A7F";
				int expected = 4;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
}

// HexKeyTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
		/**
		* Test case 1 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey1() {
				String hex = "0x2A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey2() {
				String hex = "0x3F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey3() {
				String hex = "0x5A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey4() {
				String hex = "0x7F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey5() {
				String hex = "0xBA";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey6() {
				String hex = "0xDF";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey7() {
				String hex = "0x2A3F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey8() {
				String hex = "0x5A7F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey9() {
				String hex = "0xBADF";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey10() {
				String hex = "0x2A3F5A7F";
				int expected = 4;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
}

// HexKey.java
package scenario2;

class HexKey {

    public static int hexKey(Object num) {
        int result = 0;
        String hex = num.toString();
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            if (c == '2' || c == '3' || c == '5' || c == '7' || c == 'B' || c == 'D') {
                result++;
            }
        }
        return result;
    }
}

// HexKeyTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HexKey}.
* It contains ten unit test cases for the {@link HexKey#hexKey(Object)} method.
*/
class HexKeyTest {
		
		/**
		* Test case 1 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey1() {
				String hex = "0x2A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey2() {
				String hex = "0x3F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey3() {
				String hex = "0x5A";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey4() {
				String hex = "0x7F";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey5() {
				String hex = "0xBA";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey6() {
				String hex = "0xDF";
				int expected = 1;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey7() {
				String hex = "0x2A3F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey8() {
				String hex = "0x5A7F";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey9() {
				String hex = "0xBADF";
				int expected = 2;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10 for {@link HexKey#hexKey(Object)}.
		* It tests the method with a {@link String} object.
		*/
		@Test
		void testHexKey10() {
				String hex = "0x2A3F5A7F";
				int expected = 4;
				int actual = HexKey.hexKey(hex);
				assertEquals(expected, actual);
		}
}

// HexKey.java
package scenario3;

class HexKey {

    public