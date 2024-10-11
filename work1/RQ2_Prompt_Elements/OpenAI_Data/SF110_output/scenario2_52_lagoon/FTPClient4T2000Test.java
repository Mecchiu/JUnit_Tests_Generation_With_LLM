// FTPClientTest.java
package nu.staldal.ftp;

import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPClient}.
* It contains ten unit test cases for the {@link FTPClient#storeUnique(String)} method.
*/
class FTPClientTest {

	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is empty.
	*/
	@Test
	public void testStoreUnique_EmptyPath() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is null.
	*/
	@Test
	public void testStoreUnique_NullPath() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique(null);
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath2() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath3() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath4() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath5() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath6() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/test3");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath7() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/test3/");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath8() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/test3/test4");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath9() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/test3/test4/");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
	
	/**
	* Test case for the {@link FTPClient#storeUnique(String)} method.
	* It tests the case when the path is not empty and not null.
	*/
	@Test
	public void testStoreUnique_NotEmptyPath10() {
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.storeUnique("/test/test2/test3/test4/test5");
		} catch (FTPException e) {
			fail("FTPException should not be thrown");
		} catch (IOException e) {
			fail("IOException should not be thrown");
		}
	}
}