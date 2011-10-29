package org.herac.tuxguitar.app.Tests;

import java.awt.Image;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGImageImpl;
import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGPainter;

public class TGImageImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.TGImageImpl(Image)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#TGImageImpl(Image))*/
	public void testTGImageImplImage() {
		// Method under test arguments
		Image handle = null;

		// Constructor under test arguments// Constructor under test
		TGImageImpl constructorInstance = new TGImageImpl(handle);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.TGImageImpl(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#TGImageImpl(int,int))*/
	public void testTGImageImplIntInt() {
		// Method under test arguments
		int width = 0;
		int height = 0;

		// Constructor under test arguments// Constructor under test
		TGImageImpl constructorInstance = new TGImageImpl(width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.createPainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#createPainter())*/
	public void testCreatePainter() {

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		TGPainter methodReturn = constructorInstance.createPainter();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.getWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#getWidth())*/
	public void testGetWidth() {

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		int methodReturn = constructorInstance.getWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#getHeight())*/
	public void testGetHeight() {

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.getHandle()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#getHandle())*/
	public void testGetHandle() {

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		Image methodReturn = constructorInstance.getHandle();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#isDisposed())*/
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
		 *[43]this.handle==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#isDisposed())*/
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
		 *[43]this.handle==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#dispose())*/
	public void testDispose() {

		// Constructor arguments
		Image handle = null;
		TGImageImpl constructorInstance = new TGImageImpl(handle);

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGImageImpl.applyTransparency(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGImageImpl#applyTransparency(TGColor))*/
	public void testApplyTransparencyTGColor() {
		// Method under test arguments
		TGColor background = null;

		// Constructor arguments
		Image handle = null;

		TGImageImpl constructorInstance = new TGImageImpl(handle);

		constructorInstance.applyTransparency(background);
		fail("Test method not implemented.");
	}

}
