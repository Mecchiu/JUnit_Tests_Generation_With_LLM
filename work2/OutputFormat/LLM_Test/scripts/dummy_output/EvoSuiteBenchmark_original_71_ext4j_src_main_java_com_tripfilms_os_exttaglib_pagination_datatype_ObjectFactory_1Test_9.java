// ObjectFactory_1Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createStaticPage()} method.
*/
class ObjectFactory_1Test {
		@Test
		public void value() {
			ObjectFactory objectFactoryInstance = new ObjectFactory();

			StaticPage staticPage = objectFactoryInstance.createStaticPage();

			assertTrue(validate(staticPage));
		}

		@Test
		public void value_staticPage() {
			ObjectFactory objectFactoryInstance = new ObjectFactory();

			StaticPage staticPage = objectFactoryInstance.createStaticPage(StaticPage.class);

			assertTrue(validate(staticPage));
		}

		private boolean validate(Page page) {
			if (!page.getFirstLink().getPageNumber().equals(21)) {
				throw new RuntimeException("1. Page 1 page number should be 101");
			}
			if (!page.getNextLink().getPageNumber().equals(21)) {
				throw new RuntimeException("2. Page 2 page number should be 101");
			}
			return true;
		}
}