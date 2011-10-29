package org.herac.tuxguitar.app.Tests;

import java.awt.Component;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGScrollBar;

public class TGScrollBarTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.TGScrollBar()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#TGScrollBar())*/
	public void testTGScrollBar() {

		// Constructor under test
		TGScrollBar constructorInstance = new TGScrollBar();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.getComponent()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#getComponent())*/
	public void testGetComponent() {

		TGScrollBar constructorInstance = new TGScrollBar();

		Component methodReturn = constructorInstance.getComponent();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.getValue()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#getValue())*/
	public void testGetValue() {

		TGScrollBar constructorInstance = new TGScrollBar();

		int methodReturn = constructorInstance.getValue();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.setValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#setValue(int))*/
	public void testSetValueInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[68]this.value<0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int value = 0;

		TGScrollBar constructorInstance = new TGScrollBar();

		constructorInstance.setValue(value);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.setValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#setValue(int))*/
	public void testSetValueInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[68]this.value<0:FALSE
		 *[70]this.value>this.maximum:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int value = 0;

		TGScrollBar constructorInstance = new TGScrollBar();

		constructorInstance.setValue(value);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.setValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#setValue(int))*/
	public void testSetValueInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[68]this.value<0:FALSE
		 *[70]this.value>this.maximum:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int value = 0;

		TGScrollBar constructorInstance = new TGScrollBar();

		constructorInstance.setValue(value);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.getMaximum()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#getMaximum())*/
	public void testGetMaximum() {

		TGScrollBar constructorInstance = new TGScrollBar();

		int methodReturn = constructorInstance.getMaximum();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGScrollBar.setMaximum(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGScrollBar#setMaximum(int))*/
	public void testSetMaximumInt() {
		// Method under test arguments
		int maximum = 0;

		TGScrollBar constructorInstance = new TGScrollBar();

		constructorInstance.setMaximum(maximum);
		fail("Test method not implemented.");
	}

}
