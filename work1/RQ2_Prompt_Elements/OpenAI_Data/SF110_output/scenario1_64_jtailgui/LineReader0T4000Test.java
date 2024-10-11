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

		private static final String FILE_NAME = "src/test/resources/test.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES = "src/test/resources/test_with_empty_lines.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES_AT_THE_END = "src/test/resources/test_with_empty_lines_at_the_end.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES_AT_THE_BEGINNING = "src/test/resources/test_with_empty_lines_at_the_beginning.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END = "src/test/resources/test_with_empty_lines_at_the_beginning_and_the_end.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "src/test/resources/test_with_empty_lines_at_the_beginning_and_the_end_and_in_the_middle.txt";
		private static final String FILE_NAME_WITH_EMPTY_LINES_IN_THE_MIDDLE = "src/test/resources/test_with_empty_lines_in_the_middle.txt";
		private static final String FILE_NAME_WITH_ONE_LINE = "src/test/resources/test_with_one_line.txt";
		private static final String FILE_NAME_WITH_ONE_LINE_WITH_ONE_CHARACTER = "src/test/resources/test_with_one_line_with_one_character.txt";
		private static final String FILE_NAME_WITH_ONE_LINE_WITH_TWO_CHARACTERS = "src/test/resources/test_with_one_line_with_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES = "src/test/resources/test_with_two_lines.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_ONE_CHARACTER = "src/test/resources/test_with_two_lines_with_one_character.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWO_CHARACTERS = "src/test/resources/test_with_two_lines_with_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THREE_CHARACTERS = "src/test/resources/test_with_two_lines_with_three_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FOUR_CHARACTERS = "src/test/resources/test_with_two_lines_with_four_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_five_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_SIX_CHARACTERS = "src/test/resources/test_with_two_lines_with_six_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_SEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_seven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_EIGHT_CHARACTERS = "src/test/resources/test_with_two_lines_with_eight_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_NINE_CHARACTERS = "src/test/resources/test_with_two_lines_with_nine_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_ten_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_ELEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_eleven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWELVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_twelve_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FOURTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_fourteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_SIXTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_sixteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_SEVENTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_seventeen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_EIGHTEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_eighteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_NINETEEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_nineteen_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_ONE_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_one_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_TWO_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_THREE_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_three_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_FOUR_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_four_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_FIVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_five_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_SIX_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_six_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_SEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_seven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_EIGHT_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_eight_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_TWENTY_NINE_CHARACTERS = "src/test/resources/test_with_two_lines_with_twenty_nine_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_ONE_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_one_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_TWO_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_THREE_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_three_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_FOUR_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_four_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_FIVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_five_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_SIX_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_six_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_SEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_seven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_EIGHT_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_eight_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_THIRTY_NINE_CHARACTERS = "src/test/resources/test_with_two_lines_with_thirty_nine_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_ONE_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_one_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_TWO_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_THREE_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_three_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_FOUR_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_four_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_FIVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_five_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_SIX_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_six_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_SEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_seven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_EIGHT_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_eight_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FORTY_NINE_CHARACTERS = "src/test/resources/test_with_two_lines_with_forty_nine_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_ONE_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_one_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_TWO_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_two_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_THREE_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_three_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_FOUR_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_four_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_FIVE_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_five_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_SIX_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_six_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_SEVEN_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_seven_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_EIGHT_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_eight_characters.txt";
		private static final String FILE_NAME_WITH_TWO_LINES_WITH_FIFTY_NINE_CHARACTERS = "src/test/resources/test_with_two_lines_with_fifty_nine_characters.txt