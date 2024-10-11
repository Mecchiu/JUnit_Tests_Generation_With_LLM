package net.virtualinfinity.atrobots.computer;
public Memory_0Test(String testName) {
}

/**
* Test class of {@link Memory} and {@link MemoryArray}.
* It contains one unit test case for the {@link Memory#size()} method.
*/
public class Memory_0Test_class {
		public static void main(String[] args) {
				Memory_0Test test = new Memory_0Test("Test class");

}
		/**
* Gets the total size of the memory.
*
*/
@Test public void sizeTest() {
assertEquals(0, Memory.size());
}

/**
* Gets the total size of memory.
* This method does not take care about errors.
*
* @return total size
*/
@Test public void size_is_OK() {
	assertEquals(64, Memory.size());
}

/**
* Add the next section of memory.
* This method does not take care about errors.
*
* @param address
*/
@Test public void addMemoryPartTest4(int address) {
	assertEquals(Memory.size(), Memory.size() + 1);
	assertEquals(Memory.size(), Memory.get(address));
	List<MemoryArray> newArrays = new ArrayList<MemoryArray>();
	newArrays.add(new MemoryArray(address, 4));
	assertEquals(Memory.addMemoryArray("newArray", newArrays), Memory.size());
}

/**
 *
* addMemoryArrayTest2 add a memory array.
* This does not take care about errors.
*
* @param address
*/
@Test public void addMemoryArrayTest2(int address) {
	assertEquals(Memory.size(), Memory.size() + 1);
	assertEquals(Memory.size(), Memory.get(address));
	List<MemoryArray> newArrays = new ArrayList<MemoryArray>();
	List<MemoryArray> oldArrays = Memory.getMemoryArrays();
	newArrays.add(new MemoryArray(address, 8));
	oldArrays.add(new MemoryArray(address, 4));
	Memory.addMemoryArray("newList", newArrays);
	Memory.addMemoryArray("oldList", oldArrays);
	assertEquals(Memory.getMemoryArrays(), Memory.getMemoryArrays() +
		ArrayList.class.getCanonicalName());
}

/**
 * Get the total size of available memory for the computer.
 *
 * @return total size of available memory.
 */
@Test public void addMemoryArrayTest() {
	assertEquals(Memory.size(), Memory.size());
}
}
}