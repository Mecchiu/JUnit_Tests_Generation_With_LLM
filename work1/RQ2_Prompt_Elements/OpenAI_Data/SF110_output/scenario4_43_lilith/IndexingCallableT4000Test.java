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
* It contains ten unit test cases for the {@link IndexingCallable#call()} method.
*/
class IndexingCallableTest {

		private static final Logger logger = LoggerFactory.getLogger(IndexingCallableTest.class);
		
		private static final FileHeaderStrategy fileHeaderStrategy = new DefaultFileHeaderStrategy();
		private static final IndexStrategy indexStrategy = new DefaultIndexStrategy();
		private static final SparseDataStrategy dataStrategy = new DefaultDataStrategy();
		
		private static final File dataFile = new File("data.dat");
		private static final File indexFile = new File("index.dat");
		
		private static final int ELEMENT_COUNT = 100;
		
		private static final int ELEMENT_SIZE = 100;
		
		private static final int ELEMENT_COUNT_2 = 200;
		
		private static final int ELEMENT_SIZE_2 = 200;
		
		private static final int ELEMENT_COUNT_3 = 300;
		
		private static final int ELEMENT_SIZE_3 = 300;
		
		private static final int ELEMENT_COUNT_4 = 400;
		
		private static final int ELEMENT_SIZE_4 = 400;
		
		private static final int ELEMENT_COUNT_5 = 500;
		
		private static final int ELEMENT_SIZE_5 = 500;
		
		private static final int ELEMENT_COUNT_6 = 600;
		
		private static final int ELEMENT_SIZE_6 = 600;
		
		private static final int ELEMENT_COUNT_7 = 700;
		
		private static final int ELEMENT_SIZE_7 = 700;
		
		private static final int ELEMENT_COUNT_8 = 800;
		
		private static final int ELEMENT_SIZE_8 = 800;
		
		private static final int ELEMENT_COUNT_9 = 900;
		
		private static final int ELEMENT_SIZE_9 = 900;
		
		private static final int ELEMENT_COUNT_10 = 1000;
		
		private static final int ELEMENT_SIZE_10 = 1000;
		
		/**
		* Test case for the {@link IndexingCallable#call()} method.
		* The test case tests the {@link IndexingCallable#call()} method with the following parameters:
		* <ul>
		* <li>{@link IndexingCallable#call()}</li>
		* </ul>
		*
		* @throws Exception
		* 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				