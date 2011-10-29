package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGRectangle;

public class TGRectangleTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.TGRectangle(int, int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#TGRectangle(int,int,int,int))*/
	public void testTGRectangleIntIntIntInt() {
		// Method under test arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;

		// Constructor under test arguments// Constructor under test
		TGRectangle constructorInstance = new TGRectangle(x, y, width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.TGRectangle()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#TGRectangle())*/
	public void testTGRectangle() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		// Constructor under test
		TGRectangle constructorInstance = new TGRectangle();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.getX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#getX())*/
	public void testGetX() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		TGRectangle constructorInstance = new TGRectangle(x, y, width, height);

		int methodReturn = constructorInstance.getX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.setX(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#setX(int))*/
	public void testSetXInt() {
		// Method under test arguments
		int x = 0;

		// Constructor arguments
		int x_c = 0;
		int y = 0;
		int width = 0;
		int height = 0;

		TGRectangle constructorInstance = new TGRectangle(x_c, y, width, height);

		constructorInstance.setX(x_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.getY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#getY())*/
	public void testGetY() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		TGRectangle constructorInstance = new TGRectangle(x, y, width, height);

		int methodReturn = constructorInstance.getY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.setY(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#setY(int))*/
	public void testSetYInt() {
		// Method under test arguments
		int y = 0;

		// Constructor arguments
		int x = 0;
		int y_c = 0;
		int width = 0;
		int height = 0;

		TGRectangle constructorInstance = new TGRectangle(x, y_c, width, height);

		constructorInstance.setY(y_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.getWidth()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#getWidth())*/
	public void testGetWidth() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		TGRectangle constructorInstance = new TGRectangle(x, y, width, height);

		int methodReturn = constructorInstance.getWidth();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.setWidth(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#setWidth(int))*/
	public void testSetWidthInt() {
		// Method under test arguments
		int width = 0;

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width_c = 0;
		int height = 0;

		TGRectangle constructorInstance = new TGRectangle(x, y, width_c, height);

		constructorInstance.setWidth(width_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.getHeight()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#getHeight())*/
	public void testGetHeight() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height = 0;
		TGRectangle constructorInstance = new TGRectangle(x, y, width, height);

		int methodReturn = constructorInstance.getHeight();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGRectangle.setHeight(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGRectangle#setHeight(int))*/
	public void testSetHeightInt() {
		// Method under test arguments
		int height = 0;

		// Constructor arguments
		int x = 0;
		int y = 0;
		int width = 0;
		int height_c = 0;

		TGRectangle constructorInstance = new TGRectangle(x, y, width, height_c);

		constructorInstance.setHeight(height_c);
		fail("Test method not implemented.");
	}

}
