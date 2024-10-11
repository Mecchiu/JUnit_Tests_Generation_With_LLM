// FileFollower_0Test.java
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
* It contains ten unit test cases for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
*/
class FileFollower_0Test {

		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_0() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_1() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_2() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_3() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_4() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_5() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_6() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_7() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_8() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
		/**
		* Test case for the {@link FileFollower#addOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testAddOutputDestination_9() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public void print(String s) {
						}
				};
				boolean result = fileFollower.addOutputDestination(outputDestination);
				assertTrue(result);
		}
		
}

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
* It contains ten unit test cases for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
*/
class FileFollower_1Test {
		
		/**
		* Test case for the {@link FileFollower#removeOutputDestination(OutputDestination)} method.
		*/
		@Test
		void testRemoveOutputDestination_0() {
				FileFollower fileFollower = new FileFollower(new File("test.txt"), new OutputDestination[]{});
				OutputDestination outputDestination = new OutputDestination() {
						public