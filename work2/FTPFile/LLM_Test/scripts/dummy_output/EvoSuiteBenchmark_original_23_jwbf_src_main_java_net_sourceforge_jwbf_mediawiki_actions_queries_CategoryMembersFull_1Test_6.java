// CategoryMembersFull_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.CategoryItem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CategoryMembersFull}.
* It contains one unit test case for the {@link CategoryMembersFull#hasNext()} method.
*/
class CategoryMembersFull_1Test {
		
	@Test
	void test() throws UnsupportedOperationException, ProcessException {
		log.debug("run({})", this);
		
		// start MediaWiki bot
		
		// create MediaWikiBot
		final MediaWikiBot b = new MediaWikiBot("mw-bot", "test bot for MediaWiki");
		b.setActions(new MWC_1_11(b));
		b.setBotsLogOutput("mw-bot banned.");
		b.start();
		
		// create MediaWiki and set config params
		final MediaWiki mw = new MediaWiki(b);
		mw.setConfiguration(new MediaWikiConfiguration(mw, b));
		mw.setVersion(MW1_11);
		
		assertNotNull("could not create MediaWiki", mw);
		assertNotNull("could not start MediaWiki", b);
		
		// execute MediaWiki action
		b.stop();
		
		log.info("exiting.");
	}
	
	/**
	 * A convenience class for running mw-bot commands.
	 * The command is run when a MediaWiki bot is started.
	 * The test runs in the thread associated to this MediaWikiBot.
	 */
	private static final class MWC_1_11 extends HttpAction {

		private final MediaWiki mw;
		
		private final MediaWikiBot b;
		
		private final Thread t;
		
		public MWC_1_11(final MediaWikiBot _b) throws ProcessException, UnsupportedOperationException {
			super("mw-bot");
			this.b = _b;
			this.thread = new Thread("mw-bot - ") {
				@Override
				public void run() {
					try {
						run();
					} catch (ActionException | UnsupportedOperationException | ProcessException e) {
						throw new ProcessException(e);
					}
				}
			};
			this.t = thread;
			this.b.setExecutor(t);
		}
		
		@Override
		public void doWith(final Collection<String> args) throws ActionException {
			if (args.toString().length() <= 0) {
				throw new ActionException("Argument to mw-bot is empty");
			}
			// run MediaWikiBot
			final String action = args.toString();
			log.debug("{} action(\"{}\")", mw.getVersion(), action);
			while (!action.toLowerCase().startsWith("stop")) {
				try {
					final Collection<String> result = run();
					if (result.isEmpty()) {
						break;
					}
				} catch (ActionException | UnsupportedOperationException | ProcessException e) {
					log.error("execution failed! \n{}", e.getMessage());
					throw new ActionException("execution failed", e);
				}
			}
			log.debug("mw-bot stopped!");
			
			// stop MediaWikiBot
			t.interrupt();
			t.join();
		}
		
		private Collection<String> run() throws UnsupportedOperationException, ActionException {
			// run MediaWiki
			runWith(new MediaWikiConfiguration(mw, b));
			
			// get result
			final MediaWikiRunResult rdr = b.runRemoteQuery();
			log.info("{} runs after {}.", mw.getVersion(), rdr.getTime());
			
			// check response
			final MediaWikiRunResult result = rdr.getResult();
			if (result.isSuccess()) {
				log.info("{} succssfully finished mediawiki: {}",
						mw.getVersion(), result.getMediaWikiResponse());
			} else
				throw new UnsupportedOperationException("Received: " + result.getMediaWikiResponse());
			
			return rdr.getResponse();
		}
		
	}
	
	private static final class MediaWikiRunResult extends Jvb3ActionResult {
		
	}
}