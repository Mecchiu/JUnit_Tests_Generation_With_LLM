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
     *  Return an enumeration of all the series in this run.
     *
     * @return    An enumeration of all the PlotDatum objects in this run.
     * @see Graph_3Test
    */
    public Iterator iterator();
}


//  test class for PlotRun_3Test

class PlotRun_3Test1 extends AbstractList{

    /**
     *  @see PlotRun_3Test
     *  @deprecated
     */
    @Deprecated
    public Iterator iterator();
    
    /**  Return an enumeration of all the PlotDatum objects in this run.
    */
    public Iterator iterator();
}

//  test class for plotrun_3test1

class  test_3_Run1 extends AbstractList {
    
    /**
     *  @see test_3_Run1
     */
    public Iterator iterator();
    
}


/** Test class of {@link PlotRun}.  It contains both unit tests and test cases
 *  for all the subclasses and subclasses.
 */ 
public class PlotRunTest extends junit.framework.TestCase {

    /** */
    public PlotRunTest(String testName) {
        super(testName);
    }

    /** */
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    /**
     *  @see test_3_Run1
     */
    @Test
    public void test_3_Run1() {
        PlotRun run1  =  new PlotRun_3_Run1();
        run1.run();
        run1.run();
    }
}



