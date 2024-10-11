// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {
		/** Output to which the generated compile should be output */
		private OutputStream outputStream;
		/** Reads from a reader the compiled output */
        @Test
        public void testRead() throws Exception
        {
            try {
                this.outputStream = new FileOutputStream("target/output/atRobotCompiler_3Test.jvm");
            }
            catch (Exception e) {
                throw new Exception("Problem generating output: "+e);
            }
			
            final byte[] source = new byte[0];
            try (InputStream in = new ByteArrayInputStream(source)) {
                AtRobotCompiler.compile(in);
            }
            assertTrue("There should be a valid code generated from the source: "+source, source!=null && source.length>0);
            for (String line: source) {
                byte[] read = new byte[4];
                try {
                    read = (new CompressionStreamReader(new ByteArrayInputStream(line.getBytes("UTF-8"))))
                          .getRemainingData(line, 0);
                }
                catch (Exception ex) {
                    continue;
                }
                // assertThat(read, is(notNullValue()));
                for (int i=0; i < read.length; i++) {
                    assertEquals(line[i], read[i]);
                }
            }
            this.outputStream.flush();
            assertTrue("There should be a valid code generated from the output: "+this.outputStream.getContents(), this.outputStream.getContents().length()>0);
        }
 }