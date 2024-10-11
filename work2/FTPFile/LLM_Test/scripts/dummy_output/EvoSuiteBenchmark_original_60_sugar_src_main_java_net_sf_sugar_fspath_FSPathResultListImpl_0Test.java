java
package net.sf.sugar.fspath;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FSPathResultListImpl_0Test {

    @Test
    void testEachMethodWithEmptyList() {
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        Callback callback = new Callback() {
            @Override
            public void call(FSPathResult result) {
                // do nothing
            }
        };
        assertDoesNotThrow(() -> resultList.each(callback));
    }

    @Test
    void testEachMethodWithNonEmptyList() {
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(new File("test.txt")));
        resultList.add(new FSPathResult(new File("example.txt")));

        Callback callback = new Callback() {
            @Override
            public void call(FSPathResult result) {
                // do nothing
            }
        };
        assertDoesNotThrow(() -> resultList.each(callback));
    }

    @Test
    void testEachMethodWithException() {
        FSPathResultListImpl resultList = new FSPathResultListImpl();
        resultList.add(new FSPathResult(new File("test.txt")));
        resultList.add(new FSPathResult(new File("example.txt")));

        Callback callback = new Callback() {
            @Override
            public void call(FSPathResult result) throws IOException {
                throw new IOException("Simulated exception");
            }
        };
        assertThrows(IOException.class, () -> resultList.each(callback));
    }
}
