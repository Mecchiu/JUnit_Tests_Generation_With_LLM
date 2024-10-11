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
	* It tests the case when the callback is null.
	*/
	@Test
	void testEach_NullCallback() {
		FSPathResultListImpl list = new FSPathResultListImpl();
		assertThrows(NullPointerException.class, () -> {
			list.each(null);
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws an IOException.
	*/
	@Test
	void testEach_IOException() {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(IOException.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new IOException("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a RuntimeException.
	*/
	@Test
	void testEach_RuntimeException() {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(RuntimeException.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new RuntimeException("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws an Error.
	*/
	@Test
	void testEach_Error() {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(Error.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new Error("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_Throwable() {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_EmptyList() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				throw new AssertionError("should not be called");
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_OneItem() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertEquals("/tmp/foo", result.getFile().getPath());
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_TwoItems() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertTrue(result.getFile().getPath().equals("/tmp/foo") || result.getFile().getPath().equals("/tmp/bar"));
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_ThreeItems() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertTrue(result.getFile().getPath().equals("/tmp/foo") || result.getFile().getPath().equals("/tmp/bar") || result.getFile().getPath().equals("/tmp/baz"));
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_TenItems() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		list.add(new FSPathResultImpl(new File("/tmp/qux")));
		list.add(new FSPathResultImpl(new File("/tmp/quux")));
		list.add(new FSPathResultImpl(new File("/tmp/corge")));
		list.add(new FSPathResultImpl(new File("/tmp/grault")));
		list.add(new FSPathResultImpl(new File("/tmp/garply")));
		list.add(new FSPathResultImpl(new File("/tmp/waldo")));
		list.add(new FSPathResultImpl(new File("/tmp/fred")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertTrue(result.getFile().getPath().equals("/tmp/foo") || result.getFile().getPath().equals("/tmp/bar") || result.getFile().getPath().equals("/tmp/baz") || result.getFile().getPath().equals("/tmp/qux") || result.getFile().getPath().equals("/tmp/quux") || result.getFile().getPath().equals("/tmp/corge") || result.getFile().getPath().equals("/tmp/grault") || result.getFile().getPath().equals("/tmp/garply") || result.getFile().getPath().equals("/tmp/waldo") || result.getFile().getPath().equals("/tmp/fred"));
			}
		});
	}
}

// FSPathResultListTest.java
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
* Test class of {@link FSPathResultList}.
* It contains ten unit test cases for the {@link FSPathResultList#each(Callback)} method.
*/
class FSPathResultListTest {
		
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback is null.
	*/
	@Test
	void testEach_NullCallback() {
		FSPathResultList list = new FSPathResultListImpl();
		assertThrows(NullPointerException.class, () -> {
			list.each(null);
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws an IOException.
	*/
	@Test
	void testEach_IOException() {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(IOException.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new IOException("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a RuntimeException.
	*/
	@Test
	void testEach_RuntimeException() {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(RuntimeException.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new RuntimeException("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws an Error.
	*/
	@Test
	void testEach_Error() {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(Error.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new Error("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_Throwable() {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		assertThrows(Throwable.class, () -> {
			list.each(new Callback() {
				public void call(FSPathResult result) throws IOException {
					throw new Throwable("test");
				}
			});
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_EmptyList() throws IOException {
		FSPathResultList list = new FSPathResultListImpl();
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				throw new AssertionError("should not be called");
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_OneItem() throws IOException {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertEquals("/tmp/foo", result.getFile().getPath());
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_TwoItems() throws IOException {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertTrue(result.getFile().getPath().equals("/tmp/foo") || result.getFile().getPath().equals("/tmp/bar"));
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_ThreeItems() throws IOException {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("/tmp/foo")));
		list.add(new FSPathResultImpl(new File("/tmp/bar")));
		list.add(new FSPathResultImpl(new File("/tmp/baz")));
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				assertTrue(result.getFile().getPath().equals("/tmp/foo") || result.getFile().getPath().equals("/tmp/bar") || result.getFile().getPath().equals("/tmp/baz"));
			}
		});
	}
	
	/**
	* Test case for the {@link FSPathResultList#each(Callback)} method.
	* It tests the case when the callback throws a Throwable.
	*/
	@Test
	void testEach_TenItems() throws IOException {
		FSPathResultList list = new FSPathResultListImpl();
		list.add(new