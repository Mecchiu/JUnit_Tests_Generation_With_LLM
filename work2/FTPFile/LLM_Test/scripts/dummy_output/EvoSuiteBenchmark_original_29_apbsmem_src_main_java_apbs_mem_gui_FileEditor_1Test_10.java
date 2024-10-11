// FileEditor_1Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getCompEnergy(String)} method.
*/
class FileEditor_1Test {
		
    @Test
    public void setUp() {
            
        File testFile = new File("/home/keith/testfiles/pull_comps");
        String testFileName = "test.txt";

        TextFileReader reader = new TextFileReader();
        String[] data = new String[3];
        StringBuilder lines = new StringBuilder();
        lines.append("0  1  2  3  4  5         \t 1e1");
        lines.append("7  8  9  10 11 12 13         \t 1e2");
        lines.append("16 24 25 26 27 28 29         \t 1e3");
        lines.append("39 48 49 50 51 52 53         \t 1e5");

        try {
            lines.append("99 999 8888 8888 8888 7777\t 1e4\n");
            lines.append("999 8888 8888 8888 7777\t 1e5");

            reader.init(new FileReader(data), false, 1);
            reader.line();
            reader.next();
            reader.previous().get(0);
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Could not find a file!");
        } catch (IOException ex) {
            throw new RuntimeException("I/O error: " + ex.getMessage());
        }

        Scanner scan = new Scanner(new File("memory_testfile"));
        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (!line.equals(lines.toString())) {
                continue;
            } else {
                line = line.replaceAll(" ", "");
                lines.append(line);
            }
            lines.append("\n");
        }
        scan.close();

        assertEquals("file read", lines.toString(), reader.getFile().getAbsolutePath());

        lines.delete(0, lines.length());

        Double[] compEnergy = FileEditor.getCompEnergy(testFile);

        readFile(testFile);
        assertTrue("Correct energy for the file!", compEnergy[0] == 6.0);
        assertTrue("Expected a sum of 6.", compEnergy[1] == 10.0);
        assertTrue("Expected a sum of 10.", compEnergy[2] == 12.0);

        Double n = System.nan();
        assertTrue("Nan value for a normal file doesn't exist?", n!= null && n.doubleValue() == 0.0);
        assertTrue("Could not find a normal file!", testFile.exists());
    }
    
    private void readFile(File fileToRead) throws IOException {
        FileReader reader = new FileReader(fileToRead);
        String line;
        while ((line = reader.nextLine())!= null) {
            System.out.println(line);
        }
        assertEquals("file read", lines.toString(), reader.getFile().getAbsolutePath());
    }
}


class TextFileReader extends AbstractLineReader {

    public TextFileReader() {
            super(new File("/home/keith/testfiles/pull_comps"));
    }
    
    @Override
    protected Integer previousChar() {
        String line = super.previousLine();
        if (line.equals(";")) {
            line = super.nextLine();
        }
        return Integer.valueOf(line.substring(0, 1));
    }
}