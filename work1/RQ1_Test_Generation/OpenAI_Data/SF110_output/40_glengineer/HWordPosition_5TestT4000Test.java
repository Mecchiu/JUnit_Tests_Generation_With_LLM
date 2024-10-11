// HWordPosition_5Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPosition_5Test {

	/**
	 * The char table used in the tests.
	 */
	private static final CharTable ct = new CharTable(
			new String[] {
					"abcdefghijklmnopqrstuvwxyz",
					"ABCDEFGHIJKLMNOPQRSTUVWXYZ",
					"0123456789",
					"`~!@#$%^&amp;*()_+-=[]{}\\|;:'\",./&lt;&gt;?"
			}
	);
	
	/**
	 * The word positions used in the tests.
	 */
	private static final HWordPosition[] wps = new HWordPosition[] {
			new HWordPosition(0, 0, 0),
			new HWordPosition(0, 1, 0),
			new HWordPosition(0, 2, 0),
			new HWordPosition(0, 3, 0),
			new HWordPosition(0, 4, 0),
			new HWordPosition(0, 5, 0),
			new HWordPosition(0, 6, 0),
			new HWordPosition(0, 7, 0),
			new HWordPosition(0, 8, 0),
			new HWordPosition(0, 9, 0)
	};
	
	/**
	 * The expected texts used in the tests.
	 */
	private static final String[] texts = new String[] {
			"",
			"a",
			"ab",
			"abc",
			"abcd",
			"abcde",
			"abcdef",
			"abcdefg",
			"abcdefgh",
			"abcdefghi"
	};
	
	/**
	 * Tests the {@link HWordPosition#textAt(CharTable)} method.
	 */
	@Test
	void testTextAt() {
		for (int i = 0; i &lt; wps.length; i++) {
			assertEquals(texts[i], wps[i].textAt(ct));
		}
	}
}</code></pre>
</div>
</div>

</code>
