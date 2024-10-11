// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {
@Test
    public void testGetTypeDesc() {
        assertEquals((java.lang.Object)_Progress.TYPE_DESC, _Progress.getTypeDesc());
    }
}
