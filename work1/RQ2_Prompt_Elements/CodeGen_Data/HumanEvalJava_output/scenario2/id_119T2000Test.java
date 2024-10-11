// MatchParensTest.java
package scenario2;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains one unit test case for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
/**
		* Initial test cases.
		*/
        public static final String[] testCases = {
            "",
            "X",
            "(X)",
            "()()"
        };

        /**
		* The test cases with empty strings as parameters.
		*/
        @Test
        public void testCasesWithNoParameters() {
            assertEquals("",matchParens(testCases).trim());
        }

        /**
		* The test cases with two parameters as strings as parameters.
		*/
        @Test
        public void testCasesWithTwoParameters() {
            for(String testCase:testCases) { assertEquals("(" + testCase + ")", matchParens(testCases, testCase).trim()); }
		}

        /**
		* The test cases with three parameters as strings as parameters.
		*/
        @Test
        public void testCasesWithThreeParameters() {
            for(String testCase:testCases) { assertEquals("()()", matchParens(testCases, testCase.substring(0, testCase.length() - 1)).trim()); }
		}

				/**
				* The test cases with a left bracket as parameter.
				*/
        @Test
        public void testCasesWithBracket() {
            assertFalse(matchParens("X()").isEmpty());}


				/**
				* The test cases with a right bracket as parameter.
				*/
        @Test
        public void testCasesWithRightBracket() {
            assertFalse(matchParens("()()").isEmpty());}




        /**
		 * The test cases with three parameters as strings as parameter and only one
		 * character as the left argument.
		 */
        @Test
        public void testCasesWithThreeParametersAndOnlyOneCharacterLeft() {
            for(String testCase :testCases) { assertEquals("()(())", matchParens(testCase, "()()").trim()); }
		}

        /**
		 * The test cases with three parameters as strings as parameter and only one
		 * character as the right argument.
		 */
        @Test
        public void testCasesWithThreeParametersAndOnlyOneCharacterRight() {
            for(String testCase :testCases) { assertEquals("(()(),)", matchParens(testCase, "()()").trim()); }
		}

        /**
		 * The test cases with three parameters as strings as parameter and the first
		 * and last characters as the arguments.
		 */
        @Test
        public void testCasesWithThreeParametersAndFirstAndLastCharactersAsArguments() {
            for(String testCase :testCases) { assertEquals("((),", matchParens(testCase, "()()").trim().substring(0, 2).trim()); }
		}

        /**
		 * The test cases with three parameters as strings as paramets and the arguments
		 * as parameters.
		 */
        @Test
        public void testCasesWithThreeParametersAndArgumentsAsParameters() {
            for(String testCase :testCases) { assertEquals("(*())", matchParens(testCase, "())").trim().substring(0, testCase.length() - 2); }
		}

        /**
		 * The test cases with left and right parentheses as arguments.
		 */
        @Test
        public void testCasesWithBothParensAsParameters() {
            for(String testCase :testCases) { assertEquals("(()(),)", matchParens(testCase, "()()").trim()); }
		}

		/**
		 * The test cases with no parentheses.
		 */
	@Test
        public void testCasesWithNoParens() {
            assertEquals("()()", matchParens(testCases, "(())").trim());
		}


		/**
		 * The test cases with only a parenthesis.
		 */
	@Test
        public void testCasesWithOnlyParens() {
            assertEquals("()()", matchParens(testCases, "()()").trim());
		}

        @Test
        public void testCaseWithLeftParenthesis(){
            assertEquals("()()", matchParens(testCases, "()(()()").trim());
        }
        /**
		 * The test cases with a left parenthesis (this one) as the first argument.
		 */
        @Test
        public void testCasesWithLeftParenthesisAsArgument(){
            assertEquals("()()", matchParens(testCases, "()(())").trim());
        }

        /**
		 * The test cases with a left parenthesis as the last argument.
		 */
        @Test
        public void testCasesWithLeftParenthesisAsArgumentLast(){
            assertEquals("())()", matchParens(testCases, "()(())").trim());
        }

        /**
		 * The test cases with a right parenthesis as the first argument.
		 */
        @Test
        public void testCasesWithRightParenthesisAsArgumentFirst(){
            assertEquals("(()()", matchParens(testCases, "()()(())").trim());
        }

        /**
		 * The test cases with a right parenthesis as the last argument.
		 */
        @Test
        public void testCasesWithRightParenthesisAsArgumentLast(){
            assertEquals("(()()", matchParens(testCases, "()()(())").trim());
		}
}