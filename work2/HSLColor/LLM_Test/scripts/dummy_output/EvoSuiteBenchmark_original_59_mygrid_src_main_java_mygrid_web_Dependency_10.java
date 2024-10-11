// DependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dependency}.
* It contains one unit test case for the {@link Dependency#getTypeDesc()} method.
*/
class DependencyTest {
		/**
		* Test method for {@link Dependency#getTypeDesc()}.
		*/
	@Test
	public void testGetTypeDesc() {
		java.lang.String _typeDesc = null;
		Dependency.getTypeDesc();
		{
		java.lang.String _type = null; 
		int i = 0;
		_type = Dependency.findTypeDesc(_type, i++);
			typeDesc.addValue("org.apache.axis.enums.Units.MILES", _type);
		java.lang.String m = Dependency.findTypeDesc(_type, i);
			typeDesc.addValue("org.apache.axis.enums.Units.KILUMES", m);
			typeDesc.addValue("org.apache.axis.enums.Units.MILEAVES", m);
			typeDesc.addValue("org.apache.axis.enums.Units.INCH", m);
			typeDesc.addValue("org.apache.axis.enums.Units.POINT", m);
			typeDesc.addValue("java.lang.String", m);
		m = Dependency.findTypeDesc("org.apache.axis.types.DateTime", i++);
			typeDesc.addValue("java.lang.String", m);
		java.lang.String d = Dependency.findTypeDesc("org.apache.axis.types.TimeOfDay", i++);
			typeDesc.addValue("java.lang.String", d);
		typeDesc.addValue("org.apache.axis.lang.String", "org.apache.axis.axis.types.Language", i++);
		typeDesc.addValue("java.lang.String", "org.apache.axis.types.Language", i++);
		typeDesc.addValue("org.apache.axis.types.LocalTimeOfDay", "org.apache.axis.types.LocalTimeOfDay", i++);		
	}
}
}