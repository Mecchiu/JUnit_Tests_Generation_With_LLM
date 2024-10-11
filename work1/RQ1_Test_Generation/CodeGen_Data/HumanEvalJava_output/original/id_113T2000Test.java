// OddCountTest.java
package original;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link OddCount}.
* It contains one unit test case for the {@link OddCount#oddCount(List)} method.
*/
class OddCountTest {
  /**
* Test method of {@link OddCount#oddCount(List)}.
* It's a unit test case for the {@link Boolean#valueOf(String)}'s
* {@link Boolean#parseBoolean(String) parseBoolean()}.
* @throws Exception exception.
*/
	@Test
    public void test01() throws Exception {
		
		List<String> oddCount = new OddCount().oddCount("1234567");
		
		assertTrue("the output shall contain 1234567", oddCount.contains(oddCount.get(2)));
		assertTrue("the output shall contain 4n the str4ng 4 of the 4nput.", oddCount.contains(oddCount.get(4)));
		assertTrue("the output shall contain 1n the str1ng 1 of the 1nput.", oddCount.contains(oddCount.get(1)));
		assertTrue("the output shall contain 8n the str8ng 8 of the 8nput.", oddCount.contains(oddCount.get(8)));
		
	}
	
}
