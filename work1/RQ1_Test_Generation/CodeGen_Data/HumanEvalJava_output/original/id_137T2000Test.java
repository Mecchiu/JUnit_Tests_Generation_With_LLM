// CompareOneTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CompareOne}.
* It contains one unit test case for the {@link CompareOne#compareOne(Object, Object)} method.
*/
class CompareOneTest {

	String a, b;
	CompareOneTest() {
		a = "a";
		b = "b";
	}
	@Test
	public void testCompares() {
		Object answer;
		
		answer = null;
		
		assertFalse("answer is null", Answer.compare(null, new Object()));
		assertFalse("answer is null", Answer.compare((Object)null, null));
		assertFalse("answer is null", Answer.compare("", (Object)null));
		
		answer = new Object();
		assertFalse("answer is null", Answer.compare(null, answer));
		assertTrue("answer is null", Answer.compare((Object)null, answer));
		assertFalse("answer is not the same type as a", Answer.compare("a", answer));
		
		answer = new String();
		assertTrue("answer is not the same type as b", Answer.compare(b, answer));
		assertTrue("answer is not null", Answer.compare(a, answer));
	}
}





