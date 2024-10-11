// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

	@Test
	void testStrlen_emptyString() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_abc() {
		assertEquals(3, Strlen.strlen("abc"));
	}
	
	@Test
	void testStrlen_emptyString2() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_x() {
		assertEquals(1, Strlen.strlen("x"));
	}
	
	@Test
	void testStrlen_asdasnakj() {
		assertEquals(9, Strlen.strlen("asdasnakj"));
	}
	
	@Test
	void testStrlen_emptyString3() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_emptyString4() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_emptyString5() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_emptyString6() {
		assertEquals(0, Strlen.strlen(""));
	}
	
	@Test
	void testStrlen_emptyString7() {
		assertEquals(0, Strlen.strlen(""));
	}
	
}