package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  Joseph A. Huwaldt  </p>
 *
 * @author Joseph A. Huwaldt   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Returns the PlotDatum object at the specified position
     *  in this run.
     *
     * @param index The index of the plot data object to return.
     * @return The PlotDatum object at the specified position
     *           in this run.
     */
    public Object get(int index) {
        return data.get(index);
    }
}
