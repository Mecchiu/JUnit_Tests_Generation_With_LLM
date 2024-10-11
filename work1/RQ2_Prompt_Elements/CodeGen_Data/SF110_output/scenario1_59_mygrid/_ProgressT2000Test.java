// _ProgressTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _Progress}.
* It contains one unit test case for the {@link _Progress#getTypeDesc()} method.
*/
class _ProgressTest {

    //Test methods

    /**
    * Test method for {@link mygrid.web._Progress#typeDesc()}.
    */
    @Test 
    public void testGetTypeDesc() {
        byte byteValue;
        byte shortValue;
        byte intValue;
        byte longValue;
        byte floatValue;
        byte doubleValue;

        // create Object
        byte b1;
        short s1;
        int i1;
        long l1;
        float f1;
        double d1;
        
        b1 = 123;
        s1 = 0x12;
        i1 = 124;
        l1 = 0x12L;
        f1 = 0.1f;
        d1 = 0.1D;

        // create Object
        byte b2;
        short s2;
        int i2;
        long l2;
        float f2;
        double d2;

        b2 = 123;
        s2 = 0x12;
        i2 = 124;
        l2 = 0x12L;
        f2 = 0.1f;
        d2 = 0.1D;

        // create
	  byte b3 = 7;
        short s3 = 7;
        int i3 = 7;
        long l3 = 7L;
        float f3 = 0.7f;
        double d3 = 0.7D;

        // create Object
        byte b4 = 7;
        short s4 = 7;
        int i4 = 7;
        long l4 = 7L;
        float f4 = 0.7f;
        double d4 = 0.7D;

        System.out.printf("\n--- %s %s ---\n", byteValue, shortValue);
        System.out.printf("%d", intValue);
        System.out.printf("%d", longValue);
        System.out.printf("%x", floatValue);
        System.out.printf("%.2f", doubleValue);

        // create
	  byte b5 = 7;
        short s5 = 7;
        int i5 = 7;
        long l5 = 7L;
        float f5 = 0.7f;
        double d5 = 0.7D;

        // create
	  byte b6 = 7;
        short s6 = 7;
        int i6 = 7;
        long l6 = 7L;
        float f6 = 0.7f;
        double d6 = 0.7D;

        try {
            // create
            byte b7 = 3;
            short s7 = 3;
            int i7 = 3;
            long l7 = 3L;
            float f7 = 3.0f;
            double d7 = 3.0D;

            // validate
        } catch (RuntimeException e) {
            assertTrue(false);
            e.printStackTrace();
        }
    }
}
