// ObjectFactory_2Test.java
package com.tripfilms.os.exttaglib.pagination.datatype;

import javax.xml.bind.annotation.XmlRegistry;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectFactory}.
* It contains one unit test case for the {@link ObjectFactory#createPagination()} method.
*/
class ObjectFactory_2Test {
		/**
		 * This is a sample creating a {@code Pagination} instance using field 'pagination'.
		 * Creation is tested in {@link Pagination}'s
		 * {@link #createPagination()} method.
		 */

    @Test
    void createPagination_01() {
      Pages p = createPages();

      Pagination pp = p.getPagination();

      assertNotNull(pp);
      assertEquals("Page", pp.getName().toString(), "pagination");
    }

    @Test
    void createPagination_02() {
      Pages p = createPages();

      p.setPageSize(2);

      Pagination pp = p.getPagination();

      assertNotNull(pp);
      assertEquals("Page", pp.getName().toString(), "pagination");
    }

    @Test
    void createPagination_03() {
      Pages p = createPages();

      assertNotNull(p);
    }

    @Test
    void createPagination_04() {
      Pages p = createPagination();

      Pagination pp = p.getPagination();

      assertNotNull(pp);
      assertEquals("Pagination", pp.getName().toString(), "pagination");
    }

    @Test
    void createPagination_05() {
      Pages p = createPagination();

      Pagination pp = p.getPagination(2);

      assertNotNull(pp);
      assertEquals("Pagination", pp.getName().toString(), "pagination");
    }

  
}