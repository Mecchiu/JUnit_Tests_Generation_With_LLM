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
		
	//NON-NLS
	private static final String READONLY_MODE = "r";
	
	/**
	 * Nécessaire pour parcourir l'index avec un débit, dans <code>readBlock()</code>.
	 * @throws IOException
	 */
	@Test
	public void readLine_block() throws IOException {
		
		JTailLogger logger = JTailLogger.createLogger(LineReader.class, "LineReader_0Test.readBlock", JTailLogger.DEBUG);
			
		List<String> liste = new ArrayList<>(1000);
			
		// Read the index.
		int size = 3 * 2 * 1000;
		for (int i = 0; i < size; i++) {
			liste.add(new String(new byte[i]));
		}
		logger.info(String.format("Block number %d:\n%s", 0, liste));

		// Read the file.
		File fichier = new File(File.separator + "ligne_" + liste.get(0));
		logger.error(String.format("File %s doit être " + READONLY_MODE + " étendu.\n", fichier));

		// Read the file.
		File fichier2 = new File(File.separator + "ligne_10");
		logger.error(String.format("File %s doit être " + READONLY_MODE + " étendu.\n", fichier2));

		// Exécute des operations.
		FileReader reader = new FileReader(fichier2);
		FileReaderReader2 reader2 = new FileReaderReader2(fichier2);
		
		logger.error(String.format("Read %d blocks.\n", liste.size()));

		// Test if a change of position is caught, but not if a new block is found.
		for (int i = 2; i < liste.size(); i++) {
			long l2 = reader2.nextLong();
			long l1 = reader.nextLong();
			assertTrue(l1 > l2);
			logger.debug(l1 + " > " + l2);
		}
		
		// Test if a write is saved for an empty block.
		long l1 = reader.nextLong();
		long l2 = reader2.nextLong();
		assertTrue(l2 == l1);
		logger.debug(l2 + " == " + l1);

		List<String> liste2 = new ArrayList<>(liste);
		liste2.add(0, liste.get(1));
		reader2.readBlock2(liste2);
		assertEquals(0, reader.position());
		assertEquals(liste.get(0), reader.readLine(0));

		reader2.seek(0);
		reader.seek(1);
		l2 = reader.readLong();
		l1 = reader.readLong();
		l1 += 1;
		assertEquals(13, reader.readLong());
		
		logger.debug(liste);
		logger.debug(liste2);
		logger.debug(l1);
		logger.debug(l2);
		
		logger.error(String.format("Position: %d (2 - %d), position 2: %d", reader.position(), liste.size(), reader.position()));
		logger.error(String.format("Offset: %d, size: %d, size 2: %d", reader.offset(), reader.length(), reader2.length()));
		
		reader.close();
	}
}