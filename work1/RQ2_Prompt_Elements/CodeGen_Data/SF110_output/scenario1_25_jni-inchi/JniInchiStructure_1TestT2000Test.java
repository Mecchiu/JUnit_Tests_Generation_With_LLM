// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {

    /**
     * This instance test has been placed in a separate test class to
     * minimize class repetition, as some of the instances hold references
     * to jniinchi object instances.
     */
    public static class JniInchiStructure_1TestInst extends JniInchiTest {
		
        @Test
        void addBondsTest() {
            JniInchiBond[] expectedResult = new JniInchiBond[] {
                JniInchiBond.fromInchiString("0d4af077"),
                JniInchiBond.fromInchiString("0d6b9c1d"),
                JniInchiBond.fromInchiString("0d2b3a8b"),
                JniInchiBond.fromInchiString("0d3a8b6b"),
                JniInchiBond.fromInchiString("0d4bf3a7"),
                JniInchiBond.fromInchiString("0d0e6ce6"),
                JniInchiBond.fromInchiString("0d5dacbc"),
                JniInchiBond.fromInchiString("0d2a8b6b"),
                JniInchiBond.fromInchiString("0d4aec69"),
                JniInchiBond.fromInchiString("0d849a4b"),
                JniInchiBond.fromInchiString("0d4a4b6b")
            };
            
            ArrayList<JniInchiBond> actualResult = new ArrayList<>();
            JniInchiStructure.addBonds(actualResult);
            assertEquals(expectedResult.length, actualResult.size());
            assertTrue(actualResult.containsAll(expectedResult));    
            
            assertSame(expectedResult, actualResult);
        }

        @Override
        protected JniInchiStructureTest suite() {
            return new JniInchiStructureTest();
        }
		
        static class JniInchiStructureTest extends JniInchiStructureTest {
		}
		
    }
	
}
// JniInchiStructure_1Test.java