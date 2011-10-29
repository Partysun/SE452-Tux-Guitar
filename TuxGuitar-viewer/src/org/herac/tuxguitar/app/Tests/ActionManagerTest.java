package org.herac.tuxguitar.app.Tests;

import java.util.List;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.actions.Action;
import org.herac.tuxguitar.app.actions.ActionManager;

public class ActionManagerTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.init()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#init())*/
	public void testInit() {

		ActionManager constructorInstance = new ActionManager();

		constructorInstance.init();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.addAction(Action)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#addAction(Action))*/
	public void testAddActionAction() {
		// Method under test arguments
		Action action = null;

		ActionManager constructorInstance = new ActionManager();

		constructorInstance.addAction(action);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.removeAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#removeAction(String))*/
	public void testRemoveActionString() {
		// Method under test arguments
		String name = null;

		ActionManager constructorInstance = new ActionManager();

		constructorInstance.removeAction(name);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.getAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#getAction(String))*/
	public void testGetActionString() {
		// Method under test arguments
		String name = null;

		ActionManager constructorInstance = new ActionManager();

		Action methodReturn = constructorInstance.getAction(name);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.getAvailableKeyBindingActions()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#getAvailableKeyBindingActions())*/
	public void testGetAvailableKeyBindingActions_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[84]it.hasNext:TRUE
		 *[86]getActionactionName:.isKeyBindingAvailable:TRUE
		 *[84]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		ActionManager constructorInstance = new ActionManager();

		List methodReturn = constructorInstance.getAvailableKeyBindingActions();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.getAvailableKeyBindingActions()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#getAvailableKeyBindingActions())*/
	public void testGetAvailableKeyBindingActions_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[84]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		ActionManager constructorInstance = new ActionManager();

		List methodReturn = constructorInstance.getAvailableKeyBindingActions();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.actions.ActionManager.getAvailableKeyBindingActions()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.actions.ActionManager#getAvailableKeyBindingActions())*/
	public void testGetAvailableKeyBindingActions_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[84]it.hasNext:TRUE
		 *[86]getActionactionName:.isKeyBindingAvailable:FALSE
		 *[84]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		ActionManager constructorInstance = new ActionManager();

		List methodReturn = constructorInstance.getAvailableKeyBindingActions();
		fail("Path 3 assertion not implemented.");
	}

}
