package pdf.Test;

import static org.junit.Assert.*;
import org.herac.tuxguitar.io.pdf.PDFPluginExporter;
import org.junit.Test;

public class PDFPluginExporterTest {

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFPluginExporter.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFPluginExporter#getName())*/
	@Test
	public void testGetName() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		String methodReturn = constructorInstance.getName();
		assertEquals( methodReturn ,"PDF file format exporter");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFPluginExporter.getAuthor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFPluginExporter#getAuthor())*/
	@Test
	public void testGetAuthor() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		String methodReturn = constructorInstance.getAuthor();
		assertEquals(methodReturn, "Julian Casadesus <julian@casadesus.com.ar>");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFPluginExporter.getDescription()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFPluginExporter#getDescription())*/
	@Test
	public void testGetDescription() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		String methodReturn = constructorInstance.getDescription();
		assertEquals(methodReturn, "TuxGuitar-pdf is an \"iText\" based *.pdf exporter plugin." + "\niText Homepage: http://www.lowagie.com/iText/index.html");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFPluginExporter.getVersion()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFPluginExporter#getVersion())*/
	@Test
	public void testGetVersion() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		String methodReturn = constructorInstance.getVersion();
		assertEquals(methodReturn, "1.0");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin.init()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin#init())*/
	@Test
	public void testInit() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		try {

			constructorInstance.init();
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		assertTrue(constructorInstance instanceof PDFPluginExporter);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin.close()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin#close())*/
	@Test
	public void testClose() {

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		try {

			constructorInstance.close();
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin.setEnabled(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin#setEnabled(boolean))*/
	@Test
	public void testSetEnabledBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGPluginException
		
		 * 
		 *[24]enabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean enabled = true;

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		try {

			constructorInstance.setEnabled(enabled);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin.setEnabled(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.plugins.base.TGExporterPlugin#setEnabled(boolean))*/
	@Test
	public void testSetEnabledBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGPluginException
		
		 * 
		 *[24]enabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean enabled = true;

		PDFPluginExporter constructorInstance = new PDFPluginExporter();

		try {

			constructorInstance.setEnabled(enabled);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		
	}
}
