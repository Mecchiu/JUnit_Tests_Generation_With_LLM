// ContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElementTest {
		/**
		* Test method for getTypeDesc
		*/
		@Test
		public void testGetTypeDesc()
		{
				ContextElement cons = new ContextElement();
				assertNotNull(cons.getTypeDesc());
		}

		/**
		* Test method for equals
		*/
		@Test
		public void testEquals()
		{
				ContextElement c1 = new ContextElement();
				ContextElement c2 = new ContextElement();
				ContextElement c3 = new ContextElement();
				ContextElement c4 = new ContextElement();
				ContextElement c5 = new ContextElement();

				assertTrue(c1.equals(c2));
				assertTrue(c2.equals(c3));
				assertFalse(c1.equals(c4));
				assertFalse(c3.equals(c5));
		}

		/**
		* Test method for clone
		*/
		@Test
		public void testClone()
		{
				ContextElement c1 = new ContextElement();
				ContextElement c2 = c1.clone();
				assertNotNull(c2);
		}

		/**
		* Test method for getContent
		*/
		@Test
		public void testGetContent()
		{
				ContextElement c1 = new ContextElement();
				ContextElement c2 = new ContextElement();
				ContextElement c3 = new ContextElement();
				ContextElement c4 = new ContextElement();
				ContextElement c5 = new ContextElement();

				assertNotNull(c1.getContent());
				assertNotNull(c2.getContent());
				assertNotNull(c3.getContent());
				assertNotNull(c4.getContent());
				assertNotNull(c5.getContent());
		}

		/**
		* Test method for setContent
		*/
		@Test
		public void testSetContent()
		{
				ContextElement c1 = new ContextElement();
				ContextElement c2 = new ContextElement();
				ContextElement c3 = new ContextElement();
				ContextElement c4 = new ContextElement();
				ContextElement c5 = new ContextElement();

				c1.setContent("Hello");
				c2.setContent("Hello");
				c3.setContent("Hello");
				c4.setContent("Hello");
				c5.setContent("Hello");
		}
}