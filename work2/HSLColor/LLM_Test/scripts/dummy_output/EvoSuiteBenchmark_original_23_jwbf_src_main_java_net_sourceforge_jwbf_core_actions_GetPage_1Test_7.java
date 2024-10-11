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
		private final HttpAction msg;
    GetPage_1Test(HttpAction msg) {
        this.msg = msg;
	}

    /**
     * {@inheritDoc}
     */
	public void processReturningText(String e) {
		
		System.out.println(e);
	}

	/**
     * @see TestCase#tearDown()
     */
    @Test
    void tearDown() {
        hasMore = true;
    }
}