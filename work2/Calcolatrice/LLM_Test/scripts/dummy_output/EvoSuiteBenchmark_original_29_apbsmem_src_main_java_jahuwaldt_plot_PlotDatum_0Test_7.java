// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains one unit test case for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {
		
    /**
     *  Test method to test if a {@link PlotDatum} is correctly
     *  initialized.
      */
    @Test
    public void whenHasErrorBarIsFalseThenCorrectConstructor() {
        PlotDatum newGuy = null;
        newGuy = new PlotDatum(null, false);
    }

  /**
  * Test method for {@link PlotDatum#init(Color)}.
    */
    @Test
  public void thenInitIsCorrect() {
    
      PlotDatum newGuy = null;
        
        newGuy = new PlotDatum(Color.red);
        
    }

    /**
     * Test method for {@link PlotDatum#init(java.awt.Color)}.
     * This constructor needs a Color value.
     * @throws org.junit.jupiter.api.Assertions Assertions object Thrown
     *    to test if the value is set correctly.
     */
    @Test
	public void whenColorIsNoneValueThenNoErrorBarIsAvailable() throws Exception {

        Color c = null;

        @SuppressWarnings("boxing")
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
           new PlotDatum(c);
        });

    }

    /**
     * Test method for {@link PlotDatum#init(Color)}.
     * @throws org.junit.jupiter.api.Assertions Assertions object should be thrown
     *    for not null value and set to true.
     */
    @Test
	public void whenColorValueIsNullThenErrorBarIsNotAvailable() throws Exception {

        @SuppressWarnings("boxing")
        org.junit.jupiter.api.Assertions.assertThrows(
            NullPointerException.class, 
            () -> new PlotDatum(null, true));

    }

    /**
     * Test method for {@link PlotDatum#clone(java.awt.Color)}.
     * @throws NullPointerException Thrown if source object is null.
     */
    @Test
    public void whenSourceIsNullThenCloneIsNull() throws NullPointerException {

        org.junit.jupiter.api.Assertions.assertThrows(NullPointerException.class, 
                                            () -> new PlotDatum(Color.red, true));

    }

    /**
     * Test method for {@link PlotDatum#clone(java.awt.color.Color)}.
     * @throws org.junit.jupiter.api.Assertions object should be thrown.
     */
    @Test
	public void whenSourceIsNotNullThenCloneIsCorrect() throws Exception {

        @SuppressWarnings("boxing")
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> {
           new PlotDatum(null, true);
        });

    }

    /**
     * Test method for {@link PlotDatum#clone(Color)}.
     * @throws NullPointerException Thrown if source is null.
     */
    @Test
    public void whenSourceIsNullThenCloneIsNull() throws NullPointerException {

        Color newGuy = null;

        @SuppressWarnings("boxing")
        org.junit.jupiter.api.Assertions.assertThrows(
                                            NullPointerException.class, 
                                            () -> new PlotDatum(newGuy, true));

    }

    /**
     * Test method for {@link PlotDatum#clone(Color)}.
     * @throws org.junit.jupiter.api.Assertions object should be thrown.
     */
    @Test
	public void whenSourceIsNotNullThenCloneIsCorrect() throws Exception {

        Color newGuy = null;

        @SuppressWarnings("boxing")
        org.junit.jupiter.api.Assertions.assertThrows(
                                            NullPointerException.class, 
                                            () -> new PlotDatum(Color.red, true));

    }
    
}