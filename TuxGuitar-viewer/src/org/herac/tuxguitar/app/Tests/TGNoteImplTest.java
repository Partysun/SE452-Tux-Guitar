package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.graphics.control.TGNoteImpl;
import org.herac.tuxguitar.graphics.control.TGVoiceImpl;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGNote;
import org.herac.tuxguitar.song.models.TGNoteEffect;
import org.herac.tuxguitar.song.models.TGVoice;

public class TGNoteImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.TGNoteImpl(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#TGNoteImpl(TGFactory))*/
	public void testTGNoteImplTGFactory() {
		// Method under test arguments
		TGFactory factory = null;

		// Constructor under test arguments// Constructor under test
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.update(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#update(TGLayout))*/
	public void testUpdateTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.update(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]!layout.isPlayModeEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]!layout.isPlayModeEnabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintOfflineEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintOfflineEffectsTGLayoutTGPainterIntIntInt_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:FALSE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:FALSE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:TRUE
		 *[181]getEffect:.isGhostNote:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:TRUE
		 *[181]getEffect:.isGhostNote:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:FALSE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:FALSE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:FALSE
		 *[181]getEffect:.isGhostNote:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:TRUE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:TRUE
		 *[181]getEffect:.isGhostNote:FALSE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:FALSE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:FALSE
		 *[153]isTiedNote:TRUE
		 *[153]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[159]noteForTie!=null:FALSE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:FALSE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:TRUE
		 *[181]getEffect:.isGhostNote:TRUE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTablatureNote(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#paintTablatureNote(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureNoteTGLayoutTGPainterIntIntInt_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[141]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[151]layout.isPlayModeEnabled:TRUE
		 *[151]getBeatImpl:.isPlayinglayout:FALSE
		 *[153]isTiedNote:FALSE
		 *[174]!isTiedNote:TRUE
		 *[180]getEffect:.isDeadNote:TRUE
		 *[181]getEffect:.isGhostNote:FALSE
		 *[186]!layout.isPlayModeEnabled:TRUE
		 *[190]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[195]getEffect:.isTremoloPicking:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:TRUE
		 *[199]i<=getEffect:.getTremoloPicking:.getDuration:.getValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.paintTablatureNote(layout, painter, fromX, fromY,
				spacing);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path19() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path20() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path21() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path22() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path23() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path24() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path25() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path26() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path27() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path28() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path29() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path30() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path31() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path32() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path33() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path34() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path35() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path36() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path37() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path38() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path39() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path40() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path41() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path42() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path43() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintScoreNote(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintScoreNoteTGLayoutTGPainterIntIntInt_Path44() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getNoteForTie()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetNoteForTie_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintEffects(TGLayout, TGPainter, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintEffectsTGLayoutTGPainterIntIntInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintBend(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintBendTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTremoloBar(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTremoloBarTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintSlide(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintSlideTGLayoutTGPainterTGNoteImplIntIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintSlide(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintSlideTGLayoutTGPainterTGNoteImplIntIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintSlide(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintSlideTGLayoutTGPainterTGNoteImplIntIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintSlide(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintSlideTGLayoutTGPainterTGNoteImplIntIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintHammer(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintHammerTGLayoutTGPainterTGNoteImplIntIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintHammer(TGLayout, TGPainter, TGNoteImpl, int, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintHammerTGLayoutTGPainterTGNoteImplIntIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintGrace(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintGraceTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintVibrato(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintVibratoTGLayoutTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintVibrato(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintVibratoTGLayoutTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintVibrato(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintVibratoTGLayoutTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintVibrato(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintVibratoTGLayoutTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintVibrato(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintVibratoTGLayoutTGPainterIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTrill(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTrillTGLayoutTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTrill(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTrillTGLayoutTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTrill(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTrillTGLayoutTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTrill(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTrillTGLayoutTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintTrill(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTrillTGLayoutTGPainterIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintFadeIn(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintFadeInTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintAccentuated(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintAccentuatedTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.paintHeavyAccentuated(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintHeavyAccentuatedTGLayoutTGPainterIntInt() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getRealValue()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getRealValue())*/
	public void testGetRealValue() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getRealValue();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getScorePosY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getScorePosY())*/
	public void testGetScorePosY() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getScorePosY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getTabPosY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getTabPosY())*/
	public void testGetTabPosY() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getTabPosY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getMeasureImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getMeasureImpl())*/
	public void testGetMeasureImpl() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		TGMeasureImpl methodReturn = constructorInstance.getMeasureImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getPaintPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getPaintPosition(int))*/
	public void testGetPaintPositionInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getPaintPosition(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getBeatImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getBeatImpl())*/
	public void testGetBeatImpl() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		TGBeatImpl methodReturn = constructorInstance.getBeatImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getVoiceImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getVoiceImpl())*/
	public void testGetVoiceImpl() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		TGVoiceImpl methodReturn = constructorInstance.getVoiceImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGNoteImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGNoteImpl#getPosX())*/
	public void testGetPosX() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getPosX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.getValue()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#getValue())*/
	public void testGetValue() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getValue();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setValue(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setValue(int))*/
	public void testSetValueInt() {
		// Method under test arguments
		int value = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setValue(value);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.getVelocity()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#getVelocity())*/
	public void testGetVelocity() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getVelocity();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setVelocity(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setVelocity(int))*/
	public void testSetVelocityInt() {
		// Method under test arguments
		int velocity = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setVelocity(velocity);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.getString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#getString())*/
	public void testGetString() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		int methodReturn = constructorInstance.getString();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setString(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setString(int))*/
	public void testSetStringInt() {
		// Method under test arguments
		int string = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setString(string);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.isTiedNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#isTiedNote())*/
	public void testIsTiedNote() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		boolean methodReturn = constructorInstance.isTiedNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setTiedNote(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setTiedNote(boolean))*/
	public void testSetTiedNoteBoolean() {
		// Method under test arguments
		boolean tiedNote = true;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setTiedNote(tiedNote);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.getEffect()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#getEffect())*/
	public void testGetEffect() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		TGNoteEffect methodReturn = constructorInstance.getEffect();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setEffect(TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setEffect(TGNoteEffect))*/
	public void testSetEffectTGNoteEffect() {
		// Method under test arguments
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setEffect(effect);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.getVoice()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#getVoice())*/
	public void testGetVoice() {

		// Constructor arguments
		TGFactory factory = null;
		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		TGVoice methodReturn = constructorInstance.getVoice();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.setVoice(TGVoice)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#setVoice(TGVoice))*/
	public void testSetVoiceTGVoice() {
		// Method under test arguments
		TGVoice voice = null;

		// Constructor arguments
		TGFactory factory = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory);

		constructorInstance.setVoice(voice);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGNote.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGNote#clone(TGFactory))*/
	public void testCloneTGFactory() {
		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGNoteImpl constructorInstance = new TGNoteImpl(factory_c);

		TGNote methodReturn = constructorInstance.clone(factory_c);
		fail("Test method not implemented.");
	}

}
