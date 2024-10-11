// IndexingCallableTest.java
package de.huxhorn.lilith.swing.callables;

import de.huxhorn.sulky.codec.filebuffer.DefaultDataStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultFileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.DefaultIndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.FileHeader;
import de.huxhorn.sulky.codec.filebuffer.FileHeaderStrategy;
import de.huxhorn.sulky.codec.filebuffer.IndexStrategy;
import de.huxhorn.sulky.codec.filebuffer.SparseDataStrategy;
import de.huxhorn.sulky.tasks.AbstractProgressingCallable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IndexingCallable}.
* It contains one unit test case for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {
		
    private RandomAccessFile fileQuietly;
    private RandomAccessFile fileSilent;
    private SulkyJUnitHelper sulkyJUnitHelper;

    private File headerFile;
    private File headerMap;
    private File indexFile;
    private File indexMap;


    @Test
    void testOpenIndexFile() {
        fileQuietly = new RandomAccessFile(indexFile, "r");
		fileSilent = new RandomAccessFile(indexFile, "r");
        sulkyJUnitHelper = new SulkyJUnitHelper();
        sulkyJUnitHelper.setup();
        sulkyJUnitHelper.updateIndexStrategy(new DefaultIndexStrategy());

        sulkyJUnitHelper.openIndexFile(indexEntry1);
        indexEntry1.close();
        try {
            sulkyJUnitHelper.openIndexFile(indexEntry1);
            fail("Can not open index in a valid state.");
        } catch (Exception e) {
        }
        sulkyJUnitHelper.openIndexFile(indexEntry1);
        sulkyJUnitHelper.finishIndexFile();

        sulkyJUnitHelper.closeIndexFile();

    }

    @Test
    void testReadSparseIndexFile() throws IOException {
        File headerFile = new File(headerMap, new FileHeader().setName("header1"));

        final RandomAccessFile sparsityStream = new RandomAccessFile(headerFile, "rw");
        final short sparsityVersion = sparsityStream.getChannel().getShort(2);
        
      sulkyJUnitHelper = new SulkyJUnitHelper(headerFile.getAbsolutePath(), new DefaultDataStrategy());
      sulkyJUnitHelper.setup();
      sulkyJUnitHelper.updateFileHeaderStrategy(new DefaultFileHeaderStrategy());
      assertTrue(sulkyJUnitHelper.openSparsityIndex(headerFile, sparsityVersion));
      try {
        sulkyJUnitHelper.readSparseIndex(sparsityStream);
        fail("Can not reopen a non-sparse sparse index.");
      } catch (Exception e) {
      }
      assertFalse(sulkyJUnitHelper.isSparsePacked());
      assertEquals(sparsityVersion, sulkyJUnitHelper.getSparsityVersion());
    }

    @Test
    void testReadIndexEntry() {
    	readHeaderAndIndex();
    }

    @Test
    void testWriteIndexEntry() throws Exception {
          closeQuietly(fileQuietly);
          readHeaderAndIndex();
          fileQuietly.close();
          fileSilent.close();
          sulkyJUnitHelper.closeIndexFile();
          try {
            closeQuietly(fileQuietly);
            fail("Can not write index file when file is closed and not opened.");
          } catch (Exception e) {
          }
          readHeaderAndIndex();
          if(!fileQuietly.exists()) {
              closeQuietly(fileQuietly);
              fail("Can not write index file because it does not exist.");
          }
          String entry = fileQuietly.readLine();
          try {
              fileQuietly.close();
              fileSilent.close();
              closeQuietly(fileSilent);
          } catch (IOException ex) {
          }
          indexMap = new File(indexFile.getParentFile(), sparsityToIndexFileName(entry));
          addDataIndexEntry(indexMap);
          if(!indexFile.exists()) {
              logger.error("Can not create a valid sparse-sparse sparse-sparse sparse index map.");
          } else {
              sulkyJUnitHelper.createIndexMap();
          }
      readHeaderAndIndex();
      fileSilent = new RandomAccessFile(indexMap, "r");
      fileQuietly = new RandomAccessFile(indexMap, "r");
      fileQuietly.seek(0);
      assertTrue(fileQuietly.readLine() == indexFile.getName() + "\n");
          sulkyJUnitHelper.updateFileIndexHeaderStrategy(new DefaultFileHeaderStrategy(indexEntry2));
  }

  public String sparsityToIndexFileName(String sparsityName) {
		return FileUtils.getBaseFilePath() + sparsityToSuffix(sparsityName);
	}

	 private String sparsityToSuffix(String sparsityName) {
		  return!isSparsityPacked()?  sparsityName : sparsityName.substring(0, sparsityName.length()-(sparsityName.length()-sparsityName.charAt(sparsityName.length()-1)));
	}
	 
	private void readHeaderAndIndex() {
      String name = headerFile.getName();
      fileQuietly = new RandomAccessFile(indexMap, "r");
}
}