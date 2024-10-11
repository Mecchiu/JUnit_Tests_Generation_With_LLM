// MatchParensTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MatchParens}.
* It contains one unit test case for the {@link MatchParens#matchParens(List)} method.
*/
class MatchParensTest {
/**
	* Test method for {@link MatchParens#matchParens(List)}.
	*/
		@Test
		public void testMatchParensList() {
				// [()()     ]
				// ([())())( ())
				List<String> res = matchParens(["()", "(()()"));
				assertEquals(1, res.size());
				String resStr = res.get(0);
				assertEquals("()()()", resStr);
				
				// [()()()()    ]
				// ([()()()])()
				res = matchParens(["()", "()()", "(()()", "()()"]);
				assertEquals(2, res.size());
				resStr = res.get(1);
				assertEquals("()()()", resStr);
				resStr = res.get(0);
				assertEquals("()()()", resStr);

		}
}
