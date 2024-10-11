// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {
		static int NAMESPACE;
		static double XPRINT_0, YPRINT_0;
		static double ONE_SQRT;
		static double[] EXISTINGXY_PATTERN, NEWXY_PATTERN;
		static Color NEW_COLOR;
		
		@Test  // The original test data points: 
		public void Test1() throws Exception {
			NAMESPACE = 1;
		
			XPRINT_0 = (ONE_SQRT = getMaxX());
			yPRINT_0 = (ONE_SQRT = getMaxY());
			XPRINT_0 = NAMESPACE;
			NAMESPACE = 2;
			YPRINT_0 = (ONE_SQRT = getMaxY());
			NAMESPACE = 3;
			YPRINT_0 = NAMESPACE;
			XPRINT_0 = NAMESPACE;
			
			List dataList = new ArrayList();
			PlotDataIterator i = null;
}
}