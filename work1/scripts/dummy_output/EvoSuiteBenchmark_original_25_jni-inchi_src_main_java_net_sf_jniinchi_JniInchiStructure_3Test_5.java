// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		
    /**
     * Gets atom from structure.
     * This method is tested by: 
     * <ul>
     *  <li>{@link JniInchiStructure_1Test_1}</li> 
     *  <li>{@link JniInchiStructure_1Test_2}</li>
     * </ul>
     * 
     */
    @Test
    public void getAtom() throws Exception {
	
		// Test method: org.junit.jupiter.api.extension.ExtensionContext.getNestedComponent(ComponentNameName)
		ComponentName inchiClass = new Plugin() {};
		ComponentNameName name = new ComponentNameName(null, inchiClass.toString());
		
		// Test method: net.sf.jniinchi.JniInchiStructure.getAtom(int)
		JniInchiStructure_1Test_1 test = new JniInchiStructure_1Test_1();

		// Run code under test
		JniInchiStructure inchiStructure = test.getAtom(12);
		
		// Verify the returned structure
		assertNotNull(inchiStructure);
        test.assertEqualStructure(
                "{}\n",
                inchiStructure.getNestedName() + "\n",
                "{}\n");

        // Test method: net.sf.jniinchi.JniInchiStructure.getAtom(javainc)
        ArrayList<JniInchiStructure> inchi = new ArrayList();
        test.assertEqualStructure(
                "{}",
                "{}\n\n",
                "{}",
                "{}",
                "{}");
        
        inchi.add(test.getAtom(15));
		
		assertEquals(5, inchi.size());
		inchiStructure.getNestedName("2");
		testStructure = inchiStructure.getAtom(2);
		inchi = list(testStructure);
		assertEquals(2, inchi.size());
		testStructure = inchi.get(0);
		assertEquals(2, inchi.indexOf(testStructure));	
		testStructure = inchi.get(2);
		assertEquals(8, inchi.indexOf(testStructure));
	}
	
	@Test
	public void testStructureGetAtom() throws Exception {
		
		// Test method: org.junit.jupiter.api.extension.ExtensionContext.getNestedComponent(ComponentNameName)
		ComponentName name = new Plugin() {};
		ComponentName name1 = new ComponentNameName(null, "JniInchiStructure-Test-2");
		name1.putNestedName("JniInchiStructure-Test-2");
		
		// Test method: net.sf.jniinchi.JniInchiStructure.getAtom(int)
		JniInchiStructure inchiStructure = new JniInchiStructure(name);
		int testID = 0;
		try {
			testID = getAtom(1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// Verify not supported
		assertNull(testID);
		
		// Test method: net.sf.jniinchi.JniInchiStructure.getAtom(javainc)
		ArrayList<JniInchiStructure> inchi = new ArrayList();
		JniInchiStructure_3Test test = new JniInchiStructure_3Test();
		inchi.add(test.getAtom(3));
		inchi.add(test.getAtom(2));
		
		testStructure = test.getAtom(3);
		assertEquals(2, inchi.indexOf(testStructure));
		testStructure = test.getAtom(2);
		assertEquals(6, inchi.indexOf(testStructure));
		
		testID = getAtom(2);
		assertEquals(6, inchi.indexOf(testID));
		
		name = new ComponentNameName(null, "JniInchiStructure-Test-3");
		name1.putComponent(name);
		testStructure = inchi.get(0);
		testStructure = inchi.get(2);
		test.assertEqualStructure(
                "{}",
                "{}",
               "{}",
               "{}",
                "{}");
                
	}
}
 
// JniInchiStructure_1Test_1.java