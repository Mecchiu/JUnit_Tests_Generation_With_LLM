// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {

	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b", AntiShuffle.antiShuffle("b a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a c b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b a c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b c a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c a b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c b a"));
	}
}

// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b", AntiShuffle.antiShuffle("b a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a c b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b a c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b c a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c a b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c b a"));
	}
}

// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b", AntiShuffle.antiShuffle("b a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a c b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b a c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b c a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c a b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c b a"));
	}
}

// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b", AntiShuffle.antiShuffle("b a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a c b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b a c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b c a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c a b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("c b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a b d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a c d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("a d c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a c d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b a d c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b c d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("b d c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a b d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c a d b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b a d"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c b d a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("c d b a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a b c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d a c b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b a c"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d b c a"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c a b"));
		assertEquals("a b c d", AntiShuffle.antiShuffle("d c b a"));
	}
}

// AntiShuffleTest.java
package scenario1;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains ten unit test cases for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	@Test
	void testAntiShuffle() {
		assertEquals("a", AntiShuffle.antiShuffle("a"));
		assertEquals("a b", AntiShuffle.antiShuffle("a b"));
		assertEquals("a b", AntiShuffle.antiShuffle("b a"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a b c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("a c b"));
		assertEquals("a b c", AntiShuffle.antiShuffle("b a c"));
		assertEquals("a b c", AntiShuffle.antiShuffle("