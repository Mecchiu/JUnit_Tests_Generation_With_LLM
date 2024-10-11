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
		;
	/**
	 * This method is used to check whether the ili in the wiki can be edited before it is
	 * created and not deleted (or just added). It is used by
	 * {@link InyokaWikiBot#getRevisions(String,int) getRevisions}
	 *
	 * @return the first revision
	 * @throws ActionException
	 * @throws ProcessException
	 */
	public String checkWarningsUntil(String article) throws ActionException, ProcessException, ActionNotFoundException, ActionException;

	;

	/**
	 * This method is used by
	 * {@link InyokaWikiBot#getRevisions(String,int) getRevisions}
	 *
	 * @return the first revision
	 * @throws ActionException
	 * @throws ProcessException
	 */
	public String checkWarningsUntil() throws ActionException, ProcessException, ActionNotFoundException;

	;

	/**
	 * This method is used by
	 * {@link InyokaWikiBot#getRevisions(String,int) getRevisions}
	 *
	 * @param lastRevision
	 * @return the last revision
	 * @throws ActionException
	 * @throws ProcessException
	 */
	public String checkWarningsUntil(int lastRevision) throws ActionException, ProcessException, ActionNotFoundException;

	/**
	 * This method is used by
	 * {@link InyokaWikiBot#getRevisions(String,int) getRevisions}
	 *
	 * @param lastRevision
	 * @return the last revision
	 * @throws ActionException
	 * @throws ProcessException
	 */
	public String checkWarningsUntil(GetRevision lastRevision) throws ActionException, ProcessException,
            ActionNotFoundException;
	
	@Test
	public void testWarningsWrap() throws MalformedURLException {
		this.checkWarningsUntil("Test");
	}
	
	/**
	 * This method is used by
	 * {@link InyokaWikiBot#getArticle(String,int) getArticle(String)}
	 *
	 */
	public String testGettingArticle() throws MalformedURLException, ActionException, ProcessException;

	@Test
	public void testGetArticle() throws MalformedURLException, ActionException, ProcessException;
	
	@Test
	public void testGetArticle(GetRevision lastRevision) throws MalformedURLException, ActionException, ProcessException;

	@Test
	public void testGettingWikiType() throws MalformedURLException, ActionException, ProcessException;

	@Test
	public void testGetArticle(GetRevision lastRevision, GetRevision firstRevision) throws ActionException,
	ProcessException, MalformedURLException, ActionException, ProcessException;

	@Test
	public void testGettingWikiType(GetRevision lastRevision, GetRevision lastRevision1) throws ActionException,
	ProcessException, ActionException, MalformedURLException, ProcessException, ActionException;

}