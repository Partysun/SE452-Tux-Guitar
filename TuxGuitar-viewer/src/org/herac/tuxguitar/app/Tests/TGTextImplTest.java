package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGTextImpl;

public class TGTextImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGTextImpl.paint(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGTextImpl#paint(TGLayout,TGPainter,int,int))*/
	public void testPaintTGLayoutTGPainterIntInt() {
		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		TGTextImpl constructorInstance = new TGTextImpl();

		constructorInstance.paint(layout, painter, fromX, fromY);
		fail("Test method not implemented.");
	}

}
