// FileFollower_0Test.java
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
* It contains one unit test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {

    /**
     * Unit test case for the {@link FileFollower#addOutputDestination(FileFollower.OutputDestination)} method.
     * Tests all possible ways to add an output destination to this object.  It checks that
     * the object implements the {@link OutputDestination} interface.
     */
    @Test
    public void outputDestinationsTest() {
        OutputDestination expectedDestory = new OutputDestination() {
            @Override
            public void sendFileContent(File file) {
                //noinspection ResultOfMethodCallIgnored
                System.out.println("SendFileContent File=" + file.getName());
            }
        };
        OutputDestination follower = new FileFollower.OutputDestinationsBuilder().addOutputDestinition(expectedDestory).build();
        OutputDestination actualDestory = follower.addOutputDestination(expectedDestory);
        assertEquals(expectedDestory, actualDestory);
    }
    
    @Test
    public void sendOneFileTest() throws IOException {
        
        File f1 = new File("src/test/resources/gutenberg.txt");
        BufferedInputStream f1in = new BufferedInputStream(new FileInputStream(f1));
        List<String> f1output = readFromAllThreads(20);
        List<String>[] f1outputThreads = split(f1output, 10);
        long f1fence = System.currentTimeMillis();
        long f1size = f1in.available();
        long f1offset = f1in.getTotalBytesRead();
        System.out.println("\r" + f1in.read() + " read bytes in " + (System.currentTimeMillis() - f1fence) + " ms");
        long f1time = System.currentTimeMillis();
        
        Logger.getLogger(FileFollower.class.getName()).log(Level.INFO, "FileFollower.sendOneFile, first file "+f1fence + " bytes read");
        f1outputThreads[0].clear();
        List<String> f1outputNext = readFromThread1(f1fence);
        long f1sizeNext = readWithThread1(f1fence).getFirstNumberOfBytes();
        long f1offsetNext = readWithThread1(f1fence).getFirstNumberOfBytes();

        System.out.println("\r" + f1in.read() + " read bytes in " + (System.currentTimeMillis() - f1fence) + " ms");
        Logger.getLogger(FileFollower.class.getName()).log(Level.INFO, "FileFollower.sendOneFile, second file "+f1fence+" bytes read");
        System.out.println("\r"+ f1outputNext + "\n";
        assertOrderedEquals(f1output, f1outputNext);
        
        
        f1fence = System.currentTimeMillis();
        logFileContent(f1fence, f1fence+f1size);
        f1size = f1in.available();
        f1offset = f1in.getTotalBytesRead();
        Logger.getLogger(FileFollower.class.getName()).log(Level.INFO, "FileFollower.sendOneFile, read after " + (System.currentTimeMillis() - f1fence) + " sec");
        f1sizeNext = readWithThread1(f1fence);
        f1offsetNext = readWithThread1(f1fence);
        logFileContent(f1fence, f1fence+f1size);
        System.out.println("\r" + f1in.read() + " read bytes in " + (System.currentTimeMillis() - f1fence) + " sec");
        System.out.println("Total bytes read: " + f1size + ", total bytes read before : " + f1sizeNext + ", total bytes read after : " + f1offsetNext);
        checkOrder(f1sizeNext,f1time, f1offsetNext);
        assertOrderedEquals(f1output, f1outputNext);
    }
    
    public void logFileContent(long t, long f2) {
        FileOutputStream fos = null;
        try {
            //Open the stream we want to read from
            fos = new FileOutputStream(new File("src/test/resources/log.txt"));
            BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File("src/test/resources/log.txt")));
            byte[] buf = new byte [4096];
            long ts = t;
            while((ts-t-1) >= 0) {
                ts+=fis.read(buf);
                System.err.print(new String(buf));
                if (ts-t-1 ==0) {
                    ts = System.currentTimeMillis();
                }
            }
            System.err.println("log time: "+ts+", timestamp: "+f2+", total bytes read: "+fis.getTotalBytesRead());
            
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(fos!= null) fos.close();
        }
    }
    
    public List<String> readWithThread1(long t) {
        int offset = 10 * (int)(t - System.currentTimeMillis() / 1000);
        List<String> f2 = new ArrayList<String>();
        for(int i = offset; i<offset+4096; i++) {
            FileInputStream fis = null;
            try {
                //Open the stream we want to read from
                fis = new FileInputStream(new File("src/test/resources/log.txt"));
                BufferedInputStream fis1 = new BufferedInputStream(new FileInputStream(new File("src/test/resources/log.txt")));
                byte[] buf = new byte[4096];
                f2.add(new String(buf));
                
                //Close the streams
                fis = null;
                
                //Read the file content
                while((fis=fis1)!= null) {
                    int length = fis.read(buf, 0, 4096);
                    f2.add(new String(buf));
                }
                //Close the streams
                fis = fis1;
                fis.close();
                fis1 = null;
            } catch(Exception e) {
                e.printStack