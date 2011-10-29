package org.herac.tuxguitar.app.Tests;

import javax.swing.Icon;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.util.TGResourceUtils;

public class TGResourceUtilsTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.util.TGResourceUtils.loadIcon(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.TGResourceUtils#loadIcon(String))*/
	public void testLoadIconString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[12]resource!=null:TRUE
		 *[14]url!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String resource = null;

		Icon methodReturn = TGResourceUtils.loadIcon(resource);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.TGResourceUtils.loadIcon(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.TGResourceUtils#loadIcon(String))*/
	public void testLoadIconString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[12]resource!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String resource = null;

		Icon methodReturn = TGResourceUtils.loadIcon(resource);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.TGResourceUtils.loadIcon(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.TGResourceUtils#loadIcon(String))*/
	public void testLoadIconString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[12]resource!=null:'null'
		 ****************************************************************************/

		// Method under test arguments
		String resource = null;

		Icon methodReturn = TGResourceUtils.loadIcon(resource);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.TGResourceUtils.loadIcon(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.TGResourceUtils#loadIcon(String))*/
	public void testLoadIconString_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[12]resource!=null:TRUE
		 *[18]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		String resource = null;

		Icon methodReturn = TGResourceUtils.loadIcon(resource);
		fail("Path 4 assertion not implemented.");
	}

}
