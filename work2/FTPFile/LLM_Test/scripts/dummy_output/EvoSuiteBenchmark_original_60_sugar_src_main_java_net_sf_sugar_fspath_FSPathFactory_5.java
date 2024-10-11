// FSPathFactoryTest.java
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains one unit test case for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactoryTest {
		//FSPathFactoryTest.java
	private TestClass testClass;
	/**
	 * <pre>
	 * Tests for this class
	 * </pre>
	 * Class to test. Each test case for the class should contain one unit test case.
	 *
	 * @author kbishop
	 */
	public class TestClass {
	    private final String file_name;

	    /**
	     * <pre>
	     * Tests for this class
	     * </pre>
	     * Class to test. Each test case for the class should contain one unit test case.
	     *
	     * @param file_name 
	     */
	    public TestClass(  File file_name ) {
	            this.file_name = file_name.getPath();
	    }

	    public String getFile_name(){
	            return(this.file_name );
	    }

	    @Test
	    public void test1() {
	        FSPathFactory.newFSPath( FSPathFactoryTest.class.getMethod( "test1" ) );
	    }

	    @Test
	    public void test2() {
	        FSPathFactory.newFSPath( FSPathFactoryTest.class.getMethod( "test2" ) );
	    }

	    @Test
	    public void test3() {
	        FSPathFactory.newFSPath( FSPathFactoryTest.class.getMethod( "test3" ) );
	    }

	    @Test
	    public void test4() {
	        FSPathFactory.newFSPath( FSPathFactoryTest.class.getMethod( "test4" ) );
	    }

	    @Test
	    public void test5() {
	        FSPathFactory.newFSPath( FSPathFactoryTest.class.getMethod( "test5" ) );
	    }
	}
}