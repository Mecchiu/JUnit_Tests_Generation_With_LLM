// InspirentoUtilities_0Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains one unit test case for the {@link InspirentoUtilities#tokenize(String)} method.
*/
class InspirentoUtilities_0Test {
		static {
				assert java.lang.System.getProperty("os.name").toLowerCase().equals("linux"
				     ), "This test can be run only on linux OS";
				assert java.lang.System.getProperty("os.arch").toLowerCase().toLowerCase().startsWith(
				    "x86"), "This test is only related to x86 OS";
		}
		
    /**
     * Creates a new instance of {@link InspirentoUtilities} class.
	 *
	 * @return a new instance of {@link InspirentoUtilities} class.
	 */
    @Test
    void tokenize() {
        /* This test can be executed as "unit tests" only. The output can be ignored */
        assert tokenize("file ; edit ; view") == new String[] { //
                                 "file", "edit", "view" //
        };
    }
    
    /**
     * Test case to a few empty string tokens.
	 *
	 * @return an empty string token.
	 */
 	public static String emptyString() {
 		return new String(""); //$NON-NLS-1$
 	}
 	
    /**
     * Test case to an empty value.
	 * 
	 * @return an empty value token.
	 */
	public static String[] emptyVector() {
        final Vector<String> vector = new Vector<String>();
        final String[] tokens = tokenize(new String() //$NON-NLS-1$
        {
        	   "file;edit;view" //$NON-NLS-1$
        });
        vector.addAll(tokens);
        return tokens;
        }
    
    /**
     * Test case to a null value.
	 * 
	 * @return a null value token.
	 */
    public static String[] nullVector() {
        final Vector<String> vector = new Vector<String>();
        final String[] tokens = tokenize(new String() //$NON-NLS-1$
        {
        	   "file;" //$NON-NLS-1$
        });
        vector.addAll(tokens);
        return tokens;
        }

	@Test
	void tokenize2() {

		assert tokenize(" ; edit ; view") == new String[] { //
			"  ", "  ", "  " //$NON-NLS-1$
        };
	}

    /**
     * Test case to an empty array token.
	 *
	 * @return an empty array token.
	 */
	public static int[][] emptyArray() {
        final int[][] array = new int[2][2];
        final String[] tokens = tokenize(new String() //$NON-NLS-1$
        {
        	   "file ; edit ; view" //$NON-NLS-1$
        });
        array[0][0] = tokens[0];
        array[1][0] = tokens[1];
        return array;
        }

	@Test
	void tokenize3() {

		assert tokenize(" file ; edit ; view") == new String[] { //
			"  ", "  ", "  " //$NON-NLS-1$ //$NON-NLS-2$
        };
	}

    /**
     * Test case to a null array token.
	 *
	 * @return a null array token.
	 */
    public static String[][] nullArray() {
        final String[][] array = new String[2][2];
        final String[] tokens = tokenize(new String() //$NON-NLS-1$
        {
        	   "   file ;" //$NON-NLS-1$
        });
        array[0][0] = tokens[0];
        array[1][0] = tokens[1];
        return array;
        }

	@Test
	void tokenize4() {

		assert tokenize(" file ; edit ; view") == new String[] { //
			". ;", "    edit", "  ;" //$NON-NLS-1$ //$NON-NLS-2$
        };
	}

    /**
     * Test case to a null array token.
	 *
	 * @return a null array token.
	 */
    public static String[][][] nullArray() {
        final String[][][] array = new String[2][2][];
        final String[] tokens = tokenize(new String() //$NON-NLS-1$
        {
        	   "file   ; edit ; view" //$NON-NLS-1$
        });
        array[0][0][0] = tokens[0];
        array[1][0][0] = tokens[1];
        return array;
        }
 
}