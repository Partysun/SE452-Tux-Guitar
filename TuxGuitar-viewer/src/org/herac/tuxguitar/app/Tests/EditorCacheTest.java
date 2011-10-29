package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.EditorCache;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGMeasure;

public class EditorCacheTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.EditorCache()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#EditorCache())*/
	public void testEditorCache() {

		// Constructor under test
		EditorCache constructorInstance = new EditorCache();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.reset()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#reset())*/
	public void testReset() {

		EditorCache constructorInstance = new EditorCache();

		constructorInstance.reset();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.resetEditMode()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testResetEditMode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.resetPlayMode()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testResetPlayMode() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.updateEditMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#updateEditMode())*/
	public void testUpdateEditMode() {

		EditorCache constructorInstance = new EditorCache();

		constructorInstance.updateEditMode();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.updatePlayMode()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#updatePlayMode())*/
	public void testUpdatePlayMode() {

		EditorCache constructorInstance = new EditorCache();

		constructorInstance.updatePlayMode();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getEditBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getEditBeat())*/
	public void testGetEditBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[68]this.editUpdate:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getEditBeat();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getEditBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getEditBeat())*/
	public void testGetEditBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[68]this.editUpdate:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getEditBeat();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:FALSE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:TRUE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:TRUE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path22() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::FALSE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 22 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path23() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 23 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path24() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 24 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path25() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 25 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path26() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:TRUE
		 *[96]this.playMeasure==null:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 26 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path27() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:FALSE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 27 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayBeat())*/
	public void testGetPlayBeat_Path28() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[76]this.playUpdate:TRUE
		 *[80]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[86]this.playMeasure==null:FALSE
		 *[86]start<this.playMeasure.getStart:FALSE
		 *[86]start>this.playMeasure.getStart:+this.playMeasure.getLength::TRUE
		 *[91]this.playMeasure==null:FALSE
		 *[91]this.playBeatEnd==0:FALSE
		 *[91]start>this.playBeatEnd:FALSE
		 *[91]start<this.playStart:FALSE
		 *[91]track.getNumber:!=this.playTrack:TRUE
		 *[96]this.playMeasure==null:FALSE
		 *[96]!this.playMeasure.hasTracktrack.getNumber::FALSE
		 *[96]!isPlayingthis.playMeasure:TRUE
		 *[99]this.playMeasure!=null:TRUE
		 *[101]this.playBeat!=null:TRUE
		 *[103]next!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		EditorCache constructorInstance = new EditorCache();

		TGBeatImpl methodReturn = constructorInstance.getPlayBeat();
		fail("Path 28 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayTick()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayTick())*/
	public void testGetPlayTick() {

		EditorCache constructorInstance = new EditorCache();

		long methodReturn = constructorInstance.getPlayTick();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayStart())*/
	public void testGetPlayStart() {

		EditorCache constructorInstance = new EditorCache();

		long methodReturn = constructorInstance.getPlayStart();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.getPlayMeasure()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#getPlayMeasure())*/
	public void testGetPlayMeasure() {

		EditorCache constructorInstance = new EditorCache();

		TGMeasureImpl methodReturn = constructorInstance.getPlayMeasure();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.shouldRedraw()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#shouldRedraw())*/
	public void testShouldRedraw() {

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.shouldRedraw();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure))*/
	public void testIsPlayingTGMeasure_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[138]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[138]this.playMeasure!=null:TRUE
		 *[138]measure.equalsthis.playMeasure:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure))*/
	public void testIsPlayingTGMeasure_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[138]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure))*/
	public void testIsPlayingTGMeasure_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[138]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[138]this.playMeasure!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure))*/
	public void testIsPlayingTGMeasure_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[138]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[138]this.playMeasure!=null:TRUE
		 *[138]measure.equalsthis.playMeasure:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure, TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure,TGBeat))*/
	public void testIsPlayingTGMeasureTGBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]isPlayingmeasure:TRUE
		 *[142]this.playBeat!=null:TRUE
		 *[142]this.playBeat.getStart:==b.getStart:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;
		TGBeat b = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure, b);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure, TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure,TGBeat))*/
	public void testIsPlayingTGMeasureTGBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]isPlayingmeasure:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;
		TGBeat b = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure, b);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure, TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure,TGBeat))*/
	public void testIsPlayingTGMeasureTGBeat_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]isPlayingmeasure:TRUE
		 *[142]this.playBeat!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;
		TGBeat b = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure, b);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.EditorCache.isPlaying(TGMeasure, TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.EditorCache#isPlaying(TGMeasure,TGBeat))*/
	public void testIsPlayingTGMeasureTGBeat_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[142]isPlayingmeasure:TRUE
		 *[142]this.playBeat!=null:TRUE
		 *[142]this.playBeat.getStart:==b.getStart:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;
		TGBeat b = null;

		EditorCache constructorInstance = new EditorCache();

		boolean methodReturn = constructorInstance.isPlaying(measure, b);
		fail("Path 4 assertion not implemented.");
	}

}
