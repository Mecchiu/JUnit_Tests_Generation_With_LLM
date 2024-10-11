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
	*
	* @param cc
	*          a
	*/
	public final void setConnection(final HttpActionClient cc) {
		this.cc = cc;
	}

	/**
	*
	* @param hostUrl
	*          of a wiki site to connect with; example:
	*          http://www.yourOwnWiki.org/wiki/
	*/
	public final void setConnection(final URL hostUrl) {
		this.url = hostUrl.toString();
	}

	/**
	*
	* @param u
	*          a
	* @return text
	*/
	public ContentProcessable getPage(String u) throws ContentProcessException {
		try {
			final String data = this.cc.performAction(new GetPage(this.url + u)).getData();
			String[] str = data.split("\n");
			String c = "";
			for (String s : str) {
				c += s;
			}
			if (c.toLowerCase().startsWith("<?xml. ")) {
				c = c.replace("<?", "<?xml", "");
			}
			System.out.println("c = " + c);
			return new ContentProcessable(c.substring(5));
		} catch (ProcessException ex) {
			throw new ContentProcessException(ex.toString());
		}
	}

	
	/**
	* TODO check usage of hostUrl
	*
	* @deprecated
	*/
	@Test
	public void test() throws ContentProcessException, MalformedURLException {
		try {
		try {
			this.getPage("Main_Page.xml");
		}
		catch (ProcessException ex){
			
		}
	}
	
	}

	
}