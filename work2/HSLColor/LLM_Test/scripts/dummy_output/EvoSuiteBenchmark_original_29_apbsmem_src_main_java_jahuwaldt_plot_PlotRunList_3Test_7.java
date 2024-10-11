// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {
		    static String[]  l1 = {
   "<plot_3.1  XAxis  XType = XAxis.XMIN  YType = YAxis.YMIN  Label = \"yMin\"  />",
    "<plot_3.1  XAxis  XType = XAxis.XMAX  YType = YAxis.YMAX  Label = \"yMax\"  />",
   "<plot_3.1 XAxis  XType = XAxis.XMIN  YType = YAxis.YMIN  Label = \"yMin\"  />"
    };

		    static String[]  l2 = {
   "<plot_3.2  XAxis  XType = XAxis.XMIN  YType = YAxis.YMAX  Label = \"yMax\"  />",
    "<plot_3.2 XAxis  XType = XAxis.XMAX  YType = YAxis.YMIN  Label = \"yMin\"  />"
    };

		    static String[]  l3 = {
   "<plot_3.3  XAxis  XType = XAxis.XMIN  YType = YAxis.YMAX  Label = \"yMax\"  />",
    "<plot_3.3 XAxis  XType = XAxis.XMAX  YType = YAxis.YMIN  Label = \"yMin\"  />"
    };

		    static String[]  l4 = {
   "<plot_3.4  XAxis  XType = XAxis.XMIN  YType = YAxis.YMAX  Label = \"yMax\"  />",
    "<plot_3.4 XAxis  XType = XAxis.XMAX  YType = YAxis.YMIN  Label = \"yMin\"  />"

   };

		    static String[]  l5 = {
   "<plot_3.5  XAxis  YType = YAxis.YMIN  Label = \"yMin\"  />",
    "<plot_3.5  XAxis  YType = YAxis.XMAX  Label = \"yMax\"  />"

   };


    @Test
    void test_empty_input() {
    assertArrayEquals(l1, null);
    assertArrayEquals(l2, null);
    assertArrayEquals(l3, null);
    assertArrayEquals(l4, null);
    assertArrayEquals(l5, null);
    }

  @Test
    void test_input_order() {
    assertArrayEquals(l1, l1);
    assertArrayEquals(l2, l2);
}
}