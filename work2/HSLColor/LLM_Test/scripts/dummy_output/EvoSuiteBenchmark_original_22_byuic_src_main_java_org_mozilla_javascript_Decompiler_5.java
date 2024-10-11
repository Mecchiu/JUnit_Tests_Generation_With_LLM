// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		 /**
		  * The single test fixture used for testing {@link DecompilerTest} class
		  * functionality.
		  */
	  private DecompilerTest() {}

	 /**
	  * Test of decompile method of Decompiler.
	  */
	 @Test
  public void testDecompile() {
		 String[] sourceArray = {
			"abc", "defghijklmnoop", "", "", "\n\n",
			"abc\n\ndefghijklmnoop", "", "", "\n\ndefghijklmnoop"
		};
		int sourceStart, newOffset;
	    if (printSource) {
	      // test that decoding of source string correctly includes a quote-safe opening
	    	newOffset = printSourceString(decompile(Util.toString(sourceArray), TO_SOURCE_FLAG, null, null), 0, null, null);
	    	sourceStart = 1; // start of decompile sequence
	    } else {
		try {
			// this will always succeed, even for a bad source!
			// decompile is not supposed to return a 0 or ERROR!
			newOffset = decompile(decompile(Util.toString(sourceArray), TO_SOURCE_FLAG, null, null), TO_SOURCE_FLAG, null, null);
			return;
		} catch (RuntimeException re) {
			new OffsetErrorException(re).printStackTrace();
			this.fail("decompiling a bad source: expected ERROR (or a non-zero value for TO_SOURCE_FLAG) but got "+re.getMessage());
			return;
		}
	    }

	    assertEquals(Util.INDEX_TOO_BIG, newOffset);
	    assertEquals(1, sourceArray.length); // ensure the length is not exceeded
	    final Utf8StringPool poolString = Utf8StringPool.INSTANCE ;
	    final String sourceStr = Util.toString(sourceArray, sourceStart, sourceArray.length - sourceStart);
	    String s = poolString.get(sourceStr);
	    // the code below will print a source string with a quote-safe opening
	    printSourceString(Util.toString(s), newOffset, true, null);
}
}