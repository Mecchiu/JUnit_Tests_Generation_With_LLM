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
		
    private static final String NEGATIVE = "-";
    
    @Test
	public void testNull() throws NativeCodeException {
	    assertNull(getInchiKey(NEGATIVE));
    }
    
    @Test
    public void testNullList() {
        assertNull(getInchiKey(null));
    }

        @Test
    public void testNormal() throws NativeCodeException {
	String inchiString= "InChI: " + "\n"
	         +"\t\t\t+\n"
	         +"\t\t+\n"
	         +"\t\t+\n"
	         +"\t\t+\n"
	         +"\t+\n"
	         +"\t+\n";
	
	JniInchiOutputKey output= getInchiKey(inchiString);
	
	assertEquals("InChI=",output.getMoleculeID());
        assertEquals("+\n",output.getAtomSymbols());
	assertEquals(" +\n",output.getBondSymbols());
	assertEquals("+\n",output.getParitySymbols());
    }

    private JniInchiOutputKey getInchiKey(String inchiString) throws JniInchiException {
        List<String> atomSymbols=
            new StringTokenizer(new String(NEGATIVE, " \t\n\v\f"), "\t\n\v\f")
               .nextToken();
        List<String> bondSymbols= new StringTokenizer(new String(NEGATIVE, " \t\n\v\f"), " \t ")
           .nextToken();
        List<String> paritySymbols= new StringTokenizer(new String(NEGATIVE, " \t\n\v\f"), " \t ")
           .nextToken();
        
        return new JniInchiOutputKey(0,
                                     NEGATIVE,
                                     "\n",
                                     inchiString,
                                     atomSymbols.toArray(new String[0]),
                                     bondSymbols.toArray(new String[0]),
                                     paritySymbols.toArray(new String[0]),
                                     atomSymbols.toArray(new String[0]),
                                     bondSymbols.toArray(new String[0]),
                                     paritySymbols.toArray(new String[0]),
                                     atomSymbols.toArray(new String[0]),
                                     bondSymbols.toArray(new String[0]),
                                     paritySymbols.toArray(new String[0]));
    	
    }        

    static class JniInchiOutputKey {

        private static final int BOND_ENDING = 0;
        private static final int BOND_DASHES = 1;
        private static final int BOND_MULTIPLE = 2;
        private static final int PARENTHESIS = 3;
        private static final int NEGATIVE = 4;
		public Object[] moleculeID;
		
        private int kind;
		public String moleculeIDStr;
		public Object[] atomSymbols;
		public Object[] bondSymbols;
		public Object[] paritiesSymbols;
		public Object[] atomSymbols0;
		public Object[] bondSymbols0;
		public Object[] paritiesSymbols0;

        public JniInchiOutputKey(int kind) {
            this.kind = kind;
        }
    }
}