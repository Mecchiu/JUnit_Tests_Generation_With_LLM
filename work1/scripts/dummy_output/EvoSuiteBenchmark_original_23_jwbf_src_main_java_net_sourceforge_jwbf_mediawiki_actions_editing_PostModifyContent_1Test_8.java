// PostModifyContent_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains one unit test case for the {@link PostModifyContent#isIntersectionEmpty(Set, Set)} method.
*/
class PostModifyContent_1Test {
		
	/**
	* Test checking whether the two sets of values are a valid subset of a different set of values.
	*/
	@Test
    public void testIsIntersectionEmpty_1(){
        Set<?> a = new HashSet<>(5);
        Set<?> b = new HashSet<>(4);
        b.add(1);
        b.add(3);
        b.add(5);
        
        Set<?> c = new HashSet<>(3);
        c.add(1);
        c.add(4);
        c.add(5);
        
        assertTrue(!isIntersectionEmpty(a, b));
        assertTrue(!isIntersectionEmpty(c, b));
        assertTrue(isIntersectionEmpty(b, a));
        assertTrue(!isIntersectionEmpty(b, c));
    }
	
	/**
	* Test checking whether the two sets of values are a valid subset of a different set of values.
	*/
    @Test
    public void testIsIntersectionEmpty_2(){
        Set<?> a = new HashSet<>(4);
        Set<?> b = new HashSet<>(3);
        b.add(9);
        b.add(12);
        b.add(15);
        
        Set<?> c = new HashSet<>(4);
        c.add(16);
        c.add(19);
        c.add(20);
        c.add(21);
        
        assertTrue(!isIntersectionEmpty(a, b));
        assertTrue(!isIntersectionEmpty(c, b));
        assertTrue(isIntersectionEmpty(b, a));
        assertTrue(isIntersectionEmpty(b, c));
        assertTrue(isIntersectionEmpty(a, b));
		
		System.out.println("isIntersectionEmpty...");
		Set<?> a2 = new HashSet<>(2);
	    a2.add(10);
	    a2.add(12);
	    a2.add(14);
	    Set<?> c2 = new HashSet<>(2);
	    c2.add(21);
	    c2.add(22);
	    
	    assertTrue(!isIntersectionEmpty(a, a2));
	    assertTrue(!isIntersectionEmpty(c, a2));
	    assertTrue(isIntersectionEmpty(a2, c));
	    assertTrue(!isIntersectionEmpty(a2, a2));
		
		System.out.println("isIntersectionEmpty...");
		Set<?> a3 = new HashSet<>(1);
	    a3.add(10);
	    
	    Set<?> c3 = new HashSet<>(1);
	    c3.add(21);
	    Set<?> c4 = new HashSet<>(1);
	    c4.add(22);
	        
}
}