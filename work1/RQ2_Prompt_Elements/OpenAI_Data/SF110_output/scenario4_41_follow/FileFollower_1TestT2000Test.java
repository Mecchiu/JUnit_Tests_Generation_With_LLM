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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {

		private static final Logger log = Logger.getLogger(FileFollower_1Test.class.getName());
		
		/**
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileFollower#removeOutputDestination(OutputDestination)}.
		* Test case 1 for method {@link FileF