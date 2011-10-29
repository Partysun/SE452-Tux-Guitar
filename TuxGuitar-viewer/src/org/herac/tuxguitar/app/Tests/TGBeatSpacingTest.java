package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.control.TGBeatSpacing;
import org.herac.tuxguitar.graphics.control.TGLayout;

public class TGBeatSpacingTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatSpacing.TGBeatSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatSpacing#TGBeatSpacing(TGLayout))*/
	public void testTGBeatSpacingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor under test arguments// Constructor under test
		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#clear())*/
	public void testClear_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[22]i<this.spacing.length:TRUE
		 *[22]i<this.spacing.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGLayout layout = null;
		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		constructorInstance.clear();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#clear())*/
	public void testClear_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[22]i<this.spacing.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGLayout layout = null;
		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		constructorInstance.clear();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.setSize(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#setSize(int,int))*/
	public void testSetSizeIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[28]size>this.spacing[this.positions[this.flags-1][index]]:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;
		int size = 0;

		// Constructor arguments
		TGLayout layout = null;

		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		constructorInstance.setSize(index, size);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.setSize(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#setSize(int,int))*/
	public void testSetSizeIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[28]size>this.spacing[this.positions[this.flags-1][index]]:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;
		int size = 0;

		// Constructor arguments
		TGLayout layout = null;

		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		constructorInstance.setSize(index, size);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.getSize(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#getSize(int))*/
	public void testGetSizeInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGLayout layout = null;

		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		int methodReturn = constructorInstance.getSize(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.getSize()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#getSize())*/
	public void testGetSize_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[39]i<this.spacing.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGLayout layout = null;
		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		int methodReturn = constructorInstance.getSize();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.getSize()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#getSize())*/
	public void testGetSize_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[39]i<this.spacing.length:TRUE
		 *[39]i<this.spacing.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGLayout layout = null;
		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		int methodReturn = constructorInstance.getSize();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.getPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#getPosition(int))*/
	public void testGetPositionInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]i<this.positions[this.flags-1][index]:TRUE
		 *[47]i<this.positions[this.flags-1][index]:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGLayout layout = null;

		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		int methodReturn = constructorInstance.getPosition(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGSpacing.getPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGSpacing#getPosition(int))*/
	public void testGetPositionInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]i<this.positions[this.flags-1][index]:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGLayout layout = null;

		TGBeatSpacing constructorInstance = new TGBeatSpacing(layout);

		int methodReturn = constructorInstance.getPosition(index);
		fail("Path 2 assertion not implemented.");
	}

}
