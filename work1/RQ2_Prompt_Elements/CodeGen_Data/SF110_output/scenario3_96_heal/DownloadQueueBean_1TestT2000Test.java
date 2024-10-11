// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains one unit test case for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {
@Test
    public void clearPackageFileSettings() {
        // given
        File lastModifiedFile;
        File path = new File("");
        DownloadQueueBean bean = new DownloadQueueBean();
        Object[] array;
        // when
        bean.clearPackageFileSettings();
        // then
        assertFalse(bean.isEmpty());
        // assert false (no packages)
        assertFalse(bean.getManagedPackages().isEmpty());
        assertFalse(bean.getManagedPackages("").isEmpty());
        // assert true (has packages, no packages at last)
        assertTrue(bean.getManagedPackages("").contains(new File("")));
        // assert false (has packages, have packages at last)
        assertFalse(bean.getManagedPackages("hasPackageAtLast").contains(new File("")));
            lastModifiedFile = new File("");

        // verify
        assertTrue(bean.contains(lastModifiedFile));
    }
}

// DownloadQueueBean_2.java
//package org.heal.module.download;
//
//import java.io.File;
//import java.util.Collection;
//import java.util.Random;
//
//import org.junit.jupiter.api.Test;
//
//public class DownloadQueueBean_2Test {
//	
//		@Test
//    public void noLastModifiedFileException() {
//        // given
//        File path = new File("");
//        Collection<?> list = new TreeSet<>();
//        new File(path, "someDirectory/zip.zip").delete();
//        // when
//        Class<RuntimeException> type = RuntimeException.class;
//		//Then
//        // when encountering a no last modified file exception
//        list.add(new RuntimeException(type));
//        // then
//        assertFalse(list.contains(type));
//        // and
////        verify(list);
//    }
//    
//    @Test
//    public void empty() {
//        // given
//        Collection<?> list = new TreeSet<>();
//        // when
//        list.add(new File("").delete());
//        // then
//        assertTrue(list.contains(new File("")));
//        // and
////        verify(list);
//    }
// 
//}
