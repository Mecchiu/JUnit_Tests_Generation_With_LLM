// ProcessorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Processor}.
* It contains one unit test case for the {@link Processor#getTypeDesc()} method.
*/
class ProcessorTest {

	@Test
	void test1_init() {
		{
			// null input source
			org.apache.axis.datasource.DataSource ds = null;
			try {
				org.apache.axis.datasources.jdbc.JDBCDataSource jdbcds = new org.apache.axis.datasources.jdbc.JDBCDataSource();
				jdbcds.setMaxPoolSize(100);
				org.apache.axis.datasources.jdbc.JDBCDataSource ds2 = new org.apache.axis.datasources.jdbc.JDBCDataSource();
				ds2 = jdbcds;
			}
			catch (Throwable e) {
				fail(e.getLocalizedMessage());
			}
		}
		
		{
			// String input source
			org.apache.axis.datasource.DataSource ds = new org.apache.axis.datasources.jdbc.JDBCDataSource();
			
			org.apache.axis.configuration.XMLStreamTransformerFactory xtf = org.apache.axis.configuration.XMLStreamTransformerFactory.newInstance();
			org.apache.axis.configuration.XMLStreamTransformer t1 = xtf.newDatasourceTransformer(ds);
			
			org.apache.axis.configuration.XMLStreamWriterFactory xmlwriterfactory = org.apache.axis.configuration.XMLStreamWriterFactory.newInstance();
			t1.add(xmlwriterfactory.newStreamWriter("in", true));
			
			org.apache.axis.configuration.Factory configurationFactory =
				org.apache.axis.configuration.Factory.getInstance("org.apache.axis.datasource.JDBCDataSource", ds);
			org.apache.axis.configuration.DataSource dataSource = configurationFactory.createDataSource();
			dataSource.setURL("url");
			
			org.apache.axis.configuration.XMLStreamReaderFactory readerFactory = org.apache.axis.configuration.XMLStreamReaderFactory.getInstance();
			org.apache.axis.datasource.DataReader dr = readerFactory.createDataReader(new InputStreamReader(new java.io.BufferedInputStream(new java.io.FileInputStream("in.xml"))),
				"in");
			dr.setConfiguration(configurationFactory);
			org.apache.axis.data_format.DBFormat.getNewDBFormat().decode(dr,
				dataSource);
			
		}
		{
			// Input source should not fail even if not read after init.
			org.apache.axis.datasource.DataSource ds = new org.apache.axis.datasources.jdbc.JDBCDataSource(null);
			ds.setURL("url");
			{
				// null input stream
				org.apache.axis.datasource.DataSource ds2 = new org.apache.axis.datasources.jdbc.JDBCDataSource();
				ds2.setMaxPoolSize(100);
				DataReader dr = ds;
				try {
					dr.setConfiguration(configurationFactory);
				}
				catch (Throwable e) {
					fail(e.getLocalizedMessage());
				}
				
			}
			{
				// Read and set XML parser
				org.apache.axis.datasource.DataReader dr =
					new org.apache.axis.datasources.jdbc.JDBCDataReader((org.xml.sax.InputSource)null);
				dr.setConfiguration(configurationFactory);
				org.apache.axis.datasource.DataSource dataSource =
					dr;
				try {
					dataSource = dr;
				}
				catch (Throwable e) {
					fail(e.getLocalizedMessage());
				}
			}
			{
				// Write and read XML parser
				org.apache.axis.datasource.DataWriter dr =
					new org.apache.axis.datasources.jdbc.JDBCDataWriter(null);
				dr.setConfiguration(configurationFactory);
				OrgniteDataSource dataSource = dr;
				
				{
					// XMLReaderFactory should fail
					org.apache.axis.datasources.jdbc.JDBCDataSource jdbcds =
						new org.apache.axis.datasources.jdbc.JDBCDataSource();
					jdbcds.setMaxPoolSize(100);
					DataWriter drw = dr;
					drw.decode(dataSource);
				}
				
			}
		}
		{
			// XML reader should succeed
			org.apache.axis.datasource.DataSource ds = new org.apache.axis.datasources.jdbc.JDBCDataSource(null);
			ds.setURL("url");
			DataReader dr = null;
			
			{
				// null data source
				DummyReaderFactory dmrf = new DummyReaderFactory();
				mrf.setDataSource((org.apache.axis.datasource.DataSource)null);
				dr = dmrf.createReader(null);
			}
			
			{
				// null data reader
				DummyReaderFactory dmrf = new DummyReaderFactory();
				mrf.setDataSource((DataReader)null);
				dr = dmrf.createReader(null);
			}
			
			{
				// XMLReaderFactory should succeed
				org.apache.axis.datasources.jdbc.JDBCDataSource jdbcds =
					new org.apache.axis.datasources.jdbc.JDBCDataSource();
				jdbcds.setMaxPoolSize(100);
				DataReader drw = dr;
				drw.decode(jdbcds);
			}
		}
		{
			// data source should not fail even after init. However, it may fail
			// to initialize XMLReaderFactory and createDummyReader
			org.apache.axis.datasources.jdbc.JDBCDataSource ds = new org.apache.axis.datasources.jdbc.JDBCDataSource(null);
			ds.setURL("url");
			DataReader dr = null;
			
			{
				// null data source
				DummyReaderFactory dmrf = new DummyReaderFactory();
				dr = dmrf.createReader(null);
			}
			
			{
				// null data reader
				DummyReaderFactory dmrf = new DummyReaderFactory();
				dr = dmrf.createReader(null);
			}
		}
	}
}