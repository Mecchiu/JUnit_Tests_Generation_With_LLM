// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
 /**
		 * @throws MalformedURLException e
		 * @throws MalformedURLException e
		 * @throws MalformedURLException e
		 */
		 static WikiBot generateWikiBot(String wiki) throws
				 MalformedURLException,
				 MalformedURLException,
				 IllegalAccessException,
				 InstantiationException,
				 Exception {
			return new InyokaWikiBot(wiki);
		}
		 /**
		 * This constructor checks the wiki with a specific wiki
		* @throws MalformedURLException e e
		 * @throws MalformedURLException e e
		 */
		 static WikiBot generateWikiBot() throws MalformedURLException,
				 IllegalAccessException,
				 InstantiationException,
				 Exception {
			String wiki = "mywiki";
			return generateWikiBot(wiki);
		}
		 /**
		 * @throws MalformedURLException e
		 */
		 static WikiBot generateWikiBot(String wiki, Set<String> urls) throws MalformedURLException {
			return new InyokaWikiBot(wiki, urls);
		}
	 /**
		 * This static utility class provides static utility methods to check
		* wiki content.
		*/
	private final static class MyWikiBotContainer extends
			 InyokaWikiBot {

				/**
				 * @throws MalformedURLException e
				 */
				class myWikiContainer extends HttpBot {
					 protected MyWikiBotContainer(String wiki) throws MalformedURLException {
						 super(wiki);
					 }
		public   void doSomethingWith()
		                throws MalformedURLException, ActionException {
		                //throw new JwfNotAllowedException("my not allowed exception");
		             }
		 public   String doSomething()
		                throws MalformedURLException, ActionException {
		                throw new JwfNotAllowedException("my not allowed exception with exception");
		             }
		   }

                /**
                * @return return a new
        		 */
        		 static WikiBot generateWikiBot(String wiki) throws MalformedURLException, MalformedURLException, Exception {
	                return new myWikiContainer(wiki);
        		}


		}
}
