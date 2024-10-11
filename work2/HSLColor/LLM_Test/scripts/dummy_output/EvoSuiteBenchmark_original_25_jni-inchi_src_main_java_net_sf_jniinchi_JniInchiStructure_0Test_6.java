// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {
		
	/**
	 * Test add atom method.
	 *
	 * @throws Exception exception thrown by the unit test
     */
    @Test
    public void testAddAtom() throws Exception {

        test("addAtom", JniInchiStructure.ADD_ATOM, JniInchiStructure.JNI_ATOM, "addAtom()");

        test("addAtom", JniInchiStructure.ADD_ATOM, JniInchiStructure.INT_ARG, "addAtom(int parameter)");
		
    }
	
	/**
	 * Test get atoms method.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetAtoms() throws Exception {
        test("getAtoms", JniInchiStructure.GET_ATOMS, JniInchiStructure.JNI_ARRAY, "getAtoms()");
    }

	
	/**
	 * Test get the atom count method.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetCount() throws Exception {
        test("getCount", JniInchiStructure.GET_COUNT, JniInchiStructure.JNI_INT, "getCount");
    }

	/**
	 * Test get a list of atoms.
	 *
	 * @throws Exception exception thrown by the unit test
     */
    @Test
    public void testGetAtomsList() throws Exception {
        test("getAtomsList", JniInchiStructure.GET_ATOMS_LIST, JniInchiStructure.JNI_ARRAY, "getAtomsList()");
    }

	/**
	 * Test is there a atom.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testIsThereATom() throws Exception {
        test("isThereATom", JniInchiStructure.IS_HAS_ATOM, "isThereATom(char*)");
    }

	/**
	 * Test is there a list of atoms.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testIsHasATomList() throws Exception {
        test ("isHasATomList", JniInchiStructure.IS_HAS_ATOM_LIST, "isHasATomList(const char*)");
    }

	/**
	 * Test first get a atom by position.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetATomByPosition() throws Exception {
        test("getATomByPosition");
    }

	/**
	 * Test get a list of atoms.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testAtomsList() throws Exception {
        test("AtomsList");
    }

	/**
	 * Test get a list of atoms.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetAtomList() throws Exception {
        test("GetATomList");
    }
	
	/**
	 * Test get an array view of the list of atoms.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetAtomArrayView() throws Exception {
        test("GetATomArrayView");
    }
	
	/**
	 * Test find atom by it's position.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testFindATombyPosition() throws Exception {
        test("findATombyPosition");
    }
	
	/**
	 * Test get atom by its name.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testGetATomByName() throws Exception {
        test("getATomByName");
    }
	
	/**
	 * Test is there a atom.
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	@Test
    public void testIsHasATom() throws Exception {
        test("IsHASATom");
    }
	
//	/**
//	 * Test is there a list of atoms.
//	 *
//	 * @throws Exception exception thrown by the unit test
//     */
//	@Test
//    public void testIsHasATomList() throws Exception {
//        test("IsHASATomList");
//    }

	/**
	 * Gets a list of atoms
	 *
	 * @throws Exception exception thrown by the unit test
	 */
	private void test(String methodName, int index) throws Exception {
        test(methodName, index, JniInchiStructure.JNI_ARRAYS,
           "getListOfAToms of JniInchiStructure.JNI_ARRAYS");
	}

	/**
	 * 
	 * @throws Exception Exception thrown by unit test.
	 */
    private void test(String methodName, int index, String returnType,
            String methodReturnType,
            String testMessage) throws Exception {
        test(methodName, index, returnType, methodReturnType, testMessage,
           "getListOfAToms of (" + returnType + ", int) " + methodReturnType);
    }

    /**
	 * 
	 * @throws Exception Exception thrown by unit test.
	 */
    private void test(String methodName, int index, String returnType,
            String methodReturnType, String testMessage,
            String testMessageFormat, String testData) throws Exception {
        
		List<String> list = new ArrayList<String>();
		
		test("GetListOfAToms of (" + returnType + ", int) " + methodReturnType);
		
		List<String> listOfAtoms = ((List<String>)this.get("listOfAToms")).clone();
		listOfAtoms.get(index).append(returnType);
		list.add(listOfAtoms.toString());
		
		list = JniInchiStructure.getListOfAToms(
			testData.split("\\s(?!\\s)+", -1), returnType, index);
		
		assertNotNull("listOfAToms should not be null", list);
		assertNotNull("returnType should not be null", list.get(index));
		assertNotNull("method returnType should not be null", list.get(index));
		
		assertEquals("wrong number of items of listOfAToms", list.size(),
					list.size() -1);
		
		if (!list.contains(returnType) ||!list.contains(methodReturnType)) {
			
			fail("listOfATOMS must be properly returned.");
		}
		
		assertEquals("indexOfATom", index, list.indexOfValue(returnType));
		assertEquals("indexOfATom", index, list.indexOfValue(returnType));
		assertEquals("indexOfATom", index, list.indexOfValue(index));
		
		List<JniInchiAtom> listOfATomsNew = new ArrayList<JniInchiAtom>();
}
}