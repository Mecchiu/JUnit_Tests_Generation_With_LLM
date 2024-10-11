// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_1Test {
		GetPage object;

		/**
		 * Init method.
		 * @throws ProcessException to create new object
		 */
    @Before
    public void init() throws ProcessException {
    	object = new GetPage("");
    }

        /**
		 * @throws ProcessException to set some data
		 */
    @Test
    public void setParameters() throws ProcessException {
    	object.setText("text");
    }

        /**
		 * @throws ProcessException to start the page
		 */
    @Test
    public void start() throws ProcessException {
    }

        /**
		 * @throws ProcessException to abort the page
		 */
    @Test
	public void complete() throws ProcessException {
    }

        /**
		 * @throws ProcessException to getMore
		 */
    @Test
	public void hasMore() throws ProcessException {
    }

}