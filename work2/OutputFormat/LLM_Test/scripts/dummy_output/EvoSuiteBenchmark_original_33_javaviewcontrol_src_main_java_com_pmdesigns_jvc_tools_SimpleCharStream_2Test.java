// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {
		java
    @Test
    void testGetImage_emptyBuffer() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader(""), 1, 1);
        assertEquals("", stream.GetImage());
    }

    @Test
    void testGetImage_singleChar() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("a"), 1, 1);
        assertEquals("a", stream.GetImage());
    }

    @Test
    void testGetImage_multipleChars() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("Hello"), 1, 1);
        assertEquals("Hello", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAround() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("World"), 1, 1, 5);
        stream.bufpos = 3;
        stream.tokenBegin = 3;
        assertEquals("rldWo", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAroundWithBackup() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("JavaCC"), 1, 1, 6);
        stream.bufpos = 2;
        stream.tokenBegin = 2;
        stream.backup(2);
        assertEquals("vaCCJa", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAroundWithBackupOverflow() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("JavaCC"), 1, 1, 6);
        stream.bufpos = 2;
        stream.tokenBegin = 2;
        stream.backup(4);
        assertEquals("CCJava", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAroundWithBackupWrapAround() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("JavaCC"), 1, 1, 6);
        stream.bufpos = 2;
        stream.tokenBegin = 2;
        stream.backup(5);
        assertEquals("aCCJav", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAroundWithBackupWrapAroundOverflow() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("JavaCC"), 1, 1, 6);
        stream.bufpos = 2;
        stream.tokenBegin = 2;
        stream.backup(6);
        assertEquals("CCJava", stream.GetImage());
    }

    @Test
    void testGetImage_wrapAroundWithBackupWrapAroundOverflow2() {
        SimpleCharStream stream = new SimpleCharStream(new java.io.StringReader("JavaCC"), 1, 1, 6);
        stream.bufpos = 2;
        stream.tokenBegin = 2;
        stream.backup(7);
        assertEquals("CCJava", stream.GetImage());
    }
}