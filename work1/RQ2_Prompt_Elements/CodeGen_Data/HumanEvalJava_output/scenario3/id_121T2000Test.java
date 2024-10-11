// SolutionTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Solution}.
* It contains one unit test case for the {@link Solution#solution(List)} method.
*/
class SolutionTest {

		@Test
		public void testSolution() {
				{
						List list = new List();
						list.add(0);
						list.add(1);
						list.add(2);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(1));
				}
						{
							List list = new List();
							list.add(1);
							list.add(2);
							list.add(3);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(2));
						}
						{
							List list = new List();
							list.add(1);
							list.add(3);
							list.add(2);
							
							assertTrue("Test should be 3", Solution.solution(list).equals(3));
						}
						{
							List list = new List();
							list.add(1);
							list.add(2);
							list.add(3);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(4));
						}
						{
							List list = new List();
							list.add(1);
							list.add(3);
							list.add(2);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(5));
						}
						{
							List list = new List();
							list.add(1);
							list.add(3);
							list.add(2);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(6));
						}
						{
							List list = new List();
							list.add(1);
							list.add(3);
							list.add(2);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(10));
						}
						{
							List list = new List();
							list.add(1);
							list.add(3);
							list.add(2);
							
							assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(11));
						}
				}
				{
						List list = new List();
						list.add(0);
						list.add(1);
						list.add(2);
						
						assertTrue("Test should be 0, 1, or 2", Solution.solution(list).equals(2));
				}
				{
						List list = new List();
						list.add(1);
						list.add(2);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(3));
				}
				{
						List list = new List();
						list.add(1);
						list.add(2);
						list.add(3);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(4));
				}
				{
						List list = new List();
						list.add(1);
						list.add(2);
						list.add(3);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(5));
				}
				{
						List list = new List();
						list.add(1);
						list.add(2);
						list.add(3);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(6));
				}
				{
						List list = new List();
						list.add(1);
						list.add(3);
						list.add(2);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(10));
				}
				{
						List list = new List();
						list.add(1);
						list.add(3);
						list.add(2);
						
						assertTrue("Test should be 1, 2, or 3", Solution.solution(list).equals(11));
				}
		}

		
}
