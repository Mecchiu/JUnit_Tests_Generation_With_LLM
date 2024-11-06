package s2e.lab.searcher;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

/**
 * It  finds all Java files in a directory and its subdirectories.
 */
public class JavaSearcher {

    /**
     * A list of all java files recursively found in a specific folder
     *
     * @param directory folder to search for Java files.
     * @return a list of Java source files.
     * @throws IOException
     */
    public static List<File> findJavaFiles(File directory) throws IOException {
        return Files.walk(Paths.get(directory.getAbsolutePath()))
                .filter(p -> Files.isRegularFile(p) && p.toString().endsWith(".java"))
                .map(Path::toFile)
                .collect(Collectors.toList());
    }

    /**
     * A list of all java files recursively found in a specific folder but that are not inside a "/tests/" or "/evosuite-tests/" folder.
     *
     * @param directory folder to search for Java files.
     * @return a list of Java source files that are not inside a "/tests/" or "/evosuite-tests/" folder.
     * @throws IOException
     */
    public static List<File> findNonTestJavaFiles(File directory) throws IOException {
        List<File> javaFiles = JavaSearcher.findJavaFiles(directory);
        List<File> output = new ArrayList<>();
        for (File javaFile : javaFiles) {
            // is it a test class?
            if (javaFile.getPath().toLowerCase().contains("/test/")) continue;
            // is it a test class from EvoSuite?
            if (javaFile.getPath().toLowerCase().contains("/evosuite-tests/")) continue;
            output.add(javaFile);
        }
        return output;
    }

    /**
     * Collects all folders in a specific directory.
     *
     * @param directory directory to be searched
     * @return a list of folders
     */
    public static List<File> getProjectList(String directory) {
        File projectDirectory = new File(directory);
        return Arrays.stream(Objects.requireNonNull(projectDirectory.listFiles()))
                .filter(File::isDirectory)
                .collect(Collectors.toList());
    }

    /**
     * Collects all the filtered projects.
     * //FIXME this is a hack to improve performance (yes, I know, I know)
     *
     * @param directory directory to be searched
     * @return a list of folders
     */
    public static List<File> getFilteredProjects(String directory) {
        Set<String> filteredProjects = new HashSet<>(Arrays.asList("69_lhamacaw", "14_omjstate", "60_sugar", "29_apbsmem", "84_ifx-framework", "79_twfbplayer", "6_jnfe", "59_mygrid", "100_jgaap", "2_a4j", "34_sbmlreader2", "25_jni-inchi", "67_gae-app-manager", "74_fixsuite", "73_fim1", "71_ext4j", "8_gfarcegestionfa", "43_lilith", "32_httpanalyzer", "86_at-robots2-j", "63_objectexplorer", "41_follow", "57_hft-bomberman", "93_quickserver", "103_sweethome3d", "56_jhandballmoves", "5_templateit", "91_classviewer", "49_diebierse", "11_imsmart", "22_byuic", "47_dvd-homevideo", "96_heal", "81_javathena", "19_jmca", "75_openhre", "82_ipcalculator", "31_xisemele", "17_inspirento", "4_rif", "94_jclo", "33_javaviewcontrol", "7_sfmis", "40_glengineer", "39_diffi", "42_asphodel", "68_biblestudy", "52_lagoon", "10_water-simulator", "23_jwbf", "64_jtailgui", "24_saxpath", "12_dsachat"));

        File projectDirectory = new File(directory);
        return Arrays.stream(Objects.requireNonNull(projectDirectory.listFiles()))
                .filter(f -> f.isDirectory() && filteredProjects.contains(f.getName()))
                .collect(Collectors.toList());
    }


}
