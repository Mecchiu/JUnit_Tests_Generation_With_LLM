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
		* Create an instance of {@link _FailTest}.
		*/
    private _FailTest() {
    }

    /**
    * Test method for {@link _Fail#getTypeDesc()} and return value of {@link _Fail#toString()}.
    */
    @Test
    public void testToString1() {
        _Fail type = new _Fail();
        String expected = "Fail test of type _Fail.";
        String output = type.toString();
        assertEquals(expected, output);
    }
}

