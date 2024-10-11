// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {
		/**
		 * Method 'testAddOutputDestination' used to test the AddOutputDestination method.
		 */
		@Test
		public void testAddOutputDestination() {
                assertTrue(this.isAddOutputDestinationPerformed(),"");
        }
	}

/**
 * Tests the following classes:
 * <ul>
 * <li>{@link FileFollower_0Test#testAddOutputDestination}</li>
 * </ul>
 */
class MainTest {
    /**
     * Logging
     */
    private static final transient Logger LOG = Logger.getLogger(MainTest.class.getName());

    /**
     * Default value to be returned by the AddOutputDestination method
     */
    private boolean hasPrinted = false;
    private List<String> printStreams = new ArrayList<>();
    private FileFollower f;

    /**
     * Runs {@link FileFollower_0Test#testAddOutputDestination()}
     */
    @Test
    public void methodTest() {
        if(this.hasPrinted == false){
            this.f = new FileFollower_0();
            this.hasPrinted = true;
        }
        this.f.addOutputDestination(new OutputDestination("a"));
        this.f.print(System.out);
        this.f.addOutputDestination(new OutputDestination("c"));
        this.f.print(System.err);
        this.f.addOutputDestination(new OutputDestination("d"));
        this.f.print(System.out.toString());
        this.f.print(System.err.toString());
        this.f.addOutputDestination(new OutputDestination("e"));
        this.f.print(System.out.toString(), 0, 2);
        this.f.print(System.err.toString(), 0, 2);
        this.f.addOutputDestination(new OutputDestination("f"));
    }


    /**
     * Returns true, if the following method is {@link FileFollower_0Test#testAddOutputDestination()}
     *
     * @return boolean: hasPrinted
     */
    public boolean isAddOutputDestinationPerformed() {
        assertTrue(this.hasPrinted,"");
        return this.printStreams.size()>0;
    }

    /**
     * Prints the list of String used for a Test
     */
    void printPrintStreams(){
        for(int i= 0; i< this.printStreams.size(); i++) {
            final OutputDestination tempDestination = this.printStreams.get(i);
            for(int j=0; j< this.printStreams.size(); j++) {
                final OutputDestination tempDestinationTemp = this.printStreams.get(j);
                if( tempDestination.equals(tempDestinationTemp) && tempDestination.equals( tempDestinationTemp )){
                    this.printStreams.remove(j);
                    j--;
                }
            }
        }
        LOG.info( "Printing: " + this.printStreams.toArray(new String[printStreams.size()]));
    }

    /**
     * Prints the list of OutputDestination used to log the
     * result of the PrintStream method
     */
    void printStreamsIntoString(){
        LOG.info("Result of printStreamsIntoString: " + this.printStreams.toArray(new OutputDestination[this.printStreams.size()]));
    }
}