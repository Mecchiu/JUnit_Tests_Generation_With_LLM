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
		public static void main(String[] args) {
			try {
				new IndexingCallableTest().runRandomly(args);
			} catch (Exception ignored) {
				// ignore this one
			}
		}
		
		private void runRandomly(String... args) throws Exception {
			// make sure any file can be closed and reopened
			closeQuietly(new RandomAccessFile("/tmp/lilith-sulky.dat", "r"));
			Logger logger = createLogger();
			logger.debug(". " + getClass().getName() + " starting");
			File dataFile;
			try {
				dataFile = new RandomAccessFile("/tmp/lilith-sulky.dat", "rw");

				logger.debug(". " + getClass().getName() + " finished");
				RandomAccessFile fi = new RandomAccessFile("/tmp/lilith-sulky.dat", "r");

				long result = 0;
				while (result == 0) {
					logger.debug(". " + getClass().getName() + " file: " + dataFile.getName() + " current position is " + fi.getFilePointer());
					fi.seek(fi.length());
					result = dataFile.readLong();
				}
				logger.debug(" result: " + result);
				assertEquals(0, result, 1e-10);
			} catch (FileNotFoundException e) {
				logger.debug(" No data file to parse!");
			} catch (IOException e){
				logger.debug(" I/O Exception while reading data!");
			}
			closeQuietly(fi);
		}
		/**
		 *
		* @param args
		* @throws FileNotFoundException
		* @throws IOException
		* @throws InterruptedException
		*/
		@Test
		public void test() throws FileNotFoundException, IOException, InterruptedException {
			File dataFile = new File("/tmp/lilith-sulky.dat");
			RandomAccessFile readFile = new RandomAccessFile(dataFile, "r");
			String indexStr = new String("index.");
			IndexStrategy indexStrategy = new IndexStrategy(indexStr, readFile.length());
			FileHeader fileHeader = new FileHeader(readFile.getFile(), readFile, getClass().getName());
			logger.debug("File header length: " + readFile.length());
			FileHeaderStrategy fileHeaderStrategy = new FileHeaderStrategy(readFile.getFile(),
				fileHeader.length(), readFile.length());
			FileHeader fileHeader0 = new FileHeader(readFile.getFile(),
				readFile.length(), readFile.length());
			IndexStrategy iIndexStrategy =
				new IndexStrategy(indexStr, fileHeader0.length());
			logger.debug(". " + getClass().getName() + " ready");
			SparseDataStrategy readSpatialData = new SparseDataStrategy(readFile, getClass().getName(), fileHeaderStrategy);
			logger.debug(". " + getClass().getName() + " done");
			SparseDataStrategy sparseDataStrategy = new SparseDataStrategy(readFile, getClass().getName(),
				iIndexStrategy);

			Result<Long> result = new IndexingCallableTest.Result<Long>(readFile, readSpatialData, sparseDataStrategy);
			logger.debug("Result");
			logger.debug(". " + getClass().getName() + " finished");
			assertTrue(result.getValue());
			assertEquals(0, readFile.getFilePointer());
		}

        /**
         * Result.
         */
        private static class Result<E> {

            public E value;
            public long length;

            public Result(E value, long length) {
                this.value = value;
                this.length = length;
            }
        }

    }