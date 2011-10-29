package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.transport.TGTransport;
import org.herac.tuxguitar.song.models.TGMeasureHeader;

public class TGTransportTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.TGTransport()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#TGTransport())*/
	public void testTGTransport() {

		// Constructor under test
		TGTransport constructorInstance = new TGTransport();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.getSongManager()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSongManager() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoFirst()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoFirst())*/
	public void testGotoFirst() {

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoFirst();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoLast()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoLast())*/
	public void testGotoLast() {

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoLast();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoNext()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoNext())*/
	public void testGotoNext_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]header!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoNext();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoNext()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoNext())*/
	public void testGotoNext_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]header!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoNext();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoPrevious()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoPrevious())*/
	public void testGotoPrevious_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[51]header!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoPrevious();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoPrevious()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoPrevious())*/
	public void testGotoPrevious_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[51]header!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoPrevious();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader))*/
	public void testGotoMeasureTGMeasureHeader() {
		// Method under test arguments
		TGMeasureHeader header = null;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[67]playingMeasure==null:TRUE
		 *[69]moveCaret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[67]playingMeasure==null:TRUE
		 *[69]moveCaret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[67]playingMeasure==null:FALSE
		 *[67]playingMeasure.getHeader:.getNumber:!=header.getNumber:TRUE
		 *[69]moveCaret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[67]playingMeasure==null:TRUE
		 *[69]moveCaret:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[67]playingMeasure==null:FALSE
		 *[67]playingMeasure.getHeader:.getNumber:!=header.getNumber:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.transport.TGTransport.gotoMeasure(TGMeasureHeader, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.transport.TGTransport#gotoMeasure(TGMeasureHeader,boolean))*/
	public void testGotoMeasureTGMeasureHeaderBoolean_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[61]header!=null:TRUE
		 *[63]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[67]playingMeasure==null:FALSE
		 *[67]playingMeasure.getHeader:.getNumber:!=header.getNumber:TRUE
		 *[69]moveCaret:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;
		boolean moveCaret = true;

		TGTransport constructorInstance = new TGTransport();

		constructorInstance.gotoMeasure(header, moveCaret);
		fail("Path 7 assertion not implemented.");
	}

}
