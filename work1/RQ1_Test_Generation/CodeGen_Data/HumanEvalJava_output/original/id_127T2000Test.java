// IntersectionTest.java
package original;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Intersection}.
* It contains one unit test case for the {@link Intersection#intersection(List, List)} method.
*/
class IntersectionTest {
private final String name;
		private final List<Integer> interval1;
		private final List<Integer> interval2;
		private final List<Integer> result;
		
		IntersectionTest(String name, List<Integer> interval1, List<Integer> interval2,
				List<Integer> result, 
				List<String> input) {
			this.name = name;
			this.interval1 = interval1;
			this.interval2 = interval2;
			this.result = result;
			inputStream = new StringBuilder();
			outputStream = new StringBuilder();
			sPrint(inputStream, "input");
			if (inputStream.length() == 0) {
				sPrint(outputStream, "input");
				sPrint(outputStream, "no input");
			}
			List<String> lines = new StringBuilder()
					.append("[")
					.append(name)
					.append("(")
					.append(String.valueOf(interval1.getMin()))
					.append(", ")
					.append(String.valueOf(interval1.getMax()))
					.append(")")
					.append("(")
					.append(String.valueOf(interval2.getMin()))
					.append(", ")
					.append(String.valueOf(interval2.getMax()))
					.append(")";
			for (Integer a : interval1) {
				for (Integer b : interval2) {
					if (interval1.getMin() <= a && interval1.getMax() >= b) {
						lines.append("(");
						sPrint(lines, String.valueOf(a));
						sPrint(lines, String.valueOf(b));
						streamToFile(input, lines);
						sPrint(lines, ")");
						break;
					}
					if (interval1.getMin() <= a && interval1.getMax() >= b) {
						lines.append(String.valueOf(a));
						break;
					} else {
						/*
						 * There is a mismatch between the intervals for the respective
						 * numbers.
						 */
						break;
					}
				}
				if (iForbidden(interval1.getMin(), interval2.getMin(), interval1.getMax(), interval2.getMax())){
					lines.append("(");
					/*
						 * The length should be a
						 * prime number
						 */
					sPrint(lines, String.valueOf(interval2.getMin()));
					sPrint(lines, " - ");
					sPrint(lines, String.valueOf(interval2.getMax()));
					sPrint(lines, ")\n");
					break;
				}
			}
			sPrint(outputStream, "output");
			sPrint(outputStream, lines);
		}
		/**
		* It checks if the two given integers are equal to the length of interval.
		* @return
		*/
		private boolean iForbidden(int a, int b, int c, int d) {
			boolean value = false;
			if (interval1.get(0) == a) {
				if (interval2.get(0) == c) {
					value = true;
				}
			} else if (interval1.get(1) == c) {
				if (interval2.get(1) == b) {
					value = true;
				}
			}
			return value;
		}
		/**
		 * Stream processing.
		 * @param lines
		 * @param lines
		 */
		private void streamToFile(List<String> lines, StringBuilder stream) {
			for (String line : lines) {
				sPrint(stream, line);
			}
		}
		
		/**
		 * {@link sPrint} helper.
		 * @param source
		 * @param target
		 */
		public static void sPrint(StringBuilder source, String target) {
			for (String spair : source) {
				spair += "\n";
				target += "\n";
			}
		}
}
