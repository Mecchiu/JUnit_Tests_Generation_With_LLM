// PrimeFibTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains one unit test case for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
private int testData;
		private int[] result;
		private final int min = 1;
		private final int max = 26;
			@Test
		      public void primeFib_1_positive_result() {
		      	  testData=min+1;
		      	  result = new int[testData];
		      	  for(int i = 0; i < testData-1; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertEquals(min,result[0]);
		         assertTrue(isPrime(2));
		      }
		      @Test
		      public void primeFib_2_pos_2() {
		      	  testData=min+2;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)* 2; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertTrue(isPrime(max));
		      }
		      @Test
		      public void primeFib_3_pos_max() {
		      	  testData=min+3;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)* (testData / 2)-2; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertEquals(0,result[0]);
		         assertEquals(max,result[1]);
		        }
		@Test
		      public void primeFib_4_negative_result() {
		      	  testData=min+1;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)* (testData / 2)-2; i++){
		      	   result[i] = primeFib(-i);
		      	  }
		         assertEquals(0,result[0]);
		         assertTrue(isPrime(max));
		      }
		  @Test
		      public void primeFib_5_positive_result() {
		      	  testData=min+2;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)*-1; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertEquals(mini,result[0]);
		         assertTrue(isPrime(max));
		     }
		  @Test
		      public void primeFib_6_pos_max() {
		      	  testData=min+3;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)* (testData / 2)-2; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertEquals(max,result[0]);
		         assertEquals(max,result[1]);
		        }
                  @Test
		      public void primeFib_7_negative_result() {
		      	  testData=min+1;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)*-1; i++){
		      	   result[i] = primeFib(-i);
		      	  }
		         assertEquals(testData,result[0]);
		         assertEquals(max,result[1]);
		         }
		  @Test
		      public void primeFib_8_positive_result() {
		      	  testData=min+2;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)*-1; i++){
		      	   result[i] = primeFib(i);
		      	  }
		         assertEquals(mini,result[0]);
		         assertTrue(isPrime(max));
		       }
		  @Test
		      public void primeFib_9_pos_max() {
		      	  testData=mini;
		      	  result = new int[testData];
		      	  for(int i = 0; i < ((testData / 2)+1)*-1; i++){
		      	   result[i] = primeFib(-i);
		      	  }
		         assertEquals(testData,result[0]);
		         assertEquals(max,result[1]);
		     }
		    public int[] getResult(){
		    	 return result;
		    }
	 }