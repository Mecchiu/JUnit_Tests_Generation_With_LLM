// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_2Test {
		public static final long	MIN_X = 0;		// min X value of data
		public static final long	MAX_X = 200000;	// max X value of data
		public static final long	MIN_Y = 0;		// min Y value of data
		public static final long	MAX_Y = 200000;	// max Y value of data
		public static final long	MIN_N = 10000000; // min number of data
		public static final long	MAX_N = 2000000;  // max number of data
		enum TYPE {
				SINGLE,										// single point
				MULTI
		};

	    AbstractList data = new ArrayList();

	    public PlotRun_2Test() throws Exception {
	        createRun(new double[]{MIN_X,MAX_X,MIN_Y,MAX_Y,MIN_N,MAX_N,MIN_X-1,MAX_X-1}, TYPE.SINGLE);
	    }

	    public void check(Collection run)throws Exception {
}
}