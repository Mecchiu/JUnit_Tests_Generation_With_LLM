// AddElementsTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AddElements}.
* It contains one unit test case for the {@link AddElements#addElements(List, int)} method.
*/
class AddElementsTest {
/**
	  * For debugging purposes.
	  */
    String log;

    /**
     * Creates a {@link AddElementsTest} instance.
     */
    public AddElementsTest(){
        this.log = "AddElementsTest.java";
    }

    /**
     * Sets up the logging.
     *
     * @throws Exception can be thrown if something went wrong in the initialization.
     */
    @Test
    void setUp() throws Exception {
        System.out.println(this.log);
    }

    /**
     * Tears down the {@link AddElements#setUp()} methods by setting the value to {@code false}.
     * It is ensured that {@link RemoveElementsTest.RemoveElementsTest#clean()} was called at least once.
     *
     * @throws Exception can be thrown if something went wrong in the cleanup mechanism.
     */
    @Test
    void teardown(){

        this.log = "RemoveElementsTest.RemoveElementsTest.setUp()";
        new RemoveElementsTest().clean();
        assertEquals(1, false, this.log);

		// TODO use an interface of the interface that has all the methods, so that it is possible to test, without using reflection
    }
}