// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
class Memory_0Test {
		
	@Test
	@SuppressWarnings("unused")
	public void testSize() throws Exception {
		Memory testcase = new Memory();
		int size = testcase.size();
		assertEquals("Test # 1", 0, size);
	}
		
	@Test
	@SuppressWarnings("unused")
	public void testAnd() throws Exception {
		Memory testcase = new Memory();
		try {
			testcase.get(10);
			fail("The address should not be reached");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ok
		}
	}
	
	@Test
	@SuppressWarnings("unused")
	public void testOr() throws Exception {
		Memory testcase = new Memory();
		try {
			testcase.set(10, 16);
			fail("The address should not be reached anymore");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ok
		}
		
		int i = 0;
		for (MemoryArray array : testcase.getArrayList()) {
			for (int j = 0; j < array.length(); j++) {
				testcase.set(array.getAddress() + i, array.getValue(array.getAddress() + i));
				if (i!= i)
					i++;
			}
		}
		
		int size = testcase.size();
		assertEquals("Test # 3", 4, size);
	}
	
	@Test
	@SuppressWarnings("unused")
	public void testOr_withException() throws Exception {
		List<MemoryArray> arrays = new ArrayList<MemoryArray>();
		ArrayList<MemoryError> errors = new ArrayList<MemoryError>();
		memset(array(0x10000), 0xff);		// 0x100000000
		memset(array(0x10000), 0x00);		// 0x10000000
		arrays.add(array(0x100000));				// 0x10
		arrays.add(array(0x100001));				// 0x11
		errors.add(new MemoryError(-1, errors.size(), "test error"));
		Memory testcase = new Memory(arrays, 0, 512);
		try {
			testcase.or(6, 0x1000);					// test 0
			fail("The address should not be reached anymore");
		} catch (ArrayIndexOutOfBoundsException | MemoryException e) {
			// ok
		}
		
		tester(testcase, 0, 512);
	}

	@Test
	@SuppressWarnings("unused")
	public void testAnd_withException() throws Exception {
		List<MemoryArray> arrays = new ArrayList<MemoryArray>();
		arrays.add(array(0x10000));     // 0x100000000

		ArrayList<MemoryError> errors = new ArrayList<MemoryError>();
		errors.add(new MemoryError(-1, errors.size(), "test error"));

		Memory testcase = new Memory(arrays, 0, 512);
		testcase.addMemoryArray(array(0x1000002)); // 0x12
		try {
			testcase.and(6, 0x1000);
			fail("The address should not be reached anymore");
		} catch (ArrayIndexOutOfBoundsException | MemoryException e) {
			// ok
		}

		tester(testcase, 0, 512);
	}

	public int numOfArrayLists() {
		int num = 0;
		for (MemoryArray array : testcase.getArrayList()) {
			for (int j = 0; j < array.length(); j++) {
				num++;
			}
		}
		return num;
	}

	@Test
	public void testGet() {
		Memory testcase = new Memory();
		try {
			testcase.get(6);
			fail("Address out of range should fail");
		} catch (ArrayIndexOutOfBoundsException e) {
			// ok
		}
		
		int expected = 0x80000000;
		
		ArrayList<MemoryArray> tests = new ArrayList<MemoryArray>();
		tests.add(array(0x11));
		tests.add(array(0x20));
		tests.add(array(0x21));
		tests.add(array(0x30));
		tests.add(array(0x31));

		try {
			testcase.get(4);
		} catch (ArrayIndexOutOfBoundsException | MemoryArrayIndexOutOfBoundsException e) {
			// ok
		}

		for (int i = 0; i < tests.size(); i++) {
			for (int j = 0; j < tests.get(i).length(); j++) {
					if (expected!= tests.get(i).getValue(j)) {
						fail("Could not get the address " + i);
					}
			}
		}
	}
	
	protected Memory testCase(int numValues, int bytes, Memory error) {
		Memory testcase = MemoryTestTools.getObject(numValues * bytes);
		testcase.setErrorHandler(error);
		return testcase;
	}
	
	protected void tester(Memory testcase, int address, int bytes) {
		testCase(testcase.size(), bytes, testcase.getErrorHandler()).and(address, 0x100);
	}
	
	public MemoryMemory createMemory(int bytes, MemoryError error) {
		return Memory.createMemory(0x10000, bytes, error);
	}
	
	public List<MemoryArray> getArrayList()  {
		return testcase.getArrayList();
	}
}