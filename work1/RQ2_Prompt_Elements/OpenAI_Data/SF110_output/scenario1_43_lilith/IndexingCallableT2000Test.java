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
		
		private static final String TEST_FILE_NAME = "test.dat";
		private static final String TEST_INDEX_FILE_NAME = "test.idx";
		
		private static final String TEST_FILE_NAME_2 = "test2.dat";
		private static final String TEST_INDEX_FILE_NAME_2 = "test2.idx";
		
		private static final String TEST_FILE_NAME_3 = "test3.dat";
		private static final String TEST_INDEX_FILE_NAME_3 = "test3.idx";
		
		private static final String TEST_FILE_NAME_4 = "test4.dat";
		private static final String TEST_INDEX_FILE_NAME_4 = "test4.idx";
		
		private static final String TEST_FILE_NAME_5 = "test5.dat";
		private static final String TEST_INDEX_FILE_NAME_5 = "test5.idx";
		
		private static final String TEST_FILE_NAME_6 = "test6.dat";
		private static final String TEST_INDEX_FILE_NAME_6 = "test6.idx";
		
		private static final String TEST_FILE_NAME_7 = "test7.dat";
		private static final String TEST_INDEX_FILE_NAME_7 = "test7.idx";
		
		private static final String TEST_FILE_NAME_8 = "test8.dat";
		private static final String TEST_INDEX_FILE_NAME_8 = "test8.idx";
		
		private static final String TEST_FILE_NAME_9 = "test9.dat";
		private static final String TEST_INDEX_FILE_NAME_9 = "test9.idx";
		
		private static final String TEST_FILE_NAME_10 = "test10.dat";
		private static final String TEST_INDEX_FILE_NAME_10 = "test10.idx";
		
		private static final String TEST_FILE_NAME_11 = "test11.dat";
		private static final String TEST_INDEX_FILE_NAME_11 = "test11.idx";
		
		private static final String TEST_FILE_NAME_12 = "test12.dat";
		private static final String TEST_INDEX_FILE_NAME_12 = "test12.idx";
		
		private static final String TEST_FILE_NAME_13 = "test13.dat";
		private static final String TEST_INDEX_FILE_NAME_13 = "test13.idx";
		
		private static final String TEST_FILE_NAME_14 = "test14.dat";
		private static final String TEST_INDEX_FILE_NAME_14 = "test14.idx";
		
		private static final String TEST_FILE_NAME_15 = "test15.dat";
		private static final String TEST_INDEX_FILE_NAME_15 = "test15.idx";
		
		private static final String TEST_FILE_NAME_16 = "test16.dat";
		private static final String TEST_INDEX_FILE_NAME_16 = "test16.idx";
		
		private static final String TEST_FILE_NAME_17 = "test17.dat";
		private static final String TEST_INDEX_FILE_NAME_17 = "test17.idx";
		
		private static final String TEST_FILE_NAME_18 = "test18.dat";
		private static final String TEST_INDEX_FILE_NAME_18 = "test18.idx";
		
		private static final String TEST_FILE_NAME_19 = "test19.dat";
		private static final String TEST_INDEX_FILE_NAME_19 = "test19.idx";
		
		private static final String TEST_FILE_NAME_20 = "test20.dat";
		private static final String TEST_INDEX_FILE_NAME_20 = "test20.idx";
		
		private static final String TEST_FILE_NAME_21 = "test21.dat";
		private static final String TEST_INDEX_FILE_NAME_21 = "test21.idx";
		
		private static final String TEST_FILE_NAME_22 = "test22.dat";
		private static final String TEST_INDEX_FILE_NAME_22 = "test22.idx";
		
		private static final String TEST_FILE_NAME_23 = "test23.dat";
		private static final String TEST_INDEX_FILE_NAME_23 = "test23.idx";
		
		private static final String TEST_FILE_NAME_24 = "test24.dat";
		private static final String TEST_INDEX_FILE_NAME_24 = "test24.idx";
		
		private static final String TEST_FILE_NAME_25 = "test25.dat";
		private static final String TEST_INDEX_FILE_NAME_25 = "test25.idx";
		
		private static final String TEST_FILE_NAME_26 = "test26.dat";
		private static final String TEST_INDEX_FILE_NAME_26 = "test26.idx";
		
		private static final String TEST_FILE_NAME_27 = "test27.dat";
		private static final String TEST_INDEX_FILE_NAME_27 = "test27.idx";
		
		private static final String TEST_FILE_NAME_28 = "test28.dat";
		private static final String TEST_INDEX_FILE_NAME_28 = "test28.idx";
		
		private static final String TEST_FILE_NAME_29 = "test29.dat";
		private static final String TEST_INDEX_FILE_NAME_29 = "test29.idx";
		
		private static final String TEST_FILE_NAME_30 = "test30.dat";
		private static final String TEST_INDEX_FILE_NAME_30 = "test30.idx";
		
		private static final String TEST_FILE_NAME_31 = "test31.dat";
		private static final String TEST_INDEX_FILE_NAME_31 = "test31.idx";
		
		private static final String TEST_FILE_NAME_32 = "test32.dat";
		private static final String TEST_INDEX_FILE_NAME_32 = "test32.idx";
		
		private static final String TEST_FILE_NAME_33 = "test33.dat";
		private static final String TEST_INDEX_FILE_NAME_33 = "test33.idx";
		
		private static final String TEST_FILE_NAME_34 = "test34.dat";
		private static final String TEST_INDEX_FILE_NAME_34 = "test34.idx";
		
		private static final String TEST_FILE_NAME_35 = "test35.dat";
		private static final String TEST_INDEX_FILE_NAME_35 = "test35.idx";
		
		private static final String TEST_FILE_NAME_36 = "test36.dat";
		private static final String TEST_INDEX_FILE_NAME_36 = "test36.idx";
		
		private static final String TEST_FILE_NAME_37 = "test37.dat";
		private static final String TEST_INDEX_FILE_NAME_37 = "test37.idx";
		
		private static final String TEST_FILE_NAME_38 = "test38.dat";
		private static final String TEST_INDEX_FILE_NAME_38 = "test38.idx";
		
		private static final String TEST_FILE_NAME_39 = "test39.dat";
		private static final String TEST_INDEX_FILE_NAME_39 = "test39.idx";
		
		private static final String TEST_FILE_NAME_40 = "test40.dat";
		private static final String TEST_INDEX_FILE_NAME_40 = "test40.idx";
		
		private static final String TEST_FILE_NAME_41 = "test