// Here's an example implementation of the FileEditor class and a test class for the getEnergy method.

// FileEditor.java
package apbs_mem_gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileEditor {

    /**
     * Extract energy from the final APBS output file.
     * @param filename Path to APBS output file.
     * @return String array of total energies in kilojoules, kilocalories and k_BT
     */
    public String[] getEnergy(String filename) {
        String[] energies = new String[3];
        DecimalFormat df = new DecimalFormat("#.####");

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Total electrostatic energy")) {
                    String[] parts = line.split("\\s+");
                    energies[0] = df.format(Double.parseDouble(parts[4]));
                } else if (line.contains("Total solvation energy")) {
                    String[] parts = line.split("\\s+");
                    energies[1] = df.format(Double.parseDouble(parts[4]));
                } else if (line.contains("Total energy")) {
                    String[] parts = line.split("\\s+");
                    energies[2] = df.format(Double.parseDouble(parts[3]));
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return energies;
    }

    /**
     * Extract the energy from a calculation that has summed the component atom energies
     * rather than simply taking the total. (pull_comps.c)
     * @param filename Path to the file written by pull_comps with the energy sum.
     * @return a double array of the total energy of each calculation (up to 6 calculations if there are 3 focus levels).
     */
    public double[] getCompEnergy(String filename) {
        double[] energies = new double[6];

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            int i = 0;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\s+");
                energies[i++] = Double.parseDouble(parts[1]);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        return energies;
    }

    private double toDoublePos(String theDouble) {
        return Double.parseDouble(theDouble);
    }

    private double toDoubleNeg(String theDouble) {
        return -1 * Double.parseDouble(theDouble);
    }
}

// FileEditorTest.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileEditorTest {

    @Test
    void testGetEnergy() {
        FileEditor editor = new FileEditor();
        String[] energies = editor.getEnergy("test_files/apbs_output.txt");
        assertAll("energies",
                () -> assertEquals("0.0", energies[0]),
                () -> assertEquals("-0.0", energies[1]),
                () -> assertEquals("-0.0", energies[2])
        );
    }

    @Test
    void testGetCompEnergy() {
        FileEditor editor = new FileEditor();
        double[] energies = editor.getCompEnergy("test_files/pull_comps_output.txt");
        assertAll("energies",
                () -> assertEquals(-0.0001, energies[0], 0.00001),
                () -> assertEquals(-0.0002, energies[1], 0.00001),
                () -> assertEquals(-0.0003, energies[2], 0.00001),
                () -> assertEquals(-0.0004, energies[3], 0.00001),
                () -> assertEquals(-0.0005, energies[4], 0.00001),
                () -> assertEquals(-0.0006, energies[5], 0.00001)
        );
    }
}