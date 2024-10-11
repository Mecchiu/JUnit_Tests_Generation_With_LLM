// DefaultHomeInputStreamTest.java
package com.eteks.sweethome3d.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import com.eteks.sweethome3d.model.Home;
import com.eteks.sweethome3d.tools.OperatingSystem;
import com.eteks.sweethome3d.tools.URLContent;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultHomeInputStream}.
* It contains ten unit test cases for the {@link DefaultHomeInputStream#readHome()} method.
*/
class DefaultHomeInputStreamTest {

	@Test
	public void testReadHome() throws IOException, ClassNotFoundException {
		// Create a home with a piece of furniture
		Home home = new Home();
		home.addPieceOfFurniture(new HomePieceOfFurniture(new CatalogPieceOfFurniture(
				"chair", "chair.png", "chair.obj", 1, 1, 1, true)));
		// Write home in a temporary file
		File tempFile = OperatingSystem.createTemporaryFile("test", ".sh3d");
		OutputStream tempOut = null;
		try {
			tempOut = new FileOutputStream(tempFile);
			new DefaultHomeOutputStream(tempOut).writeHome(home);
		} finally {
			if (tempOut != null) {
				tempOut.close();
			}
		}
		// Read home from temporary file
		InputStream tempIn = null;
		try {
			tempIn = new FileInputStream(tempFile);
			Home readHome = new DefaultHomeInputStream(tempIn).readHome();
			assertEquals(home.getFurniture().size(), readHome.getFurniture().size());
			assertEquals(home.getFurniture().get(0).getName(), readHome.getFurniture().get(0).getName());
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithContent() throws IOException, ClassNotFoundException {
		// Create a home with a piece of furniture
		Home home = new Home();
		home.addPieceOfFurniture(new HomePieceOfFurniture(new CatalogPieceOfFurniture(
				"chair", "chair.png", "chair.obj", 1, 1, 1, true)));
		// Write home in a temporary file
		File tempFile = OperatingSystem.createTemporaryFile("test", ".sh3d");
		OutputStream tempOut = null;
		try {
			tempOut = new FileOutputStream(tempFile);
			new DefaultHomeOutputStream(tempOut).writeHome(home);
		} finally {
			if (tempOut != null) {
				tempOut.close();
			}
		}
		// Read home from temporary file
		InputStream tempIn = null;
		try {
			tempIn = new FileInputStream(tempFile);
			Home readHome = new DefaultHomeInputStream(tempIn, ContentRecording.INCLUDE_ALL_CONTENT).readHome();
			assertEquals(home.getFurniture().size(), readHome.getFurniture().size());
			assertEquals(home.getFurniture().get(0).getName(), readHome.getFurniture().get(0).getName());
			assertEquals(home.getFurniture().get(0).getIcon().getURL(), readHome.getFurniture().get(0).getIcon().getURL());
			assertEquals(home.getFurniture().get(0).getModel().getURL(), readHome.getFurniture().get(0).getModel().getURL());
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContent() throws IOException, ClassNotFoundException {
		// Create a home with a piece of furniture
		Home home = new Home();
		home.addPieceOfFurniture(new HomePieceOfFurniture(new CatalogPieceOfFurniture(
				"chair", "chair.png", "chair.obj", 1, 1, 1, true)));
		// Write home in a temporary file
		File tempFile = OperatingSystem.createTemporaryFile("test", ".sh3d");
		OutputStream tempOut = null;
		try {
			tempOut = new FileOutputStream(tempFile);
			new DefaultHomeOutputStream(tempOut).writeHome(home);
		} finally {
			if (tempOut != null) {
				tempOut.close();
			}
		}
		// Read home from temporary file
		InputStream tempIn = null;
		try {
			tempIn = new FileInputStream(tempFile);
			Home readHome = new DefaultHomeInputStream(tempIn, ContentRecording.INCLUDE_NO_CONTENT).readHome();
			assertEquals(home.getFurniture().size(), readHome.getFurniture().size());
			assertEquals(home.getFurniture().get(0).getName(), readHome.getFurniture().get(0).getName());
			assertNull(readHome.getFurniture().get(0).getIcon());
			assertNull(readHome.getFurniture().get(0).getModel());
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingHomeEntry() throws IOException, ClassNotFoundException {
		// Create a home with a piece of furniture
		Home home = new Home();
		home.addPieceOfFurniture(new HomePieceOfFurniture(new CatalogPieceOfFurniture(
				"chair", "chair.png", "chair.obj", 1, 1, 1, true)));
		// Write home in a temporary file
		File tempFile = OperatingSystem.createTemporaryFile("test", ".sh3d");
		OutputStream tempOut = null;
		try {
			tempOut = new FileOutputStream(tempFile);
			new DefaultHomeOutputStream(tempOut).writeHome(home);
		} finally {
			if (tempOut != null) {
				tempOut.close();
			}
		}
		// Read home from temporary file
		InputStream tempIn = null;
		try {
			tempIn = new FileInputStream(tempFile);
			ZipInputStream zipIn = new ZipInputStream(tempIn);
			// Remove Home entry
			ZipEntry entry;
			while ((entry = zipIn.getNextEntry()) != null && !"Home".equals(entry.getName())) {
			}
			if (entry != null) {
				zipIn.closeEntry();
			}
			// Read home
			try {
				new DefaultHomeInputStream(zipIn).readHome();
				fail("IOException expected");
			} catch (IOException ex) {
			}
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry() throws IOException, ClassNotFoundException {
		// Create a home with a piece of furniture
		Home home = new Home();
		home.addPieceOfFurniture(new HomePieceOfFurniture(new CatalogPieceOfFurniture(
				"chair", "chair.png", "chair.obj", 1, 1, 1, true)));
		// Write home in a temporary file
		File tempFile = OperatingSystem.createTemporaryFile("test", ".sh3d");
		OutputStream tempOut = null;
		try {
			tempOut = new FileOutputStream(tempFile);
			new DefaultHomeOutputStream(tempOut).writeHome(home);
		} finally {
			if (tempOut != null) {
				tempOut.close();
			}
		}
		// Read home from temporary file
		