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
     * This static member is intended to be the initial setup 
     * for the test.
     */
    public static void Burn_Setup() {
      System.out.println("Burn_Setup");
    }

    /**
     * This run method is responsible for 
     * the actual burn of a dvd being done
     * using the GUI object.
     * @param   D_GUI    A set up GUI object with the DVD 
     *                   file structure and the file name 
     *                   and is to be passed into Burn()
     * @return   A boolean indicating if an error occurred
     */
    public boolean Burn(GUI D_GUI) {
      System.out.println("Burn start: " + Burn.BurnToDVD(D_GUI));
			
      // Burn to DVD function
      return BurnToDVD(D_GUI);
      
    }
    
    /**
     * This method runs the burnToDVD function.
     * This runs one of the BurnTest_XXX() and BurnTest_Foo_xxx() methods
     * that execute by using the GUI object
     * @param   D_GUI    The original GUI object from Burn
     * @return   An indication of the result of the burnToDVD function
     */
    public boolean BurnToDVD(GUI D_GUI) {
		
     // Read the burnToDVD function, which returns a boolean value
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Burn Start");
		
     // Create the buffer for the test
     StringBuffer sb = new StringBuffer();
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");
     sb.append("BurnToDVD-BurnToDVD  ");

     // Run the burnToDVD function
     boolean ret = false;

     try {
        ret = BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run()
        && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run() && BurnToDVD(D_GUI).run();
		
     } catch (IOException ioe) {
        System.out.println("Unable to read test output.. " + ioe);
        systemExit(System.err);
        throw ioe;
     }

  	return ret;
    }
    
    private void systemExit(final OutputStream err) {
      Runtime.getRuntime().halt(1); // The first launch will not terminate
			
      err.close(); // Close the standard error stream, which is an error
    }
    

    @Test   
    public void BurnTest_Setup() {   
			
    	Burn_Setup();
			
    }

   /* 
    * The function burnStart will read the contents of the burnToDVD function, it will return a boolean
    * indicating if an error occurred, which will be passed to Burn()
    * @throws IOException 
    */
    public boolean BurnToDVD(GUI D_GUI) throws IOException {
      System.out.println("Burn Start");
		
      Burn_Setup();

      boolean ret = false;
		
      // Burn function to read the contents of the burnToDVD function
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      // Read function parameter of burnToDVD
      final String line = br.readLine();

      try {
        do {
          System.out.println(line);
          /* 
           * The output may contain two parts: (1) a string, containing the name of each 
           * the test function
           * (2) a list of arguments which may optionally contain, after that the contents 
           *      of the burnToDVD function
           */
			
			// Test the burnToDVD function with the new parameter
			String text = line;
			String[] tokens = text.split(" ");
			String[] new_text = new String[1 + tokens.length];
			new_text[0] = tokens[0];
			for(int y = 0; y <= tokens.length-1; y++) new_text[y + 1] = tokens[y];
			System.out.println("New text is: " + new_text[0]);
			
            ret = test(D_GUI, new_text, false);

            // Check if the burnToDVD function failed 
            if(!ret) {
              System.out.println("BurnToDVD failed. Test terminated");
              break;
            }
          
        } while (true);
		
      } catch (IOException ioe) {
        String msg = "BurnToDVD function returned a result failure. ";
        System.err.println(msg);
        systemExit(System.err);
        throw ioe;
      }

		
      return ret;
    }
    
    private boolean test(GUI D_GUI, String[] text, boolean burnToDVD) {
}
}