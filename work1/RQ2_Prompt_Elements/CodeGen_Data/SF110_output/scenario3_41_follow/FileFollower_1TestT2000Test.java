// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {

    /**
     * Test cases to be run by this class through the {@link FileFollower#removeOutputDestination(OutputDestination)} method,
     * where the file's contents to be printed is '-f F.txt'.
     * @throws IOException on failure
     * @throws InterruptedException on failure
     * @see FileFollower.FileFollower_1Test#removeOutputDestination(OutputDestination,OutputDestination)
     */
    @Test
    void testRemoveOutputDestination_F() throws IOException, InterruptedException {
        FileFollower f = new FileFollower(OutputDestination.STDOUT);
        f.setDestination(OutputDestination.STDOUT);
        f.setFoldersToFollow(new ArrayList<File>());
        
        f.setFile("-f F.txt");
        
        f.after(1);
        
        f.after(1);
        
        f.after(1);
        
        OutputDestination f1 = output("F.txt", "F");
        f1.after(1);
        
        assertEquals(f.getDestination(), OutputDestination.STDERR);
        OutputDestination.STDOUT.clear();
        assertEquals(f.getDestination(), OutputDestination.STDOUT);
    }
    
    /**
     * Test cases to be run by this class through the {@link FileFollower#removeOutputDestination(OutputDestination)} method,
     * where the file's contents to be printed is '-f F.txt'.
     * @throws IOException on failure
     * @throws InterruptedException on failure
     * @see FileFollower.FileFollower_1Test#removeOutputDestination(OutputDestination,OutputDestination)
     */
    @Test
    void testRemoveOutputDestination_S() throws IOException, InterruptedException {
        FileFollower f = new FileFollower(OutputDestination.STDERR);
        f.setDestination(OutputDestination.STDERR);
        f.setFoldersToFollow(new ArrayList<File>());
        
        f.setFile("-f F.txt");
        
        f.after(1);
        
        f.after(1);
        
        OutputDestination f1 = output("F.txt", "F");
        f1.after(1);
        
        assertEquals(f.getDestination(), OutputDestination.STDOUT);
        OutputDestination.STDERR.clear();
        assertEquals(f.getDestination(), OutputDestination.STDOUT);
    }
    
    /**
     * Test case to be executed when you have written one or more files to F.txt, but not 
     * to any other folder or file name, before the {@link #waitForOutputDestinationToDisappearByWaitingForAnyOutputToPrintToAFile(File)}
     * command completes (which may be the case if the file contents have already been '-f F.txt').  
     * The class 'waitForOutputDestinationToDisappearByWaitingForAnyOutputToPrintToAFile' is meant to be used when we're
     * working with the outputs of a {@link FileFollower} that are not yet {@link FileFollower#waitForOutputDestinationToDisappearByWaitingForAnyOutputToPrintToAFile(File)}. 
     */
    @Test
    void testWaitForOutputDestinationToDisappearButNotAFile() throws IOException, InterruptedException {
        FileFollower f = new FileFollower(OutputDestination.STDOUT);
        f.setDestination(OutputDestination.STDOUT);
        f.setFoldersToFollow(new ArrayList<File>());
        
        f.setFile("-f F.txt");
        
        output("-", "F");

        OutputDestination f1 = output("F.txt", "F");

        f.waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile();
        
        f.waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile();
        
        assertEquals(OutputDestination.STDERR, f.getDestination());
    }
    
    private void waitForOutputDestinationToDisappearByWaitingForAnyOutputToPrintToAFile() {
    	int exitCode = 0;
        while (exitCode!= 1 || File.exists("F.txt")) {
            logger.log(Level.WARNING, "Waiting for any file to print to F...");
            Thread.sleep(100);
        }
    }
    
    private void assertOutputDestinationToDisappearByWaitingForAnyOutputToPrintToAFile() {
        File expectedFile = new File("F.txt");
        File actualFile = new File("F.txt");
        
        assertSame(expectedFile, actualFile);
        
        assertTrue(expectedFile.exists());
    }
    
    private static String output(String fileName, String fileExtension) {
        return OutputDestination.STDOUT.outputToString() + "\"  " + fileName + "  " + fileExtension;
    }

    /**
     * An output destination, used by {@link FileFollower#waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile()}
     */
    public static class OutputDestination {
        
        //private static int numThreads = 1;
        
        public static List<OutputDestination> getOutputDestinations(List<File> foldersToFolders) {
            //numThreads = 1;
            synchronized (OutputDestination.class) {
                assert numThreads > 1;
                //assert (numThreads % 2 == 1);
                List<OutputDestination> destinations = new ArrayList<OutputDestination>();
                
                OutputDestination dest1 = new FileFollower().waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile();
                OutputDestination dest2 = new FileFollower().waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile();
                assert dest1.equals(dest2);
                
                for (File folder : foldersToFolders) {
                    for (File file : folder.listFiles(FileFollower.fileNameFilter)) {
                        destinations.add(new FileFollower().waitForOutputToDisappearByWaitingForAnyOutputToPrintToAFile(file));
                    }
                }
                
                assert!dest1.equals(dest2);
                for (OutputDestination dest : destinations) {
                    assert dest.equals(dest2)