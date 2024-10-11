// LineReader_0Test.java
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
* It contains one unit test case for the {@link LineReader#readLine(int)} method.
*/
class LineReader_0Test {
		/**
		 * Le nombre de lignes indexées.
		 */
         public static final int INDEXES_SIZE = 4;
         
         /**
         * L'index à utiliser.
         */
         private final FileIndex index;
	 
         /**
         * L'nombre d'indexes du niveau fournit à lire.
         */
         private void checkIndexSize(int i) {
		   if (index.getIndexSize()!= i) {
			   throw new Error();
		   }
		}
		 
		 public LineReader_0Test() throws FileNotFoundException {
				 
				 this.index = new FileIndex("./src/test/resources/index.dat", READONLY_MODE);
				 List<String> lineList = new ArrayList<String>(INDEXES_SIZE);
				 
				 for (int i = 0; i < INDEXES_SIZE; i++) {
				   lineList.add(index.read(String.valueOf(i)));
				 }
				 
        }

	      public LineReader_0Test(int i) throws FileNotFoundException {
				 
				 this.index = new FileIndex("./src/test/resources/index.dat", READONLY_MODE);
				 
				 for (int i = 0; i < INDEXES_SIZE; i++) {
				   index.read(String.valueOf(i));
				 }	    
         }
}