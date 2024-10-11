// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {
		Object testobject;
		@SuppressWarnings("unused")
		InputStream testvar;

	@Test
    void testConstructor() {
		TestUtils.assertSucceeds("testConstructor()");
	}

	/**
	 * If the compiler tries to compile the source from the given reader,
	 * it should throw an exception.
	 */
	@Test
	void testThatExceptionIsThrown() throws IOException {
		AtRobotCompiler.compile(System.in)
		.printText();
	}

	/**
	 * If a source read from the reader is not given from,
	 * a null pointer exception should be thrown.
	 */
	@Test
	void testGetInputStreamIsNull() {
		assertThrows(nullPointerException().toString(),
			() -> new AtRobotCompiler().getInputStream()
			);
	}

	/**
	 * Test methods for {@link #getInputStream()}.
	 */
	@Test
	void testGetInputStreamReturningFile() throws Exception {
		AtRobotCompiler.compile(new FileInputStream(new File("src/TestFiles/testfile.txt")))
					.printText();
		assertNotNull(new File("src/TestFiles/testfile.txt"));
	}

	/**
	 * Test methods for {@link #getInputStream()}.
	 * Test for {@code InputStream} being marked as {@link Closeable}.
	 */
	@Test
	void testGetInputStreamAsCloseable() throws Exception {
		InputStream in = new CloseableInputStream(new FileInputStream(new File("src/TestFiles/testfile.txt")), "text");
		assertNotNull(in);
	}

	/**
	 * Test methods for {@link #getInputStream()}.
	 * Test for {@code IOException} being thrown when the reader is not given from.
	 */
	@Test
	void testGetInputStreamNotNullFromReaderIsIOException() throws Exception {
		testvar = new CloseableReader(null, "text");
		assertThrows(nullPointerException().toString(),
			() -> new AtRobotCompiler().getInputStream()
			);
		testvar = new CloseableReader(new FileInputStream(new File("src/TestFiles/testfile.txt")), "text");
		assertNotNull(testvar.getInputStream());
	}

	/**
	 * Test methods for {@link #getInputStream()}.
	 * Test for a NullPointerException being thrown when the reader is not given from.
	 */
	@Test
	void testGetInputStreamNotNullFromNullPointerException() throws Exception {
		testvar = testvar
				= new CloseableReader(null, null)
				;
		assertThrows(nullPointerException().toString(),
			() -> new AtRobotCompiler().getInputStream()
			);
		testvar = new CloseableReader(new FileInputStream(new File("src/TestFiles/testfile.txt")), null);
		assertNotNull(testvar.getInputStream());
	}
}