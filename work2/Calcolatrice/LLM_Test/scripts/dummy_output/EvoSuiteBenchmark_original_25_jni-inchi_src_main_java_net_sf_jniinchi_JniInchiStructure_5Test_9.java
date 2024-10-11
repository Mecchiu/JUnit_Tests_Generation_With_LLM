// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		
    @Test
    public void testGetStereo0D() {
        
        List<JniInchiStereo0D> outputs = getStereo0D(12);

        assertEquals(13, outputs.size());
        assertTrue(outputs.contains(new JniInchiStereo0D(12, '\0')));
        assertTrue(outputs.contains(new JniInchiStereo0D(13, '\0')));
        assertEquals(12, outputs.get(12).getValue().intValue());
        assertTrue(outputs.get(13).getValue().intValue() == 13);
    }
    
	@Test
	public void testGetStereo0D_4() {
                
		List<JniInchiStereo0D> outputs = getStereo0D(12);

                assertEquals(2, outputs.size());
                assertTrue(outputs.contains(new JniInchiStereo0D(12, '*')));
                assertTrue(outputs.contains(new JniInchiStereo0D(13, '*')));
        }

    @Test
    public void testGetStereo0D_4_1() {
                
		List<JniInchiStereo0D> outputs = getStereo0D(12);

                assertEquals(1, outputs.size());
                assertTrue(outputs.contains(new JniInchiStereo0D(13, '*')));
        }

	@Test
	public void testGetStereo0D_4_2() {
                
		List<JniInchiStereo0D> outputs = getStereo0D(12);

                assertEquals(2, outputs.size());
                assertTrue(outputs.contains(new JniInchiStereo0D(12, '*')));
                assertTrue(outputs.get(12).getValue().intValue() == 13);
        }

	@Test
    public void testArrayListNested() {
        Integer[] array = {123, 456, 789};
		List<Integer> list = new ArrayList<Integer>();
		list.addAll(getStereo0D(12).getStereo0D(0).getStereo0D(4));
		list.addAll(getStereo0D(12).getStereo0D(1).getStereo0D(4));
		list.addAll(getStereo0D(12).getStereo0D(2).getStereo0D(3));
		
        Integer[] a = list.get(3).toArray();
        Integer[] b = array.length == 6? array : a;
        Integer[] c = list.get(4).toArray();
        Integer[] d = array.length > 6? array : c;
        Integer[] e = list.get(5).toArray();
	}
}