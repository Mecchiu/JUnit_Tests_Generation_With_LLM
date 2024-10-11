// CorrectBracketing1Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains one unit test case for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

	@Test
	void correctBracketing() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("("));
	}

	@Test
	void correctBracketing2() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("("));
	}

	@Test
	void correctBracketing3() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("())"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<"));
	}

	@Test
	void correctBracketing4() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<()"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<()"));
	}

	@Test
	void correctBracketing5() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<()<"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("()<(){}"));
	}

	@Test
	void correctBracketing6() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()))"));
	}

	@Test
	void correctBracketing7() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()<"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()<()"));
	}

	@Test
	void correctBracketing8() {
		assertFalse(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()<()<"));
		assertTrue(getClass().getCanonicalName(), CorrectBracketing1.correctBracketing("(()<()<"));
	}

}