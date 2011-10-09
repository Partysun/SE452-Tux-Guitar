

import org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat;

import junit.framework.TestCase;

public class TGConverterFormatTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat.TGConverterFormat(String, Object)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat#TGConverterFormat(String,Object))*/
	public void testTGConverterFormatStringObject() {
		// Method under test arguments
		String extension = null;
		Object exporter = null;

		// Constructor under test arguments// Constructor under test
		TGConverterFormat constructorInstance = new TGConverterFormat(
				extension, exporter);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat.getExtension()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat#getExtension())*/
	public void testGetExtension() {

		// Constructor arguments
		String extension = null;
		Object exporter = null;
		TGConverterFormat constructorInstance = new TGConverterFormat(
				extension, exporter);

		String methodReturn = constructorInstance.getExtension();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat.getExporter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat#getExporter())*/
	public void testGetExporter() {

		// Constructor arguments
		String extension = null;
		Object exporter = null;
		TGConverterFormat constructorInstance = new TGConverterFormat(
				extension, exporter);

		Object methodReturn = constructorInstance.getExporter();
		fail("Test method not implemented.");
	}

}
