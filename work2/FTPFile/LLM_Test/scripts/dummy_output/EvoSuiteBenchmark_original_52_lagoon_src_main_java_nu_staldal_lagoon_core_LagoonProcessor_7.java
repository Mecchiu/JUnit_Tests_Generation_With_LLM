// LagoonProcessorTest.java
package nu.staldal.lagoon.core;

import java.io.*;
import java.util.*;
import nu.staldal.xtree.*;
import nu.staldal.util.Utils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LagoonProcessor}.
* It contains one unit test case for the {@link LagoonProcessor#build(boolean)} method.
*/
class LagoonProcessorTest {
		
	/** The {@link LagoonContext}
	  * @throws IOException 
	*/
	@Test
	void testLagoon() throws IOException, ParserException {
		this.createFile();
		this.updateFile();
		this.checkOutFile();
		this.removeFile();
		this.removeFile2();
		this.build(false);
		this.checkOutFile();
		this.removeFile();
		this.build(true);
		this.checkOutFile();
		this.removeFile();
		this.build(false);
		this.removeFile(true);
		this.removeFileFromInspector();
		this.build(true);
		this.checkOutFile();
		this.removeFile(true);
		this.build(false);
		this.removeFileFromInspector();
        this.build(true);
		this.checkOutFile();
		this.removeFile(true);
		this.build(false);
		this.removeFileFromInspector();
		this.build(true);
		this.checkOutFile();
		this.removeFile(true);
		this.build(false);
		this.removeFile(true);
		this.build(true);
		this.removeFile(true);
		this.removeFileFromInspector();
        this.build(true);
		this.removeFile(true);
        this.build(false);
		this.removeFile(true);
        this.build(true);
    }

    void removeFile(boolean force) throws IOException {
        new FileReader(this.currentTarget).close();
        if (force) {
            Utils.recursiveDelete(this.targetFolder, new FileFilter() {
                @Override
                public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
            })
        }
    }

    void removeFile(boolean force2) throws IOException {
        new FileReader(this.currentTarget2).close();
        if (force2) {
            Utils.recursiveDelete(this.targetFolder2, new FileFilter() {
                @Override
                public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
            })
        }
    }
    
    void build(boolean force) throws IOException {
		// this.lng.writeTo(this.processFile(), this.target, this.target2);
		
		try (OutputStream out = new FileOutputStream(this.currentTarget, true);
			 OutputStream out2 = new FileOutputStream(this.currentTarget2, true)
		) {
			 this.lng.writeTo(out, this.target, this.currentTarget2);
			this.lng2.writeTo(out2, this.currentTarget2);
		}
    }

	void build(boolean force, boolean force2) throws IOException {
		new FileReader(this.currentTarget).close();
		
		try (OutputStream out = new FileOutputStream(this.currentTarget, true);
			 OutputStream out2 = new FileOutputStream(this.currentTarget2, true)
		) {
            Utils.recursiveCopy(this.currentFolder, out, out2);
		}
    }

    protected void removeFile() throws IOException {
        Utils.recursiveDelete(this.targetFolder, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        })
    };
	protected void removeFile2() throws IOException {
		Utils.recursiveDelete(this.targetFolder2, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory();
            }
        })
    };

	protected void build(boolean force, boolean force2) throws IOException {
		new FileReader(this.currentTarget).close();
		new FileReader(this.currentTarget2).close();

		try (OutputStream out = new FileOutputStream(this.currentTarget, true);
			 OutputStream out2 = new FileOutputStream(this.currentTarget2, true)) {
			 this.lng.writeTo(out, this.target, this.currentTarget2);
			this.lng2.writeTo(out2, this.currentTarget2);
		}
	};

    protected void createFile() throws IOException {
        new FileWriter(this.currentTarget + ".new", true);
    }

    protected void updateFile() throws IOException {
        new FileWriter(this.currentTarget + ".new").close();

        new FileWriter(this.currentTarget, true);
    }

    protected void checkOutFile() throws IOException {
        assertTrue("File " + this.currentTarget + " is missing, can't build", this.lng.inFoldersOnly(this.currentFolder));
        new FileWriter(this.currentTarget).close();
    }

    protected void removeFile() throws IOException {
        remove(this.target + ".new");
        new FileWriter(this.currentTarget).close();
    }

    protected void removeFile2() throws IOException {
        remove(this.target2 + ".new");
    }

    protected void build(boolean force, boolean force2) throws IOException {
        new FileWriter(this.currentTarget2).close();
		// this.lng2.writeTo(this.processFile2, this.currentTarget2);
        new FileWriter(this.currentTarget2, true).close();
        if (force) {
            Utils.recursiveDelete(this.targetFolder2, new FileFilter() {
                @Override
                public boolean accept(File pathname) {
					return pathname.isDirectory();
				}
            })
        }
    }

    private void remove(String path) throws IOException {
        Utils.recursiveDelete(this.targetFolder, new FileFilter() {
            @Override
            public boolean accept(File pathname) {
				return pathname.isDirectory();
			}
        })
    }

    protected File currentTarget = new File(this.targetFolder, "core", "lagoon.json");
    protected File currentTarget2 = new File(this.targetFolder2, "core", "lagoon.json");

	protected File currentFolder = new File(this.target, "data");
    protected File target = new File(this.target, "data", "lagoon.json");
    protected File target2 = new File(this.target2, "data", "lagoon.json");
}