// EngineTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Engine}.
* It contains ten unit test cases for the {@link Engine#getTypeDesc()} method.
*/
class EngineTest {

	/**
	* Test case for {@link Engine#getTypeDesc()} method.
	*/
	@Test
	void testGetTypeDesc() {
		Engine engine = new Engine();
		assertNotNull(engine.getTypeDesc());
	}
}
```

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.