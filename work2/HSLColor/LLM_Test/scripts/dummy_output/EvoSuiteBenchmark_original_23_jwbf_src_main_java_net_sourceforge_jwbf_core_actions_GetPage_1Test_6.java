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
		
	GetPageTest(){}

	@Test
	void testProcessing() throws ProcessException, ProcessException, ProcessException
	{
		getTestPage().processReturningText("one", HttpActionFactory.getPostAction());
		getTestPage().processReturningText("two", HttpActionFactory.getPostAction());
		getTestPage().processReturningText("three", HttpActionFactory.getPostAction());

		assertFalse(getTestPage().hasMoreMessages());

		//TODO getTestPage().processMore();
	}

	private GetPage getTestPage()
	{
		return HttpActionFactory.getGetAction("TestGetPage");
	}
//GetPage.java
}