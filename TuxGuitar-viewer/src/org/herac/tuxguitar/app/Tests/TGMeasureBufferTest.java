package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGImage;
import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGMeasureBuffer;

public class TGMeasureBufferTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.TGMeasureBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#TGMeasureBuffer())*/
	public void testTGMeasureBuffer() {

		// Constructor under test
		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.createBuffer(TGPainter, int, int, TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#createBuffer(TGPainter,int,int,TGColor))*/
	public void testCreateBufferTGPainterIntIntTGColor() {
		// Method under test arguments
		TGPainter painter = null;
		int width = 0;
		int height = 0;
		TGColor background = null;

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.createBuffer(painter, width, height, background);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposeBuffer())*/
	public void testDisposeBuffer_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]this.buffer!=null:TRUE
		 *[30]!this.buffer.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposeBuffer();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposeBuffer())*/
	public void testDisposeBuffer_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]this.buffer!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposeBuffer();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposeBuffer())*/
	public void testDisposeBuffer_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]this.buffer!=null:TRUE
		 *[30]!this.buffer.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposeBuffer();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.fillBuffer(TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFillBufferTGColor() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.paintBuffer(TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#paintBuffer(TGPainter,int,int,int))*/
	public void testPaintBufferTGPainterIntIntInt() {
		// Method under test arguments
		TGPainter painter = null;
		int x = 0;
		int y = 0;
		int srcY = 0;

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.paintBuffer(painter, x, y, srcY);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.createPainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#createPainter())*/
	public void testCreatePainter() {

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.createPainter();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposePainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposePainter())*/
	public void testDisposePainter_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]this.painter!=null:TRUE
		 *[53]!this.painter.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposePainter();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposePainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposePainter())*/
	public void testDisposePainter_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]this.painter!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposePainter();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.disposePainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#disposePainter())*/
	public void testDisposePainter_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]this.painter!=null:TRUE
		 *[53]!this.painter.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.disposePainter();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.getPainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#getPainter())*/
	public void testGetPainter_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]this.painter==null:TRUE
		 *[60]this.painter.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		TGPainter methodReturn = constructorInstance.getPainter();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.getPainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#getPainter())*/
	public void testGetPainter_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]this.painter==null:FALSE
		 *[60]this.painter.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		TGPainter methodReturn = constructorInstance.getPainter();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.getPainter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#getPainter())*/
	public void testGetPainter_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]this.painter==null:TRUE
		 *[60]this.painter.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		TGPainter methodReturn = constructorInstance.getPainter();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.getImage()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#getImage())*/
	public void testGetImage() {

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		TGImage methodReturn = constructorInstance.getImage();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#dispose())*/
	public void testDispose() {

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#isDisposed())*/
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
		 *[76]this.buffer==null:TRUE
		 *[76]this.buffer.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#isDisposed())*/
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
		 *[76]this.buffer==null:FALSE
		 *[76]this.buffer.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureBuffer.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureBuffer#isDisposed())*/
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
		 *[76]this.buffer==null:TRUE
		 *[76]this.buffer.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGMeasureBuffer constructorInstance = new TGMeasureBuffer();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 3 assertion not implemented.");
	}

}
