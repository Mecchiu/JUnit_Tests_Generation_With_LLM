// CorrectBracketing1Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing1}.
* It contains ten unit test cases for the {@link CorrectBracketing1#correctBracketing(String)} method.
*/
class CorrectBracketing1Test {

	@Test
	void testCorrectBracketing1() {
		assertTrue(CorrectBracketing1.correctBracketing("()"));
	}
	
	@Test
	void testCorrectBracketing2() {
		assertTrue(CorrectBracketing1.correctBracketing("(()())"));
	}
	
	@Test
	void testCorrectBracketing3() {
		assertTrue(CorrectBracketing1.correctBracketing("()()(()())()"));
	}
	
	@Test
	void testCorrectBracketing4() {
		assertTrue(CorrectBracketing1.correctBracketing("()()((()()())())(()()(()))"));
	}
	
	@Test
	void testCorrectBracketing5() {
		assertFalse(CorrectBracketing1.correctBracketing("((()())))"));
	}
	
	@Test
	void testCorrectBracketing6() {
		assertFalse(CorrectBracketing1.correctBracketing(")(()"));
	}
	
	@Test
	void testCorrectBracketing7() {
		assertFalse(CorrectBracketing1.correctBracketing("("));
	}
	
	@Test
	void testCorrectBracketing8() {
		assertFalse(CorrectBracketing1.correctBracketing("(((("));
	}
	
	@Test
	void testCorrectBracketing9() {
		assertFalse(CorrectBracketing1.correctBracketing(")"));
	}
	
	@Test
	void testCorrectBracketing10() {
		assertFalse(CorrectBracketing1.correctBracketing("(()"));
	}
	
	@Test
	void testCorrectBracketing11() {
		assertFalse(CorrectBracketing1.correctBracketing("()()(()())())(()"));
	}
	
	@Test
	void testCorrectBracketing12() {
		assertFalse(CorrectBracketing1.correctBracketing("()()(()())()))()"));
	}
}

// CorrectBracketing2.java
package original;

class CorrectBracketing2 {

    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

// CorrectBracketing2Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing2}.
* It contains ten unit test cases for the {@link CorrectBracketing2#correctBracketing(String)} method.
*/
class CorrectBracketing2Test {
		
	@Test
	void testCorrectBracketing1() {
		assertTrue(CorrectBracketing2.correctBracketing("()"));
	}
	
	@Test
	void testCorrectBracketing2() {
		assertTrue(CorrectBracketing2.correctBracketing("(()())"));
	}
	
	@Test
	void testCorrectBracketing3() {
		assertTrue(CorrectBracketing2.correctBracketing("()()(()())()"));
	}
	
	@Test
	void testCorrectBracketing4() {
		assertTrue(CorrectBracketing2.correctBracketing("()()((()()())())(()()(()))"));
	}
	
	@Test
	void testCorrectBracketing5() {
		assertFalse(CorrectBracketing2.correctBracketing("((()())))"));
	}
	
	@Test
	void testCorrectBracketing6() {
		assertFalse(CorrectBracketing2.correctBracketing(")(()"));
	}
	
	@Test
	void testCorrectBracketing7() {
		assertFalse(CorrectBracketing2.correctBracketing("("));
	}
	
	@Test
	void testCorrectBracketing8() {
		assertFalse(CorrectBracketing2.correctBracketing("(((("));
	}
	
	@Test
	void testCorrectBracketing9() {
		assertFalse(CorrectBracketing2.correctBracketing(")"));
	}
	
	@Test
	void testCorrectBracketing10() {
		assertFalse(CorrectBracketing2.correctBracketing("(()"));
	}
	
	@Test
	void testCorrectBracketing11() {
		assertFalse(CorrectBracketing2.correctBracketing("()()(()())())(()"));
	}
	
	@Test
	void testCorrectBracketing12() {
		assertFalse(CorrectBracketing2.correctBracketing("()()(()())()))()"));
	}
}

// CorrectBracketing3.java
package original;

class CorrectBracketing3 {

    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

// CorrectBracketing3Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing3}.
* It contains ten unit test cases for the {@link CorrectBracketing3#correctBracketing(String)} method.
*/
class CorrectBracketing3Test {
		
	@Test
	void testCorrectBracketing1() {
		assertTrue(CorrectBracketing3.correctBracketing("()"));
	}
	
	@Test
	void testCorrectBracketing2() {
		assertTrue(CorrectBracketing3.correctBracketing("(()())"));
	}
	
	@Test
	void testCorrectBracketing3() {
		assertTrue(CorrectBracketing3.correctBracketing("()()(()())()"));
	}
	
	@Test
	void testCorrectBracketing4() {
		assertTrue(CorrectBracketing3.correctBracketing("()()((()()())())(()()(()))"));
	}
	
	@Test
	void testCorrectBracketing5() {
		assertFalse(CorrectBracketing3.correctBracketing("((()())))"));
	}
	
	@Test
	void testCorrectBracketing6() {
		assertFalse(CorrectBracketing3.correctBracketing(")(()"));
	}
	
	@Test
	void testCorrectBracketing7() {
		assertFalse(CorrectBracketing3.correctBracketing("("));
	}
	
	@Test
	void testCorrectBracketing8() {
		assertFalse(CorrectBracketing3.correctBracketing("(((("));
	}
	
	@Test
	void testCorrectBracketing9() {
		assertFalse(CorrectBracketing3.correctBracketing(")"));
	}
	
	@Test
	void testCorrectBracketing10() {
		assertFalse(CorrectBracketing3.correctBracketing("(()"));
	}
	
	@Test
	void testCorrectBracketing11() {
		assertFalse(CorrectBracketing3.correctBracketing("()()(()())())(()"));
	}
	
	@Test
	void testCorrectBracketing12() {
		assertFalse(CorrectBracketing3.correctBracketing("()()(()())()))()"));
	}
}

// CorrectBracketing4.java
package original;

class CorrectBracketing4 {

    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

// CorrectBracketing4Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CorrectBracketing4}.
* It contains ten unit test cases for the {@link CorrectBracketing4#correctBracketing(String)} method.
*/
class CorrectBracketing4Test {
		
	@Test
	void testCorrectBracketing1() {
		assertTrue(CorrectBracketing4.correctBracketing("()"));
	}
	
	@Test
	void testCorrectBracketing2() {
		assertTrue(CorrectBracketing4.correctBracketing("(()())"));
	}
	
	@Test
	void testCorrectBracketing3() {
		assertTrue(CorrectBracketing4.correctBracketing("()()(()())()"));
	}
	
	@Test
	void testCorrectBracketing4() {
		assertTrue(CorrectBracketing4.correctBracketing("()()((()()())())(()()(()))"));
	}
	
	@Test
	void testCorrectBracketing5() {
		assertFalse(CorrectBracketing4.correctBracketing("((()())))"));
	}
	
	@Test
	void testCorrectBracketing6() {
		assertFalse(CorrectBracketing4.correctBracketing(")(()"));
	}
	
	@Test
	void testCorrectBracketing7() {
		assertFalse(CorrectBracketing4.correctBracketing("("));
	}
	
	@Test
	void testCorrectBracketing8() {
		assertFalse(CorrectBracketing4.correctBracketing("(((("));
	}
	
	@Test
	void testCorrectBracketing9() {
		assertFalse(CorrectBracketing4.correctBracketing(")"));
	}
	
	@Test
	void testCorrectBracketing10() {
		assertFalse(CorrectBracketing4.correctBracketing("(()"));
	}
	
	@Test
	void testCorrectBracketing11() {
		assertFalse(CorrectBracketing4.correctBracketing("()()(()())())(()"));
	}
	
	@Test
	void testCorrectBracketing12() {
		assertFalse(CorrectBracketing4.correctBracketing("()()(()())()))()"));
	}
}

// CorrectBracketing5.java
package original;

class CorrectBracketing5 {

    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
}

// CorrectBracketing5Test.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class