// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {

		@Test
		void testDecodeString() {
				String s = "";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "f";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "fo";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "foo";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "foob";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "fooba";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "foobar";
				assertEquals(s, Base64Coder.decodeString(Base64Coder.encodeString(s)));
				s = "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Nunc at augue. Integer eu magna sit amet orci laoreet luctus. Curabitur euismod. Donec porta, pede non tincidunt vehicula, eros pede faucibus nisi, eu tempus urna nisl eget urna. Suspendisse potenti. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod. Donec euismod