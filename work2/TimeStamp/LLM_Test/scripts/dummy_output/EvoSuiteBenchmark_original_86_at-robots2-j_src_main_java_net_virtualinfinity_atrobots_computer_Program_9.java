// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains one unit test case for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		 private MemoryArray memory;
		
		public ProgramTest(){

		}
		
		/**
		 * Initializes the memory of the computer using the test case data
		 *
		 * @param testcaseFileName the name of the test case file to read.
		 * @throws Exception if an error occurs.
		 */
		 public void initializeMemory(String testcaseFileName)throws Exception{
		 			 	 	// we want to use this for the test
					memory = createProgramMemory();
		 			 	  	 	// load test case data from file
		 			 	  	 	String testCaseData = Utils.loadTextFile(testcaseFileName);
		 				 	if(testCaseData.length()==0){
		 							System.err.println("File " + testcaseFileName + " is empty.");
		 						 	throw new Exception("File " + testcaseFileName + " is empty.");
		 						 	
		 					}
		 					for(int i=0;i<testCaseData.length();i++){
		 						 memory.putByte(i,testCaseData.charAt(i));
		 					}
		 			 	}
}