// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains one unit test case for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {
public String[] getMethodArgTypes() {
		return new String[] {"net.sourceforge.jwbf.core.actions.IWebAction"};
	}

	@Test
	public void canUseOneMethodInOneTest(){
	HttpAction getMessageAction = new HttpAction() {
	    public String execute()
            throws ProcessException {
		String response_ = "";
		return response_;
	    }
	};
	
	ProcessException p_NoMessage = new ProcessException("Nothing at all");
	assertTrue(new GetPage_0Test().isHasMoreMessages()
		(new GetPage.IWebAction<String>() {
	    public String execute()
		throws ProcessException {
		return null;
	    }}));
	assertFalse(new GetPage_0Test().isHasMoreMessages()
		(new GetPage <null>()));
	assertFalse(new GetPage_0Test().isHasMoreMessages()
		(new HttpAction<String>() {
	    public String execute()
		throws ProcessException {
		return null;
	    }}));
	assertFalse(new GetPage_0Test().isHasMoreMessages()
		(new HttpAction<String>() {
	    public String execute()
		throws ProcessException {
		return null;
	    }}));
    }
}

// GetPage_1Test.java
