// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {
		/*
    * @Test
    * @Title: Test constructor
    * @Description: Method of {@link PlotDatum}.
    * @Assertion: The unit test of the constructor methods is performed.
    */
    @Test
    public void test_constructor() {
		/*
        * @Assertion: The constructor {@link PlotDatum#constructor()}
        * is called with a valid arguments.
        *
        */
        new PlotDatum(0.0, 0.0, 0.0);
        new PlotDatum(0.0, 1.0, 1.0);
        new PlotDatum(0.0, 2.0, 2.0);
        new PlotDatum(0.0, 3.0, 3.0);
        new PlotDatum(1.0, 1.0, 1.0);
        new PlotDatum(1.0, 2.0, 2.0);
        new PlotDatum(1.0, 3.0, 3.0);
        new PlotDatum(1.0, 4.0, 4.0);
        new PlotDatum(1.0, 5.0, 5.0);
        new PlotDatum(1.0, 6.0, 6.0);
        new PlotDatum(1.0, 7.0, 7.0);
        new PlotDatum(1.0, 8.0, 8.0);
    }

	/*
    * @Test
    * @Title: test setters
    * @Description: Methods with valid methods for all values of argument are implemented in subclasses of {@link PlotDatum_1Test}.
    * @Assertion: The setters of each method has been implemented for the arguments defined in the class, i.e.,
    *  - all three arguments are defined within the same class for the subclasses
    *    - a null argument is never defined in the subclasses
    *  - all three arguments are defined within the same class for the arguments inside the given class
    *    - a void argument is never defined in the arguments inside the given class
    */
    @Test
    public void test_set() {
        /*
        * @Assertion: The subclasses of this class can be set as values from the argument classes
        *      within the given class by calling this method.
        *
        */
    	assertEquals("Value in the class of argument '0' is incorrectly determined",
    		0, new PlotDatum_1Test().set(0.0, 0.0, 0.0));

    	assertEquals("Value in the class of argument '1' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 1.0, 1.0));

    	assertEquals("Value in the class of argument '2' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 2.0, 2.0));

    	assertEquals("Value in the class of argument '3' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 3.0, 3.0));

    	assertEquals("Value in the class of argument '4' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 4.0, 4.0));

    	assertEquals("Value in the class of argument '5' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 5.0, 5.0));

    	assertEquals("Value in the class of argument '6' is incorrectly determined",
    		0, new PlotDatum_1Test().set(1.0, 6.0, 6.0));

    	assertEquals("Value in the class of argument '7' is incorrectly determined",
    		null, new PlotDatum_1Test().set(1.0, 7.0, 7.0));

    	assertEquals("Value in the class of argument '8' is incorrectly determined",
    		null, new PlotDatum_1Test().set(1.0, 8.0, 8.0));
    }

    /**
    *  Constructors with null args have undefined behavior.
    */
    public static void assertNull(Object t, Object t1) {
        /*
        * @Assertion: The argument t will be undefined if this method is called on a class in which it is defined
        *        within the given class.
        *
        * @Assertion: The argument t1 will be undefined if this method is called on a class
        *        in which it is undefined within the given class.
        */
        assertEquals("The class defined by the method call is undefined",
        		0, new PlotDatum_1Test().set(null, null, null));
    }
}