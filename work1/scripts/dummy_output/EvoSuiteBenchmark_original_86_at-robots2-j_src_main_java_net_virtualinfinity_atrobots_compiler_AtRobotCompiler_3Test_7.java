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
		
	private LineNumberReader reader;
    private String fileName;
    private File temp;
	private AtRobotCompilerCompilerOutput ccout;
	
    AtRobotCompiler_3Test() {
        reader = new LineNumberReader(new FileReader(System.getProperty("user.dir") + "/src/test/resources/file1.txt"));
    }
    
    AtRobotCompiler compile(
//            LineNumberReader reader
    ) throws Exception {
        
        fileName = "file1.txt";
        temp = File.createTempFile("out", ".txt");
        temp.deleteOnExit();
        outputStream = new FileOutputStream(temp);
        reader = new LineNumberReader(new FileReader(System.getProperty("user.dir") + "/src/test/resources/file2.txt"));
		return compile2(temp);
    }
	
	
    AtRobotCompiler compile2(File directory) throws IOException {
    	AtRobotCompilerCompilerOutput out = new AtRobotCompilerCompilerOutput();
        ccout = new DummyCompilerOutput();
        Compiler compiler = new AtRobotCompilerCompiler(ccout);
        inputStream = compiler.compile(reader, inputStream);
        outputStream = compiler.compile(reader, outputStream);
		
		return out;
    }
	
    private CompilerReader createReader(String fileName) throws IOException {
    	InputStream inputStream = new FileInputStream(fileName);
    	return new DummyCompilerReader(inputStream);
    }
	
	DummyInputStream inputStream;
    private final String fileName;
/*
    public void test() throws Exception {	
    	LineNumberReader reader = new LineNumberReader(new FileReader(temp.toString()));
        String s1= reader.readLine();
        String s2= reader.readLine();
        assertNotNull("File 1 null on entry",s1);
        assertNotNull("File 2 null on entry",s2);
        assertEquals("File 1 same on entry", s1, s2);
    }
*/
    @Test
    public void test() throws Exception {
    	LineNumberReader reader = new LineNumberReader(createReader("file1.txt"));
        String s1= reader.readLine();
        String s2= reader.readLine();
        assertNotNull("File 1 null on entry",s1);
        assertNotNull("File 2 null on entry",s2);
        assertEquals("File 1 same on entry", s1, s2);
    }
	
	File temp;
	DummyInputStream inputStream;
//    	private OutputStream outputStream;
	DummyOutputStream outputStream ;
	
    AtRobotCompilerCompilerOutput outputStream1 ;
		
    AtRobotCompilerCompilerOutput outputStream2 ;
		
	boolean gotException;
	public void setUp() throws Exception {
		temp = File.createTempFile("out1", ".txt");
        temp.deleteOnExit();
        outputStream = new DummyOutputStream();
        ccout = new AtRobotCompilerCompiler(outputStream);
		inputStream = createReader(fileName);
	}
	
	static final String expected = "line1\n line2";
    @Test
	public void testString2String() throws Exception {
		String expectedString = expected;
            try {
	        	gotException = false;
	        	String s = ccout.compile(temp);
	        	temp.delete();
	        	expectedString = expectedString.replace("\n", "\n    ");
	        	assertEquals(expectedString, s);
        	} catch (IOException e) {
	            fail("IOException on input of " + temp.getAbsolutePath() + ": " + e.getMessage());
        	}
        	gotException = false;
	        gotException = false;
	        gotException = false;
	        gotException = false;
	        gotException = false;
	        gotException = false;
	        gotException = false;
	        gotException = expectedException;
//	    	gotException = false;
		try {
			gotException = false;
			ccout.compile(inputStream, outputStream);
/*			gotException = true; */
        	} catch (IOException e) {
/*			gotException = gotException; */
        	}
        	gotException = false;
//	    	gotException = false;
	}
	
	AtRobotCompilerCompilerOutput outputStream2;
	AtRobotCompilerCompilerOutput outputStream1;

    AtRobotCompilerCompilerOutput tempOutputStream;
    protected void runTest() {
		outputStream2 = new AtRobotCompilerCompiler(outputStream);
		outputStream1 = new AtRobotCompilerCompiler(outputStream);
		outputStream2.compile(inputStream);
		outputStream1.compile(inputStream);
    }
	
	DummyInputStream inputStream;
	private OutputStream outputStream;

}