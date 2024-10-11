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
     * > isBored("I love It !")
     * 1
     * > isBored("bIt")
     * 0
     * > isBored("I feel good today. I will be productive. will kill It")
     * 2
     * > isBored("You and I are going for a walk")
     * 0
     */
    public static int isBored(String s) {
        int count = 0;
        String[] sentences = s.split("[.?!]");
        for (String sentence : sentences) {
            if (sentence.trim().startsWith("I ")) {
                count++;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
    
    @Test
    void testEmptyString() {
        assertEquals(0, IsBored.isBored(""));
    }
    
    @Test
    void testNoBoredom() {
        assertEquals(0, IsBored.isBored("Hello world"));
        assertEquals(0, IsBored.isBored("Is the sky blue?"));
        assertEquals(0, IsBored.isBored("bIt"));
        assertEquals(0, IsBored.isBored("You and I are going for a walk"));
    }
    
    @Test
    void testOneBoredom() {
        assertEquals(1, IsBored.isBored("I love It !"));
        assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
    }
    
    @Test
    void testMultipleBoredoms() {
        assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
    }
}