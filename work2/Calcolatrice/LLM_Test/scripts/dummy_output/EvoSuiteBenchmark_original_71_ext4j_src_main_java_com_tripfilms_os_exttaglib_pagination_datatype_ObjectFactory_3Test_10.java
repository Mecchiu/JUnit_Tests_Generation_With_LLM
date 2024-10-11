// ObjectFactory_3Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPages()} method.
*/
class ObjectFactory_3Test {
		/**
		* Test if a page can return the correct number of pages. 
		*/
		@Test
		public void testPagination() {		
			Page p1 = ObjectFactory.createPage();
			assertEquals(p1.getNumberOfPagesIncludingCurrent(), 1);
			Page p2 = ObjectFactory.createPage();
			assertEquals(p2.getNumberOfPagesIncludingCurrent(), 0);
		}
			
		/**
		* Test if a page can return the correct number of pages in combination with a custom page size. 
		*/
		@Test
		public void testPaginationCustom() {		
			Page p1 = ObjectFactory.createPage();
			assertEquals(p1.getNumberOfPagesIncludingCurrent(), 0);
			int i = 0;
			do {
				p1 = ObjectFactory.createPage(i++, 1);
			} while (p1.getNumberOfPagesIncludingCurrent() > 0);
			assertEquals(p1.getNumberOfPagesIncludingCurrent(), 1);
			p1 = ObjectFactory.createPage(i--, 1);
			assertEquals(p1.getNumberOfPagesIncludingCurrent(), 1);
			p1 = ObjectFactory.createPage(i--, 1);
			assertEquals(p1.getNumberOfPagesIncludingCurrent(), 0);
		}
}