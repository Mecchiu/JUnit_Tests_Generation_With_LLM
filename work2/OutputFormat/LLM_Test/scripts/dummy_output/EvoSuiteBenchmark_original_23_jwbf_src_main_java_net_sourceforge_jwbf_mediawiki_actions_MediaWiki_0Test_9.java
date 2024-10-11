// MediaWiki_0Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#getCharset()} method.
*/
class MediaWiki_0Test {
		
    /**
     * Tests {@link MediaWiki#getCharset()}.
     */
    @Test
    public void testGetCharset() {
        assertNotNull(MediaWiki.getCharset());
    }
    
    /**
     * Tests {@link MediaWiki#getCharset()WithSpace}.
     */
    @Test
    public void testGetCharsetWithSpace() {
        Set<String> testStrings = new HashSet<>(1);
        testStrings.add(" ");

        Set<String> resultStrings = getCharset().getStrings(testStrings);
        assertEquals(3, resultStrings.size());
    }
	
    /**
     * Tests {@link MediaWiki#getCharset()Getter}.
     */
    @Test
    public void testGetCharsetGetter() {
        assertNotNull(MediaWiki.getCharset());
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String)}.
     */
    @Test
    public void testReplaceCharset() {
        assertNotNull(MediaWiki.replaceCharset("", ""));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithNoSeparator() {
        assertNotNull(MediaWiki.replaceCharset("", "", ""));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithSeparator() {
        assertNotNull(MediaWiki.replaceCharset("test", " ", "test"));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String,String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithSeparatorNoSeparator() {
        assertNotNull(MediaWiki.replaceCharset("tes", " ", "test"));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String)}.
     */
    @Test
    public void testReplaceCharset() {
        String testCharset = "text";
        assertEqual(testCharset, MediaWiki.replaceCharset("text", testCharset));
        testCharset = "text";
        assertEqual(testCharset, MediaWiki.replaceCharset("text", "text", testCharset));
        testCharset = "";
        assertEqual(testCharset, MediaWiki.replaceCharset("text", "", testCharset));
        testCharset = "";
        assertEqual(testCharset, MediaWiki.replaceCharset("", "", testCharset));
        testCharset = "test";
        assertEqual(testCharset, MediaWiki.replaceCharset("test", " ", testCharset));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String,String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithNoSeparator() {
        String testCharset = "test";
        assertEqual(testCharset, MediaWiki.replaceCharset("test", " ", testCharset));
        testCharset = "text";
        assertEqual(testCharset, MediaWiki.replaceCharset("test", " ", testCharset));
        testCharset = "";
        assertEqual(testCharset, MediaWiki.replaceCharset("", "", testCharset));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharsetWithSeparator(String,String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithSeparator() {
        String testCharset = "text";
        assertEqual(testCharset, MediaWiki.replaceCharset("test", " ", testCharset));
        testCharset = "text";
        assertEqual(testCharset, MediaWiki.replaceCharset("test", "text", testCharset));
    }
    
    /**
     * Tests {@link MediaWiki#replaceCharset(String,String,String,String,String,String)}.
     */
    @Test
    public void testReplaceCharsetWithSeparatorNoSeparator() {
        String testCharset = "test";
        assertEqual(testCharset, MediaWiki.replaceCharset("tes", " ", testCharset));
        testCharset = "";
        assertEqual(testCharset, MediaWiki.replaceCharset("tes", " ", testCharset));
        testCharset = "";
        assertEqual(testCharset, MediaWiki.replaceCharset("", "", testCharset));
        testCharset = "test";
        assertEqual(testCharset, MediaWiki.replaceCharset("tes", " ", testCharset));
    }
    
    /**
     * Tests {@link MediaWiki#removeMediaWikiSpace(String)}.
    */
    @Test
    public void testRemoveMediaWikiSpace() {
        String testStr = "test\twith\r\twith\n\n\n\n\n";
        assertFalse(MediaWiki.removeMediaWikiSpace(testStr));
        assertFalse(MediaWiki.removeMediaWikiSpace(""));
    }
    
    /**
     * Tests {@link MediaWiki#replaceAllNewlines(String)}.
     */
    @Test
    public void testReplaceAllNewlines() throws UnsupportedEncodingException, UnsupportedEncodingException {
        String testStr = "   \\n\\r\\t\\f";
        assertEqual(testStr, MediaWiki.replaceAllNewlines(testStr).replace("\n", "\r\n", ""));
    }

    /**
     * Tests the {@link Set#contains(Object)} function.
     */
    @Test
    public void testContains() {
        Set<String> test = new HashSet<>(1);
        String testStr = "test";
        assertTrue(test.contains(testStr));
    }

    /**
     * Tests if a string contains all contained words.
     */
    @Test
    public void testContainsAllWords() {
        Set<String> test = new HashSet<>(1);
        String testStr = "hello";
        assertTrue(test.containsAll(test));
    }

    /**
     * Tests if a string contains all contained words.
     */
    @Test
    public void testContainsNonexistentCharacters() {
        Set<String> test = new HashSet<>(1);
        String testStr = "hello bye";
        assertFalse(test.contains(testStr));
    }

    /**
     * Tests if an unescaped string contains only escaped characters.

     * @throws UnsupportedEncodingException
     */
    @Test
    public void testContainsOnlyEscapedCharacters() throws UnsupportedEncodingException {
        assertEqual("hello", "hello", MediaWiki.replaceAllNewlines("hello").replace("\\", "|"));
}
}