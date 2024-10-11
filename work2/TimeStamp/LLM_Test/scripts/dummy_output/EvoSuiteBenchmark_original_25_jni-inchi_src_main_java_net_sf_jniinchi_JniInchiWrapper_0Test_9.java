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
		
    @Test
    public void test() throws NativeCodeException, TimeoutException, InterruptedException, JniInchiException {
        // test case 1
		String inchi = "C1" + JniInchiUtilities.LINE_DELIMITER;
		String inchi1 = "C2" + JniInchiUtilities.LINE_DELIMITER;
		String inchi2 = "C3" + JniInchiUtilities.LINE_DELIMITER;
		String inchi3 = "C4" + JniInchiUtilities.LINE_DELIMITER;
		String inchi4 = "C5" + JniInchiUtilities.LINE_DELIMITER;
		String inchi5 = "C6" + JniInchiUtilities.LINE_DELIMITER;
		String inchi6 = "C7" + JniInchiUtilities.LINE_DELIMITER;
		String inchi7 = "C8" + JniInchiUtilities.LINE_DELIMITER;
		String inchi8 = "C9" + JniInchiUtilities.LINE_DELIMITER;
		String inchi9 = "C10" + JniInchiUtilities.LINE_DELIMITER;
		String inchi10 = "C11" + JniInchiUtilities.LINE_DELIMITER;
		String inchi11 = "C12" + JniInchiUtilities.LINE_DELIMITER;
        String inchi12 = "C13" + JniInchiUtilities.LINE_DELIMITER;
		String inchi13 = "C14" + JniInchiUtilities.LINE_DELIMITER;
		String inchi14 = "C15" + JniInchiUtilities.LINE_DELIMITER;
		
		if (!JniInchiUtilities.isValidSrnaStructure(
				String.format("%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0)))) {
			throw new JniBoltException ("SRNA sequence " + inchi1 + " of the structure can only contain 'A' characters, 'T' characters, 'C' characters and 'G' characters. Check the input structure");
		}
		
        // test case 2
		String inchi = inchi + inchi1 + inchi2;
		String inchi1 = inchi % inchi1 + inchi2;
		String inchi2 = inchi % inchi1;
		
		Long long1 = JniInchiUtilities.getInchiKey(
				String.format("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
		
		assertEquals(long1, JniInchiUtilities.getInchiKey("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
        
        String inchi = inchi % inchi1 + inchi2;
        String inchi1 = inchi % inchi1 + inchi2;
        String inchi2 = inchi % inchi1;
        
        Long long2 = JniInchiUtilities.getInchiKey(
                String.format("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
        
        assertEquals(long2, JniInchiUtilities.getInchiKey("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
        
        // test case 3
        String inchi = inchi % inchi1 + inchi2;
        String inchi1 = inchi % inchi1 + inchi2;
        String inchi2 = inchi % inchi1;
        
        Long long3 = JniInchiUtilities.getInchiKey(
                String.format("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
        
        assertEquals(long3, JniInchiUtilities.getInchiKey("%s,%s,%s", inchi1.substring(1).charAt(0), inchi2.substring(1).charAt(0), inchi3.substring(1).charAt(0)));
        
        // test case 4
        try {
            inchi = inchi + inchi1;
            System.out.println(inchi);
            inchi1 = inchi % inchi1;
            System.out.println(inchi1);
            inchi = inchi % inchi1 + inchi2;
            System.out.println(inchi);
        } catch (Exception ex) {
        }
        try {
            inchi = inchi % inchi1 + inchi2 + inchi1;
            System.out.println(inchi);
            inchi1 = inchi % inchi1 + inchi2 + inchi1;
            System.out.println(inchi1);
            inchi = inchi % inchi1 + inchi2 + inchi1 + inchi;
            System.out.println(inchi);
        } catch (Exception ex) {
        }        
        inchi = inchi % inchi1;
        
}
}