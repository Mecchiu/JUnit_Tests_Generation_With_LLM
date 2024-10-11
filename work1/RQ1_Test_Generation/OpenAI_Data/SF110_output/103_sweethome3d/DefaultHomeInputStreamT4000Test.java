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
			// Check home is equal to the written one
			assertEquals(home, readHome);
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
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
			Home readHome = new DefaultHomeInputStream(tempIn, ContentRecording.INCLUDE_ALL_CONTENT).readHome();
			// Check home is equal to the written one
			assertEquals(home, readHome);
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
		InputStream tempIn = null;
		try {
			tempIn = new FileInputStream(tempFile);
			Home readHome = new DefaultHomeInputStream(tempIn, ContentRecording.INCLUDE_ALL_CONTENT).readHome();
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry2() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry3() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry4() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry5() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry6() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry7() throws IOException, ClassNotFoundException {
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
			// Check home is equal to the written one
			assertEquals(home, readHome);
		} finally {
			if (tempIn != null) {
				tempIn.close();
			}
		}
	}
	
	@Test
	public void testReadHomeWithMissingContentEntry8() throws IOException, ClassNotFoundException {
		// Create a home