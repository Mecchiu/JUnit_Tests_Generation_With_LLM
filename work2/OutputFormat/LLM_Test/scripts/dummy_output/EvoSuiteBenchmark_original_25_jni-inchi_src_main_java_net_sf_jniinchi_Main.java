package net.sf.jniinchi;
java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void testGetTestMolecule() {
        JniInchiStructure structure = Main.getTestMolecule();
        assertNotNull(structure);
        assertEquals(6, structure.getNumAtoms());
        assertEquals(5, structure.getNumBonds());
        // Add more assertions as needed
    }

    // Add more test cases for other methods if needed

}
