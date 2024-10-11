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
		/// The test data
    @Test
    public void testData()	throws ClassNotFoundException, IOException {
		File sourceFile = new File(
				System.getProperty("java.class.path").substring(0, System.getProperty("java.class.path").indexOf("/"))
				+ "../../class-test-src/src/atrobots/atrobots.c"
		    );
		
		assertNotNull(sourceFile);
		assertNotNull(sourceFile.getCanonicalPath());
		assertTrue(sourceFile.isFile());
		
		
		AtRobotCompiler.compile(new FileInputStream((File)sourceFile));
        
        try {
            AtRobotCompiler.compile(new FileInputStream((File)sourceFile));
            fail();
        } catch (AtRobotCompiler.ExceptionExpected f) {
            assertHasMessage(f.getMessage(), "EOF", "line 1");
        }
		
        try {
            AtRobotCompiler.compile(new InputStreamReader(((File)sourceFile).getCanonicalFile()));
            fail();
        } catch (IOException e) {
        }     
        
        AtRobotCompiler.compile(new DataInputStream(((File)sourceFile).getCanonicalFile()));
        AtRobotCompiler.compile(new DataInputStream(((File)sourceFile).getCanonicalFile()));
        AtRobotCompiler.compile((new FileInputStream(((File)sourceFile).getCanonicalFile())));
        AtRobotCompiler.compile((new DataInputStream((new FileInputStream(((File)sourceFile).getCanonicalFile())))));
        try {
            AtRobotCompiler.compile((new LineNumberReader(((File)sourceFile).getCanonicalFile())));
            fail();
        } catch (IOException e) {
        }
// AtRobotCompiler_4Test.java;
    }
	
	private void assertHasMessage(String message, String pattern, String line) throws IOException {
        BufferedReader r = new BufferedReader(new FileReader(sourceFile));
        String line1;
        final String regex;
        String first;
        int idx = 0;
        
        // Regular expression to find the first occurrence of message
        regex = "^" + pattern + "\\d+\\.\\d+";
//        FileReader f = new FileReader(sourceFile);
//        final Matcher matcher = FileUtils.compilerFileMatcher(regex);
//        int length = 0;
//        while (matcher.find(f)) {
//            length = matcher.group(1).length();
//            idx += length;
//        }
        r = new BufferedReader(new FileReader(new File(sourceFile)));
        try {
            line1 = r.readLine();
        } finally {
            r.close();
        }
        
        if(idx!= line.length()) {
            fail("message \"\".*:\n" + message + "\nin\n" + line + "\n"
            + "expected number of lines: " + line.length() + ";\nexpected number of lines: " + idx
            + ";\nActual: " + line1.split("\\n")[1]);
        }else{
            if(line!= line1.split("\\n")[1]) {
                fail("message \".*:\n" + message + "\n\nin\n" + line + "\nexpected:\n" + line1.split("\\n")[1]
                        + "\nto\n" + line + "\n" + "actual:\n" + line1.split("\\n")[1]);
            }
        }
	}
}