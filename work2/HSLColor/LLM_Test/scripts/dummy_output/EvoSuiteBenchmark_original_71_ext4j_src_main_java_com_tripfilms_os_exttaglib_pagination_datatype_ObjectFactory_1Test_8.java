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
		void test() {
		    Pagination tag = createPagination();
		    StaticPage tag_ = createStaticPage();
		    assertEquals("createPagination() result", tag, tag_);
		}
}