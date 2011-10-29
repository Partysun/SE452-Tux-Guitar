package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.actions.Action;
import org.herac.tuxguitar.app.system.keybindings.KeyBinding;
import org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList;

public class KeyBindingActionListTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.isReserved(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#isReserved(KeyBinding))*/
	public void testIsReservedKeyBinding_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]i<KB_ACTIONS.length:TRUE
		 *[20]kb.isSameAsKB_ACTIONS[i].getKeyBinding::TRUE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		boolean methodReturn = KeyBindingActionList.isReserved(kb);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.isReserved(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#isReserved(KeyBinding))*/
	public void testIsReservedKeyBinding_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		boolean methodReturn = KeyBindingActionList.isReserved(kb);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.isReserved(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#isReserved(KeyBinding))*/
	public void testIsReservedKeyBinding_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[19]i<KB_ACTIONS.length:TRUE
		 *[20]kb.isSameAsKB_ACTIONS[i].getKeyBinding::FALSE
		 *[19]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		boolean methodReturn = KeyBindingActionList.isReserved(kb);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getActionForKeyBinding(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getActionForKeyBinding(KeyBinding))*/
	public void testGetActionForKeyBindingKeyBinding_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[28]i<KB_ACTIONS.length:TRUE
		 *[29]kb.isSameAsKB_ACTIONS[i].getKeyBinding::TRUE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		Action methodReturn = KeyBindingActionList.getActionForKeyBinding(kb);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getActionForKeyBinding(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getActionForKeyBinding(KeyBinding))*/
	public void testGetActionForKeyBindingKeyBinding_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[28]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		Action methodReturn = KeyBindingActionList.getActionForKeyBinding(kb);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getActionForKeyBinding(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getActionForKeyBinding(KeyBinding))*/
	public void testGetActionForKeyBindingKeyBinding_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[28]i<KB_ACTIONS.length:TRUE
		 *[29]kb.isSameAsKB_ACTIONS[i].getKeyBinding::FALSE
		 *[28]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		Action methodReturn = KeyBindingActionList.getActionForKeyBinding(kb);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getKeyBindingForAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getKeyBindingForAction(String))*/
	public void testGetKeyBindingForActionString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[37]i<KB_ACTIONS.length:TRUE
		 *[38]action.equalsKB_ACTIONS[i].getAction::TRUE
		 ****************************************************************************/

		// Method under test arguments
		String action = null;

		KeyBinding methodReturn = KeyBindingActionList
				.getKeyBindingForAction(action);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getKeyBindingForAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getKeyBindingForAction(String))*/
	public void testGetKeyBindingForActionString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[37]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String action = null;

		KeyBinding methodReturn = KeyBindingActionList
				.getKeyBindingForAction(action);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList.getKeyBindingForAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionList#getKeyBindingForAction(String))*/
	public void testGetKeyBindingForActionString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[37]i<KB_ACTIONS.length:TRUE
		 *[38]action.equalsKB_ACTIONS[i].getAction::FALSE
		 *[37]i<KB_ACTIONS.length:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String action = null;

		KeyBinding methodReturn = KeyBindingActionList
				.getKeyBindingForAction(action);
		fail("Path 3 assertion not implemented.");
	}

}
