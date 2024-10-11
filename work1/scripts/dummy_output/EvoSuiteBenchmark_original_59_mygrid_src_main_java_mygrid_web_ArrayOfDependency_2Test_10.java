// ArrayOfDependency_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependency_2Test {
		
	private static final String __serializedForm =   
			"Lorg/apache/commons/lang/BasicQueries$And;laod2=Ljava/lang/String;";
	String aStr = "douz";
	String bStr = "dav";
	
	@Test
	void test1() throws Exception {
		System.out.println("arrayOfDependencyTypeTest1");
		ArrayOfDependency depTest = new ArrayOfDependency();
		assertEquals(depTest.getTypeDesc(),typeDesc);
	}
	
	@Test
	void test2() throws Exception {
		System.out.println("arrayOfDependencyTypeTest2");
		ArrayOfDependency depTest = new ArrayOfDependency((String)null,(String)null);
		assertEquals(depTest.getTypeDesc(),typeDesc);
	}
	
	@Test
	void test3() throws Exception {
		System.out.println("arrayOfDependencyTypeTest3");
		ArrayOfDependency depTest = new ArrayOfDependency(aStr,bStr);
		assertEquals(depTest.getTypeDesc(), typeDesc);
	}
	
	@Test
	void test4() throws Exception {
		System.out.println("arrayOfDependencyTypeTest4");
		ArrayOfDependency depTest = new ArrayOfDependency("douz",(String)null);
		assertEquals(depTest.getTypeDesc(), typeDesc);
	}
	
	@Test
	void test5() throws Exception {
		System.out.println("arrayOfDependencyTypeTest5");
		ArrayOfDependency depTest = new ArrayOfDependency(bStr,cStr);
		assertEquals(depTest.getTypeDesc(),typeDesc);
	}
	
}