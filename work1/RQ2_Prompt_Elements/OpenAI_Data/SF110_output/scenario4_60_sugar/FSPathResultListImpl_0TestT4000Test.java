// FSPathResultListImpl_0Test.java
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
class FSPathResultListImpl_0Test {

	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* <br/>
	* This test case is designed to test the {@link FSPathResultListImpl#each(Callback)} method
	* when the {@link FSPathResultListImpl} contains a single {@link FSPathResult} object.
	* <br/>
	* The {@link FSPathResult} object contains a {@link File} object.
	* <br/>
	* The {@link Callback} object is a custom implementation of the {@link Callback} interface.
	* <br/>
	* The {@link Callback#call(FSPathResult)} method is designed to read the contents of the
	* {@link File} object contained in the {@link FSPathResult} object and return the contents
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should return the {@link FSPathResultListImpl}
	* object and the {@link FSPathResult} object should contain the contents of the {@link File} object
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should not throw an {@link IOException}.
	*/
	@Test
	void testEach_0() throws IOException {
		// Create a new FSPathResultListImpl object.
		FSPathResultListImpl fSPathResultListImpl = new FSPathResultListImpl();
		// Create a new File object.
		File file = new File("test/net/sf/sugar/fspath/FSPathResultListImpl_0Test/testEach_0/file.txt");
		// Create a new FileWriter object.
		FileWriter fileWriter = new FileWriter(file);
		// Write the contents of the file.
		fileWriter.write("This is a test file.");
		// Close the FileWriter object.
		fileWriter.close();
		// Create a new FSPathResult object.
		FSPathResult fSPathResult = new FSPathResultImpl(file);
		// Add the FSPathResult object to the FSPathResultListImpl object.
		fSPathResultListImpl.add(fSPathResult);
		// Create a new Callback object.
		Callback callback = new Callback() {
			public FSPathResult call(FSPathResult fSPathResult) throws IOException {
				// Create a new FileReader object.
				FileReader fileReader = new FileReader((File)fSPathResult.getResult());
				// Create a new StringBuffer object.
				StringBuffer stringBuffer = new StringBuffer();
				// Create a new char array.
				char[] charArray = new char[1024];
				// Read the contents of the file.
				int read = fileReader.read(charArray);
				// Loop while there are characters to read.
				while (read != -1) {
					// Append the characters to the StringBuffer object.
					stringBuffer.append(charArray, 0, read);
					// Read the next characters.
					read = fileReader.read(charArray);
				}
				// Close the FileReader object.
				fileReader.close();
				// Create a new FSPathResult object.
				FSPathResult fSPathResult2 = new FSPathResultImpl(stringBuffer.toString());
				// Return the FSPathResult object.
				return fSPathResult2;
			}
		};
		// Call the each method on the FSPathResultListImpl object.
		fSPathResultListImpl.each(callback);
		// Get the FSPathResult object from the FSPathResultListImpl object.
		fSPathResult = fSPathResultListImpl.get(0);
		// Get the result from the FSPathResult object.
		Object result = fSPathResult.getResult();
		// Check that the result is a String object.
		assertTrue(result instanceof String);
		// Check that the result is equal to the expected value.
		assertEquals("This is a test file.", result);
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* <br/>
	* This test case is designed to test the {@link FSPathResultListImpl#each(Callback)} method
	* when the {@link FSPathResultListImpl} contains a single {@link FSPathResult} object.
	* <br/>
	* The {@link FSPathResult} object contains a {@link File} object.
	* <br/>
	* The {@link Callback} object is a custom implementation of the {@link Callback} interface.
	* <br/>
	* The {@link Callback#call(FSPathResult)} method is designed to read the contents of the
	* {@link File} object contained in the {@link FSPathResult} object and return the contents
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should return the {@link FSPathResultListImpl}
	* object and the {@link FSPathResult} object should contain the contents of the {@link File} object
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should not throw an {@link IOException}.
	*/
	@Test
	void testEach_1() throws IOException {
		// Create a new FSPathResultListImpl object.
		FSPathResultListImpl fSPathResultListImpl = new FSPathResultListImpl();
		// Create a new File object.
		File file = new File("test/net/sf/sugar/fspath/FSPathResultListImpl_0Test/testEach_1/file.txt");
		// Create a new FileWriter object.
		FileWriter fileWriter = new FileWriter(file);
		// Write the contents of the file.
		fileWriter.write("This is a test file.");
		// Close the FileWriter object.
		fileWriter.close();
		// Create a new FSPathResult object.
		FSPathResult fSPathResult = new FSPathResultImpl(file);
		// Add the FSPathResult object to the FSPathResultListImpl object.
		fSPathResultListImpl.add(fSPathResult);
		// Create a new Callback object.
		Callback callback = new Callback() {
			public FSPathResult call(FSPathResult fSPathResult) throws IOException {
				// Create a new FileReader object.
				FileReader fileReader = new FileReader((File)fSPathResult.getResult());
				// Create a new StringBuffer object.
				StringBuffer stringBuffer = new StringBuffer();
				// Create a new char array.
				char[] charArray = new char[1024];
				// Read the contents of the file.
				int read = fileReader.read(charArray);
				// Loop while there are characters to read.
				while (read != -1) {
					// Append the characters to the StringBuffer object.
					stringBuffer.append(charArray, 0, read);
					// Read the next characters.
					read = fileReader.read(charArray);
				}
				// Close the FileReader object.
				fileReader.close();
				// Create a new FSPathResult object.
				FSPathResult fSPathResult2 = new FSPathResultImpl(stringBuffer.toString());
				// Return the FSPathResult object.
				return fSPathResult2;
			}
		};
		// Call the each method on the FSPathResultListImpl object.
		fSPathResultListImpl.each(callback);
		// Get the FSPathResult object from the FSPathResultListImpl object.
		fSPathResult = fSPathResultListImpl.get(0);
		// Get the result from the FSPathResult object.
		Object result = fSPathResult.getResult();
		// Check that the result is a String object.
		assertTrue(result instanceof String);
		// Check that the result is equal to the expected value.
		assertEquals("This is a test file.", result);
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* <br/>
	* This test case is designed to test the {@link FSPathResultListImpl#each(Callback)} method
	* when the {@link FSPathResultListImpl} contains a single {@link FSPathResult} object.
	* <br/>
	* The {@link FSPathResult} object contains a {@link File} object.
	* <br/>
	* The {@link Callback} object is a custom implementation of the {@link Callback} interface.
	* <br/>
	* The {@link Callback#call(FSPathResult)} method is designed to read the contents of the
	* {@link File} object contained in the {@link FSPathResult} object and return the contents
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should return the {@link FSPathResultListImpl}
	* object and the {@link FSPathResult} object should contain the contents of the {@link File} object
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should not throw an {@link IOException}.
	*/
	@Test
	void testEach_2() throws IOException {
		// Create a new FSPathResultListImpl object.
		FSPathResultListImpl fSPathResultListImpl = new FSPathResultListImpl();
		// Create a new File object.
		File file = new File("test/net/sf/sugar/fspath/FSPathResultListImpl_0Test/testEach_2/file.txt");
		// Create a new FileWriter object.
		FileWriter fileWriter = new FileWriter(file);
		// Write the contents of the file.
		fileWriter.write("This is a test file.");
		// Close the FileWriter object.
		fileWriter.close();
		// Create a new FSPathResult object.
		FSPathResult fSPathResult = new FSPathResultImpl(file);
		// Add the FSPathResult object to the FSPathResultListImpl object.
		fSPathResultListImpl.add(fSPathResult);
		// Create a new Callback object.
		Callback callback = new Callback() {
			public FSPathResult call(FSPathResult fSPathResult) throws IOException {
				// Create a new FileReader object.
				FileReader fileReader = new FileReader((File)fSPathResult.getResult());
				// Create a new StringBuffer object.
				StringBuffer stringBuffer = new StringBuffer();
				// Create a new char array.
				char[] charArray = new char[1024];
				// Read the contents of the file.
				int read = fileReader.read(charArray);
				// Loop while there are characters to read.
				while (read != -1) {
					// Append the characters to the StringBuffer object.
					stringBuffer.append(charArray, 0, read);
					// Read the next characters.
					read = fileReader.read(charArray);
				}
				// Close the FileReader object.
				fileReader.close();
				// Create a new FSPathResult object.
				FSPathResult fSPathResult2 = new FSPathResultImpl(stringBuffer.toString());
				// Return the FSPathResult object.
				return fSPathResult2;
			}
		};
		// Call the each method on the FSPathResultListImpl object.
		fSPathResultListImpl.each(callback);
		// Get the FSPathResult object from the FSPathResultListImpl object.
		fSPathResult = fSPathResultListImpl.get(0);
		// Get the result from the FSPathResult object.
		Object result = fSPathResult.getResult();
		// Check that the result is a String object.
		assertTrue(result instanceof String);
		// Check that the result is equal to the expected value.
		assertEquals("This is a test file.", result);
	}
	
	/**
	* Test case for the {@link FSPathResultListImpl#each(Callback)} method.
	* <br/>
	* This test case is designed to test the {@link FSPathResultListImpl#each(Callback)} method
	* when the {@link FSPathResultListImpl} contains a single {@link FSPathResult} object.
	* <br/>
	* The {@link FSPathResult} object contains a {@link File} object.
	* <br/>
	* The {@link Callback} object is a custom implementation of the {@link Callback} interface.
	* <br/>
	* The {@link Callback#call(FSPathResult)} method is designed to read the contents of the
	* {@link File} object contained in the {@link FSPathResult} object and return the contents
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should return the {@link FSPathResultListImpl}
	* object and the {@link FSPathResult} object should contain the contents of the {@link File} object
	* as a {@link String}.
	* <br/>
	* The {@link FSPathResultListImpl#each(Callback)} method should not throw an {@link IOException}.
	*/
	@Test
	void testEach_3() throws IOException {
		// Create a new FSPathResultListImpl object.
		FSPathResultListImpl fSPathResultListImpl = new FSPathResultListImpl();
		// Create a new File object.
		File file = new File("test/net/sf/sugar/fspath/FSPathResultListImpl_0Test/testEach_3/file.txt");
		// Create a new FileWriter object.
		FileWriter fileWriter = new FileWriter(file);
		// Write the contents of the file.
		fileWriter.write("This is a test file.");
		// Close the FileWriter object.
		fileWriter.close();
		// Create a new FSPathResult object.
		FSPathResult fSPathResult = new FSPathResultImpl(file);
		// Add the FSPathResult object to the FSPathResultListImpl object.
		fSPathResultListImpl.add(fSPathResult);
		// Create a new Callback object.
		Callback callback = new Callback() {
			public FSPathResult call(FSPathResult fSPathResult) throws IOException {
				// Create a new FileReader object.
				FileReader fileReader = new FileReader((File)fSPathResult.getResult());
				// Create a new StringBuffer object.
				StringBuffer stringBuffer = new StringBuffer();
				// Create a new char array.
				char[] charArray = new char[1024];
				// Read the contents