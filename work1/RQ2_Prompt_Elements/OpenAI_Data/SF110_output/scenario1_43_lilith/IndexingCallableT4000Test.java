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
		
		private static final String TEST_FILE_NAME_41 = "test41.dat";
		private static final String TEST_INDEX_FILE_NAME_41 = "test41.idx";
		
		private static final String TEST_FILE_NAME_42 = "test42.dat";
		private static final String TEST_INDEX_FILE_NAME_42 = "test42.idx";
		
		private static final String TEST_FILE_NAME_43 = "test43.dat";
		private static final String TEST_INDEX_FILE_NAME_43 = "test43.idx";
		
		private static final String TEST_FILE_NAME_44 = "test44.dat";
		private static final String TEST_INDEX_FILE_NAME_44 = "test44.idx";
		
		private static final String TEST_FILE_NAME_45 = "test45.dat";
		private static final String TEST_INDEX_FILE_NAME_45 = "test45.idx";
		
		private static final String TEST_FILE_NAME_46 = "test46.dat";
		private static final String TEST_INDEX_FILE_NAME_46 = "test46.idx";
		
		private static final String TEST_FILE_NAME_47 = "test47.dat";
		private static final String TEST_INDEX_FILE_NAME_47 = "test47.idx";
		
		private static final String TEST_FILE_NAME_48 = "test48.dat";
		private static final String TEST_INDEX_FILE_NAME_48 = "test48.idx";
		
		private static final String TEST_FILE_NAME_49 = "test49.dat";
		private static final String TEST_INDEX_FILE_NAME_49 = "test49.idx";
		
		private static final String TEST_FILE_NAME_50 = "test50.dat";
		private static final String TEST_INDEX_FILE_NAME_50 = "test50.idx";
		
		private static final String TEST_FILE_NAME_51 = "test51.dat";
		private static final String TEST_INDEX_FILE_NAME_51 = "test51.idx";
		
		private static final String TEST_FILE_NAME_52 = "test52.dat";
		private static final String TEST_INDEX_FILE_NAME_52 = "test52.idx";
		
		private static final String TEST_FILE_NAME_53 = "test53.dat";
		private static final String TEST_INDEX_FILE_NAME_53 = "test53.idx";
		
		private static final String TEST_FILE_NAME_54 = "test54.dat";
		private static final String TEST_INDEX_FILE_NAME_54 = "test54.idx";
		
		private static final String TEST_FILE_NAME_55 = "test55.dat";
		private static final String TEST_INDEX_FILE_NAME_55 = "test55.idx";
		
		private static final String TEST_FILE_NAME_56 = "test56.dat";
		private static final String TEST_INDEX_FILE_NAME_56 = "test56.idx";
		
		private static final String TEST_FILE_NAME_57 = "test57.dat";
		private static final String TEST_INDEX_FILE_NAME_57 = "test57.idx";
		
		private static final String TEST_FILE_NAME_58 = "test58.dat";
		private static final String TEST_INDEX_FILE_NAME_58 = "test58.idx";
		
		private static final String TEST_FILE_NAME_59 = "test59.dat";
		private static final String TEST_INDEX_FILE_NAME_59 = "test59.idx";
		
		private static final String TEST_FILE_NAME_60 = "test60.dat";
		private static final String TEST_INDEX_FILE_NAME_60 = "test60.idx";
		
		private static final String TEST_FILE_NAME_61 = "test61.dat";
		private static final String TEST_INDEX_FILE_NAME_61 = "test61.idx";
		
		private static final String TEST_FILE_NAME_62 = "test62.dat";
		private static final String TEST_INDEX_FILE_NAME_62 = "test62.idx";
		
		private static final String TEST_FILE_NAME_63 = "test63.dat";
		private static final String TEST_INDEX_FILE_NAME_63 = "test63.idx";
		
		private static final String TEST_FILE_NAME_64 = "test64.dat";
		private static final String TEST_INDEX_FILE_NAME_64 = "test64.idx";
		
		private static final String TEST_FILE_NAME_65 = "test65.dat";
		private static final String TEST_INDEX_FILE_NAME_65 = "test65.idx";
		
		private static final String TEST_FILE_NAME_66 = "test66.dat";
		private static final String TEST_INDEX_FILE_NAME_66 = "test66.idx";
		
		private static final String TEST_FILE_NAME_67 = "test67.dat";
		private static final String TEST_INDEX_FILE_NAME_67 = "test67.idx";
		
		private static final String TEST_FILE_NAME_68 = "test68.dat";
		private static final String TEST_INDEX_FILE_NAME_68 = "test68.idx";
		
		private static final String TEST_FILE_NAME_69 = "test69.dat";
		private static final String TEST_INDEX_FILE_NAME_69 = "test69.idx";
		
		private static final String TEST_FILE_NAME_70 = "test70.dat";
		private static final String TEST_INDEX_FILE_NAME_70 = "test70.idx";
		
		private static final String TEST_FILE_NAME_71 = "test71.dat";
		private static final String TEST_INDEX_FILE_NAME_71 = "test71.idx";
		
		private static final String TEST_FILE_NAME_72 = "test72.dat";
		private static final String TEST_INDEX_FILE_NAME_72 = "test72.idx";
		
		private static final String TEST_FILE_NAME_73 = "test73.dat";
		private static final String TEST_INDEX_FILE_NAME_73 = "test73.idx";
		
		private static final String TEST_FILE_NAME_74 = "test74.dat";
		private static final String TEST_INDEX_FILE_NAME_74 = "test74.idx";
		
		private static final String TEST_FILE_NAME_75 = "test75.dat";
		private static final String TEST_INDEX_FILE_NAME_75 = "test75.idx";
		
		private static final String TEST_FILE_NAME_76 = "test76.dat";
		private static final String TEST_INDEX_FILE_NAME_76 = "test76.idx";
		
		private static final String TEST_FILE_NAME_77 = "test77.dat";
		private static final String TEST_INDEX_FILE_NAME_77 = "test77.idx";
		
		private static final String TEST_FILE_NAME_78 = "test78.dat";
		private static final String TEST_INDEX_FILE_NAME_78 = "test78.idx";
		
		private static final String TEST_FILE_NAME_79 = "test79.dat";
		private static final String TEST_INDEX_FILE_NAME_79 = "test79.idx";
		
		private static final String TEST_FILE_NAME_80 = "test80.dat";
		private static final String TEST_INDEX_FILE_NAME_80 = "test80.idx";
		
		private static final String TEST_FILE_NAME_81 = "test81.dat";
		private static final String TEST_INDEX_FILE_NAME_81 = "test81.idx";
		
		private static final String TEST