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
		private static final int NB_LINES_32 = TO_LINE_32 - FROM_LINE_32;
		
		private static final int FROM_LINE_33 = 33;
		private static final int TO_LINE_33 = -22;
		private static final int NB_LINES_33 = TO_LINE_33 - FROM_LINE_33;
		
		private static final int FROM_LINE_34 = 34;
		private static final int TO_LINE_34 = -23;
		private static final int NB_LINES_34 = TO_LINE_34 - FROM_LINE_34;
		
		private static final int FROM_LINE_35 = 35;
		private static final int TO_LINE_35 = -24;
		private static final int NB_LINES_35 = TO_LINE_35 - FROM_LINE_35;
		
		private static final int FROM_LINE_36 = 36;
		private static final int TO_LINE_36 = -25;
		private static final int NB_LINES_36 = TO_LINE_36 - FROM_LINE_36;
		
		private static final int FROM_LINE_37 = 37;
		private static final int TO_LINE_37 = -26;
		private static final int NB_LINES_37 = TO_LINE_37 - FROM_LINE_37;
		
		private static final int FROM_LINE_38 = 38;
		private static final int TO_LINE_38 = -27;
		private static final int NB_LINES_38 = TO_LINE_38 - FROM_LINE_38;
		
		private static final int FROM_LINE_39 = 39;
		private static final int TO_LINE_39 = -28;
		private static final int NB_LINES_39 = TO_LINE_39 - FROM_LINE_39;
		
		private static final int FROM_LINE_40 = 40;
		private static final int TO_LINE_40 = -29;
		private static final int NB_LINES_40 = TO_LINE_40 - FROM_LINE_40;
		
		private static final int FROM_LINE_41 = 41;
		private static final int TO_LINE_41 = -30;
		private static final int NB_LINES_41 = TO_LINE_41 - FROM_LINE_41;
		
		private static final int FROM_LINE_42 = 42;
		private static final int TO_LINE_42 = -31;
		private static final int NB_LINES_42 = TO_LINE_42 - FROM_LINE_42;
		
		private static final int FROM_LINE_43 = 43;
		private static final int TO_LINE_43 = -32;
		private static final int NB_LINES_43 = TO_LINE_43 - FROM_LINE_43;
		
		private static final int FROM_LINE_44 = 44;
		private static final int TO_LINE_44 = -33;
		private static final int NB_LINES_44 = TO_LINE_44 - FROM_LINE_44;
		
		private static final int FROM_LINE_45 = 45;
		private static final int TO_LINE_45 = -34;
		private static final int NB_LINES_45 = TO_LINE_45 - FROM_LINE_45;
		
		private static final int FROM_LINE_46 = 46;
		private static final int TO_LINE_46 = -35;
		private static final int NB_LINES_46 = TO_LINE_46 - FROM_LINE_46;
		
		private static final int FROM_LINE_47 = 47;
		private static final int TO_LINE_47 = -36;
		private static final int NB_LINES_47 = TO_LINE_47 - FROM_LINE_47;
		
		private static final int FROM_LINE_48 = 48;
		private static final int TO_LINE_48 = -37;
		private static final int NB_LINES_48 = TO_LINE_48 - FROM_LINE_48;
		
		private static final int FROM_LINE_49 = 49;
		private static final int TO_LINE_49 = -38;
		private static final int NB_LINES_49 = TO_LINE_49 - FROM_LINE_49;
		
		private static final int FROM_LINE_50 = 50;
		private static final int TO_LINE_50 = -39;
		private static final int NB_LINES_50 = TO_LINE_50 - FROM_LINE_50;
		
		private static final int FROM_LINE_51 = 51;
		private static final int TO_LINE_51 = -40;
		private static final int NB_LINES_51 = TO_LINE_51 - FROM_LINE_51;
		
		private static final int FROM_LINE_52 = 52;
		private static final int TO_LINE_52 = -41;
		private static final int NB_LINES_52 = TO_LINE_52 - FROM_LINE_52;
		
		private static final int FROM_LINE_53 = 53;
		private static final int TO_LINE_53 = -42;
		private static final int NB_LINES_53 = TO_LINE_53 - FROM_LINE_53;
		
		private static final int FROM_LINE_54 = 54;
		private static final int TO_LINE_54 = -43;
		private static final int NB_LINES_54 = TO_LINE_54 - FROM_LINE_54;
		
		private static final int FROM_LINE_55 = 55;
		private static final int TO_LINE_55 = -44;
		private static final int NB_LINES_55 = TO_LINE_55 - FROM_LINE_55;
		
		private static final int FROM_LINE_56 = 56;
		private static final int TO_LINE_56 = -45;
		private static final int NB_LINES_56 = TO_LINE_56 - FROM_LINE_56;
		
		private static final int FROM_LINE_57 = 57;
		private static final int TO_LINE_57 = -46;
		private static final int NB_LINES_57 = TO_LINE_57 - FROM_LINE_57;
		
		private static final int FROM_LINE_58 = 58;
		private static final int TO_LINE_58 = -47;
		private static final int NB_LINES_58 = TO_LINE_58 - FROM_LINE_58;
		
		private static final int FROM_LINE_59 = 59;
		private static final int TO_LINE_59 = -48;
		private static final int NB_LINES_59 = TO_LINE_59 - FROM_LINE_59;
		
		private static final int FROM_LINE_60 = 60;
		private static final int TO_LINE_60 = -49;
		private static final int NB_LINES_60 = TO_LINE_60 - FROM_LINE_60;
		
		private static final int FROM_LINE_61 = 61;
		private static final int TO_LINE_61 = -50;
		private static final int NB_LINES_61 = TO_LINE_61 - FROM_LINE_61;
		
		private static final int FROM_LINE_62 = 62;
		private static final int TO_LINE_62 = -51;
		private static final int NB_LINES_62 = TO_LINE_62 - FROM_LINE_62;
		
		private static final int FROM_LINE_63 = 63;
		private static final int TO_LINE_63 = -52;
		private static final int NB_LINES_63 = TO_LINE_63 - FROM_LINE_63;
		
		private static final int FROM_LINE_64 = 64;
		private static final int TO_LINE_64 = -53;
		private static final int NB_LINES_64 = TO_LINE_64 - FROM_LINE_64;
		
		private static final int FROM_LINE_65 = 65;
		private static final int TO_LINE_65 = -54;
		private static final int NB_LINES_65 = TO_LINE_65 - FROM_LINE_65;
		
		private static final int FROM_LINE_66 =