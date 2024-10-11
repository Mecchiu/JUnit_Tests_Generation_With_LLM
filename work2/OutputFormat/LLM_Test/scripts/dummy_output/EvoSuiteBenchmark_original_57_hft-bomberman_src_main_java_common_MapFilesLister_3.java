// MapFilesListerTest.java
package common;

import java.io.File;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;
import org.apache.log4j.Logger;
import messages.global.MapInfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MapFilesLister}.
* It contains one unit test case for the {@link MapFilesLister#ListMaps(String)} method.
*/
class MapFilesListerTest {
		
	static final String FILES = ".dir";

	/**
	 * test empty
	 */
	@Test
	public void testEmpty() {
	    List<File> mapfiles = null;
	    List<MapInfo> mapinfos = null;

		try {
			listMapfiles();

			assertNotNull(mapfiles);
			assertNotNull(mapinfos);

			assertEquals(0, mapfiles.size());
			assertEquals(0, mapinfos.size());
		} catch (Throwable t) {
			logger.fatal(t);
		}
	}

	/**
	 * test file with two maps files
	 */
	@Test
	public void testTwoMaps() {
			
		List<File> mapfiles = ListMaps(System.getProperty("basedir", "/")+FILES);
		List<MapInfo> mapinfos = getMapInfoList();
		
		assertNotNull("no mapfiles", mapfiles);
		assertNotNull("no mapinfo list", mapinfos);

		assertEquals(2, mapfiles.size());

		String firstmap = "firstmap";
		String secondmap = "secondmap";

		//assert exists firstmap
		assertTrue(mapfiles.contains(new File(firstmap)));
		//assert exists secondmap
		assertTrue(mapfiles.contains(new File(secondmap)));

		assertEquals(firstmap, mapFiles.get(0).getName());
		assertEquals(secondmap, mapFiles.get(1).getName());

		assertEquals(1, mapinfos.size());
		MapInfo info = mapinfos.get(0);
		assertNotNull(info);
		assertNotNull(info.theName);
		assertNotNull(info.theMapName);
		assertNull(info.theMapFile);
		assertNotNull(info.theURL);

		assertEquals(firstmap, info.theName);
		assertEquals(2, info.getNumMaps());
		assertEquals(1, info.getNumMaps()*info.getUrl().length());
		assertEquals(1, info.getNumMaps()*info.getUrl().length() % 2);
		assertEquals(10.01, info.getPreview(), 0.000001);
		assertEquals(1.0, info.getPreviewPrec(), 0.000001);
		assertEquals(1.0, info.getPreview(),0.000001);
	}

	private void listMapfiles() {
		LinkedList<File> fileList = new LinkedList<>();

		MapInfo mapInfo = null;

		// read the maps from all the maps files
		for (File mapfile : listMaps(System.getProperty("basedir", "/") + FILES)) {
			if (mapfile!= null && mapfile.isFile()) {
				fileList.add(mapfile);
			}
		}

		// read the maps from the lists
		mapInfo = new MapInfo();
		mapInfo.setName("firstmap");
		mapInfo.setTheName("firstmap");
		mapInfo.setNumMaps((Math.round(
				1.0d / fileList.size())));
		mapInfo.setPreview(10.0d);
		mapInfo.setPreviewPrec(1.0d);

		List<File> list = new LinkedList<>();
		ListIterator<File> it = fileList.listIterator();
		while (it.hasNext()) {
			list.add(it.next());
		}

		mapinfos.clear();
		mapinfos.add(mapInfo);

		// read the previews from all the maps files
		for (File mapfile : list) {
			if (mapfile!= null && mapfile.isFile()) {

				MapInfo info = readMapFile(mapfile.getAbsolutePath());

				info.setUrl(mapfile.toURL());

				mapinfos.add(info);
			}
		}

		// read the previews from the lists
		mapinfos = readMapInfoList(list);
	}

	private MapInfo readMapFile(String mapFile)
	throws Exception
	{

		File mapinfo = new File(mapFile);

		MapInfo map = new MapInfo();
		map.setName(mapFile);

		InputStream in = null;
		try {
			if (map.getTheName().toString().endsWith(FILES)) {
				// first maps file from previous testing
				in = new FileInputStream(mapFile);
				byte[] bytes = new byte[4096];

				int bytesRead = 0;

				in.read(bytes);

				in.close();

				int data = in.read();

				while (data!= -1) {

					byte[] b = new byte[512];
					int read = in.read(b);
					if (read > 0) {
						in.write(b, 0, read);
						bytesRead += read;
					}

					
					data = in.read();
				}

				in.close();

				data = in.read();

				while (data!= -1) {
					byte[] b = new byte[512];
					int read = in.read(b);
					if (read > 0) {
						in.write(b, 0, read);
						bytesRead += read;
					}

					data = in.read();

				}
			} else {
				// first maps file from previous testing
				in = new FileInputStream(mapFile);
				byte[] bytes = new byte[4096];

				int bytesRead = 0;

				in.read(bytes);

				in.close();

				int data = in.read();

				while (data!= -1) {
					byte[] b = new byte[256];
					int read = in.read(b);
					if (read > 0) {
						in.write(b, 0, read);
						bytesRead += read;
					}

					data = in.read();
				}

				in.close();
			}

			return map;
		}
		finally {
			if (in!= null) {
				in.close();
			}
		}
	}

	private List<MapInfo> readMapInfoList(List<File> mapfiles)
	throws Exception {

		ListIterator<File> it = mapfiles.listIterator();
		List<MapInfo> infoList = new Vector<>();

		MapInfo info;

		while (it.hasNext()) {
			info = readMapInfo(it.next().getAbsolutePath());
			infoList.add(info);
		}

		return infoList;
	}

	private MapInfo readMapInfo(String mapFile)
	throws Exception {


		File mapinfo = new File(mapFile);

		InputStream in = null;
}
}