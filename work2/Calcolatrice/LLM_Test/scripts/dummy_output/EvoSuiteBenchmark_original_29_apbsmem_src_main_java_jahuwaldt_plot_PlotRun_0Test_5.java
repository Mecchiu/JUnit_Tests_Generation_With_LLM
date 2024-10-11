// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains one unit test case for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {
		{
			Plot run = new Plot();
			run.addData(new PlotDatum(
				(String) null,
				(String) null
			), Color.black);
			run.addData(new PlotDatum(
				(String) null,
				(String) null
			), Color.black);
			run.addData(new PlotDatum(
				(String) null,
				(String) null
			), Color.black);
			run.addData(new PlotDatum("Data 4", "Data 4"), Color.yellow);
			run.addData(new PlotDatum("Data 3", "Data 3"), Color.yellow);
			run.addData(new PlotDatum("Data 2", "Data 2"), Color.green);
			run.addData(new PlotDatum("Data 1", "Data 1"), Color.orange);
			run.addData(new PlotDatum("Data 0", "Data 0"), Color.red);
			run.addData(new PlotDatum("Data 8", "Data 8"), Color.magenta);
			run.addData(new PlotDatum("Data 7", "Data 7"), Color.orange);
			run.addData(new PlotDatum("Data 6", "Data 6"), Color.blue);
			run.addData(new PlotDatum("Data 5", "Data 5"), Color.yellow);
			run.addData(new PlotDatum("Data 4", "Data 4"), Color.yellow);
			run.addData(new PlotDatum("Data 3", "Data 3"), Color.green);
			run.addData(new PlotDatum("Data 2", "Data 2"), Color.green);
			run.addData(new PlotDatum("Data 1", "Data 1"), Color.orange);
		}
}