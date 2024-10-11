// ChooseNumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChooseNum}.
* It contains one unit test case for the {@link ChooseNum#chooseNum(int, int)} method.
*/
class ChooseNumTest {

	@Test
	public void test1(){
		int expected = 0;
		for(int i = 0; i <= 1000; i += 2)
			expected = chooseNum(0, i).intValue();
	
		assert (expected == 2 * i);

	}
	
	@Test
	public void test2(){
		assert(chooseNum(-1000, 0) == -1000);
	}
	
	@Test
	public void test3(){
		assert(chooseNum(-1000, 1000) == 0);
	}
	
	@Test
	public void test4(){
		assert(chooseNum(-1000, -1000) == -999);
	}
	
	@Test
	public void test5(){
		assert(-99 <= chooseNum(-500, 0) && chooseNum(500, 501) == 0);
	}
	
	@Test
	public void test6(){
		assert(chooseNum(-1000, 500) == -10000);
	}
	
	
}
