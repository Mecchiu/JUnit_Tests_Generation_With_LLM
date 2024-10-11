// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
		/**
		 * Test method for {@link com.pmdesigns.jvc.tools.SimpleCharStream#GetImage()}.
		 */
		@Test
		public void testGetImage() {
			SimpleCharStream scs = new SimpleCharStream( 
				java.io.InputStream.class, "UTF-8", 1, 1 );
			String res = scs.GetImage();

			if ( scs.column > 1 ) {
				assertEquals(
					"Wrong column result (res=" + res + ")",
					scs.column - 1, res.charAt( scs.column-1 ) );
			}
			
			int i = scs.getBeginLine();
			assertEquals(
				"Wrong start line result (res=" + res + ")",
				i, scs.getBeginLine() );

			i = scs.getBeginColumn();
			assertEquals(
				"Wrong start column result (res=" + res + ")",
				i, scs.getBeginColumn() );

			i = scs.getBeginLine() - 1;
			assertEquals(
				"Wrong end line result (res=" + res + ")",
				scs.getBeginLine() - 1, i );
	
			i = scs.getEndLine() - 1;
			assertEquals(
				"Wrong end line result (res=" + res + ")",
				scs.getEndLine() - 1, i );

			i = scs.getEndColumn() - 1;
			assertEquals(
				"Wrong end column result (res=" + res + ")",
				i, scs.getEndColumn() - 1 );
		}

		/**
		 * Test method for {@link com.pmdesigns.jvc.tools.SimpleCharStream#hasAvailableTokenCharacters(com.pmdesigns.jvc.tools.Tokens, com.pmdesigns.jpct.CharacterCounts, java.lang.String)}
		 */
		@Test
		public void testHasAvailableTokenCharacters02() {
			
			final StandardTokenManager tv = new StandardTokenManager();
			final SimpleCharStream scs = new SimpleCharStream(
				java.io.InputStream.class, "UTF-8", 1, 1 );
			final CharacterCounts cc = new CharacterCounts();
			int prevCharAt = 0;
			final StringBuilder sb = new StringBuilder( 10 );
			
}
}