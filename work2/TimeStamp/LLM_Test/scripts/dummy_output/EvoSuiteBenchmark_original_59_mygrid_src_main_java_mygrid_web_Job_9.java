// JobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Job}.
* It contains one unit test case for the {@link Job#getTypeDesc()} method.
*/
class JobTest {
		
    /**
     * Test of the setters and getters of type {@link Job} and of type
     * {@link Job}'s methods for serialization and deserialization to and from XML.
     */
    @Test
    public void testFromFromXML_Serialization() 
    {  
        System.out.println("fromFromXML");
        
        java.io.ByteArrayOutputStream baos = null;
        org.apache.axis.message.MessageDestination destination = null;

        try
        {
            baos = new java.io.ByteArrayOutputStream();
            destination = new org.apache.axis.message.MessageDestination(baos, org.apache.axis.MessageDestination.SAP_DOMAIN_MEMORY_ADDRESS);
            Job tmpJ = new Job();
            Job.fromFromXML(destination, tmpJ);

            assertEquals(tmpJ.getId(), "");
            assertEquals(tmpJ.getName(), "");
            assertEquals(tmpJ.getDiscriminators().get(0), "");

            org.apache.axis.message.MessageDestination tmpDestination = destination.getDestination();
            
            java.util.ArrayList<String> tmpList = new java.util.ArrayList<String>();
            
            String tmpId = "test";
            String tmpName = "mygrid";
            mygrid.web.Discriminator tmpD = mygrid.web.Discriminator.newInstance(tmpId, tmpName);
            tmpJ.setDiscriminators(tmpD);
            tmpDestination.setDestination(tmpD);
            
            tmpList.add("");

            org.apache.axis.message.MessageDestination tmpDestination1 = new MessageDestination(destination, Integer.parseInt(tmpList.get(0)));
            assertEquals(tmpDestination1.getDestination(), tmpDestination);
            
            org.apache.axis.message.MessageDestination tmpDestination2 = new MessageDestination(destination, Integer.parseInt(tmpList.get(1)));
            assertEquals(tmpDestination2.getDestination(), tmpDestination);
            
            org.apache.axis.message.MessageDestination tmpDestination3 = new MessageDestination(destination, Integer.parseInt(tmpList.get(2)));
            assertEquals(tmpDestination3.getDestination(), tmpDestination);
        }
        finally
        {
            if (destination!= null)
            {
                destination.destroy();
            }
            else
            {
                System.out.println("destination (destination.destination) was not destroyed");
            }
        }
    }
}