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
    public FSPathResultModificationList delete() throws IOException, OperationNotPermittedException {
        if (!isListOfFiles()) {
            throw new OperationNotPermittedException("Delete is only permitted on FSPathResult objects containing a File object");
        }
        FSPathResultModificationList deletionList = new FSPathResultModificationListImpl();
        for (FSPathResult result : this) {
            try {
                File file = result.getFile();
                boolean success = file.delete();
                if (success) {
                    deletionList.addSuccess(result);
                } else {
                    deletionList.addFailure(result);
                }
            } catch (Exception e) {
                //todo: log this?
                deletionList.addFailure(result);
            }
        }
        return deletionList;
    }
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
		
	@Test
	public void test(){
		ArrayList<FSPathResult> fspathResults = new ArrayList<FSPathResult>(4);
		FSPathResult test1 = new FSPathResult("p1", new FSPathData("data1"));
		FSPathResult test2 = new FSPathResult("p2", new FSPathData("data2"));
		fspathResults.add(test1);
		fspathResults.add(test2);
		
		FSPathResultModificationList expectedModList = new FSPathResultModificationListImpl();
		expectedModList.addFailure(test1);
		expectedModList.addFailure(test2);
		
		FSPathResultListImpl resultList = new FSPathResultListImpl();
		resultList.add(fspathResults);
		resultList.add(expectedModList);

		FSPathResultModificationList modificationList = resultList.delete();
		assertNotNull(modificationList);
		// We can stop looking for the files when we finished deleting 1
		assertFalse(modificationList.contains(fspathResults.get(0)));
		if (modificationList.hasErrors()) {
			assertFalse(modificationList.hasErrors());
			verifyMismatches(fspathResults);
		}
	}
	
	private void verifyMismatches(ArrayList<FSPathResult> fspathResults) throws IOException {
		StringBuilder lineBuffer = new StringBuilder();
		String indent = "";
		while (modificationListHasErrors()) {
			lineBuffer.append(indent);
		}
		for (FSPathResult mod : fspathResults) {
			lineBuffer.append(mod.getErrorMessage());
		}
		System.out.println("");
		System.out.println(lineBuffer.toString());
		assertTrue(lineBuffer.toString(), fspathResults.get(0).equals(fspathResults.get(1)));
		assertTrue(lineBuffer.toString(), fspathResults.get(2).equals(fspathResults.get(3)));
		if (!modificationListHasErrors()) {
			assertFalse(lineBuffer.toString(), modificationList.contains(fspathResults.get(2)));
		}
	}
	
	private boolean modificationListHasErrors() {
		return!modificationList.contains(fspathResults.get(0)) && modificationList.contains(fspathResults.get(2)) && modificationList.contains(fspathResults.get(3));
	}
	
}
//FSPathResultListImpl_1Test.java
//package net.sf.sugar.fspath;
