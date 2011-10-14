package pdf.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.io.OutputStream;

import org.herac.tuxguitar.app.printer.PrintLayout;
import org.herac.tuxguitar.app.printer.PrintStyles;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.io.base.TGFileFormat;
import org.herac.tuxguitar.io.pdf.PDFSongExporter;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGSong;
import org.junit.Test;

public class PDFSongExporterTest {

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.getExportName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#getExportName())*/
	@Test
	public void testGetExportName() {

		PDFSongExporter constructorInstance = new PDFSongExporter();

		String methodReturn = constructorInstance.getExportName();
		assertEquals(methodReturn, "PDF");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFSongExporter.getFileFormat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFSongExporter#getFileFormat())*/
	@Test
	public void testGetFileFormat() {

		PDFSongExporter constructorInstance = new PDFSongExporter();

		TGFileFormat methodReturn = constructorInstance.getFileFormat();
		assertTrue(methodReturn instanceof TGFileFormat);
	}
}
