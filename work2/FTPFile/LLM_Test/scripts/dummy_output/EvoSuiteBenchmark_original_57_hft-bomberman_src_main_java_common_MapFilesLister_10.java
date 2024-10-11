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
		
	/**
	 * test whether the class is clear all MapPreview files
	 * @throws Exception
	 */
    @Test
    public void TestListMaps() throws Exception {
        File tempMapDir = new File(TestSettings.TEMP_DIR);
        File[] files = new File[] {new File(tempMapDir, "TestMap.xml"), new File(tempMapDir, "TestMapNested.xml")};
        for (int i=0; i<files.length; i++) {
                // first check all maps exists in temp dir
                if (!files[i].exists() && files.length>1) {
                List<File> previewList = new LinkedList<File>();
                List<File> nestedList = new LinkedList<File>();
                List<MapInfo> mapinfos = new LinkedList<MapInfo>();
                for( int j=0; j<files.length; j++) {
                    File mapFile = files[j];
                    if (mapFile.exists()) {
                        if (mapFile.isDirectory()) {
                            // this is a directory; check if it contains any of
                            // the files
                            File[] subFiles = mapFile.listFiles();
                            for (int k = 0; k < subFiles.length; k++) {
                                // this test the the same iff the file exists
//                            if (subFiles[k].exists()) {
                                if (subFiles[k].isFile() && subFiles[k].getName().endsWith(".map")) {
                                    logger.info("Test file="+subFiles[k].getName());
                                    List<File> files = FileUtils.collectReceivedFiles(files, subFiles);
//                                    System.out.println(files);
                                    
                                    mapinfos.add(new MapInfo(subFiles[k].getName(), subFiles[k].length()));
                                    if (files.length > 1) {
                                        for (File f : files) {
                                            if (f.isFile()) {
                                                List<File> previewList = ListFiles(f.getName());
//                                            logger.info(previewList);
                                            if (previewList.size() > 0) {
                                                previewList.remove(0);
                                            }
                                            if (previewList.size() == 0) {
                                                nestedList.add(f);
                                            } else {
                                                nestedList.add(f);
//                                            logger.info(nestedList);
                                            }
                                        }
                                    }
                                    }
                                }
                            }
//                            if (mapinfos.size() > 1) {
//                                System.out.println("File "+(files.length-1)+" exists but it has "+mapinfos.size()+" maps");
//                                System.out.println(files.length+" files exist but "+mapinfos.size()+" mapinfos exist");
//                            }
                            }
                        } else if (mapFile.isRegularFile()) {
                            List<File> previewList;
                            if (FileUtils.collectReceivedFiles(files, mapFile).size() > 0) {
                                previewList =  FileUtils.collectReceivedFiles(files, mapFile);
                            } else {
                                logger.info("Skip File "+(files.length-1)+" doesn't exist");
                            }
//                            if (nestedList.size() == 0) {
//                                logger.info(nestedList);
//                            } else {
//                                nestedList.remove(0); logger.info(nestedList);
//                            }
                        } else {
                            logger.error("MapFile "+mapFile.getName()+" seems to be a normal file - ignoring");
                        }
                    }
                }
                if (nestedList.size() > 0) {
                    logger.info("List files for nested maps - removing the nested "+(nestedList.size()+" files"));
                    previewList.removeAll(nestedList);
                    nestedList.clear();
                }
                // check for duplicate map-files (not yet supported)
                if (mapinfos.size() > 1) {
                    logger.info("List files for duplicate maps - removing duplicate maps");
                    previewList.removeAll(mapinfos);
                    mapinfos.clear();
                }
                if (mapinfos.size() > 0) {
                    logger.info("List files for duplicate maps - adding the mapinfos");
                    mapinfos.add(new MapInfo(mapinfos.get(0).getName(), mapinfos.get(0).getSize()));
                } else {
                    logger.info("List files for duplicate maps - No maps need to be listed");
                }
                if (previewList.size() > 0) {
                    File tmp = new File(tempMapDir, "__TestPreview");
                    new File(tmp).mkdir();
                    for (int i=0; i<previewList.size(); i++) {
                        File tmpPreview = new File(tmp, previewList.get(i).getName()+(i>0?("_"+(i%1000)+"") : ""));
                        try {
                            FileUtils.saveMapPreview(mapinfos, previewList.get(i), tmpPreview);
                            logger.info("File added in preview: "+ tmpPreview.getName());
                        } catch (Exception ex) {
                            logger.warn(ex.toString());
                        }
                    }
                }
                // check for duplicate n-directories
                if (files.length > 1) {
                    logger.info("List files for duplicate dirs");
                    File tmp = new File(tempMapDir, "__TestNested");
                    tmp.mkdir();
                    List<File> tmpNestedList = ListFiles(tmp.getName());
                    if (tmpNestedList.size() > 0) {
                        logger.info("List files for duplicate dirs");
                        for (File f : tmpNestedList) {
                            logger.info(f.isFile());
                        }
                        // remove the dirs
                        tmpNestedList.removeAll(tmp.listFiles());
                        // add the dirs after checking
                        File tmpNested = new File(tmpNestedList.get(0).getName());
                        tmpNested.mkdir();
                    }
                }
            }
        }
}