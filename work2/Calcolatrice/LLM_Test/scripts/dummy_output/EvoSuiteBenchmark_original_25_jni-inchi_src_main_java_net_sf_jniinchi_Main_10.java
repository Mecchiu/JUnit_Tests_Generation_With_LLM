// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#getTestMolecule()} method.
*/
class MainTest {
		
    private final JniInchiStructure test = getTestMolecule();
    private final JniInchiStructure expectResultM =
        new JniInchiStructure("test result");
        
    /**
     * Test setter for mainTest.
     * Method uses the provided test, by using a call to
     * "getTestMolecule()".
     */
    public static void testSetter() {
        getTestMolecule().set(test);
    }
    
    @Test
    public void testStrictMain() {
        assertEqualMolecule(test, expectResultM, true);
    }
    

    @Test
    public void testNestedStrictMain() {
        testSetter();
        expectResultM.set(test);
        testSetter();
        assertEqualMolecule(test, expectResultM);
    }
    
    @Test
    public void testWeakMain() {
        getTestMolecule().set(test.set(test));
        test.set(expectResultM, true);
        expectResultM.set(test);
        
        assertEqualMolecule(test, expectResultM, true);
    }
    
    @Test
    public void testWeakNestedMain() {
        testSetter();
        expectResultM.set(test);
        testSetter();
        assertEqualMolecule(test, expectResultM, true);
    }
    
    @Test
    public void testHardMain() {
        getTestMolecule().set(test.set(test));
        test.set(expectResultM, false);
        expectResultM.set(test);
        
        assertEqualMolecule(test, expectResultM, false);
    }
    
    @Test
    public void testGetMain() {
        assertEqualMolecule(this.getTestMolecule(), test, true);
    }
    
    @Test
    public void testResetMain() {
        this.getTestMolecule().reset();
        assertEqualMolecule(this.getTestMolecule(), test, true);
    }
    
    //Test
    
    /**
     * Test method for {@link JniInchiStructure#getStrictMain()}.
     */
    @Test
    public void testStrictMain() {
        //Test
        assertEqualMolecule(getTestMolecule().getStrictMain(), test, true);
    }
    
    /**
     * Test method for {@link JniInchiStructure#getNestedStrictMain()}.
     */
    @Test
    public void testNestedStrictMain() {
        //Test
        assertEqualMolecule(getTestMolecule().getNestedStrictMain(), test);
    }
    
    /**
     * Test method for {@link JniInchiStructure#set(JniInchiStructure)}.
     */
    @Test
    public void testWeakMain() {
        //Test
        assertNotEqualMolecule(test.set(getTestMolecule()), null);
    }
    
    /**
     * Test method for {@link JniInchiStructure#set(JniInchiStructure)}.
     */
    @Test
    public void testNestedMain() {
        //Test
        assertEqualMolecule(test.set(expectResultM), null);
    }
    
    /**
     * Test method for {@link JniInchiStructure#harderGetMain()}.
     */
    @Test
    public void testHardMain() {
        //Test
        assertEqualMolecule(test.harderGetMain(), test, true);
    }
    
    /**
     * Test method for {@link JniInchiStructure#reset()}.
     */
    @Test
    public void testSoftReset() {
        expectResultM.reset();
        expectResultM.reset();
        
        assertEqualMolecule(expectResultM);
    }

}