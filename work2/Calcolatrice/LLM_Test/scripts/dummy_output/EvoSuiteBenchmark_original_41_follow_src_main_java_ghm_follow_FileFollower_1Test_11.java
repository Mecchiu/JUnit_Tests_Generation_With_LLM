// FileFollower_1Test.java
package ghm.follow;

import ghm.follow.io.OutputDestination;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileFollower}.
* It contains one unit test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {
		
		/**
		 * Tests if removeOutputDestination() returns the string returned by
		 * the supplied OutputDestination.
		 */
    @Test
    public void test_removeOutputDestination() {
        var f = new File("foo");
        f.delete();
        f.delete();
        f = new File("foo");
        OutputDestination o = new OutputDestination_f("foo");
        o.printTo(f);
        o.printTo(new File("foo2"));
        f = new File("foo2");
        f.delete();
        f.delete();
        f = new File("foo2");
        o = new OutputDestination_f("foo2");
        try {
            o.printTo(f);
            fail("No exception thrown should occur");
        } catch (Exception e) {
            
        }
    }
    
		/**
		* Tests if the supplied string can satisfy a pattern or
		* pattern that does not exist.
		* @throws IOException 
		*/
    @Test
    public void test_outputPattern_nonExisting() {
        var testString = "FooBar";
        var f = new File("foo");
        
        assertTrue("the string \"" + testString+"\" should return false.",
            this.removeOutputDestination(new OutputDestination_f("foo"))
        );        
        
        assertFalse("the string \"" + testString+"\" should return true.",
            this.removeOutputDestination(new OutputDestination_f("foo")));
        
        assertTrue("the pattern \"" + testString+"\" should return true.",
            OutputDestination.from("^foo$").match(testString)
        );
    }
    
    /**
     * Tests if the supplied string can satisfy a pattern.
     * 
     * @throws IOException 
     */
    @Test
    public void test_outputPattern() {
    	var f = new File("foo");
    
    	// create temporary file with the pattern
    	try {
    		OutputDestination tmp = new OutputDestination_f("foo");
    		List<String> patternList = new ArrayList<String>();
    		patternList.add(tmp.toPattern());
    		
    		// create pattern
    		File f1 = new File("foo1");
    		assertTrue("the pattern \"" + tmp.toPattern() + "\" should return true.",
    			fileExists(tmp)
    		);
    		
    		f.delete();
    		assertFalse("the pattern \"" + tmp.toPattern() + "\" should return false.",
    			fileExists(tmp)
    		);
    		
    		f1.delete();
    		assertFalse("the pattern \"" + tmp.toPattern() + "\" should return false.",
    			fileExists(tmp)
    		);
    
    		// write to temporary file
    		ArrayList<String> input = new ArrayList<String>() {
    		{
    				add("foobarbaz");
    				add("");
    				add("");
    				add(tmp.toPattern());
    			};
    		};
    		List<String> out = PatternFollower.outputPattern(input.iterator());
    		// compare the contents of the two files
    		for (String s : out) {
    			assertEquals("the input \"" + s + "\" should return true.",
    				"foobarbaz", s
    			);
    		}
    		
		} catch (IOException e) {
				fail(e.getMessage());
		}
    }
    
    /**
     * Tests if the supplied string can satisfy a pattern.
     * 
     * @throws IOException 
     */
    @Test
    public void test_outputPatternAndFile() throws IOException {
    	var f = new File("foo");
    	
    	// create temporary file with string 'foobarbaz'
    	try {
    		f.delete();
    		OutputDestination tmp = new OutputDestination_f("foo");
    		List<String> patternList = new ArrayList<String>();
    		patternList.add(tmp.toPattern());
    		assertFalse("the pattern \"" + tmp.toPattern() + "\" should return false.",
    			fileExists(tmp)
    		);
    		
    		List<String> in = new ArrayList<String>() {
    		 {
    				add("foobarbaz");
    				add(tmp.toPattern());
    				add("");
    				add("");
    				add("");
    				add("");
    				add("");
    				add("");
    				add("");
    		 };
    		};
    		assertTrue("the pattern \"" + tmp.toPattern() + "\" should return true.",
    			patternExists(tmp,in)
    		);
    		
    		f.delete();
    		assertTrue("the pattern \"" + tmp.toPattern() + "\" should return true.",
    			patternExists(tmp,in)
    		);
    		
    		// append file with the string 'baz'
    		f.delete();
    		f.delete();
    		f.createNewFile();
    		assertFalse("the pattern \"" + tmp.toPattern() + "\" should return false.",
    			patternExists(tmp,in)
    		);
    	
    	} catch (IOException e) {
				fail(e.getMessage());
		}
    }
    
    // Test class of {@link OutputDestination}_f.
    private class OutputDestination_f extends OutputDestination {

        public OutputDestination_f(String name) {
            super(name);
        }
        
        public boolean match(String text) {
            return super.match(text);
        }
        
        public String toPattern() {
            return super.toPattern();
        }    	
    }
    
    // Test class of {@link Pattern}_f.
    private class Pattern_f extends Pattern {

        public Pattern_f(String pattern) {
            super(pattern);
        }
        
        public boolean match(String text) {
            return super.match(text);
        }
        
        public String pattern() {
            return super.pattern();
        }        
    }   
	
	private boolean patternExists(Pattern p, List<String> in) {
}
}