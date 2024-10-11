// LogEvents_2Test.java
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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {

		private static final String[] TYPES = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_11 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_12 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_13 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_14 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_15 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_16 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_17 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_18 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_19 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_20 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_21 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_22 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_23 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_24 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_25 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_26 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_27 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_28 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_29 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_30 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_31 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_32 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_33 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_34 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IMPORT, LogEvents.MERGE, LogEvents.MOVE, LogEvents.PATROL, LogEvents.PROTECT, LogEvents.RIGHTS, LogEvents.UPLOAD};
		
		private static final String[] TYPES_MW1_35 = {LogEvents.BLOCK, LogEvents.DELETE, LogEvents.IM