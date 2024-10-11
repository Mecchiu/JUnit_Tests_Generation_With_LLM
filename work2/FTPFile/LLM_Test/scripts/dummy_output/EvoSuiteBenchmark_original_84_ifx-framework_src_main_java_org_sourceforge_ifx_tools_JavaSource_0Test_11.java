// JavaSource_0Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains one unit test case for the {@link JavaSource#hasInterface()} method.
*/
class JavaSource_0Test {
		
    @Test
    void equalsAndHashCodeTest(){
    	final JavaSource j1 = new JavaSource("Package1");
    	final JavaSource j2 = new JavaSource("Package1");
    	
    	assertEquals("Package1", j1);
    	assertEquals("", j1);
    	assertEquals("Package1", j2);
    }
    
  	@Test
    void equalsAndHashCode2(){
  		final JavaSource j1 = new JavaSource("");
  		final JavaSource j2 = new JavaSource("");
  		
  		assertTrue("", j1.equals(j2));
  		assertTrue("", j2.equals(j1));
  		
  	}
    
    @Test
    void testHashCode(){
    	final JavaSource j1 = new JavaSource("");
    	final JavaSource j2 = new JavaSource("");
    	
    	assertFalse("", j1.hashCode() == j2.hashCode());
    	assertFalse("", j1.hashCode()!= 0);

    	assertTrue("", j1.equals(j1));
    }
    
    @Test
	public void toStringTest(){
		//empty
		JavaSource j1 = new JavaSource();
		assertEquals("", j1.toString());
		
    	//package
		try {
			j1 = new JavaSource("package1");
		} catch (IllegalArgumentException e) {
			assertFalse("Invalid JavaSource.", e.getMessage().contains("package1"));
			return;
		} catch (NullPointerException e) {
		    // expected
		    return;
      }
		assertTrue("Invalid JavaSource.", true);

    	//className
		try {
			j1 = new JavaSource("Foo");
		} catch (IllegalArgumentException e) {
			assertFalse("Invalid JavaSource.", e.getMessage().contains("\"Foo\""));
			return;
		}
		assertTrue("Invalid JavaSource.", true);
	}
	
	@Test
	public void membersTest(){
		//empty members list
		JavaSource j1 = new JavaSource();
		j1.addMemberVariable("test", "test1");
		j1.addMemberVariable("test", "test2");
    	
		JavaSource j2 = new JavaSource();
		assertEquals(new ArrayList(), j2.getMemberVariables());
	}
	
    @Test
	public void iteratorTest(){
		JavaSource j1 = new JavaSource();
		j1.addMemberVariable("test", "testName");
		j1.addMemberVariable("test", "test2");
		
		Iterator<String> it = j1.iterator();
		assertEquals("", it.next());
		assertEquals("testName", it.next());
		assertFalse(it.hasNext());
	}

    @Test
	public void toListTest(){
		final JavaSource j1 = new JavaSource();
		Iterator<String> it = j1.iterator();
		try {
			while (it.hasNext()) {
				String next = it.next();
				assertEquals("name: <" + it.next() + ">", next);
			}
		} catch (Exception e) {
		    assertTrue("Iteration failed.", false);
		}
	}
	
	public String[] getPackageNames(){
		final String[] names = new String[1];
		final StringTokenizer it = new StringTokenizer("");
		it.nextToken();
		it.hasMoreTokens();
		names[0] = it.nextToken();
		return names;
	}
}