// ArrayOfDependencyTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfDependency}.
* It contains one unit test case for the {@link ArrayOfDependency#getTypeDesc()} method.
*/
class ArrayOfDependencyTest {
		
	@Test
    public void test1(){
    Object object = new ArrayOfDependency();
    Object obj = object.getTypeDesc();
    assertEquals(object.getClass(), obj);
    }

    @Test
    public void test2(){
		
	boolean flag = ArrayOfDependency.class.isAssignableFrom(String.class);
	assertTrue("Result must be true", flag);

    boolean flag2 = ArrayOfDependency.class.isAssignableFrom(mygrid.web.WebService.class);
	assertTrue("Result must be true", flag2);

    boolean flag3 = ArrayOfDependency.class.isAssignableFrom(ArrayOfDependency.class);
	assertTrue("Result must be true", flag3);
    }

    @Test
    public void test3(){
	Object array = new ArrayOfDependency[]{new ArrayOfDependency()};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

    @Test
    public void test4(){
	Object array = new ArrayOfDependency[]{new ArrayOfDependency(""), new ArrayOfDependency("")};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

    @Test
    public void test5(){
	Object array = new ArrayOfDependency[]{ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance()};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

    @Test
    public void test6(){
	Object array = new ArrayOfDependency[]{ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance()};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

	@Test
	public void test7(){
		boolean flag = ArrayOfDependency.class.isAssignableFrom(String.class);
	assertTrue("Result must be true", flag);

	boolean flag2 = ArrayOfDependency.class.isAssignableFrom(mygrid.web.WebService.class);
	assertTrue("Result must be true", flag2);

	boolean flag3 = ArrayOfDependency.class.isAssignableFrom(ArrayOfDependency.class);
	assertTrue("Result must be true", flag3);
    }

    @Test
    public void test8(){
	Object array = new ArrayOfDependency[]{ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance()};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

    @Test
    public void test9(){
	Object array = new ArrayOfDependency[]{ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance(), ArrayOfDependency.class.newInstance()};
	Object object = array;
	Object obj = object.getTypeDesc();
	assertEquals(array.getClass(), obj);
    }

	}