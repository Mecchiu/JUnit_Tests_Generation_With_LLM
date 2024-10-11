// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains one unit test case for the {@link Memory#get(int)} method.
*/
class Memory_1Test {
		public static void main(String[] args) {
			List<Integer> testArray = new ArrayList<>();

			for (int i = 0; i < 100; i++) {
				testArray.add(i);
			}

	        System.out.println(testArray.size());
	        // Test case 1
			for(int index : testArray){
				System.out.println(index);
			}

	        // Test case 7

			testArray.add(7);

			for(int index : testArray){
				System.out.println(index);
			}
		}
}