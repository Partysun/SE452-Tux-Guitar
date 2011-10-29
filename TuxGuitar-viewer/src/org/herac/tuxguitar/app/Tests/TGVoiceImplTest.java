package org.herac.tuxguitar.app.Tests;

import java.util.List;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGBeatGroup;
import org.herac.tuxguitar.graphics.control.TGBeatImpl;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.graphics.control.TGNoteImpl;
import org.herac.tuxguitar.graphics.control.TGVoiceImpl;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGDuration;
import org.herac.tuxguitar.song.models.TGNote;
import org.herac.tuxguitar.song.models.TGVoice;

public class TGVoiceImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.TGVoiceImpl(TGFactory, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#TGVoiceImpl(TGFactory,int))*/
	public void testTGVoiceImplTGFactoryInt() {
		// Method under test arguments
		TGFactory factory = null;
		int index = 0;

		// Constructor under test arguments// Constructor under test
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getPosX())*/
	public void testGetPosX() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getPosX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getWidth())*/
	public void testGetWidth() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setWidth(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setWidth(int))*/
	public void testSetWidthInt() {
		// Method under test arguments
		int width = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setWidth(width);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMinNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMinNote())*/
	public void testGetMinNote() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGNoteImpl methodReturn = constructorInstance.getMinNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMaxNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMaxNote())*/
	public void testGetMaxNote() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGNoteImpl methodReturn = constructorInstance.getMaxNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getBeatImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getBeatImpl())*/
	public void testGetBeatImpl() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGBeatImpl methodReturn = constructorInstance.getBeatImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMeasureImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMeasureImpl())*/
	public void testGetMeasureImpl() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGMeasureImpl methodReturn = constructorInstance.getMeasureImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getUsedStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getUsedStrings())*/
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
		 *[86]this.usedStrings==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean[] methodReturn = constructorInstance.getUsedStrings();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getUsedStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getUsedStrings())*/
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
		 *[86]this.usedStrings==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean[] methodReturn = constructorInstance.getUsedStrings();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getJoin1()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getJoin1())*/
	public void testGetJoin1() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGVoiceImpl methodReturn = constructorInstance.getJoin1();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setJoin1(TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setJoin1(TGVoiceImpl))*/
	public void testSetJoin1TGVoiceImpl() {
		// Method under test arguments
		TGVoiceImpl join1 = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setJoin1(join1);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getJoin2()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getJoin2())*/
	public void testGetJoin2() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGVoiceImpl methodReturn = constructorInstance.getJoin2();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setJoin2(TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setJoin2(TGVoiceImpl))*/
	public void testSetJoin2TGVoiceImpl() {
		// Method under test arguments
		TGVoiceImpl join2 = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setJoin2(join2);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.isJoinedGreaterThanQuarter()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#isJoinedGreaterThanQuarter())*/
	public void testIsJoinedGreaterThanQuarter() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean methodReturn = constructorInstance.isJoinedGreaterThanQuarter();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setJoinedGreaterThanQuarter(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setJoinedGreaterThanQuarter(boolean))*/
	public void testSetJoinedGreaterThanQuarterBoolean() {
		// Method under test arguments
		boolean joinedGreaterThanQuarter = true;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance
				.setJoinedGreaterThanQuarter(joinedGreaterThanQuarter);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getJoinedType()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getJoinedType())*/
	public void testGetJoinedType() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getJoinedType();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setJoinedType(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setJoinedType(int))*/
	public void testSetJoinedTypeInt() {
		// Method under test arguments
		int joinedType = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setJoinedType(joinedType);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setPreviousBeat(TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setPreviousBeat(TGVoiceImpl))*/
	public void testSetPreviousBeatTGVoiceImpl() {
		// Method under test arguments
		TGVoiceImpl previous = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setPreviousBeat(previous);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setNextBeat(TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setNextBeat(TGVoiceImpl))*/
	public void testSetNextBeatTGVoiceImpl() {
		// Method under test arguments
		TGVoiceImpl next = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setNextBeat(next);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getBeatGroup()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getBeatGroup())*/
	public void testGetBeatGroup() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		TGBeatGroup methodReturn = constructorInstance.getBeatGroup();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setBeatGroup(TGBeatGroup)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setBeatGroup(TGBeatGroup))*/
	public void testSetBeatGroupTGBeatGroup() {
		// Method under test arguments
		TGBeatGroup group = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setBeatGroup(group);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.isPlaying(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#isPlaying(TGLayout))*/
	public void testIsPlayingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean methodReturn = constructorInstance.isPlaying(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.reset()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#reset())*/
	public void testReset() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.reset();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:TRUE
		 *[162]this.minNote==null:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:FALSE
		 *[159]value>this.maxNote.getRealValue:TRUE
		 *[162]this.minNote==null:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:TRUE
		 *[162]this.minNote==null:FALSE
		 *[162]value<this.minNote.getRealValue:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:TRUE
		 *[162]this.minNote==null:TRUE
		 *[168]note.getString:>this.maxString:FALSE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:TRUE
		 *[162]this.minNote==null:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:FALSE
		 *[159]value>this.maxNote.getRealValue:FALSE
		 *[162]this.minNote==null:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:TRUE
		 *[162]this.minNote==null:FALSE
		 *[162]value<this.minNote.getRealValue:FALSE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.check(TGNoteImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#check(TGNoteImpl))*/
	public void testCheckTGNoteImpl_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]this.maxNote==null:FALSE
		 *[159]value>this.maxNote.getRealValue:FALSE
		 *[162]this.minNote==null:FALSE
		 *[162]value<this.minNote.getRealValue:TRUE
		 *[168]note.getString:>this.maxString:TRUE
		 *[171]note.getString:<this.minString:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGNoteImpl note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.check(note);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.update(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#update(TGLayout))*/
	public void testUpdateTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[179]isRestVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.update(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.update(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#update(TGLayout))*/
	public void testUpdateTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[179]isRestVoice:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.update(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:FALSE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:FALSE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:FALSE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:FALSE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:FALSE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:FALSE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:FALSE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:FALSE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:FALSE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:FALSE
		 *[217]this.previous.isRestVoice:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:FALSE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:FALSE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:FALSE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:FALSE
		 *[217]this.previous.isRestVoice:FALSE
		 *[217]this.previous.getDuration:.getValue:<getDuration:.getValue:TRUE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:FALSE
		 *[217]this.previous.isRestVoice:FALSE
		 *[217]this.previous.getDuration:.getValue:<getDuration:.getValue:FALSE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:FALSE
		 *[217]this.previous.isRestVoice:FALSE
		 *[217]this.previous.getDuration:.getValue:<getDuration:.getValue:FALSE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:TRUE
		 *[200]this.previous.getDuration:.getValue:>=getDuration:.getValue:FALSE
		 *[206]this.previous.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:FALSE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateNoteVoice(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateNoteVoice(TGLayout))*/
	public void testUpdateNoteVoiceTGLayout_Path22() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[197]this.previous!=null:TRUE
		 *[197]!this.previous.isRestVoice:TRUE
		 *[198]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.previous:FALSE
		 *[213]this.next!=null:TRUE
		 *[213]!this.next.isRestVoice:TRUE
		 *[214]getMeasureImpl:.canJoinlayout.getSongManager:,this,this.next:TRUE
		 *[215]this.next.getDuration:.getValue:>=getDuration:.getValue:TRUE
		 *[217]this.previous==null:FALSE
		 *[217]this.previous.isRestVoice:FALSE
		 *[217]this.previous.getDuration:.getValue:<getDuration:.getValue:FALSE
		 *[223]this.next.getDuration:.getValue:>TGDuration.QUARTER:TRUE
		 *[230]!noteJoined:TRUE
		 *[230]withPrev:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[234]layout.getStyle:&TGLayout.DISPLAY_SCORE:==0:TRUE
		 *[237]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateNoteVoice(layout);
		fail("Path 22 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:TRUE
		 *[271]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:FALSE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:TRUE
		 *[271]lineCount<=5:FALSE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path22() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 22 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path23() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 23 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path24() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:FALSE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 24 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path25() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:FALSE
		 *[285]duration==TGDuration.THIRTY_SECOND:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 25 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path26() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:FALSE
		 *[285]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[289]duration==TGDuration.SIXTY_FOURTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 26 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path27() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:FALSE
		 *[285]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[289]duration==TGDuration.SIXTY_FOURTH:FALSE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 27 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path28() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 28 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path29() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 29 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path30() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 30 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path31() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 31 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path32() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 32 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path33() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 33 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path34() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 34 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path35() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 35 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path36() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 36 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path37() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 37 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path38() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 38 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path39() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 39 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path40() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[312]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 40 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path41() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[310]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[315]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[317]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 41 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path42() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[325]position>this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 42 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path43() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:FALSE
		 *[305]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[321]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[323]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[329]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[331]position<this.silenceY:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 43 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path44() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:TRUE
		 *[267]lineCount<=5:FALSE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 44 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path45() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:TRUE
		 *[271]lineCount<=5:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 45 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path46() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:TRUE
		 *[271]lineCount<=5:FALSE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 46 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path47() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 47 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path48() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 48 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path49() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 49 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path50() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:FALSE
		 *[285]duration==TGDuration.THIRTY_SECOND:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 50 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.updateSilenceSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#updateSilenceSpacing(TGLayout))*/
	public void testUpdateSilenceSpacingTGLayout_Path51() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[249]!isHiddenSilence:TRUE
		 *[254]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[265]duration==TGDuration.WHOLE:FALSE
		 *[269]duration==TGDuration.HALF:FALSE
		 *[273]duration==TGDuration.QUARTER:FALSE
		 *[277]duration==TGDuration.EIGHTH:FALSE
		 *[281]duration==TGDuration.SIXTEENTH:FALSE
		 *[285]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[289]duration==TGDuration.SIXTY_FOURTH:TRUE
		 *[294]v<getBeat:.countVoices:TRUE
		 *[295]v!=getIndex:TRUE
		 *[297]!voice.isEmpty:TRUE
		 *[298]voice.isRestVoice:TRUE
		 *[299]!voice.isHiddenSilence:TRUE
		 *[294]v<getBeat:.countVoices:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.updateSilenceSpacing(layout);
		fail("Path 51 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:TRUE
		 *[346]!isHiddenSilence:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:FALSE
		 *[351]notes.hasNext:TRUE
		 *[351]notes.hasNext:FALSE
		 *[355]!layout.isPlayModeEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:TRUE
		 *[346]!isHiddenSilence:FALSE
		 *[351]notes.hasNext:TRUE
		 *[351]notes.hasNext:FALSE
		 *[355]!layout.isPlayModeEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:FALSE
		 *[351]notes.hasNext:FALSE
		 *[355]!layout.isPlayModeEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:FALSE
		 *[351]notes.hasNext:TRUE
		 *[351]notes.hasNext:FALSE
		 *[355]!layout.isPlayModeEnabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paint(TGLayout,TGPainter,int,int))*/
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
		 *[345]!isEmpty:TRUE
		 *[346]isRestVoice:TRUE
		 *[346]!isHiddenSilence:FALSE
		 *[351]notes.hasNext:FALSE
		 *[355]!layout.isPlayModeEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:FALSE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:FALSE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:FALSE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[404]duration==TGDuration.SIXTY_FOURTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[404]duration==TGDuration.SIXTY_FOURTH:FALSE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:FALSE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path22() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 22 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path23() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:FALSE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[404]duration==TGDuration.SIXTY_FOURTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 23 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path24() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:FALSE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 24 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path25() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:FALSE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 25 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path26() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:TRUE
		 *[410]getDuration:.isDotted:FALSE
		 *[410]getDuration:.isDoubleDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 26 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path27() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 27 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path28() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 28 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path29() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 29 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path30() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 30 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path31() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 31 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintSilence(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintSilence(TGLayout,TGPainter,int,int))*/
	public void testPaintSilenceTGLayoutTGPainterIntInt_Path32() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[370]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[382]layout.isPlayModeEnabled:TRUE
		 *[382]isPlayinglayout:TRUE
		 *[386]duration==TGDuration.WHOLE:FALSE
		 *[389]duration==TGDuration.HALF:FALSE
		 *[392]duration==TGDuration.QUARTER:FALSE
		 *[395]duration==TGDuration.EIGHTH:FALSE
		 *[398]duration==TGDuration.SIXTEENTH:FALSE
		 *[401]duration==TGDuration.THIRTY_SECOND:FALSE
		 *[404]duration==TGDuration.SIXTY_FOURTH:TRUE
		 *[410]getDuration:.isDotted:TRUE
		 *[415]getDuration:.isDoubleDotted:TRUE
		 *[421]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[423]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintSilence(layout, painter, fromX, fromY);
		fail("Path 32 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setStyle(TGLayout, TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setStyle(TGLayout,TGPainter,boolean))*/
	public void testSetStyleTGLayoutTGPainterBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[432]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		boolean playMode = true;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setStyle(layout, painter, playMode);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setStyle(TGLayout, TGPainter, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setStyle(TGLayout,TGPainter,boolean))*/
	public void testSetStyleTGLayoutTGPainterBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[432]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		boolean playMode = true;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setStyle(layout, painter, playMode);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintBeat(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintBeat(TGLayout,TGPainter,int,int))*/
	public void testPaintBeatTGLayoutTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[440]!isRestVoice:TRUE
		 *[444]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintBeat(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintBeat(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintBeat(TGLayout,TGPainter,int,int))*/
	public void testPaintBeatTGLayoutTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[440]!isRestVoice:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintBeat(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintBeat(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintBeat(TGLayout,TGPainter,int,int))*/
	public void testPaintBeatTGLayoutTGPainterIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[440]!isRestVoice:TRUE
		 *[444]style&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 *[447]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_SCORE:==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintBeat(layout, painter, fromX, fromY);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintBeat(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintBeat(TGLayout,TGPainter,int,int))*/
	public void testPaintBeatTGLayoutTGPainterIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[440]!isRestVoice:TRUE
		 *[444]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintBeat(layout, painter, fromX, fromY);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintBeat(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintBeat(TGLayout,TGPainter,int,int))*/
	public void testPaintBeatTGLayoutTGPainterIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[440]!isRestVoice:TRUE
		 *[444]style&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 *[447]style&TGLayout.DISPLAY_SCORE:==0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintBeat(layout, painter, fromX, fromY);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:FALSE
		 *[506]getDuration:.getValue:==TGDuration.HALF:TRUE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[485]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:FALSE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:FALSE
		 *[506]getDuration:.getValue:==TGDuration.HALF:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[485]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:FALSE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:FALSE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:FALSE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path22() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 22 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path23() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 23 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path24() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 24 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path25() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 25 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path26() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 26 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path27() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:FALSE
		 *[506]getDuration:.getValue:==TGDuration.HALF:TRUE
		 *[517]getDuration:.isDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 27 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintTablatureBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintTablatureBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintTablatureBeatTGLayoutTGPainterIntIntInt_Path28() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[454]!isRestVoice:TRUE
		 *[463]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[470]getDuration:.getValue:>=TGDuration.QUARTER:TRUE
		 *[478]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[482]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[493]index>0:TRUE
		 *[495]getBeatGroup:.getDirection:==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[498]i>0:FALSE
		 *[517]getDuration:.isDotted:FALSE
		 *[517]getDuration:.isDoubleDotted:TRUE
		 *[519]getDuration:.getValue:>TGDuration.WHOLE:TRUE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[519]joinedType==TGVoiceImpl.JOINED_TYPE_RIGHT:FALSE
		 *[520]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[525]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintTablatureBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 28 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:FALSE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:FALSE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:TRUE
		 *[572]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[583]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[583]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path18() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[583]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 18 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path19() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 19 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path20() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[583]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:TRUE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 20 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintScoreBeat(TGLayout, TGPainter, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintScoreBeat(TGLayout,TGPainter,int,int,int))*/
	public void testPaintScoreBeatTGLayoutTGPainterIntIntInt_Path21() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[536]!getDuration:.getDivision:.isEqualTGDivisionType.NORMAL:TRUE
		 *[541]getDuration:.getValue:>=TGDuration.HALF:TRUE
		 *[550]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[551]direction==TGBeatGroup.DIRECTION_UP:TRUE
		 *[553]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[562]getDuration:.getValue:>=TGDuration.EIGHTH:TRUE
		 *[564]index>=0:TRUE
		 *[565]direction==TGBeatGroup.DIRECTION_DOWN:TRUE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[569]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:TRUE
		 *[569]!joinedGreaterThanQuarter:FALSE
		 *[580]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_RIGHT:FALSE
		 *[583]joinedType==TGVoiceImpl.JOINED_TYPE_NONE_LEFT:FALSE
		 *[594]i<=index:TRUE
		 *[594]i<=index:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;
		int spacing = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintScoreBeat(layout, painter, fromX, fromY,
				spacing);
		fail("Path 21 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintDot(TGLayout, TGPainter, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintDot(TGLayout,TGPainter,float,float,float))*/
	public void testPaintDotTGLayoutTGPainterFloatFloatFloat_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[614]getDuration:.isDoubleDotted:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		float fromX = 0f;
		float fromY = 0f;
		float scale = 0f;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintDot(layout, painter, fromX, fromY, scale);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.paintDot(TGLayout, TGPainter, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#paintDot(TGLayout,TGPainter,float,float,float))*/
	public void testPaintDotTGLayoutTGPainterFloatFloatFloat_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[614]getDuration:.isDoubleDotted:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		float fromX = 0f;
		float fromY = 0f;
		float scale = 0f;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.paintDot(layout, painter, fromX, fromY, scale);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getPaintPosition(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getPaintPosition(int))*/
	public void testGetPaintPositionInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		int methodReturn = constructorInstance.getPaintPosition(index_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMaxString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMaxString())*/
	public void testGetMaxString() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getMaxString();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMinString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMinString())*/
	public void testGetMinString() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getMinString();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMaxY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMaxY())*/
	public void testGetMaxY() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getMaxY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.getMinY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#getMinY())*/
	public void testGetMinY() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getMinY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.isHiddenSilence()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#isHiddenSilence())*/
	public void testIsHiddenSilence() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean methodReturn = constructorInstance.isHiddenSilence();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGVoiceImpl.setHiddenSilence(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGVoiceImpl#setHiddenSilence(boolean))*/
	public void testSetHiddenSilenceBoolean() {
		// Method under test arguments
		boolean hiddenSilence = true;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setHiddenSilence(hiddenSilence);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getIndex()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getIndex())*/
	public void testGetIndex() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getIndex();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.setIndex(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#setIndex(int))*/
	public void testSetIndexInt() {
		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		constructorInstance.setIndex(index_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.isEmpty()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#isEmpty())*/
	public void testIsEmpty() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean methodReturn = constructorInstance.isEmpty();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.setEmpty(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#setEmpty(boolean))*/
	public void testSetEmptyBoolean() {
		// Method under test arguments
		boolean empty = true;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setEmpty(empty);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getDirection()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getDirection())*/
	public void testGetDirection() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.getDirection();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.setDirection(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#setDirection(int))*/
	public void testSetDirectionInt() {
		// Method under test arguments
		int direction = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setDirection(direction);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getDuration()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getDuration())*/
	public void testGetDuration() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		@SuppressWarnings("unused")
		TGDuration methodReturn = constructorInstance.getDuration();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.setDuration(TGDuration)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#setDuration(TGDuration))*/
	public void testSetDurationTGDuration() {
		// Method under test arguments
		TGDuration duration = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setDuration(duration);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getBeat())*/
	public void testGetBeat() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		@SuppressWarnings("unused")
		TGBeat methodReturn = constructorInstance.getBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.setBeat(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#setBeat(TGBeat))*/
	public void testSetBeatTGBeat() {
		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.setBeat(beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getNotes()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getNotes())*/
	@SuppressWarnings("unused")
	public void testGetNotes() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		@SuppressWarnings("rawtypes")
		List methodReturn = constructorInstance.getNotes();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.addNote(TGNote)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#addNote(TGNote))*/
	public void testAddNoteTGNote() {
		// Method under test arguments
		TGNote note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.addNote(note);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.moveNote(int, TGNote)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#moveNote(int,TGNote))*/
	public void testMoveNoteIntTGNote() {
		// Method under test arguments
		@SuppressWarnings("unused")
		int index = 0;
		TGNote note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		constructorInstance.moveNote(index_c, note);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.removeNote(TGNote)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#removeNote(TGNote))*/
	public void testRemoveNoteTGNote() {
		// Method under test arguments
		TGNote note = null;

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		constructorInstance.removeNote(note);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getNote(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getNote(int))*/
	public void testGetNoteInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[100]index>=0:TRUE
		 *[100]index<countNotes:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		TGNote methodReturn = constructorInstance.getNote(index_c);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getNote(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getNote(int))*/
	public void testGetNoteInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[100]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		TGNote methodReturn = constructorInstance.getNote(index_c);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.getNote(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#getNote(int))*/
	public void testGetNoteInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[100]index>=0:TRUE
		 *[100]index<countNotes:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;
		int index_c = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index_c);

		TGNote methodReturn = constructorInstance.getNote(index_c);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.countNotes()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#countNotes())*/
	public void testCountNotes() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		int methodReturn = constructorInstance.countNotes();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.isRestVoice()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#isRestVoice())*/
	public void testIsRestVoice() {

		// Constructor arguments
		TGFactory factory = null;
		int index = 0;
		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory, index);

		boolean methodReturn = constructorInstance.isRestVoice();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#clone(TGFactory))*/
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
		 *[119]i<countNotes:TRUE
		 *[119]i<countNotes:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory_c, index);

		TGVoice methodReturn = constructorInstance.clone(factory_c);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGVoice.clone(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGVoice#clone(TGFactory))*/
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
		 *[119]i<countNotes:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;

		// Constructor arguments
		TGFactory factory_c = null;
		int index = 0;

		TGVoiceImpl constructorInstance = new TGVoiceImpl(factory_c, index);

		TGVoice methodReturn = constructorInstance.clone(factory_c);
		fail("Path 2 assertion not implemented.");
	}

}
