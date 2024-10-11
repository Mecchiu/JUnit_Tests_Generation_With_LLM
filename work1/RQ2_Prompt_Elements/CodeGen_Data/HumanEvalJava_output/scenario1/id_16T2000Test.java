// CountDistinctCharactersTest.java
package scenario1;

import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountDistinctCharacters}.
* It contains one unit test case for the {@link CountDistinctCharacters#countDistinctCharacters(String)} method.
*/
class CountDistinctCharactersTest {
public static final Set<Character> A = new HashSet<Character>();
			public static final Set<Character> B = new HashSet<Character>();
				String str;
				
				public static void main(String[] args) {
			//	System.exit(new Test().test());
		}
	
				/**
				 * A test case for {@link CountDistinctCharacters#countDistinctCharacters(String)}.
				 * It tests method under test.
				 */
	@Test
    public void test(){
		A.addAll(B);
		A.remove(A.iterator().next());
		assertEquals(5, A.size(), 0);
    };
		}

// CountDistinctCharactersTest.java