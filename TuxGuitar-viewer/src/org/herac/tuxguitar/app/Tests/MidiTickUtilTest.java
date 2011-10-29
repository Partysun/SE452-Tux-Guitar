package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.util.MidiTickUtil;

public class MidiTickUtilTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:FALSE
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:FALSE
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:FALSE
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:FALSE
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:FALSE
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:FALSE
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:FALSE
		 *[16]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getStart(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getStart(long))*/
	public void testGetStartLong_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:FALSE
		 *[16]!controller.finished:TRUE
		 *[19]controller.shouldPlay:TRUE
		 *[22]tick>=start:TRUE
		 *[22]tick<start+length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		long tick = 0;

		long methodReturn = MidiTickUtil.getStart(tick);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:TRUE
		 *[42]start>=header.getStart:TRUE
		 *[42]start<header.getStart:+length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:FALSE
		 *[36]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:TRUE
		 *[42]start>=header.getStart:FALSE
		 *[36]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:TRUE
		 *[42]start>=header.getStart:TRUE
		 *[42]start<header.getStart:+length:FALSE
		 *[36]!controller.finished:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.MidiTickUtil.getTick(long)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.MidiTickUtil#getTick(long))*/
	public void testGetTickLong_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:TRUE
		 *[42]start>=header.getStart:TRUE
		 *[42]start<header.getStart:+length:FALSE
		 *[36]!controller.finished:TRUE
		 *[39]controller.shouldPlay:TRUE
		 *[42]start>=header.getStart:TRUE
		 *[42]start<header.getStart:+length:TRUE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;

		long methodReturn = MidiTickUtil.getTick(start);
		fail("Path 6 assertion not implemented.");
	}

}
