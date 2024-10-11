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
		
		private static final int FROM_LINE = 1;
		private static final int TO_LINE = 10;
		private static final int NB_LINES = TO_LINE - FROM_LINE;
		
		private static final int FROM_LINE_2 = 2;
		private static final int TO_LINE_2 = 9;
		private static final int NB_LINES_2 = TO_LINE_2 - FROM_LINE_2;
		
		private static final int FROM_LINE_3 = 3;
		private static final int TO_LINE_3 = 8;
		private static final int NB_LINES_3 = TO_LINE_3 - FROM_LINE_3;
		
		private static final int FROM_LINE_4 = 4;
		private static final int TO_LINE_4 = 7;
		private static final int NB_LINES_4 = TO_LINE_4 - FROM_LINE_4;
		
		private static final int FROM_LINE_5 = 5;
		private static final int TO_LINE_5 = 6;
		private static final int NB_LINES_5 = TO_LINE_5 - FROM_LINE_5;
		
		private static final int FROM_LINE_6 = 6;
		private static final int TO_LINE_6 = 5;
		private static final int NB_LINES_6 = TO_LINE_6 - FROM_LINE_6;
		
		private static final int FROM_LINE_7 = 7;
		private static final int TO_LINE_7 = 4;
		private static final int NB_LINES_7 = TO_LINE_7 - FROM_LINE_7;
		
		private static final int FROM_LINE_8 = 8;
		private static final int TO_LINE_8 = 3;
		private static final int NB_LINES_8 = TO_LINE_8 - FROM_LINE_8;
		
		private static final int FROM_LINE_9 = 9;
		private static final int TO_LINE_9 = 2;
		private static final int NB_LINES_9 = TO_LINE_9 - FROM_LINE_9;
		
		private static final int FROM_LINE_10 = 10;
		private static final int TO_LINE_10 = 1;
		private static final int NB_LINES_10 = TO_LINE_10 - FROM_LINE_10;
		
		private static final int FROM_LINE_11 = 11;
		private static final int TO_LINE_11 = 0;
		private static final int NB_LINES_11 = TO_LINE_11 - FROM_LINE_11;
		
		private static final int FROM_LINE_12 = 12;
		private static final int TO_LINE_12 = -1;
		private static final int NB_LINES_12 = TO_LINE_12 - FROM_LINE_12;
		
		private static final int FROM_LINE_13 = 13;
		private static final int TO_LINE_13 = -2;
		private static final int NB_LINES_13 = TO_LINE_13 - FROM_LINE_13;
		
		private static final int FROM_LINE_14 = 14;
		private static final int TO_LINE_14 = -3;
		private static final int NB_LINES_14 = TO_LINE_14 - FROM_LINE_14;
		
		private static final int FROM_LINE_15 = 15;
		private static final int TO_LINE_15 = -4;
		private static final int NB_LINES_15 = TO_LINE_15 - FROM_LINE_15;
		
		private static final int FROM_LINE_16 = 16;
		private static final int TO_LINE_16 = -5;
		private static final int NB_LINES_16 = TO_LINE_16 - FROM_LINE_16;
		
		private static final int FROM_LINE_17 = 17;
		private static final int TO_LINE_17 = -6;
		private static final int NB_LINES_17 = TO_LINE_17 - FROM_LINE_17;
		
		private static final int FROM_LINE_18 = 18;
		private static final int TO_LINE_18 = -7;
		private static final int NB_LINES_18 = TO_LINE_18 - FROM_LINE_18;
		
		private static final int FROM_LINE_19 = 19;
		private static final int TO_LINE_19 = -8;
		private static final int NB_LINES_19 = TO_LINE_19 - FROM_LINE_19;
		
		private static final int FROM_LINE_20 = 20;
		private static final int TO_LINE_20 = -9;
		private static final int NB_LINES_20 = TO_LINE_20 - FROM_LINE_20;
		
		private static final int FROM_LINE_21 = 21;
		private static final int TO_LINE_21 = -10;
		private static final int NB_LINES_21 = TO_LINE_21 - FROM_LINE_21;
		
		private static final int FROM_LINE_22 = 22;
		private static final int TO_LINE_22 = -11;
		private static final int NB_LINES_22 = TO_LINE_22 - FROM_LINE_22;
		
		private static final int FROM_LINE_23 = 23;
		private static final int TO_LINE_23 = -12;
		private static final int NB_LINES_23 = TO_LINE_23 - FROM_LINE_23;
		
		private static final int FROM_LINE_24 = 24;
		private static final int TO_LINE_24 = -13;
		private static final int NB_LINES_24 = TO_LINE_24 - FROM_LINE_24;
		
		private static final int FROM_LINE_25 = 25;
		private static final int TO_LINE_25 = -14;
		private static final int NB_LINES_25 = TO_LINE_25 - FROM_LINE_25;
		
		private static final int FROM_LINE_26 = 26;
		private static final int TO_LINE_26 = -15;
		private static final int NB_LINES_26 = TO_LINE_26 - FROM_LINE_26;
		
		private static final int FROM_LINE_27 = 27;
		private static final int TO_LINE_27 = -16;
		private static final int NB_LINES_27 = TO_LINE_27 - FROM_LINE_27;
		
		private static final int FROM_LINE_28 = 28;
		private static final int TO_LINE_28 = -17;
		private static final int NB_LINES_28 = TO_LINE_28 - FROM_LINE_28;
		
		private static final int FROM_LINE_29 = 29;
		private static final int TO_LINE_29 = -18;
		private static final int NB_LINES_29 = TO_LINE_29 - FROM_LINE_29;
		
		private static final int FROM_LINE_30 = 30;
		private static final int TO_LINE_30 = -19;
		private static final int NB_LINES_30 = TO_LINE_30 - FROM_LINE_30;
		
		private static final int FROM_LINE_31 = 31;
		private static final int TO_LINE_31 = -20;
		private static final int NB_LINES_31 = TO_LINE_31 - FROM_LINE_31;
		
		private static final int FROM_LINE_32 = 32;
		private static final int TO_LINE_32 = -21;
		private static final int NB_LINES_32 = TO_LINE_32 - FROM_