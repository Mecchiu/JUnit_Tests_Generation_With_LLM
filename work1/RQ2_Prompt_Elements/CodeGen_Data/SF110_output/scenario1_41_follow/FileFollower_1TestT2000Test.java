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
    
    @Test
    public void test1() throws IOException {
        File source = new File("TestFile");
        File destination = new File("dest");
	
        // create a source and destination File objects by their name
        destination.getParentFile().mkdirs();
        File sourceF = new File(source.getParentFile(), source.getName());
        File destinationF = new File(destination.getParentFile(), destination.getName());
        
        // create a list of destination files
        List<File> destinationFiles = new ArrayList<>();
        destinationFiles.add(destinationF);
        
        // create a list of source files
        List<File> sourceFiles = new ArrayList<>();
        sourceFiles.add(sourceF);
        
        // execute the first action for each test of the test.
        List<String> lines = new ArrayList<>();
        lines.add("//this is a test.");
        lines.add("//this is a test.");
        lines.add("//this is more...");
        lines.add("//this is more...");
        lines.add("//this is more...");
        lines.add("//this is more more.");
        lines.add("//this is more more.");
        lines.add("//this is more more more.");
        lines.add("//this is more more more more.");
        lines.add("//this is more, more more.");
        lines.add("//this is more, more again.");
        lines.add("//this is more, more again again.");
        lines.add("//this is more, more again again again.");
        lines.add("//this is more, more again again again again.");
        lines.add("//this is more, more again again again again again.");
        lines.add("//this is more, more again again again again again again.");
        lines.add("//this is more, more, more again.");
        lines.add("//this is more, more, more again.");
        lines.add("//this is more, more, more again.");
        lines.add("//this is more, more, more again again.");
        lines.add("//this is more, most...");
        lines.add("//this is most times.");
        lines.add("//this is most times again.");
        lines.add("//this is most times again.");
        lines.add("//this is most times, times again.");
        lines.add("//this is most times, times again times again.");
        lines.add("//this is most times, times times times times times times times times.");
        lines.add("//this is most times, times times times times times times times same, times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times now.");    
        lines.add("//this is most times, times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times only, almost, times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times time times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times times";
        outputDestination.sendLines(lines, FileFollower.REPLY_CONFIRM, sourceFiles, destinationFiles, destination.toString());
        if ((lines.size() == 3) || (lines.size() == 4)) {
            assertTrue((lines.get(0).length() > 0));
            assertTrue((lines.get(1).length() > 0));
            System.out.println(lines.get(0));
            assertTrue((lines.get(1).length() > 0));
            System.out.println(lines.get(1));
        } else {
            System.out.println("FAIL");
            
        }
    }
    
    private List<OutputDestination> outputDestinations = new ArrayList<>();
    
    /*
	    @Test
	    public void test2() throws IOException {
		    
		    String input = "\n";
		    
		    outputDestinations.add(new OutputDestination("unix"));
            outputDestinations.add(new FileDestination(new File("/")));
            
            addLinesToFile(outputDestinations.get(0), "first line", input);
            
            List<String> lines = new ArrayList<>();
            
            lines.add("//this line also counts.");
            addLinesToFile(lines.get(0), "this line already counts", "");
            lines.add("//this also counts.");
            lines.add("//this line counts.");
            lines.add("//this line also counts.");
            
            lines.add("//this also counts.");
            lines.add("//this line also counts