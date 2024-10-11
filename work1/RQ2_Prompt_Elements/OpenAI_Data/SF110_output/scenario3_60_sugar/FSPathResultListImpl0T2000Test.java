// FSPathResultListImplTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImplTest {

	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/test.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test2.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test3.txt")));
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return null;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/test.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test2.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test3.txt")));
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return result;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null_EmptyList() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return null;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull_EmptyList() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return result;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null_NullList() throws IOException {
		FSPathResultListImpl list = null;
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return null;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull_NullList() throws IOException {
		FSPathResultListImpl list = null;
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return result;
			}
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null_NullCallback() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/test.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test2.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test3.txt")));
		list.each(null);
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull_NullCallback() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/test.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test2.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test3.txt")));
		list.each(null);
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null_NullList_NullCallback() throws IOException {
		FSPathResultListImpl list = null;
		list.each(null);
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull_NullList_NullCallback() throws IOException {
		FSPathResultListImpl list = null;
		list.each(null);
	}
}

// FSPathResultListImplTest.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImplTest {
		
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a null value.
	 * @throws IOException
	 */
	@Test
	void testEach_Null() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/test.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test2.txt")));
		list.add(new FSPathResultImpl(new File("/tmp/test3.txt")));
		list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return null;
			}
		});
	}
	
