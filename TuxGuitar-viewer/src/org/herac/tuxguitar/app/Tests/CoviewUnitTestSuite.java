package org.herac.tuxguitar.app.Tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class CoviewUnitTestSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test Suite for org.herac.tuxguitar.app.Tests");

		suite.addTestSuite(TGTransportTest.class);
		suite.addTestSuite(SetTablatureEnabledActionTest.class);
		suite.addTestSuite(SelectTrackActionTest.class);
		suite.addTestSuite(TGImageImplTest.class);
		suite.addTestSuite(ActionDialogTest.class);
		suite.addTestSuite(CaretTest.class);
		suite.addTestSuite(TGScrollBarTest.class);
		suite.addTestSuite(TGMeasureImplTest.class);
		suite.addTestSuite(TablatureTest.class);
		suite.addTestSuite(TGMeasureBufferTest.class);
		suite.addTestSuite(TGPainterImplTest.class);
		suite.addTestSuite(TransportPlayActionTest.class);
		suite.addTestSuite(TGResourceUtilsTest.class);
		suite.addTestSuite(GoPreviousMeasureActionTest.class);
		suite.addTestSuite(TGTextImplTest.class);
		suite.addTestSuite(KeyBindingTest.class);
		suite.addTestSuite(SelectMeasureActionTest.class);
		suite.addTestSuite(MidiTickUtilTest.class);
		suite.addTestSuite(TGPointTest.class);
		suite.addTestSuite(TGColorImplTest.class);
		suite.addTestSuite(TGToolBarTest.class);
		suite.addTestSuite(TuxGuitarTest.class);
		suite.addTestSuite(SetChordNameEnabledActionTest.class);
		suite.addTestSuite(TransportStopActionTest.class);
		suite.addTestSuite(TGKeySignaturePainterTest.class);
		suite.addTestSuite(TGTripletFeelPainterTest.class);
		suite.addTestSuite(TGTempoPainterTest.class);
		suite.addTestSuite(SetChordDiagramEnabledActionTest.class);
		suite.addTestSuite(TGFactoryImplTest.class);
		suite.addTestSuite(KeyBindingActionListTest.class);
		suite.addTestSuite(TGResourceFactoryImplTest.class);
		suite.addTestSuite(TGVoiceImplTest.class);
		suite.addTestSuite(GoNextMeasureActionTest.class);
		suite.addTestSuite(TGTrackSpacingTest.class);
		suite.addTestSuite(ActionLockTest.class);
		suite.addTestSuite(TransportSetupActionTest.class);
		suite.addTestSuite(TGFontImplTest.class);
		suite.addTestSuite(TGDimensionTest.class);
		suite.addTestSuite(SyncThreadTest.class);
		suite.addTestSuite(KeyBindingActionManagerTest.class);
		suite.addTestSuite(TGColorModelTest.class);
		suite.addTestSuite(TGFontModelTest.class);
		suite.addTestSuite(TGResourcesTest.class);
		suite.addTestSuite(TGLayoutStylesTest.class);
		suite.addTestSuite(TablatureEditorTest.class);
		suite.addTestSuite(TGChordImplTest.class);
		suite.addTestSuite(SettingsActionTest.class);
		suite.addTestSuite(TGBeatSpacingTest.class);
		suite.addTestSuite(TGLyricImplTest.class);
		suite.addTestSuite(TGNotePainterTest.class);
		suite.addTestSuite(ActionTest.class);
		suite.addTestSuite(EditorCacheTest.class);
		suite.addTestSuite(TGRectangleTest.class);
		suite.addTestSuite(SetScoreEnabledActionTest.class);
		suite.addTestSuite(TGNoteImplTest.class);
		suite.addTestSuite(TGClefPainterTest.class);
		suite.addTestSuite(ActionAdapterTest.class);
		suite.addTestSuite(TGTrackImplTest.class);
		suite.addTestSuite(ActionManagerTest.class);
		suite.addTestSuite(TGBeatImplTest.class);
		suite.addTestSuite(TGSilencePainterTest.class);

		return suite;
	}

}
