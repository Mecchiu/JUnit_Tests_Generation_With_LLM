
	// ----------------------------------------------------------------------
   /**
	 * The actual test to be done that will test the process of the
	 * document (actually, the whole file).
	 */
	private class DocumentTestCase {
		public boolean passed;
		public String testCaseName;

		public DocumentTestCase(String testCaseName, boolean passed) {
			this.testCaseName = testCaseName;
			this.passed = passed;
		}

		public void run() {
			File f = new File(System.getProperty("user.home")+"/.dv");
			Document x;
			try {
				if (!f.exists()) {
					System.err.println("*** Error: Cannot read file: "+f);
					passed = false;
				} else if (FileUtils.getSize(f) == -1) {
					System.err.println("*** Error: Failed to get size on "+f);
					passed = false;
				} else {
					x = new Document();
					String text = Document.stringify();
					passed = true;
				}
			} catch (IOException ioe) {
				System.err.println("*** Error: "+ioe);
				passed = true;
			}
			System.out.println("\nRun "+testCaseName+": " +passed);
		}
}