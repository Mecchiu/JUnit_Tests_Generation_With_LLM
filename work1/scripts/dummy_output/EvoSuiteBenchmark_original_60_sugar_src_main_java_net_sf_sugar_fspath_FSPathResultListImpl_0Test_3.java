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
		
	public FSPathResultListImpl_0Test() {
	}
	
		@Test
		public void call(final Callback callback) throws IOException {
			long start = System.currentTimeMillis();
			FSPathResultListImpl list = new FSPathResultListImpl();
			list.delete();
			list.query();
			System.out.println("Deleted all files as expected in " + (System.currentTimeMillis() - start) + " milliseconds");
			
			long startCopy = System.currentTimeMillis();
			match = Pattern.compile("(.*)\\.([0-9]+)");
}
}