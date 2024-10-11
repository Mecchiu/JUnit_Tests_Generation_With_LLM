// LineReader_1Test.java
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
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
		
        /**
		 * L'index des lignes du fichier pour les tests.
		 */
		private final FileIndex index;
		
	/**
	 * Default constructor of {@link LineReader_1Test}
	 */
	public LineReader_1Test() {
		index = new FileIndex();
	}
	
	/**
	 * Setter of {@link LineReader_1Test}
	 * @param index le index des lignes des fichiers pour les tests
	 */
	public void setIndex(FileIndex index) {
		this.index = index;
	}
	
	/**
	 * Closes the reader and remove the reader from test.
	 * @throws IOException if an error occure in reading the files.
	 */
	public void CloseOnClose() throws IOException {
		close();
	}
	
	/**
	 * Test of readBlock and readBlockIndex method.
	 * @throws java.io.FileNotFoundException thrown if file not found
	 * @throws java.io.IOException thrown if no error occur
	 */
	@Test
	public void testReadBlockIndex()
			throws FileNotFoundException,
					 java.io.IOException,
					 IOException {
		
		// L'index doit etre à javapoté
		assertFalse(index.isReadOnly());
		assertTrue(index.isMutable());
	}

    			/**
         * Test of readBlock and readBlockIndex method.
         * @throws java.io.FileNotFoundException thrown if file not found
         * @throws java.io.IOException thrown if no error occur
         */
		private void readBlockAndReadBlockIndexTest(File file, RandomAccessFile fileRandomAccess) throws FileNotFoundException, IOException {
			int numLines = 0;
	
            boolean isNotReadOnly;

			// Test de fin de ligne en fichier
			try {
				fileRandomAccess.close();
				ReadOnly_Test_1.init();

				// Retourne le numéro du contenu dans le fichier
				numLines = fileRandomAccess.read();
				isNotReadOnly = fileRandomAccess.isReadOnly();
				assertTrue(isNotReadOnly);
			}
			finally {
				ReadOnly_Test_5.init();
			}

			if (file.exists()) {
				assertEquals(file.getName(), FileIndex.getName("fileReader_1Test"));

				assertEquals(fileRandomAccess.length(), numLines);

				// Test de fin de ligne en fichier
				FileIndex fileIndexCopy = new FileIndex();
				int numLineCopy = 0;
				fileIndexCopy.add(numLineCopy, fileRandomAccess.length());

				fileRandomAccess.seek(0);
				
				assertEquals(numLineCopy, numLines + 1);

				// Test de fin de ligne en fichier
				fileRandomAccess.seek(0);

				// Lire le fichier
				fileRandomAccess.read();
				// assertTrue(fileRandomAccess.length() > 0);
			}
			else {
				assertFalse(fileRandomAccess.exists());
				assertEquals(FileIndex.getName("fileReader_1Test"), fileRandomAccess.getName());
				assertEquals(numLines, ((RandomAccessFile) fileRandomAccess).length());
			}
		}

		/**
	 * Test of getBlockReadOnly method.
	 * @throws IOException if an error occure in reading the files
	 */
		@Test
		public void TestGetBlockReadOnly()
				 throws IOException {
	
			// Readonly le fichier non utilisé
}
}