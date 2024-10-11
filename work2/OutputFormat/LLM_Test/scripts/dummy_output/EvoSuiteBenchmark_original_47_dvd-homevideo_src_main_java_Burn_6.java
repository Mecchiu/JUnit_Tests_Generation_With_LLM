// BurnTest.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Burn}.
* It contains one unit test case for the {@link Burn#BurnToDVD(GUI)} method.
*/
class BurnTest {
		
    /**
     * Empty constructor for the class
     */
    public BurnTest() {
    }

    /**
     * Test one of the burn functions
     */
    public void TestBurnFile() {
    
        /**
         * Creates the FileWriter in which the script will write
         * the test code
         */
        String TempFile = "";
        FileWriter Filew =null;
        FileWriter TempFilew = null;
        try {
            
            /**
             * The file where the script will write the code
             */
            String File = "/Users/shan/Scripts/BurnTest.js";
            
            /**
             * The File where the script will write a file
             * that contains the input file which will be burned
             */
             String Burnin = "/Users/shan/Scripts/BurnTest.in";
            Filew = new FileWriter(Burnin);
            
            /**
             * The file where the script will write a file
             * containing the output of the burn function
             */
             String Burnout = "/Users/shan/Scripts/BurnTest.out";
            TempFilew = new FileWriter(Burnout);
            
            BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
            /**
             * First input argument is a boolean value that specifies if a
             * burn file will be created or not, if burnin flag is used
             * in Burn
             */
             String burn = bufr.readLine();
             if (burn==null) {
                burnout = TempFilew.getAbsolutePath();
                burnout = burnout+":"+TempFilew.getAbsolutePath();
                burnout = burnout+":"+TempFilew.getAbsolutePath();
                burnout = burnout+":"+TempFilew.getAbsolutePath();
                burnout = burnout+":"+TempFilew.getAbsolutePath();
                burn = null;
             }
             TempFilew.close();
            // Test to set file to burn file with burnin flag.
            if (burn!= null && burn == "1") {
                burnin = TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                burner = burnin+":"+TempFilew.getAbsolutePath();
                    
                burn = null;
             }
            
            Filew.write("testscript\n");
            Filew.write("var burn =" + burn + ".Burning with dvd.\n");
            Filew.write("var burnout =" + burnout + ".Burned with dvd.\n");
            Filew.write("var burner =" + burner + ".Burning with dvd.\n");
            Filew.write("var burnin =" + burnin + ".Burned with dvd.\n");
            
            assertTrue("Burning with dvd","Burning with dvd " + burn);
        }
        catch (IOException ioException)
        {
            System.out.println(ioException);
            assertTrue("Burn testing failed", false);
        }
    }
    
}
