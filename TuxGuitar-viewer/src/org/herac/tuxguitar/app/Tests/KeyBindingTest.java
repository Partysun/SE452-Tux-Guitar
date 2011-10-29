package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.system.keybindings.KeyBinding;

public class KeyBindingTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.KeyBinding(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#KeyBinding(int,int))*/
	public void testKeyBindingIntInt() {
		// Method under test arguments
		int key = 0;
		int mask = 0;

		// Constructor under test arguments// Constructor under test
		KeyBinding constructorInstance = new KeyBinding(key, mask);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.KeyBinding()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#KeyBinding())*/
	public void testKeyBinding() {

		// Constructor arguments
		int key = 0;
		int mask = 0;
		// Constructor under test
		KeyBinding constructorInstance = new KeyBinding();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getKey()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#getKey())*/
	public void testGetKey() {

		// Constructor arguments
		int key = 0;
		int mask = 0;
		KeyBinding constructorInstance = new KeyBinding(key, mask);

		int methodReturn = constructorInstance.getKey();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.setKey(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#setKey(int))*/
	public void testSetKeyInt() {
		// Method under test arguments
		int key = 0;

		// Constructor arguments
		int key_c = 0;
		int mask = 0;

		KeyBinding constructorInstance = new KeyBinding(key_c, mask);

		constructorInstance.setKey(key_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getMask()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#getMask())*/
	public void testGetMask() {

		// Constructor arguments
		int key = 0;
		int mask = 0;
		KeyBinding constructorInstance = new KeyBinding(key, mask);

		int methodReturn = constructorInstance.getMask();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.setMask(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#setMask(int))*/
	public void testSetMaskInt() {
		// Method under test arguments
		int mask = 0;

		// Constructor arguments
		int key = 0;
		int mask_c = 0;

		KeyBinding constructorInstance = new KeyBinding(key, mask_c);

		constructorInstance.setMask(mask_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialKey()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialKey_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialKey()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialKey_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialKey()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialKey_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialMask()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialMask_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialMask()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialMask_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialMask()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialMask_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.isSameAs(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#isSameAs(KeyBinding))*/
	public void testIsSameAsKeyBinding_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]kb!=null:TRUE
		 *[59]this.key==kb.key:TRUE
		 *[59]this.mask==kb.mask:TRUE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		// Constructor arguments
		int key = 0;
		int mask = 0;

		KeyBinding constructorInstance = new KeyBinding(key, mask);

		boolean methodReturn = constructorInstance.isSameAs(kb);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.isSameAs(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#isSameAs(KeyBinding))*/
	public void testIsSameAsKeyBinding_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]kb!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		// Constructor arguments
		int key = 0;
		int mask = 0;

		KeyBinding constructorInstance = new KeyBinding(key, mask);

		boolean methodReturn = constructorInstance.isSameAs(kb);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.isSameAs(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#isSameAs(KeyBinding))*/
	public void testIsSameAsKeyBinding_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]kb!=null:TRUE
		 *[59]this.key==kb.key:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		// Constructor arguments
		int key = 0;
		int mask = 0;

		KeyBinding constructorInstance = new KeyBinding(key, mask);

		boolean methodReturn = constructorInstance.isSameAs(kb);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.isSameAs(KeyBinding)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#isSameAs(KeyBinding))*/
	public void testIsSameAsKeyBinding_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[58]kb!=null:TRUE
		 *[59]this.key==kb.key:TRUE
		 *[59]this.mask==kb.mask:FALSE
		 ****************************************************************************/

		// Method under test arguments
		KeyBinding kb = null;

		// Constructor arguments
		int key = 0;
		int mask = 0;

		KeyBinding constructorInstance = new KeyBinding(key, mask);

		boolean methodReturn = constructorInstance.isSameAs(kb);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.toString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#toString())*/
	public void testToString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[67]key!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int key = 0;
		int mask = 0;
		KeyBinding constructorInstance = new KeyBinding(key, mask);

		String methodReturn = constructorInstance.toString();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.toString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#toString())*/
	public void testToString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[67]key!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int key = 0;
		int mask = 0;
		KeyBinding constructorInstance = new KeyBinding(key, mask);

		String methodReturn = constructorInstance.toString();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.clone()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#clone())*/
	public void testClone() {

		// Constructor arguments
		int key = 0;
		int mask = 0;
		KeyBinding constructorInstance = new KeyBinding(key, mask);

		Object methodReturn = constructorInstance.clone();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:TRUE
		 *[82]st.hasMoreTokens:TRUE
		 *[86]st.hasMoreTokens:TRUE
		 *[82]st.hasMoreTokens:FALSE
		 *[100]keycode==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:FALSE
		 *[100]keycode==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:TRUE
		 *[82]st.hasMoreTokens:FALSE
		 *[100]keycode==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:TRUE
		 *[82]st.hasMoreTokens:TRUE
		 *[86]st.hasMoreTokens:FALSE
		 *[82]st.hasMoreTokens:FALSE
		 *[100]keycode==0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:TRUE
		 *[82]st.hasMoreTokens:TRUE
		 *[86]st.hasMoreTokens:TRUE
		 *[82]st.hasMoreTokens:FALSE
		 *[100]keycode==0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.parse(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.system.keybindings.KeyBinding#parse(String))*/
	public void testParseString_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[80]keyString.indexOfMASK_SEPARATOR:!=-1:TRUE
		 *[82]st.hasMoreTokens:FALSE
		 *[100]keycode==0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		String keyString = null;

		KeyBinding methodReturn = KeyBinding.parse(keyString);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getKeyCode(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetKeyCodeString() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialCode(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialCodeString_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialCode(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialCodeString_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.app.system.keybindings.KeyBinding.getSpecialCode(String)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetSpecialCodeString_Path3() {
	}

}
