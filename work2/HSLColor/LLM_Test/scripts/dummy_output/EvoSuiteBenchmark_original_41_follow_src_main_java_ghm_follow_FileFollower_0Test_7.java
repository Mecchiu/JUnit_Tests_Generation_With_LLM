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
     * Constructor of the {@link FileFollower_0Test} class.
     */
    public FileFollower_0Test() {
    }
        
    /**
     * Test of addOutputDestination method, of class {@link FileFollower}.
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException The class not found exception.
     * @see OutputDestination
     */
    @Test
    public void testAddOutputDestination() throws IOException, ClassNotFoundException {
        boolean caught = false;
        // file should exist
        File file = new File("src/test/resources/testfile");
        try {
            boolean result = InputDestination.addOutputDestination(OutputDestination.DEFAULT_DESTINATION, file);
            caught = true;
        } catch (IOException e) {
            Logger.getLogger(OutputDestination.class.getName()).log(Level.INFO, String.format("Caught exception from %s", e.getMessage()), e);
        }
        assertTrue(caught);

        try (OutputDestination out = OutputDestination.DEFAULT_DESTINATION) {
            FileFollower f = new FileFollower(out);
            boolean result = f.addOutputDestination(OutputDestination.DEFAULT_DESTINATION, file);
            caught = true;
        } catch (IOException e) {
            assertTrue(
                    "Caught exception from " + Logger.class.getName(),
                    e.getMessage().contains("Caught exception from " + OutputDestination.DEFAULT_DESTINATION.impl));
        }
        assertTrue(caught);
    }
    
    /**
     * Test of addOutputDestination method, of class {@link FileFollower}.
     * @throws IOException Signals that an I/O exception has occurred.
     * @throws ClassNotFoundException The class not found exception.
     */
    @Test
    public void testAddOutputDestination2() throws IOException, ClassNotFoundException {
        boolean caught = false;
        String src = this.getClass().getName().substring(0, this.getClass().getName().lastIndexOf('.')).replaceAll("\\.", "");
        final File file = new File(src + ".java");
        final int max = 6;
        InputDestination[] destlist, finalresult, out = new InputDestination[max];

        try (OutputDestination out1 = OutputDestination.DEFAULT_DESTINATION) {
            out[0] = OutputDestination.DEFAULT_DESTINATION;
            boolean result1 = false;
            try (InputDestination out2 = OutputDestination.DEFAULT_DESTINATION) {
                result1 = false;
            }
            canned = true;
            for(int i=1; i<max; i++) {
                try (FileInputStream fis = new FileInputStream(file); BufferedInputStream bis = new BufferedInputStream(fis)) {
                    InputDestination dOut = FileFollower.DEFAULT_DESTINATION;
                    try (FileInputStream fin = new FileInputStream(file)) {
                        OutputDestination dIn = OutputDestination.DEFAULT_DESTINATION;
                        InputStream isOut = bis;
                        InputStream isIn = fin;
                        List<String> listout = new ArrayList<>();
                        FileInputStream fin0 = bis;
                        FileInputStream fin1 = file;
                        while (listout.size() < i) {
                            try {
                                listout.add(isOut.read());
                                isOut = fin0;
                                isIn = fin1;
                            } catch (IOException e) {
                                e.printStackTrace();
                                throw new IOException(e.getMessage());
                            };
                            isIn = bis;
                            isOut = fin0;
                        }
                        if (listout.size() > i) {
                            for (int x=i; x<listout.size(); x++) {
                                switch (listout.get(x)) {
                                    case "stdout":
                                        out[i] = dOut;
                                        break;
                                    default:
                                        try {
                                            out[i] = dOut = Static_OutputDestination.lookupByName(listout.get(x));
                                            break;
                                        } catch (ClassNotFoundException e1) {
                                            e1.printStackTrace();
                                        };
                                }
                            }
                        }
                    }
                    break;
                }
                cant = true;
            }
            if (cant ||!result1) {
                out[0] = OutputDestination.DEFAULT_DESTINATION;
            }
            result = out[0].equals(OutputDestination.DEFAULT_DESTINATION);

            List<String> list = new ArrayList<>();
            String[] listin = out[0].getClass().getCanonicalName().split("\\.");
            Object object = out[0];
            for (int i = 1; i < max; i++) {
                object = null;
                for (String item : listin) {
                    if (item.substring(item.lastIndexOf('.') + 1, item.indexOf('.')).equals(listin[i])) {
                        object = Static_OutputDestination.lookupByName(item);
                        break;
                    }
                }
            }
            caught = true;
            for(int i=1; i<max; i++) {
                assertTrue(out[i].equals(object));
            }
            caught = false;
            canned = false;
        }

    }

        @Test
    public void testClosedList() {
//        try (InputDestination out = OutputDestination.DEFAULT_DESTINATION) {
//            FileFollower f = new FileFollower(out);
//        } catch (Exception e) {
//            throw new RuntimeException(e.getMessage());
//        }
    }
    
}