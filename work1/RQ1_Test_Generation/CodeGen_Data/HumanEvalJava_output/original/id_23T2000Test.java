// StrlenTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains one unit test case for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

	@ParallelTest(100)
                                                         
	@Test
	void strlen(@SuppressWarnings("unused")/* ignored */)
	void testStrlenStr(String string) {
		assertEquals(0, Strlen.strlen(string));
	}

	@Test
	void testStrlenString(String string) {
		assertEquals(0, Strlen.strlen(string));
	}
	
        @Test
                                                    
	@Test
	void testStrlen(@SuppressWarnings("unused")/* ignored */)
	void testStrlenStr(String string) {
		assertEquals(0, Strlen.strlen(string));
	}
}
