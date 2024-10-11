// ContextElement_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContextElement}.
* It contains one unit test case for the {@link ContextElement#getTypeDesc()} method.
*/
class ContextElement_1Test {
		/**
		 * Default constructor
		 */
		public ContextElement_1Test() {
		}

		final java.lang.String name = "name";

		final java.lang.String content = "content";

		final javax.xml.namespace.QName name2;
		final javax.xml.namespace.QName content2;

		{
			name2 = null;
			content2 = null;
		}

		final int i = 1;

		@Test
		public void testDefaultConstructor() {
			new ContextElement();
		}

		/**
		* Test method for {@link ContextElement#getTypeDesc()}.
		*/
		@Test
		public void testGetTypeDesc() {
			final org.apache.axis.types.URI.Content typeDesc2;
			final org.apache.axis.types.URI.Content contentTypeDesc;
			{
			typeDesc2 = null;
			contentTypeDesc = null;
			}
			{
			final java.lang.String value = null;
			final org.apache.axis.types.URI.Content typeDesc2_value = null;
			final org.apache.axis.types.URI.Content contentTypeDesc2_value2;
			{
			contentTypeDesc2_value = null;
			}
			{
			final int value3 = 0;
			final org.apache.axis.types.URI.Content typeDesc2_value3 = null;
			final org.apache.axis.types.URI.Content contentTypeDesc2_value3_value;
			{
			contentTypeDesc2_value3 = null;
			}
			}
			{
			final int value4 = 1;
			final org.apache.axis.types.URI.Content typeDesc2_value4 = null;
			final org.apache.axis.types.URI.Content contentTypeDesc2_value4_value;
			{
			contentTypeDesc2_value4 = null;
			}
			}
			typeDesc = new org.apache.axis.types.URI.Content(value, typeDesc2_value, typeDesc2_value3, typeDesc2_value3_value, typeDesc2_value4);
		}

}
}