package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGBeatGroup;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGBeatSpacing;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.graphics.control.TGNoteImpl;
import org.herac.tuxguitar.graphics.control.TGVoiceImpl;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGChord;
import org.herac.tuxguitar.song.models.TGMeasure;
import org.herac.tuxguitar.song.models.TGNoteEffect;
import org.herac.tuxguitar.song.models.TGStroke;
import org.herac.tuxguitar.song.models.TGText;
import org.herac.tuxguitar.song.models.TGVoice;

public class TGBeatImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.removeChord()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#removeChord())*/
	public void testRemoveChord_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[381]isChordBeat:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.removeChord();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.removeChord()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#removeChord())*/
	public void testRemoveChord_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[381]isChordBeat:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.removeChord();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.TGBeatImpl(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#TGBeatImpl(TGFactory))*/
	public void testTGBeatImplTGFactory() {
		// Method under test arguments
		TGFactory factory = null;

		// Constructor under test arguments// Constructor under test
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getPosX())*/
	public void testGetPosX() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getPosX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setPosX(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setPosX(int))*/
	public void testSetPosXInt() {
		// Method under test arguments
		int posX = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setPosX(posX);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getMinimumWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getMinimumWidth())*/
	public void testGetMinimumWidth() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getMinimumWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setWidth(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setWidth(int))*/
	public void testSetWidthInt() {
		// Method under test arguments
		int width = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setWidth(width);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getMinNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getMinNote())*/
	public void testGetMinNote() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGNoteImpl methodReturn = constructorInstance.getMinNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getMaxNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getMaxNote())*/
	public void testGetMaxNote() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGNoteImpl methodReturn = constructorInstance.getMaxNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getMeasureImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getMeasureImpl())*/
	public void testGetMeasureImpl() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGMeasureImpl methodReturn = constructorInstance.getMeasureImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getUsedStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getUsedStrings())*/
	public void testGetUsedStrings_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[88]this.usedStrings==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean[] methodReturn = constructorInstance.getUsedStrings();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getUsedStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getUsedStrings())*/
	public void testGetUsedStrings_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[88]this.usedStrings==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean[] methodReturn = constructorInstance.getUsedStrings();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getJoin1()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getJoin1())*/
	public void testGetJoin1() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatImpl methodReturn = constructorInstance.getJoin1();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setJoin1(TGBeatImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setJoin1(TGBeatImpl))*/
	public void testSetJoin1TGBeatImpl() {
		// Method under test arguments
		TGBeatImpl join1 = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setJoin1(join1);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getJoin2()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getJoin2())*/
	public void testGetJoin2() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatImpl methodReturn = constructorInstance.getJoin2();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setJoin2(TGBeatImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setJoin2(TGBeatImpl))*/
	public void testSetJoin2TGBeatImpl() {
		// Method under test arguments
		TGBeatImpl join2 = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setJoin2(join2);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.isJoinedGreaterThanQuarter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#isJoinedGreaterThanQuarter())*/
	public void testIsJoinedGreaterThanQuarter() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isJoinedGreaterThanQuarter();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setJoinedGreaterThanQuarter(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setJoinedGreaterThanQuarter(boolean))*/
	public void testSetJoinedGreaterThanQuarterBoolean() {
		// Method under test arguments
		boolean joinedGreaterThanQuarter = true;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance
				.setJoinedGreaterThanQuarter(joinedGreaterThanQuarter);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getJoinedType()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getJoinedType())*/
	public void testGetJoinedType() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getJoinedType();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setJoinedType(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setJoinedType(int))*/
	public void testSetJoinedTypeInt() {
		// Method under test arguments
		int joinedType = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setJoinedType(joinedType);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getPreviousBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getPreviousBeat())*/
	public void testGetPreviousBeat() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatImpl methodReturn = constructorInstance.getPreviousBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setPreviousBeat(TGBeatImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setPreviousBeat(TGBeatImpl))*/
	public void testSetPreviousBeatTGBeatImpl() {
		// Method under test arguments
		TGBeatImpl previous = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setPreviousBeat(previous);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getNextBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getNextBeat())*/
	public void testGetNextBeat() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatImpl methodReturn = constructorInstance.getNextBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setNextBeat(TGBeatImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setNextBeat(TGBeatImpl))*/
	public void testSetNextBeatTGBeatImpl() {
		// Method under test arguments
		TGBeatImpl next = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setNextBeat(next);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getBeatGroup()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getBeatGroup())*/
	public void testGetBeatGroup() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatGroup methodReturn = constructorInstance.getBeatGroup();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.setBeatGroup(TGBeatGroup)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#setBeatGroup(TGBeatGroup))*/
	public void testSetBeatGroupTGBeatGroup() {
		// Method under test arguments
		TGBeatGroup group = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setBeatGroup(group);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getSpacing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getSpacing())*/
	public void testGetSpacing() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getSpacing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.isPlaying(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#isPlaying(TGLayout))*/
	public void testIsPlayingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isPlaying(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getVoiceImpl(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getVoiceImpl(int))*/
	public void testGetVoiceImplInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[161]voiceinstanceofTGVoiceImpl:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGVoiceImpl methodReturn = constructorInstance.getVoiceImpl(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getVoiceImpl(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getVoiceImpl(int))*/
	public void testGetVoiceImplInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[161]voiceinstanceofTGVoiceImpl:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGVoiceImpl methodReturn = constructorInstance.getVoiceImpl(index);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.reset()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#reset())*/
	public void testReset() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.reset();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:TRUE
		 *[178]this.minNote==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:FALSE
		 *[175]value>this.maxNote.getRealValue:TRUE
		 *[178]this.minNote==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:TRUE
		 *[178]this.minNote==null:FALSE
		 *[178]value<this.minNote.getRealValue:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:FALSE
		 *[175]value>this.maxNote.getRealValue:FALSE
		 *[178]this.minNote==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:TRUE
		 *[178]this.minNote==null:FALSE
		 *[178]value<this.minNote.getRealValue:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.check(TGLayout, TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#check(TGLayout,TGNoteImpl))*/
	public void testCheckTGLayoutTGNoteImpl_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[175]this.maxNote==null:FALSE
		 *[175]value>this.maxNote.getRealValue:FALSE
		 *[178]this.minNote==null:FALSE
		 *[178]value<this.minNote.getRealValue:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.check(layout, note);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.resetEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#resetEffectsSpacing(TGLayout))*/
	public void testResetEffectsSpacingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.resetEffectsSpacing(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:FALSE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:FALSE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:FALSE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:FALSE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:FALSE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:FALSE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:FALSE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:FALSE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:FALSE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:FALSE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:FALSE
		 *[231]effect.isTrill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.updateEffectsSpacing(TGLayout, TGNoteEffect)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#updateEffectsSpacing(TGLayout,TGNoteEffect))*/
	public void testUpdateEffectsSpacingTGLayoutTGNoteEffect_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[201]effect.isAccentuatedNote:TRUE
		 *[204]effect.isHeavyAccentuatedNote:TRUE
		 *[207]effect.isHarmonic:TRUE
		 *[207]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[210]effect.isTapping:TRUE
		 *[213]effect.isSlapping:TRUE
		 *[216]effect.isPopping:TRUE
		 *[219]effect.isPalmMute:TRUE
		 *[222]effect.isLetRing:TRUE
		 *[225]effect.isFadeIn:TRUE
		 *[228]effect.isVibrato:TRUE
		 *[231]effect.isTrill:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGNoteEffect effect = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.updateEffectsSpacing(layout, effect);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:FALSE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:FALSE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:FALSE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:FALSE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:FALSE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:FALSE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:FALSE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:FALSE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:FALSE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:FALSE
		 *[267]this.trill:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getEffectsSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getEffectsSpacing(TGLayout))*/
	public void testGetEffectsSpacingTGLayout_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[237]this.accentuated:TRUE
		 *[240]this.heavyAccentuated:TRUE
		 *[243]this.harmonic:TRUE
		 *[246]this.tapping:TRUE
		 *[249]this.slapping:TRUE
		 *[252]this.popping:TRUE
		 *[255]this.palmMute:TRUE
		 *[258]this.letRing:TRUE
		 *[261]this.fadeIn:TRUE
		 *[264]this.vibrato:TRUE
		 *[267]this.trill:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getEffectsSpacing(layout);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:TRUE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[274]!layout.isPlayModeEnabled:FALSE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:TRUE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:TRUE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:TRUE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:FALSE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[274]!layout.isPlayModeEnabled:TRUE
		 *[274]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[277]v<TGBeat.MAX_VOICES:TRUE
		 *[277]v<TGBeat.MAX_VOICES:FALSE
		 *[280]!layout.isPlayModeEnabled:TRUE
		 *[281]isChordBeat:TRUE
		 *[285]getStroke:.getDirection:!=TGStroke.STROKE_NONE:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintExtraLines(TGPainter,TGLayout,int,int))*/
	public void testPaintExtraLinesTGPainterTGLayoutIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[292]!isRestBeat:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintExtraLines(painter, layout, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintExtraLines(TGPainter,TGLayout,int,int))*/
	public void testPaintExtraLinesTGPainterTGLayoutIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[292]!isRestBeat:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;
		TGLayout layout = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintExtraLines(painter, layout, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, TGNoteImpl, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintExtraLinesTGPainterTGLayoutTGNoteImplIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, TGNoteImpl, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintExtraLinesTGPainterTGLayoutTGNoteImplIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, TGNoteImpl, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintExtraLinesTGPainterTGLayoutTGNoteImplIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, TGNoteImpl, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintExtraLinesTGPainterTGLayoutTGNoteImplIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintExtraLines(TGPainter, TGLayout, TGNoteImpl, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintExtraLinesTGPainterTGLayoutTGNoteImplIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[344]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:FALSE
		 *[360]getStroke:.getDirection:==TGStroke.STROKE_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[344]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:FALSE
		 *[360]getStroke:.getDirection:==TGStroke.STROKE_DOWN:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.paintStroke(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#paintStroke(TGLayout,TGPainter,int,int))*/
	public void testPaintStrokeTGLayoutTGPainterIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[334]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[339]style&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[344]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[351]getStroke:.getDirection:==TGStroke.STROKE_UP:FALSE
		 *[360]getStroke:.getDirection:==TGStroke.STROKE_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.paintStroke(layout, painter, fromX, fromY);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getPaintPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getPaintPosition(int))*/
	public void testGetPaintPositionInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.getPaintPosition(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.getBs()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#getBs())*/
	public void testGetBs() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGBeatSpacing methodReturn = constructorInstance.getBs();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#dispose())*/
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
		 *[389]isChordBeat:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.dispose();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGBeatImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGBeatImpl#dispose())*/
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
		 *[389]isChordBeat:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.dispose();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getMeasure()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getMeasure())*/
	public void testGetMeasure() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGMeasure methodReturn = constructorInstance.getMeasure();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setMeasure(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setMeasure(TGMeasure))*/
	public void testSetMeasureTGMeasure() {
		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setMeasure(measure);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getStart())*/
	public void testGetStart() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		long methodReturn = constructorInstance.getStart();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setStart(long))*/
	public void testSetStartLong() {
		// Method under test arguments
		long start = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setStart(start);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setVoice(int, TGVoice)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setVoice(int,TGVoice))*/
	public void testSetVoiceIntTGVoice_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]index>=0:TRUE
		 *[53]index<this.voices.length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;
		TGVoice voice = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setVoice(index, voice);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setVoice(int, TGVoice)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setVoice(int,TGVoice))*/
	public void testSetVoiceIntTGVoice_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;
		TGVoice voice = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setVoice(index, voice);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setVoice(int, TGVoice)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setVoice(int,TGVoice))*/
	public void testSetVoiceIntTGVoice_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[53]index>=0:TRUE
		 *[53]index<this.voices.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;
		TGVoice voice = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setVoice(index, voice);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getVoice(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getVoice(int))*/
	public void testGetVoiceInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]index>=0:TRUE
		 *[60]index<this.voices.length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGVoice methodReturn = constructorInstance.getVoice(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getVoice(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getVoice(int))*/
	public void testGetVoiceInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGVoice methodReturn = constructorInstance.getVoice(index);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getVoice(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getVoice(int))*/
	public void testGetVoiceInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]index>=0:TRUE
		 *[60]index<this.voices.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGVoice methodReturn = constructorInstance.getVoice(index);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.countVoices()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#countVoices())*/
	public void testCountVoices() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		int methodReturn = constructorInstance.countVoices();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setChord(TGChord)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setChord(TGChord))*/
	public void testSetChordTGChord() {
		// Method under test arguments
		TGChord chord = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setChord(chord);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getChord()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getChord())*/
	public void testGetChord() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGChord methodReturn = constructorInstance.getChord();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getText()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getText())*/
	public void testGetText() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGText methodReturn = constructorInstance.getText();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.setText(TGText)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#setText(TGText))*/
	public void testSetTextTGText() {
		// Method under test arguments
		TGText text = null;

		// Constructor arguments
		TGFactory factory = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.setText(text);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.removeText()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#removeText())*/
	public void testRemoveText() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		constructorInstance.removeText();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isChordBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isChordBeat())*/
	public void testIsChordBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[97]this.chord!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isChordBeat();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isChordBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isChordBeat())*/
	public void testIsChordBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[97]this.chord!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isChordBeat();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isTextBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isTextBeat())*/
	public void testIsTextBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[101]this.text!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isTextBeat();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isTextBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isTextBeat())*/
	public void testIsTextBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[101]this.text!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isTextBeat();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.getStroke()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#getStroke())*/
	public void testGetStroke() {

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		TGStroke methodReturn = constructorInstance.getStroke();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isRestBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isRestBeat())*/
	public void testIsRestBeat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]v<this.countVoices:TRUE
		 *[111]!voice.isEmpty:TRUE
		 *[111]!voice.isRestVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isRestBeat();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isRestBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isRestBeat())*/
	public void testIsRestBeat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]v<this.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isRestBeat();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isRestBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isRestBeat())*/
	public void testIsRestBeat_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]v<this.countVoices:TRUE
		 *[111]!voice.isEmpty:FALSE
		 *[109]v<this.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isRestBeat();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.isRestBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#isRestBeat())*/
	public void testIsRestBeat_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[109]v<this.countVoices:TRUE
		 *[111]!voice.isEmpty:TRUE
		 *[111]!voice.isRestVoice:FALSE
		 *[109]v<this.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGBeatImpl constructorInstance = new TGBeatImpl(factory);

		boolean methodReturn = constructorInstance.isRestBeat();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#clone(TGFactory))*/
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
		 *[122]i<this.voices.length:TRUE
		 *[122]i<this.voices.length:FALSE
		 *[125]this.chord!=null:TRUE
		 *[128]this.text!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory_c);

		TGBeat methodReturn = constructorInstance.clone(factory_c);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#clone(TGFactory))*/
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
		 *[122]i<this.voices.length:FALSE
		 *[125]this.chord!=null:TRUE
		 *[128]this.text!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory_c);

		TGBeat methodReturn = constructorInstance.clone(factory_c);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#clone(TGFactory))*/
	public void testCloneTGFactory_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[122]i<this.voices.length:TRUE
		 *[122]i<this.voices.length:FALSE
		 *[125]this.chord!=null:FALSE
		 *[128]this.text!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory_c);

		TGBeat methodReturn = constructorInstance.clone(factory_c);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGBeat.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGBeat#clone(TGFactory))*/
	public void testCloneTGFactory_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[122]i<this.voices.length:TRUE
		 *[122]i<this.voices.length:FALSE
		 *[125]this.chord!=null:TRUE
		 *[128]this.text!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGBeatImpl constructorInstance = new TGBeatImpl(factory_c);

		TGBeat methodReturn = constructorInstance.clone(factory_c);
		fail("Path 4 assertion not implemented.");
	}

}
