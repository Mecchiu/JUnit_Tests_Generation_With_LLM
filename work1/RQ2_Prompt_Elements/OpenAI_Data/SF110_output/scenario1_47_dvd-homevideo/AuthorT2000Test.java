// AuthorTest.java


import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Author}.
* It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
*/
class AuthorTest {

	/**
	* Test case for {@link Author#CreateDVDFileStructure(GUI)} method.
	* It tests the case where the dvdauthor command is not found.
	*/
	@Test
	void testCreateDVDFileStructure_dvdauthor_not_found() {
		Author author = new Author();
		GUI DVD_GUI = new GUI();
		DVD_GUI.strOutputDir = "test_output";
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("\\", "/");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(" ", "\\ ");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("(", "\\(");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(")", "\\)");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("'", "\\'");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(";", "\\;");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("&", "\\&");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("$", "\\$");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("!", "\\!");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("*", "\\*");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("?", "\\?");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("[", "\\[");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("]", "\\]");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("{", "\\{");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("}", "\\}");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("|", "\\|");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("`", "\\`");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("\"", "\\\"");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("<", "\\<");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(">", "\\>");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("#", "\\#");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("~", "\\~");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("%", "\\%");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("@", "\\@");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("$", "\\$");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("^", "\\^");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("&", "\\&");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("+", "\\+");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("=", "\\=");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(",", "\\,");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(".", "\\.");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("/", "\\/");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("-", "\\-");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("_", "\\_");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("\\", "\\\\");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(" ", "\\ ");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("(", "\\(");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(")", "\\)");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("'", "\\'");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(";", "\\;");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("&", "\\&");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("$", "\\$");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("!", "\\!");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("*", "\\*");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("?", "\\?");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("[", "\\[");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("]", "\\]");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("{", "\\{");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("}", "\\}");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("|", "\\|");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("`", "\\`");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("\"", "\\\"");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("<", "\\<");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(">", "\\>");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("#", "\\#");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("~", "\\~");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("%", "\\%");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("@", "\\@");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("$", "\\$");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("^", "\\^");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("&", "\\&");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("+", "\\+");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("=", "\\=");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(",", "\\,");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(".", "\\.");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("/", "\\/");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("-", "\\-");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("_", "\\_");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace("\\", "\\\\");
		DVD_GUI.strOutputDir = DVD_GUI.strOutputDir.replace(" ", "\\ ");
		DVD_GUI.strOutputDir = DVD_GUI