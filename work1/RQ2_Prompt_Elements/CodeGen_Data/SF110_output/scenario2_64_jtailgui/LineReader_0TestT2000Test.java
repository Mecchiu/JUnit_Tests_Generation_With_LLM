// LineReader_0Test.java
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
* It contains one unit test case for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {

	/**
	 * Lit la ligne dont l'indice est passé en paramètre.
	 * L'indice est compris entre 0 et le numéro de lignes.
	 * Le tampon des {@link FileIndex} ont été créés pour une nouvelle ligne.
	 *
	 * @param index illeu du numéro de ligne à lire. L'indice est compris entre 0 et le nombre de lignes.
	 * @return le numéro de ligne à lire.
	 * @throws java.io.IOException si une erreur survient pendant la lecture
	 * @throws FileNotFoundException si l'adresse du fichier n'est pas déclarée
	*/
	@Test
	public void readLine_0_0_0() throws IOException{
		// Read line
		String line;
		// Line read
		line = new String(new byte[]{0});
		JTailLogger.info("Ligne {}", line);
		assertTrue(line.matches(File.separator));
		assertTrue(line.matches(":"));
		assertTrue(line.matches(File.separator));
		
		FileIndex index = new FileIndex();
		int lineNumber = line.indexOf(File.separator);
		assertEquals(0, lineNumber);
		assertFalse(line.contains("a"));
		assertFalse(line.contains("\""));
		assertTrue(line.contains("\"A"));
		assertTrue(line.contains("\"a"));
		assertFalse(line.endsWith("\""));
    	assertFalse(line.endsWith("\"A"));
    	assertTrue(line.endsWith("A"));
	}
	@Test
	public void readLine_0_0_1() throws IOException{
		// Read line
		String line;
		// Line read
		line = new String(new byte[]{0});
		JTailLogger.info("Ligne {}", line);
		assertTrue(line.matches(File.separator));
		assertTrue(line.matches(":"));
		assertTrue(line.matches(File.separator));
		
		FileIndex index = new FileIndex();
		// read line
		line = new String(new byte[]{0});
		
		int lineNumber = line.indexOf(File.separator);
		assertEquals(-1, lineNumber);
		assertFalse(line.contains("a"));
		assertFalse(line.contains("\""));
		assertTrue(line.contains("\"A"));
		assertTrue(line.contains("\"a"));
		assertTrue(line.contains("\"ab"));
		assertTrue(line.contains("\"abA"));
		assertFalse(line.endsWith("\""));
    	assertTrue(line.endsWith("\"Ab"));
		assertTrue(line.endsWith("\"A\"a"));
		assertTrue(line.endsWith("\"a\"a"));
		// read line
		line = new String(new byte[]{0});
		lineNumber = line.indexOf(File.separator);
		assertEquals(-1, lineNumber);
		assertFalse(line.contains("b"));
		assertFalse(line.contains("\""));
		assertTrue(line.contains("\"b"));
		assertTrue(line.contains("\"ba"));
		assertTrue(line.contains("\"baA"));
		assertTrue(line.contains("\"ab\""));
		assertTrue(line.contains("\"ababc\""));
		assertTrue(line.contains("\"abcab\""));
		assertTrue(line.contains("\"Abc\"a"));
		assertTrue(line.contains("\"a\"b\"A"));
		assertTrue(line.contains("\"a\"c\""));
		assertTrue(line.contains("Ca\"\"caAbc\"\"CaBbabcd"));
		assertTrue(line.contains("Ca\"abc\"\""));
		// read line
		String lineTwo = new String(new byte[]{0});
		lineNumber = line.indexOf(File.separator);
		
		assertTrue(lineNumber>-1);
		assertEquals(lineNumber, line.length());
		lineTwo = line;
		assertEquals(lineTwo, "");
		assertFalse(line.contains("ab"));
		assertFalse(line.contains("\""));
		assertFalse(line.endsWith("\""));
	}
	@Test
	public void readLine_0_0_2() throws IOException{
		// Read line
		String line;
		// Line read
		line = new String(new byte[]{0});
		JTailLogger.info("Ligne {}", line);
		assertTrue(line.matches(File.separator));
		assertTrue(line.matches(":"));
		assertTrue(line.matches(File.separator));
		
		FileIndex index = new FileIndex();
		int lineNumber = line.indexOf(File.separator);
		assertEquals(-1, lineNumber);
		assertFalse(line.contains("a"));
		assertFalse(line.contains("\""));
		assertFalse(line.endsWith("\""));
    	assertFalse(line.endsWith("\"A"));
    	assertTrue(line.endsWith("A"));
			System.out.println("\t"+line);
    	String value = new File(".").getCanonicalFile();
		assertEquals(index.getOffsetOfLine(0), value);
		assertEquals(index.getOffsetOfLine(1), index.getOffsetOfLine(2));
	}
		
	@Test
	public void readLine_0_0_3() throws IOException{
		// Read line
		String line;
		// Line read
		line = new String(new byte[]{0});
		JTailLogger.info("Ligne {}", line);
		