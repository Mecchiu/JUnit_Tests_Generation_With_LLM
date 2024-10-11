// FSPathResultListImpl_0Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {

        @Test
        public void testEach_Empty() throws IOException {
                Callable<FSPathResult> resolver = new Callable<FSPathResult>() {
                        public FSPathResult call () throws Exception {
                            return null;
                        }
                };
                assertEquals(1, each(resolver).size());
        }

//        @Test
//        public void testEach_OneResult() throws IOException {
//                Callable<FSPathResult> resolver = new Callable<FSPathResult>() {
//                        public FSPathResult call () throws Exception {
//                            return new FSPathResultImpl(new FSPathRoot(getResourcesDir()));
//                        }
//                };
//                assertEquals(1, each(resolver).size());
//        }

//        @Test(expected = ArrayIndexOutOfBoundsException.class)
//        public void testEach_MultipleResults() throws IOException {
//                Callable<FSPathResult> resolver = new Callable<FSPathResult>() {
//                        public FSPathResult call () throws Exception {
//                            return new FSPathResultImpl(new FSPathRoot(getResourcesDir()));
//                        }
//                };
//                each(resolver);
//        }

        public static class FSPathResultImpl implements FSPathResult {

                public String absoluteResourceName;

                public FSPathResultImpl (FSPathRoot root) {
                        this.absoluteResourceName = root.getFSPath();
                }

                public FSPathResultImpl (FSPathRoot root, String relativePath) {
                        this.absoluteResourceName = root.getFSPath() + relativePath;
                }

                public boolean equals(Object o) {
                        FSPathResult p1 = (FSPathResult)o;
                        FSPathResultImpl p2 = (FSPathResultImpl)p1;
                        Pattern p3 = Pattern.compile(p2.absoluteResourceName);
                        Matcher m3 = p3.matcher(absoluteResourceName);
                        return m3.matches();
                }

                public String toString() {
                        return "FSPathResult: Name: " + absoluteResourceName;
                }
        }

}
