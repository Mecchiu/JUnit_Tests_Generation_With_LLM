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
     * Test method for {@link fr.pingtimeout.jtail.io.LineReader#readBlock(int, int)}.
     *
     * @throws java.io.FileNotFoundException si la fichier inexistante
     * @throws java.io.IOException si une erreur survient pendant la lecture d'une ligne
     */
//    @Test
    public void testReadBlock_InexistantFile() throws FileNotFoundException, IOException {
        try {
            final File f = new File("doesNotExist");
            new LineReader(f, new FileIndex());
            fail("Impossible de tester le fichier de destination inexistant l'instance.");
        } catch (FileNotFoundException e) {
        }
    }

    /**
     * Test method for {@link fr.pingtimeout.jtail.io.LineReader#readBlock(int, int)}.
     *
     * @throws java.io.FileNotFoundException si la fichier inexistante
     * @throws java.io.IOException si une erreur survient pendant la lecture d'une ligne
     */
    @Test
    public void testReadBlock_InexistantIndex() throws FileNotFoundException, IOException {
        try {
            final FileIndex index = new FileIndex();
            final File f = new File("doesNotExist");
            final byte[][] data = { { 'n', 'n' }, { 'n', 'n' } };

            new LineReader(f, index);
            fail("Impossible de tester le fichier de destination inexistant l'instance.");
        } catch (FileNotFoundException e) {
        }
        try {
            final FileIndex index = new FileIndex();
            new LineReader(null, index);
            fail("Impossible de tester l'objet index.");
        } catch (NullPointerException e) {
        }
    }

    /**
     * Test method for {@link fr.pingtimeout.jtail.io.LineReader#readBlock(int, int)}.
     */
    @Test
    public void testReadBlock_LigneNotLigne() throws IOException {
        try {
            final File indexFile = new File("testFile.dat");
            final File file = new File("myFile.dat");
            new FileIndex(indexFile, file);

            final List<String> result = readBlock(100, 4);

            JTailLogger.getInstance().info(String.format("Lignes infos [%d/%d] :\n%s", result.size(), 100, ArrayUtil.toString(result)));
            assertEquals(result.size(), 2);
            JTailLogger.getInstance().info(String.format("Lignes infos : %s\n", ArrayUtil.toString(result)));
            assertEquals(result.get(0), "Etat défini");
            assertEquals(result.get(1), "Ligne 1");
        } catch (Throwable e) {
            e.printStackTrace();
            fail("Erreur de lecture du fichier.");
        }
    }

}