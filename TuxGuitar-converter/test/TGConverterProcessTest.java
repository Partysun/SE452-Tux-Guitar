


import org.herac.tuxguitar.app.tools.custom.converter.TGConverterFormat;
import org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess;

import junit.framework.TestCase;

public class TGConverterProcessTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.start(String, String, TGConverterFormat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#start(String,String,TGConverterFormat))*/
	public void testStartStringStringTGConverterFormat() {
		// Method under test arguments
		String initFolder = null;
		String destFolder = null;
		TGConverterFormat format = null;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.start(initFolder, destFolder, format);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.showProcess()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testShowProcess() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.getButtonsData()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetButtonsData() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#isDisposed())*/
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
		 *[121]this.dialog==null:TRUE
		 *[121]this.dialog.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#isDisposed())*/
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
		 *[121]this.dialog==null:FALSE
		 *[121]this.dialog.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#isDisposed())*/
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
		 *[121]this.dialog==null:TRUE
		 *[121]this.dialog.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadProperties()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadProperties())*/
	public void testLoadProperties() {

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadProperties();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadProperties(boolean))*/
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
		 *[129]!isDisposed:TRUE
		 *[133]layout:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadProperties(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadProperties(boolean))*/
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
		 *[129]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadProperties(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadProperties(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadProperties(boolean))*/
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
		 *[129]!isDisposed:TRUE
		 *[133]layout:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadProperties(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadIcons()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadIcons())*/
	public void testLoadIcons() {

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadIcons();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadIcons(boolean))*/
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
		 *[144]!isDisposed:TRUE
		 *[146]layout:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadIcons(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadIcons(boolean))*/
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
		 *[144]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadIcons(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.loadIcons(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#loadIcons(boolean))*/
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
		 *[144]!isDisposed:TRUE
		 *[146]layout:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean layout = true;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.loadIcons(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileProcess(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileProcess(String))*/
	public void testNotifyFileProcessString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[157]!isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileProcess(filename);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileProcess(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileProcess(String))*/
	public void testNotifyFileProcessString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[157]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileProcess(filename);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileProcess(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileProcess(String))*/
	public void testNotifyFileProcessString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[157]!isDisposed:TRUE
		 *[167]Throwable e caught
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileProcess(filename);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileResult(String, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileResult(String,int))*/
	public void testNotifyFileResultStringInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[174]!isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;
		int result = 0;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileResult(filename, result);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileResult(String, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileResult(String,int))*/
	public void testNotifyFileResultStringInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[174]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;
		int result = 0;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileResult(filename, result);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFileResult(String, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFileResult(String,int))*/
	public void testNotifyFileResultStringInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[174]!isDisposed:TRUE
		 *[184]Throwable e caught
		 ****************************************************************************/

		// Method under test arguments
		String filename = null;
		int result = 0;

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFileResult(filename, result);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyStart())*/
	public void testNotifyStart_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[191]!isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyStart();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyStart())*/
	public void testNotifyStart_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[191]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyStart();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyStart())*/
	public void testNotifyStart_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[191]!isDisposed:TRUE
		 *[203]Throwable e caught
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyStart();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFinish()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFinish())*/
	public void testNotifyFinish_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[210]!isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFinish();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFinish()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFinish())*/
	public void testNotifyFinish_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[210]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFinish();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.notifyFinish()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess#notifyFinish())*/
	public void testNotifyFinish_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[210]!isDisposed:TRUE
		 *[222]Throwable e caught
		 ****************************************************************************/

		// Method under test arguments

		TGConverterProcess constructorInstance = new TGConverterProcess();

		constructorInstance.notifyFinish();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.converter.TGConverterProcess.appendLogMessage(int, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAppendLogMessageIntString_Path9() {
	}

}
