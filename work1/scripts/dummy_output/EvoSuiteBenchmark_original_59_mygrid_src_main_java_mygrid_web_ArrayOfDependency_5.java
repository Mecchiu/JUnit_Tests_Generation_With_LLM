// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		@Test
		public void getTypeDesc() {
			ArrayOfDependency target = new ArrayOfDependency();
			org.apache.axis.encoding.Serializer serializer = target.getSerializer();
			try {
				String response = serializer.serialize(target);
				org.apache.axis.message.XMLObject xmlObject = org.apache.axis.message.XMLFactory.createXMLObjectFromString(response);
				org.apache.axis.message.Element elm = xmlObject.getRootElement();
				assertEquals("test", elm.getAttributeValue("cardinality"));
				org.apache.axis.message.Element elmArr = elm.searchElementsByTagName("a");
				assertEquals(1, elmArr.getChildCount());
				org.apache.axis.message.Element elmA = elmArr.getChild(0).getParentElement();
				org.apache.axis.message.Descriptor descObj = (org.apache.axis.message.Descriptor)elmA.getAttributes().get("description");
				assertEquals(this.getTypeDesc(), descObj);
			} catch (org.apache.axis.AxisFault e) {
				assertTrue(e.getMessage().indexOf("UnsupportedOperation")<0);
			}
		}
		
}