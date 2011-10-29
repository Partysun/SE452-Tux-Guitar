package org.herac.tuxguitar.app.Tests;

import java.awt.Component;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.toolbar.TGToolBar;

public class TGToolBarTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.init()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#init())*/
	public void testInit() {

		TGToolBar constructorInstance = new TGToolBar();

		constructorInstance.init();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.getPanel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#getPanel())*/
	public void testGetPanel_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[44]this.buttons==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGToolBar constructorInstance = new TGToolBar();

		Component methodReturn = constructorInstance.getPanel();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.getPanel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#getPanel())*/
	public void testGetPanel_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[44]this.buttons==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGToolBar constructorInstance = new TGToolBar();

		Component methodReturn = constructorInstance.getPanel();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.updateItems()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#updateItems())*/
	public void testUpdateItems_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.buttonTrack.getText:==null:FALSE
		 *[66]!this.buttonTrack.getText:.equalstablature.getCaret:.getTrack:.getName::TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGToolBar constructorInstance = new TGToolBar();

		constructorInstance.updateItems();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.updateItems()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#updateItems())*/
	public void testUpdateItems_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.buttonTrack.getText:==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGToolBar constructorInstance = new TGToolBar();

		constructorInstance.updateItems();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.updateItems()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.toolbar.TGToolBar#updateItems())*/
	public void testUpdateItems_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[66]this.buttonTrack.getText:==null:FALSE
		 *[66]!this.buttonTrack.getText:.equalstablature.getCaret:.getTrack:.getName::FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGToolBar constructorInstance = new TGToolBar();

		constructorInstance.updateItems();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.getImageButton(AbstractButton, String, String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetImageButtonAbstractButtonStringString() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.toolbar.TGToolBar.getLinkButton(AbstractButton)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetLinkButtonAbstractButton() {
	}

}
