// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains one unit test case for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {
		private boolean isInit = false;

		private String testContent = null;

        private HTMLOutputStream stream = null;

        /**
         * @jstory This is where the test goes.
		 * @jstory @test TestMethod is an example of the unit test.
         * @param t a value passed to the constructor.
         */
        public HTMLOutputStreamTest(String t) {
                this.testContent = t;
        }

		/**
        * The constructor of the test. Here, the values
		* are defined to be the initial value.
		* @throws Exception Thrown when the test fails.
		*/
        @Before
        public void setUp() throws Exception {
            if (!isInit) {
                stream = new HTMLOutputStream(new HttpServletResponse());
                stream.setHeader("Content-Length", "0");

                //  In case if our test fails, we need to clean up before the next one
                //  if we initialized properly
                if (testContent.length() >= 0) {
                    stream.close();
                    stream = null;
                }

                isInit = true;
            }

            pw = new PrintWriter(stream.getPW());
            stream.print(testContent);
            pw.close();
        }

		/**
		* The method. This is the one-entry point of test.
		* @throws Exception Thrown when the test fails.
		*/
        @Test
        public void test() throws Exception {

            //  In case of other tests the test of HTMLOutputStream
            //  only fails if the test value is greater than the
            //  initial value.
            assertTrue(testContent.length() == 0);
            assertTrue(stream.reset());

            pw = new PrintWriter(stream.getPW());
            pw.println(testContent);
            pw.close();

            assertTrue(pw.getBuffer().toString().equals(testContent));
            assertTrue(pw.getBuffer().length() == testContent.length());
        }
}