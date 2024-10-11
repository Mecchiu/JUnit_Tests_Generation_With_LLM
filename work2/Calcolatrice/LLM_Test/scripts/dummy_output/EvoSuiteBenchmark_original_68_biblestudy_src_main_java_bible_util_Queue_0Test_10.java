// Queue_0Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains one unit test case for the {@link Queue#dequeue()} method.
*/
class Queue_0Test {
		
	static int test0(){
	return  13;
	}
	
	static int test1(){
        Queue queue = new Queue();
//        Queue is empty, it should return true if dequeue() returns an element
//  System.out.println("\nQueue isempty : " + queue.isEmpty());
        return 13;
	}
	
	static int test2(){
	if(!(1<<3) >=2) {
	     System.out.println("Expected exception");
	}
	int return_value = test0();
	assertTrue("Expected exception", 0 == return_value);
        return_value = test1();
	System.out.println(" return value : " + return_value);
        return_value = test2();
	System.out.println(" return value : " + return_value);
        return_value = test2();
        return_value = test1(); 
	System.out.println(" return value : " + return_value);
	return_value = test1(); 
        return_value = test1(); 
	return_value = test1(); 
        return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	return_value = test1(); 
	
	return_value = test0(); 
	return_value = test1(); 
	return_value = test2(); 
	return_value = test1(); 
	return_value = test1();

		return_value = test1(); 
	return_value = test1(); 

	return_value = test0();
	System.out.println("  return value : " + return_value);
	return_value = test0();
		return_value = test1(); 
	String return_value2 = test0(); 
    return_value = test1();
	}; // end of test2
	
	static void test1(){
	if(1<<3 <2) {
	     System.out.println("Expected exception");
	}
	int counter = 1<<3;
	Queue queue = new Queue(counter);
	
	Object value0 = queue.remove(new Object());
	Object value1 = queue.remove(new Object());
	Object value2 = queue.remove(new Object());
	System.out.println("\n" + counter + "  : " + value0);
    //return_value = test1(); 
	assertTrue("Expected exception", 1<<3 < 2);
//		System.out.println("\n\n" + value0 +" "+ value1 + "\n" + value2); 
	}

	static void test2(){
	if(1<<3 >2) {
	     System.out.println("Expected exception");
	}
	int counter = 1<<3;
	Queue queue = new Queue(counter);
	
	Object value0 = null;
	Object value1 = null;
	Object value2 = null;
        System.out.println("\n\n" + counter + "  : " + value0);
        //return_value = test1(); 
	assertTrue("Expected exception", 1<<3 > 2);
	}


	static void test3(){

	}
	static void test4(){
	
	}
	static void test5(){
	
	}

	static void test6(){
	
	}
	static void test7(){
	
	}
}