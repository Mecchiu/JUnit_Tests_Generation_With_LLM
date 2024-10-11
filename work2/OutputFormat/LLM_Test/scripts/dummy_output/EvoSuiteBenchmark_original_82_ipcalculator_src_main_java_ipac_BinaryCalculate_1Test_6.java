// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {
		
    @Test
    void test1() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("IP/IPRange.txt"); //$NON-NLS-1$
        String input = new BufferedReader(new InputStreamReader(is)).readLine(); //$NON-NLS-1$
        String input2 = "";
        String input3 = "";
        
        String line1 = ""; //$NON-NLS-1$
        String line2 = ""; //$NON-NLS-1$
        
        line1 = input.substring(0, input.length() - 1);
        line2 = input.substring(0, input.length() - 1);

        System.out.println(line1);
        
        int startAddress = 0;
        
        int i = line1.length();
        
        while (i > 0) {
            
            String ip = new String();
            
            for (int x = 0; x < i; x += 3 + 1) {
                if (x > 0) ip = ip + DELIMITER;
                ip = ip + line1.substring(x, x + 2);
                if (i - x > 2) {
                    input = input2;
                } else {
                    input = input3;
                }
            }
            
            if (currentIP!= null) {
                ip = ip + DELIMITER + currentIP;
            }
            
            
            startAddress = 0;

            i += 3;
            
            IP = input;

            System.out.println(ip);

            new BinaryCalculate().calculate(IP, startAddress);
            
            startAddress += 3;
        }
    }
    
    @Test
    void test2() {
        InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("IP/IPRange.txt"); //$NON-NLS-1$
        String input = new BufferedReader(new InputStreamReader(is)).readLine(); //$NON-NLS-1$
        String line1 = ""; //$NON-NLS-1$
        String line2 = ""; //$NON-NLS-1$

        line1 = input.substring(0, input.length() - 1);
        line2 = input.substring(0, input.length() - 1);

        InputStream is1 = Thread.currentThread().getContextClassLoader().getResourceAsStream("IP/IPRange.txt"); //$NON-NLS-1$
}
}