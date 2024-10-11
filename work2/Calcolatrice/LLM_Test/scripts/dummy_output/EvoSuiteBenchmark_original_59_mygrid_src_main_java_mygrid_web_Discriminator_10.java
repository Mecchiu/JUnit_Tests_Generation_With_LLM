// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains one unit test case for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {
		
    /**
     * Test method for {@link Discriminator#getTypeDesc()}.
     */
    @org.junit.jupiter.api.Test
    public void testGetTypeDesc() {
        java.lang.String expected = "TypeDesc";
        Discriminator discriminator = new Discriminator();
        java.lang.String s = discriminator.getTypeDesc();
        // use new String methods when we allow changing the Java Object Type
        expected = String.class.getClass().getSuperclass().getTypeName();
        assertEquals('"' + s + "\"", expected);
    }

}