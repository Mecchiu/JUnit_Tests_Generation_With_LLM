// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains one unit test case for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {
		
	private boolean useDemo;

	@Test
	void testDemo() {
		UseDemo = true;
		System.out.println("Test useDemo");
	}
	
	@Test
	void testNotDemo() {
		UseDemo = false;
		System.out.println("Test useDemo");
	}
	
	@Test
	void test() {
		System.out.println("Test the StartupOptions:");
		UseDemo = true;
		System.out.println("UseDemo = " + UseDemo); 
		UseDemo = false;
		System.out.println("UseDemo = " + UseDemo); 
	}
	
	public boolean getUseDemo() {
		return UseDemo;
	}

}

// MainTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* This is a part of the Tests of {@link StartupOptionsTest}.
* It contains just one unit test case for {@link StartupOptionsTest#test()}.
*/
public class MainTest {

	
	@Test
	public void test() {
		
		MainTest main = new MainTest();
		main.test();
	}
	
	@Test
	public void testNot() {
		
		MainTest main = new MainTest();
		MainTest notMain = new MainTest();
		notMain.testNot();
	}
	
	@Test
	public void test() {
		
		MainTest main = new MainTest();
		MainTest notMain = new MainTest();
		notMain.test();
	}
	
}
//main.java