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
		
	final static String PATHTREE = File.separator +"testtree"+ File.separator + "dirs"+ File.separator +"file.txt";
	final static String PATH = PATHTREE + File.separator + "dirs"+ File.separator + "file.txt";
	
	
	@Test
	public void delete_1() {
		//TODO implement
	}
	@Test
	public void rename() {
		//TODO implement
	}
	@Test
	public void move() {
		//TODO implement
	}

	@Test
	public void read() {
}
}