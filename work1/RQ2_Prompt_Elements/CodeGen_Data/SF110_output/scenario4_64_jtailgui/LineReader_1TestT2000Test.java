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
final FileIndex index = null;
	final File file = null;
	final RandomAccessFile randomAccess = null;

    /**
     * L'index des lignes du fichier.
     */
    public final FileIndex getIndex() {
        return index;
    }
 
    /**
     * Le fichier à lire.
     */
    public final File getFile() {
        return file;
    }

    /**
     * Le fichier au lancement.
     */
    public final File getTargetFile() {
        return file;
    }

    /**
     * Lit ses lignes indexées.
     */
    public void printIndexes() throws IOException {
        JTailLogger.LOGGER.println("Index :");
        List<String> lines = readBlock(1, Integer.MAX_VALUE);
        if (lines.size() > 0) {

                for (int i = 0; i < lines.size(); i++) {
                    JTailLogger.LOGGER.println("Line :" + lines.get(i));
                }

        }
    }

    /**
     * Lit les lignes indexées du fichier.
     *
     * @throws IOException si une erreur survient
     */
    public void printIndex() throws IOException {
        List<String> lines = readBlock(1, file.length());
        if (lines.size() > 0) {
                JTailLogger.LOGGER.println("Index :");
                for (int i = 0; i < lines.size(); i++) {
                    JTailLogger.LOGGER.println("Line :" + lines.get(i));
                }
        }
    }

    /**
	 * Lit les lignes liées au debut de ligne à lire.
	 *
	 * @throws IOException si une erreur survient
     */
    public void printHeader() throws IOException {
        List<String> lines = readBlock(1, index.getHeadLine());
        if (lines.size() > 0) {
            JTailLogger.LOGGER.println("----------------------------------------------");
            for (int i = 0; i < lines.size(); i++) {
                JTailLogger.LOGGER.println("Line : " + lines.get(i));
            }
            JTailLogger.LOGGER.println("----------------------------------------------");
        }
    }	

    /**
     * Lit les lignes liées du fichier.
     *
     * @throws IOException si une erreur survient
     */
    public void printBlock(int fromLine, int toLine) throws IOException {
        List<String> lines = readBlock(fromLine, toLine);
        if (lines.size() > 0) {
            JTailLogger.LOGGER.println("Block (fromLine = " + fromLine + ", toLine = " + toLine + ") :");
                for (int i = 0; i < lines.size(); i++) {
                    JTailLogger.LOGGER.println("Line : " + lines.get(i));
                }
        }
    }

    @Test
    public void testLineReader1() throws IOException {
        // Test case for issue #9
        ArrayList<String> lines = readBlock(1, index.getHeadLine());
        if (lines.size() > 0) {
            JTailLogger.LOGGER.println("-------------------------1");
            for (int i = 0; i < lines.size(); i++) {
                JTailLogger.LOGGER.println("Line : " + lines.get(i));
            }
        }
        lines = readBlock(4, index.getHeadLine());
        if (lines.size() > 0) {
            JTailLogger.LOGGER.println("-------------------------2");
            for (int i = 0; i < lines.size(); i++) {
                JTailLogger.LOGGER.println("Line : " + lines.get(i));
            }
        }
    }

	@Test
    public void testLineReader2() throws IOException {
		final List<String> lines = new ArrayList<String>();
        lines.addAll(readBlock(1, index.getHeadLine()));
        lines.addAll(readBlock(6,