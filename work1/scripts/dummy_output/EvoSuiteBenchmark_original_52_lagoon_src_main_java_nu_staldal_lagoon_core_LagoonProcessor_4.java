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
		static Map<String,String> sTestMap;

    interface TestSItem {
        public boolean isEmpty();

//        public String getItem();
//
//        public String getItem(String key);

        public boolean hasItem(String key);

//        public int getItemInt(int key);

        public boolean delete();
    }

        public InputStream getItemInputStream(String key);
        public OutputStream getItemOutputStream(String key);

        public boolean hasItem(String key);
        public int getItemInt(int key);

//        public void delete(String key);

        public Set<String> keys();
}