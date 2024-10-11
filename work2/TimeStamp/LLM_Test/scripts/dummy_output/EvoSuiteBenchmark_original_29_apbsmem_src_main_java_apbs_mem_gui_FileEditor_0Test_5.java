// FileEditor_0Test.java
package apbs_mem_gui;

/**
 * @author keithc
 */
import java.io.*;
import java.util.Scanner;
import java.text.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileEditor}.
* It contains one unit test case for the {@link FileEditor#getEnergy(String)} method.
*/
class FileEditor_0Test {
		// Class under test
		@junit.jupiter.Test
		void test() throws IOException {
			// Initialize variables
			int i;
			String[] temp;
			Scanner sc;

			// Create file.
			sc = new Scanner(System.in);
			try {
				System.out.print("Enter file name: ");
				temp = sc.nextLine().split("\\s");
				System.out.println("File name: " + temp[1]);
			}
			finally {
				sc.close();
			}

			// Copy test file.
			File fTemp = new File(temp[0]);
			FileOutputStream fOut = new FileOutputStream(fTemp);
			OutputStreamWriter oswTemp = new OutputStreamWriter(fOut);
			InputStreamReader isrTemp = new InputStreamReader(InputStreamHelper.getInputStream(fTemp)
			                 .toLowerCase());
			try {
				OutputStream outTemp = new FileOutputStream(temp[0]
				                                              + ".output");
				byte[] b1 = new byte[10000];
				byte[] bTemp = new byte[(int) (fTemp.length()));
				while (true) {
					int bRet = isrTemp.read(b1);
					if (bRet == -1)
						break;

					outTemp.write(b1, 0, bRet);
					outTemp.flush();
					oswTemp.write(bTemp, 0, bRet);
				}
				oswTemp.close();
				outTemp.close();
				fOut.close();
			}
			finally {
				oswTemp.close();
				osrTemp.close();
				isrTemp.close();
				fOut.close();
			}

			// Read text from file
			System.out
			                 .println("Press <Enter> to exit: ");
			System.out.println("Entered file: " + temp[1]);
			String line;
			int iLine;

			// Create input buffer.
			System.out
			                 .println("Enter size of energy line: ");
			System.out.println("Enter line: ");
			String tempStr = sc.nextLine();
			i = Integer.parseInt(tempStr);
			iLen = i * 3;
			System.out.print("Enter text of energy: ");
			line = sc.nextLine();

			// Copy text into input buffer
			System.out.print("Enter size of text to insert: ");
			tempStr = sc.nextLine();
			iLen = Integer.parseInt(tempStr);
			line = tmp;

			// Read text from file
			System.out.println("Enter size of text to insert: ");
			System.out.println("Enter text: ");
			byte inBuff[];
			byte readTemp;
			while (i < iLen) {
				inBuff = new byte[4096];
				readTemp = isrTemp.read();
				if (readTemp == -1) {
					break;
				}
				for (iLine = 0; iLine < 10; iLine++) {
					outTemp = out;
					outTemp.write(inBuff);
					outTemp.write(readTemp);
					outTemp.write(inBuff);
					outTemp.write(readTemp);
				}
				outTemp.write(readTemp);
				outTemp.flush();
				isrTemp.close();
			}

			// Print the results
			System.out.println("Done!\n");

		}
	}