// ContourGeneratorTest.java
package jahuwaldt.plot;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourGenerator}.
* It contains one unit test case for the {@link ContourGenerator#done()} method.
*/
class ContourGeneratorTest {
		
    /**
     *  Tests the done() method of the {@link ContourGenerator} class.
     *  This unit test is to ensure that the {@link ContourGenerator#done() done},
     *  method returns before the one called by JUnit.
     */
    @Test
    public void testDone(){
        new ContourGenerator().done();
    }

    /**
     *  Tests to see that the {@link ContourGenerator} class is able to
     *  read a file without throwing an Exception in its constructor.
     *  @throws Exception is thrown if the call to readFile does not exist
     */
    @Test
    public void testReadFile() throws Exception {
        System.out.println ("Test of ContourGenerator constructor");
        JUnitXMLFile.readFile(this.getClass().getName()
                + " - Unit Test", "./contours.xml");
        if(!this.done()){
            fail ("No exception was thrown");
        }
    }

    
    /*
     *  Tests the {@link #ContourGenerator()} constructor.
     *  @throws UnsupportedOperationException is thrown if the call to new 
     *  inherited contour function is called after done() has returned.
    */
    @Test
    public void testNewConstructor(){
        try {
            System.out.println("Test of ContourGenerator constructor");
            new ContourGenerator(); 
        }
        catch (UnsupportedOperationException e) {
            assertTrue("ContourGenerator.newContour should not throw an exception in 
                       the call to new when the done() method of the ContourGenerator 
                       object is called after done() is called",  false);
        }
    }

    
    
    /*
     *  Main program to test the object with contour_plot.c from NeXTcontour1.4.
     *  The unit tests use the contour_plot class, which was used to produce this contour.
     *  It uses the JUnit test mechanism to write the tests as well, which used to call
     *  the contour_plot.c test program.
     */
    public static void main (String args[]){
        System.out.println ("Test of ContourGenerator");
        String out = "ContourGeneratorTest - Unit Test";
        if(!out.equals("ContourGeneratorTest")) {
            throw new Exception (out);
        }
        System.out.println ("ContourGeneratorTest ends");
        String this_filename = "./contours.xml";
        System.setProperty("test.src",this_filename);
        // Create a valid Xml document
        JUnitXMLFile.createDocument(
            this.getClass().getName(),
            "test_XML",
            this_filename
            );
        // The class to create is ContourGenerator
        ContourGenerator contourGenerator = new ContourGenerator();
        
        // Initialize the contourGenerator
        char[][][] contours = new char[][][] {
                {
                        { 0,1,0,0,1,0,0,0,0,1,1}, 
                        {0,0,0,0,0,1,0,0,0,1,1}, 
                        {0,0,0,0,1,1,1,1,0,1,1}
                },
                {
                        {1,1,0,0,1,0,0,0,0,1,1}, 
                        {0,1,0,0,0,1,1,1,1,0,0}, 
                        {0,1,1,1,0,1,0,0,0,0,0}
                },
                {
                        {1,1,0,0,1,0,0,0,0,1,1}, 
                        {0,0,1,1,1,0,0,1,0,1,0}, 
                        {0,0,0,0,0,0,0,0,1,0,1}
                },
        };
        // Add the contours to the map with keys & values. 
        contours[1][0][0] = true;
        contours[1][0][1] = true;
        contours[1][1][0] = true;
        contours[1][1][1] = true;

        int size = contours.length;
        Object[] data = new Object[size];
        for (int i = 0; i<contours.length; i++) {
            data[i] = contours[i];
        }
        Object[] values = new Object[1];
        for (int i = 1; i<size-1; i++) {
            values[0] = contours[i];
        }
        Object[] values2 = new Object[data.length+1];
        System.arraycopy(values,0,values2,0,values.length);
        values2[values.length]  = values;
        contourGenerator.writeData(out, values2);
        
        // Close the XML file
       ContourGeneratorTest.writeData(out, data);
    }

    private static String writeData(String outfile, Object[] data) {
        
        XMLConfig config = new XMLConfig();
        config.addChild(new XMLNode("test_XML"));
        
        XMLStreamWriter writer = null;
        try {
            writer = config.newOutputStreamWriter();
            XMLNode stream = config.newRootNode();
            writer.writeNode(stream);
            writer.flush();
            config.close();
        }
        catch (Exception e) { 
            outfile = "Error in writeData()- " + e.toString();
        }
        
        return outfile;
    }
    
}  //class contour_plot