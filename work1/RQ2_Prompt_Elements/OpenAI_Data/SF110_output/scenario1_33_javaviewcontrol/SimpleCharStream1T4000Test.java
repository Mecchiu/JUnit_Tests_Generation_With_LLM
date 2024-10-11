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
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput2() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput3() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 0;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput4() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput5() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput6() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 1;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput7() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('c', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput8() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 1;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput9() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 2;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 2;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('b', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
	
	/**
	* Test case for {@link SimpleCharStream#readChar()} method.
	* It tests the method with a valid input.
	*/
	@Test
	void testReadChar_ValidInput10() {
		SimpleCharStream scs = new SimpleCharStream();
		scs.buffer = new char[] {'a', 'b', 'c'};
		scs.bufpos = 0;
		scs.bufsize = 3;
		scs.maxNextCharInd = 3;
		scs.inBuf = 3;
		scs.tabSize = 8;
		scs.trackLineColumn = true;
		scs.column = 0;
		scs.line = 1;
		
		try {
			assertEquals('a', scs.readChar());
		} catch (java.io.IOException e) {
			fail("Exception thrown");
		}
	}
}

// Token.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;

public class Token {

    public int kind;
    public int beginLine;
    public int beginColumn;
    public int endLine;
    public int endColumn;
    public String image;
    public Token next;
    public Token specialToken;
}

// TokenMgrError.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;

public class TokenMgrError extends Error {

    private static final long serialVersionUID = 1L;
    protected boolean EOFSeen;
    protected int errorLine;
    protected int errorColumn;
    protected String errorAfter;
    protected char curChar;
}

// TokenMgrErrorTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenMgrError}.
* It contains two unit test cases for the {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
*/
class TokenMgrErrorTest {
		
	/**
	* Test case for {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testTokenMgrError_ValidInput() {
		TokenMgrError tme = new TokenMgrError("test", 1, 2, 3, "test", 'a');
		assertEquals("test", tme.getMessage());
		assertEquals(1, tme.errorLine);
		assertEquals(2, tme.errorColumn);
		assertEquals(3, tme.errorAfter.length());
		assertEquals('a', tme.curChar);
	}
	
	/**
	* Test case for {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testTokenMgrError_ValidInput2() {
		TokenMgrError tme = new TokenMgrError("test", 1, 2, 3, "test", 'b');
		assertEquals("test", tme.getMessage());
		assertEquals(1, tme.errorLine);
		assertEquals(2, tme.errorColumn);
		assertEquals(3, tme.errorAfter.length());
		assertEquals('b', tme.curChar);
	}
}

// TokenMgrErrorTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TokenMgrError}.
* It contains two unit test cases for the {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
*/
class TokenMgrErrorTest {
		
	/**
	* Test case for {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testTokenMgrError_ValidInput() {
		TokenMgrError tme = new TokenMgrError("test", 1, 2, 3, "test", 'a');
		assertEquals("test", tme.getMessage());
		assertEquals(1, tme.errorLine);
		assertEquals(2, tme.errorColumn);
		assertEquals(3, tme.errorAfter.length());
		assertEquals('a', tme.curChar);
	}
	
	/**
	* Test case for {@link TokenMgrError#TokenMgrError(String, int, int, int, String, char)} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testTokenMgrError_ValidInput2() {
		TokenMgrError tme = new TokenMgrError("test", 1, 2, 3, "test", 'b');
		assertEquals("test", tme.getMessage());
		assertEquals(1, tme.errorLine);
		assertEquals(2, tme.errorColumn);
		assertEquals(3, tme.errorAfter.length());
		assertEquals('b', tme.curChar);
	}
}

// TokenTest.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Token}.
* It contains two unit test cases for the {@link Token#Token()} constructor.
*/
class TokenTest {
		
	/**
	* Test case for {@link Token#Token()} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testToken_ValidInput() {
		Token t = new Token();
		assertEquals(0, t.kind);
		assertEquals(0, t.beginLine);
		assertEquals(0, t.beginColumn);
		assertEquals(0, t.endLine);
		assertEquals(0, t.endColumn);
		assertEquals(null, t.image);
		assertEquals(null, t.next);
		assertEquals(null, t.specialToken);
	}
	
	/**
	* Test case for {@link Token#Token()} constructor.
	* It tests the constructor with a valid input.
	*/
	@Test
	void testToken_ValidInput2() {
		Token t = new Token();
		assertEquals(0, t.kind);
		assertEquals(0, t.beginLine);
		assertEquals(0, t.beginColumn);
		assertEquals(0, t.endLine);
		assertEquals(0, t.endColumn);
		assertEquals(null, t.image);
		assertEquals(null, t.next);
		assertEquals(null, t.specialToken);
	}
}

// TokenTest.java
package com.pmdesigns.jvc.tools;

