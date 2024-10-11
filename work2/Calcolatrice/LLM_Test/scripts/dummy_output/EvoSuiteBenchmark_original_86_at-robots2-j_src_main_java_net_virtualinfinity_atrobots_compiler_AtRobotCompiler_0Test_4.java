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
		
    @Test
    public void compareFileCompiled() throws IOException {
     File testSourceFile = new File("C:\\AtRobot\\AtRobot\\src\\test\\resources\\sources\\atrobots.compiled.cs");
     String output = compile(testSourceFile).outputStream().toString();
     File testOutputFile = new File("C:\\AtRobot\\AtRobot\\src\\test\\resources\\output.cs");
     File outputStream = new File(output);
     assertEquals(new File("C:\\AtRobot\\AtRobot\\src\\test\\resources\\expected\\output").toString(),output.trim());
     if(outputStream.length()>0){
        assertTrue("File should be compiled. \rNot compiled \n",outputStream.length()>0);
     }
     outputStream.delete();
     System.out.println(output);
    }

    @Test
    public void compareLineNumberCompiled() throws IOException {
     String sourceCode = null;
     int index = 0;
     reader input = new InputStreamReader(new FileInputStream("C:\\AtRobot\\AtRobot\\src\\test\\resources\\input.cs"));
     String output = compile(input).outputStream().toString();
     reader outputReader = new InputStreamReader(new FileInputStream("C:\\AtRobot\\AtRobot\\src\\test\\resources\\output\\lineNumber.cs"));
     input.close();
     outputReader.close();
     while((sourceCode = outputReader.readLine())!=null){
        System.out.println(sourceCode);
        if(input.readLine().length()>0){
           index++;
        }
     }
}
}