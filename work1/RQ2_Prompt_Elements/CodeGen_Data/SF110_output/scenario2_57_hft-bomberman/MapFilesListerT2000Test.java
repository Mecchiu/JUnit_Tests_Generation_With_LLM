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
		 * class for logger
		 */
        static final Logger logger = Logger.getLogger(MapFilesListerTest.class);
    
        /**
         * Main method of this testing class
         */
        @Test
        void testListsMapsJunitReport() {
            String[] args = {"test-data/maps.xml"};
            logger.info("Test Class: " + this.getClass().getSimpleName());
            logger.info("Test Method: " + args[0]);
            try {
                Object testClass = this.getClass();
                List<String> listMaps = this.testListsMaps(args, testClass);
                logger.info("Lists maps with success: " + listMaps);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new RuntimeException(e.getMessage());
            }
        }

    /**
     * method for searching XML-File with the given parameter
     * {@code args[0] = Directory to be searched for Map-files}
     *
     * @param args -
     *            directory to be searched in
     * @param testClass -
     *            test-class
     * @return List<File>
     * @throws ClassNotFoundException -
     *             class could not be found
     */
    private List<String> testListsMaps(String[] args, Class<?> testClass) throws ClassNotFoundException {
        logger.info("Testing " + args[0]);
        String mapXmlFileName = args[0];
        List<File> result = new LinkedList<File>();
        // list maps from the directory to build a Vector <File>
        File mapXmlSearchPath =  new File(args[1]);
        List<File> mapXmlListFiles = new Vector<File>();
        if (mapXmlSearchPath.isDirectory()) {
            logger.info("searching for files in map folder [" + mapXmlSearchPath.getAbsolutePath() + "] ");
            File[] listMapDirFiles = mapXmlSearchPath.listFiles();
            for (int i = 0; i < listMapDirFiles.length; i++) {
                String xmlFile = listMapDirFiles[i].getAbsolutePath();
                logger.info("read xml-file: " + listMapDirFiles[i].getAbsolutePath());
                // add file and search
                if (xmlFile.endsWith(".xml")) {
                    fileToBeSearchIn = listMapDirFiles[i];
                    boolean checkMatch = false;
                    if (fileToBeSearchIn.toString().endsWith("-")) {
                        result.add(new File(listMapDirFiles[i].toString() + ".xml"));
                    } else {
                        result.add(new File(fileToBeSearchIn.toString().substring(
                                    fileToBeSearchIn.toString().lastIndexOf("-")) + ".xml"));
                        logger.info("file exists for search: " + fileToBeSearchIn.toString());
                        logger.info("Searching for match for: " + mapXmlFileName);
                        checkMatch = listFiles(mapXmlFileName).indexOf(fileToBeSearchIn) > -1;
                    }
                    // check if the found file is in result list files
                    if (checkMatch) {
                        logger.info("found in result list files");
                    } else {
                        // if not
                        logger.info("not in result list files");
                        // file was not found in result list
                        mapXmlListFiles.add(fileToBeSearchIn);
                    } // end of if (checkMatch)
                }
            } // end of for (int i = 0; i < listMapDirFiles.length; i++) {
            // loop for map files (in case of nested maps)
            for (File mapXmlFile : mapXmlListFiles) {
                // add directory to end if not in list already
                if (!result.contains(mapXmlFile)) {
                    logger.info("Add xml file: " + mapXmlFile.toString());
                    result.add(mapXmlFile);
                }
            }
        }
        logger.info("The list contains: " + result);
        return result;
    }

    /**
     * @param args
     *            - input directory with xml-files
     * @throws ClassNotFoundException
     *             - class could not be found (probably a file with an incorrect extension)
     */
    private void addXmlFileToResultList(String[] args) throws ClassNotFoundException {
        boolean checkMatch = true; // default value
        for (int i = 0; i < args.length; i++) {

            String mapXmlFileName = args[i];
            // add directory to end if not in list already
            if (!mapXmlListFiles.contains(new File(mapXmlFileName))) {
                logger.info("Add xml file: " + mapXmlFileName.toString());
                mapXmlListFiles.add(new File(mapXmlFileName));
                // test matching
                checkMatch = listFiles(mapXmlFileName).indexOf(args[i]) > -1;
            } else {
                logger.error("addXmlFile to already in list");
                throw new RuntimeException("addXmlFileToAlreadyInList");
            }
        }
        if (checkMatch) {
            logger.info("search for: " + mapXmlFileName);
        } else {
            logger.info("not in result list (" + mapXmlFileName + ")" + " is not existing in result list");
        }
    }

    // search in the directory for files with XML files-extension
    private File[] listFiles(String xmlFileName) {
        logger.info("Reading XML-File: " + xmlFileName);
        logger.debug("files found in directory: " + mapXmlFileName);
        List<File> result = new Vector<File>();
        if (xmlFileName.toLowerCase().endsWith(".json")) {
            addXmlFileToResultList(new String[] { xmlFileName });
            logger.debug("directory does not match expected format (" + mapXmlFileName + ")");
        } else {
            // read content inside this directory
            File[] listMapDirFiles = mapXmlFileName.toLowerCase().
                    replaceAll("\\.", "/").split(".xml");
            logger.info("Found: " + listMapDirFiles.length + " files