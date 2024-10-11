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
/**
		* Verify that a list in the range of zero to 1
		* is returned when called with no limits specified as
		* the second element.
		*
		* @throws ClassCastException - if the second element of the run list
		*   is not a PlotRun type object.
		*/
	@Test
	void noLimit() {
		assertEquals(10, (int) ((double) PlotRun_1_noLimit.iterator().next()) / 100, 0);
	}
    /**
     * Verify that a list in the range of zero to 1
     * is returned when called with no limits specified as
     * the second element.
     *
     * @throws ClassCastException - if any element of the list is not a
     *                               PlotRun type object.
     */
    @Test
	void oneLimit() {
		assertEquals(1, (int) ((double) PlotRun_1_oneLimit.iterator().next()) / 100, 0);
	}
    /** Test case for {@link PlotRun_1_noLimit#iterator()} with no limit specified as a
     *  Run object.
     *
     *  @throws ClassCastException - if any element of the list is not a
     *                               PlotRun type object.
     */
    @Test
	void runNoLimit() {
		assertEquals(10, (int) ((double) new PlotRun_1_noLimit(new PlotRun_1_noLimit_Data())) / 100, 0);
	}
    /** Test case for {@link PlotRun_1_oneLimit#iterator()} with an
     *  limit of 1.
     *
     *  @throws ClassCastException - if any element of the list is not a
     *                               PlotRun type object.
     */
    @Test
	void runOneLimit() {
		assertEquals(1, (int) ((double) new PlotRun_1_oneLimit(new PlotRun_1_one2Limit_Data())) / 100, 0);
	}
    /** Test case for {@link PlotRun_1_one2Limit#iterator()} with
     *  an limit of 2.
     *
     *  @throws ClassCastException - if any element of the list is not a
     *                               PlotRun type object.
     */
    @Test
	/**
     * Verify that no limit is automatically calculated by this method by
     * calling noLimit() again if it is called manually with more than one limit.
     */
    @Test
	void runLimitTooHigh() {
		assertEquals(1, (int) ((double) new PlotRun_1_one2Limit(new PlotRun_1_one2Limit_Data())) / 100