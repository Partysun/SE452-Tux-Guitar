package org.herac.tuxguitar.app.Tests;

import java.awt.Font;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGFontImpl;

public class TGFontImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.TGFontImpl(Font)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#TGFontImpl(Font))*/
	public void testTGFontImplFont() {
		// Method under test arguments
		Font handle = null;

		// Constructor under test arguments// Constructor under test
		TGFontImpl constructorInstance = new TGFontImpl(handle);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.TGFontImpl(String, int, boolean, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#TGFontImpl(String,int,boolean,boolean))*/
	public void testTGFontImplStringIntBooleanBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]bold:TRUE
		 *[16]italic:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String name = null;
		int height = 0;
		boolean bold = true;
		boolean italic = true;

		// Constructor under test arguments// Constructor under test
		TGFontImpl constructorInstance = new TGFontImpl(name, height, bold,
				italic);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.TGFontImpl(String, int, boolean, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#TGFontImpl(String,int,boolean,boolean))*/
	public void testTGFontImplStringIntBooleanBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]bold:FALSE
		 *[16]italic:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String name = null;
		int height = 0;
		boolean bold = true;
		boolean italic = true;

		// Constructor under test arguments// Constructor under test
		TGFontImpl constructorInstance = new TGFontImpl(name, height, bold,
				italic);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.TGFontImpl(String, int, boolean, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#TGFontImpl(String,int,boolean,boolean))*/
	public void testTGFontImplStringIntBooleanBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]bold:TRUE
		 *[16]italic:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String name = null;
		int height = 0;
		boolean bold = true;
		boolean italic = true;

		// Constructor under test arguments// Constructor under test
		TGFontImpl constructorInstance = new TGFontImpl(name, height, bold,
				italic);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.getHandle()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#getHandle())*/
	public void testGetHandle() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		Font methodReturn = constructorInstance.getHandle();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#getName())*/
	public void testGetName() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		String methodReturn = constructorInstance.getName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#getHeight())*/
	public void testGetHeight() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.isBold()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#isBold())*/
	public void testIsBold() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		boolean methodReturn = constructorInstance.isBold();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.isItalic()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#isItalic())*/
	public void testIsItalic() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		boolean methodReturn = constructorInstance.isItalic();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#isDisposed())*/
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
		 *[40]this.handle==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#isDisposed())*/
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
		 *[40]this.handle==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGFontImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGFontImpl#dispose())*/
	public void testDispose() {

		// Constructor arguments
		Font handle = null;
		TGFontImpl constructorInstance = new TGFontImpl(handle);

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

}
