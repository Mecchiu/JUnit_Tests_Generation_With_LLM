// ConvertTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.StringIndexOutOfBoundsException;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Convert}.
* It contains one unit test case for the {@link Convert#init()} method.
*/
class ConvertTest {

	// Constants 
	private final static int DEFAULT_DURATION = -1;
	private final static String DEFAULT_OUT_NAME = "";
	private final static String DEFAULT_IN_NAME = "";
	private final static int DEFAULT_QUALITY = 0;
	
	
	
	
	// Constructor 
    ConvertTest(){
		
	}//Constructor
	
	
	
    // Run tests:
    @Test
    public void test1() throws Exception{
        //System.out.print("Testing a basic run of Convert");
        //String inputFile = "/Users/shansom/Documents/projects/M/Mplex/1.0/test/";
        String inputFile = "/Users/shansom/Documents/repos/hanoi1/Hanoi/test/";
        System.out.print("Testing the transcode command... ");
        Process convert = Runtime.getRuntime().exec(
            "/usr/bin/convert -f " + inputFile + " -o " + 
            new File(DEFAULT_OUT_NAME).getAbsolutePath() + " " +
            new File(DEFAULT_QUALITY));
        
        String output = "";
		
        BufferedReader reader = new BufferedReader(new InputStreamReader(convert, "UTF-8"));
        
        boolean success = false;
        String line;
        
        while ((line = reader.readLine())!= null) {
            output += line + "\n";
        }
        
        
        inputFile = "/Users/shansom/Documents/repos/hanoi1/Hanoi/test/";        
		
        inputFile = inputFile+"video.m4a";
		
        convert = Runtime.getRuntime().exec(
            "/usr/bin/convert -f " + inputFile + " -o " + 
            new File(DEFAULT_OUT_NAME).getAbsolutePath() + " " +
            DEFAULT_QUALITY);
        
        Thread.sleep(1500);
    
        success = false;
        boolean runOk = false;
        while (!success) {
            System.err.print("Retry... ");
            try {
                Thread.sleep(400);
                //convert.waitFor();
                runOk = true;
            } catch (InterruptedException ie) {
            }
        	
            System.err.println();
            try {
                output = convert.read();
                //System.err.println(output.toString());
            } catch (InterruptedException e) {
            }
        	
            if (!runOk) {
                System.err.println();
                System.err.print("Error: ");
                System.err.println("\n");
                System.err.println(inputFile + "\n");
                System.err.println(output.toString());
                System.exit(1);
            }//end success wait
        
            inputFile = "/Users/shansom/Documents/repos/hanoi1/Hanoi/test/";
        }//end sleep
        
        System.out.println(output.substring(0, output.length()-1));
        
        File convertedFile = new File(new File(inputFile).getAbsoluteFile().getParentFile() + "/" + 
        		new File(DEFAULT_OUT_NAME).getPath().substring(0, DEFAULT_OUT_NAME.length()) + ".m4a");	
        output = new String(FileUtils.readFileBytes(convertedFile));  
        
        StringTokenizer tokenizer = null;
        String inputString = new String(output);
        
        tokenizer = new StringTokenizer(inputString, "\n\r");
        
        int outputLineNumber = 0;
        while (tokenizer.hasMoreTokens() && outputLineNumber < DEFAULT_QUALITY) {
			
			outputLineNumber++;
            System.err.print("\nOutput found at line " + outputLineNumber + " of file " + inputFile + " = " + outputString+ "\n");
                
            tokenizer.nextToken().replaceAll("\"", "");
			
		    System.err.println("");
            tokenizer = null;
        }//end last loop

        /*
        try {
            OutputStream out = new FileOutputStream(new File("/Users/shansom/Documents/repos/hanoi1/Hanoi/test/mplex.m4a"));
            out.write("I am in the " + inputFile + ". \n" + "\n" );
            //OutputStream out = convert.getOutputStream();
        } catch (IOException e) {
            System.err.println("Can't create " + outputFile + " from " + inputFile + "\n" );
        }
        */
	}//end test1
	
	
	
	
	
	
	
	
	

}//end ConvertTest Class