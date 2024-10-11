// BinaryCalculate_0Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#addBinary(String, String)} method.
*/
class BinaryCalculate_0Test {
/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* @throws Exception If the test failed for some other reason.
*/
    @Test
    public void oneUnitTest() throws Exception {
        // System.out.println("addBinary " + this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, ""));
        assertEquals("addBinary 123/", this.addBinary(123, ""));
        assertEquals("addBinary 0/0", this.addBinary(0, ""));
        assertEquals("addBinary 0/0", this.addBinary(0, ""));
        assertEquals("addBinary 123/", this.addBinary(123, ""));
        assertEquals("addBinary 123/", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
    }
}

/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* The test methods will run when a binary calculation fails.
*/
class BinaryCalculate_1Test {
		/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* @throws Exception When the calculation failed.
*/
    @Test
    public void oneUnitTest2() throws Exception {
        //System.out.println("addBinary " + this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/", this.addBinary(123, ""));
        assertEquals("addBinary 123/", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
    }
}

/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* The test methods will run when a binary calculation fails.
*/
class BinaryCalculate_2Test {
        /**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* The test methods will run when a binary calculation fails.
*/
    @Test
    public void oneUnitTest3() throws Exception {
            //System.out.println("addBinary " + this.addBinary(123, "456"));
            try {
                assertEquals("addBinary 123/456", this.addBinary(123, "456"));
                // We expect an Exception here
                fail("An Exception is expected");
            } catch (Exception ex) {
            }
        }
}

/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* The test methods will run when a binary calculation fails.
*/
interface BinaryCalculate {
    public String addBinary(String num1, String num2);
}

/**
* Unit test for {@link BinaryCalculate#addBinary(String, String)}.
* The test methods will run when a binary calculation fails.
*/
public class BinaryCalculate_0_1_2_Test extends BinaryCalculate_0Test {
//     Unit test for {@link BinaryCalculate#addBinary(String, String)}.
//     private Unit test;

    public  BinaryCalculate_0_1_2_Test() {
        //System.out.println("BinaryCalculate_0_1_2_Test");
        super();
    }

    static String addBinary(String num1, String num2) {
        //System.out.println("BinaryCalculate_0_1_2_Test addBinary " + num1 + " " + num2);
        return num1 + " + "+ num2;
        //return this.num1 + " + "+ this.num2;
    }

    {
    //System.out.println("BinaryCalculate_0_1_2_Test start");
    }

    @Test
    public void oneUnitTest() throws Exception {
        //System.out.println("addBinary " + this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/", this.addBinary(123, ""));
        assertEquals("addBinary 123/0", this.addBinary(0, ""));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        assertEquals("addBinary 123/456", this.addBinary(123, "456"));
        // System.out.println("addBinary " + num1 + " + num2 + " + num1 + " + num2);
        assertEquals( "addBinary " + this.num1 + "/" + this.num2,
                this.addBinary(num1, num2) );
        assertEquals( "addBinary " + this.num1 + "/" + num2,
                this.addBinary(num1, num2) );
        assertEquals( "addBinary " + this.num1 + "/0", this.addBinary(0, num2));
        assertEquals( "addBinary " + this.num1 + "/456", this.addBinary(123, num2));
        assertEquals( "addBinary " + this.num1 + "/", this.addBinary(0, ""));
        assertEquals( "addBinary "+ this.num1 + "/0", this.addBinary(0, num2));
        assertEquals( "addBinary "+ this.num1 + "/", this.addBinary(123 * 2 + "", "456"));
        assertEquals( "addBinary "+ this.num1 + "/", this.addBinary(123.0, ""));
    }


} 

