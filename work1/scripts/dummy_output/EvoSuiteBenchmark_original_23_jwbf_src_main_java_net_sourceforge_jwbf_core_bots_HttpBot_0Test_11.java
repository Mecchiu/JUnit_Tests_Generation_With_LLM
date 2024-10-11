// HttpBot_0Test.java
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
* It contains one unit test case for the {@link HttpBot#getInstance()} method.
*/
class HttpBot_0Test {
		/**
		 * Returns a {@link HttpBot} which supports only its basic methods. Use
		 * {@link #getPage(String)} for an basic read of content.
		 *
		 * @deprecated do not use this
		 * @return a
		 */
    @Deprecated
    public static HttpBot getInstance();

		/**
		 * @param url
		 *          a
		 * @return text
		 */
		public synchronized String performAction(final String url) throws Exception;

		/**
		 * @param u
		 *          the url like <br/>
		 *             http://www.yourOwnWiki.org/wiki/Main Page<br/>
		 *          of an article
		 * @return HTML content
		 */
		public synchronized byte[] getBytes(final String u) throws Exception;

		/**
		 * @param url
		 *          the url like <br/>http://www.yourOwnWiki.org/wiki/Main Page<br/>
		 *          of an article
		 * @return HTML content
		 */
		public String getPage(final String url) throws Exception;

		/**
		 * @param url
		 *          try to do whatever...
		 * @return HTML content, or 404
		 */
		public HttpActionClient getClient(final String url) throws HTTPException;

		/**
		 * @param url
		 *          try to do whatever...
		 * @return HTTPException, or 404
		 */
		public HTTPException doSomethingBad(final String url);


 }