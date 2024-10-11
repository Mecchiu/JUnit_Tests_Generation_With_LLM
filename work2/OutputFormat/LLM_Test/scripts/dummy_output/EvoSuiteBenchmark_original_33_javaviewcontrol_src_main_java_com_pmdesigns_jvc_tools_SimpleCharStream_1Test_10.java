// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {
		
    int t0;
    int t1;

    public void runTest() throws Throwable {
        t0 = -1;

        SimpleCharStream inputStream = new SimpleCharStream(new java.io.UTF8Reader(new java.io.ByteArrayInputStream(new byte[100])), "UTF-8", 1, 100);
        inputStream.begin(1);
        char c = inputStream.readChar();

        if (c!= 'a') {
            assertEquals('a', c);
        } else {
            t1 = 1;
        }

        int i = 1;
        while (true) {
            c = inputStream.readChar();
            if (c!= 'a') {
                break;
            }
            t1++;
            inputStream.begin(i);
            i++;
            continue;
        }

        c = inputStream.readChar();
        t1 = i;
        inputStream.end(1);

        if (c!= 'a') {
            assertEquals('A', c);
        }
    }

    @Test
    public void test() throws java.lang.Throwable {
      runTest();
    }

}