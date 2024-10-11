// JWBF_1Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {

	/**
	 * Test method for {@link JWBF#getPartId(Class)}.
	 */
	@Test
	void testGetPartId() {
		assertEquals("jwbf-core", JWBF.getPartId(JWBF.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWikiBot.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.class));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_15));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_16));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_17));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_18));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_19));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_20));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_21));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_22));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_23));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_24));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_25));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_26));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_27));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_28));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_29));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_30));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_31));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_32));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_33));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_34));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_35));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_36));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_37));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_38));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_39));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_40));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_41));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_42));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_43));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_44));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_45));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_46));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_47));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_48));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_49));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_50));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_51));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_52));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_53));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_54));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_55));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_56));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_57));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_58));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_59));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_60));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_61));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_62));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_63));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_64));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_65));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_66));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_67));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_68));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_69));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_70));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_71));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_72));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_73));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_74));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_75));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_76));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_77));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_78));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_79));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_80));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_81));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_82));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_83));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_84));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_85));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_86));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_87));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_88));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_89));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_90));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_91));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_92));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_93));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_94));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_95));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_96));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_97));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_98));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_99));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_100));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_101));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_102));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_103));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_104));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_105));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_106));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_107));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_108));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_109));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_110));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_111));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_112));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_113));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_114));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_115));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_116));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_117));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_118));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_119));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_120));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_121));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_122));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_123));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_124));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_125));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_126));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_127));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_128));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_129));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_130));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_131));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_132));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_133));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_134));
		assertEquals("jwbf-mediawiki", JWBF.getPartId(MediaWiki.Version.MW1_135));
		assertEqu