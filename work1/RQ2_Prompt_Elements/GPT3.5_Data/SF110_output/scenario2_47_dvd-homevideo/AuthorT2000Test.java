// AuthorTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import java.lang.NullPointerException;
import java.lang.IllegalArgumentException;

/**
 * Test class of {@link Author}.
 * It contains ten unit test cases for the {@link Author#CreateDVDFileStructure(GUI)} method.
 */
class AuthorTest {

    /**
     * Test case for successful execution of CreateDVDFileStructure method.
     */
    @Test
    void testCreateDVDFileStructureSuccess() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author();
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertFalse(result);
    }

    /**
     * Test case for IOException thrown by exec method.
     */
    @Test
    void testCreateDVDFileStructureIOException() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
                throw new IOException();
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for NullPointerException thrown by exec method.
     */
    @Test
    void testCreateDVDFileStructureNullPointerException() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws NullPointerException {
                throw new NullPointerException();
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for IllegalArgumentException thrown by exec method.
     */
    @Test
    void testCreateDVDFileStructureIllegalArgumentException() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IllegalArgumentException {
                throw new IllegalArgumentException();
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for NoSuchElementException thrown by ErrorCheck method.
     */
    @Test
    void testCreateDVDFileStructureNoSuchElementException() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public boolean ErrorCheck(String logFile) {
                throw new NoSuchElementException();
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for IOException thrown by ErrorCheck method.
     */
    @Test
    void testCreateDVDFileStructureIOExceptionInErrorCheck() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public boolean ErrorCheck(String logFile) throws IOException {
                throw new IOException();
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for successful execution of CreateDVDFileStructure method with error message in error stream.
     */
    @Test
    void testCreateDVDFileStructureSuccessWithErrorMessageInErrorStream() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
                Process p = new Process() {
                    @Override
                    public OutputStream getOutputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getInputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getErrorStream() {
                        return new ByteArrayInputStream("/bin/sh: dvdauthor: command not found".getBytes());
                    }

                    @Override
                    public int waitFor() {
                        return 0;
                    }

                    @Override
                    public int exitValue() {
                        return 0;
                    }

                    @Override
                    public void destroy() {

                    }
                };
                return p;
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for successful execution of CreateDVDFileStructure method with warning message in error stream.
     */
    @Test
    void testCreateDVDFileStructureSuccessWithWarningMessageInErrorStream() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
                Process p = new Process() {
                    @Override
                    public OutputStream getOutputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getInputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getErrorStream() {
                        return new ByteArrayInputStream("WARN: This is a warning message".getBytes());
                    }

                    @Override
                    public int waitFor() {
                        return 0;
                    }

                    @Override
                    public int exitValue() {
                        return 0;
                    }

                    @Override
                    public void destroy() {

                    }
                };
                return p;
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertFalse(result);
    }

    /**
     * Test case for IOException thrown by input stream in CreateDVDFileStructure method.
     */
    @Test
    void testCreateDVDFileStructureIOExceptionInInputStream() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
                Process p = new Process() {
                    @Override
                    public OutputStream getOutputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getInputStream() {
                        throw new IOException();
                    }

                    @Override
                    public InputStream getErrorStream() {
                        return null;
                    }

                    @Override
                    public int waitFor() {
                        return 0;
                    }

                    @Override
                    public int exitValue() {
                        return 0;
                    }

                    @Override
                    public void destroy() {

                    }
                };
                return p;
            }
        };
        boolean result = author.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for IOException thrown by output stream in CreateDVDFileStructure method.
     */
    @Test
    void testCreateDVDFileStructureIOExceptionInOutputStream() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException {
                Process p = new Process() {
                    @Override
                    public OutputStream getOutputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getInputStream() {
                        return null;
                    }

                    @Override
                    public InputStream getErrorStream() {
                        return null;
                    }

                    @Override
                    public int waitFor() {
                        return 0;
                    }

                    @Override
                    public int exitValue() {
                        return 0;
                    }

                    @Override
                    public void destroy() {

                    }
                };
                return p;
            }
        };
        Author author2 = new Author() {
            @Override
            public BufferedWriter getBufferedWriter(String fileName) throws IOException {
                throw new IOException();
            }
        };
        boolean result = author2.CreateDVDFileStructure(DVD_GUI);
        assertTrue(result);
    }

    /**
     * Test case for InterruptedException thrown by waitFor method in CreateDVDFileStructure method.
     */
    @Test
    void testCreateDVDFileStructureInterruptedException() {
        GUI DVD_GUI = new GUI();
        DVD_GUI.strOutputDir = "testOutputDir";
        DVD_GUI.prgAuthor.setValue(0);
        DVD_GUI.lblAuthorProg.setText("0%");
        Author author = new Author() {
            @Override
            public Process exec(String[] cmdarray, String[] env