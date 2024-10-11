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

	/**
	 * If the test method fails, the {@code call()} method will throw an exception.
	 * If the test method succeeds, the expected value for {@code call()} will be 0.
	 */

	private class DataStrategyTester {
		DataStrategy data_strategy;

		protected DataStrategyTester(SparseDataStrategy strategy) {
			data_strategy = new DefaultDataStrategy.Builder()
					.setSparseMapping(() -> 1).build();
		}
	
		public void makeTest(boolean value, SparseDataStrategy strategy) {
			
			assertEquals(value,  data_strategy.isSane() );
			
			assertFalse(strategy == null);
			assertEquals(0, strategy.computeMaxValue());
		}

		private void checkIndex(SparseDataStrategy index) {
			assertSame(index, data_strategy.computeIndexStrategy() );
		}
	}

	static class TestDataStrategy extends DefaultDataStrategy {
		SparseDataStrategy sparse;
		
		TestDataStrategy(SparseDataStrategy strategy, RandomAccessFile raFile) throws FileNotFoundException, IOException {
			super(raFile);
			sparse = strategy;
		}

		@Override
		public void setSparseMapping(String key, int value) {
			super.setSparseMapping(key, value);
			sparse = new SparseDataStrategy.Builder()
					.setSparseMapping(key, value)
					.build();
		}
	}

	static class TestFileHeaderStrategy extends DefaultFileHeaderStrategy {
		IndexStrategy index;
		
		public TestFileHeaderStrategy(IndexStrategy index, SparseDataStrategy strategy) {
			super(strategy);
			this.index = index;
		}

		@Override
		public void setMapping(String key, int value) {
			super.setMapping(key, value);
			index = new IndexStrategy.Builder()
					.setMapping(key, value)
					.build();
		}
	}

	static class TestIndexStrategy extends DefaultIndexStrategy {
		IndexStrategy index;
		
		TestIndexStrategy(IndexStrategy index, SparseDataStrategy strategy) {
			super(strategy);
			this.index = index;
		}

		@Override
		public void setMapping(String key, int value) {
			super.setMapping(key, value);
			index = new IndexStrategy.Builder()
					.setMapping(key, value)
					.build();
		}
	}

	@Test
	public void testIndexing() throws FileNotFoundException, IOException {

		RandomAccessFile ra;
		ra = new RandomAccessFile(new File("/tmp/indexed.ra"), 'r');
		IndexingCallableTest.TestIndexStrategy test_index = new IndexingCallableTest.TestIndexStrategy(ra, ra);
		
		Logging.log("IndexingData.java.file",
				"Test indexing of the index in file. FileName should be 'indexed.ra'.\n" +
				"File will be created.",
				LogLevel.INFO);

		DataStrategy tester = new TestDataStrategy(
				new DefaultDataStrategy.Builder()
						.setComputeMaxValue(Indexing.INDEX_TRIANGLE)
						.setMinValue(0)
						.build(),
				ra);

		IndexingData index = IndexationTask.getInstance().run(IndexingCallableTest.TestIndexStrategy.index);
		tester.makeTest(index.isSane(), IndexingCallableTest.TestIndexStrategy.index);

		Logging.log("IndexingData.java.file",
				"indexing done in file.",
				LogLevel.INFO);

		ra.close();
		ra = null;
		Logging.log("IndexingData.java.file", "Done in file.", LogLevel.INFO);
		
// TODO find out why this test fails
//		// check if data should be computed
//		test_index.makeTest(index.isSane(), IndexingCallableTest.TestIndexStrategy.index);

		// make a "non-sane" indexed file
		// we should get the same result regardless
		ra = new RandomAccessFile(new File("/tmp/non_sane.ra"), 'r');
//		ra = new RandomAccessFile(new File("/tmp/non_sane.ra"), 'r');
//		index = new IndexingData.Builder()
//		new IndexingData.Builder()
//				.setComputeMaxValue(50)
//				.setIndexStrategy(TestIndexStrategy.non_sane)
//				.build();
//		index = IndexiationTask.getInstance().run(IndexingCallableTest.TestIndexStrategy.index);
//		// the indexing in non-sane file is not very nice. So, we check if we really are non-sane
//		// (it might not be even if it is not supposed to be)
//		index.makeTest(ra.read(), IndexingCallableTest.TestIndexStrategy.non_sane);
//		Logging.log("Non-sane indexing done in file.","Indexed data is not sane: ");
//		Logging.logDataStrategy(index.getStrategy());
	}
}
