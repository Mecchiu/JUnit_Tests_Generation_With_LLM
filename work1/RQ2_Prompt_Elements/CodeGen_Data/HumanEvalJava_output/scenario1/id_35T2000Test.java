// MaxElementTest.java
package scenario1;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MaxElement}.
* It contains one unit test case for the {@link MaxElement#maxElement(List)} method.
*/
class MaxElementTest {

	@Test
	public void testMaxElement(){
	   assertTrue(MaxElement.maxElement(new List<Integer>() {

    {
      add(1);
      add(2);
      add(3);
      add(4);
      add(5);
    }
		}));
		
	}

}
