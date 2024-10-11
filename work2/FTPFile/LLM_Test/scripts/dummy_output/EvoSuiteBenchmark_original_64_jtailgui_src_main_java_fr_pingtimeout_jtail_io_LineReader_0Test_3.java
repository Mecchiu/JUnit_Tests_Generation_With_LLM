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
		* Test le fichier.
		* L'input est null.
		* Exécute le fichier nulle ou null.
		*
		 * @throws IOException si une erreur survient pendant la lecture
		*/
		@Test
		public void readLine_InputNull() throws IOException {
			//On effectue l'issuance au fichier, et est nulle.
			//En effectue l'issuance au fichier nulle ou null, l'idération est null.
			ArrayList<String> result = new ArrayList<>();
			String result1 = lineReader.readLine(6);
			assertEquals("L'intest", null, result1);
			result = new ArrayList<>();
			String result2 = lineReader.readLine(4);
		}

	}
// LineReader_1Test.java