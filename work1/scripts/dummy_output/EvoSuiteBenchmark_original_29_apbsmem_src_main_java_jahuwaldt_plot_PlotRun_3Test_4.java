// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {
		/**
		*  This class tests the constructor of {@link PlotRun}.
		*/
    static class PlotRun_3TestConstructor extends PlotRun_3Test {
    };

    /**
     *  This class tests the {@link PlotRun#add(Object)} method.
     */
    static class PlotRun_3TestAdd extends PlotRun_3Test {
        static double expectedX = 1;
        static double expectedY = 2;

        static PlotRun_3TestAdd() throws Exception {
            expectedX = 1;
            expectedY = 4.5;
        }

		protected void setUp() throws Exception {
			expectedX = 1000;
			expectedY = 1.345345;
        };

        protected void testAdd(double x) throws Exception {
            super.testAdd(x);
        }
    };

    /**
     *  This class tests the {@link PlotRun#add(Object)} method.
     */
    static class PlotRun_3TestAdd1 extends PlotRun_3Test {
        static double x = 4.5;
        static double y = 5.5;

        static PlotRun_3TestAdd1() throws Exception {
            expectedX = 4.5;
            expectedY = 5.5;
        }

		protected void testAdd(double expectedX, double expectedY) throws Exception {
            super.testAdd(expectedX, expectedY);
        }
    };

    /**
     *  This class tests the {@link PlotRun#set(int, Object)} method.
     */
    static class PlotRun_3TestSet extends PlotRun_3Test {
        static double expectedX = 1000;
        static double expectedY = 1000;

        static PlotRun_3TestSet() throws Exception {
            expectedX = 1000;
            expectedY = 1000;
        }

		protected void testSet(double expectedX, double expectedY) throws Exception {
            super.testSet(expectedX, expectedY);
        }
    };

}