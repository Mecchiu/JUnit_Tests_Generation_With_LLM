// IsBoredTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
// IsBored.java
package scenario3;

class IsBored {

    /**
     * You'll be given a string of words, and your task is to count the number
     * of boredoms. A boredom is a sentence that starts with the word "I".
     * Sentences are delimited by '.', '?' or '!'.
     *
     * For example:
     * >>> isBored("Hello world")
     * 0
     * >>> isBored("The sky is blue. The sun is shining. I love this weather")
     * 1
     *
     * > isBored("Hello world")
     * 0
     * > isBored("Is the sky blue?")
     * 0
     * > isBored("I love It!")
     * 1
     * > isBored("bIt")
     * 0
     * > isBored("I feel good today. I will be productive. will kill It")
     * 2
     * > isBored("You and I are going for a walk")
     * 0
     */
    public static int isBored(String s) {
    }
}

// IsBoredTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains one unit test case for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testBoringString() {
	
			String s = "A dream and you are hungry in the dorm";
			
			assertFalse(isBored(s));
		
		
		
	}
}