// LineReader_1Test.java
package fr.pingtimeout.jtail.io;

import fr.pingtimeout.jtail.io.index.FileIndex;
import fr.pingtimeout.jtail.util.JTailLogger;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineReader}.
* It contains one unit test case for the {@link LineReader#readBlock(int, int)} method.
*/
class LineReader_1Test {
		/**
		 * Test of readBlock method, of class LineReader.
		 * @throws java.io.FileNotFoundException
		 */
		@Test
		@org.junit.jupiter.api.Test
		public void testReadBlock1() throws FileNotFoundException{
			//System.out.println("readBlock1");

			RandomAccessFile randomAccess = new RandomAccessFile(new File("testdata/testfiles/file"), READONLY_MODE);
			int read = randomAccess.readLine();
			while(read!= -1){
				read = randomAccess.readLine();
			}
			FileIndex index = new FileIndex();
			int idx = 0;
			do{
				String s = ("Block : "+idx++);
				while(s.length()<4){
					s = s +  " ";
				}
				System.out.println(index.addData(s, read));
				s = ("");
				while(s.length()<9){
					s = s +  " ";
				}
				System.out.println(index.addData(s, read));
			}while(idx < 200);
			ArrayList<String> list = index.getBlockList();
			System.out.println(list.size() + " lignes de fichier");
		}
	/**
	 * Test of readBlock method, of class LineReader.
	 * @throws java.io.IOException
	 */
		@Test
		@org.junit.jupiter.api.Test
		public void testReadBlock2() throws IOException{
			RandomAccessFile randomAccess = new RandomAccessFile(new File("testdata/testfiles/file"), READONLY_MODE);
			int read = randomAccess.readLine();
			while(read!= -1){
				read = randomAccess.readLine();
			}
			FileIndex index = new FileIndex();
			int idx = 0;
			do{
				String s = ("Block: "+idx++);
				while(s.length()<4){
					s = s +  " ";
				}
				System.out.println(index.addData(s, read));
				s = ("");
				while(s.length()<9){
					s = s +  " ";
				}
				System.out.println(index.addData(s, read));
			}while(idx < 200);
			ArrayList<String> list = index.getBlockList();
			System.out.println(list.size() + " lignes du fichier");
		}
	}
// LineReader_2Test.java