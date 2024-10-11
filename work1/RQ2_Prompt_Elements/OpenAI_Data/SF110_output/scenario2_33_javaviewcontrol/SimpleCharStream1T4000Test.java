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
	* Test case 1 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar1() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 2 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar2() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 3 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar3() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 4 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar4() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 5 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar5() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 6 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar6() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 7 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar7() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 8 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar8() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 9 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar9() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
	
	/**
	* Test case 10 for {@link SimpleCharStream#readChar()}.
	* It tests the method with a null value.
	*/
	@Test
	void testReadChar10() {
		SimpleCharStream scs = new SimpleCharStream();
		try {
			scs.readChar();
		} catch (Exception e) {
			assertTrue(e instanceof java.io.IOException);
		}
	}
}

// Token.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;

public class Token {

    /**
     * The next token in the token input stream.
     */
    public Token next;

    /**
     * The token type.
     */
    public int kind;

    /**
     * The token image.
     */
    public String image;

    /**
     * A reference to the next regular (non-special) token from the input
     * stream. If this is the last token from the input stream, or if the
     * token manager has not read tokens beyond this one, this field is
     * set to null. This is true only if this token is also a regular
     * token. Otherwise, see below for a description of the contents of
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
     * An optional attribute value of the Token.
     * Tokens which are not used as syntactic sugar will often contain
     * meaningful values that will be used later on by the compiler or
     * interpreter. This attribute value is often different from the image.
     * Any subclass of Token that actually wants to return a non-null value can
     * override this method as appropriate.
     */
    public Object getValue() {
        return null;
    }

    /**
     * No-argument constructor
     */
    public Token() {
    }

    /**
     * Constructs a new token for the specified Image.
     */
    public Token(int kind) {
        this(kind, null);
    }

    /**
     * Constructs a new token for the specified Image and Kind.
     */
    public Token(int kind, String image) {
        this.kind = kind;
        this.image = image;
    }

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
     * <p/>
     * case MyParserConstants.ID : return new IDToken(ofKind, image);
     * <p/>
     * to the following switch statement. Then you can cast matchedToken
     * variable to the appropriate type and use sit in your lexical actions.
     */
    public static Token newToken(int ofKind, String image) {
        switch (ofKind) {
            default:
                return new Token(ofKind, image);
        }
    }

    public static Token newToken(int ofKind) {
        return newToken(ofKind, null);
    }
}

// TokenTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains ten unit test cases for the {@link Token#getValue()} method.
*/
class TokenTest {
		
	/**
	* Test case 1 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue1() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 2 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue2() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 3 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue3() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 4 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue4() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 5 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue5() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 6 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue6() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 7 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue7() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 8 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue8() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 9 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue9() {
		Token t = new Token();
		assertNull(t.getValue());
	}
	
	/**
	* Test case 10 for {@link Token#getValue()}.
	* It tests the method with a null value.
	*/
	@Test
	void testGetValue10() {
		Token t = new Token();
		assertNull(t.getValue());
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
                case 0:
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
     * EOFSeen     : indicates if EOF caused the lexical error
     * curLexState : lexical state in which this error occurred
     * errorLine   : line number when the error occurred
     * errorColumn : column number when the error occurred
     * errorAfter  : prefix that was seen before this error occurred
     * curchar     : the offending character
     * Note: You can customize the lexical error message by modifying this method.
     */
    protected static String LexicalError(boolean EOFSeen, int lexState, int errorLine, int errorColumn, String errorAfter, char curChar) {
        return ("Lexical error at line " +
                errorLine + ", column " +
                errorColumn + ".  Encountered: " +
                (EOFSeen ? "<EOF> " : ("\"" + addEscapes(String.valueOf(curChar)) + "\"") + " (" + (int) curChar + "), ") +
                "after : \"" + addEscapes(errorAfter) + "\"");
    }

    /**
     * You can also modify the body of this method to customize your error messages.
     * For example, cases like LOOP_DETECTED and INVALID_LEXICAL_STATE are not
     * of end-users concern, so you can return something like :
     * <p/>
     * "Internal Error : Please file a bug report .... "
     * <p/>
     * from this method for such cases in the release version of your parser.
     */
    public String getMessage() {
        return super.getMessage();
    }

    /*
     * Constructors of various flavors follow.
     */

    /**
     * No arg constructor.
     */
    public TokenMgrError() {
    }

    /**
     * Constructor with message and reason.
     */
    public Token