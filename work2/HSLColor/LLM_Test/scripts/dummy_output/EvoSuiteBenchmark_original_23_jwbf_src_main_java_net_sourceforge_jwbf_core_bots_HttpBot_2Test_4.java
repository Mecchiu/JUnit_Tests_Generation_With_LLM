// HttpBot_2Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains one unit test case for the {@link HttpBot#getPage(String)} method.
*/
class HttpBot_2Test {
		
	/**
	 * @deprecated use {@link #HttpBot_2Test}
	 * @param client
	 * @param u
	 * @return  text
	 */
	@Deprecated
	public static String getPage(final HttpActionClient client, final String u) throws MalformedURLException,
			IOException
	{
		// Check to see if client knows a way to do this,
		// use getPage but set HttpActionClient.
		final URL url = new URL(u);
		final HttpActionClient cc =
				new HttpActionClient(client, url, true);
		final GetPage getPage =
				new GetPage(url, "", "",
						null);
		final String result = getPage.getOutput();
		return result;
	}

	/**
	 * @deprecated use {@link #HttpBot_2Test}
	 * @param cc
	 * @param u
	 * @return  text
	 * @throws ProcessException 
	 */
	@Deprecated
	public static String getPage(final ContentProcessable... ac) throws MalformedURLException,
							ProcessException, ActionException {
		final ContentProcessable a = ac[0];
		try {
			return getPage(a).toString();
		} catch (ActionException e) {
			if (e.getActionMessage().indexOf("Unrecognised action.") > 0) {
				String actionMessage = HttpBot_2Test.getPage(null, a.getUrl());
				System.err.println(a.toString().contains("Unrecognised action") 
						+ actionMessage + a.explanation());
			}
			throw e;
		}
	}
}