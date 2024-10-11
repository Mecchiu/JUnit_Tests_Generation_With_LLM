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
     * Tests the value of the "id" field
     */
    @Test
    public void idTest() {
        Job job = new Job();
        assertNull(job.getId());
        job.setId("testId");
    }

    /**
     * Tests that {@link Job#setDiscriminators(mygrid.web.Discriminator)}
     * throws IllegalArgumentException
     */
    @Test(expected = IllegalArgumentException.class)
    public void discriminatorsTest() {
        new JobBuilder().addDiscriminator(null).build();
    }

    /**
     * Tests the value of the "discriminators" field
     */
    @Test
    public void discriminatedTest() {
        Job job = new JobBuilder().addDiscriminator("testId").build();
        assertEquals(job.getDependencies(),null);
        assertEquals(job.getContext(),null);
        assertNull(job.getCurrentEngineId());
        assertEquals(job.getId(),"testId");
        job.setDiscriminators("testId2");
        assertEquals(job.getDependencies(),null);
        assertEquals(job.getContext(),null);
        assertNull(job.getCurrentEngineId());
        assertEquals(job.getId(),"testId2");
    }

    /**
     * Tests that {@link Job#setProgress(int)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void progressTest() {
        new JobBuilder().addDiscriminator("testId").build();
        new JobBuilder().setProgress(-1)
    }

    /**
     * Tests the value of the "workflow" field
     */
    @Test
    public void workflowTest() {
        Job job = new JobBuilder().build();
        assertNull(job.getWorkflow());
        assertNull(job.getWorkflow().getName());
        job.setWorkflow("workflow");
        assertNotNull(job.getWorkflow());
        assertEquals(job.getWorkflow(),"workflow");
    }

    /**
     * Tests the value of the "name" field
     */
    @Test
    public void nameTest() {
        Job job = new JobBuilder().build();
        assertNull(job.getName());
        job.setName("test");
        assertNotNull(job.getName());
        assertEquals(job.getName(),"test");
    }

    /**
     * Tests the value of the "discriminators" field
     */
    @Test
    public void discriminatorsTest2() {
        Job job = new JobBuilder().build();
        assertEquals(job.getDiscriminators(),null);
        job.setDiscriminators("testId");
    }

    /**
     * Tests the value of the "context" field
     */
    @Test
    public void contextTest() {
        Job job = new JobBuilder().build();
        job.setContext(null);
        assertEquals(job.getContext(),null);

        job.setContext(new MyGridContext.Builder().build());
        assertNotNull(job.getContext());
        assertNotNull(job.getContext().getExecution());
        assertEquals(job.getContext(),new MyGridContext(null,new MyGridExecution()));
    }

    /**
     * Tests the value of the "broadcasted" field
     */
    @Test
    public void broadcastedTest() {
        Job job = new JobBuilder().build();
        assertNull(job.getBroadcasted());
        job.setBroadcasted(true);
        assertTrue(job.getBroadcasted());
    }
}