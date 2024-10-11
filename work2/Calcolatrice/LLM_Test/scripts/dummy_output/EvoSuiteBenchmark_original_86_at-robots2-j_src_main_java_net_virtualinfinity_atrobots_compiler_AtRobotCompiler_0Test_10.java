// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains one unit test case for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {
		
	String[] code = {"1\n", "\n"};
	AtRobotCompiler atRobotCompiler;
	{
		atRobotCompiler = new AtRobotCompiler();
		String[] compiledCode = atRobotCompiler.compile(new File("testfile"));
		assertArrayEquals(code,compiledCode);
	}
	
	TestAtRobotCompiler(){
	}

	@Test
	public void test() throws IOException {
		System.out.println("atRobotCompilerTest");
		File a = new File("testfile");
		try {
			atRobotCompiler.compile(a);
			//System.out.println("atRobotCompiler compiled");

			File reader = new File("testfile");

			
			try (InputStream in = atRobotCompiler.compile(new FileReader(reader))) {
				System.out.println("expecting stream");
				assertTrue(in instanceof BufferedInputStream);
			}
			try (InputStream in = atRobotCompiler.compile(new FileReader(new File("testfile"), false))){
				System.out.println("expecting stream");
				assertTrue(in instanceof BufferedInputStream);
			}
			
			try (Reader reader = new BufferedReader(new InputStreamReader(in))) {
				System.out.println("expecting reader");
				assertTrue(reader instanceof BufferedReader);
			}
			
			
			OutputStream os = new FileOutputStream("testfile");
			System.out.println("expecting os");
			try(Writer out = new BufferedWriter(new OutputStreamWriter(os))) {
				String[] compileds = atRobotCompiler.compile(new FileReader(new File("testfile")));
				assertArrayEquals(code, compileds);
			}
			
			try(PrintWriter out = new PrintWriter("testfile")){
				String[] compileds = atRobotCompiler.compile(new FileReader(a));
				assertArrayEquals(code, compileds);
			}
		} 
		catch (Exception e){
			assertTrue("atRobotCompiler error",false);
		} finally {
			System.out.println("test() successfull");
		}
	}
}