package org.herac.tuxguitar.app.Tests;

import java.awt.Color;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGColorImpl;

public class TGColorImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.TGColorImpl(Color)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#TGColorImpl(Color))*/
	public void testTGColorImplColor() {
		// Method under test arguments
		Color handle = null;

		// Constructor under test arguments// Constructor under test
		TGColorImpl constructorInstance = new TGColorImpl(handle);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.TGColorImpl(int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#TGColorImpl(int,int,int))*/
	public void testTGColorImplIntIntInt() {
		// Method under test arguments
		int red = 0;
		int green = 0;
		int blue = 0;

		// Constructor under test arguments// Constructor under test
		TGColorImpl constructorInstance = new TGColorImpl(red, green, blue);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.getHandle()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#getHandle())*/
	public void testGetHandle() {

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		Color methodReturn = constructorInstance.getHandle();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.getRed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#getRed())*/
	public void testGetRed() {

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		int methodReturn = constructorInstance.getRed();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.getGreen()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#getGreen())*/
	public void testGetGreen() {

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		int methodReturn = constructorInstance.getGreen();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.getBlue()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#getBlue())*/
	public void testGetBlue() {

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		int methodReturn = constructorInstance.getBlue();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#isDisposed())*/
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
		 *[36]this.handle==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#isDisposed())*/
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
		 *[36]this.handle==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGColorImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGColorImpl#dispose())*/
	public void testDispose() {

		// Constructor arguments
		Color handle = null;
		TGColorImpl constructorInstance = new TGColorImpl(handle);

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

}
