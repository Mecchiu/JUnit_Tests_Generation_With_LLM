// FSPathFactoryTest.java
package net.sf.sugar.fspath;

import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathFactory}.
* It contains one unit test case for the {@link FSPathFactory#newFSPath()} method.
*/
class FSPathFactoryTest {
		private FSPathFactoryFactory factory;
        
        
        public FSPathFactoryTest() {
        }
        
    
    @Test
    public void testNewFSPath() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        assertNotNull("The factory must not create a factory for a file with a default String.", factory.newFSPath());
    } // testNewFSPath()

    
    @Test
    public void testNewFSPathWithFile() {  
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, String.class);
        FSPath f = factory.newFSPath(File.class);
        File f1 = new File("/usr/bin/ls");
				assertTrue("File was not set correctly.", f.equals(f1));
    } // testNewFSPathWithFile()

    @Test
    public void testNewFSPathWithFileAndString() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, String.class);
        FSPath f = factory.newFSPath(File.class, "some path");
        File f1 = new File("/usr/bin/ls");
        File f2 = new File("/usr/bin/ls");
				File f3 = new File("/usr/bin/ls");
				File f4 = new File("/usr/bin/ls");
				File f5 = new File("/usr/bin/ls");
				File f6 = new File("/usr/bin/ls");
				assertTrue("File was not set correctly.", f.equals(f1) || f.equals(f2) || f.equals(f3) || f.equals(f4) || f.equals(f5) || f.equals(f6));
    } // testNewFSPathWithFileAndString()
    
    @Test
    public void testNewFSPathWithDirectory() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        FSPath f = factory.newFSPath("user", "");
        assertNotNull("Directory was not set correctly.", f.getSystemResourceByType("dir"));
    } // testNewFSPathWithDirectory()

    @Test
    public void testNewFSPathWithDirectoryAndString() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, String.class);
        FSPath f = factory.newFSPath("user", "");
        assertNotNull("Directory was not set correctly.", f.getSystemResourceByType("dir"));
    } // testNewFSPathWithDirectoryAndString()
    
    @Test
    public void testNewFSPathWithDirectories() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        FSPath f = factory.newFSPath("user", "/usr");
        assertNotNull("Directory was not set correctly.", f.getSystemResourceByType("dir"));
    } // testNewFSPathWithDirectories()
    
    @Test
    public void testNewFSPathWithDirectoriesAndString() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        FSPath f = factory.newFSPath("user", "/usr");
        assertNotNull("Directory was not set correctly.", f.getSystemResourceByType("dir"));
    } // testNewFSPathWithDirectoriesAndString()
    
    @Test
    public void testNewFSPathWithResourcesInDir() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        Set <File> files = new HashSet<>(FSPathFactory.getGlobalResourcesFromDir(new File("/usr/")));
        File f = new File("user/usr/lib");
        assertTrue("Directory was not set correctly.", files.contains(f));
    } // testNewFSPathWithResourcesInDir()
    
    @Test
    public void testNewFSPathWithResourcesInDirAll() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        Set <File> files = new HashSet<>(FSPathFactory.getGlobalResourcesFromDir(new File("/usr")));
        factory.register(File.class, new File("user/usr/lib"));
        Set <File> files2 = new HashSet<>(FSPathFactory.getGlobalResourcesFromDir(new File("/usr/")));				
				for (File testFile:files) {
					files2.add(files.iterator().next());
				}

        Set <File> result = new HashSet<>(files2);
        assertTrue("Directory was not set correctly.", result.contains(factory.newFSPath(factory.getFileFromDir(new File("/usr"))).getSystemResourceByType("dir")));
    } // testNewFSPathWithResourcesInDirAll()
    
    @Test
    public void testNewFSPathWithResourcesInDirNotExists() {
            factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
        factory.register(String.class, File.class);
        Set <File> files = new HashSet<>(FSPathFactory.getGlobalResourcesFromDir(new File("/usr")));
        factory.register(File.class, new File("user/usr/lib"));
        Set <File> files2 = new HashSet<>(FSPathFactory.getGlobalResourcesFromDir(new File("/usr")));				
				for (File testFile:files) {
					files2.add(files.iterator().next());
				}
				
        Set <File> result = new HashSet<>(files2);
        assertFalse("Directory was set correctly.", result.contains(factory.newFSPath(factory.getFileFromDir(new File("/usr"))).getSystemResourceByType("dir")));
    } // testNewFSPathWithResourcesInDirNotExists()
    
    @Test
    public void testNewFSPathWithResourcesInDirNotFile() {
        factory = FSPathFactoryFactory.newFactory();
        factory.register(File.class, File.class);
}
}