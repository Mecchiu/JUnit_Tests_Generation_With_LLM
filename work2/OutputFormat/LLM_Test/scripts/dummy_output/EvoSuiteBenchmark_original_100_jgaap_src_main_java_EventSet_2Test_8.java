// EventSet_2Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains one unit test case for the {@link EventSet#size()} method.
*/
class EventSet_2Test {
		
    static final List<Event> tests = List.of(
        //    @Test
        //  1.    Test 1
        //     @Test 1
        //     @Test 2
        //  10.    Test  2
        //      @Test 1
        //      @Test 2
        //      @Test 1
        //      @Test 2
	    new Event("  Test1 ", "Test", "Test"),
	    new Event("Test2", "Test", "Test2"),
	    // @Test 1
	    // @Test 2
	    new Event("Test1", "Test", "Test1"),
	    new Event("  Test3", "Test2", "Test3"));


	@Test
    public void testSize() {
	    //  @Test
	    //  2.    Test 1
	    //  3.    Test 2
		
	    //    10
	    //    Test
	    //  30
	    //    Test

	    assertEquals(tests.size(), EventSet_2Test.size());
    }
}

// This provides an example of the main test.
// This test is only functional when processing of events is
//  separable or not.

public void testEventSet() {
	//........................................................
	//  Example 1
	System.out.println("\n*********\nEventSet [ ");
	int num = 0;
	//  A test for the method with non-separable events.
	for (Event event : tests) {
		System.out.println(event.toString());
		EventSet se = event.split();
		for (Event es : se.subset(0, num++))
			System.out.println( "Testing " + es.toString());
	}
	
	//  B test for the method with non-separable events with a start index
	//  of 0.
    for (Event event : tests) {
    	events.add(
    		event.add(1));
        events.add(
        	event.add(11));
        events.add(
        	event.add(22));
        events.add(
        	event.add(55));
        events.add(
		     event.sub
        );    	
    }
	//  C test for the method with non-separable events with a start index
	//  of 8.
    for (Event event : tests) {
        events.add(
        	event.add(11, 12));
        events.add(
        	event.add(22, 13));
        events.add(
        	event.add(55, 14));
        for (Event es : event.subset(8, num + 14))
        	events.add(
        			es
        ); /*  test 1
       ,
       ,
        test 2
        `,
          */
    }
    
	for (Event event : events) 
	{
    	events.remove(event);
		System.out.println(event.toString());
    }
	
	
	//  Example 2
	System.out.println("\n*********\nEventSet : ");
	for (Event event : tests) System.out.println(event);
	
	for (Event event : events) 
	{
		System.out.println(event.toString());
	}
	
	System.out.println("*********\nEventSet: ");
    for (Event event : tests)
    	System.out.println(event.toString());
	System.out.println("*********");
}

var testevent0 = new Event("Test0");
var testevent3 = new Event("Test3");

//  @Test
//  1. Example 2:
//  2-1 1-3 test
	// 3-2 1-2 test
	
//	@Test
//  2. Example 3: test

//	@Test
//  3. Example 3: test
	// test

@Test
public void testEventSetSize() throws Exception {
    System.out.println("TestEventSet : size of events "+ EventSet_2Test.size());
}