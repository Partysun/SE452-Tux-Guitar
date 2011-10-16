package org.herac.tuxguitar.util;

import junit.framework.TestCase;

public class TGLockTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.TGLock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#TGLock())*/
	public void testTGLock() {

		// Constructor under test
		TGLock constructorInstance = new TGLock();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#lock())*/
	public void testLock_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]lockSuccess=!this.isLockedthread:TRUE
		 *[24]!lockSuccess:TRUE
		 *[25]isLockedthread:TRUE
		 *[25]isLockedthread:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLock constructorInstance = new TGLock();

		constructorInstance.lock();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#lock())*/
	public void testLock_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]lockSuccess=!this.isLockedthread:FALSE
		 *[24]!lockSuccess:TRUE
		 *[25]isLockedthread:TRUE
		 *[25]isLockedthread:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLock constructorInstance = new TGLock();

		constructorInstance.lock();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#lock())*/
	public void testLock_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]lockSuccess=!this.isLockedthread:TRUE
		 *[24]!lockSuccess:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLock constructorInstance = new TGLock();

		constructorInstance.lock();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#lock())*/
	public void testLock_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]lockSuccess=!this.isLockedthread:TRUE
		 *[24]!lockSuccess:TRUE
		 *[25]isLockedthread:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLock constructorInstance = new TGLock();

		constructorInstance.lock();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.lock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#lock())*/
	public void testLock_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]lockSuccess=!this.isLockedthread:TRUE
		 *[19]lockSuccess=!this.isLockedthread:TRUE
		 *[24]!lockSuccess:TRUE
		 *[25]isLockedthread:TRUE
		 *[25]isLockedthread:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGLock constructorInstance = new TGLock();

		constructorInstance.lock();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.unlock()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#unlock())*/
	public void testUnlock() {

		TGLock constructorInstance = new TGLock();

		constructorInstance.unlock();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.isLocked(Thread)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#isLocked(Thread))*/
	public void testIsLockedThread_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[40]this.lockThread!=null:TRUE
		 *[40]this.lockThread!=thread:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Thread thread = null;

		TGLock constructorInstance = new TGLock();

		boolean methodReturn = constructorInstance.isLocked(thread);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.isLocked(Thread)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#isLocked(Thread))*/
	public void testIsLockedThread_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[40]this.lockThread!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Thread thread = null;

		TGLock constructorInstance = new TGLock();

		boolean methodReturn = constructorInstance.isLocked(thread);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.isLocked(Thread)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#isLocked(Thread))*/
	public void testIsLockedThread_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[40]this.lockThread!=null:TRUE
		 *[40]this.lockThread!=thread:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Thread thread = null;

		TGLock constructorInstance = new TGLock();

		boolean methodReturn = constructorInstance.isLocked(thread);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGLock.isLocked()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGLock#isLocked())*/
	public void testIsLocked() {

		TGLock constructorInstance = new TGLock();

		boolean methodReturn = constructorInstance.isLocked();
		fail("Test method not implemented.");
	}

}
