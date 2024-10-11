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
		private static final int FILE_SIZE = FILE_CONTENT.length();
		private static final int FILE_LINE_COUNT = 10;
		
		private static final int LINE_COUNT_FROM_1_TO_1 = 0;
		private static final int LINE_COUNT_FROM_1_TO_2 = 1;
		private static final int LINE_COUNT_FROM_1_TO_3 = 2;
		private static final int LINE_COUNT_FROM_1_TO_4 = 3;
		private static final int LINE_COUNT_FROM_1_TO_5 = 4;
		private static final int LINE_COUNT_FROM_1_TO_6 = 5;
		private static final int LINE_COUNT_FROM_1_TO_7 = 6;
		private static final int LINE_COUNT_FROM_1_TO_8 = 7;
		private static final int LINE_COUNT_FROM_1_TO_9 = 8;
		private static final int LINE_COUNT_FROM_1_TO_10 = 9;
		private static final int LINE_COUNT_FROM_1_TO_11 = 10;
		private static final int LINE_COUNT_FROM_1_TO_12 = 10;
		
		private static final int LINE_COUNT_FROM_2_TO_2 = 0;
		private static final int LINE_COUNT_FROM_2_TO_3 = 1;
		private static final int LINE_COUNT_FROM_2_TO_4 = 2;
		private static final int LINE_COUNT_FROM_2_TO_5 = 3;
		private static final int LINE_COUNT_FROM_2_TO_6 = 4;
		private static final int LINE_COUNT_FROM_2_TO_7 = 5;
		private static final int LINE_COUNT_FROM_2_TO_8 = 6;
		private static final int LINE_COUNT_FROM_2_TO_9 = 7;
		private static final int LINE_COUNT_FROM_2_TO_10 = 8;
		private static final int LINE_COUNT_FROM_2_TO_11 = 9;
		private static final int LINE_COUNT_FROM_2_TO_12 = 9;
		
		private static final int LINE_COUNT_FROM_3_TO_3 = 0;
		private static final int LINE_COUNT_FROM_3_TO_4 = 1;
		private static final int LINE_COUNT_FROM_3_TO_5 = 2;
		private static final int LINE_COUNT_FROM_3_TO_6 = 3;
		private static final int LINE_COUNT_FROM_3_TO_7 = 4;
		private static final int LINE_COUNT_FROM_3_TO_8 = 5;
		private static final int LINE_COUNT_FROM_3_TO_9 = 6;
		private static final int LINE_COUNT_FROM_3_TO_10 = 7;
		private static final int LINE_COUNT_FROM_3_TO_11 = 8;
		private static final int LINE_COUNT_FROM_3_TO_12 = 8;
		
		private static final int LINE_COUNT_FROM_4_TO_4 = 0;
		private static final int LINE_COUNT_FROM_4_TO_5 = 1;
		private static final int LINE_COUNT_FROM_4_TO_6 = 2;
		private static final int LINE_COUNT_FROM_4_TO_7 = 3;
		private static final int LINE_COUNT_FROM_4_TO_8 = 4;
		private static final int LINE_COUNT_FROM_4_TO_9 = 5;
		private static final int LINE_COUNT_FROM_4_TO_10 = 6;
		private static final int LINE_COUNT_FROM_4_TO_11 = 7;
		private static final int LINE_COUNT_FROM_4_TO_12 = 7;
		
		private static final int LINE_COUNT_FROM_5_TO_5 = 0;
		private static final int LINE_COUNT_FROM_5_TO_6 = 1;
		private static final int LINE_COUNT_FROM_5_TO_7 = 2;
		private static final int LINE_COUNT_FROM_5_TO_8 = 3;
		private static final int LINE_COUNT_FROM_5_TO_9 = 4;
		private static final int LINE_COUNT_FROM_5_TO_10 = 5;
		private static final int LINE_COUNT_FROM_5_TO_11 = 6;
		private static final int LINE_COUNT_FROM_5_TO_12 = 6;
		
		private static final int LINE_COUNT_FROM_6_TO_6 = 0;
		private static final int LINE_COUNT_FROM_6_TO_7 = 1;
		private static final int LINE_COUNT_FROM_6_TO_8 = 2;
		private static final int LINE_COUNT_FROM_6_TO_9 = 3;
		private static final int LINE_COUNT_FROM_6_TO_10 = 4;
		private static final int LINE_COUNT_FROM_6_TO_11 = 5;
		private static final int LINE_COUNT_FROM_6_TO_12 = 5;
		
		private static final int LINE_COUNT_FROM_7_TO_7 = 0;
		private static final int LINE_COUNT_FROM_7_TO_8 = 1;
		private static final int LINE_COUNT_FROM_7_TO_9 = 2;
		private static final int LINE_COUNT_FROM_7_TO_10 = 3;
		private static final int LINE_COUNT_FROM_7_TO_11 = 4;
		private static final int LINE_COUNT_FROM_7_TO_12 = 4;
		
		private static final int LINE_COUNT_FROM_8_TO_8 = 0;
		private static final int LINE_COUNT_FROM_8_TO_9 = 1;
		private static final int LINE_COUNT_FROM_8_TO_10 = 2;
		private static final int LINE_COUNT_FROM_8_TO_11 = 3;
		private static final int LINE_COUNT_FROM_8_TO_12 = 3;
		
		private static final int LINE_COUNT_FROM_9_TO_9 = 0;
		private static final int LINE_COUNT_FROM_9_TO_10 = 1;
		private static final int LINE_COUNT_FROM_9_TO_11 = 2;
		private static final int LINE_COUNT_FROM_9_TO_12 = 2;
		
		private static final int LINE_COUNT_FROM_10_TO_10 = 0;
		private static final int LINE_COUNT_FROM_10_TO_11 = 1;
		private static final int LINE_COUNT_FROM_10_TO_12 = 1;
		
		private static final int LINE_COUNT_FROM_11_TO_11 = 0;
		private static final int LINE_COUNT_FROM_11_TO_12 = 0;
		
		private static final int LINE_COUNT_FROM_12_TO_12 = 0;
		
		private static final int LINE_COUNT_FROM_13_TO_13 = 0;
		
		private static final int LINE_COUNT_FROM_0_TO_0 = 0;
		private static final int LINE_COUNT_FROM