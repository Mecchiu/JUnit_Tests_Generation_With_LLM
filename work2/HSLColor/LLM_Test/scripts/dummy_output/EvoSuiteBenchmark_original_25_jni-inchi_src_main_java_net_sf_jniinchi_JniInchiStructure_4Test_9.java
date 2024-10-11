// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		
    @Test
    public void singleInput() {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(3);
    	list.add(4);	
    	list.add(5);
    	assertEquals(5, list.get(0);
        assertNotNull(getBond(list.get(0)));
        assertNotNull(getBond(list.get(1)));
        assertNotNull(getBond(list.get(2)));
        assertNotNull(getBond(list.get(3)));
        assertNotNull(getBond(list.get(4)));
    }
    
	@Test
	public void multipleInput() {
			
	  List<String> list = new ArrayList<>();
	  list.add("A");
	  list.add("A");
	  list.add("B");
	  List<Integer> bondList = new ArrayList<>();
	  bondList.add(4);
	  assertEquals("B", getBond(bondList));
	  assertNotNull(getBond("A"));
	  assertNotNull(getBond("A"));
	  assertNotNull(getBond("A"));
	  assertNotNull(getBond("A"));
	  assertEquals("A",getBond("A"));	
	}
	
	@Test
	public void singleOutput() {
		List<String> output = new ArrayList<String>();
		output.add("C1C");
		output.add("C2");
		List<Integer> inchiList = new ArrayList<>();
		inchiList.add(1);
		inchiList.add(2);
		List<Integer> idedList = new ArrayList<>();
		idedList.add(7);
		idedList.add(8);
		List<Integer> resultList = new ArrayList<>();
		List<JniInchiBond> resultBondList = new ArrayList<JniInchiBond>();
		resultBondList.add(getBond(output.get(0)));
		resultList.addAll(resultBondList);
		JniInchiStructure result = new JniInchiStructure( inchiList, resultList );
		List<Integer> list = result.getBonds();
		assertEquals(3, list.size());
		assertNotNull(result.getBond(3));
		assertNotNull(result.getBond(4));
		assertNotNull(result.getBond(5));
		assertNotNull(result.getBond(list.get(0)));		
	}
	
	@Test 
	public void twoInputs() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		List<Integer> inchiList = new ArrayList<>();
		inchiList.add(1);
		List<Integer> idedList = new ArrayList<>();
		idedList.add(8);
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(getBonds(list, list.get(0)));
		assertEquals(2, resultList.size());
		List<Integer> bonded = getBond(resultList.get(0), resultList.get(1));
		assertNotNull(bonded);
		assertNotNull(bonded.get(0));
		assertNotNull(bonded.get(1));
		assertEquals(null, list.get(0));
		assertEquals(null, list.get(1));		
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void twoInputs1() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		List<Integer> inchiList = new ArrayList<>();
		inchiList.add(1);
		List<Integer> idedList = new ArrayList<>();		
		
		getBonds(list, list.get(1));
	}
	
	@Test
	public void oneInput() {
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		List<Integer> inchiList = new ArrayList<>();
		inchiList.add(1);
		List<Integer> idedList = new ArrayList<>();		
		
		assertEquals(2, list.size());
		assertEquals(true, list.contains("A"));
		assertEquals(true, list.contains("B"));
		assertNotNull(getBond(list.get(0), list.get(1)));
		assertNotNull(getBond(list.get(0), list.get(2)));
		
		assertTrue(getBond(list.get(0), list.get(1)) == null);
		
		List<Integer> resultList = new ArrayList<>();
		resultList.addAll(getBonds(list, list.get(0)));
		assertEquals(1, resultList.size());
		List<Integer> resultBondList = new ArrayList<>();
		resultBondList.addAll(resultList);
		assertEquals(2, resultBondList.size());
	}
}