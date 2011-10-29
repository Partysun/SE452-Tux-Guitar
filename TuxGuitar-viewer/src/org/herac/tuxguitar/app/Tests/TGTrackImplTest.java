package org.herac.tuxguitar.app.Tests;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGTrackImpl;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.models.TGChannel;
import org.herac.tuxguitar.song.models.TGColor;
import org.herac.tuxguitar.song.models.TGLyric;
import org.herac.tuxguitar.song.models.TGMeasure;
import org.herac.tuxguitar.song.models.TGSong;
import org.herac.tuxguitar.song.models.TGString;
import org.herac.tuxguitar.song.models.TGTrack;

public class TGTrackImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.removeMeasure(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#removeMeasure(int))*/
	public void testRemoveMeasureInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[71]!measure.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.removeMeasure(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.removeMeasure(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#removeMeasure(int))*/
	public void testRemoveMeasureInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[71]!measure.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.removeMeasure(index);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#clear())*/
	public void testClear_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]measures.hasNext:TRUE
		 *[62]!measure.isDisposed:TRUE
		 *[60]measures.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.clear();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#clear())*/
	public void testClear_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]measures.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.clear();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#clear())*/
	public void testClear_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[60]measures.hasNext:TRUE
		 *[62]!measure.isDisposed:FALSE
		 *[60]measures.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.clear();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.TGTrackImpl(TGFactory)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#TGTrackImpl(TGFactory))*/
	public void testTGTrackImplTGFactory() {
		// Method under test arguments
		TGFactory factory = null;

		// Constructor under test arguments// Constructor under test
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.update(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#update(TGLayout))*/
	public void testUpdateTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.update(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.calculateTabHeight(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#calculateTabHeight(TGLayout))*/
	public void testCalculateTabHeightTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.calculateTabHeight(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.calculateTabHeight(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#calculateTabHeight(TGLayout))*/
	public void testCalculateTabHeightTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]layout.getStyle:&TGLayout.DISPLAY_TABLATURE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.calculateTabHeight(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.calculateScoreHeight(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#calculateScoreHeight(TGLayout))*/
	public void testCalculateScoreHeightTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.calculateScoreHeight(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.calculateScoreHeight(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#calculateScoreHeight(TGLayout))*/
	public void testCalculateScoreHeightTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.calculateScoreHeight(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.getTabHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#getTabHeight())*/
	public void testGetTabHeight() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.getTabHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.getScoreHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#getScoreHeight())*/
	public void testGetScoreHeight() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.getScoreHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTrackImpl.setTabHeight(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTrackImpl#setTabHeight(int))*/
	public void testSetTabHeightInt() {
		// Method under test arguments
		int tabHeight = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setTabHeight(tabHeight);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getNumber()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getNumber())*/
	public void testGetNumber() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.getNumber();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setNumber(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setNumber(int))*/
	public void testSetNumberInt() {
		// Method under test arguments
		int number = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setNumber(number);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getMeasures()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getMeasures())*/
	public void testGetMeasures() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		Iterator methodReturn = constructorInstance.getMeasures();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.addMeasure(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#addMeasure(TGMeasure))*/
	public void testAddMeasureTGMeasure() {
		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.addMeasure(measure);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.addMeasure(int, TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#addMeasure(int,TGMeasure))*/
	public void testAddMeasureIntTGMeasure() {
		// Method under test arguments
		int index = 0;
		TGMeasure measure = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.addMeasure(index, measure);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getMeasure(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getMeasure(int))*/
	public void testGetMeasureInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[72]index>=0:TRUE
		 *[72]index<countMeasures:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGMeasure methodReturn = constructorInstance.getMeasure(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getMeasure(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getMeasure(int))*/
	public void testGetMeasureInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[72]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGMeasure methodReturn = constructorInstance.getMeasure(index);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getMeasure(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getMeasure(int))*/
	public void testGetMeasureInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[72]index>=0:TRUE
		 *[72]index<countMeasures:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGMeasure methodReturn = constructorInstance.getMeasure(index);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.countMeasures()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#countMeasures())*/
	public void testCountMeasures() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.countMeasures();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getChannel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getChannel())*/
	public void testGetChannel() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGChannel methodReturn = constructorInstance.getChannel();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setChannel(TGChannel)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setChannel(TGChannel))*/
	public void testSetChannelTGChannel() {
		// Method under test arguments
		TGChannel channel = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setChannel(channel);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getStrings()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getStrings())*/
	public void testGetStrings() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		List methodReturn = constructorInstance.getStrings();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setStrings(List)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setStrings(List))*/
	public void testSetStringsList() {
		// Method under test arguments
		List strings = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setStrings(strings);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getColor())*/
	public void testGetColor() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGColor methodReturn = constructorInstance.getColor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setColor(TGColor)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setColor(TGColor))*/
	public void testSetColorTGColor() {
		// Method under test arguments
		TGColor color = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setColor(color);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getName())*/
	public void testGetName() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		String methodReturn = constructorInstance.getName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setName(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setName(String))*/
	public void testSetNameString() {
		// Method under test arguments
		String name = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setName(name);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getOffset()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getOffset())*/
	public void testGetOffset() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.getOffset();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setOffset(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setOffset(int))*/
	public void testSetOffsetInt() {
		// Method under test arguments
		int offset = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setOffset(offset);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.isSolo()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#isSolo())*/
	public void testIsSolo() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		boolean methodReturn = constructorInstance.isSolo();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setSolo(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setSolo(boolean))*/
	public void testSetSoloBoolean() {
		// Method under test arguments
		boolean solo = true;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setSolo(solo);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.isMute()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#isMute())*/
	public void testIsMute() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		boolean methodReturn = constructorInstance.isMute();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setMute(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setMute(boolean))*/
	public void testSetMuteBoolean() {
		// Method under test arguments
		boolean mute = true;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setMute(mute);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getLyrics()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getLyrics())*/
	public void testGetLyrics() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGLyric methodReturn = constructorInstance.getLyrics();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setLyrics(TGLyric)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setLyrics(TGLyric))*/
	public void testSetLyricsTGLyric() {
		// Method under test arguments
		TGLyric lyrics = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setLyrics(lyrics);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getString(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getString(int))*/
	public void testGetStringInt() {
		// Method under test arguments
		int number = 0;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGString methodReturn = constructorInstance.getString(number);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.stringCount()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#stringCount())*/
	public void testStringCount() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		int methodReturn = constructorInstance.stringCount();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.isPercussionTrack()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#isPercussionTrack())*/
	public void testIsPercussionTrack() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		boolean methodReturn = constructorInstance.isPercussionTrack();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.getSong()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#getSong())*/
	public void testGetSong() {

		// Constructor arguments
		TGFactory factory = null;
		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		TGSong methodReturn = constructorInstance.getSong();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.setSong(TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#setSong(TGSong))*/
	public void testSetSongTGSong() {
		// Method under test arguments
		TGSong song = null;

		// Constructor arguments
		TGFactory factory = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory);

		constructorInstance.setSong(song);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.clone(TGFactory, TGSong)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#clone(TGFactory,TGSong))*/
	public void testCloneTGFactoryTGSong() {
		// Method under test arguments
		TGFactory factory = null;
		TGSong song = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory_c);

		TGTrack methodReturn = constructorInstance.clone(factory_c, song);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.copy(TGFactory, TGSong, TGTrack)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#copy(TGFactory,TGSong,TGTrack))*/
	public void testCopyTGFactoryTGSongTGTrack_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[189]i<getStrings:.size:TRUE
		 *[189]i<getStrings:.size:FALSE
		 *[193]i<countMeasures:TRUE
		 *[193]i<countMeasures:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;
		TGSong song = null;
		TGTrack track = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory_c);

		constructorInstance.copy(factory_c, song, track);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.copy(TGFactory, TGSong, TGTrack)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#copy(TGFactory,TGSong,TGTrack))*/
	public void testCopyTGFactoryTGSongTGTrack_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[189]i<getStrings:.size:FALSE
		 *[193]i<countMeasures:TRUE
		 *[193]i<countMeasures:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;
		TGSong song = null;
		TGTrack track = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory_c);

		constructorInstance.copy(factory_c, song, track);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGTrack.copy(TGFactory, TGSong, TGTrack)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGTrack#copy(TGFactory,TGSong,TGTrack))*/
	public void testCopyTGFactoryTGSongTGTrack_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[189]i<getStrings:.size:TRUE
		 *[189]i<getStrings:.size:FALSE
		 *[193]i<countMeasures:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;
		TGSong song = null;
		TGTrack track = null;

		// Constructor arguments
		TGFactory factory_c = null;

		TGTrackImpl constructorInstance = new TGTrackImpl(factory_c);

		constructorInstance.copy(factory_c, song, track);
		fail("Path 3 assertion not implemented.");
	}

}
