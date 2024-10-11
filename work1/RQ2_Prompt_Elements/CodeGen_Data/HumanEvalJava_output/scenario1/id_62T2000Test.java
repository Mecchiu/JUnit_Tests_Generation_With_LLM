// DerivativeTest.java
package scenario1;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Derivative}.
* It contains one unit test case for the {@link Derivative#derivative(List)} method.
*/
class DerivativeTest {
@Test
       public void whenGettingAllDerivative_thenReturnList(){
         List<List<Integer>> array = new ArrayList<List<Integer>>();
        array.add(new List<Integer>());
        array.add(new List<Integer>());
        array.add(new List<Integer>());
        Derivative der = new Derivative();
        assertEquals("Derivative expected result", 
            new ArrayList<Integer>(),  
            der.derivative(array));
       }
       @Test
       public void whenGettingTwoSubstractingDerivative_thenReturnTwoDerivative(){
         List<List<Integer>> list = new ArrayList<List<Integer>>();
         list.add(new List<Integer>());
         list.add(new List<Integer>());
         list.add(new List<Integer>());
         assertEquals("Derivative expected result", 
             new ArrayList<Integer>(),  
             der.derivative(list));
       }
       @Test
       public void whenAddingTwoSubstractingDiffernials_thenTwoDifferentDerivative(){
         final List<List<Integer>> diffs = new ArrayList<List<Integer>>();
         diffs.add(new ArrayList<Integer>());
         diffs.add(new ArrayList<Integer>());
         diffs.add(new ArrayList<Integer>());
         Derivative derivative = new Derivative() {
            @Override
            public List<Integer> derivative(List<Integer> xsList) {
               List<Integer> resultDiffs = new ArrayList<Integer>();
               for (int i = 1; i < xsList.size(); i++) {
                  Integer x = xsList.get(i);
                  Integer previousX = xsList.get(i-1);
                  Integer differenceX = x - previousX;
                  
                  if (differenceX > 0) {
                     resultDiffs.add(-differenceX);
                  } else if (differenceX == 0) {
                     resultDiffs.add(0);
                  } else {
                     resultDiffs.add(0);
                  } 
               }
               return resultDiffs;
            }
         };
         derivative.addDiffs(diffs);
         assertEquals("Derivative expected result", new ArrayList<Integer>(), derivative.derivative(diffs));
       }
    
       @Test
       public void whenAddDifferentDerivativesAndThenOneDifferent_thenDerivativeNotEqual(){
         final List<List<Integer>> diffs = new ArrayList<List<Integer>>();
         diffs.add(new ArrayList<Integer>());
         diffs.add(new ArrayList<Integer>());
         Derivative derivative = new Derivative() {
            @Override
            public List<Integer> derivative(List<Integer> xsList) {
               List<Integer> resultDiffs = new ArrayList<Integer>();
               for (int i = 1; i < xsList.size(); i++) {
                  Integer previousX = xsList.get(i-1);
                  Integer differenceX = x - previousX;
                  if (differenceX > 0) {
                     resultDiffs.add(-differenceX);
                  } else if (differenceX == 0) {
                     resultDiffs.add(0);
                  } else {
                     resultDiffs.add(0);
                  } 
               }
               return resultDiffs;
            }
         };
         derivative.addDiffs(diffs);
         assertEquals("Derivative expected result", new ArrayList<Integer>(), derivative.derivative(diffs));
       }
       @Test
       public void whenAddingTwoSubstractingDifferentDerivativesAndThenSame_thenTwoDifferentDerivativeNotEqual(){
         List<List<Integer>> diffs = new ArrayList<List<Integer>>();
         diffs.add(new ArrayList<Integer>());
         diffs.add(new ArrayList<Integer>());
         Derivative derivative = new Derivative() {
            @Override
            public List<Integer> derivative(List<Integer> xsList) {
               List<Integer> resultDiffs = new ArrayList<Integer>();
               for (int i = 1; i < xsList.size(); i++) {
                  Integer lastX = xsList.get(i-1);
                  Integer differenceX = x - lastX;
                  if (differenceX > 0) {
                     resultDiffs.add(-differenceX);
                  } else if (differenceX == 0) {
                     resultDiffs.add(0);
                  } else {
                     resultDiffs.add(0);
                  } 
               }
               return resultDiffs;
            }
         };
         derivative.addDiffs(diffs);
         List<Integer> derivativeDifferently = derivative.derivative(diffs);
         List<Integer> resultWithLast = new ArrayList<Integer>();
         resultWithLast.add(-0);
         resultWithLast.add(-1);
         resultWithLast.add(1);
         //List<Integer> resultDifferentToDifferent
         assertEquals("Derivative expected result", new ArrayList<Integer>(), derivativeDifferently);
       }

    }
