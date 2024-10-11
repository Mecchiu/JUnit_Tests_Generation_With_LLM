// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		 	private Dependency d = new Dependency();
			/*
			* Test the public field isEmpty.
			*/
		@Test
		void test__jaxb_0() {
			d.setid("");
			d.setName("");
			String value =  d.getTypeDesc().getDefault();
			assertTrue("Dependency default value is not <null>", "<null>".equals(value));
			assertEquals("Dependency class is not correctly initialized properly",
				d.getTypeDesc().getName(),
				d.getClass().getName());
			assertFalse("Dependency type is not <Dependency.class>",
				d.getClass().equals(d.getTypeDesc().getClass()));
		}
		
}