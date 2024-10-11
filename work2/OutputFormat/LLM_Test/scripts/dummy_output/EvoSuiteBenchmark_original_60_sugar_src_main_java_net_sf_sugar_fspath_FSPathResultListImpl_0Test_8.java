// FSPathResultListImpl_0Test.java
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
* It contains one unit test case for the {@link FSPathResultListImpl#each(Callback)} method.
*/
class FSPathResultListImpl_0Test {
		
	@Test
	public void testEqualsAndHashCode() throws IOException, OperationNotPermittedException { //This should be tested the same way for all other FSPathResult implementations
		File in = null;
		FSPathResult lhs = null;
		FSPathResult rhs = null;    
		ArrayList<File> files = new ArrayList<File>();
        ArrayList<Integer> fileids = new ArrayList<Integer>();
        
		int i=0;
}
}