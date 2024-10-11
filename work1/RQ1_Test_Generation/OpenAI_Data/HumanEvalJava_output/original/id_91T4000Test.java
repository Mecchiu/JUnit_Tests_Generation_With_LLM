// IsBoredTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {

	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored(" "));
	}
}

// IsBored.java
package refactored;

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
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored(" "));
	}
}

// IsBored.java
package refactored;

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
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored(" "));
	}
}

// IsBored.java
package refactored;

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
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored(" "));
	}
}

// IsBored.java
package refactored;

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
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You and I are going for a walk"));
		assertEquals(0, IsBored.isBored(""));
		assertEquals(0, IsBored.isBored(" "));
	}
}

// IsBored.java
package refactored;

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
        String[] sentences = s.split("[.!?]");
        for (String sentence : sentences) {
            String[] words = sentence.split(" ");
            boolean firstWord = false;
            for (String word : words) {
                if (word.length() == 0)
                    continue;
                else {
                    firstWord = true;
                    if (word.equals("I")) {
                        count++;
                    }
                }
                if (firstWord)
                    break;
            }
        }
        return count;
    }
}

// IsBoredTest.java
package refactored;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsBored}.
* It contains ten unit test cases for the {@link IsBored#isBored(String)} method.
*/
class IsBoredTest {
		
	@Test
	void testIsBored() {
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(1, IsBored.isBored("The sky is blue. The sun is shining. I love this weather"));
		assertEquals(0, IsBored.isBored("Hello world"));
		assertEquals(0, IsBored.isBored("Is the sky blue?"));
		assertEquals(1, IsBored.isBored("I love It !"));
		assertEquals(0, IsBored.isBored("bIt"));
		assertEquals(2, IsBored.isBored("I feel good today. I will be productive. will kill It"));
		assertEquals(0, IsBored.isBored("You