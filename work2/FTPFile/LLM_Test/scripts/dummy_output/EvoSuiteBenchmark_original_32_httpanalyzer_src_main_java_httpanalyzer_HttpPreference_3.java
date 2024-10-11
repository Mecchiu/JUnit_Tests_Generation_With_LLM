package httpanalyzer;
public static void main(String args[]) {
		    // Animate to non interactive session

		    JFrame p = new JFrame();
		    try {
		        new HttpPreference().loadPreference(new HttpAnalyzerView(), p);
		    } catch (Exception e) {
		        // This error should occur only when a different instance is used
		    }
		}
}

/**
 * Load and save the test-cases of HttpPreference.
 */
public class HttpPreferenceTest2 {
	// TODO: Implement a test
	@Test
	public void testLoad() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.testLoad();
	}
	
	@Test
	public void testLoad2() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.testLoad();
	}
	
	@Test
	public void testSave() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.testSave();
	}
	
	@Test
	public void testSave2() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.testSave();
	}
}

/**
 * Load and save the test-cases of HttpPreference.
 */
public class HttpPreferenceTest1 {
	// TODO: Write a test for this method
	@Test
	public void loadTest() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.loadTest();
	}
	
	@Test
	public void loadSave2() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest1.loadSave();
	}
}

/**
 * Load and save the test-cases of HttpPreference.
 */
public class HttpPreferenceTest2 {
	// TODO: Write a test for this method
	@Test
	public void testLoad() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest2.testLoad();
	}
	
	@Test
	public void testSave() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest2.testSave();
	}
	
	@Test
	public void testSave2() throws Exception {
		// TODO: Write a test for this method
		HttpPreferenceTest2.testSave();
	}
	
}
