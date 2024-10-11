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
		int testCase() {
		int r = 0;

		System.out.println("The size value at address " + r + " is 0");

		Memory m = new Memory();
		for(int a=0; a < 256; a++) {
			r += m.get(a) * 10;
		}
		
		System.out.println("Signed value at address 0 is " + r);

		m.addMemoryArray(new MemoryArray());

		r += 100 * m.get(0);

		
		r += m.get(4) * 10;

        for(int i=0; i < 256; i++) {
            List<Byte> list = new ArrayList<Byte>();
            r += m.get(i) * 10 + list;
		}

		
		
        for(int i=0; i < 256; i++) {
            r += m.get(i, 0) * 10 + new List<Byte>(0x02, list).get(1);
        }

        r += m.get(0, 0);

		for(int i=0; i < 256; i++) {
			r += m.get(i, false, false);
		}

		r += m.get(0, false, false);

		for(int i=0; i < 256; i++) {
			r += m.get(i, true);
		}
    return r;
  }
}