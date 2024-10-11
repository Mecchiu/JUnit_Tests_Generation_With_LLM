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
		
		private static final int LINE_COUNT_IN_BLOCK = 3;
		
		private static final int FIRST_LINE_IN_BLOCK = 1;
		private static final int LAST_LINE_IN_BLOCK = FIRST_LINE_IN_BLOCK + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_2 = LAST_LINE_IN_BLOCK + 1;
		private static final int LAST_LINE_IN_BLOCK_2 = FIRST_LINE_IN_BLOCK_2 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_3 = LAST_LINE_IN_BLOCK_2 + 1;
		private static final int LAST_LINE_IN_BLOCK_3 = FIRST_LINE_IN_BLOCK_3 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_4 = LAST_LINE_IN_BLOCK_3 + 1;
		private static final int LAST_LINE_IN_BLOCK_4 = FIRST_LINE_IN_BLOCK_4 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_5 = LAST_LINE_IN_BLOCK_4 + 1;
		private static final int LAST_LINE_IN_BLOCK_5 = FIRST_LINE_IN_BLOCK_5 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_6 = LAST_LINE_IN_BLOCK_5 + 1;
		private static final int LAST_LINE_IN_BLOCK_6 = FIRST_LINE_IN_BLOCK_6 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_7 = LAST_LINE_IN_BLOCK_6 + 1;
		private static final int LAST_LINE_IN_BLOCK_7 = FIRST_LINE_IN_BLOCK_7 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_8 = LAST_LINE_IN_BLOCK_7 + 1;
		private static final int LAST_LINE_IN_BLOCK_8 = FIRST_LINE_IN_BLOCK_8 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_9 = LAST_LINE_IN_BLOCK_8 + 1;
		private static final int LAST_LINE_IN_BLOCK_9 = FIRST_LINE_IN_BLOCK_9 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_10 = LAST_LINE_IN_BLOCK_9 + 1;
		private static final int LAST_LINE_IN_BLOCK_10 = FIRST_LINE_IN_BLOCK_10 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_11 = LAST_LINE_IN_BLOCK_10 + 1;
		private static final int LAST_LINE_IN_BLOCK_11 = FIRST_LINE_IN_BLOCK_11 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_12 = LAST_LINE_IN_BLOCK_11 + 1;
		private static final int LAST_LINE_IN_BLOCK_12 = FIRST_LINE_IN_BLOCK_12 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_13 = LAST_LINE_IN_BLOCK_12 + 1;
		private static final int LAST_LINE_IN_BLOCK_13 = FIRST_LINE_IN_BLOCK_13 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_14 = LAST_LINE_IN_BLOCK_13 + 1;
		private static final int LAST_LINE_IN_BLOCK_14 = FIRST_LINE_IN_BLOCK_14 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_15 = LAST_LINE_IN_BLOCK_14 + 1;
		private static final int LAST_LINE_IN_BLOCK_15 = FIRST_LINE_IN_BLOCK_15 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_16 = LAST_LINE_IN_BLOCK_15 + 1;
		private static final int LAST_LINE_IN_BLOCK_16 = FIRST_LINE_IN_BLOCK_16 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_17 = LAST_LINE_IN_BLOCK_16 + 1;
		private static final int LAST_LINE_IN_BLOCK_17 = FIRST_LINE_IN_BLOCK_17 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_18 = LAST_LINE_IN_BLOCK_17 + 1;
		private static final int LAST_LINE_IN_BLOCK_18 = FIRST_LINE_IN_BLOCK_18 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_19 = LAST_LINE_IN_BLOCK_18 + 1;
		private static final int LAST_LINE_IN_BLOCK_19 = FIRST_LINE_IN_BLOCK_19 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_20 = LAST_LINE_IN_BLOCK_19 + 1;
		private static final int LAST_LINE_IN_BLOCK_20 = FIRST_LINE_IN_BLOCK_20 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_21 = LAST_LINE_IN_BLOCK_20 + 1;
		private static final int LAST_LINE_IN_BLOCK_21 = FIRST_LINE_IN_BLOCK_21 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_22 = LAST_LINE_IN_BLOCK_21 + 1;
		private static final int LAST_LINE_IN_BLOCK_22 = FIRST_LINE_IN_BLOCK_22 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_23 = LAST_LINE_IN_BLOCK_22 + 1;
		private static final int LAST_LINE_IN_BLOCK_23 = FIRST_LINE_IN_BLOCK_23 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_24 = LAST_LINE_IN_BLOCK_23 + 1;
		private static final int LAST_LINE_IN_BLOCK_24 = FIRST_LINE_IN_BLOCK_24 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_25 = LAST_LINE_IN_BLOCK_24 + 1;
		private static final int LAST_LINE_IN_BLOCK_25 = FIRST_LINE_IN_BLOCK_25 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_26 = LAST_LINE_IN_BLOCK_25 + 1;
		private static final int LAST_LINE_IN_BLOCK_26 = FIRST_LINE_IN_BLOCK_26 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_27 = LAST_LINE_IN_BLOCK_26 + 1;
		private static final int LAST_LINE_IN_BLOCK_27 = FIRST_LINE_IN_BLOCK_27 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_28 = LAST_LINE_IN_BLOCK_27 + 1;
		private static final int LAST_LINE_IN_BLOCK_28 = FIRST_LINE_IN_BLOCK_28 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_29 = LAST_LINE_IN_BLOCK_28 + 1;
		private static final int LAST_LINE_IN_BLOCK_29 = FIRST_LINE_IN_BLOCK_29 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_30 = LAST_LINE_IN_BLOCK_29 + 1;
		private static final int LAST_LINE_IN_BLOCK_30 = FIRST_LINE_IN_BLOCK_30 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_31 = LAST_LINE_IN_BLOCK_30 + 1;
		private static final int LAST_LINE_IN_BLOCK_31 = FIRST_LINE_IN_BLOCK_31 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_32 = LAST_LINE_IN_BLOCK_31 + 1;
		private static final int LAST_LINE_IN_BLOCK_32 = FIRST_LINE_IN_BLOCK_32 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_33 = LAST_LINE_IN_BLOCK_32 + 1;
		private static final int LAST_LINE_IN_BLOCK_33 = FIRST_LINE_IN_BLOCK_33 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_34 = LAST_LINE_IN_BLOCK_33 + 1;
		private static final int LAST_LINE_IN_BLOCK_34 = FIRST_LINE_IN_BLOCK_34 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_35 = LAST_LINE_IN_BLOCK_34 + 1;
		private static final int LAST_LINE_IN_BLOCK_35 = FIRST_LINE_IN_BLOCK_35 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_36 = LAST_LINE_IN_BLOCK_35 + 1;
		private static final int LAST_LINE_IN_BLOCK_36 = FIRST_LINE_IN_BLOCK_36 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_37 = LAST_LINE_IN_BLOCK_36 + 1;
		private static final int LAST_LINE_IN_BLOCK_37 = FIRST_LINE_IN_BLOCK_37 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_38 = LAST_LINE_IN_BLOCK_37 + 1;
		private static final int LAST_LINE_IN_BLOCK_38 = FIRST_LINE_IN_BLOCK_38 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_39 = LAST_LINE_IN_BLOCK_38 + 1;
		private static final int LAST_LINE_IN_BLOCK_39 = FIRST_LINE_IN_BLOCK_39 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_40 = LAST_LINE_IN_BLOCK_39 + 1;
		private static final int LAST_LINE_IN_BLOCK_40 = FIRST_LINE_IN_BLOCK_40 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_41 = LAST_LINE_IN_BLOCK_40 + 1;
		private static final int LAST_LINE_IN_BLOCK_41 = FIRST_LINE_IN_BLOCK_41 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_42 = LAST_LINE_IN_BLOCK_41 + 1;
		private static final int LAST_LINE_IN_BLOCK_42 = FIRST_LINE_IN_BLOCK_42 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_43 = LAST_LINE_IN_BLOCK_42 + 1;
		private static final int LAST_LINE_IN_BLOCK_43 = FIRST_LINE_IN_BLOCK_43 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_44 = LAST_LINE_IN_BLOCK_43 + 1;
		private static final int LAST_LINE_IN_BLOCK_44 = FIRST_LINE_IN_BLOCK_44 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_45 = LAST_LINE_IN_BLOCK_44 + 1;
		private static final int LAST_LINE_IN_BLOCK_45 = FIRST_LINE_IN_BLOCK_45 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_46 = LAST_LINE_IN_BLOCK_45 + 1;
		private static final int LAST_LINE_IN_BLOCK_46 = FIRST_LINE_IN_BLOCK_46 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_47 = LAST_LINE_IN_BLOCK_46 + 1;
		private static final int LAST_LINE_IN_BLOCK_47 = FIRST_LINE_IN_BLOCK_47 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_48 = LAST_LINE_IN_BLOCK_47 + 1;
		private static final int LAST_LINE_IN_BLOCK_48 = FIRST_LINE_IN_BLOCK_48 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_49 = LAST_LINE_IN_BLOCK_48 + 1;
		private static final int LAST_LINE_IN_BLOCK_49 = FIRST_LINE_IN_BLOCK_49 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_50 = LAST_LINE_IN_BLOCK_49 + 1;
		private static final int LAST_LINE_IN_BLOCK_50 = FIRST_LINE_IN_BLOCK_50 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_51 = LAST_LINE_IN_BLOCK_50 + 1;
		private static final int LAST_LINE_IN_BLOCK_51 = FIRST_LINE_IN_BLOCK_51 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_52 = LAST_LINE_IN_BLOCK_51 + 1;
		private static final int LAST_LINE_IN_BLOCK_52 = FIRST_LINE_IN_BLOCK_52 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_53 = LAST_LINE_IN_BLOCK_52 + 1;
		private static final int LAST_LINE_IN_BLOCK_53 = FIRST_LINE_IN_BLOCK_53 + LINE_COUNT_IN_BLOCK;
		
		private static final int FIRST_LINE_IN_BLOCK_54 = LAST_LINE