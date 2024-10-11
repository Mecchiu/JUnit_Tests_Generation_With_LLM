// FileFollower_0Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains ten unit test cases for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {

		private static final Logger LOG = Logger.getLogger(FileFollower_0Test.class.getName());
		
		private static final String TEST_FILE_NAME = "test.txt";
		
		private static final String TEST_FILE_CONTENT = "This is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED = "This is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_TWICE = "This is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_THRICE = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_FOUR_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_FIVE_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_SIX_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_SEVEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_EIGHT_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_NINE_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_TEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_ELEVEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_TWELVE_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_THIRTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_FOURTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_FIFTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_SIXTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_SEVENTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.";
		
		private static final String TEST_FILE_CONTENT_APPENDED_EIGHTEEN_TIMES = "This is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file.\nThis is a test file