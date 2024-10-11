// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains one unit test case for the {@link PlotRunList#size()} method.
*/
class PlotRunList_0Test {

    /**
     *  Sets up the test.
     */
    @BeforeClass
    public static void setUpClass () {
    }
    
    // Tests
    @Test
    public void oneRun() {
        // Set up array of empty Run objects.
        Run[] arrayRuns = new Run[0];
        // Set up array of PlotDatum objects.
        Run[] arraySizes = new Run[0];
        // Set up array of PlotDimensions objects.
        PlotDimensions[] arrayDimensions = new PlotDimensions[0];
        // Set up array of PlotDatum objects.
        PlotDatum[] arrayMisc = new PlotDatum[0];
        // Set up array of PlotRun objects.
        Run[] arrayTests = new Run[0];

        // Set run size for array elements.
        arraySizes[0] = new Run_TEST();
        arraySizes[0].setSize(100);
        
        // Set run dimensions for array elements.
        arrayDimensions[0] = new PlotDimensions((float)(0.025*1000.0));
        arrayDimensions[0].setSize(100.0);
        
        // Set run metadata.
        arrayDimensions[0].setType(PlotDimensions.METADATA);
        arrayDimensions[0].setTickLabelFormat((String)null);
        arrayDimensions[0].setXTickLabelFormat((String)null);
        arrayDimensions[0].setYTickLabelFormat((String)null);
        arrayDimensions[0].setZTickLabelFormat((String)null);
        arrayDimensions[0].setXLabelFormat((String)null);
        arrayDimensions[0].setYLabelFormat((String)null);
        arrayDimensions[0].setZLabelFormat((String)null);
        
        // Set run size for array elements.
        arrayRuns[0] = new Run_TEST();
        arrayRuns[0].setSize(100);

        // Set runs for array elements.
        arrayTests[0] = new Run();
        arrayTests[0].setSize(100.0);

        // Set runs for array elements.
        arrayTests[0].setPlots(0,arrayRuns);
        arrayTest_1Case(arrayTests);

        // Set runs for array elements.
        arrayTests[0].setPlots(1,arraySizes);
        arrayTest_2Cases(arrayTests);

        // Set runs for array elements.
        arrayTests[0].setPlots(1,arrayDimensions);
        arrayTest_3Cases(arrayTests);
                
        // Set runs for array elements.
        arrayTest_4Cases(arrayTests);
    }

    private void arrayTest_1Case(
            Run[] runs) {
        // Set up array of array objects for Array.java
        Run[] array = new Array();
        // Set up array of run sizes for Array.java
        Run[] runSizes = new Run[0];
        
        // Set up array of array objects for Array.java
        array = new Array(runs);
        // Set up array of run sizes for Array.java
        runSizes = new Run[0];
        // Set up array of array objects for Array.java
        array = new Array(runs);
        // Set up run sizes for array objects for Array.java
        runSizes = new Run[0];
        
        // Set run sizes for array elements.
        runSizes[0] = new Run_TEST();
        runSizes[0].setSize(100);
        
        // Set array of run sizes for Array.java
        arraySizes = new Run[0];
        // Set array of runs for array elements.
        arraySizes[0] = new Run();
        arraySizes[0].setSize(100);
        
        // Set array of runs for array elements.
        arrayRuns = new Run[] {array[0],array[0],array[0],array[0]};
        // Set array of runs for array elements.
        arrayTests = new Run[] {array[2],array[1],array[0]};
        
        assertEquals(runs.length, arraySizes.length);
        for (int i = 0; i < runs.length; i++) {
            assertNotNull(arraySizes[i]);
            assertNotNull(arrayRuns[i]);
            // Set runs and array runs at same test case.
            runs[i].setSize(arraySizes[i].size());
            array[i].setSize(arraySizes[i].size());
            // Loop over array runs
            for (int j = 0; j < arrayRuns[i].size(); j++) {
                assertNotNull(arraySizes[i].get(j));
                assertNotNull(arrayRuns[i].get(j));
                // Set runs and runs at same test case.
                arrayRuns[i].get(j).setSize(arraySizes[i].get(j));
                array[i].get(j).setSize(arraySizes[i].get(j));
                // Test runs.
                runSizes[i].get(j).setSize(arraySizes[i].get(j));
                arraySizes[i].get(j).setSize(arraySizes[i].get(j));
            }
        }
    }

    /* ********* runSizes[i] is null && runs[i] is defined ********* */
    private void arrayTest_2Cases(
            Run[] runs) {    
        // Set up array of array objects for Array.java
        Run[] array = new Array();
        // Set up array of run sizes for Array.java
        Run[] runSizes = new Run[0];
        
        // Set up array of array objects for Array.java
        array = new Array(runs);
        // Set up array of run sizes for Array.java
        runSizes = new Run[0];
        // Set up array of array objects for Array.java
        array = new Array(runs);
        // Set up run sizes for array objects for Array.java
        runSizes = new Run[0];
        
        // Set runs for array elements.
        runSizes[0] = new Run_TEST();
        runSizes[0].setSize(100);
        
        // Set array runs in runs.
        array[0].setRuns(runs);
//        assertEquals(arrayRuns[0].size(),runSizes.length);
        
        // Set array runs in runs.
        array[1].setRuns(array[2]);
       

    }
    
    /* Set up an array of array objects for Array.java. */
    private static class Array implements Cloneable {
        
        // Setup an array of array objects for Array.java
        Array() {
        }
        
        public Object clone() {
            Array array = new Array();  
            array.setRuns(getRuns());
            return array;  
        }

        public int size() {
            return getRuns().size();
        }

        public Object get(int index)
            throws ArrayIndexOutOfBoundsException {
        
            if (index < 0