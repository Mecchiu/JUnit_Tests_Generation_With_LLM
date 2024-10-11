// JniInchiWrapper_0Test.java
package net.sf.jniinchi;

import net.sf.jnati.NativeCodeException;
import net.sf.jnati.deploy.NativeLibraryLoader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiWrapper}.
* It contains one unit test case for the {@link JniInchiWrapper#getInchiKey(String)} method.
*/
class JniInchiWrapper_0Test {

 /**
  * Test of the first case of generateInchi, where the input is not a file.
  */ 
  @Test
  public void generateInchi_notFile() throws Exception {
	 	final String inchi = "2Sg7Mv/5k0pZd=M6YB9f5";

	  try {
	 		NativeInchi.generateInchi(new String[]{inchi});
	  } catch (NullPointerException e){
	 		return;
	  }
  	 	fail();
  }

 /**
  * Test of the second case of generateInchi. Each test class should have
  * their individual test methods (testGetInchi, testGenerateInchi,
  * testAddAtom, testAddBond, testAddParity) for every test case. The test cases
  * will first get loaded into an ArrayList, and then the following
  * methods will be passed in.
  *
  * @throws JniInchiException if an Inchi exception occurs
  */
  @Test
  public void generateInchi() throws Exception {
	   
  	final String inchi0 = "";
	  
  	// check that the test cases are getting called on the array list 
  	assertNotNull(INCHI, INCHI0);
  	
  	// load/unload the library
  	this.loadDependencies();
  	NativeInchi.unload();
  	
  	// generate the InChI String for the same input file
  	final String inchi = this.GENERATE_INCHI(inchi0);
  
  	// read from the loaded library in the new array list
  	// check the Array for validity
  	final List<InchiOutput> results = this.readLibrary();
  	assertNotNull(results);
  	this.checkLibrary(results);
  	
  	// check that all the test cases were called correctly
  	assertEquals(2, results.size());
  	
  }
 
//public class Test {

 //  @Test
//  public void testGetInchi() throws Exception {
//  	
//  	final String inchi0 = "";
//  	
//  	// check that the test cases are getting called on the array list
//  	assertNotNull(INCHI, inchi0);
//  	
//  	// load/unload the library
//  	this.loadDependencies();
//  	
//  	// generate the InChI String for the same input file
//  	final String inchi = this.GENERATE_INCHI(inchi0);
//
//  	// read from the loaded library in the new array list
//  	// check the Array for validity
//  	final List<InchiOutput> results = this.readLibrary();
//  	assertNotNull(results);
//  	
//  	// check that all the test cases were called correctly
//  	assertEquals(2, results.size());
//  	
//  }
 //  
//  @Test
	public void testGetInchi_file() throws TimeOutException, NativeCodeException {
		// final String inchi = "2Sg7Mv/5k0pZd=M6YB9f5";
			
		final String inchi = "2q8tJyM="; // test a file containing a molecule (which must be pre/postloaded)
//  	
//  	// check that the test cases are getting called on the array list
//		assertNotNull(INCHI, inchi);
//  	
//  	final String preload0 = "2Sg7Mv/5k0pZd=M6YB9f5";
//  	final String postload0 = "1r8YxM=M8P="; // test a string for a preloaded molecule (can optionally pass in a preloaded string for the InChI)
//  	
//  	// load/unload the library
//  	this.loadDependencies();
//  	NativeInchi.unload();
//  	
//  	// try to generate the InChI output for a file containing a preloaded molecule
//  	this.generateInchi(preload0);
	
		// read from the loaded library in the new array list
		// check the Array for validity
		final List<InchiOutput> results = this.readLibrary();
		assertNotNull(results);
		
 //  	checkLibrary(results);
		
 //  	// check that all the test cases were called correctly
 //   	assertEquals(2, results.size());
  	
public static void main (String[]args) throws Exception {
	
  	JniInchiWrapper wrapper = new JniInchiWrapper();
  	 	
  	// first check the number of input files is 2 or 3
  	assertEquals(2, args.length);
  	
  	int count0 = args.length;
  	
  	// test getInchi
  	// first we load the library to a list and make sure we get correct results
  	List<Runnable> runnables = NativeLibraryLoader.loadAll(JavaInchiWrapper.class.getClassLoader());
  	NativeLibraryLoader.unload();
  	
  	Runnable runnable = runnables.get(0);
  	runnable.run();
  	
 //  	
 //  	// second test getinchi on a file
 //  	String[] args2 = {};
 //  	int count2 = args2.length;
 //  	System.out.println("first part of test getInchi"); // args[0];
//  	args2 = new String[count2-1];
 //  	System.arraycopy(args2, 1, args2, 0, count2 - 1);
 //  	
 //  	String inchi = wrapper.getInchi(args2);
  	
  	
  	// third, call generate