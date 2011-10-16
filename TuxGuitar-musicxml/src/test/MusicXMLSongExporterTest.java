package test;

import java.io.OutputStream;

import junit.framework.TestCase;

import org.herac.tuxguitar.io.base.TGFileFormat;
import org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGSong;

public class MusicXMLSongExporterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.getExportName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#getExportName())*/
	public void testGetExportName() {

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		String methodReturn = constructorInstance.getExportName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.getFileFormat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#getFileFormat())*/
	public void testGetFileFormat() {

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		TGFileFormat methodReturn = constructorInstance.getFileFormat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.configure(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#configure(boolean))*/
	public void testConfigureBoolean() {
		// Method under test arguments
		boolean setDefaults = true;

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		boolean methodReturn = constructorInstance.configure(setDefaults);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.init(TGFactory, OutputStream)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#init(TGFactory,OutputStream))*/
	public void testInitTGFactoryOutputStream() {
		// Method under test arguments
		TGFactory factory = null;
		OutputStream stream = null;

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		constructorInstance.init(factory, stream);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path1() {
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
		 *[32]this.stream!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		try {

			constructorInstance.exportSong(song);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.musicxml.MusicXMLSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path2() {
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
		 *[32]this.stream!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		MusicXMLSongExporter constructorInstance = new MusicXMLSongExporter();

		try {

			constructorInstance.exportSong(song);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 2 assertion not implemented.");
	}

}
