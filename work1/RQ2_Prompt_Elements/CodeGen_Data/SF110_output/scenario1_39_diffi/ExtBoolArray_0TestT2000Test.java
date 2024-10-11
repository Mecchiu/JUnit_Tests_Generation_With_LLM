// ExtBoolArray_0Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains one unit test case for the {@link ExtBoolArray#isFalse(int, int)} method.
*/
class ExtBoolArray_0Test {

			/**
			 * Test of the isFalse method, of Object.
			 */
			@Test
			@org.junit.jupiter.api.TestInstance(org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS) // This is okay:
			void isFalse(int a) {
			
            final int[] werte = new int[0];
            booleans [] booleansTemp = new boolean[1];
            
			booleansTemp[0] = true;  // isFalse(a,0) => werte[0] == true
			werte = new int[1];
			if(!(werte[0]==true && boolArray[0]!= null)){
				fail("werte[a] == true && boolArray[0] == null, i: " + a);  
			}
			werte[a] = false;
			boolArray[0] = booleansTemp;
			boolArray[0][a] = true;
			//boolean werte1[] = new boolean[1];
			//boolean werte1[] = {true};
			boolean werte[a]= new boolean[1];
			boolean werte[a][a]= true;
			boolean booleans[] = new boolean[1];
			if(!(booleans[0]==true && booleansTemp[0]!= null)){
				fail("booleans[a] == true && booleansTemp[0] == null, i: " + a);  
			}
			booleans[0] = false;
			booleansTemp[0] = true;
			if(!(werte[0]==false && booleansTemp[0]!= null)){
				fail("werte[a] == true && booleansTemp[0] == null, i: " + a);  
			}
			boolArray[1] = booleans;
			booleans[0] = true;
			booleansTemp[1] = true;
			//boolean booleansTemp2[] = new boolean[1];
			//boolean booleansTemp2[] = {true};
			if(!(werte[0]==true && booleansTemp[0]!= null)){
				fail("booleans[1] == true && booleansTemp[0] == null, i: " + a);  
			}
			booleans = new boolean[a];
			for (int i = 0; i < a; i++) {
				if(!(booleans[i]==true && booleansTemp[i]!= null)){
					fail("booleans["+(a-1)+"] == true && booleansTemp["+(a-1)+"] == null, i: " + i);  
				}
				bogertwo = true;
				bogertwo = bagetwo(bogertwo);
				bogertwo = false;
				booleans[i] = booertwo;
			}
	            // System.out.println(((Boolean)bools[0]).booleanValue());
			int bt1[] = new int[1];
			boolean[] bt2 = new boolean[a];
			for (int i = 0; i < a; i++) {
				booertwo = bagetwo(booleans[i]);
				if (bohertwo == bt1[0]) {
					bt1[0] = booertwo;  // if booleans[i] == booertwo return
				}else{
					//System.out.println((i+")!= boolean[0]: " + i +"!= "+ booertwo);
					System.out.println((i+")!= boolean[0]: " + i+"!= "+booertwo);
					assert(false);
				}
			}
			boolean ok = (bogertwo == bt1[0]);
			assert(ok);
	}	

}
