// DocumentSet_0Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
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
class DocumentSet_0Test {
		   
  @Test
  public void check()
    {
      DocumentSet ds1 = new DocumentSet();
      ds1.register(new Document());
      DocumentSet ds2 = new DocumentSet();
      ds2.register(new Document());
      DocumentSet ds3 = new DocumentSet();
      ds3.register(new Document());
    }
}