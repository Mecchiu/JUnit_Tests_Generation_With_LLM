// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		
    private final String root;
    private final File inputDir;

    private final File outputDir;
    private final boolean doXml;
    private final boolean outputXml;

    private static final List<String> SPS = Arrays.asList("/etc/");
    private static final List<String> MYS = new ArrayList<>();
    private static final List<String> DYNA = new ArrayList<>();
    private static final List<String> PPS = new ArrayList<>();
    private static final List<String> MYS1 = new ArrayList<>();

//     public LagoonProcessorTest() {
//         // Set root-dir to the input dir with an empty root-dir
//         root = System.getProperty("root");
//         inputDir = new File(root, "/input");
//         assertTrue("Root dir is inaccessible", rootDir("/").exists());
//     }
    
	public LagoonProcessorTest(boolean outputXml, boolean doXml, boolean force) throws IOException {
        for (String f : SPS) {
            SPS.add(f + File.separator + "/index.sitemap");
        }		
        for (String f : PPS) {
            PPS.add(f + File.separator + "/index.phps");
        }
        for (String f : MYS) {
            MYS.add(f + File.separator + "/index.xml");
        }
        for (String f : DYNA) {
            DYNA.add(f + File.separator + "/index.xml");
        }
        this.doXml = (outputXml!= false)? doXml : false;
        this.outputXml = (outputXml!= false)? outputXml : false;
        this.outputDir = outputXml? new File(root + File.separator + "/index.xml") : new File(root);
        this.inputDir = inputDir;
    }

    /**
     * Create the directory hierarchies.
     */
	public void create() {
	    try (DirectoryIterator i = new DirectoryIterator(inputDir)) {
            TreeNode rootNode = i.next();
            while (i.hasNext()) {			
                File rootFolder = i.next();
                if (!rootFolder.equals("/") &&!rootFolder.equals(".")) {
                    createNode(rootNode, rootFolder);
                    writeRootNode(rootNode);
                }
            }
	    } catch (IOException ignored) {
            // Ignore the error
	    }
    }

    /**
     * Perform a set of XML transformations.
     * This method is invoked at the beginning and must be overridden.
     * @param rootNode the root node for the transformation.
     * @param rootFolder the root directory where the transformation is performed.
     */
    protected abstract void createNode(Object rootNode, File rootFolder);
    
    /**
     * Write the root.
     */
    protected abstract void writeRootNode(TreeNode rootNode);
    
    /**
     * Clean all directories.
     */
    protected void destroy() {
        try {
            if (outputDir!= null) {
                assertTrue("Output dir is non-existent", outputDir.exists());
                assertTrue("Empty output dir", outputDir.isDirectory());
            }
            assertTrue("Only one folder was created", outputDir.list().length==1);
            for (String child : MYS) {
                boolean wasCreated;
                try {
                    writeXML(outputDir, child, doXml? false : true);
                    // Wait for the transformation to stop - otherwise, the transformation may return null
                    wasCreated = inputDirToDir().isEmpty() && child.endsWith(File.separator);
                } catch (java.io.IOException t) {
                    wasCreated = false;
                }
                assertTrue("Folder does not exist", wasCreated);
            }
            assertTrue("Empty input", inputDirToDir().isEmpty());
        } catch (FileNotFoundException f) {
            // ignore
        }
    }
    
    /**
     * @return the input dir to process. Must not be null.
     */
    protected abstract Iterator<File> inputDirToDir();

    /**
     * @return the output dir. Must not be null.
     */
    protected abstract File outputDir();
    
    /**
     * @return the root node of all of the directories, must not be null.
     */
    protected abstract TreeNode rootNode();
    
    /**
     * @param filename input file
     * @return the File with the input file as content
     */
    private static File inputDir(String filename) {
        return new File(filename).isDirectory()? new File(filename) : new File(filename).getParentFile();
    }

    /**
     * @param root the root of the transformation
     * @param filename Input file name
     * @param force to create if the file does not exist
     * @return true if the file was successfully created, otherwise false
     * @throws FileNotFoundException if the
     */
    protected static boolean createNode(Object root, String filename, boolean force) throws FileNotFoundException {
        File file = inputDir(filename);
        if (file!= null) {
            return createNode(root, file, force);
        }
        return false;
    }
    
    private static void writeXML(File xml, String filename, boolean doWrite) throws IOException {
        File destFile = new File(xml);
}
}