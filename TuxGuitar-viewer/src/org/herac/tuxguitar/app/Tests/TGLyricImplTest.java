package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGLyricImpl;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.song.models.TGLyric;

public class TGLyricImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.setFrom(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#setFrom(int))*/
	public void testSetFromInt() {
		// Method under test arguments
		int from = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.setFrom(from);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.setLyrics(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#setLyrics(String))*/
	public void testSetLyricsString() {
		// Method under test arguments
		String lyrics = null;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.setLyrics(lyrics);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.TGLyricImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#TGLyricImpl())*/
	public void testTGLyricImpl() {

		// Constructor under test
		TGLyricImpl constructorInstance = new TGLyricImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.update()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdate_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.update()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdate_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.start()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#start())*/
	public void testStart() {

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.start();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.start(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#start(int))*/
	public void testStartInt() {
		// Method under test arguments
		int index = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.start(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.setCurrentMeasure(TGMeasureImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#setCurrentMeasure(TGMeasureImpl))*/
	public void testSetCurrentMeasureTGMeasureImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]measure.getNumber:>=getFrom:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.setCurrentMeasure(measure);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.setCurrentMeasure(TGMeasureImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#setCurrentMeasure(TGMeasureImpl))*/
	public void testSetCurrentMeasureTGMeasureImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]measure.getNumber:>=getFrom:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureImpl measure = null;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.setCurrentMeasure(measure);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:TRUE
		 *[55]from+beatIndex:<beats.length:TRUE
		 *[57]str.length:>0:TRUE
		 *[59]layout.isPlayModeEnabled:TRUE
		 *[59]beat.isPlayinglayout:TRUE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:FALSE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:TRUE
		 *[55]from+beatIndex:<beats.length:FALSE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:TRUE
		 *[55]from+beatIndex:<beats.length:TRUE
		 *[57]str.length:>0:FALSE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:TRUE
		 *[55]from+beatIndex:<beats.length:TRUE
		 *[57]str.length:>0:TRUE
		 *[59]layout.isPlayModeEnabled:FALSE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.paintCurrentNoteBeats(TGPainter, TGLayout, TGMeasureImpl, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#paintCurrentNoteBeats(TGPainter,TGLayout,TGMeasureImpl,int,int))*/
	public void testPaintCurrentNoteBeatsTGPainterTGLayoutTGMeasureImplIntInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]beats!=null:TRUE
		 *[50]from>=0:TRUE
		 *[50]from<beats.length:TRUE
		 *[52]i<currentMeasure.countBeats:TRUE
		 *[54]!beat.isRestBeat:TRUE
		 *[55]from+beatIndex:<beats.length:TRUE
		 *[57]str.length:>0:TRUE
		 *[59]layout.isPlayModeEnabled:TRUE
		 *[59]beat.isPlayinglayout:FALSE
		 *[52]i<currentMeasure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		TGMeasureImpl currentMeasure = null;
		int fromX = 0;
		int fromY = 0;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.paintCurrentNoteBeats(painter, layout,
				currentMeasure, fromX, fromY);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGLyricImpl.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGLyricImpl#getHeight())*/
	public void testGetHeight() {

		TGLyricImpl constructorInstance = new TGLyricImpl();

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.getFrom()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#getFrom())*/
	public void testGetFrom() {

		TGLyricImpl constructorInstance = new TGLyricImpl();

		int methodReturn = constructorInstance.getFrom();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.getLyrics()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#getLyrics())*/
	public void testGetLyrics() {

		TGLyricImpl constructorInstance = new TGLyricImpl();

		String methodReturn = constructorInstance.getLyrics();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.getLyricBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#getLyricBeats())*/
	public void testGetLyricBeats() {

		TGLyricImpl constructorInstance = new TGLyricImpl();

		String[] methodReturn = constructorInstance.getLyricBeats();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.isEmpty()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#isEmpty())*/
	public void testIsEmpty_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]getLyrics:.length:==0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TGLyricImpl constructorInstance = new TGLyricImpl();

		boolean methodReturn = constructorInstance.isEmpty();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.isEmpty()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#isEmpty())*/
	public void testIsEmpty_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]getLyrics:.length:==0:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLyricImpl constructorInstance = new TGLyricImpl();

		boolean methodReturn = constructorInstance.isEmpty();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGLyric.copy(TGLyric)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGLyric#copy(TGLyric))*/
	public void testCopyTGLyric() {
		// Method under test arguments
		TGLyric lyric = null;

		TGLyricImpl constructorInstance = new TGLyricImpl();

		constructorInstance.copy(lyric);
		fail("Test method not implemented.");
	}

}
