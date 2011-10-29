package org.herac.tuxguitar.app.Tests;

import org.herac.tuxguitar.app.actions.ActionLock;

import junit.framework.TestCase;

public class ActionLockTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.isLocked()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#isLocked())*/
	public void testIsLocked() {

		boolean methodReturn = ActionLock.isLocked();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#lock())*/
	public void testLock() {

		ActionLock.lock();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.unlock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#unlock())*/
	public void testUnlock() {

		ActionLock.unlock();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.waitFor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#waitFor())*/
	public void testWaitFor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[21]isLocked:TRUE
		 *[21]isLocked:FALSE
		 ****************************************************************************/

		// Method under test arguments

		ActionLock.waitFor();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.waitFor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#waitFor())*/
	public void testWaitFor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[21]isLocked:FALSE
		 ****************************************************************************/

		// Method under test arguments

		ActionLock.waitFor();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionLock.waitFor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionLock#waitFor())*/
	public void testWaitFor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[21]isLocked:TRUE
		 *[26]InterruptedException e caught
		 ****************************************************************************/

		// Method under test arguments

		ActionLock.waitFor();
		fail("Path 3 assertion not implemented.");
	}

}
