// AntiShuffleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
// AntiShuffle.java
package scenario3;

class AntiShuffle {

    /**
     * * Write a function that takes a string and returns an ordered version of it.
     * Ordered version of string, is a string where all words (separated by space)
     * are replaced by a new word where all the characters arranged in
     * ascending order based on ascii value.
     * Note: You should keep the order of words and blank spaces in the sentence.
     *
     * For example:
     * antiShuffle('Hi') returns 'Hi'
     * antiShuffle('hello') returns 'ehllo'
     * antiShuffle('Hello World!!!') returns 'Hello!!!Wdlor'
     *
     * > antiShuffle("Hi")
     * "Hi"
     * > antiShuffle("hello")
     * "ehllo"
     * > antiShuffle("number")
     * "bemnru"
     * > antiShuffle("abcd")
     * "abcd"
     * > antiShuffle("Hello World!!!")
     * "Hello!!!Wdlor"
     * > antiShuffle("")
     * ""
     * > antiShuffle("Hi. My name is Mister Robot. How are you?")
     * ".Hi My aemn is Meirst.Rboot How aer?ouy"
     */
    public static String antiShuffle(String s) {
    }
}

// AntiShuffleTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AntiShuffle}.
* It contains one unit test case for the {@link AntiShuffle#antiShuffle(String)} method.
*/
class AntiShuffleTest {
		
	/**
	 * Unit test case for case of string that was passed by parameter.
	 */
    @Test
    void testInputString() {
    	
    	// Test case for case when the string passed is empty
    	assertFalse("Input string can't be empty!",
        		    AntiShuffle.antiShuffle(null));   
    	
    	// Test case for case when the string passed contains only whitespace
    	assertFalse("Input string can't contain only whitespace!",
        		    AntiShuffle.antiShuffle(""));   
    	
    	// Test case for case when the string passed contains only blank (but not including word separator)
    	assertFalse("Input string can't contain only blank (but including word separator) but not itself!",
    			    AntiShuffle.antiShuffle(""));   
    	
    	// Test case for case when the string passed contains only some whitespace
    	assertFalse("Input string can't contain only whitespace on one or on several lines!",
    			    AntiShuffle.antiShuffle("hi"));   
    } // End of test case for output of "AntiShuffle.testInputString()"


		
} // End of class test class.




/* You get the copyright notice and the license of this software
 * from where you access.
 * Copyright (c) 2016-2018
 * University of Oxford
 */
