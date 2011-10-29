import junit.framework.Test;
import junit.framework.TestSuite;


public class CoviewConverterTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test Suite for default package");

		suite.addTestSuite(TGConverterDialogTest.class);
		suite.addTestSuite(TGConverterTest.class);
		suite.addTestSuite(TGConverterListenerTest.class);
		suite.addTestSuite(TGConverterFormatTest.class);
		suite.addTestSuite(TGConverterPluginTest.class);
		suite.addTestSuite(TGConverterProcessTest.class);

		return suite;
	}

}
