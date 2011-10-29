package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGDimension;

public class TGDimensionTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.TGDimension(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#TGDimension(int,int))*/
	public void testTGDimensionIntInt() {
		// Method under test arguments
		int width = 0;
		int height = 0;

		// Constructor under test arguments// Constructor under test
		TGDimension constructorInstance = new TGDimension(width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.TGDimension()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#TGDimension())*/
	public void testTGDimension() {

		// Constructor arguments
		int width = 0;
		int height = 0;
		// Constructor under test
		TGDimension constructorInstance = new TGDimension();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.getWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#getWidth())*/
	public void testGetWidth() {

		// Constructor arguments
		int width = 0;
		int height = 0;
		TGDimension constructorInstance = new TGDimension(width, height);

		int methodReturn = constructorInstance.getWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.setWidth(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#setWidth(int))*/
	public void testSetWidthInt() {
		// Method under test arguments
		int width = 0;

		// Constructor arguments
		int width_c = 0;
		int height = 0;

		TGDimension constructorInstance = new TGDimension(width_c, height);

		constructorInstance.setWidth(width_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#getHeight())*/
	public void testGetHeight() {

		// Constructor arguments
		int width = 0;
		int height = 0;
		TGDimension constructorInstance = new TGDimension(width, height);

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGDimension.setHeight(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGDimension#setHeight(int))*/
	public void testSetHeightInt() {
		// Method under test arguments
		int height = 0;

		// Constructor arguments
		int width = 0;
		int height_c = 0;

		TGDimension constructorInstance = new TGDimension(width, height_c);

		constructorInstance.setHeight(height_c);
		fail("Test method not implemented.");
	}

}
