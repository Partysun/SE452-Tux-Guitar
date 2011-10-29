package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TGResourceFactoryImpl;
import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGColorModel;
import org.herac.tuxguitar.graphics.TGFont;
import org.herac.tuxguitar.graphics.TGFontModel;
import org.herac.tuxguitar.graphics.TGImage;

public class TGResourceFactoryImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.TGResourceFactoryImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#TGResourceFactoryImpl())*/
	public void testTGResourceFactoryImpl() {

		// Constructor under test
		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.createImage(int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#createImage(int,int))*/
	public void testCreateImageIntInt() {
		// Method under test arguments
		int width = 0;
		int height = 0;

		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();

		TGImage methodReturn = constructorInstance.createImage(width, height);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.createColor(int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#createColor(int,int,int))*/
	public void testCreateColorIntIntInt() {
		// Method under test arguments
		int red = 0;
		int green = 0;
		int blue = 0;

		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();

		TGColor methodReturn = constructorInstance
				.createColor(red, green, blue);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.createColor(TGColorModel)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#createColor(TGColorModel))*/
	public void testCreateColorTGColorModel() {
		// Method under test arguments
		TGColorModel cm = null;

		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();

		TGColor methodReturn = constructorInstance.createColor(cm);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.createFont(String, int, boolean, boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#createFont(String,int,boolean,boolean))*/
	public void testCreateFontStringIntBooleanBoolean() {
		// Method under test arguments
		String name = null;
		int height = 0;
		boolean bold = true;
		boolean italic = true;

		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();

		TGFont methodReturn = constructorInstance.createFont(name, height,
				bold, italic);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TGResourceFactoryImpl.createFont(TGFontModel)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TGResourceFactoryImpl#createFont(TGFontModel))*/
	public void testCreateFontTGFontModel() {
		// Method under test arguments
		TGFontModel fm = null;

		TGResourceFactoryImpl constructorInstance = new TGResourceFactoryImpl();

		TGFont methodReturn = constructorInstance.createFont(fm);
		fail("Test method not implemented.");
	}

}
