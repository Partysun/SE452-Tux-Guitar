package test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CoviewMusicTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test Suite for test");

		suite.addTestSuite(MusicXMLPluginExporterTest.class);
		suite.addTestSuite(MusicXMLWriterTest.class);
		suite.addTestSuite(MusicXMLSongExporterTest.class);

		return suite;
	}

}
