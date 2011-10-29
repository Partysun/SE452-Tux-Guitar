package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGPainterImpl;
import org.herac.tuxguitar.app.editors.tab.Caret;
import org.herac.tuxguitar.app.editors.tab.Tablature;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.graphics.control.TGTrackImpl;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGDuration;
import org.herac.tuxguitar.song.models.TGNote;
import org.herac.tuxguitar.song.models.TGString;

public class CaretTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.Caret(Tablature)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#Caret(Tablature))*/
	public void testCaretTablature() {
		// Method under test arguments
		Tablature tablature = null;

		// Constructor under test arguments// Constructor under test
		Caret constructorInstance = new Caret(tablature);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update())*/
	public void testUpdate_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]this.selectedTrack!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update())*/
	public void testUpdate_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[57]this.selectedTrack!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int))*/
	public void testUpdateInt() {
		// Method under test arguments
		int trackNumber = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int))*/
	public void testUpdateIntLongInt() {
		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int,int))*/
	public void testUpdateIntLongIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[70]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[74]track!=null:TRUE
		 *[74]measure!=null:TRUE
		 *[74]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string, velocity);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int,int))*/
	public void testUpdateIntLongIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[70]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[74]track!=null:TRUE
		 *[74]measure!=null:TRUE
		 *[74]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string, velocity);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int,int))*/
	public void testUpdateIntLongIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[70]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[74]track!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string, velocity);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int,int))*/
	public void testUpdateIntLongIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[70]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[74]track!=null:TRUE
		 *[74]measure!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string, velocity);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.update(int, long, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#update(int,long,int,int))*/
	public void testUpdateIntLongIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[70]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[74]track!=null:TRUE
		 *[74]measure!=null:TRUE
		 *[74]beat!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int trackNumber = 0;
		long position = 0;
		int string = 0;
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.update(trackNumber, position, string, velocity);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveTo(TGTrackImpl, TGMeasureImpl, TGBeat, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveTo(TGTrackImpl,TGMeasureImpl,TGBeat,int))*/
	public void testMoveToTGTrackImplTGMeasureImplTGBeatInt() {
		// Method under test arguments
		TGTrackImpl selectedTrack = null;
		TGMeasureImpl selectedMeasure = null;
		TGBeat selectedBeat = null;
		int string = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveTo(selectedTrack, selectedMeasure,
				selectedBeat, string);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findTrack(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindTrackInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findTrack(int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindTrackInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findMeasure(long, TGTrackImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindMeasureLongTGTrackImpl_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findMeasure(long, TGTrackImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindMeasureLongTGTrackImpl_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findMeasure(long, TGTrackImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindMeasureLongTGTrackImpl_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findBeat(long, TGMeasureImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindBeatLongTGMeasureImpl_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findBeat(long, TGMeasureImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindBeatLongTGMeasureImpl_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findBeat(long, TGMeasureImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindBeatLongTGMeasureImpl_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findBeat(long, TGMeasureImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindBeatLongTGMeasureImpl_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.findBeat(long, TGMeasureImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testFindBeatLongTGMeasureImpl_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.goToTickPosition()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#goToTickPosition())*/
	public void testGoToTickPosition() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.goToTickPosition();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[139]getSelectedNote:==null:TRUE
		 *[146]expectedVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[152]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[139]getSelectedNote:==null:FALSE
		 *[139]getSelectedNote:.getVoice:.getIndex:==getVoice:TRUE
		 *[146]expectedVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[139]getSelectedNote:==null:TRUE
		 *[146]expectedVoice:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[152]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[139]getSelectedNote:==null:FALSE
		 *[139]getSelectedNote:.getVoice:.getIndex:==getVoice:FALSE
		 *[146]expectedVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.paintCaret(TGLayout, TGPainterImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#paintCaret(TGLayout,TGPainterImpl))*/
	public void testPaintCaretTGLayoutTGPainterImpl_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[135]!TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[136]this.selectedMeasure!=null:TRUE
		 *[136]this.selectedBeatinstanceofTGBeatImpl:TRUE
		 *[138]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[139]getSelectedNote:==null:FALSE
		 *[139]getSelectedNote:.getVoice:.getIndex:==getVoice:FALSE
		 *[146]expectedVoice:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainterImpl painter = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.paintCaret(layout, painter);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:TRUE
		 *[182]measure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:FALSE
		 *[179]beat==null:TRUE
		 *[182]measure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:FALSE
		 *[191]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:TRUE
		 *[182]measure==null:FALSE
		 *[186]voice!=null:TRUE
		 *[187]beat==null:TRUE
		 *[191]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:FALSE
		 *[191]beat!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:TRUE
		 *[182]measure==null:FALSE
		 *[186]voice!=null:FALSE
		 *[187]beat==null:TRUE
		 *[191]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveRight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveRight())*/
	public void testMoveRight_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]getSelectedBeat:!=null:TRUE
		 *[178]voice!=null:TRUE
		 *[179]beat==null:TRUE
		 *[182]measure==null:FALSE
		 *[186]voice!=null:TRUE
		 *[187]beat==null:FALSE
		 *[191]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.moveRight();
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:TRUE
		 *[206]measure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:FALSE
		 *[203]beat==null:TRUE
		 *[206]measure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:FALSE
		 *[215]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:TRUE
		 *[206]measure==null:FALSE
		 *[210]voice!=null:TRUE
		 *[211]beat==null:TRUE
		 *[215]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:FALSE
		 *[215]beat!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:TRUE
		 *[206]measure==null:FALSE
		 *[210]voice!=null:FALSE
		 *[211]beat==null:TRUE
		 *[215]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveLeft()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveLeft())*/
	public void testMoveLeft_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[199]getSelectedBeat:!=null:TRUE
		 *[202]voice!=null:TRUE
		 *[203]beat==null:TRUE
		 *[206]measure==null:FALSE
		 *[210]voice!=null:TRUE
		 *[211]beat==null:FALSE
		 *[215]beat!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveLeft();
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateDuration()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDuration_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateDuration()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDuration_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateDuration()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateDuration_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveUp()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveUp())*/
	public void testMoveUp() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveUp();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.moveDown()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#moveDown())*/
	public void testMoveDown() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		constructorInstance.moveDown();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.setStringNumber(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#setStringNumber(int))*/
	public void testSetStringNumberInt() {
		// Method under test arguments
		int number = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.setStringNumber(number);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getStringNumber()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getStringNumber())*/
	public void testGetStringNumber() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		int methodReturn = constructorInstance.getStringNumber();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getPosition()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getPosition())*/
	public void testGetPosition() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		long methodReturn = constructorInstance.getPosition();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getMeasure()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getMeasure())*/
	public void testGetMeasure() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGMeasureImpl methodReturn = constructorInstance.getMeasure();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getTrack()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getTrack())*/
	public void testGetTrack() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGTrackImpl methodReturn = constructorInstance.getTrack();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getDuration()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getDuration())*/
	public void testGetDuration() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGDuration methodReturn = constructorInstance.getDuration();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.setSelectedDuration(TGDuration)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#setSelectedDuration(TGDuration))*/
	public void testSetSelectedDurationTGDuration() {
		// Method under test arguments
		TGDuration selectedDuration = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.setSelectedDuration(selectedDuration);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSelectedString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSelectedString())*/
	public void testGetSelectedString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]it.hasNext:TRUE
		 *[276]instrumentString.getNumber:==this.string:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGString methodReturn = constructorInstance.getSelectedString();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSelectedString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSelectedString())*/
	public void testGetSelectedString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGString methodReturn = constructorInstance.getSelectedString();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSelectedString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSelectedString())*/
	public void testGetSelectedString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]it.hasNext:TRUE
		 *[276]instrumentString.getNumber:==this.string:FALSE
		 *[274]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGString methodReturn = constructorInstance.getSelectedString();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.changeDuration(TGDuration)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#changeDuration(TGDuration))*/
	public void testChangeDurationTGDuration() {
		// Method under test arguments
		TGDuration duration = null;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.changeDuration(duration);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updatePosition()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdatePosition() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateString()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateString_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateString()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateString_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateString()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateString_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.checkTransport()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckTransport() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.hasChanges()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#hasChanges())*/
	public void testHasChanges() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.hasChanges();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.setChanges(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#setChanges(boolean))*/
	public void testSetChangesBoolean() {
		// Method under test arguments
		boolean changes = true;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.setChanges(changes);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getVelocity()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getVelocity())*/
	public void testGetVelocity() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		int methodReturn = constructorInstance.getVelocity();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.setVelocity(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#setVelocity(int))*/
	public void testSetVelocityInt() {
		// Method under test arguments
		int velocity = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.setVelocity(velocity);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateNote()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNote_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateNote()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateNote_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSelectedNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSelectedNote())*/
	public void testGetSelectedNote() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGNote methodReturn = constructorInstance.getSelectedNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.updateBeat()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateBeat() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSelectedBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSelectedBeat())*/
	public void testGetSelectedBeat() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGBeatImpl methodReturn = constructorInstance.getSelectedBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getSongManager()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getSongManager())*/
	public void testGetSongManager() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		TGSongManager methodReturn = constructorInstance.getSongManager();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.getVoice()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#getVoice())*/
	public void testGetVoice() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		int methodReturn = constructorInstance.getVoice();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.setVoice(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#setVoice(int))*/
	public void testSetVoiceInt() {
		// Method under test arguments
		int voice = 0;

		// Constructor arguments
		Tablature tablature = null;

		Caret constructorInstance = new Caret(tablature);

		constructorInstance.setVoice(voice);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.tab.Caret.isRestBeatSelected()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.tab.Caret#isRestBeatSelected())*/
	public void testIsRestBeatSelected() {

		// Constructor arguments
		Tablature tablature = null;
		Caret constructorInstance = new Caret(tablature);

		boolean methodReturn = constructorInstance.isRestBeatSelected();
		fail("Test method not implemented.");
	}

}
