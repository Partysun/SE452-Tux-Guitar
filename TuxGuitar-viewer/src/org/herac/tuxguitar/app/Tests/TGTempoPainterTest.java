package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.painters.TGTempoPainter;

public class TGTempoPainterTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.painters.TGTempoPainter.paintTempo(TGPainter, int, int, float)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.painters.TGTempoPainter#paintTempo(TGPainter,int,int,float))*/
	public void testPaintTempoTGPainterIntIntFloat() {
		// Method under test arguments
		TGPainter painter = null;
		int x = 0;
		int y = 0;
		float scale = 0f;

		TGTempoPainter.paintTempo(painter, x, y, scale);
		fail("Test method not implemented.");
	}

}
