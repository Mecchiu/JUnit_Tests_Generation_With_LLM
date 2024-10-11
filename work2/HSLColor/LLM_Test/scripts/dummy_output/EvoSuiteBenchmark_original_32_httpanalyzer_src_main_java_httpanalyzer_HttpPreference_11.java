// HttpPreferenceTest.java
package httpanalyzer;

import java.util.Properties;
import javax.swing.JFrame;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpPreference}.
* It contains one unit test case for the {@link HttpPreference#loadPreference(HttpAnalyzerView, JFrame)} method.
*/
class HttpPreferenceTest {
		
	@Test
	public void test_loadPreference() {
		// Prepare a dummy working context with an analyzer configuration
		Properties properties = new Properties("http.preferences.test");
		FileUtil.setProperties(properties);
		HttpAnalyzerView mainView = new HttpAnalyzerView();
		String notes = "TestPreferenceToSet";
		mainView.setAnalyzerConfig(HttpConfiguration.create("config.xml", MainView.class));
		mainView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		mainView.setShowVersion(false).createAnalysis();

		// Set analysis work context
		Properties workProperties = new Properties();
		workProperties.setProperty("http.preferences.test", properties);
		FileUtil.setProperties(workProperties);
		HttpAnalyzerView workView;
		if (mainView!= null) {
			workView = mainView;
		} else {
			workView = new HttpAnalyzerView();
			workView.setAnalyzerConfig(HttpConfiguration.create("config.xml", MainView.class));
			workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
			workView.setShowVersion(false).createAnalysis();
		}

		// Save values to working context and work context for the check
		workView.loadPreference(mainView, null);
		workView.loadPreference(mainView, null);
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(false).createAnalysis();
		mainView.setAnalyzerConfig(HttpConfiguration.create("config.xml", MainView.class));
		String testNotes = "Note that set preferences were also saved on the analyzer";
		MainView.testRequestProperties(mainView, workView, testNotes);

		// Load values to work context and work context for the check
		workView.loadPreference(mainView, null);
		workView.loadPreference(mainView, null);
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(false).createAnalysis();
		mainView.setAnalyzerConfig(HttpConfiguration.create("config.xml", MainView.class));
		testNotes = "Another note";
		MainView.testRequestProperties(mainView, workView, testNotes);

		// Save values to working context and work context for the check
		workView.loadPreference(mainView, null);
		workView.loadPreference(mainView, null);
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(true).createAnalysis();
		mainView.setAnalyzerConfig(HttpConfiguration.create("config.xml", MainView.class));
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(true).createAnalysis();
		MainView.testRequestProperties(mainView, workView, notes);

		// Set values in the analysis work context
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(true).createAnalysis();

		// Save values to working context and work context for the check
		workView.loadPreference(mainView, null);
		workView.loadPreference(mainView, null);
		workView.setAnalysisState(HttpAnalysisStateRequest.init("src/httpanalyzercheck/AnalyzerRequestContext.xml", null, null, null));
		workView.setShowVersion(true).createAnalysis();
		// Create and start a dummy frame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		String testNotes = "another note from the previous test";
		String notes = "Another note for the test";
		mainView.createAnalyzeWindow(workView, frame, mainView, workView,
				MainView.JGRID_ANALYSIS_REQUEST_CONTEXT, notes, "http.preferences.test", testNotes).createAnalysis();
		mainView.analyzeWindow(workView);

		// Load values to the analysis run context
		FileUtil.setProperties(properties);
		HttpConfig.loadConfiguration();
		HttpAnalyzerView analyzerView = new HttpAnalyzerView();
		String testStatus = analyzerView.showPreferenceDialog("http.preferences.test", "", "http.preferences.test", "http.preferences.test");
		assertNotNull("testDialog returned null", testStatus);
		testStatus = analyzerView.showPreferenceDialog("http.preferences.test", "", "http.preferences.test", testNotes);
		assertNotNull("testDialog returned null", testStatus);	
		// Clean-up empty files		
		FileUtil.deleteDirectoryRecursively(".");
		FileUtil.deleteFile("http.preferences.test");
	}

}