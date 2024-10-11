// ConfigurationManagerTest.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains one unit test case for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManagerTest {
		// ConfigurationManagerTest.java
	public static class TestConfigManager {
		private ConfigurationManager manager;

		public TestConfigManager(ConfigurationManager inManager) {
			manager = inManager;  /* The ConfigurationManager to be used */
		}
		
		public boolean writeFile() throws IOException {
			FileOutputStream fos = new FileOutputStream("config.xml");
			return manager.writeFile(fos);
			/*if (fos instanceof WrappedFileOutputStream) {
				WrappedFileOutputStream fos = (WrappedFileOutputStream) fos;
				assertTrue(fos.getChannel()!= null);
				assertTrue(fos.getChannel().valid());
				assertTrue(!fos.getChannel().isOpen());
				if (fos.getChannel().isWritable()) {
				return manager.writeFile(fos);
				}
				fos.transferTo(((WrappedFileOutputStream) fos).getChannel())
			  .assertSuccess();
			   fos.getChannel().close();
			}
			return manager.writeFile(new UnsupportedFile(),null);*/
		}
		
		public boolean readFile() throws IOException {
			FileInputStream fis = null;
			// We need to test that our FileChannel is still open
			// because FileOutputStream/UnsupportedFile can't be closed.
			try {
				// It is possible to have a file input stream open (e.g. it
				// was created using a "File" constructor), so we only use
				// it if FileInputStream is open.
				fis = new FileInputStream("config.xml");
				return manager.readFile(fis);
			} catch (FileNotFoundException e) {
				return false;
			}finally {
				if (fis!= null) fis.close();
			}
		}

		public <T extends Enum<T>> Map<T, String> getEnumList(Class<T> type) {
			int size = getSize()[0];
			Map<T, String> enumList;
			if (size > 0) {
				enumList = new HashMap<T, String>(size);
				for (int i=0;i<size;i++) {
					T t = (T) type.newInstance();
					enumList.put(t, getProperty(t.name()));
				}
			} else {
				enumList = new HashMap<T, String>(0);
			}
			return enumList;
		}
		
		public Map<T, String> getMap() {
			return getEnumList(T.class);
		}
	}
		
		// ConfigManagerTest.java
	public static class TestConfigManagerReadOnly extends TestConfigManager {
		public TestConfigManagerReadOnly() {
			super(new ConfigurationManager.TestConfigManager(TestConfigManager.this));
		}

		public boolean writeFile() throws IOException {
			/* It is possible to have a file input stream open
			 * (e.g. it was created using a "File" constructor), so we only use
			 * it if FileOutputStream can't be closed.
			 *
			 * This does mean that the test must write to a non-null value. */
			FileOutputStream fos = new FileOutputStream("config.xml");
			/* The first method should throw NullPointerException,
			 * as a safety measure for the writer's use case. */
			try {
				fos.write("<Test/>".getBytes());
				fail("WriteFile should not return null, as the writer will throw an exception first.");
			} catch (NullPointerException e) {
				// This is good, this might be that we wrote some XML file
				// and we're not supposed to be able to use it anymore.
				System.err.println("Writefile failure.");
			}
			fos.close();
			return true;
		}
	}
	public TestConfigManagerTest setEnumList(Map<String, String> inEnumList) {
		/* This function is only called by a single method.
		 * The map must be non-final and not be writable,
		 * because if the map already had a writable value,
		 * then getValue will fail. */
		String[] newArray = new String[getSize()[0]];
		System.arraycopy(getEnumList().keySet().toArray(), 
						 0,
						 newArray,
						 0, 
						 getEnumList().keySet().size());
		setProperty(Key.NAME, new ArrayWithIndex(newArray));
		assertSize(newArray.length);
		return this;
	}

	@Override
	public TestConfigManager getConfigurationManagerInstance() {
		return this;
	}
	public static TestConfigManager getInstance() {
		return ConfigurationManagerTest.getInstance();
	}
}