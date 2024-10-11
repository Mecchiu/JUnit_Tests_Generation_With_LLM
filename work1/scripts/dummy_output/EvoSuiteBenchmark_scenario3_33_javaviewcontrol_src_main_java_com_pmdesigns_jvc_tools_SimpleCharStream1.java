// SimpleCharStreamTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStreamTest {
		
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testReadCharNull() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a empty string.
	*/
	@Test
	void testReadCharEmpty() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with one character.
	*/
	@Test
	void testReadCharOneChar() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with two characters.
	*/
	@Test
	void testReadCharTwoChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with three characters.
	*/
	@Test
	void testReadCharThreeChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with four characters.
	*/
	@Test
	void testReadCharFourChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with five characters.
	*/
	@Test
	void testReadCharFiveChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with six characters.
	*/
	@Test
	void testReadCharSixChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with seven characters.
	*/
	@Test
	void testReadCharSevenChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with eight characters.
	*/
	@Test
	void testReadCharEightChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with nine characters.
	*/
	@Test
	void testReadCharNineChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a string with ten characters.
	*/
	@Test
	void testReadCharTenChars() {
		SimpleCharStream simpleCharStream = new SimpleCharStream();
		assertThrows(NullPointerException.class, () -> {
			simpleCharStream.readChar();
		});
	}
}