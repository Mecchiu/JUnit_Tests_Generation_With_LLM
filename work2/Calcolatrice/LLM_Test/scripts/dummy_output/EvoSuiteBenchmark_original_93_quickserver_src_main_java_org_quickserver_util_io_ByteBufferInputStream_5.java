// ByteBufferInputStreamTest.java
package org.quickserver.util.io;

import java.io.*;
import java.nio.*;
import java.nio.charset.*;
import java.util.*;
import org.quickserver.net.server.ClientHandler;
import java.util.logging.*;
import org.quickserver.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteBufferInputStream}.
* It contains one unit test case for the {@link ByteBufferInputStream#readLine()} method.
*/
class ByteBufferInputStreamTest {
		
	/**
	 * This method can be call in two modes and must be
	 * interrupted or stopped in case of a problem.
	 */
	synchronized void test() throws InterruptedException, IOException {
		
		final String firstLine = "First line";
		final int firstLineSize = firstLine.length();
		final int secondLineSize = 1000;
		byte[] line1 = {};

        try (
				java.nio.channels.Channels channels1 =
						new java.nio.channels.Channels(
								io.newBufferedInputStream(new ByteBufferInputStream(
		                             			firstLine, 
		                             			firstLineSize, 
		                             			io.newBufferedInputStream(new ByteBufferInputStream(
		                          				System.getProperty("line.separator", "\n")
		                              	)
		                             	))
					)
		) {
			
			System.out.println("waiting for line: "+ firstLineSize+ firstLine);

			//Wait for line
			int index = 0;
			while (index < firstLineSize) {

				//Reading the line to ensure
				//that the returned text is not "empty"
				//or the line terminator
				firstLine += line1[index++];
				System.out.println("Line: "+ firstLine);
				
			}

			firstLine = "";
			System.out.println("firstline is "+ firstLine);

			while (index < secondLineSize) {

				//Reading the line to ensure
				//that the returned text is not "empty"
                	//or the line terminator
				firstLine += line1[index++];
				System.out.println("Line: "+ firstLine );

			}

			firstLine = "";
			System.out.println("firstline is " + firstLine);

			//Close the channels.
			channels1.close();
        } catch (InterruptedException e) {
                //The end of test will continue here.
        } catch (IOException e) {
          //An IOException will make the test fail.
        }
	}

}