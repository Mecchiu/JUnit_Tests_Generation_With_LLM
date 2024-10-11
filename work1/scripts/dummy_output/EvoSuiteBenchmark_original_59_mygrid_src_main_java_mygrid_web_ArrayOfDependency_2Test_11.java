// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	/**
	 * Test method for {@link ArrayOfDependency#getTypeDesc()}.
	 */
	@Test
	public void testGetTypeDesc() {
		mygrid.web.Dependency[] dep = new mygrid.web.Dependency[1];
		org.junit.Assert.assertEquals(org.apache.axis.encoding.Serializer.class, dep.getClass().getSuperclass());
		org.apache.axis.encoding.Serializer getSerializer(java.lang.Class, java.lang.Class _javaType, org.apache.axis.Constants.Class _xmlType) {
			return org.apache.axis.encoding.ser.BeanSerializerFactory.createSerializer(
				_javaType, _xmlType, typeDesc);
		}
		nullCheck(dep);
		
	}

	/**
	 * Null check of dep.element.
	 * @param dep
	 */
	private void nullCheck(java.lang.Object dep) {
		if (dep == null) {
			throw new org.apache.axis.NoSuchElementException("No element with name " + null);
		}
	}
}