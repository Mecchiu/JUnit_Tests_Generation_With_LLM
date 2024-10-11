package testsmell;

import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Calendar;
import java.util.List;

/**
 * This class is utilized to write output to a CSV file
 */
public class ResultsWriter {

    private String outputFile;
    private FileWriter writer;

    /**
     * Creates the file into which output it to be written into. Results from each file will be stored in a new file
     *
     * @throws IOException
     */
    private ResultsWriter(String suffix) throws IOException {
        String filenameSuffix = suffix;
        if (suffix == null || suffix.isEmpty())
            filenameSuffix = String.valueOf(Calendar.getInstance().getTimeInMillis());
        outputFile = MessageFormat.format("{0}_{1}_{2}.{3}", "Output", "TestSmellDetection", filenameSuffix, "csv");
        writer = new FileWriter(outputFile, false);
    }

    /**
     * Factory method that provides a new instance of the ResultsWriter
     * @param suffix the suffix to be added to the output file name (if null, it uses a time stamp of the current time)
     * @return new ResultsWriter instance
     * @throws IOException
     */
    public static ResultsWriter createResultsWriter(String suffix) throws IOException {
        return new ResultsWriter(suffix);
    }

    /**
     * Factory method that provides a new instance of the ResultsWriter
     *
     * @return new ResultsWriter instance
     * @throws IOException
     */
    public static ResultsWriter createResultsWriter() throws IOException {
        return new ResultsWriter(null);
    }

    /**
     * Writes column names into the CSV file
     *
     * @param columnNames the column names
     * @throws IOException
     */
    public void writeColumnName(List<String> columnNames) throws IOException {
        writeOutput(columnNames);
    }

    /**
     * Writes column values into the CSV file
     *
     * @param columnValues the column values
     * @throws IOException
     */
    public void writeLine(List<String> columnValues) throws IOException {
        writeOutput(columnValues);
    }

    /**
     * Appends the input values into the CSV file
     *
     * @param dataValues the data that needs to be written into the file
     * @throws IOException
     */
    private void writeOutput(List<String> dataValues) throws IOException {
        writer = new FileWriter(outputFile, true);

        for (int i = 0; i < dataValues.size(); i++) {
            writer.append(String.valueOf(dataValues.get(i)));

            if (i != dataValues.size() - 1)
                writer.append(",");
            else
                writer.append(System.lineSeparator());

        }
        writer.flush();
        writer.close();
    }
}
