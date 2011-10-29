package org.herac.tuxguitar.app.Tests;

import java.awt.AWTEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.actions.settings.SettingsAction;
import org.herac.tuxguitar.app.editors.TablatureEditor;
import org.herac.tuxguitar.song.managers.TGSongManager;

public class SettingsActionTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.execute(AWTEvent)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testExecuteAWTEvent() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.SettingsAction()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.settings.SettingsAction#SettingsAction())*/
	public void testSettingsAction() {

		// Constructor under test
		SettingsAction constructorInstance = new SettingsAction();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addViewMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddViewMenuJPopupMenu_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.settings.SettingsAction.addSoundMenu(JPopupMenu)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAddSoundMenuJPopupMenu() {
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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

		TGSongManager methodReturn = constructorInstance.getSongManager();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getEditor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#getEditor())*/
	public void testGetEditor() {

		SettingsAction constructorInstance = new SettingsAction();

		TablatureEditor methodReturn = constructorInstance.getEditor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#getName())*/
	public void testGetName() {

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

		boolean methodReturn = constructorInstance.isKeyBindingAvailable();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.updateTablature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#updateTablature())*/
	public void testUpdateTablature() {

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.updateTablature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.Action.fireUpdate(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.Action#fireUpdate(int))*/
	public void testFireUpdateInt() {
		// Method under test arguments
		int measureNumber = 0;

		SettingsAction constructorInstance = new SettingsAction();

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

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.actionPerformed(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseClicked(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseClicked(MouseEvent))*/
	public void testMouseClickedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.mouseClicked(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mousePressed(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mousePressed(MouseEvent))*/
	public void testMousePressedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.mousePressed(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseReleased(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseReleased(MouseEvent))*/
	public void testMouseReleasedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.mouseReleased(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseEntered(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseEntered(MouseEvent))*/
	public void testMouseEnteredMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.mouseEntered(e);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionAdapter.mouseExited(MouseEvent)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionAdapter#mouseExited(MouseEvent))*/
	public void testMouseExitedMouseEvent() {
		// Method under test arguments
		MouseEvent e = null;

		SettingsAction constructorInstance = new SettingsAction();

		constructorInstance.mouseExited(e);
		fail("Test method not implemented.");
	}

}
