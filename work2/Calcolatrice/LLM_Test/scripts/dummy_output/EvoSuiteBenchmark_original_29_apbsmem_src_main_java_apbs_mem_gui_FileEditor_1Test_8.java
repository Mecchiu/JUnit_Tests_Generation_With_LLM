// FileEditor_1Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
		
	// Constructor for unit (do not change)
    public FileEditor_1Test(){};

    
    /**
     * Unit tests for the {@link FileEditor#getCompEnergy(String)} method.
     */
	@Test
	public void getCompEnergyWithNullFile() throws Exception {
		FileEditor.getCompEnergy("");
	}


	/**
     * Unit tests for the {@link FileEditor#getCompEnergy(String)} method.
	 */
	@Test
	public void getCompEnergyWithEmptyFile() throws Exception {
		FileEditor.getCompEnergy("");
	}
	
	/**
     * Unit tests for the {@link FileEditor#getCompEnergy(String)} method.
	 */
	@Test
	public void getCompEnergyWithNonStringFile() throws Exception {
		//String fname="c:/dir/pullComps/100_f_f.npy";
		String fname="./c:/dir/pullComps/100_f_f.npy";
		File fnamep=new File(fname);
		FileReader fr=new FileReader(fnamep);
		String line;
		String[] fields;
		
		while ((line=fr.readLine())!=null){		
			fields=line.split("\t");
			String[] efields = fields[0].split("\\|");
			
			double[] edouble=new double[fields.length+1];
			for (int i=0; i<fields[0].length(); i++){
				edouble[i]=Double.parseDouble(fields[0].substring(i,i+1));
			}
			
			edouble[fields[fields.length-1]]=Double.parseDouble(fields[fields.length-1]);//sum
		}
		System.out.println(fields[0]);
		
		/*
		File fname=new File("c:/dir/pullComps/100_f_f.nc");
		FileReader fr=new FileReader(fname);
		String line;
		String[] fields;
		// while ((line=fr.readLine())!=null
		// {
		//	fields=line.split("\t");
		//	edouble=new double[fields.length+1];
		//	double x=Double.parseDouble(fields[0]);
		//	for (int i=1; i<fields.length; i++){
		//	edouble[i]=edouble[i-1]+Double.parseDouble(fields[i]);
		//	}
		// }
		System.out.println(fields[0]);
		// for (int i=0; i<fields.length; i++){
		// System.out.println(fields[i]);
		// edouble[i]=Double.parseDouble(fields[i]);
		// }
		*/
		int c=1;
		for (int i=0; i<fields.length; i++){
			edouble[i]=Double.parseDouble(fields[c]);
			c++;
		}
		
		assertEquals(edouble[0],edouble[fields.length-1],0.001);
	}
}