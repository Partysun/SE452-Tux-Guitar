package Tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CoviewTunerTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test Suite for Tests");

		suite.addTestSuite(TGTunerSettingsTest.class);
		suite.addTestSuite(TGTunerRoughWidgetTest.class);
		suite.addTestSuite(TGTunerDialogTest.class);
		suite.addTestSuite(TGTunerQueueTest.class);
		suite.addTestSuite(TGTunerPluginTest.class);
		suite.addTestSuite(FFTTest.class);
		suite.addTestSuite(TGTunerFineWidgetTest.class);
		suite.addTestSuite(TGTuningStringTest.class);
		suite.addTestSuite(TGTunerSettingsDialogTest.class);

		return suite;
	}

}
