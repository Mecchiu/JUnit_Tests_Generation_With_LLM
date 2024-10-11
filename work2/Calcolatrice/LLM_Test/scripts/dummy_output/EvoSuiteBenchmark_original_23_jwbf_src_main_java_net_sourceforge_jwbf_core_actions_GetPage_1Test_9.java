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

	@Test
	/**
	 * create a test case for {@link GetPage#processReturningText(String, HttpAction)}
	 */
	public void processReturningText_1Test() throws ProcessException {
	   assertEquals(1, 4);

	   assertEquals("Text contains two spaces", 2, (int) msg.execute()["data"]["data_length"]);
	   assertEquals("getPowered by a nice browser", "pwbr", msg.execute().get("title"));
	   assertTrue(msg.execute());

	   boolean hasMore = msg.executed();
	   assertTrue(hasMore);
	   assertEquals(2, (int) msg.executed("/index.php?title=Special&feed=rss")["data_length"]);
	   assertEquals("text content for page", "", msg.executed().get("data"));
	}

	public void processReturningText(String new_text) throws ProcessException {
	   assertEquals("getPowered by a nice browser", "pwbr", msg.execute().get("title"));
	   msg.setField("data", "text contents", "New text");
		assertEquals("text content for page", "text contents", msg.execute().get("data"));
	}

	GetPage_1Test(HttpAction msg) {
		this.msg = msg;
	}

	GetPage_1Test(HttpAction msg, String txt) {
		this.msg = msg;
		this.text = txt;
	}

}