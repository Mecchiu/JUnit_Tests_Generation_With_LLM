// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains one unit test case for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {
		
	/**
	 * This method allows the user to specify how the property value is converted to a list of
	 * strings.
	 * @return list containing Strings.
	 */
	List<String> getList();
	
//    void test();
//    void test(String[] values);

	@Test
	public void test() {
		// set up the expected results from the test
		String[] expected = { "a", "b", "c", "a" };
		// test
		// get
		List<String> actual = new ArrayList<String>(getList());
		// assert
		assertEquals(expected[ 0 ], actual.get( 0 ));
		assertEquals(expected[ 1 ], actual.get( 1 ));
		assertEquals(expected[ 2 ], actual.get( 2 ));
		// test getEnumeratedProperty
		actual.set( 1, new EnumeratedProperties.List<String>() {{
			add( new EnumeratedProperties.List.String[] { "d", "e" } );
		}} );
		expected = new EnumeratedPropertiesTest().getList();
		System.err.println("getEnumeratedProperty(String)");
		System.err.println(actual);
		System.err.println("delimiter:" + delimiter);
		assertEquals(expected[ 4 ], actual.get( 4 ));
		assertEquals(expected[ 5 ], actual.get( 5 ));
		assertEquals(expected[ 6 ], actual.get( 6 ));
	}
}