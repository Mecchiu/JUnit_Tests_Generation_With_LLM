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
public static class Memory {
//          @Test
//          public void test_01(){
//              System.out.println("Memory size:"+Arr.length);
//          }
		
			public int a = 0;

			public void store(int address) {
				System.out.println("Store "+address+" into " + a);
				A = address + a;
			}

			public void load(int address) {
//              System.out.println("Load "+address+" from "+a);
				A = address - a;
			}

			public List<Integer> get() {
				System.out.println("Get "+A+" from "+0 + " to "+0 +" from "+a);
				List<Integer> result = new ArrayList<>();
//              System.out.println("Get "+(address-1)+" from "+0+" to "+0+" from "+1+" to "+1+" from "+a);
//              result.add(new Integer(-1));
//              result.add(new Integer(-2));
//              result.add(new Integer(1));
//              result.add(new Integer(2));
//              result.add(new Integer(3));
//              result.add(new Integer(4));
//              result.add(new Integer(5));
//              result.add(new Integer(6));
//              System.out.println("Get "+(address-1)+" from "+0+" to "+0+" from "+1+" to "+1+" from "+2+" to "+2+" from "+3+" to "+3+" from "+4+" to "+4+" from "+5+" to "+5+" from "+6+" to "+6+" from "+7+" to "+7+" from "+8+" to "+8+" from "+9+" to "+9+" from "+10+" to "+10);
				result.add(new Integer(0));
//              System.out.println("Get "+(address-1)+" from "+0+" to "+0+" from "+1+" to "+1+" from "+0+" to "+1);
//              result.add(new Integer(0));
//              result.add(new Integer(1));
//              result.add(new Integer(2));
//              result.add(new Integer(3));
//              result.add(new Integer(4));
//              result.add(new Integer(5));
//              result.add(new Integer(6));
//              result.add(new Integer(7));
//              result.add(new Integer(8));
//              result.add(new Integer(9));
//              result.add(new Integer(10));
				result.add(new Integer(-1));
				result.add(new Integer(-2));
				result.add(new Integer(1));
				result.add(new Integer(2));
				result.add(new Integer(3));
				result.add(new Integer(4));
				result.add(new Integer(5));
				result.add(new Integer(6));
				result.add(new Integer(7));
				result.add(new Integer(8));
				result.add(new Integer(9));
				result.add(new Integer(10));
//                result.add(new Integer(111));
				return result;
			}

			/**
			 * A unit test case of {@link ArrayList#ArrayList()}
			 */
			public ArrayList<Integer> create() {
//              System.out.println("Creating "+A+" from "+0+" to "+0+" from "+a);
				ArrayList<Integer> result = new ArrayList<>();
//                result.add(new Integer(-1));
//                result.add(new Integer(-2));
//                result.add(new Integer(1));
//                result.add(new Integer(2));
//                result.add(new Integer(3));
//                result.add(new Integer(4));
//                result.add(new Integer(5));
//                result.add(new Integer(6));
//                result.add(new Integer(7));
//                result.add(new Integer(8));
//                result.add(new Integer(9));
//                result.add(new Integer(10));
//                result.add(new Integer(A));
//                System.out.println("ArrayList "+A+"("+result.size()+") creates "+A+"("+result.toString()+")");
				return result.toArrayList();
			}
		
		}

		public Memory getMemory(int a) {
//              System.out.println("Getting "+a+" from "+0+" to "+0+" from "+a);
			Memory result = new Memory();
//              System.out.println("Result "+result.get(a)+" ("+result.get(a)+")");
			return result;
		}

		public void reset(int a) {
                System.out.println("Resetting "+a+" into "+0+" to "+0+" from "+a);
             }

		public void print() {
            Thread th = new Thread("A Test "+A) {
                @Override
                public void run() {
                     System.out.println("The " + A + " is " + A);
                     //System.out.println("The "+A+" is " + 10);
                }
            };
            th.start();
            th.join();
        }

		public void store(int address) {
            System.out.println("Store "+address+" into "+A);
        }

		public void load(int address) {
            System.out.println("Load "+address+" from "+A);
        }

		public void get() {
            System.out.println("The " + A  + " is " + 10);
        }

		public List<Integer> get() {
            System.out.println("There is " + A  + " among the result of the get() method");
            return Arr.clone(0, A);
        }

		public static void main(String[] args) {
            new Memory_1Test(10).test_01();
            new Memory_1Test(0).test_01();
        }

}

