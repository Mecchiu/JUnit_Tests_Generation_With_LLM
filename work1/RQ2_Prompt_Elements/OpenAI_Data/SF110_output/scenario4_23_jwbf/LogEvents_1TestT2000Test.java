// LogEvents_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#next()} method.
*/
class LogEvents_1Test {

		private static final String[] TYPES = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT,
				LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_11 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_12 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_13 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_14 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_15 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_16 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_17 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_18 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_19 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_20 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_21 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_22 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_23 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_24 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_25 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_26 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_27 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_28 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_29 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_30 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_31 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_32 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_33 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_34 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_35 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_36 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_37 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_38 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_39 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_40 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_41 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_42 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.MOVE,
				LogEvents.PROTECT, LogEvents.UPLOAD };

		private static final String[] TYPES_MW1_43 = new String[] { LogEvents.BLOCK, LogEvents.DELE