// AddTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains one unit test case for the {@link Add#add(int, int)} method.
*/
class AddTest {

	@Test
	void add(){
		assertEquals("Wrong result", 7, Add.add(12, 1));
	}

	
}
