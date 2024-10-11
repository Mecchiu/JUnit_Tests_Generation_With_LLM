// LineReaderTest.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains ten unit test cases for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReaderTest {

		private static final String FILE_NAME = "test.txt";
		private static final String FILE_CONTENT = "line1\nline2\nline3\nline4\nline5\nline6\nline7\nline8\nline9\nline10\n";
		private static final int FILE_LENGTH = FILE_CONTENT.length();
		private static final int FILE_NB_LINES = 10;
		
		private static final int FROM_LINE_1 = 1;
		private static final int TO_LINE_1 = 1;
		private static final int FROM_LINE_2 = 1;
		private static final int TO_LINE_2 = 2;
		private static final int FROM_LINE_3 = 1;
		private static final int TO_LINE_3 = 3;
		private static final int FROM_LINE_4 = 1;
		private static final int TO_LINE_4 = 4;
		private static final int FROM_LINE_5 = 1;
		private static final int TO_LINE_5 = 5;
		private static final int FROM_LINE_6 = 1;
		private static final int TO_LINE_6 = 6;
		private static final int FROM_LINE_7 = 1;
		private static final int TO_LINE_7 = 7;
		private static final int FROM_LINE_8 = 1;
		private static final int TO_LINE_8 = 8;
		private static final int FROM_LINE_9 = 1;
		private static final int TO_LINE_9 = 9;
		private static final int FROM_LINE_10 = 1;
		private static final int TO_LINE_10 = 10;
		private static final int FROM_LINE_11 = 1;
		private static final int TO_LINE_11 = 11;
		private static final int FROM_LINE_12 = 1;
		private static final int TO_LINE_12 = 12;
		
		private static final String LINE_1 = "line1";
		private static final String LINE_2 = "line2";
		private static final String LINE_3 = "line3";
		private static final String LINE_4 = "line4";
		private static final String LINE_5 = "line5";
		private static final String LINE_6 = "line6";
		private static final String LINE_7 = "line7";
		private static final String LINE_8 = "line8";
		private static final String LINE_9 = "line9";
		private static final String LINE_10 = "line10";
		private static final String LINE_11 = "";
		private static final String LINE_12 = "";
		
		private static final int OFFSET_LINE_1 = 0;
		private static final int OFFSET_LINE_2 = 6;
		private static final int OFFSET_LINE_3 = 12;
		private static final int OFFSET_LINE_4 = 18;
		private static final int OFFSET_LINE_5 = 24;
		private static final int OFFSET_LINE_6 = 30;
		private static final int OFFSET_LINE_7 = 36;
		private static final int OFFSET_LINE_8 = 42;
		private static final int OFFSET_LINE_9 = 48;
		private static final int OFFSET_LINE_10 = 54;
		private static final int OFFSET_LINE_11 = 60;
		private static final int OFFSET_LINE_12 = 60;
		
		private static final int NB_LINES_1 = 1;
		private static final int NB_LINES_2 = 2;
		private static final int NB_LINES_3 = 3;
		private static final int NB_LINES_4 = 4;
		private static final int NB_LINES_5 = 5;
		private static final int NB_LINES_6 = 6;
		private static final int NB_LINES_7 = 7;
		private static final int NB_LINES_8 = 8;
		private static final int NB_LINES_9 = 9;
		private static final int NB_LINES_10 = 10;
		private static final int NB_LINES_11 = 11;
		private static final int NB_LINES_12 = 12;
		
		private static final int EXPECTED_SIZE_1 = 1;
		private static final int EXPECTED_SIZE_2 = 2;
		private static final int EXPECTED_SIZE_3 = 3;
		private static final int EXPECTED_SIZE_4 = 4;
		private static final int EXPECTED_SIZE_5 = 5;
		private static final int EXPECTED_SIZE_6 = 6;
		private static final int EXPECTED_SIZE_7 = 7;
		private static final int EXPECTED_SIZE_8 = 8;
		private static final int EXPECTED_SIZE_9 = 9;
		private static final int EXPECTED_SIZE_10 = 10;
		private static final int EXPECTED_SIZE_11 = 11;
		private static final int EXPECTED_SIZE_12 = 12;
		
		private static final int EXPECTED_INDEX_1 = 0;
		private static final int EXPECTED_INDEX_2 = 1;
		private static final int EXPECTED_INDEX_3 = 2;
		private static final int EXPECTED_INDEX_4 = 3;
		private static final int EXPECTED_INDEX_5 = 4;
		private static final int EXPECTED_INDEX_6 = 5;
		private static final int EXPECTED_INDEX_7 = 6;
		private static final int EXPECTED_INDEX_8 = 7;
		private static final int EXPECTED_INDEX_9 = 8;
		private static final int EXPECTED_INDEX_10 = 9;
		private static final int EXPECTED_INDEX_11 = 10;
		private static final int EXPECTED_INDEX_12 = 11;
		
		private static final int EXPECTED_OFFSET_1 = 0;
		private static final int EXPECTED_OFFSET_2 = 6;
		private static final int EXPECTED_OFFSET_3 = 12;
		private static final int EXPECTED_OFFSET_4 = 18;
		private static final int EXPECTED_OFFSET_5 = 24;
		private static final int EXPECTED_OFFSET_6 = 30;
		private static final int EXPECTED_OFFSET_7 = 36;
		private static final int EXPECTED_OFFSET_8 = 42;
		private static final int EXPECTED_OFFSET_9 = 48;
		private static final int EXPECTED_OFFSET_10 = 54;
		private static final int EXPECTED_OFFSET_11 = 60;
		private static final int EXPECTED_OFFSET_12 = 60;
		
		private static final int EXPECTED_LENGTH_1 = 6;
		private static final int EXPECTED_LENGTH_2 = 6;
		private static final int EXPECTED_LENGTH_3 = 6;
		private static final int EXPECTED_LENGTH_4 = 6;
		private static final int EXPECTED_LENGTH_5 = 6;
		private static final int EXPECTED_LENGTH_6 = 6;
		private static final int EXPECTED_LENGTH_7 = 6;
		private static final int EXPECTED_LENGTH_8 = 6;
		private static final int EXPECTED_LENGTH_9 = 6;
		private static final int EXPECTED_LENGTH_10 = 6;
		private static final int EXPECTED_LENGTH_11 = 0;
		private static final int EXPECTED_LENGTH_12 = 0;
		
		private static final int EXPECTED_CONTENT_1 = 0;
		private static final int EXPECTED_CONTENT_2 = 6;
		private static final int EXPECTED_CONTENT_3 = 12;
		private static final int EXPECTED_CONTENT_4 = 18;
		private static final int EXPECTED_CONTENT_5 = 24;
		private static final int EXPECTED_CONTENT_6 = 30;
		private static final int EXPECTED_CONTENT_7 = 36;
		private static final int EXPECTED_CONTENT_8 = 42;
		private static final int EXPECTED_CONTENT_9 = 48;
		private static final int EXPECTED_CONTENT_10 = 54;
		private static final int EXPECTED_CONTENT_11 = 60;
		private static final int EXPECTED_CONTENT_12 = 60;
		
		private static final int EXPECTED_END_1 = 6;
		private static final int EXPECTED_END_2 = 12;
		private static final int EXPECTED_END_3 = 18;
		private static final int EXPECTED_END_4 = 24;
		private static final int EXPECTED_END_5 = 30;
		private static final int EXPECTED_END_6 = 36;
		private static final int EXPECTED_END_7 = 42;
		private static final int EXPECTED_END_8 = 48;
		private static final int EXPECTED_END_9 = 54;
		private static final int EXPECTED_END_10 = 60;
		private static final int EXPECTED_END_11 = 60;
		private static final int EXPECTED_END_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_1 = 0;
		private static final int EXPECTED_FILE_POINTER_2 = 6;
		private static final int EXPECTED_FILE_POINTER_3 = 12;
		private static final int EXPECTED_FILE_POINTER_4 = 18;
		private static final int EXPECTED_FILE_POINTER_5 = 24;
		private static final int EXPECTED_FILE_POINTER_6 = 30;
		private static final int EXPECTED_FILE_POINTER_7 = 36;
		private static final int EXPECTED_FILE_POINTER_8 = 42;
		private static final int EXPECTED_FILE_POINTER_9 = 48;
		private static final int EXPECTED_FILE_POINTER_10 = 54;
		private static final int EXPECTED_FILE_POINTER_11 = 60;
		private static final int EXPECTED_FILE_POINTER_12 = 60;
		
		private static final int EXPECTED_FILE_LENGTH_1 = 60;
		private static final int EXPECTED_FILE_LENGTH_2 = 60;
		private static final int EXPECTED_FILE_LENGTH_3 = 60;
		private static final int EXPECTED_FILE_LENGTH_4 = 60;
		private static final int EXPECTED_FILE_LENGTH_5 = 60;
		private static final int EXPECTED_FILE_LENGTH_6 = 60;
		private static final int EXPECTED_FILE_LENGTH_7 = 60;
		private static final int EXPECTED_FILE_LENGTH_8 = 60;
		private static final int EXPECTED_FILE_LENGTH_9 = 60;
		private static final int EXPECTED_FILE_LENGTH_10 = 60;
		private static final int EXPECTED_FILE_LENGTH_11 = 60;
		private static final int EXPECTED_FILE_LENGTH_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_1_1 = 0;
		private static final int EXPECTED_FILE_POINTER_1_2 = 6;
		private static final int EXPECTED_FILE_POINTER_1_3 = 12;
		private static final int EXPECTED_FILE_POINTER_1_4 = 18;
		private static final int EXPECTED_FILE_POINTER_1_5 = 24;
		private static final int EXPECTED_FILE_POINTER_1_6 = 30;
		private static final int EXPECTED_FILE_POINTER_1_7 = 36;
		private static final int EXPECTED_FILE_POINTER_1_8 = 42;
		private static final int EXPECTED_FILE_POINTER_1_9 = 48;
		private static final int EXPECTED_FILE_POINTER_1_10 = 54;
		private static final int EXPECTED_FILE_POINTER_1_11 = 60;
		private static final int EXPECTED_FILE_POINTER_1_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_2_1 = 6;
		private static final int EXPECTED_FILE_POINTER_2_2 = 12;
		private static final int EXPECTED_FILE_POINTER_2_3 = 18;
		private static final int EXPECTED_FILE_POINTER_2_4 = 24;
		private static final int EXPECTED_FILE_POINTER_2_5 = 30;
		private static final int EXPECTED_FILE_POINTER_2_6 = 36;
		private static final int EXPECTED_FILE_POINTER_2_7 = 42;
		private static final int EXPECTED_FILE_POINTER_2_8 = 48;
		private static final int EXPECTED_FILE_POINTER_2_9 = 54;
		private static final int EXPECTED_FILE_POINTER_2_10 = 60;
		private static final int EXPECTED_FILE_POINTER_2_11 = 60;
		private static final int EXPECTED_FILE_POINTER_2_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_3_1 = 12;
		private static final int EXPECTED_FILE_POINTER_3_2 = 18;
		private static final int EXPECTED_FILE_POINTER_3_3 = 24;
		private static final int EXPECTED_FILE_POINTER_3_4 = 30;
		private static final int EXPECTED_FILE_POINTER_3_5 = 36;
		private static final int EXPECTED_FILE_POINTER_3_6 = 42;
		private static final int EXPECTED_FILE_POINTER_3_7 = 48;
		private static final int EXPECTED_FILE_POINTER_3_8 = 54;
		private static final int EXPECTED_FILE_POINTER_3_9 = 60;
		private static final int EXPECTED_FILE_POINTER_3_10 = 60;
		private static final int EXPECTED_FILE_POINTER_3_11 = 60;
		private static final int EXPECTED_FILE_POINTER_3_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_4_1 = 18;
		private static final int EXPECTED_FILE_POINTER_4_2 = 24;
		private static final int EXPECTED_FILE_POINTER_4_3 = 30;
		private static final int EXPECTED_FILE_POINTER_4_4 = 36;
		private static final int EXPECTED_FILE_POINTER_4_5 = 42;
		private static final int EXPECTED_FILE_POINTER_4_6 = 48;
		private static final int EXPECTED_FILE_POINTER_4_7 = 54;
		private static final int EXPECTED_FILE_POINTER_4_8 = 60;
		private static final int EXPECTED_FILE_POINTER_4_9 = 60;
		private static final int EXPECTED_FILE_POINTER_4_10 = 60;
		private static final int EXPECTED_FILE_POINTER_4_11 = 60;
		private static final int EXPECTED_FILE_POINTER_4_12 = 60;
		
		private static final int EXPECTED_FILE_POINTER_5_1 = 24;
		private static final int EXPECTED_FILE_POINTER_5_2 = 30;
		private static final int EXPECTED_FILE_POINTER_5_3 = 36;
		private static final int EXPECTED_FILE_POINTER_5_4 = 42;
		private static final int EXPECTED_FILE_POINTER_