// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
// FSPathResultListImpl.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author kbishop
 * @version $Id$
 */
public class FSPathResultListImpl extends ArrayList<FSPathResult> implements FSPathResultList {

    /**
     *  Deletes each file contained in this FSPathResultList.
     *  <br/>
     *  <pre>
     *  ************************************************************************
     *  *               IMPORTANT!!!!!    Use with caution                    *
     *  *   This method makes it extremely easy to trash your filesystem       *
     *  *   Its advised that FSPath queries are tested thouroughly before use  *
     *  *   in order to verify which files would be deleted                    *
     *  *                                                                      *
     *  ************************************************************************
     *  </pre>
     *
     * @returns FSPathResultModificationListImpl - all successfully deleted files<br/>
     *  will be added as a success, and the failures will be added as failures.
     * @throws IOException - NOTE this method does not currently thrown an IOException
     * @throws OperationNotPermittedException - this exception will be thrown if<br/>
     *  The FSPathResult objects contained in this FSPathResultList don't contain<br/>
     *  java.io.File objects<br/>
     *  (i.e the FSPath query was written to return Boolean, String nor numerical results).
     */
    public FSPathResultModificationList delete() throws IOException, OperationNotPermittedException;
}

// FSPathResultListImpl_1Test.java
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains one unit test case for the {@link FSPathResultListImpl#delete()} method.
*/
class FSPathResultListImpl_1Test {
		
	/** Tests with invalid syntax */ 
	@Test(expected = OperationNotPermittedException.class)
	public void noFileDeletion() throws IOException, OperationNotPermittedException {
		(new FSPathResultListImpl())
			.delete();
	}

	/** Tests with good syntax */
	@Test
	public void successfulOperation() throws IOException, OperationNotPermittedException {
		FSPath f = (new FSPath())
           .append("abc.fsp","abc.gsp")
           .append("abc.gsp");
        FSPathResultList resultA = f.delete();

        assertEquals(f.getFile().getName(), "abc");
        assertEquals(f.getFile().getParent(), null);
        assertEquals(resultA.getFile().getName(), "bc.gsp");
        assertEquals(resultA.getFile().getParent(), null);
		assertTrue(resultA.getResult().isSuccess());

	}

	/** Tests delete failure */ 
	@Test
	public void fspathIsValid() throws IOException, OperationNotPermittedException {
		FSPath f = (new FSPath(0)) 
			.append("abc.fsp")
			.append(".fsp");

        assertTrue(f.getFile().exists());
        assertTrue(new File(f.getFile().getCanonicalPath()).isFile());

	}

}
