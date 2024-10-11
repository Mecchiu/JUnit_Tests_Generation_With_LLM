// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains one unit test case for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {
		/**
		* Test constructor.
		*/
        @Test
        public void testBeginToken() {
            SimpleCharStream stream_BeginToken = new SimpleCharStream(null, "ISO-8859-1", 1, 1);
            String result_BeginToken= stream_BeginToken.NextChar();
            assertNull(result_BeginToken);
        }

        /**
         * Test method for
         * {@link SimpleCharStream#NextChar()}
         *
         */
        @Test
        public void testNextChar() {
            SimpleCharStream stream_1 = new SimpleCharStream(null, "ISO-8859-1", 1, 1);

            assertNull(stream_1.NextChar());
        }
}