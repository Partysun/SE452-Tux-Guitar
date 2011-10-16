package test;

import java.io.OutputStream;

import junit.framework.TestCase;

import org.herac.tuxguitar.io.musicxml.MusicXMLWriter;
import org.herac.tuxguitar.song.models.TGSong;

public class MusicXMLWriterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.MusicXMLWriter(OutputStream)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLWriter#MusicXMLWriter(OutputStream))*/
	public void testMusicXMLWriterOutputStream() {
		// Method under test arguments
		OutputStream stream = null;

		// Constructor under test arguments// Constructor under test
		MusicXMLWriter constructorInstance = new MusicXMLWriter(stream);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLWriter#writeSong(TGSong))*/
	public void testWriteSongTGSong_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGFileFormatException
		
		 * 
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		// Constructor arguments
		OutputStream stream = null;

		MusicXMLWriter constructorInstance = new MusicXMLWriter(stream);

		try {

			constructorInstance.writeSong(song);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLWriter#writeSong(TGSong))*/
	public void testWriteSongTGSong_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGFileFormatException
		
		 * 
		 *[82]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		// Constructor arguments
		OutputStream stream = null;

		MusicXMLWriter constructorInstance = new MusicXMLWriter(stream);

		try {

			constructorInstance.writeSong(song);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeHeaders(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteHeadersNode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeWork(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteWorkNode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeIdentification(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteIdentificationNode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeSong(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteSongNode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writePartList(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartListNode_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writePartList(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartListNode_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writePartList(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartListNode_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeParts(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartsNode_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeParts(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartsNode_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeParts(Node)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWritePartsNode_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path19() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path20() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path21() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path22() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path23() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path24() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path25() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path26() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path27() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path28() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureAttributes(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureAttributesNodeTGMeasureTGMeasure_Path29() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeTuning(Node, TGTrack)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteTuningNodeTGTrack_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeTuning(Node, TGTrack)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteTuningNodeTGTrack_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeTimeSignature(Node, TGTimeSignature)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteTimeSignatureNodeTGTimeSignature() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeKeySignature(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteKeySignatureNodeInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeKeySignature(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteKeySignatureNodeInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeKeySignature(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteKeySignatureNodeInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeClef(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteClefNodeInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeClef(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteClefNodeInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeClef(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteClefNodeInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeClef(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteClefNodeInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeClef(Node, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteClefNodeInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDirection(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDirectionNodeTGMeasureTGMeasure_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDirection(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDirectionNodeTGMeasureTGMeasure_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDirection(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDirectionNodeTGMeasureTGMeasure_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDirection(Node, TGMeasure, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDirectionNodeTGMeasureTGMeasure_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeMeasureTempo(Node, TGTempo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteMeasureTempoNodeTGTempo() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeBeats(Node, TGMeasure)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteBeatsNodeTGMeasure_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.writeDuration(Node, TGDuration)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testWriteDurationNodeTGDuration_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.addAttribute(Node, String, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddAttributeNodeStringString() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.addNode(Node, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddNodeNodeString() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.addNode(Node, String, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddNodeNodeStringString() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.newDocument()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testNewDocument_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.newDocument()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testNewDocument_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.saveDocument()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testSaveDocument_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLWriter.saveDocument()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testSaveDocument_Path2() {
	}

}
