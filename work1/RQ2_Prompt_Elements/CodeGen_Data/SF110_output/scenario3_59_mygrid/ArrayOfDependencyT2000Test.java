// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {

	private ArrayOfDependency _testInstance;
	
	static private final String _testId = "ArrayOfDependencyTest";
	
	{
		//
		// Initialization
		//
		_testInstance = new ArrayOfDependency();
		{
			_testInstance.setDependentClass("dependentClass");
			_testInstance.setDependentMethod("dependentMethod");
			_testInstance.setDependentVariable("dependentVariable");
			_testInstance.addDependentVariableArray("dependentVariableArray");
			_testInstance.setInitialVersion(new String[] {"initialVersion"});
		}
	}

	@Test
	public void testId() {
		assertEquals(_testId, _testInstance.getId());
	}
	
	@Test
	public void testDependentClass() {
		assertEquals("dependentClass", _testInstance.getDependentClass());
	}
	
	@Test
	public void testDependentMethod() {
		assertEquals("dependentMethod", _testInstance.getDependentMethod());
	}
	
	@Test
	public void testDependentVariable() {
		assertEquals("dependentVariable", _testInstance.getDependentVariable());
	}
	
	@Test
	public void testDependentVariableArray() {
		assertEquals("dependentVariableArray", _testInstance.getDependentVariableArray());
	}
	

	@Test
	public void testInitialVersion() {
		assertNotNull(_testInstance.getInitialVersion());
		assertEquals("initialVersion", _testInstance.getInitialVersion()[0]);
	}
	
}
