package org.herac.tuxguitar.app.Tests;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction;
import org.herac.tuxguitar.app.editors.TablatureEditor;
import org.herac.tuxguitar.song.managers.TGSongManager;

public class GoNextMeasureActionTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction.execute(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testExecuteAWTEvent_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction.execute(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testExecuteAWTEvent_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction.execute(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testExecuteAWTEvent_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction.execute(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testExecuteAWTEvent_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction.GoNextMeasureAction()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.measure.GoNextMeasureAction#GoNextMeasureAction())*/
	public void testGoNextMeasureAction() {

		// Constructor under test
		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:FALSE
		 *[54]flags&DISABLE_ON_PLAYING:!=0:TRUE
		 *[54]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[55]flags&AUTO_UPDATE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:FALSE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:FALSE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:TRUE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:FALSE
		 *[54]flags&DISABLE_ON_PLAYING:!=0:FALSE
		 *[59]flags&AUTO_LOCK:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:FALSE
		 *[54]flags&DISABLE_ON_PLAYING:!=0:TRUE
		 *[54]TuxGuitar.instance:.getPlayer:.isRunning:FALSE
		 *[59]flags&AUTO_LOCK:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:FALSE
		 *[54]flags&DISABLE_ON_PLAYING:!=0:TRUE
		 *[54]TuxGuitar.instance:.getPlayer:.isRunning:TRUE
		 *[55]flags&AUTO_UPDATE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.process(AWTEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#process(AWTEvent))*/
	public void testProcessAWTEvent_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[47]!ActionLock.isLocked:TRUE
		 *[47]!TuxGuitar.instance:.isLocked:TRUE
		 *[48]!TuxGuitar.instance:.getTablatureEditor:.isStarted:FALSE
		 *[54]flags&DISABLE_ON_PLAYING:!=0:FALSE
		 *[59]flags&AUTO_LOCK:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		AWTEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.process(e);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getFlags()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetFlags() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getSongManager()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#getSongManager())*/
	public void testGetSongManager() {

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		TGSongManager methodReturn = constructorInstance.getSongManager();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getEditor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#getEditor())*/
	public void testGetEditor() {

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		TablatureEditor methodReturn = constructorInstance.getEditor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#getName())*/
	public void testGetName() {

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		String methodReturn = constructorInstance.getName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.isKeyBindingAvailable()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#isKeyBindingAvailable())*/
	public void testIsKeyBindingAvailable_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[96]getFlags:&KEY_BINDING_AVAILABLE:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		boolean methodReturn = constructorInstance.isKeyBindingAvailable();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.isKeyBindingAvailable()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#isKeyBindingAvailable())*/
	public void testIsKeyBindingAvailable_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[96]getFlags:&KEY_BINDING_AVAILABLE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		boolean methodReturn = constructorInstance.isKeyBindingAvailable();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.updateTablature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#updateTablature())*/
	public void testUpdateTablature() {

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.updateTablature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.fireUpdate(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#fireUpdate(int))*/
	public void testFireUpdateInt() {
		// Method under test arguments
		int measureNumber = 0;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.fireUpdate(measureNumber);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.doProcess(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testDoProcessAWTEvent() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.actionPerformed(ActionEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#actionPerformed(ActionEvent))*/
	public void testActionPerformedActionEvent() {
		// Method under test arguments
		ActionEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.actionPerformed(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseClicked(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseClicked(MouseEvent))*/
	public void testMouseClickedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.mouseClicked(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mousePressed(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mousePressed(MouseEvent))*/
	public void testMousePressedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.mousePressed(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseReleased(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseReleased(MouseEvent))*/
	public void testMouseReleasedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.mouseReleased(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseEntered(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseEntered(MouseEvent))*/
	public void testMouseEnteredMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.mouseEntered(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseExited(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseExited(MouseEvent))*/
	public void testMouseExitedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		GoNextMeasureAction constructorInstance = new GoNextMeasureAction();

		constructorInstance.mouseExited(e);
		fail("Test method not implemented.");
	}

}
