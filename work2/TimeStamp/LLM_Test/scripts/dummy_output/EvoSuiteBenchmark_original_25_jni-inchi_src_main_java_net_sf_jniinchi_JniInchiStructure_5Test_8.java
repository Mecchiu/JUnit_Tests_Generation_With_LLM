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
        public void getStereo0D1() {
                JniInchiStereo0D stereo0D = getStereo0D(0);
                System.out.println(stereo0D);
        }

        @Test
        public void getStereo0D2() {
                JniInchiStereo0D stereo0D = getStereo0D(1);
                System.out.println(stereo0D);
        }


        @Test
        public void getStereo0D3() {
                JniInchiStereo0D stereo0D = getStereo0D(5);
                System.out.println(stereo0D);
        }

        @Test
        public void getStereo0D4() {
                JniInchiStereo0D stereo0D = getStereo0D(-1);
                System.out.println(stereo0D);
        }

		@Test
		public void getStereo0D4_error() {
				JniInchiStereo0D stereo0D = getStereo0D(-1);
				System.out.println("Illegal stereo error: " + stereo0D.getStereoParadigm());
        }

        @Test
        public void getStereo0D5() {
        	JniInchiStereo0D stereo0D = new JniInchiStereo0D();
        	int stereoParadigm = stereo0D.getStereoParadigm();
        	System.out.println("Stereo type: " + stereoParadigm);
        }

}
