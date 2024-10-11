// Challenge_1Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {


	/**
* Test cases for initialisation of Challenges.<br>
* It performs some initialisation checks against the challenge variables.<br>
* If this test fails, {@link Challenge_1Test#dice(int)} could not be executed.</br>
* It should not initialize the {@link Challenge} object.
* It has to be started as {@link Challenge_1Test#run(java.util.Vector)} method.<br>
* The {@link Challenge#dice(int)} and {@link Challenge#getDice(int)} methods are tested.</br>
* Test case is performed with {@link Challenge_1Test#execute()} function.
* If it fails, the {@link Challenge_1Test#dice(int)} and {@link Challenge_1Test#getDice(int)} must be returned to function.
*/
@Test
public class Challenge_1Test {
	
	/**
* Test execution.<br>
* This test case just creates a {@link Challenge} object with the variables defined by the test cases and runs the {@link Challenge#execute()} function.
* The result is tested by {@link Challenge_1Test#run(Vector)} function.
*/
	public void test() {
		
		new Challenge_1Test();
	}
	
	/**
* Test cases for initialisation and execution.<br>
* Test case for {@link Challenge#execute()} function.
* It performs some tests for the result of {@link Challenge#execute(org.junit.jupiter.api.Test, java.util.Vector)} method.
* With each test it will perform 1 set of tests where each test result is checked against the challenge result.
* For the set of tests run again and the test will be executed again.
* @throws Exception
* If some operation can not be done in the time indicated by the exception.
*/
	public void test_1() throws Exception {
		
		Vector<String> results = new Vector<>();
		
		results = Challenge_1Test.dice(10);

		assertFalse(results.contains("1"));
		
		results = Challenge_1Test.getDice(10);
	
		assertFalse(results.contains("1"));
		
		values = Challenge_1Test.values();
		assertNotNull(values.get("1"));

		values = Challenge_1Test.values(new String[] { "1" });
		assertEquals(1, values.size());
		assertNotNull(values.get("1"));

		results = Challenge_1Test.dice(10);
		
		assertFalse(results.contains("1"));
		
		results = Challenge_1Test.getDice(10);
	
		assertFalse(results.contains("1"));
		
		values = Challenge_1Test.values();
		assertNotNull(values.get("1"));

		values = Challenge_1Test.values(new String[] { "1" });
		assertEquals(1, values.size());
		assertNotNull(values.get("1"));

		results = Challenge_1Test.getDice(10);
	   
		assertTrue(results.contains("1"));
	   
		results = Challenge_1Test.dice(10);
	   
		assertFalse(results.contains("1"));
		
		values = Challenge_1Test.values();
		assertNotNull(values.get("1"));

		values = Challenge_1Test.values(new String[] { "1" });
		assertEquals(1, values.size());
		assertNotNull(values.get("1"));

		results = Challenge_1Test.getDice(10);
	   
		assertTrue(results.contains("1"));
	   
		results = Challenge_1Test.dice(10);
	   
		assertFalse(results.contains("1"));
	   
		results = Challenge_1Test.getDice(10);
	   
		results.remove("1");
	   
		assertEquals(10, results.size());
		
		results = Challenge_1Test.getDice(10);
	   
		assertFalse(results.contains("1"));
	}
	
}