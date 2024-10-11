// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains ten unit test cases for the {@link Job#getTypeDesc()} method.
*/
class JobTest {

	/**
	* Test case for {@link Job#getTypeDesc()} method.
	* It tests the method with the following assertions:
	* <ul>
	* 	<li>The method returns a non-null value.</li>
	* </ul>
	*/
	@Test
	void testGetTypeDesc() {
		assertNotNull(Job.getTypeDesc());
	}
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.