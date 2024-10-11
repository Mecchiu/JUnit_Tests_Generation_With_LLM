// AllPrefixesTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AllPrefixes}.
* It contains one unit test case for the {@link AllPrefixes#allPrefixes(String)} method.
*/
class AllPrefixesTest {

	// Test method for {@link AllPrefixes#allPrefixes(String)}
	@Test
    public void allPrefixes1Test() {
        assertEquals(String.valueOf(new Object()).valueOf("prefix of"), new AllPrefixes().allPrefixes("prefix of"));
    }

    // Unit tests for {@link AllPrefixes#allPrefixes(String)}
    @Test
    public void allPrefixesTest() {

        // given: the string is "prefix of"
        String string = "prefix of";
        
        // when: expected object of all prefixes
        Object object = new AllPrefixes().allPrefixes(string);
       
        // then: the object is expected
        assertEquals(String.valueOf(object).valueOf("prefix of"), object);
    }

}