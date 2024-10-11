// StrangeSortListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
// StrangeSortList.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StrangeSortList {

    public static List<Object> strangeSortList(List<Object> lst) {
        List<Object> result = new ArrayList<Object>();
        List<Integer> sorted = new ArrayList<Integer>();
        for (Object value : lst) {
            if (value instanceof Integer) {
                sorted.add((Integer) value);
            }
        }
        Collections.sort(sorted);
        int i = 0;
        int j = sorted.size() - 1;
        while (i <= j) {
            result.add(sorted.get(i));
            if (i!= j) {
                result.add(sorted.get(j));
            }
            i++;
            j--;
        }
        return result;
    }
}

// StrangeSortListTest.java
package scenario1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StrangeSortList}.
* It contains one unit test case for the {@link StrangeSortList#strangeSortList(List)} method.
*/
class StrangeSortListTest {
		
/*
* Class to Test SortList
*/
private class TestStuff {
	
	public static int testSortListOne() {
	  List<Integer> list = new ArrayList<Integer>();
	  list.add(0);
	  list.add(1);
	  list.add(2);
	  arraySort(list);
	  assertArrayEquals(new int[]{0,2,1}, list.toArray());
	  return 0;
	}
	
	public static int testListTwo() {
	 	List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
	    arraySort(list);
        assertArrayEquals(new int[]{1,2,0}, list.toArray());
        return 0;
	}
	
	public static int testAdd() {
	        List<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(11);
        list.add(1);
	    arraySort(list);
        assertArrayEquals(list.toArray(), new int[]{100,11,1});
        return 0;
	}	
	
}

/*
* Class to Test SortList
*/
private class TestingSortList {
	
	List<List<Integer>> testList = new ArrayList<>();
	
	public static int testSortList1() {
    	List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        arraySort(list);
        assertArrayEquals(new int[]{2,1}, list.toArray());
    	return 0;
    }
	
    public static int testSortArray1() {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        arraySort(list);
    	
    	assertArrayEquals(new int[]{2,1,3}, list.toArray());
    	return 0;
    }
	
	public static int testArraySort() {
	    List<List<Integer>> list = new ArrayList<>();
        return list.buildSort(new int[]{5,2,4,1,7});
    	return 0;
	}
	
	public static int[] test1() {
    	List<Integer> list = new ArrayList<Integer>();
    	list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(0);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        arraySort(list);
    	List<int[]> arrayList = new ArrayList<int[]>();
        arrayList.add(list.toArray());
    	return arrayList.toArray();
	}		

	public static int testArraySort2() {
	    List<Integer> list = new ArrayList<Integer>();
    	return list.buildSort(new int[]{1,2,1,3,5,7});
    	return 0;
	}		
	
	public static int[] test2() {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
        list.add(new ArrayList<Integer>());
    	return list.buildSort(new int[]{1,2,1,3,5,7});
    	
	}		
			
	public static int testArraySort3() {
    	List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(2);
    	return list.buildSort(new int[]{1,2,1,3,5,7});        
    	
	}		

}							

///////////////////////////////////////////////

public static void arraySort(List<Integer> list) {
    Collections.sort(list);
}
	
	public static void arraySort2(List<List<Integer>> list) {
    Collections.sort(list);
}	

public static void testSortStun() {
	
    TestingSortList sorting = new TestingSortList();
    List<List<Integer>> list = list(new List[]{
        list(new List[]{2,1}),
        list(new List[]{2,1}),
        list(new List[]{1}),
        list(new List[]{2})});
    
    System.out.println(list);
    sorting.testList.add(list);
    list = list(new List[]{
        list(new List[]{2,1}),
        list(new List[]{2,1}),
        list(new List[]{1}),
        list(new List[]{2})});
    
    System.out.println(list);
    sorting.testList.add(list);
    
    systemOut.println("============>Test SortList Test : (" +list.size() + ")");

    Collections.sort(sorting.testList);
    
    systemOut.println("============>Test1 Test : (" + list.size() + ")");