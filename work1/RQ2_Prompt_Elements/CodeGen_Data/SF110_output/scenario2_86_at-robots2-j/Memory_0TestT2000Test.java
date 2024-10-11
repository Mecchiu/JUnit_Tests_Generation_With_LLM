// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
class Memory_0Test {

    /**
     * Test method for {@link Memory#size()}.
     */
    @Test
    void test_size() {
    	
        // Arrays.asList
    	List<MemoryArray> arrayList = new MemoryArrayList<>();
        for (int i = 0; i < 100_000; i++) {
	        arrayList.add(new MemoryArray(i, i*10, 2000, i*5));
        }
        assertTrue("Memory.size() not a singleton!", Memory.size()!= 0);
        assertEquals("Memory.size is wrong!", Memory.size(), arrayList.size());
        ArrayList<MemoryArray> originalArrayList = new ArrayList<>(Arrays.asList(arrayList));
        
        // Arrays_0Test
        List<MemoryArray> testArrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            testArrayList.add(
                    new MemoryArray(-123, 100_000 + i, 1000, (i & 0x1) == 0? 0 : i >> 1)
            );
        }
        assertTrue("Memory_0Test not a one-dimensional array!", Memory_0Test.isOneDimensionalArray(testArrayList.asList()));
        assertEquals("Memory_0Test array not copied to correct list!", Memory_0Test.toList(arrayList), testArrayList.asList());
        List<MemoryArray> allArrayList = new ArrayList<>();
        allArrayList.addAll(arrayList);
        allArrayList.addAll(testArrayList);
        assertTrue("Memory_0Test array lists not identical!", Memory_0Test.equals(arrayList, allArrayList));
    	assertTrue("Memory_0Test array lists not identical!", Memory_0Test.equals(testArrayList, allArrayList));
    }
    
    /**
     * Test method for {@link #isOneDimensionalArray(List<MemoryArray> elements)}.
     */
    @Test
    public void test_oneDimensionalArrayList() {
    	List<MemoryArray> list1 = new MemoryArrayList<>();
    	list1.add(new MemoryArray(1023, 200, 0, 0));
    	list1.add(new MemoryArray(2048, 30, 0, 0));
    	
    	List<MemoryArray> list2 = new MemoryArrayList<>();
    	list2.add(new MemoryArray(1023, 0, 0, 0));
    	list2.add(new MemoryArray(2048, 0, 0, 0));
    	
    	assertFalse("Memory_0Test one-dimensional array list equal to empty!",
            Memory_0Test.equals(list1, new MemoryArrayList<>(list2)));
    	
    	list1 = new MemoryArrayList<>();
    	list1.add(new MemoryArray(1023, 200, 0, 0));
    	list1.add(new MemoryArray(2048, 30, 0, 0));
    	
    	list2 = new MemoryArrayList<>();
    	list2.add(new MemoryArray(1023, 0, 0, 0));
    	list2.add(new MemoryArray(2048, 0, 0, 0));
    	
    	assertTrue("Memory_0Test one-dimensional array list not equal to correct list!",
            Memory_0Test.equals(list1, new MemoryArrayList<>(list2)));
    	
    	list1 = new MemoryArrayList<>();
    	list1.add(new MemoryArray(1023, 200, 0, 0));
    	list1.add(new MemoryArray(2048, 0, 0, 0));
   	
    	list2 = new ArrayList<>();
	 	list2.add(new MemoryArray(1023, 0, 0, 0));
	 	list2.add(new MemoryArray(2048, 0, 0, 0));
    	assertFalse("Memory_0Test one-dimensional array list not equal to correct list!",
            Memory_0Test.equals(list1, new ArrayList<>()));
 	}
    
    /**
	 * Test method for {@link #isOneDimensionalArray(List<MemoryArray> elements)}.
	 */
    @Test
    public void test_oneDimensionalArrayList_size0() {
    	List<MemoryArray> list1 = Memory.newList(0);
    	list1.add(new MemoryArray(1023, 200, 0, 0));
    	list1.add(new MemoryArray(2048, 30, 0, 0));
    	
    	List<MemoryArray> list2 = Memory.newList(0);
    	list2.add(new MemoryArray(1023, 0, 0, 0));
    	list2.add(new MemoryArray(2048, 0, 0, 0));
    	
    	assertTrue("Memory_0Test list not equal to correct list!",
            Memory_0Test.equals(list1, new MemoryArrayList(list2)));
    	assertEquals("Memory_0Test list not equal to correct list!",
    	        list1,
    	        new MemoryArrayList(list2).asList());
    }
    
    /**
	 * Test method for {@link #isOneDimensionalArray(List<MemoryArray> elements)}.
	 */
    @Test
    public void test_oneDimensionalArrayList_size1() {
    	List<MemoryArray> list1 = Memory.newList(1);
    	list1.add(new MemoryArray(1023, 200, 0, 0));
    	list1.add(new MemoryArray(2048, 30, 0, 0));
    	
    	List<MemoryArray> list2 = Memory.newList(1);
    	list2.add(new MemoryArray(1023, 0, 0, 0));
    	list2.add(new MemoryArray(2048, 0, 0, 0));
    	
    	assertFalse("Memory_0Test list not equal to correct list!",
            Memory_0Test.equals(list1, new MemoryArrayList(list2)));
    	assertEquals("Memory_0Test list not equal to correct list!",
    	        list1,
    	        new MemoryArrayList(list2).asList());
    }
}
