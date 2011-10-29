package org.herac.tuxguitar.app.Tests;

import java.awt.Component;
import java.awt.Rectangle;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGPainterImpl;
import org.herac.tuxguitar.app.editors.TGScrollBar;
import org.herac.tuxguitar.app.editors.tab.Caret;
import org.herac.tuxguitar.app.editors.tab.Tablature;
import org.herac.tuxguitar.graphics.TGRectangle;
import org.herac.tuxguitar.graphics.TGResourceFactory;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGLayoutStyles;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGMeasure;
import org.herac.tuxguitar.song.models.TGMeasureHeader;

public class TablatureTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.Tablature(Component, TGScrollBar)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#Tablature(Component,TGScrollBar))*/
	public void testTablatureComponentTGScrollBar() {
		// Method under test arguments
		Component component = null;
		TGScrollBar scroll = null;

		// Constructor under test arguments// Constructor under test
		Tablature constructorInstance = new Tablature(component, scroll);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.initDefaults()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#initDefaults())*/
	public void testInitDefaults() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.initDefaults();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.updateTablature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#updateTablature())*/
	public void testUpdateTablature() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.updateTablature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.initCaret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#initCaret())*/
	public void testInitCaret() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.initCaret();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.paintTablature(TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#paintTablature(TGPainterImpl))*/
	public void testPaintTablatureTGPainterImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[95]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainterImpl painter = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.paintTablature(painter);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.paintTablature(TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#paintTablature(TGPainterImpl))*/
	public void testPaintTablatureTGPainterImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[95]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[100]getCaret:.hasChanges:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainterImpl painter = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.paintTablature(painter);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.paintTablature(TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#paintTablature(TGPainterImpl))*/
	public void testPaintTablatureTGPainterImpl_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[95]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[100]getCaret:.hasChanges:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainterImpl painter = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.paintTablature(painter);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.paintTablature(TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#paintTablature(TGPainterImpl))*/
	public void testPaintTablatureTGPainterImpl_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[107]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		TGPainterImpl painter = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.paintTablature(painter);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.resetScroll()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#resetScroll())*/
	public void testResetScroll() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.resetScroll();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.checkScroll()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#checkScroll())*/
	public void testCheckScroll_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[119]this.resetScroll:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.checkScroll();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.checkScroll()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#checkScroll())*/
	public void testCheckScroll_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[119]this.resetScroll:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.checkScroll();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.updateScroll()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#updateScroll())*/
	public void testUpdateScroll() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.updateScroll();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl))*/
	public void testMoveScrollToTGMeasureImpl() {
		// Method under test arguments
		TGMeasureImpl measure = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:TRUE
		 *[148]!success:FALSE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:FALSE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:FALSE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:FALSE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:FALSE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:FALSE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:FALSE
		 *[148]!success:FALSE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:FALSE
		 *[153]forceRedraw:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.moveScrollTo(TGMeasureImpl, Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#moveScrollTo(TGMeasureImpl,Rectangle))*/
	public void testMoveScrollToTGMeasureImplRectangle_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]measure!=null:TRUE
		 *[135]measure.getTs:!=null:TRUE
		 *[143]mX<0:FALSE
		 *[143]mX+mWidth:>area.height:TRUE
		 *[143]area.height>=mWidth+marginWidth:FALSE
		 *[143]mX>marginWidth:TRUE
		 *[148]!success:TRUE
		 *[150]this.scrollY!=this.scroll.getValue:TRUE
		 *[153]forceRedraw:FALSE
		 *[153]success:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;
		Rectangle area = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.moveScrollTo(measure, area);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.beforeRedraw()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#beforeRedraw())*/
	public void testBeforeRedraw() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.beforeRedraw();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#redrawPlayingMode())*/
	public void testRedrawPlayingMode_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[169]!isPainting:TRUE
		 *[169]!TuxGuitar.instance:.isLocked:TRUE
		 *[171]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.redrawPlayingMode();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#redrawPlayingMode())*/
	public void testRedrawPlayingMode_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[169]!isPainting:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.redrawPlayingMode();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#redrawPlayingMode())*/
	public void testRedrawPlayingMode_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[169]!isPainting:TRUE
		 *[169]!TuxGuitar.instance:.isLocked:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.redrawPlayingMode();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#redrawPlayingMode())*/
	public void testRedrawPlayingMode_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[169]!isPainting:TRUE
		 *[169]!TuxGuitar.instance:.isLocked:TRUE
		 *[171]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.redrawPlayingMode();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.redrawPlayingMode(TGPainterImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testRedrawPlayingModeTGPainterImplBoolean_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isPainting()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isPainting())*/
	public void testIsPainting() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isPainting();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.setPainting(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#setPainting(boolean))*/
	public void testSetPaintingBoolean() {
		// Method under test arguments
		boolean painting = true;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.setPainting(painting);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getCaret()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getCaret())*/
	public void testGetCaret() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		Caret methodReturn = constructorInstance.getCaret();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getSongManager()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getSongManager())*/
	public void testGetSongManager() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		TGSongManager methodReturn = constructorInstance.getSongManager();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.setSongManager(TGSongManager)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#setSongManager(TGSongManager))*/
	public void testSetSongManagerTGSongManager() {
		// Method under test arguments
		TGSongManager songManager = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.setSongManager(songManager);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getViewLayout()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getViewLayout())*/
	public void testGetViewLayout() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		TGLayout methodReturn = constructorInstance.getViewLayout();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.setViewLayout(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#setViewLayout(TGLayout))*/
	public void testSetViewLayoutTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[233]getViewLayout:!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout viewLayout = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.setViewLayout(viewLayout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.setViewLayout(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#setViewLayout(TGLayout))*/
	public void testSetViewLayoutTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[233]getViewLayout:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout viewLayout = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.setViewLayout(viewLayout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.reloadStyles()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#reloadStyles())*/
	public void testReloadStyles_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[248]this.getViewLayout:!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.reloadStyles();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.reloadStyles()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#reloadStyles())*/
	public void testReloadStyles_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[248]this.getViewLayout:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.reloadStyles();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.createRectangle(Rectangle)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#createRectangle(Rectangle))*/
	public void testCreateRectangleRectangle() {
		// Method under test arguments
		Rectangle rectangle = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		TGRectangle methodReturn = constructorInstance
				.createRectangle(rectangle);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.reloadViewLayout()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#reloadViewLayout())*/
	public void testReloadViewLayout() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.reloadViewLayout();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#dispose())*/
	public void testDispose() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getResourceFactory()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getResourceFactory())*/
	public void testGetResourceFactory() {

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		TGResourceFactory methodReturn = constructorInstance
				.getResourceFactory();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.configureStyles(TGLayoutStyles)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#configureStyles(TGLayoutStyles))*/
	public void testConfigureStylesTGLayoutStyles() {
		// Method under test arguments
		TGLayoutStyles styles = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		constructorInstance.configureStyles(styles);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getTrackSelection()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getTrackSelection())*/
	public void testGetTrackSelection_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[308]getViewLayout:.getStyle:&TGLayout.DISPLAY_MULTITRACK:==0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		int methodReturn = constructorInstance.getTrackSelection();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.getTrackSelection()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#getTrackSelection())*/
	public void testGetTrackSelection_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[308]getViewLayout:.getStyle:&TGLayout.DISPLAY_MULTITRACK:==0:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;
		Tablature constructorInstance = new Tablature(component, scroll);

		int methodReturn = constructorInstance.getTrackSelection();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGBeat))*/
	public void testIsRunningTGBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[315]isRunningbeat.getMeasure::TRUE
		 *[315]TuxGuitar.instance:.getEditorCache:.isPlayingbeat.getMeasure:,beat:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(beat);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGBeat))*/
	public void testIsRunningTGBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[315]isRunningbeat.getMeasure::FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(beat);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGBeat))*/
	public void testIsRunningTGBeat_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[315]isRunningbeat.getMeasure::TRUE
		 *[315]TuxGuitar.instance:.getEditorCache:.isPlayingbeat.getMeasure:,beat:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(beat);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGMeasure))*/
	public void testIsRunningTGMeasure_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[319]measure.getTrack:.equalsgetCaret:.getTrack::TRUE
		 *[319]TuxGuitar.instance:.getEditorCache:.isPlayingmeasure:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(measure);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGMeasure))*/
	public void testIsRunningTGMeasure_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[319]measure.getTrack:.equalsgetCaret:.getTrack::FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(measure);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isRunning(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isRunning(TGMeasure))*/
	public void testIsRunningTGMeasure_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[319]measure.getTrack:.equalsgetCaret:.getTrack::TRUE
		 *[319]TuxGuitar.instance:.getEditorCache:.isPlayingmeasure:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isRunning(measure);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isLoopSHeader(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isLoopSHeader(TGMeasureHeader))*/
	public void testIsLoopSHeaderTGMeasureHeader() {
		// Method under test arguments
		TGMeasureHeader measureHeader = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isLoopSHeader(measureHeader);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Tablature.isLoopEHeader(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Tablature#isLoopEHeader(TGMeasureHeader))*/
	public void testIsLoopEHeaderTGMeasureHeader() {
		// Method under test arguments
		TGMeasureHeader measureHeader = null;

		// Constructor arguments
		Component component = null;
		TGScrollBar scroll = null;

		Tablature constructorInstance = new Tablature(component, scroll);

		boolean methodReturn = constructorInstance.isLoopEHeader(measureHeader);
		fail("Test method not implemented.");
	}

}
