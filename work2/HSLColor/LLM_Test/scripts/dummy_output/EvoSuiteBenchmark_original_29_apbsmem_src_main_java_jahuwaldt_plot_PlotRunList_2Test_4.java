// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {
		/**
		*  Test class of PlotRun objects added to the PlotRunList.
		*  
		*/
    private static class PlotRun implements Cloneable {
        private String name;
        private long position;
        private double time;

        /**
        *  Returns a clone of the PlotRun object.
        */
        private PlotRun clone() {
            return(new PlotRun(this));
        }

        /**
        *  Returns a PlotRun object from a string.
        *  
        *@param   string The string to evaluate.
        *@return  Returns a PlotRun object from the specified string.
        */
        private PlotRun fromString(String string) {
            PlotRun obj = (PlotRun) clone();
            obj.name = string;
            obj.position = Integer.parseInt(string);   //  this.position is already defined.
            obj.time = Double.parseDouble(string);
            ;     
            return(obj);
        }

        /**
        *  Returns the string representation of this PlotRun object.
        */
        private String toString() {
            return("  name: "+getName()+"\n  position: "+getPosition()+"\n  time: "+getTime());
        }

        /**
        *  Returns the number of plots run object.
        *  
        */
        private int size(){
            return (this.clone().size());
        }

        /**
        *  Inserts the specified plot run at the specified position in this
        *  run list.
        *  
        *  @param   index The index at which the new plot run is
        *                                   to be inserted.
        *  @param   element The new plot run to be inserted.
        *  @throws ClassCastException - if the specified element is not a
        *                                PlotRun object.
        */
        private void add(int index, Object element) throws ClassCastException {
            this.clone().add(index, element);
        }

        /**
        *  Adds the specified PlotRun objects to this run list
        * 
        *  @param   value The values of the PlotRun objects to add.
        */
        private void add(double value) {
            this.clone().add(value);
        }

        /**
        *  Returns the name of this PlotRun object.
        */
        private String getName() {
            return(this.name);
        }

}
}