package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGFont;
import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGChordImpl;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGChord;

public class TGChordImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.addFretValue(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#addFretValue(int,int))*/
	public void testAddFretValueIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[423]!isDisposed:TRUE
		 *[423]this.getFretValuestring:!=fret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;
		int fret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.addFretValue(string, fret);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.addFretValue(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#addFretValue(int,int))*/
	public void testAddFretValueIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[423]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;
		int fret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.addFretValue(string, fret);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.addFretValue(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#addFretValue(int,int))*/
	public void testAddFretValueIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[423]!isDisposed:TRUE
		 *[423]this.getFretValuestring:!=fret:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;
		int fret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.addFretValue(string, fret);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFret(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFret(int))*/
	public void testSetFirstFretInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[430]!isDisposed:TRUE
		 *[430]this.getFirstFret:!=firstFret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int firstFret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFret(firstFret);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFret(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFret(int))*/
	public void testSetFirstFretInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[430]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int firstFret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFret(firstFret);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFret(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFret(int))*/
	public void testSetFirstFretInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[430]!isDisposed:TRUE
		 *[430]this.getFirstFret:!=firstFret:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int firstFret = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFret(firstFret);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.TGChordImpl(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#TGChordImpl(int))*/
	public void testTGChordImplInt() {
		// Method under test arguments
		int length = 0;

		// Constructor under test arguments// Constructor under test
		TGChordImpl constructorInstance = new TGChordImpl(length);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isEditing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#isEditing())*/
	public void testIsEditing() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		boolean methodReturn = constructorInstance.isEditing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setEditing(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setEditing(boolean))*/
	public void testSetEditingBoolean() {
		// Method under test arguments
		boolean editing = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setEditing(editing);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setPosX(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setPosX(int))*/
	public void testSetPosXInt() {
		// Method under test arguments
		int posX = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setPosX(posX);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setPosY(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setPosY(int))*/
	public void testSetPosYInt() {
		// Method under test arguments
		int posY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setPosY(posY);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getPosY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getPosY())*/
	public void testGetPosY() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getPosY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getWidth())*/
	public void testGetWidth() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getHeight())*/
	public void testGetHeight() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setStyle(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setStyle(int))*/
	public void testSetStyleInt() {
		// Method under test arguments
		int style = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setStyle(style);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonic(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonic(int))*/
	public void testSetTonicInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]!isDisposed:TRUE
		 *[87]this.tonic!=tonic:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int tonic = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonic(tonic);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonic(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonic(int))*/
	public void testSetTonicInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int tonic = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonic(tonic);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonic(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonic(int))*/
	public void testSetTonicInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]!isDisposed:TRUE
		 *[87]this.tonic!=tonic:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int tonic = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonic(tonic);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getForegroundColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getForegroundColor())*/
	public void testGetForegroundColor() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGColor methodReturn = constructorInstance.getForegroundColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setForegroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setForegroundColor(TGColor))*/
	public void testSetForegroundColorTGColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[98]!isDisposed:TRUE
		 *[98]!isSameColorthis.foregroundColor,foregroundColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor foregroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setForegroundColor(foregroundColor);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setForegroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setForegroundColor(TGColor))*/
	public void testSetForegroundColorTGColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[98]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor foregroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setForegroundColor(foregroundColor);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setForegroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setForegroundColor(TGColor))*/
	public void testSetForegroundColorTGColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[98]!isDisposed:TRUE
		 *[98]!isSameColorthis.foregroundColor,foregroundColor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor foregroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setForegroundColor(foregroundColor);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setForegroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setForegroundColor(TGColor))*/
	public void testSetForegroundColorTGColor_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[98]!isDisposed:TRUE
		 *[98]!isSameColorthis.foregroundColor,foregroundColor:TRUE
		 *[98]!isSameColorthis.foregroundColor,foregroundColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor foregroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setForegroundColor(foregroundColor);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getBackgroundColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getBackgroundColor())*/
	public void testGetBackgroundColor() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGColor methodReturn = constructorInstance.getBackgroundColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setBackgroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setBackgroundColor(TGColor))*/
	public void testSetBackgroundColorTGColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]!isDisposed:TRUE
		 *[109]!isSameColorthis.backgroundColor,backgroundColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor backgroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setBackgroundColor(backgroundColor);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setBackgroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setBackgroundColor(TGColor))*/
	public void testSetBackgroundColorTGColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor backgroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setBackgroundColor(backgroundColor);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setBackgroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setBackgroundColor(TGColor))*/
	public void testSetBackgroundColorTGColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]!isDisposed:TRUE
		 *[109]!isSameColorthis.backgroundColor,backgroundColor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor backgroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setBackgroundColor(backgroundColor);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setBackgroundColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setBackgroundColor(TGColor))*/
	public void testSetBackgroundColorTGColor_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]!isDisposed:TRUE
		 *[109]!isSameColorthis.backgroundColor,backgroundColor:TRUE
		 *[109]!isSameColorthis.backgroundColor,backgroundColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor backgroundColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setBackgroundColor(backgroundColor);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getColor())*/
	public void testGetColor() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGColor methodReturn = constructorInstance.getColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setColor(TGColor))*/
	public void testSetColorTGColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[120]!isDisposed:TRUE
		 *[120]!isSameColorthis.color,color:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor color = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setColor(color);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setColor(TGColor))*/
	public void testSetColorTGColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[120]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor color = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setColor(color);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setColor(TGColor))*/
	public void testSetColorTGColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[120]!isDisposed:TRUE
		 *[120]!isSameColorthis.color,color:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor color = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setColor(color);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setColor(TGColor))*/
	public void testSetColorTGColor_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[120]!isDisposed:TRUE
		 *[120]!isSameColorthis.color,color:TRUE
		 *[120]!isSameColorthis.color,color:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor color = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setColor(color);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getNoteColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getNoteColor())*/
	public void testGetNoteColor() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGColor methodReturn = constructorInstance.getNoteColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteColor(TGColor))*/
	public void testSetNoteColorTGColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[131]!isDisposed:TRUE
		 *[131]!isSameColorthis.noteColor,noteColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor noteColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteColor(noteColor);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteColor(TGColor))*/
	public void testSetNoteColorTGColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[131]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor noteColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteColor(noteColor);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteColor(TGColor))*/
	public void testSetNoteColorTGColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[131]!isDisposed:TRUE
		 *[131]!isSameColorthis.noteColor,noteColor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor noteColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteColor(noteColor);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteColor(TGColor))*/
	public void testSetNoteColorTGColor_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[131]!isDisposed:TRUE
		 *[131]!isSameColorthis.noteColor,noteColor:TRUE
		 *[131]!isSameColorthis.noteColor,noteColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor noteColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteColor(noteColor);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getTonicColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getTonicColor())*/
	public void testGetTonicColor() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGColor methodReturn = constructorInstance.getTonicColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonicColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonicColor(TGColor))*/
	public void testSetTonicColorTGColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]!isDisposed:TRUE
		 *[142]!isSameColorthis.tonicColor,tonicColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor tonicColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonicColor(tonicColor);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonicColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonicColor(TGColor))*/
	public void testSetTonicColorTGColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor tonicColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonicColor(tonicColor);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonicColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonicColor(TGColor))*/
	public void testSetTonicColorTGColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]!isDisposed:TRUE
		 *[142]!isSameColorthis.tonicColor,tonicColor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGColor tonicColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonicColor(tonicColor);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setTonicColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setTonicColor(TGColor))*/
	public void testSetTonicColorTGColor_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]!isDisposed:TRUE
		 *[142]!isSameColorthis.tonicColor,tonicColor:TRUE
		 *[142]!isSameColorthis.tonicColor,tonicColor:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGColor tonicColor = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setTonicColor(tonicColor);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getFirstFretSpacing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getFirstFretSpacing())*/
	public void testGetFirstFretSpacing() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFirstFretSpacing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretSpacing(int))*/
	public void testSetFirstFretSpacingInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[153]!isDisposed:TRUE
		 *[153]this.firstFretSpacing!=firstFretSpacing:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int firstFretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretSpacing(firstFretSpacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretSpacing(int))*/
	public void testSetFirstFretSpacingInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[153]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int firstFretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretSpacing(firstFretSpacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretSpacing(int))*/
	public void testSetFirstFretSpacingInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[153]!isDisposed:TRUE
		 *[153]this.firstFretSpacing!=firstFretSpacing:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int firstFretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretSpacing(firstFretSpacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getFretSpacing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getFretSpacing())*/
	public void testGetFretSpacing() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFretSpacing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFretSpacing(int))*/
	public void testSetFretSpacingInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]!isDisposed:TRUE
		 *[164]this.fretSpacing!=fretSpacing:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int fretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFretSpacing(fretSpacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFretSpacing(int))*/
	public void testSetFretSpacingInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int fretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFretSpacing(fretSpacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFretSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFretSpacing(int))*/
	public void testSetFretSpacingInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[164]!isDisposed:TRUE
		 *[164]this.fretSpacing!=fretSpacing:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int fretSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFretSpacing(fretSpacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getStringSpacing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getStringSpacing())*/
	public void testGetStringSpacing() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getStringSpacing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setStringSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setStringSpacing(int))*/
	public void testSetStringSpacingInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]!isDisposed:TRUE
		 *[175]this.stringSpacing!=stringSpacing:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int stringSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setStringSpacing(stringSpacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setStringSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setStringSpacing(int))*/
	public void testSetStringSpacingInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int stringSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setStringSpacing(stringSpacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setStringSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setStringSpacing(int))*/
	public void testSetStringSpacingInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]!isDisposed:TRUE
		 *[175]this.stringSpacing!=stringSpacing:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int stringSpacing = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setStringSpacing(stringSpacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getNoteSize()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getNoteSize())*/
	public void testGetNoteSize() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getNoteSize();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteSize(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteSize(int))*/
	public void testSetNoteSizeInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[186]!isDisposed:TRUE
		 *[186]this.noteSize!=noteSize:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteSize = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteSize(noteSize);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteSize(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteSize(int))*/
	public void testSetNoteSizeInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[186]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteSize = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteSize(noteSize);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setNoteSize(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setNoteSize(int))*/
	public void testSetNoteSizeInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[186]!isDisposed:TRUE
		 *[186]this.noteSize!=noteSize:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteSize = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setNoteSize(noteSize);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getFont()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getFont())*/
	public void testGetFont() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGFont methodReturn = constructorInstance.getFont();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFont(TGFont))*/
	public void testSetFontTGFont_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]!isDisposed:TRUE
		 *[197]!isSameFontthis.font,font:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFont font = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFont(font);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFont(TGFont))*/
	public void testSetFontTGFont_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFont font = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFont(font);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFont(TGFont))*/
	public void testSetFontTGFont_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]!isDisposed:TRUE
		 *[197]!isSameFontthis.font,font:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFont font = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFont(font);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFont(TGFont))*/
	public void testSetFontTGFont_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]!isDisposed:TRUE
		 *[197]!isSameFontthis.font,font:TRUE
		 *[197]!isSameFontthis.font,font:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFont font = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFont(font);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getFirstFretFont()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getFirstFretFont())*/
	public void testGetFirstFretFont() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGFont methodReturn = constructorInstance.getFirstFretFont();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretFont(TGFont))*/
	public void testSetFirstFretFontTGFont_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[208]!isDisposed:TRUE
		 *[208]!isSameFontthis.firstFretFont,firstFretFont:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFont firstFretFont = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretFont(firstFretFont);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretFont(TGFont))*/
	public void testSetFirstFretFontTGFont_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[208]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFont firstFretFont = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretFont(firstFretFont);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretFont(TGFont))*/
	public void testSetFirstFretFontTGFont_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[208]!isDisposed:TRUE
		 *[208]!isSameFontthis.firstFretFont,firstFretFont:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFont firstFretFont = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretFont(firstFretFont);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.setFirstFretFont(TGFont)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#setFirstFretFont(TGFont))*/
	public void testSetFirstFretFontTGFont_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[208]!isDisposed:TRUE
		 *[208]!isSameFontthis.firstFretFont,firstFretFont:TRUE
		 *[208]!isSameFontthis.firstFretFont,firstFretFont:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFont firstFretFont = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setFirstFretFont(firstFretFont);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt() {
		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[226]this.diagram!=null:TRUE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[232]getName:!=null:TRUE
		 *[232]getName:.length:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:FALSE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[232]getName:!=null:TRUE
		 *[232]getName:.length:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[226]this.diagram!=null:FALSE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[232]getName:!=null:TRUE
		 *[232]getName:.length:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[226]this.diagram!=null:TRUE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[226]this.diagram!=null:TRUE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[232]getName:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paint(TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#paint(TGPainter,int,int))*/
	public void testPaintTGPainterIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[225]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[226]this.diagram!=null:TRUE
		 *[232]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[232]getName:!=null:TRUE
		 *[232]getName:.length:>0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.paint(painter, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.update(TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#update(TGPainter,boolean))*/
	public void testUpdateTGPainterBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[243]getFirstFret:<=0:TRUE
		 *[246]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[251]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[252]makeBuffer:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		boolean makeBuffer = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.update(painter, makeBuffer);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.update(TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#update(TGPainter,boolean))*/
	public void testUpdateTGPainterBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[243]getFirstFret:<=0:FALSE
		 *[246]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[251]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[252]makeBuffer:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		boolean makeBuffer = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.update(painter, makeBuffer);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.update(TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#update(TGPainter,boolean))*/
	public void testUpdateTGPainterBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[243]getFirstFret:<=0:TRUE
		 *[246]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:FALSE
		 *[251]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[252]makeBuffer:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		boolean makeBuffer = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.update(painter, makeBuffer);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.update(TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#update(TGPainter,boolean))*/
	public void testUpdateTGPainterBoolean_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[243]getFirstFret:<=0:TRUE
		 *[246]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[251]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		boolean makeBuffer = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.update(painter, makeBuffer);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.update(TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#update(TGPainter,boolean))*/
	public void testUpdateTGPainterBoolean_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[243]getFirstFret:<=0:TRUE
		 *[246]this.style&TGLayout.DISPLAY_CHORD_NAME:!=0:TRUE
		 *[251]this.style&TGLayout.DISPLAY_CHORD_DIAGRAM:!=0:TRUE
		 *[252]makeBuffer:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		boolean makeBuffer = true;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.update(painter, makeBuffer);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateName(TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNameTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateName(TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNameTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateName(TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNameTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateName(TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNameTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateDiagram(TGResourceFactory)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDiagramTGResourceFactory_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateDiagram(TGResourceFactory)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDiagramTGResourceFactory_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateDiagram(TGResourceFactory)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDiagramTGResourceFactory_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.updateDiagram(TGResourceFactory)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDiagramTGResourceFactory_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.paintDiagram(TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDiagramTGPainterIntInt_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:FALSE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:TRUE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:TRUE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:FALSE
		 *[361]fretValue>0:FALSE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:FALSE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:FALSE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:FALSE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:FALSE
		 *[360]fretValue==0:FALSE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.calculateFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#calculateFirstFret())*/
	public void testCalculateFirstFret_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[358]i<getStrings:.length:TRUE
		 *[360]zero:TRUE
		 *[361]fretValue>0:TRUE
		 *[362]minimum<0:TRUE
		 *[358]i<getStrings:.length:FALSE
		 *[366]zero:TRUE
		 *[366]maximum<MAX_FRETS:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.calculateFirstFret();
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getStringValue(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetStringValueInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#isDisposed())*/
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
		 *[376]this.diagram==null:TRUE
		 *[376]this.diagram.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#isDisposed())*/
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
		 *[376]this.diagram==null:FALSE
		 *[376]this.diagram.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#isDisposed())*/
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
		 *[376]this.diagram==null:TRUE
		 *[376]this.diagram.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#dispose())*/
	public void testDispose_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[380]!isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.dispose();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#dispose())*/
	public void testDispose_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[380]!isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.dispose();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getPosX())*/
	public void testGetPosX_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[386]isEditing:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getPosX();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getPosX())*/
	public void testGetPosX_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[386]isEditing:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getPosX();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getPaintPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getPaintPosition(int))*/
	public void testGetPaintPositionInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getPaintPosition(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.getBeatImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGChordImpl#getBeatImpl())*/
	public void testGetBeatImpl() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGBeatImpl methodReturn = constructorInstance.getBeatImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameFont(TGFont, TGFont)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameFontTGFontTGFont_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGChordImpl.isSameColor(TGColor, TGColor)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testIsSameColorTGColorTGColor_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getBeat())*/
	public void testGetBeat() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGBeat methodReturn = constructorInstance.getBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.setBeat(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#setBeat(TGBeat))*/
	public void testSetBeatTGBeat() {
		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setBeat(beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getFretValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getFretValue(int))*/
	public void testGetFretValueInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[45]string>=0:TRUE
		 *[45]string<this.strings.length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFretValue(string);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getFretValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getFretValue(int))*/
	public void testGetFretValueInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[45]string>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFretValue(string);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getFretValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getFretValue(int))*/
	public void testGetFretValueInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[45]string>=0:TRUE
		 *[45]string<this.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int string = 0;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFretValue(string);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getFirstFret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getFirstFret())*/
	public void testGetFirstFret() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.getFirstFret();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getStrings())*/
	public void testGetStrings() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int[] methodReturn = constructorInstance.getStrings();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.countStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#countStrings())*/
	public void testCountStrings() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.countStrings();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.countNotes()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#countNotes())*/
	public void testCountNotes_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[69]i<this.strings.length:TRUE
		 *[70]this.strings[i]>=0:TRUE
		 *[69]i<this.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.countNotes();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.countNotes()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#countNotes())*/
	public void testCountNotes_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[69]i<this.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.countNotes();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.countNotes()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#countNotes())*/
	public void testCountNotes_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[69]i<this.strings.length:TRUE
		 *[70]this.strings[i]>=0:FALSE
		 *[69]i<this.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		int methodReturn = constructorInstance.countNotes();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#getName())*/
	public void testGetName() {

		// Constructor arguments
		int length = 0;
		TGChordImpl constructorInstance = new TGChordImpl(length);

		String methodReturn = constructorInstance.getName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.setName(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#setName(String))*/
	public void testSetNameString() {
		// Method under test arguments
		String name = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		constructorInstance.setName(name);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#clone(TGFactory))*/
	public void testCloneTGFactory_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[89]i<chord.strings.length:TRUE
		 *[89]i<chord.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGChord methodReturn = constructorInstance.clone(factory);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGChord.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGChord#clone(TGFactory))*/
	public void testCloneTGFactory_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[89]i<chord.strings.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		int length = 0;

		TGChordImpl constructorInstance = new TGChordImpl(length);

		TGChord methodReturn = constructorInstance.clone(factory);
		fail("Path 2 assertion not implemented.");
	}

}
