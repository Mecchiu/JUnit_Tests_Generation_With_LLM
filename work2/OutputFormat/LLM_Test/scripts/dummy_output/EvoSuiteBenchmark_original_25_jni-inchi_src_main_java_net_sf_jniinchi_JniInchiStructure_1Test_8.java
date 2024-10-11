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
     * Tests if the implementation of {@link JniInchiStructure#addBond(JniInchiBond)} works properly.
     * @throws Exception
     */
    @Test
    void addBondTest(){
        JniInchiStructure object = new JniInchiStructure();
        // Add one bond
        object.addBond(new JniInchiBond(1));
        // Make sure the added bond remains 1
        object.addBond(new JniInchiBond(1));
        // Make sure the added bond remains 1
        JniInchiBond result = object.addBond(new JniInchiBond(2));
        assertEquals("bond 1 should be added",2, result.getBond().getBondNumber());
    }

	@Test
	void addBondWithNegativeIndex_Test(){
		JniInchiStructure object = new JniInchiStructure();
		try{
			// Add one bond with invalid index (-1)
            object.addBond(new JniInchiBond( -1 ));
		}catch ( IllegalArgumentException e ){
			assertEquals("invalid index (-1) is invalid for a non-empty list of bonds",
                    1 , object.getTotalBonds().size());
			return;
		}    
		assertEquals("invalid index (-1) should throw an exception", null, object.getTotalBonds().get(0));
	}


}