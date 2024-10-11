// ParameterBeanTest.java
package org.heal.module.search;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterBean}.
* It contains one unit test case for the {@link ParameterBean#size()} method.
*/
class ParameterBeanTest {
		
	private ParameterBean param;
	
	public ParameterBeanTest() {
		param = ParameterBeanTest.makeParameterBean("Keyword");
	}
	
	/**
	 *
	 */
	@Test
    public void getSizesTest() {
		assertNotNull(param.getSearchParameters());
		assertTrue(param.size() > 0);
	}

		/**
	 *
	 */
	@Test
    public void getAllParsedTest() {
		ArrayList parsedParams = param.getAllParsed();
		assertNotNull(parsedParams);
		assertTrue(parsedParams.size() > 0);
	}
	
	/**
	 * Iterating the parameters as values, returns the values and checks values as duplicates and invalid ones
	 * if the parameters are not in the correct order.
	 */
    @Test
    public void getAllParsed2DTest() {
		List<ParameterNode> parsers = param.getAllParsed();
		assertNotNull(parsers);
		assertTrue(parsers.size() > 0);
    }
 	

	/**
	 *
	 */
	@Test
    public void addParsedTest() {
    	param.addToList("P1", "test");
    	assertEquals(param.size(), 1);
    	ParameterNode pp = param.findParser("P1");
    	assertNotNull(pp);
    }
	
	/**
	 * This test should not be needed, but needs better comments, because it is not included in the test case.
	 */
	@Test
    public void addParsed2DTest() {
    	List<ParameterNode> parsers = param.getAllParsed();
    	assertTrue(parsers.size() > 0);
    }
	
	/**
	 * This test should not be needed, but needs better comments, because it is not included in the test case.
	 */
	@Test
    public void removeAllParsedTest() {
    	param = ParameterBeanTest.makeParameterBean("Keyword3");
    	assertTrue(param.size()>=2);
    	List<ParameterNode> parsers = param.getAllParsed();
    	assertTrue(parsers.size()>=1);
		param.addToList("P1", "test");
    	assertEquals(param.getParsers().get(0).getTitle(), "test ");
    	parallelSetInSortedOrder(parsers, param);
		param.removeAllParsed();
		ParameterNode pp = param.findParser ("P1");
    	assertNull(pp);
		assertEquals(param.getParsers().size(), parsers.size());
    }
	
	/**
	 * This test should not be needed, but needs better comments, because it is not included in the test case.
	 */
	@Test
    public void setParsedTest() {
    	String[] parsers = param.getParsers();
    	assertTrue(parsers.length>0);
    	parallelSetInSortedOrder(parsers, param);
    }

    public static String[] parallelSetInSortedOrder(String[] a, ParameterBean b){
        int counter = 0;

        LinkedList<String> list = new LinkedList<String>();
        list.addAll(Arrays.asList(a));

        while(!list.isEmpty()){
            list.push(list.dequeue());
        }

        Iterator<String> it = list.iterator();
        String[] d = new String [list.size()];
}
}