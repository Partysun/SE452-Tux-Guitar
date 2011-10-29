package org.herac.tuxguitar.app.Tests;

import java.awt.Component;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.actions.Action;
import org.herac.tuxguitar.app.system.keybindings.KeyBinding;
import org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager;

public class KeyBindingActionManagerTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager.KeyBindingActionManager()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager#KeyBindingActionManager())*/
	public void testKeyBindingActionManager() {

		// Constructor under test
		KeyBindingActionManager constructorInstance = new KeyBindingActionManager();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager.init()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager#init())*/
	public void testInit() {

		KeyBindingActionManager constructorInstance = new KeyBindingActionManager();

		constructorInstance.init();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager.getActionForKeyBinding(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager#getActionForKeyBinding(KeyBinding))*/
	public void testGetActionForKeyBindingKeyBinding() {
		// Method under test arguments
		KeyBinding kb = null;

		KeyBindingActionManager constructorInstance = new KeyBindingActionManager();

		Action methodReturn = constructorInstance.getActionForKeyBinding(kb);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager.getKeyBindingForAction(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager#getKeyBindingForAction(String))*/
	public void testGetKeyBindingForActionString() {
		// Method under test arguments
		String action = null;

		KeyBindingActionManager constructorInstance = new KeyBindingActionManager();

		KeyBinding methodReturn = constructorInstance
				.getKeyBindingForAction(action);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager.appendListenersTo(Component)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBindingActionManager#appendListenersTo(Component))*/
	public void testAppendListenersToComponent() {
		// Method under test arguments
		Component control = null;

		KeyBindingActionManager constructorInstance = new KeyBindingActionManager();

		constructorInstance.appendListenersTo(control);
		fail("Test method not implemented.");
	}

}
