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
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#toString()} method.
*/
class TokenTest {
		
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a null value.
	*/
	@Test
	void testToStringNull() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a empty string.
	*/
	@Test
	void testToStringEmpty() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with one character.
	*/
	@Test
	void testToStringOneChar() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with two characters.
	*/
	@Test
	void testToStringTwoChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with three characters.
	*/
	@Test
	void testToStringThreeChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with four characters.
	*/
	@Test
	void testToStringFourChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with five characters.
	*/
	@Test
	void testToStringFiveChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with six characters.
	*/
	@Test
	void testToStringSixChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with seven characters.
	*/
	@Test
	void testToStringSevenChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with eight characters.
	*/
	@Test
	void testToStringEightChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with nine characters.
	*/
	@Test
	void testToStringNineChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
	
	/**
	* Test case for {@link Token#toString()} method.
	* It tests the method with a string with ten characters.
	*/
	@Test
	void testToStringTenChars() {
		Token token = new Token();
		assertThrows(NullPointerException.class, () -> {
			token.toString();
		});
	}
}

// TokenMgrError.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;

public class TokenMgrError extends Error {

    /**
     * The version identifier for this Serializable class.
     * Increment only if the <i>serialized</i> form of the
     * class changes.
     */
    private static final long serialVersionUID = 1L;

    /*
     * Ordinals for various reasons why an Error of this type can be thrown.
     */

    /**
     * Lexical error occurred.
     */
    static final int LEXICAL_ERROR = 0;

    /**
     * An attempt was made to create a second instance of a static token manager.
     */
    static final int STATIC_LEXER_ERROR = 1;

    /**
     * Tried to change to an invalid lexical state.
     */
    static final int INVALID_LEXICAL_STATE = 2;

    /**
     * Detected (and bailed out of) an infinite loop in the token manager.
     */
    static final int LOOP_DETECTED = 3;

    /**
     * Indicates the reason why the exception is thrown. It will have
     * one of the above 4 values.
     */
    int errorCode;

    /**
     * Replaces unprintable characters by their escaped (or unicode escaped)
     * equivalents in the given string
     */
    protected static final String addEscapes(String str) {
        StringBuffer retval = new StringBuffer();
        char ch;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 0 :
                    continue;
                case '\b':
                    retval.append("\\b");
                    continue;
                case '\t':
                    retval.append("\\t");
                    continue;
                case '\n':
                    retval.append("\\n");
                    continue;
                case '\f':
                    retval.append("\\f");
                    continue;
                case '\r':
                    retval.append("\\r");
                    continue;
                case '\"':
                    retval.append("\\\"");
                    continue;
                case '\'':
                    retval.append("\\\'");
                    continue;
                case '\\':
                    retval.append("\\\\");
                    continue;
                default:
                    if ((ch = str.charAt(i)) < 0x20 || ch > 0x7e) {
                        String s = "0000" + Integer.toString(ch, 16);
                        retval.append("\\u" + s.substring(s.length() - 4, s.length()));
                    } else {
                        retval.append(ch);
                    }
                    continue;
            }
        }
        return retval.toString();
    }

    /**
     * Returns a detailed message for the Error when it is thrown by the
     * token manager to indicate a lexical error.
     * Parameters :
     *    EOFSeen     : indicates if EOF caused the lexical error
     *    curLexState : lexical state in which this error occurred
     *    errorLine   : line number when the error occurred
     *    errorColumn : column number when the error occurred
     *    errorAfter