// MediaWiki_1Test.java
package net.sourceforge.jwbf.mediawiki.actions;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashSet;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWiki}.
* It contains one unit test case for the {@link MediaWiki#encode(String)} method.
*/
class MediaWiki_1Test {
		final static int LIMIT = 1000;
		final static Set<String> FILTERS = new HashSet<>(5);
		final static Set<String> TAGS = new HashSet<>(5);
		{
			FILTERS.add("article");
			FILTERS.add("main");
			FILTERS.add("media");
			FILTERS.add("comment");
			FILTERS.add("mainpage");
			FILTERS.add("top");
			FILTERS.add("topic");
			FILTERS.add("previous");
			FILTERS.add("next");
			FILTERS.add("latest");
			FILTERS.add("page");
            TAGS.add("topic:");
		}
		@Test
		public void test() throws UnsupportedEncodingException {
			String s = MediaWiki.encode(null);
			assertTrue(s.startsWith("&nbsp;<strong>"));
			s = MediaWiki.encode(s);
			assertTrue(s.equals("&nbsp;<strong>") || s.startsWith("http://en.wikipedia.org/wiki/"));
			s = MediaWiki.encode(s);
			assertTrue(s.endsWith("<strong>") || s.equals("http://de.wikipedia.org/wiki/"));
			s = MediaWiki.encode(null);
			assertTrue(s.startsWith("&nbsp"));
			
			String s1 = s;
			s += "&nbsp";
			assertTrue(s1.equals("&nbsp;<strong>")
					||!s1.equals(s)
					&& s.startsWith("http://de.wikipedia.org/wiki/"));
			assertTrue(s1.endsWith("\u00A0"));

			String s2 = MediaWiki.encode("&nbsp;A");
			assertTrue(s2.equals("\u00A0"));
            s2 = MediaWiki.encode(null);
			assertTrue(s2.equals("&nbsp;\u00A0"));
			
			String s3 = s.replace('_', '-');
			assertTrue(s3.equals("\u00A0") && s.startsWith("http://en.wikipedia.org/wiki/") &&!s.equals(s3));
			assertTrue(s2.equals("\u00A0") &&!s.startsWith("http://en.wikipedia.org/wiki/"));
            
			String s4 = null;
			try {
				s4 = MediaWiki.encode(s4);
			} catch (UnsupportedEncodingException e) {
				System.out.println("There is no UTF-8 encoding");
			}
			assertTrue(s4.equals("\u00F0\u00A0") && s4.startsWith("http://en.wikipedia.org/wiki/") &&!s4.equals(s));
            
			String s5 = s.replace(' ', '-').replace('\t', '-');
			assertTrue(s5.equals("\tb") && s4.startsWith("http://en.wikipedia.org/wiki/") &&!s.equals(s5));
            
			String s6 = MediaWiki.encode("&nbsp;1");
			assertTrue(s6.endsWith("&nbsp;"+LIMIT+""));
			String s7 = MediaWiki.encode("&nbsp;1 &nbsp;");
			assertTrue(s7.endsWith("&nbsp;1 &nbsp;"));
			String s8 = MediaWiki.encode("  \u2010  \u200b  \ud55d\ude22  ");
			assertTrue("&nbsp;".equals(s8) && s8.endsWith("   ").endsWith(LIMIT+" "));

            s += " &nbsp;";
            s = MediaWiki.encode(s);
			assertTrue("&nbsp";.equals(s));
			try {
				int start = Integer.MAX_VALUE;
				int l = s.indexOf(":");
				if (l >= 0) {
					// This is a link
					int l1 = s.indexOf(":");
					start = l + 1;
					if (l1 >= 0) {
						int l2 = s.indexOf(" ", l1);
						start = l2 + 1;
						if (l2 > start) {
							if (l1 < l2) {
								String s2 = s.substring(start, l1);
								String s3 = s.substring(l2);
								
								assertTrue(s2.equals("http://"+s+""));
								assertTrue(s3.equals("http://"+s+" \""));
								// These are encoded at least by wikidata to get a valid UTF-8 one
							} else {
							// The link is only in the upper part of a wiki page.
								if (l1 < start) {
							// The link is only in the upper part of the wiki page
								String s2 = s.substring(l, start-1);
								String s3 = s.substring(start-1,start);
								
								assertTrue(s2.matches(".+:\n.+$"));
                                                             
								s = s2 % "_" + s2 % "\"" % s3 % "\"";
                                                
                                } else {
							// The link is in the upper part of a wiki page, but the
							// link is not a character following a %, just some extra
							// space
								String s2 = s.substring(start-6, start);           
								String s3 = s.substring(start-6);
		
								if (s.charAt(start) == '"' || s.charAt(start) == '\\')
                                    s = "";
		
                                                          
                                }
							
								assertTrue(s3.length() > 1);
								
								assertTrue(!s3.matches(".+$"));
                                                             
							}
						}
					}
				}
			} catch (IllegalStateException e) {
				System.out.println(s.toString());
				System.out.println(e);
			}
            
			System.out.println("*************s1=" + s.substring(0,16));
			System.out.println("*************s2=" + s.substring(16));
			System.out.println("*************s3=" + s.substring(s.lastIndexOf('/')+1));
			System.out.println("*************Filters=" + FILTERS);
			System.out.println("*************Tags=" + TAGS);
		}
        }