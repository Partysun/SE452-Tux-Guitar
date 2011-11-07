package pdf.Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CoviewPDFTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test Suite for pdf.Test");

		suite.addTestSuite(PDFWriterTest.class);
		suite.addTestSuite(PDFSongExporterTest.class);

		return suite;
	}

}
