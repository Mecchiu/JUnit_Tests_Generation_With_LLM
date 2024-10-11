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
		private final Logger logger = Logger.getLogger(FileFollower_1Test.class.getName());
		
		@Test
    public void testRemoveOutputDestination() throws IOException {
            List<File> expectedFiles = new ArrayList<File>();    
            expectedFiles.add(new File("expected"));
            expectedFiles.add(new File("expected2"));

            final StreamLineConverter lineConverter = new StreamLineConverter("\nLine 1\n", new StringReader("Line 2")); 
            final OutputDestination expectedDestinationForOutputs = OutputDestination._TEST_OUTPUT;
            final OutputDestination outputDestination = OutputDestination.createOutputDestination(lineConverter, expectedDestinationForOutputs, null);

			assertTrue(OutputDestination.isOutputDestination(outputDestination));
            assertEquals(expectedDestination.getDestinationClass(), outputDestination.getDestinationClass());

            assertEquals(expectedFiles.size(), outputDestination.getOutputDestinations().size());

            int i = 0;
            for (OutputDestination destination: outputDestination.getOutputDestinations()) {
				if (expectedDestinationForOutputs == destination) {
					i++;
				}
			}
    		assertEquals(i, outputDestination.getOutputDestinations().size());
    		List<String> lines = new ArrayList<String>(outputDestination.getOutputDestinations().size());

				for (OutputDestination destination: outputDestination.getOutputDestinations()) {
					int lineIndex = outputDestination.getOutputDestinations().indexOf(destination);
					lines.add(lineConverter.readLine(new BufferedInputStream(new FileInputStream(new File("expected" + i)))).toString());
				}
	        assertEquals(lines, lines); // same number
    		
    		assertEquals(StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs), 
    				lineConverter.writeLineAsText(new BufferedInputStream(new FileInputStream(new File("expected"))), StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs)));
    		assertEquals(
				lineConverter.readLine(new BufferedInputStream(new FileInputStream(new File("expected3"))), StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs))
					.toString()
					.trim(), "");
    		assertEquals(StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs) + StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs), 
    				lineConverter.readLine(new BufferedInputStream(new FileInputStream(new File("expected2"))), StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs)));
            
            expectedNumOfLines = 0;
            for (OutputDestination outputDestination: outputDestination.getOutputDestinations()) {
				expectedNumOfLines += outputDestination.getOutputDestinations().size();
			}

        	assertEquals(expectedDestinationForInputs, outputDestination.getOutputDestinations());
        	logger.log(Level.INFO, "Expected num of lines = {0}", expectedNumOfLines); 
        	
			assertTrue(expectedDestinationForInputs!= outputDestination.getOutputDestinations());
			assertTrue(expectedNumOfLines!= outputDestination.getOutputDestinations().size());
    		
			int i = 0;
			for (OutputDestination destination: outputDestination.getOutputDestinations()) {
				for (File file: expectedDestination.getOutputDestinations()) {
					String path = destination.getFileName() + " " + i;
					path = StringConverter.joinPaths(path, file.getPath());
					expectedFiles.get(i).setPath(path);
					logger.log(Level.INFO, "Adding file {0}", path);
					((BufferedInputStream) new BufferedInputStream(new FileInputStream(new File(path)))).read();    // do not use assertFileIsNotEmpty()
		        	assertEquals(expectedFiles.get(i).getPath(), path); // same path
	        		i++;
				}
			}
			assertEquals(i, expectedFiles.size()); // same number
    		for (String filePath: expectedFiles) {
				assertEquals(StringConverter.joinPaths(expectedDestinationsForInputs.getFileName(), filePath), filePath); 
    			assertEquals(StringConverter.joinPaths(expectedDestinationsForInputs.getFileName(), filePath), 
    					StringConverter.createDelimitedWithFixedFieldDelimiterConvertor(expectedDestinationsForInputs));
    		}
    		
    		assertTrue(expectedDestinationForInputs!= outputDestination.getOutputDestinations());
    		assertTrue(
    			lineConverter.readLine(new BufferedInputStream(new FileInputStream(expectedDestination.getOutputDestinations().getFile(0))), null), 
    			StringConverter.joinPaths(expectedDestinationsForInputs.getFileName(), expectedDestinationsForInputs.getFile(0).getPath()));
    }
}