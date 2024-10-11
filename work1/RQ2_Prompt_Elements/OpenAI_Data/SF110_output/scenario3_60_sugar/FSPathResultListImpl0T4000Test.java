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
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		FSPathResultList result = list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return null;
			}
		});
		
		assertEquals(3, result.size());
		assertEquals("/tmp/foo", result.get(0).getFile().getPath());
		assertEquals("/tmp/bar", result.get(1).getFile().getPath());
		assertEquals("/tmp/baz", result.get(2).getFile().getPath());
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method returns a non-null value.
	 * @throws IOException
	 */
	@Test
	void testEach_NonNull() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		FSPathResultList result = list.each(new Callback() {
			public FSPathResult call(FSPathResult result) throws IOException {
				return new FSPathResultImpl(new File("/tmp/qux"));
			}
		});
		
		assertEquals(3, result.size());
		assertEquals("/tmp/qux", result.get(0).getFile().getPath());
		assertEquals("/tmp/qux", result.get(1).getFile().getPath());
		assertEquals("/tmp/qux", result.get(2).getFile().getPath());
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws an IOException.
	 * @throws IOException
	 */
	@Test
	void testEach_IOException() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(IOException.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new IOException("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a RuntimeException.
	 * @throws IOException
	 */
	@Test
	void testEach_RuntimeException() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(RuntimeException.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new RuntimeException("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws an Error.
	 * @throws IOException
	 */
	@Test
	void testEach_Error() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Error.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Error("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws an Exception.
	 * @throws IOException
	 */
	@Test
	void testEach_Exception() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Exception.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Exception("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a Throwable.
	 * @throws IOException
	 */
	@Test
	void testEach_Throwable() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a Throwable.
	 * @throws IOException
	 */
	@Test
	void testEach_Throwable_2() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a Throwable.
	 * @throws IOException
	 */
	@Test
	void testEach_Throwable_3() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a Throwable.
	 * @throws IOException
	 */
	@Test
	void testEach_Throwable_4() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	 * Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	 * It tests the case when the callback method throws a Throwable.
	 * @throws IOException
	 */
	@Test
	void testEach_Throwable_5() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public FSPathResult call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
}