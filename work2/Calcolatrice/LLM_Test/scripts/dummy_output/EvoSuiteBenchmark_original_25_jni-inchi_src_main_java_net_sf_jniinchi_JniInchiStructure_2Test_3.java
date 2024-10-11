// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {
		 public static void main(String args[]) {
					System.exit(new JniInchiStructure_2Test().test1());

// 			System.exit(new JniInchiStructure_2Test().test2());
  }

	@Test
	public void
    test1() {
		JniInchiStructure structure;
	
		structure = new JniInchiStructure();
		structure.addStereo0D(new JniInchiStereo0D(0));
		System.out.println("Initialize " + structure.toString());
		structure = new JniInchiStructure();
		structure.addStereo0D(new JniInchiStereo0D(1));
		System.out.println("Initialized " + structure.toString());
		
		List<String> parsedList = new JniInchiStructure().addStereo0D(new JniInchiStereo0D(0));
		assertNotNull("parsedList", parsedList);
	
		structure = new JniInchiStructure();
		structure.addStereo0D(new JniInchiStereo0D(1));
		System.out.println("parsedList " + structure.toString());
		assertEquals("parsedList incorrect", 2, parsedList.size());
		assertTrue("parsedList incorrect is 1, should be 0", parsedList.equals(new ArrayList<String>(ArrayList.class)));

    }
	
	@Test
    public void
    test2() {
		List<String> parsedList = new JniInchiStructure().addStereo0D(new JniInchiStereo0D(0));
		assertNotNull("parsedList", parsedList);
		assertFalse("parsedList must not be null", parsedList.isEmpty());
		assertTrue("parsedList is empty", parsedList.size() == 1);
		
		JniInchiStereo0D parity = new JniInchiStereo0D(0);
		parsedList = new JniInchiStructure().addStereo0D(parity);
		System.out.println("parsedList " + parsedList);
		assertEquals("parsedList incorrect", 2, parsedList.size());
		assertTrue("parsedList incorrect is 0, should be 1", parsedList.equals(new ArrayList<String>(ArrayList.class)));

    }

}