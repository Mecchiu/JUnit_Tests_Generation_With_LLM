// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {

		/**
		* Test case 1 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "hello".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel1() {
				assertEquals("e", GetClosestVowel.getClosestVowel("hello"));
		}
		
		/**
		* Test case 2 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "world".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel2() {
				assertEquals("o", GetClosestVowel.getClosestVowel("world"));
		}
		
		/**
		* Test case 3 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "computer".
		* The expected result is "u".
		*/
		@Test
		void testGetClosestVowel3() {
				assertEquals("u", GetClosestVowel.getClosestVowel("computer"));
		}
		
		/**
		* Test case 4 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "science".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel4() {
				assertEquals("i", GetClosestVowel.getClosestVowel("science"));
		}
		
		/**
		* Test case 5 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "programming".
		* The expected result is "a".
		*/
		@Test
		void testGetClosestVowel5() {
				assertEquals("a", GetClosestVowel.getClosestVowel("programming"));
		}
		
		/**
		* Test case 6 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "software".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel6() {
				assertEquals("o", GetClosestVowel.getClosestVowel("software"));
		}
		
		/**
		* Test case 7 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "engineering".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel7() {
				assertEquals("e", GetClosestVowel.getClosestVowel("engineering"));
		}
		
		/**
		* Test case 8 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "university".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel8() {
				assertEquals("i", GetClosestVowel.getClosestVowel("university"));
		}
		
		/**
		* Test case 9 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "education".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel9() {
				assertEquals("e", GetClosestVowel.getClosestVowel("education"));
		}
		
		/**
		* Test case 10 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "school".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel10() {
				assertEquals("o", GetClosestVowel.getClosestVowel("school"));
		}
}

// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
		/**
		* Test case 1 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "hello".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel1() {
				assertEquals("e", GetClosestVowel.getClosestVowel("hello"));
		}
		
		/**
		* Test case 2 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "world".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel2() {
				assertEquals("o", GetClosestVowel.getClosestVowel("world"));
		}
		
		/**
		* Test case 3 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "computer".
		* The expected result is "u".
		*/
		@Test
		void testGetClosestVowel3() {
				assertEquals("u", GetClosestVowel.getClosestVowel("computer"));
		}
		
		/**
		* Test case 4 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "science".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel4() {
				assertEquals("i", GetClosestVowel.getClosestVowel("science"));
		}
		
		/**
		* Test case 5 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "programming".
		* The expected result is "a".
		*/
		@Test
		void testGetClosestVowel5() {
				assertEquals("a", GetClosestVowel.getClosestVowel("programming"));
		}
		
		/**
		* Test case 6 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "software".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel6() {
				assertEquals("o", GetClosestVowel.getClosestVowel("software"));
		}
		
		/**
		* Test case 7 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "engineering".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel7() {
				assertEquals("e", GetClosestVowel.getClosestVowel("engineering"));
		}
		
		/**
		* Test case 8 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "university".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel8() {
				assertEquals("i", GetClosestVowel.getClosestVowel("university"));
		}
		
		/**
		* Test case 9 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "education".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel9() {
				assertEquals("e", GetClosestVowel.getClosestVowel("education"));
		}
		
		/**
		* Test case 10 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "school".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel10() {
				assertEquals("o", GetClosestVowel.getClosestVowel("school"));
		}
}

// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
		/**
		* Test case 1 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "hello".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel1() {
				assertEquals("e", GetClosestVowel.getClosestVowel("hello"));
		}
		
		/**
		* Test case 2 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "world".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel2() {
				assertEquals("o", GetClosestVowel.getClosestVowel("world"));
		}
		
		/**
		* Test case 3 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "computer".
		* The expected result is "u".
		*/
		@Test
		void testGetClosestVowel3() {
				assertEquals("u", GetClosestVowel.getClosestVowel("computer"));
		}
		
		/**
		* Test case 4 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "science".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel4() {
				assertEquals("i", GetClosestVowel.getClosestVowel("science"));
		}
		
		/**
		* Test case 5 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "programming".
		* The expected result is "a".
		*/
		@Test
		void testGetClosestVowel5() {
				assertEquals("a", GetClosestVowel.getClosestVowel("programming"));
		}
		
		/**
		* Test case 6 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "software".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel6() {
				assertEquals("o", GetClosestVowel.getClosestVowel("software"));
		}
		
		/**
		* Test case 7 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "engineering".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel7() {
				assertEquals("e", GetClosestVowel.getClosestVowel("engineering"));
		}
		
		/**
		* Test case 8 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "university".
		* The expected result is "i".
		*/
		@Test
		void testGetClosestVowel8() {
				assertEquals("i", GetClosestVowel.getClosestVowel("university"));
		}
		
		/**
		* Test case 9 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "education".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel9() {
				assertEquals("e", GetClosestVowel.getClosestVowel("education"));
		}
		
		/**
		* Test case 10 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "school".
		* The expected result is "o".
		*/
		@Test
		void testGetClosestVowel10() {
				assertEquals("o", GetClosestVowel.getClosestVowel("school"));
		}
}

// GetClosestVowelTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetClosestVowel}.
* It contains ten unit test cases for the {@link GetClosestVowel#getClosestVowel(String)} method.
*/
class GetClosestVowelTest {
		
		/**
		* Test case 1 for {@link GetClosestVowel#getClosestVowel(String)}.
		* The input word is "hello".
		* The expected result is "e".
		*/
		@Test
		void testGetClosestVowel1() {
				assertEquals("e", GetClosestVowel.getClosestVowel("hello"));
		}
		
		/**
		