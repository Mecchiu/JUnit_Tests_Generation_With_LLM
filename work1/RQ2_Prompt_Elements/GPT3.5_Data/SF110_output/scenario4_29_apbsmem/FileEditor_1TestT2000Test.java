// Here's an example implementation of the FileEditor class and its unit test class FileEditor_1Test:

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
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Total electrostatic energy")) {
                    String[] parts = line.split("\\s+");
                    DecimalFormat df = new DecimalFormat("#.####");
                    energies[0] = df.format(Double.parseDouble(parts[4]));
                    energies[1] = df.format(Double.parseDouble(parts[6]));
                    energies[2] = df.format(Double.parseDouble(parts[8]));
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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
                if (line.contains("Total energy")) {
                    String[] parts = line.split("\\s+");
                    energies[i] = Double.parseDouble(parts[2]);
                    i++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
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

// FileEditor_1Test.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileEditor_1Test {

    @Test
    void testGetCompEnergy() {
        FileEditor fileEditor = new FileEditor();
        double[] expectedEnergies = { -0.000000000000000000e+00, -0.000000000000000000e+00, -0.000000000000000000e+00,
                -0.000000000000000000e+00, -0.000000000000000000e+00, -0.000000000000000000e+00 };
        assertArrayEquals(expectedEnergies, fileEditor.getCompEnergy("test_files/pull_comps.out"));
    }

    @Test
    void testGetCompEnergyWithMultipleCalculations() {
        FileEditor fileEditor = new FileEditor();
        double[] expectedEnergies = { -1.000000000000000000e+00, -2.000000000000000000e+00, -3.000000000000000000e+00,
                -4.000000000000000000e+00, -5.000000000000000000e+00, -6.000000000000000000e+00 };
        assertArrayEquals(expectedEnergies, fileEditor.getCompEnergy("test_files/pull_comps_multiple.out"));
    }

    @Test
    void testGetCompEnergyWithMissingValues() {
        FileEditor fileEditor = new FileEditor();
        double[] expectedEnergies = { -1.000000000000000000e+00, -2.000000000000000000e+00, -0.000000000000000000e+00,
                -0.000000000000000000e+00, -0.000000000000000000e+00, -0.000000000000000000e+00 };
        assertArrayEquals(expectedEnergies, fileEditor.getCompEnergy("test_files/pull_comps_missing.out"));
    }

    @Test
    void testGetEnergy() {
        FileEditor fileEditor = new FileEditor();
        String[] expectedEnergies = { "-1.2345", "-2.3456", "-3.4567" };
        assertArrayEquals(expectedEnergies, fileEditor.getEnergy("test_files/apbs_output.out"));
    }

    @Test
    void testGetEnergyWithMissingValues() {
        FileEditor fileEditor = new FileEditor();
        String[] expectedEnergies = { null, null, null };
        assertArrayEquals(expectedEnergies, fileEditor.getEnergy("test_files/apbs_output_missing.out"));
    }
}