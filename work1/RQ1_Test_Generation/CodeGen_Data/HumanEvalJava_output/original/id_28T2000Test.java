// ConcatenateTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Concatenate}.
* It contains one unit test case for the {@link Concatenate#concatenate(List)} method.
*/
class ConcatenateTest {

	
	@Test
	void testConcatenateList() throws InterruptedException {
		
		List<String> result = null;
	
		result = Concatenate.concatenate(List.of("test"));
		assertNull(result);
		
		result = Concatenate.concatenate(List.of("test", "test2"));
		assertEquals("test,test2", (String)result.get(0));
				
		result = Concatenate.concatenate(List.of("test", "test", "test2"));
		assertEquals("test,test,test2", (String)result.get(0));
	
		result = Concatenate.concatenate(List.of("test", "test"));
		assertSame(Concatenate.concatenate(List.of("test", "test2")),result);
						
		// Test that the list contains all instances but one instance
		result = Concatenate.concatenate(List.of("test", "test", "test"));
		assertEquals(List.of("test", "test", "test"), result);
		
		// Test that the list contains all instances but each other
		result = Concatenate.concatenate(List.of("test", "test2"));
		assertEquals(List.of("test", "test", "test2"), result);
		
		// Test for concatenation of empty lists
		List<Object> empty = null;
		assertNotSame(empty, result);
		assertEquals(empty, Concatenate.concatenate(empty));

		empty = List.of("");
		assertNotSame(empty, result);
		assertEquals(empty, Concatenate.concatenate(empty));
	}
	
}