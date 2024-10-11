// DownloadQueueBean_0Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#removeAllFromQueue()} method.
*/
class DownloadQueueBean_0Test {
		
    /**
     * Test the removeAllFromQueue method.
     */
    @Test
    void testRemoveAllFromQueue() {
    	new File(System.getProperty("java.io.tmpdir")+ "/Downloads");
    	new File(System.getProperty("java.io.tmpdir")+ "/Downloads-1");
    	new File(System.getProperty("java.io.tmpdir")+ "/Downloads-2");

    	File[] files = new File[4];
    	files[0] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/1.txt");
    	files[1] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/2.txt");
    	files[2] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/3.txt");
    	files[3] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/4.txt");

    	File[] files2 = new File[6];
    	files2[0] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/11.txt");
    	files2[1] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/12.txt");
    	files2[2] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/13.txt");
    	files2[3] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/14.txt");
    	files2[4] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/15.txt");
    	files2[5] = new File(System.getProperty("java.io.tmpdir")+ "/Downloads/16.txt");


    	Collection<String> set = new String[4+4];
    	for(int i=0;i<4+4;i++){
    		if(i==0){
    			set[i]="1.txt";
    		} else {
    			set[i]="2.txt";
    		}
    	}
    	set[4]="15.txt";
    	
    	assertEquals(files2[4], files[4]);
    	assertEquals(files2[5], files[5]);
    	assertEquals(files2[4], files[4]);
    	
    	String[] tmp = DownloadUtils.createDownloadFileNames(null, files2);
    	assertArrayEquals(set, tmp);
    	
    	try {
    		DownloadQueueUtils.replaceAll(tmp,files,files2);
    		fail("Should have thrown an RuntimeException");
    	} catch (RuntimeException e) {
    		// Ignore, we don't care.
    	}
    	
    	
    	
    }

    @Test
    void testAddToQueue() {
    	DownloadQueueBean downlQueue = new DownloadQueueBean();
    	
    	// Add an id to the queue
    	downlQueue.addToQueue(1);
    	
    	Collection<String> set = new String[4];
    	set[0] = "12.txt";
    	set[1] = "13.txt";
    	
    	Collection<String> set2 = DownloadQueueUtils.replaceAll(downlQueue.getContentSet(), set);
    	Collection<String> set3 = new TreeSet<>();
    	for (String s : set3) {
    		assertEquals(s, downlQueue.getContentIdFromFile(s));
    	}
    	assertEquals(set2, set3);
    	
    	// Set the queue of id 2
    	set2 = DownloadQueueUtils.replaceAll(downlQueue.getContentSet(), set);
    	assertEquals(set2, set);
    }
}