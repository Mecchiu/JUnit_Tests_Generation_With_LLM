// ArrayOfContextElementTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfContextElement}.
* It contains one unit test case for the {@link ArrayOfContextElement#getTypeDesc()} method.
*/
class ArrayOfContextElementTest {
		
	@Test
	public void test() {
		assertArrayEqualsClass();
		assertEqualsClass();
		assertArrayEqualsClass();
		assertEqualsClass();
	}
	private void assertArrayEqualsClass() 
	{
		int[] contextElement1 = new int[] { 3, 2, 1, 0 };
		java.io.Serializable objectArray = new java.io.Serializable []
		{
			(java.io.Serializable)null,
			(java.io.Serializable)null,
			(java.io.Serializable)null
		};
		ArrayOfContextElement oba = new ArrayOfContextElement(contextElement1);
		assertEquals(contextElement1, oba.getTypeDesc().getType());
		assertEquals(11, oba.size());
		assertEquals(objectArray, oba.getContextElement(0).getTypeDesc().getArrayOfContextElement());
		assertEquals(objectArray, oba.getContextElement(1).getTypeDesc().getArrayOfContextElement());
		assertEquals(objectArray, oba.getContextElement(2).getTypeDesc().getArrayOfContextElement());
		//assertThat(oba).hasField(typeDesc); // TODO: remove
		assertTrue(oba.field == typeDesc);
	}
	private java.util.Set<java.lang.Object> checkObjectArray(java.io.Serializable[] objectArray, String str) {
		java.util.Set<java.lang.Object> rtnObjSet = new java.util.HashSet<java.lang.Object>();
		for(java.io.Serializable obaArray : objectArray)
			if(obaArray instanceof java.io.Serializable[])
				rtnObjSet.add(((java.io.Serializable[])obaArray).length);
		assertEquals(str, rtnObjSet.size(), objectArray.length);
		return rtnObjSet;
	}
	private java.util.Set<java.lang.Object> checkObjectArray(int[] objectArray2, String str) throws java.io.IOException{
        java.util.Set<java.lang.Object> rtnObjSet = new java.util.HashSet<java.lang.Object>();
		for(int obj = 0; obj < objectArray2.length; obj++)
			if(obj == 0 || obj == 1 || obj == 2)
				rtnObjSet.add(new java.io.Serializable(((java.io.Serializable)null)((java.io.Serializable)objectArray2[obj]).getClass().getName()));
		assertEquals(str, rtnObjSet.size(), objectArray2.length);
		return rtnObjSet;
	}
	private java.util.Set<java.io.Serializable> checkObjectArray(java.io.Serializable[][] objectArray2, String str) {
		java.io.Set<java.io.Serializable> rtnObjSet = new java.io.HashSet<java.io.Serializable>();
		for(int i = 0; i < objectArray2.length; i++)
			if(objectArray2[i].length == 2)
				rtnObjSet.add((objectArray2[i]).length);
		assertEquals(str, rtnObjSet.size(), objectArray2.length);
		return rtnObjSet;
	}	
	private java.io.Serializable[][] checkObjectArray(java.io.Serializable[][][] objectArray2, String str) {
		java.io.Serializable[][] rtnObjArray = new java.io.Serializable[][] {};
		for(int i = 0; i < objectArray2.length; i++)
			if(objectArray2[i].length == 2) {
				rtnObjArray = new java.io.Serializable[][] { { objectArray2[i][0], objectArray2[i][1].length }, { objectArray2[i][1], objectArray2[i][2].length } };
				break;
			}
		assertEquals(str, rtnObjArray.length, objectArray2.length);
		return rtnObjArray;
	}
}