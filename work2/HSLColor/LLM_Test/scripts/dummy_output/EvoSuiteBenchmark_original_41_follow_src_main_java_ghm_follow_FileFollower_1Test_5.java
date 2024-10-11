// FileFollower_1Test.java
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
* It contains one unit test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {
		
	final OutputDestination outputDestination;
	
	public FileFollower_1Test(OutputDestination outputDestination) {
		this.outputDestination = outputDestination;
		assertNotNull( "outputDestination could not be null", outputDestination );
	}

@Test
public final void testRemoveOutputDestination() {
	FileFollower ff = new FileFollower(outputDestination);
	assertTrue( "removed the OutputDestination", ff.removeOutputDestination(outputDestination) );
}

}