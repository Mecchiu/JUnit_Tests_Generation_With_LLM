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
		public LineReader_1Test() {
			// TODO: Modifier l'ordre pour ne pas renvoyer le message ici.
		}
				try {
        try {
				File f = new File("f");
				f.createNewFile();
				RandomAccessFile f0 = new RandomAccessFile("test", READONLY_MODE);
				List<String> lines = new ArrayList<>();
				int n = 10000;
				int count = 0;
				while (true) {
					try {
						int buf = f0.read(new byte[4096]);

						for (; buf > 0; buf = f0.read(new byte[buf])) {
							lines.add(new String(f0.getChannel().read(buf)));
						}
						count++;
						assertFalse(count > 0);
					} catch (Exception e) {
						e.printStackTrace();
						count = 0;
					}
					try {
						count = f0.read(new byte[4096]);
					} catch (Exception e) {
					}
					if (f0.length() < 32 * 2048) {
						break;
					}
				}
				for (int i = 0; i < lines.size(); i++) {
					JTailLogger.log(lines.get(i));
				}
            
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
				}