package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.painters.TGNotePainter;

public class TGNotePainterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.painters.TGNotePainter.paintFooter(TGPainter, float, float, int, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.painters.TGNotePainter#paintFooter(TGPainter,float,float,int,float))*/
	public void testPaintFooterTGPainterFloatFloatIntFloat() {
		// Method under test arguments
		TGPainter painter = null;
		float x = 0f;
		float y = 0f;
		int dir = 0;
		float scale = 0f;

		TGNotePainter.paintFooter(painter, x, y, dir, scale);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.painters.TGNotePainter.paintNote(TGPainter, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.painters.TGNotePainter#paintNote(TGPainter,float,float,float))*/
	public void testPaintNoteTGPainterFloatFloatFloat() {
		// Method under test arguments
		TGPainter painter = null;
		float x = 0f;
		float y = 0f;
		float scale = 0f;

		TGNotePainter.paintNote(painter, x, y, scale);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.painters.TGNotePainter.paintHarmonic(TGPainter, float, float, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.painters.TGNotePainter#paintHarmonic(TGPainter,float,float,float))*/
	public void testPaintHarmonicTGPainterFloatFloatFloat() {
		// Method under test arguments
		TGPainter painter = null;
		float x = 0f;
		float y = 0f;
		float scale = 0f;

		TGNotePainter.paintHarmonic(painter, x, y, scale);
		fail("Test method not implemented.");
	}

}
