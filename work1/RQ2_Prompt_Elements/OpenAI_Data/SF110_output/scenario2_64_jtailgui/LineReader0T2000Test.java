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
* It contains ten unit test cases for the {@link LineReader#readLine(int)} method.
*/
class LineReaderTest {

		private static final String FILE_NAME = "test.txt";
		private static final String FILE_CONTENT = "line1\nline2\nline3\nline4\nline5\nline6\nline7\nline8\nline9\nline10\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES = "line1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_END = "line1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n\nline4\nline5\n\nline7\nline8\n\nline10\n\n\n";
		private static final String FILE_CONTENT_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "\n\nline1\nline2\n