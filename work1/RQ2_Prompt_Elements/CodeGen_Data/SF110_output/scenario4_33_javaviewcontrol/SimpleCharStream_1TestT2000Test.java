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
* Test read a character.
*/
@Test
    public void testReadChar() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.InputStreamReader(
                new java.io.FileInputStream(System.getProperty("user.dir") + "/resources/data/bibtex/LICENSE.txt")));
        char c;
        Object v;

        v = stream.readChar();


        assertEquals('\ud800',v);


    }


    /**
     * Test method for {@link SimpleCharStream#BeginToken()}.
     */
    @Test
    public void testBeginToken() throws java.io.IOException {
        final java.io.Reader reader = new java.io.StringReader("\"abc\"\n");
        //java.io.StringReader(String)
        //java.io.Reader(Buffer)
        //java.io.StringBuffer
        //java.io.ByteArrayInputStream
        String s;

        s = (String)SimpleCharStream.getInstance().readChar();
        assertEquals("abc",s);
    }


    /**
     * Test method for {@link SimpleCharStream#UpdateLineColumn(char)}
     */
    @Test
    public void testUpdateLineColumn() throws java.io.IOException {
        final java.io.Reader reader = new java.io.StringReader("\"abc\"\n");
        //java.io.StringReader(String)
        //java.io.StringBuffer
        //java.io.ByteArrayInputStream
        String s;

        s = (String)SimpleCharStream.getInstance().readChar();
        assertTrue(s.startsWith("abc"));

//        SimpleCharStream.getInstance().updateLineColumn(s,2);
        //SimpleCharStream.getInstance().updateLineColumn(s,4);
    }

}