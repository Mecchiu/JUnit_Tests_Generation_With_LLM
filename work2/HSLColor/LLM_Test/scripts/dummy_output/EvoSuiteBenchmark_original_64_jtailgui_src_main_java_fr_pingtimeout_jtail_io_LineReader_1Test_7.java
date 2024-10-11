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
		
	@Test
	void test_readBlock() throws IOException {
		
		// TODO: comment
		// Le nom des champs d'entête est entiétaire depuis l'index "index"
		
		int numI18n = 10;
		
		File file = new File("src/test/java/fr/pingtimeout/jtail/io/READONLY");
        FileIndex index = new FileIndex(file);
        IndexWriter writer = new IndexWriter(new File(file.getPath() + "/" + "index"), index,
                new IndexWriterConfig(new StandardAnalyzer())
                       .setMaxBufferedDocs(numI18n * 5)
                       .setOpenMode(WRITE_LOCK));
        int line;
        List<String> lines = new ArrayList<>();
        while ((line = index.first())!= -1) {
           lines.add(index.getString(line));
        }
        writer.addDocument(lines, numI18n);
        file.delete();
        file.renameTo(new File("src/test/java/fr/pingtimeout/jtail/io/READONLY_READONLY.tar.gz"));
        
        readBlock(numI18n, lines.size() + 1); // Add last line
			
		File[] indexedFiles = writer.getFiles();
		for(int i = 0; i < indexedFiles.length; i++) {
			assertNotNull(indexedFiles[i]);
			assertEquals(Writer.readFromFile(new File(indexedFiles[i].getPath() + "/index.bin")), 
					indexedFiles[i].getName());
			assertTrue(new File(_indexedFiles[i].getPath()).exists() && 
					new File(_indexedFiles[i].getPath() + "/index.txt").exists());				
		}
    }


	private static File 	_indexedFiles	= 	new File("src/test/java/fr/pingtimeout/jtail/io/READONLY_READONLY.tar.gz");
	
	
	@Test
	void test_readBlock_full() throws IOException {
		checkBlock("5", 1, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("5", 2, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("5", 3, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("5", 4, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("5", 5, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("5", 6, 0, "abcdefghijklmnopqrstuvxyz");

		checkBlock("0", 0, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 1, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 2, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 3, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 4, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 5, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("0", 6, 0, "abcdefghijklmnopqrstuvxyz");
		
		checkBlock("1", 0, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("1", 1, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("1", 2, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("1", 3, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("1", 4, 0, "abcdefghijklmnopqrstuvxyz");
		checkBlock("1", 5, 0, "abcdefghijklmnopqrstuvxyz");
}
}