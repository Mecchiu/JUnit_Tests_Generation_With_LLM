// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains one unit test case for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {
		
    /**
     * Test that the decompilation of the String, the initial indentation offset,
     * an additional "indentation gap", and a "preserved comment" is
     * saved properly.  The method also checks the return value of the
     * {@link #decompile} method.
     */
	@Test
	void test1() throws Exception {
        String source = "a\nb\nc\nd";
        String expected = "a";
        int i = 0;
        assertEquals("incorrect encoding",expected,decompile(source,1,0));
		i=getOffsetAfter(source,"indent\n1\n");
        assertEquals("incorrect number of tokens", 3,i);
		i=getOffsetAfter(source,"indent\n");
        assertEquals("incorrect number of tokens", 2,i);
		i=getOffsetAfter(source,"indent\n#b\nc");
        assertEquals("incorrect number of tokens", 8,i);
		i=getOffsetAfter(source,"indent\n#b\nd");
        assertEquals("incorrect number of tokens", 20, i);
	}
    
    /**
     * Test that the decompilation of only the first line of source information
     * is saved.
     */
	@Test
	void test2() throws Exception {
        String source = "1\t2\na\tc";
        String expected = "1";
        int i = 0;
        assertEquals("incorrect encoding",expected,decompile(source,1,0));
		i=getOffsetAfter(source,"\n");
        assertEquals("incorrect number of tokens", 1,i);
		i=getOffsetAfter(source,"\n");
        assertEquals("incorrect number of tokens", 1,i);
		i=getOffsetAfter(source,"\n\n");
        assertEquals("incorrect number of tokens", 3,i);
		i=getOffsetAfter(source,"\n\n\n\n");
        assertEquals("incorrect number of tokens", 10,i);
	}
    
    /**
     * Test that when an initial indentation offset is omitted the method
     * also restores it to be the initial case.
     */
	@Test
	void test3() throws Exception {
        String source = "aaaaaaa\nl\nbbbbbbb\nlbbb\nb\nccccccccc\n";
        int i = 0;
        assertEquals("incorrect encoding","ccccccccc",
                               decompile(source,0,-1));
        i+=getOffsetAfter(source,"\n");
        assertEquals("incorrect number of tokens",
                3,i);
        i+=getOffsetAfter(source,"\\n");
        assertEquals("incorrect number of tokens",
                1,i);
        i+=getOffsetAfter(source,"\\n\\n");
        assertEquals("incorrect number of tokens",
                1,i);
        i+=getOffsetAfter(source,"\\n\\n");
        assertEquals("incorrect number of tokens",
                1,i);
        i+=getOffsetAfter(source,"\\nbbb\\n");
}
}