



import org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog;

import junit.framework.TestCase;

public class TGConverterDialogTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.TGConverterDialog()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#TGConverterDialog())*/
	public void testTGConverterDialog() {

		// Constructor under test
		TGConverterDialog constructorInstance = new TGConverterDialog();
		assertNotNull(constructorInstance);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.show()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#show())*/
	public void testShow() {

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.show();
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#isDisposed())*/
	public void testIsDisposed_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]this.dialog==null:TRUE
		 *[164]this.dialog.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.show();
		constructorInstance.close();
		assertEquals(constructorInstance.isDisposed(), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#isDisposed())*/
	public void testIsDisposed_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]this.dialog==null:FALSE
		 *[164]this.dialog.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterDialog constructorInstance = new TGConverterDialog();

		// Don't open it for the second path
		assertEquals(constructorInstance.isDisposed(), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#isDisposed())*/
	public void testIsDisposed_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]this.dialog==null:TRUE
		 *[164]this.dialog.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterDialog constructorInstance = new TGConverterDialog();

		// Same as path #2
		assertEquals(constructorInstance.isDisposed(), true);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.getGridData(int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetGridDataIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsCombo_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.addFileFormats(Combo, TGFileFormat, Object)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddFileFormatsComboTGFileFormatObject_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.getFileFormat(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetFileFormatInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.getFileFormat(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetFileFormatInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.getFileFormat(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetFileFormatInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadProperties()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadProperties())*/
	public void testLoadProperties() {

		TGConverterDialog constructorInstance = new TGConverterDialog();

		// Only 1 path in this method, so just call it
		constructorInstance.loadProperties();
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadProperties(boolean))*/
	public void testLoadPropertiesBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[226]!isDisposed:TRUE
		 *[234]layout:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		// Try to pass in a variable to the load properties method
		constructorInstance.loadProperties(layout);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadProperties(boolean))*/
	public void testLoadPropertiesBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[226]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		// Try to pass in a variable to the load properties method
		constructorInstance.loadProperties(layout);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadProperties(boolean))*/
	public void testLoadPropertiesBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[226]!isDisposed:TRUE
		 *[234]layout:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.loadProperties(layout);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadIcons()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadIcons())*/
	public void testLoadIcons() {

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.loadIcons();
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadIcons(boolean))*/
	public void testLoadIconsBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[245]!isDisposed:TRUE
		 *[249]layout:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.loadIcons(layout);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadIcons(boolean))*/
	public void testLoadIconsBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[245]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.loadIcons(layout);
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterDialog#loadIcons(boolean))*/
	public void testLoadIconsBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[245]!isDisposed:TRUE
		 *[249]layout:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterDialog constructorInstance = new TGConverterDialog();

		constructorInstance.loadIcons(layout);
	}

}
