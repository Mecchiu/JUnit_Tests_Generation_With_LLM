// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {
		static final Map COLOR_1_MAP = new LinkedHashMap();
		static {
				COLOR_1_MAP.put("RED", new Color(255, 0, 0));
				COLOR_1_MAP.put("BLUE", new Color(0, 255, 0));
				COLOR_1_MAP.put("GREEN", new Color(0, 0, 255));
				COLOR_1_MAP.put("ORANGE", new Color(255, 0, 128));
				COLOR_1_MAP.put("WHITE", new Color(255, 255, 255));
				COLOR_1_MAP.put("YELLOW", new Color(255, 0, 255));
				COLOR_1_MAP.put("DODGER", new Color(205, 100, 50));
				COLOR_1_MAP.put("LIGHT_BLUE", new Color(102, 205, 50));
				COLOR_1_MAP.put("LIGHT_GREEN", new Color(154, 205, 50));
				COLOR_1_MAP.put("GOLDENROD", new Color(128, 128, 0));
				Color[] colors = new Color[5];
				colors[0] = new Color(192, 192, 128, 128);
				colors[1] = new Color(128, 128, 128, 128);
				colors[2] = new Color(64, 64, 64, 128);
				colors[3] = new Color(0, 0, 128, 128);
		if (GraphicsEnvironment.isHeadless()) {
					COLOR_1_MAP.put("BLACK", Color.BLACK);
			}
			}

    static {
		System.setProperty(
                "java.util.Collections$UnmodifiableMap",
                "java.util.Collections$UnmodifiableMap");
	}

    
    /**
     *  Make a run list by iterating all the specified run values
     *  and modifying the run list in-place.
     */
}