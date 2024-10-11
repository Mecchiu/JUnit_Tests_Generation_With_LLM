// DocumentSetTest.java


import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains one unit test case for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSetTest {
 @Test
		  public void test() {
				   System.out.println ( "test documentSet().documentCount()" );
		       synchronized( documentCount_Mutex ) {
			      documentCount = 2; // reset
			    }

		       synchronized( documentCount_Mutex ) {			
			      documentCount = 3; // reset
		    	}
		     }
}
