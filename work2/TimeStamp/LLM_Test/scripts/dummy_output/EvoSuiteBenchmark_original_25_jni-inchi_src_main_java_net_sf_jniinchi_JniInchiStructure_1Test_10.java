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
     * This method demonstrates how {@link JniInchiStructure} can add bonds to an inchi molecule.
     */
    @Test
    public void test_addBond() {				
   
        List<JniInchiBond> bonds = new ArrayList<>();
        bonds.add(newJniInchiBond("B"));
        
        List<String> bds = new ArrayList<>();
        jniInchiBond.setBonds(bonds);

        String bd1, bd2;
                  
        bd1 = "\n";
        bd2 = "\n";
        
        assertEquals(bond.getBonds(), jniInchiBond.getBonds());
        assertEquals(bond, newJniInchiBond(bond.getBond()));
    }
	
	private jniInchiBond newJniInchiBond(String bondString) {

    	jniInchiBond bond = newJniInchiBond(bondString);		

    	return bond;
    }
	
	private jniInchiBond newJniInchiBond(String bond) {

   	jniInchiBond bond = new JniInchiBond(bond);		
	  
		byte[] bytes = bond.getBytes();
		
	  	assertNotNull(bytes);
		return bond;
    }

    /**
     *
     */
}