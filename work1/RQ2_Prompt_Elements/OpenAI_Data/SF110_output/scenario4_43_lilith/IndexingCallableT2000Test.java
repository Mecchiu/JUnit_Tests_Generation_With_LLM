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
		
		private static final int fileHeaderSize = fileHeaderStrategy.getSize();
		private static final int indexSize = indexStrategy.getSize();
		private static final int dataSize = dataStrategy.getSize();
		
		private static final int fileHeaderCount = 10;
		private static final int indexCount = 10;
		private static final int dataCount = 10;
		
		private static final int fileHeaderOffset = 0;
		private static final int indexOffset = fileHeaderOffset + fileHeaderSize * fileHeaderCount;
		private static final int dataOffset = indexOffset + indexSize * indexCount;
		
		private static final int fileSize = dataOffset + dataSize * dataCount;
		
		private static final int fileHeaderIndex = 0;
		private static final int indexIndex = 1;
		private static final int dataIndex = 2;
		
		private static final int fileHeaderIndexOffset = fileHeaderOffset + fileHeaderIndex * fileHeaderSize;
		private static final int indexIndexOffset = indexOffset + indexIndex * indexSize;
		private static final int dataIndexOffset = dataOffset + dataIndex * dataSize;
		
		private static final int fileHeaderIndexValue = fileHeaderIndexOffset;
		private static final int indexIndexValue = indexIndexOffset;
		private static final int dataIndexValue = dataIndexOffset;
		
		private static final int fileHeaderIndexSize = fileHeaderSize;
		private static final int indexIndexSize = indexSize;
		private static final int dataIndexSize = dataSize;
		
		private static final int fileHeaderIndexCount = fileHeaderCount;
		private static final int indexIndexCount = indexCount;
		private static final int dataIndexCount = dataCount;
		
		private static final int fileHeaderIndexFirst = 0;
		private static final int indexIndexFirst = 0;
		private static final int dataIndexFirst = 0;
		
		private static final int fileHeaderIndexLast = fileHeaderIndexFirst + fileHeaderIndexCount - 1;
		private static final int indexIndexLast = indexIndexFirst + indexIndexCount - 1;
		private static final int dataIndexLast = dataIndexFirst + dataIndexCount - 1;
		
		private static final int fileHeaderIndexMiddle = fileHeaderIndexFirst + fileHeaderIndexCount / 2;
		private static final int indexIndexMiddle = indexIndexFirst + indexIndexCount / 2;
		private static final int dataIndexMiddle = dataIndexFirst + dataIndexCount / 2;
		
		private static final int fileHeaderIndexUnknown = -1;
		private static final int indexIndexUnknown = -1;
		private static final int dataIndexUnknown = -1;
		
		private static final int fileHeaderIndexTooSmall = -2;
		private static final int indexIndexTooSmall = -2;
		private static final int dataIndexTooSmall = -2;
		
		private static final int fileHeaderIndexTooBig = fileHeaderIndexFirst + fileHeaderIndexCount;
		private static final int indexIndexTooBig = indexIndexFirst + indexIndexCount;
		private static final int dataIndexTooBig = dataIndexFirst + dataIndexCount;
		
		private static final int fileHeaderMagic = 0x12345678;
		private static final int indexMagic = 0x23456789;
		private static final int dataMagic = 0x3456789A;
		
		private static final int fileHeaderVersion = 1;
		private static final int indexVersion = 2;
		private static final int dataVersion = 3;
		
		private static final int fileHeaderReserved = 0;
		private static final int indexReserved = 0;
		private static final int dataReserved = 0;
		
		private static final int fileHeaderFlags = 0;
		private static final int indexFlags = 0;
		private static final int dataFlags = 0;
		
		private static final int fileHeaderDataOffset = dataOffset;
		private static final int indexDataOffset = dataOffset;
		private static final int dataDataOffset = dataOffset;
		
		private static final int fileHeaderDataSize = dataSize;
		private static final int indexDataSize = dataSize;
		private static final int dataDataSize = dataSize;
		
		private static final int fileHeaderDataCount = dataCount;
		private static final int indexDataCount = dataCount;
		private static final int dataDataCount = dataCount;
		
		private static final int fileHeaderDataFirst = 0;
		private static final int indexDataFirst = 0;
		private static final int dataDataFirst = 0;
		
		private static final int fileHeaderDataLast = fileHeaderDataFirst + fileHeaderDataCount - 1;
		private static final int indexDataLast = indexDataFirst + indexDataCount - 1;
		private static final int dataDataLast = dataDataFirst + dataDataCount - 1;
		
		private static final int fileHeaderDataMiddle = fileHeaderDataFirst + fileHeaderDataCount / 2;
		private static final int indexDataMiddle = indexDataFirst + indexDataCount / 2;
		private static final int dataDataMiddle = dataDataFirst + dataDataCount / 2;
		
		private static final int fileHeaderDataUnknown = -1;
		private static final int indexDataUnknown = -1;
		private static final int dataDataUnknown = -1;
		
		private static final int fileHeaderDataTooSmall = -2;
		private static final int indexDataTooSmall = -2;
		private static final int dataDataTooSmall = -2;
		
		private static final int fileHeaderDataTooBig = fileHeaderDataFirst + fileHeaderDataCount;
		private static final int indexDataTooBig = indexDataFirst + indexDataCount;
		private static final int dataDataTooBig = dataDataFirst + dataDataCount;
		
		private static final int fileHeaderDataValue = 0x456789AB;
		private static final int indexDataValue = 0x56789ABC;
		private static final int dataDataValue = 0x6789ABCD;
		
		private static final int fileHeaderDataValueOffset = dataIndexOffset + dataStrategy.getDataOffset();
		private static final int indexDataValueOffset = dataIndexOffset + dataStrategy.getDataOffset();
		private static final int dataDataValueOffset = dataIndexOffset + dataStrategy.getDataOffset();
		
		private static final int fileHeaderDataValueSize = dataStrategy.getDataSize();
		private static final int indexDataValueSize = dataStrategy.getDataSize();
		private static final int dataDataValueSize = dataStrategy.getDataSize();
		
		private static final int fileHeaderDataValueCount = dataCount;
		private static final int indexDataValueCount = dataCount;
		private static final int dataDataValueCount = dataCount;
		
		private static final int fileHeaderDataValueFirst = 0;
		private static final int indexDataValueFirst = 0;
		private static final int dataDataValueFirst = 0;
		
		private static final int fileHeaderDataValueLast = fileHeaderDataValueFirst + fileHeaderDataValueCount - 1;
		private static final int indexDataValueLast = indexDataValueFirst + indexDataValueCount - 1;
		private static final int dataDataValueLast = dataDataValueFirst + dataDataValueCount - 1;
		
		private static final int fileHeaderDataValueMiddle = fileHeaderDataValueFirst + fileHeaderDataValueCount / 2;
		private static final int indexDataValueMiddle = indexDataValueFirst + indexDataValueCount / 2;
		private static final int dataDataValueMiddle = dataDataValueFirst + dataDataValueCount /