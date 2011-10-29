package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPoint;

public class TGPointTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.TGPoint(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#TGPoint(int,int))*/
	public void testTGPointIntInt() {
		// Method under test arguments
		int x = 0;
		int y = 0;

		// Constructor under test arguments// Constructor under test
		TGPoint constructorInstance = new TGPoint(x, y);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.TGPoint()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#TGPoint())*/
	public void testTGPoint() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		// Constructor under test
		TGPoint constructorInstance = new TGPoint();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.getX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#getX())*/
	public void testGetX() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		TGPoint constructorInstance = new TGPoint(x, y);

		int methodReturn = constructorInstance.getX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.setX(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#setX(int))*/
	public void testSetXInt() {
		// Method under test arguments
		int x = 0;

		// Constructor arguments
		int x_c = 0;
		int y = 0;

		TGPoint constructorInstance = new TGPoint(x_c, y);

		constructorInstance.setX(x_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.getY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#getY())*/
	public void testGetY() {

		// Constructor arguments
		int x = 0;
		int y = 0;
		TGPoint constructorInstance = new TGPoint(x, y);

		int methodReturn = constructorInstance.getY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.TGPoint.setY(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.TGPoint#setY(int))*/
	public void testSetYInt() {
		// Method under test arguments
		int y = 0;

		// Constructor arguments
		int x = 0;
		int y_c = 0;

		TGPoint constructorInstance = new TGPoint(x, y_c);

		constructorInstance.setY(y_c);
		fail("Test method not implemented.");
	}

}
