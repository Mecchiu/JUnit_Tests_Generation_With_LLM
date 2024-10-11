// _SetEngineInfoTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains one unit test case for the {@link _SetEngineInfo#getTypeDesc()} method.
*/
class _SetEngineInfoTest {

    /**
     * Test method for {@link mygrid.web._SetEngineInfo#getTypeDesc()}
     */
    @Test
    public void testGetTypeDesc() {
    	assertEquals(java.lang.Integer.class, this.getTypeDesc().getJavaType());
    }

    /* ****************************************************** *
     * Unit test for the inherited class {@link java.util.ArrayList} and its
     * subclasses.
     */	

	/**
	  Test method for {@link mygrid.web.util.ArrayList#get(int)}
	*/
	private void testGet(int i) {
/*
		_TestSetEngineInfo.
		_TestSetEngineInfoResult.
		_TestSetEngineInfoTestCase.
*/
		// test case 1
		assertNotNull(this.setEngineInfo[i]);
		assertEquals(i, this.setEngineInfo[i].size());
	}
	/**
	  Test method for {@link mygrid.web.util.ArrayList#remove(int)}
	*/
	private void testRemove(int i) {
/*
		_TestSetEngineInfo.
		_TestSetEngineInfoResult.
		_TestSetEngineInfoTestCase.
*/
	}
	/**
	  Test method for {@link mygrid.web.util.ArrayList#set(int, java.lang.Object)}
	*/
	private void testSet(int i,java.lang.Object o) {
/*
		_TestSetEngineInfo.
		_TestSetEngineInfoResult.
		_TestSetEngineInfoTestCase.
*/
	}
	/**
	  Test method for {@link mygrid.web.util.ArrayList#add(int, java.lang.Object)}
	*/
	private void testAdd(int i,java.lang.Object o) {
/*
		_TestSetEngineInfo.
		_TestSetEngineInfoResult.
		_TestSetEngineInfoTestCase.
*/
	}

}
