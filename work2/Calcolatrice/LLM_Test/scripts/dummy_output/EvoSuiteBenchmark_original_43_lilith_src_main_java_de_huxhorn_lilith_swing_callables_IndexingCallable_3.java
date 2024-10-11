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
		
	public static class SampleFileWithHeaders {
		// Constructors
		public SampleFileWithHeaders(File file) {				
			logger.info("Create SampleFile");
			this.dataFile = file;
			// Get the fileHeader
			final FileHeader header = new FileHeader();
			logger.info("FileHeader: " +header.getName());
			// Set file header
			header.setName("Example file");
			header.setValue("Test value");
			// Set file header
			this.dataFile.mkdir();
			try {
				final FileOutputStream file = new FileOutputStream(this.dataFile);
				header.write(file);
				file.close();
			} 
			catch (FileNotFoundException | IOException e) {
				// should not happen, 
				e.printStackTrace();
			}
			catch (IOException ignored) {
				// shouldn't happen,
				ignored.printStackTrace();
			}
			// Close the streams
			this.dataFile.close();				
			this.indexFile = createIndexFile();
		}
		
		
		public SampleFileWithHeaders(RandomAccessFile file) {
			logger.info("Create Samplefile");
			this.dataFile = file;
			// Get the fileHeader
			try {
				final FileHeader header = new FileHeader(file);
				logger.info("FileHeader: " +header.getName());
				// Set file header
				final long headerLength = header.getLength();
				header.setValue("Test value");
				if (headerLength > 1024) {
					return; // should ignore
				}
				if (new IndexStrategy().hasIndex(file)) {
					try {
						new SparseDataStrategy(file).write(file);
					} catch (FileNotFoundException | IOException ex){
						ex.printStackTrace();
					}
				}
			} 
			catch (IOException e) {
				// should not happen, 
				logger.debug("", e);
			}
			catch (IOException ignored) {
				// should not happen,
				logger.debug("", ignored);
			}
			// Close the stream
			file.close();
			logger.info("Index file: {}", this.indexFile);
			// Open a new stream
			// TODO: do we really need the dataFile?
			final RandomAccessFile newFile = new RandomAccessFile(this.indexFile, "r");
			// Remove the original file
			newFile.delete();				
			try {
				final FileOutputStream newFileStream = new FileOutputStream(this.indexFile);
				newFileStream.seek(0);
				newFileStream.write(newFile.getChannel().size());
				newFileStream.close();
			}
			catch (FileNotFoundException | IOException e){
				e.printStackTrace();
			}
			catch (IOException ignored) {
				// should not happen, 
				logger.debug("", ignored);
			}
			// Close the file stream
			newFile.close();				
			
			// Close the stream
			this.indexFile.close();				
			
			logger.info("Closed indexfile");		
		}

		
		// Get file data
		public boolean hasData() {
			
			try {
				final RandomAccessFile file = new RandomAccessFile(this.dataFile, "r");
				
				// Get the length of the stream
				file.seek(0);
				long length = file.length();
				file.close();				
				return length > 0;				
			}
			catch (FileNotFoundException e) {
				logger.error("Failed to open: " + this.dataFile + " with: " + e.getMessage());				
				e.printStackTrace();
				return false;
			}
			catch (NoSuchFieldError e) {
				logger.error("Failed to open: " + this.dataFile + " with: " + e.getMessage());				
				e.printStackTrace();
				return false;
			}
			
		}


		// Get a reader for the file header
		private RandomAccessFile getFileReader(final ChannelListener contentChannel) {			
			try {			
				final RandomAccessFile reader = new RandomAccessFile(this.dataFile, "r");
				// Initialize reader
				ContentChannelListener listener = new ContentChannelListener(contentChannel);
				filePosition = 0;				
				reader.getChannel().position(filePosition);
				
				return reader;								
			}
			catch (FileNotFoundException e) {
				// should not happen, 
				logger.debug("Failed to create: " + this.dataFile + " with: " + e.getMessage());				
			}
			catch (IOException e) {
				// should not happen, 
				logger.error("Failed to open: " + this.dataFile + " with: " + e.getMessage());
				e.printStackTrace();
			}
			logger.error("Unexpected IO exception");
			return null;
		}
			
		
		// Return the current index file
}
}