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

// Token.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;

public class Token {

    /**
     * An integer that describes the kind of this token.  This numbering
     * system is determined by JavaCCParser, and a table of these numbers is
     * stored in the file ...Constants.java.
     */
    public int kind;

    /**
     * beginLine and beginColumn describe the position of the first character
     * of this token; endLine and endColumn describe the position of the
     * last character of this token.
     */
    public int beginLine, beginColumn, endLine, endColumn;

    /**
     * The string image of the token.
     */
    public String image;

    /**
     * A reference to the next regular (non-special) token from the input
     * stream.  If this is the last token from the input stream, or if the
     * token manager has not read tokens beyond this one, this field is
     * set to null.  This is true only if this token is also a regular
     * token.  Otherwise, see below for a description of the contents of
     * this field.
     */
    public Token next;

    /**
     * This field is used to access special tokens that occur prior to this
     * token, but after the immediately preceding regular (non-special) token.
     * If there are no such special tokens, this field is set to null.
     * When there are more than one such special token, this field refers
     * to the last of these special tokens, which in turn refers to the next
     * previous special token through its specialToken field, and so on
     * until the first special token (whose specialToken field is null).
     * The next fields of special tokens refer to other special tokens that
     * immediately follow it (without an intervening regular token).  If there
     * is no such token, this field is null.
     */
    public Token specialToken;

    /**
     * Returns the image.
     */
    public String toString() {
        return image;
    }

    /**
     * Returns a new Token object, by default. However, if you want, you
     * can create and return subclass objects based on the value of ofKind.
     * Simply add the cases to the switch for all those special cases.
     * For example, if you have a subclass of Token called IDToken that
     * you want to create if ofKind is ID, simlpy add something like :
     *
     *    case MyParserConstants.ID : return new IDToken();
     *
     * to the following switch statement. Then you can cast matchedToken
     * variable to the appropriate type and use it in your lexical actions.
     */
    public static final Token newToken(int ofKind) {
        switch (ofKind) {
            default : return new Token();
        }
    }
}

// TokenTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.j