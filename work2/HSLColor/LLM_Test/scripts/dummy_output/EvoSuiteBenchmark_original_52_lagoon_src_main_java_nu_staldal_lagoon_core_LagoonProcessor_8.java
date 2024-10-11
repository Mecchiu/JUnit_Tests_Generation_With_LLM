// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		
    /** Test case */
    @Test
    public void unitTest() throws IOException {
        Utils.init("./src/main/test/conf/config.xml");
        if (!build(true)) {
            Utils.destroy();
            throw new IOException("build() operation was not completed!?");
        }
        Utils.init("./src/main/test/conf/config.xml");
        if (!build(true)) {
            Utils.destroy();
            throw new IOException("build() operation was not completed!?");
        }
    }
}