// _FailTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Fail}.
* It contains one unit test case for the {@link _Fail#getTypeDesc()} method.
*/
class _FailTest {

    /**
     * Tests the {@link _Fail#getTypeDesc()} field.
     */
    @Test
    void field() {
        assertNotNull(new _Fail().getTypeDesc());
    }
}
