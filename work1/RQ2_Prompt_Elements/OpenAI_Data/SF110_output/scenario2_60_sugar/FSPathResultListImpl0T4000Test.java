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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
	 * It tests the case when the callback method is called for each result.
	 * @throws IOException
	 */
	@Test
	void testEach() throws IOException {
		FSPathResultListImpl list = new FSPathResultListImpl();
		list.add(new FSPathResultImpl(new File("test1.txt")));
		list.add(new FSPathResultImpl(new File("test2.txt")));
		list.add(new FSPathResultImpl(new File("test3.txt")));
		list.add(new FSPathResultImpl(new File("test4.txt")));
		list.add(new FSPathResultImpl(new File("test5.txt")));
		list.add(new FSPathResultImpl(new File("test6.txt")));
		list.add(new FSPathResultImpl(new File("test7.txt")));
		list.add(new FSPathResultImpl(new File("test8.txt")));
		list.add(new FSPathResultImpl(new File("test9.txt")));
		list.add(new FSPathResultImpl(new File("test10.txt")));
		
		list.each(new Callback() {
			public void call(FSPathResult result) throws IOException {
				FileWriter writer = new FileWriter(result.getFile());
				writer.write("Hello World!");
				writer.close();
			}
		});
		
		for (FSPathResult result : list) {
			FileReader reader = new FileReader(result.getFile());
			char[] buffer = new char[13];
			reader.read(buffer);
			reader.close();
			assertEquals("Hello World!", new String(buffer));
		}
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
* It