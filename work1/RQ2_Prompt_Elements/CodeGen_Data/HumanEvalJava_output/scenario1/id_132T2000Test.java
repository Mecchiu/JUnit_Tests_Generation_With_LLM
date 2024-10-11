// IsNestedTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains one unit test case for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

	/**
	* Test method for {@link IsNested#isNested(String)}.
	*/
	@Test
    public final void test_isNested_with_string() {
        assertArrayEquals("Result should be correct", new String[] {"[1]", "abcdefgh[1]", "[1],abc[1],abc", "[2]", "[3]", "[3][1]", "[2][3]", "[1][2]", "[2][1][2]", "[2][1][1]","[1][1]", "[1][1]", "[1][2]", "[1][3]", "[2][2][1]", "[2][2][2][1]", "[2][3][1]", "[2][3][2]", "[2][3][3]", "[2][3][4]", "[3][2][1]", "[3][2][4]", "[3][3]+[3][2]", "[3][1]]", "[3][[3],1]", "[3][[3],abc[3]]", "[3][[3,1],1]", "[abc][[abc]]", "[abc]", "[4]", "[1],[1,1]", "[1,[1,1],1]", "[1,([1,1],1),1]", "[1,1,1]", "[2,b]", "[2,b,1]", "[2,b,[[b]]]", "[2,b]", "[b,1]", "[1,(1,[1],2)]", "[1][(1,[1],2),2][2]", "[1][(1,[2],2),2]", "[{1,1},1,2]", "[{(1,2),2},1,2]", "[{(1,2),1,([1,1])},2,", 1, "1", "[(1,1,1),2,1,2]", "[(1,1,1),2,1,2],3", "[1,1,1);[2,2],1,2]", "[1,1,1);[2,2),1,1]", "]]",
            Collections.singletonList("", ""], Collections.singletonList("[", "[1],1,2", "[1,1,1]", "[1,2,1],1,2", "[1,1,1,2],1,3,4", "[1,", "[],2],1,2", "[[1,],2,[2]],3"], "[1,1,1,[2],2,[3],4];[1,2,1]");
    }
}



