import org.herac.tuxguitar.app.tools.custom.converter.TGConverter;
import java.io.*;
import org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat;
import org.herac.tuxguitar.app.tools.custom.converter.TGConverterListener;

import junit.framework.TestCase;

public class TGConverterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.TGConverter(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#TGConverter(String,String))*/
	public void testTGConverterStringString() {
		// Method under test arguments
		String sourceFolder = null;
		String destinationFolder = null;

		// Constructor under test arguments// Constructor under test
		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:TRUE
		 *[64]this.format!=null:TRUE
		 *[64]this.format.getExporter:instanceofTGOutputStreamBase:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFileName), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:TRUE
		 *[64]this.format!=null:FALSE
		 *[69]this.format!=null:TRUE
		 *[69]this.format.getExporter:instanceofTGLocalFileExporter:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:TRUE
		 *[64]this.format!=null:TRUE
		 *[64]this.format.getExporter:instanceofTGOutputStreamBase:FALSE
		 *[69]this.format!=null:TRUE
		 *[69]this.format.getExporter:instanceofTGLocalFileExporter:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFileName), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:TRUE
		 *[64]this.format!=null:FALSE
		 *[69]this.format!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFileName), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]song!=null:TRUE
		 *[64]this.format!=null:FALSE
		 *[69]this.format!=null:TRUE
		 *[69]this.format.getExporter:instanceofTGLocalFileExporter:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFileName), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]TGFileFormatException e caught
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFileName), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]TGFileFormatException e caught
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFilename), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[82]FileNotFoundException ex caught
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		Files.createFile(convertFileName);
		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		assertEquals(File.exists(convertFilename), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[84]OutOfMemoryError e caught
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.convert(String, String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#convert(String,String))*/
	public void testConvertStringString_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[86]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		String fileName = null;
		String convertFileName = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.convert(fileName, convertFileName);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.checkIfExists(String, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckIfExistsStringInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.checkIfExists(String, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckIfExistsStringInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.checkIfExists(String, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckIfExistsStringInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.checkIfExists(String, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckIfExistsStringInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.checkIfExists(String, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckIfExistsStringInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#process())*/
	public void testProcess() {

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;
		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.process();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.process(File)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testProcessFile_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.getConvertFileName(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetConvertFileNameString_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.getConvertFileName(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetConvertFileNameString_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.importSong(TGFactory, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testImportSongTGFactoryString_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.importSong(TGFactory, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testImportSongTGFactoryString_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.importSong(TGFactory, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testImportSongTGFactoryString_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.importSong(TGFactory, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testImportSongTGFactoryString_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.importSong(TGFactory, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testImportSongTGFactoryString_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.isSupportedExtension(String, TGLocalFileImporter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSupportedExtensionStringTGLocalFileImporter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.isSupportedExtension(String, TGLocalFileImporter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSupportedExtensionStringTGLocalFileImporter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.isSupportedExtension(String, TGLocalFileImporter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSupportedExtensionStringTGLocalFileImporter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.isSupportedExtension(String, TGLocalFileImporter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSupportedExtensionStringTGLocalFileImporter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.sleep()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testSleep_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.sleep()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testSleep_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.setFormat(TGConverterFormat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#setFormat(TGConverterFormat))*/
	public void testSetFormatTGConverterFormat() {
		// Method under test arguments
		TGConverterFormat format = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.setFormat(format);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.getListener()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#getListener())*/
	public void testGetListener() {

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;
		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		TGConverterListener methodReturn = constructorInstance.getListener();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.setListener(TGConverterListener)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#setListener(TGConverterListener))*/
	public void testSetListenerTGConverterListener() {
		// Method under test arguments
		TGConverterListener listener = null;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.setListener(listener);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.isCancelled()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#isCancelled())*/
	public void testIsCancelled() {

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;
		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		boolean methodReturn = constructorInstance.isCancelled();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverter.setCancelled(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverter#setCancelled(boolean))*/
	public void testSetCancelledBoolean() {
		// Method under test arguments
		boolean cancelled = true;

		// Constructor arguments
		String sourceFolder = null;
		String destinationFolder = null;

		TGConverter constructorInstance = new TGConverter(sourceFolder,
				destinationFolder);

		constructorInstance.setCancelled(cancelled);
		fail("Test method not implemented.");
	}

}
