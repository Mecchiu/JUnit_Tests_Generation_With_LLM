// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
private void compareWebsites(LagoonProcessor c, String a1, String a2) {
			// Check the number of directories
			assertEquals(Integer.parseInt(a1), Integer.parseInt(c.getTargStore().getTargetRoot()));
			// If we have one target directory
			boolean found = false;
			for (Enumeration e = c.getTargStore().getEntries(); e.hasMoreElements(); ) {
				SitemapEntry ent = (SitemapEntry) e.nextElement();
				if (ent.getTarget()!= null)
					assertEquals(Utils.removeDuplicates("/"), ent.getTarget());
				if (Utils.toLowerCase(ent.getTarget()) == "." || ent.getTarget() == null) {
					found = true;
					break;
				}
			}
			if (!found) {
				// if the input was more than one directory, find only the one
				Iterator i = Utils.toList(Utils.cleanDuplicates("/")).iterator();
				while (i.hasNext())
					if (((String)i.next()).equals("."))
						break;
				String[] a = Utils.toArray(i.next(), null);
				if (a.length <= 1) {
					// if input has only one directory, find the next one
					i = Utils.toList(Utils.cleanDuplicates("/")).iterator();
					while (i.hasNext())
						if (((String)i.next()).equals("."))
							break;
					String[] b = Utils.toArray(i.next(), null);
					if (b.length < 1)
						throw new RuntimeException("Weird case, "+a1+" "+b1+" "+a2);
					a = Arrays.copyOfRange(a, 0, 1);
					b = Utils.toArray(b, null);
				}
				// the input has more than one directory, so for each one we want to compare the target 
				for (int i2 = 0; i2 < a.length; i2++) {
					SitemapEntry ent = (SitemapEntry) c.getTargStore().getEntries().next();
					String c2 = ent.getTarget();
					String b2 = Utils.toLowerCase(a[i2]).toLowerCase();
					if (!c2.equals(b2))
						throw new RuntimeException("Weird case, "+a1+" "+ent.getTarget());
				}
			}
			// compare the files
			for (int j=0; j< a.length; j++) {
				Iterator e1 = c.getTargStore().getEntries();
				Iterator e2 = c.getTargStore().getEntries();
				if (e1.hasNext() == false && e2.hasNext() == false)
					throw new RuntimeException("Not expected : "+a1+" "+a2);
				Utils.checkDates(e1, "e1", "a1"); Utils.checkDates(e2, "e2", "a2");
			}
		}

		private void compareWebsitesWithTargetroot(LagoonProcessor c, String a1, String a2) throws IOException {
			String o1 = Utils.removeDuplicates(c.getSitemap().getTargetRoot());
			String o2 = Utils.removeDuplicates(a2);
			assertTrue(a1 + " does not match " + o1, o1.equals(o2));
			// Compare the entries
			c.getTargStore().setTargetRoot(Utils.cleanDuplicates(c.getSitemap().getTargetRoot())); // clear targetRoot, cause new targetRoot is required, if it exists
			Enumeration e1 = c.getTargStore().getEntries();
			Enumeration e2 = c.getTargStore().getEntries();
			Vector l1 = Utils.toList(e1);
			Vector l2 = Utils.toList(e2);
			Vector i1 = c.getTargStore().getEntries();
			Vector i2 = Utils.toList(i1);
			assertTrue("No files created: "+i1.size(), i1.size()>0);
			if (!l1.equals(l2))
				throw new RuntimeException("Not expected since the inputs have different number of entries");
			Enumeration e21 = Utils.toList(i1).elements();
			Enumeration e22 = Utils.toList(i2).elements();
			Vector l2 = Utils.toList(e21);
			Vector l3 = Utils.toList(e22);
			while (l1.size() > 0 && l2.size() > 0 && l2.size() == l3.size()) {
				SitemapEntry ent = (SitemapEntry) e1.next();
				SitemapEntry ent2 = (SitemapEntry) e2.next();
				if (ent.getTarget()!= null)
					assertEquals(e21.hasNext(), ent.getTarget().equals(ent2.getTarget()));
				if (Utils.toLowerCase(ent.getTarget()) == "." || ent.getTarget() == null) {
					assertNull(e21.hasNext());
					if (ent.getTarget() == null)
						assertNotNull(e1);
					assertNotNull(e2);
					break;
				}
				else {
					assertNotNull(e21.hasNext());
					l1.remove(l1.size()-1);
					l2.remove(l2.size()-1);
				}
				assertNotNull(e21.hasNext());
			}
			assertEquals(e21.hasNext(), false);
			assertEquals(e22.hasNext(), false);
			Enumeration e1 = Utils.toList(l1).elements();
