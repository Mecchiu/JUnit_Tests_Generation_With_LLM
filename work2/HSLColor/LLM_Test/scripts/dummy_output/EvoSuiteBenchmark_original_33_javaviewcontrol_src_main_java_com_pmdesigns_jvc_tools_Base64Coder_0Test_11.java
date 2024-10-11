// Base64Coder_0Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains one unit test case for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_0Test {
		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#encodeString(java.lang.String)}.
		* @throws  java.lang.IllegalArgumentException if <tt>s</tt> is not null &&!(s instanceof String)
		 */
		@org.junit.jupiter.api.Test
		public void testEncodeStringString() {
			String s = "";

			assertEquals(s, null, Base64Coder.encodeString( s ));
		}

		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(java.io.InputStreamInt)}
		* @throws  java.lang.IllegalArgumentException if <tt>in</tt> is null.
		*/
		@org.junit.jupiter.api.Test
		public void testDecodeInputStreamInt() {
			String input = "";

			assertEquals(input, null, Base64Coder.decode( input ));
		}

		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(java.io.InputStreamInt, byte[], int, int)}
		* @throws  java.lang.IllegalArgumentException if <tt>in</tt> is null.
		* @throws  java.lang.IllegalArgumentException if <tt>dataToDecode.length</tt> doesn't match <tt>in.length()</tt>.
		*/
		@org.junit.jupiter.api.Test
		public void testDecodeInputStreamIntBytes() {
			String input = "X";

			try {
				byte[] dataToDecode = new byte[input.length()];
				int i = 0;
				byte[] inA = input.getBytes("US-ASCII");

				// check lengths.
				assertTrue( i == dataToDecode.length);
				// check data.
				assertTrue( dataToDecode.length == base64Encoding.decode( dataToDecode ));
				for ( byte b : inA ) {
					assertTrue( b >= map1[ 0 ] && b <= map1[ 1 ] );
					assertTrue( b >= map2[ 0 ] && b <= map2[ 1 ]);
				}
				// check result.
				assertTrue( input.length() == base64Encoding.decode( dataToDecode ));
			}
			catch ( Exception e ) {
				fail( "Not a valid Base64 input stream." );
			}
			// check result of method.
			assertEquals( input, null );
		}

		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#decode(java.io.InputStream)}.
		* @throws  java.lang.IllegalArgumentException if <tt>in</tt> is null.
		* @throws  java.lang.IllegalArgumentException if <tt>data</tt> is null.
		*/
		@org.junit.jupiter.api.Test
		public void testDecodeStreamByteArray() {
			byte[] data = null;

			try {
				byte[] in = new byte[0];
				data = Base64Coder.decode( in );
				assertTrue( data.length > 0 );
				assertTrue( data.length == base64Encoding.decode( data ));
			}
			catch ( java.lang.IllegalArgumentException e ) {
				assertEquals( "Base64 encoded input stream should not be null here.", "", e.getMessage() );
			}
			catch ( Exception e ) {
				assertFalse( "Base64 encoding should not have to be used.", false );
			}
		}

		/**
		* Test method for {@link com.pmdesigns.jvc.tools.Base64Coder#encode(char[])}.
		* @throws  java.lang.IllegalArgumentException if <tt>dataToEncode.length</tt> doesn't match <tt>in.length()</tt>.
		* @throws  java.lang.IllegalArgumentException if <tt>out</tt> is null.
		*/
		@org.junit.jupiter.api.Test
		public void testEncodeCharactersCharactersCharacter() {
			char[] dataToEncode = null;

			try {
				dataToEncode = new char[ 0 ];
				Base64Coder.encode( dataToEncode );
				assertTrue( base64Encoding.encode( dataToEncode ).length == dataToEncode.length );
			}
			catch ( Exception e ) {
				assertEquals( "Base64 encoding input stream should not be null here.", ""
				, e.getMessage() );
			}
		}

}