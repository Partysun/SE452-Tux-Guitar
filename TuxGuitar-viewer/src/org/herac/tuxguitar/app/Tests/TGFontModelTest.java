package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGFontModel;

public class TGFontModelTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.TGFontModel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#TGFontModel())*/
	public void testTGFontModel() {

		// Constructor under test
		TGFontModel constructorInstance = new TGFontModel();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.TGFontModel(String, int, boolean, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#TGFontModel(String,int,boolean,boolean))*/
	public void testTGFontModelStringIntBooleanBoolean() {
		// Method under test arguments
		String name = null;
		int height = 0;
		boolean bold = true;
		boolean italic = true;

		// Constructor under test arguments// Constructor under test
		TGFontModel constructorInstance = new TGFontModel(name, height, bold,
				italic);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.getName()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#getName())*/
	public void testGetName() {

		TGFontModel constructorInstance = new TGFontModel();

		String methodReturn = constructorInstance.getName();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.setName(String)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#setName(String))*/
	public void testSetNameString() {
		// Method under test arguments
		String name = null;

		TGFontModel constructorInstance = new TGFontModel();

		constructorInstance.setName(name);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#getHeight())*/
	public void testGetHeight() {

		TGFontModel constructorInstance = new TGFontModel();

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.setHeight(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#setHeight(int))*/
	public void testSetHeightInt() {
		// Method under test arguments
		int height = 0;

		TGFontModel constructorInstance = new TGFontModel();

		constructorInstance.setHeight(height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.isBold()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#isBold())*/
	public void testIsBold() {

		TGFontModel constructorInstance = new TGFontModel();

		boolean methodReturn = constructorInstance.isBold();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.setBold(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#setBold(boolean))*/
	public void testSetBoldBoolean() {
		// Method under test arguments
		boolean bold = true;

		TGFontModel constructorInstance = new TGFontModel();

		constructorInstance.setBold(bold);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.isItalic()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#isItalic())*/
	public void testIsItalic() {

		TGFontModel constructorInstance = new TGFontModel();

		boolean methodReturn = constructorInstance.isItalic();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGFontModel.setItalic(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGFontModel#setItalic(boolean))*/
	public void testSetItalicBoolean() {
		// Method under test arguments
		boolean italic = true;

		TGFontModel constructorInstance = new TGFontModel();

		constructorInstance.setItalic(italic);
		fail("Test method not implemented.");
	}

}
