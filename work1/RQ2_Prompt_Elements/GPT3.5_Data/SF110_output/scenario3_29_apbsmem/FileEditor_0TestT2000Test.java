// FileEditor.java
package apbs_mem_gui;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;

public class FileEditor {

    /**
     * Extract energy from the final APBS output file.
     *
     * @param filename Path to APBS output file.
     * @return String array of total energies in kilojoules, kilocalories and k_BT
     */
    public String[] getEnergy(String filename) {
        String[] energies = new String[3];
        double kj = 0.0, kcal = 0.0, kbT = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains("Total electrostatic energy")) {
                    String[] parts = line.split("\\s+");
                    kj = Double.parseDouble(parts[4]);
                    kcal = kj / 4.184;
                    kbT = kj / 0.008314;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        DecimalFormat df = new DecimalFormat("#.###");
        energies[0] = df.format(kj) + " kJ/mol";
        energies[1] = df.format(kcal) + " kcal/mol";
        energies[2] = df.format(kbT) + " k_BT";
        return energies;
    }
}

// FileEditorTest.java
package apbs_mem_gui;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FileEditorTest {

    @Test
    void testGetEnergy() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy("test_files/test_output.txt");
        assertEquals("0.0 kJ/mol", energies[0]);
        assertEquals("0.0 kcal/mol", energies[1]);
        assertEquals("0.0 k_BT", energies[2]);
    }

    @Test
    void testGetEnergyWithValidFile() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy("test_files/valid_output.txt");
        assertEquals("-0.001 kJ/mol", energies[0]);
        assertEquals("-0.0002 kcal/mol", energies[1]);
        assertEquals("-0.012 k_BT", energies[2]);
    }

    @Test
    void testGetEnergyWithInvalidFile() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy("test_files/invalid_output.txt");
        assertEquals("0.0 kJ/mol", energies[0]);
        assertEquals("0.0 kcal/mol", energies[1]);
        assertEquals("0.0 k_BT", energies[2]);
    }

    @Test
    void testGetEnergyWithEmptyFile() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy("test_files/empty_output.txt");
        assertEquals("0.0 kJ/mol", energies[0]);
        assertEquals("0.0 kcal/mol", energies[1]);
        assertEquals("0.0 k_BT", energies[2]);
    }

    @Test
    void testGetEnergyWithNullFile() {
        FileEditor fileEditor = new FileEditor();
        String[] energies = fileEditor.getEnergy(null);
        assertNull(energies);
    }
}