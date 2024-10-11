// RemoveVowelsTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RemoveVowels}.
* It contains one unit test case for the {@link RemoveVowels#removeVowels(String)} method.
*/
class RemoveVowelsTest {
@Test 
	void testRemoveVowels() {
			assertEquals("removeVowels", removeVowels("abcdef"), "abcdef");
			assertEquals("removeVowels", removeVowels("aaaaab"), "aaaaab"); 
			assertEquals("removeVowels", removeVowels("aab"), "aab"); 
			assertEquals("removeVowels", removeVowels("abca"), "abca");
			assertEquals("removeVowels", removeVowels("a"), "a"); 
			assertEquals("removeVowels", removeVowels("abbc"), "abbc");
			assertEquals("removeVowels", removeVowels("AbBaBa"), "AbBaBa"); 
			assertEquals("removeVowels", removeVowels("aBb"), "aBb"); 
			assertEquals("removeVowels", removeVowels("bcda abcdef"), "bcda abcdef");
			assertEquals("removeVowels", removeVowels("c"), "c"); 
			assertEquals("removeVowels", removeVowels("bb"), "bb"); 
			assertEquals("removeVowels", removeVowels("bbc"), "bbc"); 
			assertEquals("removeVowels", removeVowels("bbcd abcdef"), "bbcd abcdef");
			assertEquals("removeVowels", removeVowels("bbbbbbbb"), "bbbbbbbb"); 
			assertEquals("removeVowels", removeVowels("cccccccc"), "cccccccc");
			assertEquals("removeVowels", removeVowels("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"), 
                     removeVowels("ddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"), 
                     removeVowels("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"), 
                     removeVowels("dddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd")){
            assertEquals("removeVowels", removeVowels("abcdefghijklm"), "abcdefghijklm"); 
            assertEquals("removeVowels", removeVowels("aBb"), "aBb"); 
            assertEquals("removeVowels", removeVowels("abCa"), "abCa");
			assertEquals("removeVowels", removeVowels("bBBa"), "bBBa"); 
			assertEquals("removeVowels", removeVowels("BaBbCa"), "BaBbCa"); 
			assertEquals("removeVowels", removeVowels("bcd"), "bcd"); 
			assertEquals("removeVowels", removeVowels("b"), "b"); 
			assertEquals("removeVowels", removeVowels("ba"), "ba"); 
            
	    }
    }