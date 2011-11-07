package pdf.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.printer.PrintLayout;
import org.herac.tuxguitar.app.printer.PrintStyles;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.io.base.TGFileFormat;
import org.herac.tuxguitar.io.pdf.PDFSongExporter;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGSong;

public class PDFSongExporterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.getExportName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#getExportName())*/
	public void testGetExportName() {

		PDFSongExporter constructorInstance = new PDFSongExporter();

		String methodReturn = constructorInstance.getExportName();
		assertEquals(methodReturn, "PDF");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.getFileFormat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#getFileFormat())*/
	public void testGetFileFormat() {

		PDFSongExporter constructorInstance = new PDFSongExporter();

		TGFileFormat methodReturn = constructorInstance.getFileFormat();
		assertEquals(methodReturn, new TGFileFormat("PDF","*.pdf"));
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.getDefaultStyles(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#getDefaultStyles(TGSong))*/
	public void testGetDefaultStylesTGSong() {
		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();
		PrintStyles styles = new PrintStyles();
		styles.setStyle(TGLayout.DISPLAY_TABLATURE);
		styles.setFromMeasure(1);
		styles.setToMeasure(song.countMeasureHeaders());
		styles.setTrackNumber(1);
		styles.setBlackAndWhite(false);

		PrintStyles methodReturn = constructorInstance.getDefaultStyles(song);
		assertEquals(methodReturn, styles);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.configure(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#configure(boolean))*/
	public void testConfigureBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]!setDefaults:TRUE
		 *[57]this.styles!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean setDefaults = true;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		boolean methodReturn = constructorInstance.configure(setDefaults);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.configure(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#configure(boolean))*/
	public void testConfigureBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]!setDefaults:FALSE
		 *[57]this.styles!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean setDefaults = true;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		boolean methodReturn = constructorInstance.configure(setDefaults);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.configure(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#configure(boolean))*/
	public void testConfigureBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]!setDefaults:TRUE
		 *[57]this.styles!=null:FALSE
		 *[57]setDefaults:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean setDefaults = true;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		boolean methodReturn = constructorInstance.configure(setDefaults);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.configure(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#configure(boolean))*/
	public void testConfigureBoolean_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]!setDefaults:TRUE
		 *[57]this.styles!=null:FALSE
		 *[57]setDefaults:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean setDefaults = true;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		boolean methodReturn = constructorInstance.configure(setDefaults);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.init(TGFactory, OutputStream)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#init(TGFactory,OutputStream))*/
	public void testInitTGFactoryOutputStream() {
		// Method under test arguments
		TGFactory factory = null;
		OutputStream stream = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.init(factory, stream);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.stream!=null:TRUE
		 *[67]this.styles!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.exportSong(song);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.stream!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.exportSong(song);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.stream!=null:'null'
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.exportSong(song);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.stream!=null:TRUE
		 *[69]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.exportSong(song);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.exportSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#exportSong(TGSong))*/
	public void testExportSongTGSong_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.stream!=null:TRUE
		 *[67]this.styles!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGSong song = null;

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.exportSong(song);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.export(OutputStream, TGSong, PrintStyles)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#export(OutputStream,TGSong,PrintStyles))*/
	public void testExportOutputStreamTGSongPrintStyles() {
		// Method under test arguments
		OutputStream stream = null;
		try {
			stream = new FileOutputStream("test.pdf");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		TGSong song = null;
		PrintStyles data = new PrintStyles(); // leave default

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.export(stream, song, data);
		assertEquals(new File("test.pdf").exists(), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.export(OutputStream, TGSongManager, PrintStyles)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#export(OutputStream,TGSongManager,PrintStyles))*/
	public void testExportOutputStreamTGSongManagerPrintStyles() {
		// Method under test arguments
		OutputStream stream = null;
		try {
			stream = new FileOutputStream("test.pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		TGSongManager manager = new TGSongManager();
		PrintStyles data = new PrintStyles();

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.export(stream, manager, data);
		assertEquals(new File("test.pdf").exists(), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.export(OutputStream, PrintLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#export(OutputStream,PrintLayout))*/
	public void testExportOutputStreamPrintLayout() {
		// Method under test arguments
		OutputStream stream = null;
		try {
			stream = new FileOutputStream("test.pdf");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		PrintLayout layout = new PrintLayout(null, null);

		PDFSongExporter constructorInstance = new PDFSongExporter();

		constructorInstance.export(stream, layout);
		assertEquals(new File("test.pdf").exists(), true);
	}

}
