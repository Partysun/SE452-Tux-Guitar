package org.herac.tuxguitar.app.Tests;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGPainterImpl;
import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGFont;
import org.herac.tuxguitar.graphics.TGImage;

public class TGPainterImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.TGPainterImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#TGPainterImpl())*/
	public void testTGPainterImpl() {

		// Constructor under test
		TGPainterImpl constructorInstance = new TGPainterImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.TGPainterImpl(Graphics2D)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#TGPainterImpl(Graphics2D))*/
	public void testTGPainterImplGraphics2D() {
		// Method under test arguments
		Graphics2D gc = null;

		// Constructor under test arguments// Constructor under test
		TGPainterImpl constructorInstance = new TGPainterImpl(gc);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.TGPainterImpl(Image)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#TGPainterImpl(Image))*/
	public void testTGPainterImplImage() {
		// Method under test arguments
		Image image = null;

		// Constructor under test arguments// Constructor under test
		TGPainterImpl constructorInstance = new TGPainterImpl(image);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.init(Graphics2D)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#init(Graphics2D))*/
	public void testInitGraphics2D_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[52]this.gc!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Graphics2D gc = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.init(gc);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.init(Graphics2D)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#init(Graphics2D))*/
	public void testInitGraphics2D_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[52]this.gc!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Graphics2D gc = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.init(gc);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.initPath(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#initPath(int))*/
	public void testInitPathInt() {
		// Method under test arguments
		int style = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.initPath(style);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.initPath()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#initPath())*/
	public void testInitPath() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.initPath();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.closePath()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#closePath())*/
	public void testClosePath_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]this.pathEmpty:TRUE
		 *[76]this.style&PATH_DRAW:!=0:TRUE
		 *[81]this.style&PATH_FILL:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.closePath();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.closePath()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#closePath())*/
	public void testClosePath_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]this.pathEmpty:FALSE
		 *[76]this.style&PATH_DRAW:!=0:TRUE
		 *[81]this.style&PATH_FILL:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.closePath();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.closePath()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#closePath())*/
	public void testClosePath_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]this.pathEmpty:TRUE
		 *[76]this.style&PATH_DRAW:!=0:FALSE
		 *[81]this.style&PATH_FILL:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.closePath();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.closePath()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#closePath())*/
	public void testClosePath_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]this.pathEmpty:TRUE
		 *[76]this.style&PATH_DRAW:!=0:TRUE
		 *[81]this.style&PATH_FILL:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.closePath();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getGC()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getGC())*/
	public void testGetGC() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		Graphics2D methodReturn = constructorInstance.getGC();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#dispose())*/
	public void testDispose() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setFont(Font)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setFont(Font))*/
	public void testSetFontFont() {
		// Method under test arguments
		Font arg0 = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setFont(arg0);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setFont(TGFont))*/
	public void testSetFontTGFont() {
		// Method under test arguments
		TGFont font = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setFont(font);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setBackground(Color)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setBackground(Color))*/
	public void testSetBackgroundColor() {
		// Method under test arguments
		Color background = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setBackground(background);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setBackground(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setBackground(TGColor))*/
	public void testSetBackgroundTGColor() {
		// Method under test arguments
		TGColor color = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setBackground(color);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setForeground(Color)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setForeground(Color))*/
	public void testSetForegroundColor() {
		// Method under test arguments
		Color foreground = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setForeground(foreground);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setForeground(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setForeground(TGColor))*/
	public void testSetForegroundTGColor() {
		// Method under test arguments
		TGColor color = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setForeground(color);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setLineWidth(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setLineWidth(int))*/
	public void testSetLineWidthInt() {
		// Method under test arguments
		int lineWidth = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setLineWidth(lineWidth);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setLineStyleSolid()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setLineStyleSolid())*/
	public void testSetLineStyleSolid() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setLineStyleSolid();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setLineStyleDot()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setLineStyleDot())*/
	public void testSetLineStyleDot() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setLineStyleDot();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setLineStyleDash()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setLineStyleDash())*/
	public void testSetLineStyleDash() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setLineStyleDash();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setLineStyleDashDot()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setLineStyleDashDot())*/
	public void testSetLineStyleDashDot() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setLineStyleDashDot();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAlpha(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAlpha(int))*/
	public void testSetAlphaInt() {
		// Method under test arguments
		int alpha = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAlpha(alpha);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAntialias(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAntialias(boolean))*/
	public void testSetAntialiasBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[157]enabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean enabled = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAntialias(enabled);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAntialias(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAntialias(boolean))*/
	public void testSetAntialiasBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[157]enabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean enabled = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAntialias(enabled);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAdvanced(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAdvanced(boolean))*/
	public void testSetAdvancedBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[161]advanced:TRUE
		 *[162]advanced:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean advanced = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAdvanced(advanced);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAdvanced(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAdvanced(boolean))*/
	public void testSetAdvancedBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[161]advanced:FALSE
		 *[162]advanced:TRUE
		 ****************************************************************************/

		// Method under test arguments
		boolean advanced = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAdvanced(advanced);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.setAdvanced(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#setAdvanced(boolean))*/
	public void testSetAdvancedBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[161]advanced:TRUE
		 *[162]advanced:FALSE
		 ****************************************************************************/

		// Method under test arguments
		boolean advanced = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.setAdvanced(advanced);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getStringExtent(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getStringExtent(String))*/
	public void testGetStringExtentString() {
		// Method under test arguments
		String string = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		Point methodReturn = constructorInstance.getStringExtent(string);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawString(String, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawString(String,int,int))*/
	public void testDrawStringStringIntInt() {
		// Method under test arguments
		String string = null;
		int x = 0;
		int y = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawString(string, x, y);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawString(String, int, int, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawString(String,int,int,boolean))*/
	public void testDrawStringStringIntIntBoolean() {
		// Method under test arguments
		String string = null;
		int x = 0;
		int y = 0;
		boolean isTransparent = true;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawString(string, x, y, isTransparent);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawImage(Image, int, int, int, int, int, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawImage(Image,int,int,int,int,int,int,int,int))*/
	public void testDrawImageImageIntIntIntIntIntIntIntInt() {
		// Method under test arguments
		Image image = null;
		int srcX = 0;
		int srcY = 0;
		int srcWidth = 0;
		int srcHeight = 0;
		int destX = 0;
		int destY = 0;
		int destWidth = 0;
		int destHeight = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawImage(image, srcX, srcY, srcWidth, srcHeight,
				destX, destY, destWidth, destHeight);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawImage(Image, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawImage(Image,int,int))*/
	public void testDrawImageImageIntInt() {
		// Method under test arguments
		Image image = null;
		int x = 0;
		int y = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawImage(image, x, y);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawImage(TGImage, int, int, int, int, int, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawImage(TGImage,int,int,int,int,int,int,int,int))*/
	public void testDrawImageTGImageIntIntIntIntIntIntIntInt() {
		// Method under test arguments
		TGImage image = null;
		int srcX = 0;
		int srcY = 0;
		int srcWidth = 0;
		int srcHeight = 0;
		int destX = 0;
		int destY = 0;
		int destWidth = 0;
		int destHeight = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawImage(image, srcX, srcY, srcWidth, srcHeight,
				destX, destY, destWidth, destHeight);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawImage(TGImage, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawImage(TGImage,int,int))*/
	public void testDrawImageTGImageIntInt() {
		// Method under test arguments
		TGImage image = null;
		int x = 0;
		int y = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawImage(image, x, y);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.cubicTo(float, float, float, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#cubicTo(float,float,float,float,float,float))*/
	public void testCubicToFloatFloatFloatFloatFloatFloat() {
		// Method under test arguments
		float arg0 = 0f;
		float arg1 = 0f;
		float arg2 = 0f;
		float arg3 = 0f;
		float arg4 = 0f;
		float arg5 = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.cubicTo(arg0, arg1, arg2, arg3, arg4, arg5);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.lineTo(float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#lineTo(float,float))*/
	public void testLineToFloatFloat() {
		// Method under test arguments
		float arg0 = 0f;
		float arg1 = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.lineTo(arg0, arg1);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.moveTo(float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#moveTo(float,float))*/
	public void testMoveToFloatFloat() {
		// Method under test arguments
		float arg0 = 0f;
		float arg1 = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.moveTo(arg0, arg1);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.addArc(float, float, float, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#addArc(float,float,float,float,float,float))*/
	public void testAddArcFloatFloatFloatFloatFloatFloat() {
		// Method under test arguments
		float x = 0f;
		float y = 0f;
		float width = 0f;
		float height = 0f;
		float startAngle = 0f;
		float arcAngle = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.addArc(x, y, width, height, startAngle, arcAngle);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.addOval(float, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#addOval(float,float,float,float))*/
	public void testAddOvalFloatFloatFloatFloat() {
		// Method under test arguments
		float x = 0f;
		float y = 0f;
		float width = 0f;
		float height = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.addOval(x, y, width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.addRectangle(float, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#addRectangle(float,float,float,float))*/
	public void testAddRectangleFloatFloatFloatFloat() {
		// Method under test arguments
		float x = 0f;
		float y = 0f;
		float width = 0f;
		float height = 0f;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.addRectangle(x, y, width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.addString(String, float, float, TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#addString(String,float,float,TGFont))*/
	public void testAddStringStringFloatFloatTGFont() {
		// Method under test arguments
		String arg0 = null;
		float arg1 = 0f;
		float arg2 = 0f;
		TGFont arg3 = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.addString(arg0, arg1, arg2, arg3);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.copyArea(TGImage, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#copyArea(TGImage,int,int))*/
	public void testCopyAreaTGImageIntInt() {
		// Method under test arguments
		TGImage image = null;
		int x = 0;
		int y = 0;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.copyArea(image, x, y);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.drawPolygon(int[])'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#drawPolygon(int[]))*/
	public void testDrawPolygonIntArray() {
		// Method under test arguments
		int[] arg0 = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.drawPolygon(arg0);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.fillPolygon(int[])'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#fillPolygon(int[]))*/
	public void testFillPolygonIntArray() {
		// Method under test arguments
		int[] arg0 = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		constructorInstance.fillPolygon(arg0);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getFontSize()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getFontSize())*/
	public void testGetFontSize() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		int methodReturn = constructorInstance.getFontSize();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getFMHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getFMHeight())*/
	public void testGetFMHeight() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		int methodReturn = constructorInstance.getFMHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getFMAscent()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getFMAscent())*/
	public void testGetFMAscent() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		int methodReturn = constructorInstance.getFMAscent();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getFMDescent()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getFMDescent())*/
	public void testGetFMDescent() {

		TGPainterImpl constructorInstance = new TGPainterImpl();

		int methodReturn = constructorInstance.getFMDescent();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.getFMWidth(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#getFMWidth(String))*/
	public void testGetFMWidthString() {
		// Method under test arguments
		String text = null;

		TGPainterImpl constructorInstance = new TGPainterImpl();

		int methodReturn = constructorInstance.getFMWidth(text);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#isDisposed())*/
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
		 *[275]this.gc==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGPainterImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGPainterImpl#isDisposed())*/
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
		 *[275]this.gc==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGPainterImpl constructorInstance = new TGPainterImpl();

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

}
