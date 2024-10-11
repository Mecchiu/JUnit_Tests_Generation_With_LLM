// LogEvents_0Test.java
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
* It contains ten unit test cases for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_0Test {

		private static final String[] TYPES = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_1 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_2 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_3 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_4 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_5 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_6 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_7 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_8 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_9 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_10 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_11 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_12 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_13 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_14 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_15 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_16 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_17 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_18 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_19 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_20 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_21 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_22 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_23 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_24 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_25 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_26 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_27 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_28 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_29 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_30 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_31 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_32 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_33 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_34 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_35 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_36 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_37 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_38 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_39 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_40 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_41 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_42 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_43 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_44 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_45 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_46 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_47 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_48 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
		private static final String[] TYPES_49 = new String[] { LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD };
		
	