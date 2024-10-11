// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
@SuppressWarnings("unused")
	private final InchiStructure testStructure = new InchiStructure_2();
	@Test
	public void shouldReturnStereo0D() {

		String string = testStructure.getStereo0D();

		List<String> splitted = string.split(";");
		String[] expected = { splitted.get(0).replace(" ", ""), splitted.get(1).replace(" ", ""), " ", "-0D" };

		assertArrayEquals(
			expected,
			splitted.toArray(new String[3])
		);
	}

    /**
     * Private constructor.
     */
    private JniInchiStructure_2Test() {
    }
}

// JniInchiStructure_2Test.java