// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
private final static int bondNumber = 1;
	/**
	* Tests method throws when called with invalid bond in the current state.
	*/
	@Test
	@org.junit.jupiter.api.TestInstance(jdk12Platform = true)
	void method_throws_when_called_with_invalid_bond( ) {

		List<String> sb = new ArrayList<>();
		sb.add("B0B1");
		sb.add("B0B2");
		try {
			getBond(bondNumber);
		} catch (IllegalArgumentException e) {
			fail(e.getMessage());
		}
	}}
