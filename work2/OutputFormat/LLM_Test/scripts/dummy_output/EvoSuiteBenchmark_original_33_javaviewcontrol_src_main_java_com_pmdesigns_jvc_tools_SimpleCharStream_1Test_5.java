// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {
		/**
		* Test for <code>ReadChar()</code> method,
		* thrown an exception when the parser is initialized.
		*/
    @Test
    public void testReadChar() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        char c = stream.readChar();

    }

        /**
         * Test for <code>readChar</code> method, returned char is <code>null</code>.
         */
    @Test(expected = java.io.EOFException.class)
    public void testReadCharNegative() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        stream.readChar();

    }

        /**
         * Test for <code>skipChar</code> method,
         */
    @Test
    public void testSkipChar() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
        String expected = "";
        char ch = stream.skipChar();

        assertNull(expected);
        assertEquals(ch,stream.readChar());

        System.out.println("TestSkipChar: " + expected + "=" + ch);

    }

        /**
         * Test for <code>skipChar</code> method, returned char is <code>null</code>.
         */
    @Test
    public void testSkipCharLF() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("\n\r"));
        char ch = stream.skipChar();

        assertNull(ch);

        System.out.println("TestSkipCharLF");
    }

		/**
		* Test for <code>skipChar</code> method,
		* returned char is <code>null</code>.
		*/
    @Test
    public void testSkipCharCRLF() throws java.io.IOException {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("\r\n"));
        char ch = stream.skipChar();

        assertNull(ch);

        System.out.println("TestSkipCharCRLF");
    }


		/**
		* Test for <code>skipEOF</code> method,
		* returned char is <code>null</code>.
		*/
    @Test
    public void testSkipEOF() {
		SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""));
}
}