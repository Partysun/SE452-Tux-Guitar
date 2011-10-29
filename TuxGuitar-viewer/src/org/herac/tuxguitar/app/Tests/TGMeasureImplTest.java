package org.herac.tuxguitar.app.Tests;

import java.util.List;

import junit.framework.TestCase;

import org.herac.tuxguitar.graphics.TGColor;
import org.herac.tuxguitar.graphics.TGPainter;
import org.herac.tuxguitar.graphics.control.TGLayout;
import org.herac.tuxguitar.graphics.control.TGMeasureBuffer;
import org.herac.tuxguitar.graphics.control.TGMeasureHeaderImpl;
import org.herac.tuxguitar.graphics.control.TGMeasureImpl;
import org.herac.tuxguitar.graphics.control.TGTrackImpl;
import org.herac.tuxguitar.graphics.control.TGTrackSpacing;
import org.herac.tuxguitar.graphics.control.TGVoiceImpl;
import org.herac.tuxguitar.song.factory.TGFactory;
import org.herac.tuxguitar.song.managers.TGSongManager;
import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGMarker;
import org.herac.tuxguitar.song.models.TGMeasure;
import org.herac.tuxguitar.song.models.TGMeasureHeader;
import org.herac.tuxguitar.song.models.TGTempo;
import org.herac.tuxguitar.song.models.TGTimeSignature;
import org.herac.tuxguitar.song.models.TGTrack;

public class TGMeasureImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.TGMeasureImpl(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#TGMeasureImpl(TGMeasureHeader))*/
	public void testTGMeasureImplTGMeasureHeader_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[163]v<TGBeat.MAX_VOICES:TRUE
		 *[163]v<TGBeat.MAX_VOICES:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;

		// Constructor under test arguments// Constructor under test
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.TGMeasureImpl(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#TGMeasureImpl(TGMeasureHeader))*/
	public void testTGMeasureImplTGMeasureHeader_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[163]v<TGBeat.MAX_VOICES:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasureHeader header = null;

		// Constructor under test arguments// Constructor under test
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.create(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#create(TGLayout))*/
	public void testCreateTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.create(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.update(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#update(TGLayout))*/
	public void testUpdateTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.update(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkCompactMode(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckCompactModeTGLayout_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.clearRegisteredAccidentals()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testClearRegisteredAccidentals_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.clearRegisteredAccidentals()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testClearRegisteredAccidentals_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.clearRegisteredAccidentals()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testClearRegisteredAccidentals_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateWidth(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateWidth(TGLayout))*/
	public void testCalculateWidthTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[209]this.compactMode:TRUE
		 *[218]this.getRepeatClose:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateWidth(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateWidth(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateWidth(TGLayout))*/
	public void testCalculateWidthTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[209]this.compactMode:FALSE
		 *[218]this.getRepeatClose:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateWidth(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateWidth(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateWidth(TGLayout))*/
	public void testCalculateWidthTGLayout_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[209]this.compactMode:TRUE
		 *[218]this.getRepeatClose:>0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateWidth(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path19() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path20() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path21() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path22() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path23() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path24() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path25() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path26() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path27() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path28() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path29() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path30() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path31() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path32() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path33() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path34() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path35() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path36() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path37() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path38() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path39() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path40() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path41() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path42() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path43() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path44() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path45() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path46() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path47() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path48() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path49() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path50() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path51() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path52() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path53() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path54() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path55() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path56() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path57() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path58() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path59() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path60() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path61() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path62() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path63() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path64() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path65() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path66() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path67() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path68() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateBeats(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateBeatsTGLayout_Path69() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:FALSE
		 *[338]b1.getDuration:.getValue:<TGDuration.EIGHTH:TRUE
		 *[339]start1==start2:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:FALSE
		 *[338]b1.getDuration:.getValue:<TGDuration.EIGHTH:FALSE
		 *[338]b2.getDuration:.getValue:<TGDuration.EIGHTH:TRUE
		 *[339]start1==start2:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:FALSE
		 *[338]b1.getDuration:.getValue:<TGDuration.EIGHTH:TRUE
		 *[339]start1==start2:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:FALSE
		 *[338]b1.getDuration:.getValue:<TGDuration.EIGHTH:FALSE
		 *[338]b2.getDuration:.getValue:<TGDuration.EIGHTH:FALSE
		 *[345]p1==p2:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.canJoin(TGSongManager, TGVoiceImpl, TGVoiceImpl)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#canJoin(TGSongManager,TGVoiceImpl,TGVoiceImpl))*/
	public void testCanJoinTGSongManagerTGVoiceImplTGVoiceImpl_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[329]b1==null:FALSE
		 *[329]b2==null:FALSE
		 *[329]b1.isRestVoice:FALSE
		 *[329]b2.isRestVoice:FALSE
		 *[338]b1.getDuration:.getValue:<TGDuration.EIGHTH:FALSE
		 *[338]b2.getDuration:.getValue:<TGDuration.EIGHTH:FALSE
		 *[345]p1==p2:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGSongManager manager = null;
		TGVoiceImpl b1 = null;
		TGVoiceImpl b2 = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.canJoin(manager, b1, b2);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeVoice(TGLayout, TGVoiceImpl, TGVoiceImpl, TGBeatGroup)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeVoiceTGLayoutTGVoiceImplTGVoiceImplTGBeatGroup_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeVoice(TGLayout, TGVoiceImpl, TGVoiceImpl, TGBeatGroup)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeVoiceTGLayoutTGVoiceImplTGVoiceImplTGBeatGroup_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.makeBeat(TGLayout, TGBeatImpl, TGBeatImpl, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testMakeBeatTGLayoutTGBeatImplTGBeatImplBoolean_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:TRUE
		 *[403]this.prevMeasure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:FALSE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:TRUE
		 *[403]this.prevMeasure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:FALSE
		 *[399]getClef:!=this.prevMeasure.getClef:TRUE
		 *[403]this.prevMeasure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:TRUE
		 *[403]this.prevMeasure==null:FALSE
		 *[403]getKeySignature:!=this.prevMeasure.getKeySignature:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:FALSE
		 *[399]getClef:!=this.prevMeasure.getClef:FALSE
		 *[403]this.prevMeasure==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:TRUE
		 *[403]this.prevMeasure==null:FALSE
		 *[403]getKeySignature:!=this.prevMeasure.getKeySignature:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateMeasureChanges(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#calculateMeasureChanges(TGLayout))*/
	public void testCalculateMeasureChangesTGLayout_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[397]layout.isFirstMeasurethis:TRUE
		 *[398]layout.getStyle:&TGLayout.DISPLAY_SCORE:!=0:TRUE
		 *[399]this.prevMeasure==null:FALSE
		 *[399]getClef:!=this.prevMeasure.getClef:FALSE
		 *[403]this.prevMeasure==null:FALSE
		 *[403]getKeySignature:!=this.prevMeasure.getKeySignature:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.calculateMeasureChanges(layout);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.autoCompleteSilences(TGSongManager)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testAutoCompleteSilencesTGSongManager() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path19() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path20() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path21() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path22() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path23() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path24() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path25() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path26() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path27() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path28() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path29() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path30() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path31() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path32() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path33() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path34() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path35() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.updateComponents(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testUpdateComponentsTGLayout_Path36() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getDisplayPosition(long, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getDisplayPosition(long,int))*/
	public void testGetDisplayPositionLongInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[507]newStart>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;
		int quarterWidth = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getDisplayPosition(start,
				quarterWidth);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getDisplayPosition(long, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getDisplayPosition(long,int))*/
	public void testGetDisplayPositionLongInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[507]newStart>0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		long start = 0;
		int quarterWidth = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getDisplayPosition(start,
				quarterWidth);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[526]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:FALSE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[526]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:FALSE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[526]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:FALSE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[526]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:TRUE
		 *[529]this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[531]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:TRUE
		 *[529]this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[531]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[526]isAccidentalNote:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:TRUE
		 *[529]this.registeredAccidentals[octave][accidentalNotes[note]]:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:TRUE
		 *[524]isAccidentalKey!=isAccidentalNote:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:TRUE
		 *[529]this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[531]isAccidentalNote:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNoteAccidental(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNoteAccidental(int))*/
	public void testGetNoteAccidentalInt_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[515]noteValue>=0:TRUE
		 *[515]noteValue<128:TRUE
		 *[519]key<=7:TRUE
		 *[520]key<=7:TRUE
		 *[522]KEY_SIGNATURES[key][accidentalNotes[note]]==accidentalValue:FALSE
		 *[524]isAccidentalKey!=isAccidentalNote:TRUE
		 *[524]!this.registeredAccidentals[octave][accidentalNotes[note]]:FALSE
		 *[529]isAccidentalKey==isAccidentalNote:TRUE
		 *[529]this.registeredAccidentals[octave][accidentalNotes[note]]:TRUE
		 *[531]isAccidentalNote:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int noteValue = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNoteAccidental(noteValue);
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.checkValue(TGLayout, TGNoteImpl, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCheckValueTGLayoutTGNoteImplInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.resetSpacing()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testResetSpacing() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::FALSE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:FALSE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:FALSE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:FALSE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:FALSE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:FALSE
		 *[581]this.beatEffectSpacing>0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.registerSpacing(TGLayout, TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#registerSpacing(TGLayout,TGTrackSpacing))*/
	public void testRegisterSpacingTGLayoutTGTrackSpacing_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[563]layout.hasLoopMarkerthis.getHeader::TRUE
		 *[566]this.hasMarker:TRUE
		 *[569]this.chord:TRUE
		 *[572]this.text:TRUE
		 *[575]this.getHeader:.getRepeatAlternative:>0:TRUE
		 *[578]this.division:TRUE
		 *[581]this.beatEffectSpacing>0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.registerSpacing(layout, ts);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.orderBeats(TGSongManager)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testOrderBeatsTGSongManager() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:FALSE
		 *[595]!bufferEnabled:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:FALSE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:FALSE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:FALSE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:FALSE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:TRUE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:FALSE
		 *[595]!bufferEnabled:FALSE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMeasure(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintMeasure(TGLayout,TGPainter))*/
	public void testPaintMeasureTGLayoutTGPainter_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[595]shouldRepaintBuffer:FALSE
		 *[595]!bufferEnabled:TRUE
		 *[597]bufferEnabled:TRUE
		 *[598]bufferEnabled:TRUE
		 *[599]bufferEnabled:FALSE
		 *[608]bufferEnabled:TRUE
		 *[613]bufferEnabled:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintMeasure(layout, painter);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.shouldRepaintBuffer()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testShouldRepaintBuffer_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.shouldRepaintBuffer()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testShouldRepaintBuffer_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.shouldRepaintBuffer()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testShouldRepaintBuffer_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintRepeatEnding(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintRepeatEnding(TGLayout,TGPainter))*/
	public void testPaintRepeatEndingTGLayoutTGPainter_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[633]getHeader:.getRepeatAlternative:>0:TRUE
		 *[640]i<8:TRUE
		 *[641]getHeader:.getRepeatAlternative:&1<<i:!=0:TRUE
		 *[642]string.length:>0:TRUE
		 *[640]i<8:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintRepeatEnding(layout, painter);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintRepeatEnding(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintRepeatEnding(TGLayout,TGPainter))*/
	public void testPaintRepeatEndingTGLayoutTGPainter_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[633]getHeader:.getRepeatAlternative:>0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintRepeatEnding(layout, painter);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintRepeatEnding(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintRepeatEnding(TGLayout,TGPainter))*/
	public void testPaintRepeatEndingTGLayoutTGPainter_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[633]getHeader:.getRepeatAlternative:>0:TRUE
		 *[640]i<8:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintRepeatEnding(layout, painter);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintRepeatEnding(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintRepeatEnding(TGLayout,TGPainter))*/
	public void testPaintRepeatEndingTGLayoutTGPainter_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[633]getHeader:.getRepeatAlternative:>0:TRUE
		 *[640]i<8:TRUE
		 *[641]getHeader:.getRepeatAlternative:&1<<i:!=0:FALSE
		 *[640]i<8:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintRepeatEnding(layout, painter);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintRepeatEnding(TGLayout, TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintRepeatEnding(TGLayout,TGPainter))*/
	public void testPaintRepeatEndingTGLayoutTGPainter_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[633]getHeader:.getRepeatAlternative:>0:TRUE
		 *[640]i<8:TRUE
		 *[641]getHeader:.getRepeatAlternative:&1<<i:!=0:TRUE
		 *[642]string.length:>0:FALSE
		 *[640]i<8:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintRepeatEnding(layout, painter);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintComponents(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintComponents(TGLayout,TGPainter,int,int))*/
	public void testPaintComponentsTGLayoutTGPainterIntInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[662]it.hasNext:TRUE
		 *[662]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintComponents(layout, painter, fromX, fromY);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintComponents(TGLayout, TGPainter, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#paintComponents(TGLayout,TGPainter,int,int))*/
	public void testPaintComponentsTGLayoutTGPainterIntInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[662]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;
		TGPainter painter = null;
		int fromX = 0;
		int fromY = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.paintComponents(layout, painter, fromX, fromY);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainter_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintDivisions(TGLayout, TGPainter, int, int, int, int, int, boolean)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintDivisionsTGLayoutTGPainterIntIntIntIntIntBoolean_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintClef(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintClefTGLayoutTGPainterIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path18() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path19() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path20() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path21() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path22() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintKeySignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintKeySignatureTGLayoutTGPainterIntInt_Path23() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTimeSignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTimeSignatureTGLayoutTGPainterIntInt_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTimeSignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTimeSignatureTGLayoutTGPainterIntInt_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTimeSignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTimeSignatureTGLayoutTGPainterIntInt_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTimeSignature(TGLayout, TGPainter, int, int)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTimeSignatureTGLayoutTGPainterIntInt_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTempo(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTempoTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTempo(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTempoTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTempo(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTempoTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTempo(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTempoTGLayoutTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTempo(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTempoTGLayoutTGPainter_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path7() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path8() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path9() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path10() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path11() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path12() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path13() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path14() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path15() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path16() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTripletFeel(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTripletFeelTGLayoutTGPainter_Path17() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintLoopMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoopMarkerTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintLoopMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoopMarkerTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintLoopMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoopMarkerTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintLoopMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoopMarkerTGLayoutTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintLoopMarker(TGPainter, float, float, float)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoopMarkerTGPainterFloatFloatFloat() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintMarkerTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintMarker(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintMarkerTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTexts(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTextsTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTexts(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTextsTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintTexts(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintTextsTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.paintPlayMode(TGLayout, TGPainter)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintPlayModeTGLayoutTGPainter_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isPlaying(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isPlaying(TGLayout))*/
	public void testIsPlayingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isPlaying(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getBeatSpacing(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getBeatSpacing(TGBeat))*/
	public void testGetBeatSpacingTGBeat() {
		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getBeatSpacing(beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.hasTrack(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#hasTrack(int))*/
	public void testHasTrackInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1096]getTrack:.getNumber:==number:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int number = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.hasTrack(number);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.hasTrack(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#hasTrack(int))*/
	public void testHasTrackInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1096]getTrack:.getNumber:==number:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int number = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.hasTrack(number);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getWidth(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getWidth(TGLayout))*/
	public void testGetWidthTGLayout_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1103]layout.getStyle:&TGLayout.DISPLAY_MULTITRACK:!=0:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getWidth(layout);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getWidth(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getWidth(TGLayout))*/
	public void testGetWidthTGLayout_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1103]layout.getStyle:&TGLayout.DISPLAY_MULTITRACK:!=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getWidth(layout);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path3() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path4() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path5() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.calculateKeySignatureSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testCalculateKeySignatureSpacingTGLayout_Path6() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getFirstNoteSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getFirstNoteSpacing(TGLayout))*/
	public void testGetFirstNoteSpacingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getFirstNoteSpacing(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getClefSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getClefSpacing(TGLayout))*/
	public void testGetClefSpacingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getClefSpacing(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getKeySignatureSpacing(TGLayout)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getKeySignatureSpacing(TGLayout))*/
	public void testGetKeySignatureSpacingTGLayout() {
		// Method under test arguments
		TGLayout layout = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getKeySignatureSpacing(layout);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getDivisionLength()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getDivisionLength())*/
	public void testGetDivisionLength() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		long methodReturn = constructorInstance.getDivisionLength();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isBufferCreated()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isBufferCreated())*/
	public void testIsBufferCreated() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isBufferCreated();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setBufferCreated(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setBufferCreated(boolean))*/
	public void testSetBufferCreatedBoolean() {
		// Method under test arguments
		boolean bufferCreated = true;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setBufferCreated(bufferCreated);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getPosX()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getPosX())*/
	public void testGetPosX() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getPosX();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setPosX(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setPosX(int))*/
	public void testSetPosXInt() {
		// Method under test arguments
		int posX = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setPosX(posX);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getPosY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getPosY())*/
	public void testGetPosY() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getPosY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setPosY(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setPosY(int))*/
	public void testSetPosYInt() {
		// Method under test arguments
		int posY = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setPosY(posY);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getQuarterSpacing()'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetQuarterSpacing() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMaxQuarterSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetMaxQuarterSpacingTGLayout_Path1() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMaxQuarterSpacing(TGLayout)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testGetMaxQuarterSpacingTGLayout_Path2() {
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getHeaderImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getHeaderImpl())*/
	public void testGetHeaderImpl() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGMeasureHeaderImpl methodReturn = constructorInstance.getHeaderImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getSpacing()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getSpacing())*/
	public void testGetSpacing() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getSpacing();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setSpacing(int))*/
	public void testSetSpacingInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1200]spacing!=this.spacing:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int spacing = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setSpacing(spacing);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setSpacing(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setSpacing(int))*/
	public void testSetSpacingInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1200]spacing!=this.spacing:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int spacing = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setSpacing(spacing);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isOutOfBounds()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isOutOfBounds())*/
	public void testIsOutOfBounds() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isOutOfBounds();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setOutOfBounds(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setOutOfBounds(boolean))*/
	public void testSetOutOfBoundsBoolean() {
		// Method under test arguments
		boolean outOfBounds = true;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setOutOfBounds(outOfBounds);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isFirstOfLine()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isFirstOfLine())*/
	public void testIsFirstOfLine() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isFirstOfLine();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setFirstOfLine(boolean)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setFirstOfLine(boolean))*/
	public void testSetFirstOfLineBoolean() {
		// Method under test arguments
		boolean firstOfLine = true;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setFirstOfLine(firstOfLine);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getTrackImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getTrackImpl())*/
	public void testGetTrackImpl() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGTrackImpl methodReturn = constructorInstance.getTrackImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getTs()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getTs())*/
	public void testGetTs() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGTrackSpacing methodReturn = constructorInstance.getTs();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setTs(TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setTs(TGTrackSpacing))*/
	public void testSetTsTGTrackSpacing_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1231]getTs:==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTs(ts);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setTs(TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setTs(TGTrackSpacing))*/
	public void testSetTsTGTrackSpacing_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1231]getTs:==null:FALSE
		 *[1233]getTs:.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:!=ts.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTs(ts);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setTs(TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setTs(TGTrackSpacing))*/
	public void testSetTsTGTrackSpacing_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1231]getTs:==null:FALSE
		 *[1233]getTs:.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:!=ts.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:FALSE
		 *[1235]getTs:.getPositionTGTrackSpacing.POSITION_TABLATURE:!=ts.getPositionTGTrackSpacing.POSITION_TABLATURE:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTs(ts);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setTs(TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setTs(TGTrackSpacing))*/
	public void testSetTsTGTrackSpacing_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1231]getTs:==null:FALSE
		 *[1233]getTs:.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:!=ts.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:FALSE
		 *[1235]getTs:.getPositionTGTrackSpacing.POSITION_TABLATURE:!=ts.getPositionTGTrackSpacing.POSITION_TABLATURE:FALSE
		 *[1237]getTs:.getPositionTGTrackSpacing.POSITION_EFFECTS:!=ts.getPositionTGTrackSpacing.POSITION_EFFECTS:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTs(ts);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setTs(TGTrackSpacing)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setTs(TGTrackSpacing))*/
	public void testSetTsTGTrackSpacing_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1231]getTs:==null:FALSE
		 *[1233]getTs:.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:!=ts.getPositionTGTrackSpacing.POSITION_SCORE_MIDDLE_LINES:FALSE
		 *[1235]getTs:.getPositionTGTrackSpacing.POSITION_TABLATURE:!=ts.getPositionTGTrackSpacing.POSITION_TABLATURE:FALSE
		 *[1237]getTs:.getPositionTGTrackSpacing.POSITION_EFFECTS:!=ts.getPositionTGTrackSpacing.POSITION_EFFECTS:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGTrackSpacing ts = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTs(ts);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMaxY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMaxY())*/
	public void testGetMaxY() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getMaxY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMinY()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMinY())*/
	public void testGetMinY() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getMinY();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNotEmptyBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNotEmptyBeats())*/
	public void testGetNotEmptyBeats() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNotEmptyBeats();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getNotEmptyVoices()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getNotEmptyVoices())*/
	public void testGetNotEmptyVoices() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getNotEmptyVoices();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getLyricBeatIndex()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getLyricBeatIndex())*/
	public void testGetLyricBeatIndex() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getLyricBeatIndex();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.setLyricBeatIndex(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#setLyricBeatIndex(int))*/
	public void testSetLyricBeatIndexInt() {
		// Method under test arguments
		int lyricBeatIndex = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setLyricBeatIndex(lyricBeatIndex);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isPaintClef()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isPaintClef())*/
	public void testIsPaintClef() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isPaintClef();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isPaintKeySignature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isPaintKeySignature())*/
	public void testIsPaintKeySignature() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isPaintKeySignature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.isDisposed()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#isDisposed())*/
	public void testIsDisposed() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		boolean methodReturn = constructorInstance.isDisposed();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getBuffer())*/
	public void testGetBuffer_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1280]this.buffer==null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGMeasureBuffer methodReturn = constructorInstance.getBuffer();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getBuffer())*/
	public void testGetBuffer_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1280]this.buffer==null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGMeasureBuffer methodReturn = constructorInstance.getBuffer();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeBuffer())*/
	public void testDisposeBuffer_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1287]this.buffer!=null:TRUE
		 *[1287]!this.buffer.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeBuffer();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeBuffer())*/
	public void testDisposeBuffer_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1287]this.buffer!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeBuffer();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeBuffer()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeBuffer())*/
	public void testDisposeBuffer_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1287]this.buffer!=null:TRUE
		 *[1287]!this.buffer.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeBuffer();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:FALSE
		 *[1296]this.markerColor.getBlue:!=m.getColor:.getB:FALSE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:FALSE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:FALSE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:TRUE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:TRUE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:FALSE
		 *[1296]this.markerColor.getBlue:!=m.getColor:.getB:TRUE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:FALSE
		 *[1296]this.markerColor.getBlue:!=m.getColor:.getB:FALSE
		 *[1300]this.markerColor==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:FALSE
		 *[1296]this.markerColor.getBlue:!=m.getColor:.getB:FALSE
		 *[1300]this.markerColor==null:FALSE
		 *[1300]this.markerColor.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:TRUE
		 *[1300]this.markerColor==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:TRUE
		 *[1300]this.markerColor==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.getMarkerColor(TGPainter)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#getMarkerColor(TGPainter))*/
	public void testGetMarkerColorTGPainter_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1295]this.markerColor!=null:TRUE
		 *[1295]!this.markerColor.isDisposed:TRUE
		 *[1296]this.markerColor.getRed:!=m.getColor:.getR:FALSE
		 *[1296]this.markerColor.getGreen:!=m.getColor:.getG:FALSE
		 *[1296]this.markerColor.getBlue:!=m.getColor:.getB:TRUE
		 *[1300]this.markerColor==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGPainter painter = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGColor methodReturn = constructorInstance.getMarkerColor(painter);
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeMarkerColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeMarkerColor())*/
	public void testDisposeMarkerColor_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1307]this.markerColor!=null:TRUE
		 *[1307]!this.markerColor.isDisposed:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeMarkerColor();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeMarkerColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeMarkerColor())*/
	public void testDisposeMarkerColor_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1307]this.markerColor!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeMarkerColor();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeMarkerColor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeMarkerColor())*/
	public void testDisposeMarkerColor_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1307]this.markerColor!=null:TRUE
		 *[1307]!this.markerColor.isDisposed:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeMarkerColor();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeBeats())*/
	public void testDisposeBeats_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1315]it.hasNext:TRUE
		 *[1315]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeBeats();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.disposeBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#disposeBeats())*/
	public void testDisposeBeats_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[1315]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.disposeBeats();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGMeasureImpl.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGMeasureImpl#dispose())*/
	public void testDispose() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.dispose();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getTrack()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getTrack())*/
	public void testGetTrack() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGTrack methodReturn = constructorInstance.getTrack();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.setTrack(TGTrack)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#setTrack(TGTrack))*/
	public void testSetTrackTGTrack() {
		// Method under test arguments
		TGTrack track = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setTrack(track);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getClef()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getClef())*/
	public void testGetClef() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getClef();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.setClef(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#setClef(int))*/
	public void testSetClefInt() {
		// Method under test arguments
		int clef = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setClef(clef);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getKeySignature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getKeySignature())*/
	public void testGetKeySignature() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.getKeySignature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.setKeySignature(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#setKeySignature(int))*/
	public void testSetKeySignatureInt() {
		// Method under test arguments
		int keySignature = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.setKeySignature(keySignature);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getBeats())*/
	public void testGetBeats() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		List methodReturn = constructorInstance.getBeats();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.addBeat(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#addBeat(TGBeat))*/
	public void testAddBeatTGBeat() {
		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.addBeat(beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.moveBeat(int, TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#moveBeat(int,TGBeat))*/
	public void testMoveBeatIntTGBeat() {
		// Method under test arguments
		int index = 0;
		TGBeat beat = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.moveBeat(index, beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.removeBeat(TGBeat)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#removeBeat(TGBeat))*/
	public void testRemoveBeatTGBeat() {
		// Method under test arguments
		TGBeat beat = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.removeBeat(beat);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getBeat(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getBeat(int))*/
	public void testGetBeatInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]index>=0:TRUE
		 *[87]index<countBeats:TRUE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGBeat methodReturn = constructorInstance.getBeat(index);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getBeat(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getBeat(int))*/
	public void testGetBeatInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]index>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGBeat methodReturn = constructorInstance.getBeat(index);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getBeat(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getBeat(int))*/
	public void testGetBeatInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[87]index>=0:TRUE
		 *[87]index<countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int index = 0;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGBeat methodReturn = constructorInstance.getBeat(index);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.countBeats()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#countBeats())*/
	public void testCountBeats() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		int methodReturn = constructorInstance.countBeats();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getHeader()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getHeader())*/
	public void testGetHeader() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		TGMeasureHeader methodReturn = constructorInstance.getHeader();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.setHeader(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#setHeader(TGMeasureHeader))*/
	public void testSetHeaderTGMeasureHeader() {
		// Method under test arguments
		TGMeasureHeader header = null;

		// Constructor arguments
		TGMeasureHeader header_c = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header_c);

		constructorInstance.setHeader(header_c);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getNumber()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getNumber())*/
	public void testGetNumber() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		int methodReturn = constructorInstance.getNumber();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getRepeatClose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getRepeatClose())*/
	public void testGetRepeatClose() {

		// Constructor arguments
		TGMeasureHeader header = null;
		@SuppressWarnings("unused")
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getStart()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getStart())*/
	public void testGetStart() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		long methodReturn = constructorInstance.getStart();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getTempo()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getTempo())*/
	public void testGetTempo() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		TGTempo methodReturn = constructorInstance.getTempo();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getTimeSignature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getTimeSignature())*/
	public void testGetTimeSignature() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		TGTimeSignature methodReturn = constructorInstance.getTimeSignature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.isRepeatOpen()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#isRepeatOpen())*/
	public void testIsRepeatOpen() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		boolean methodReturn = constructorInstance.isRepeatOpen();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getTripletFeel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getTripletFeel())*/
	public void testGetTripletFeel() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		int methodReturn = constructorInstance.getTripletFeel();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getLength()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getLength())*/
	public void testGetLength() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		long methodReturn = constructorInstance.getLength();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.hasMarker()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#hasMarker())*/
	public void testHasMarker() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		boolean methodReturn = constructorInstance.hasMarker();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.getMarker()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#getMarker())*/
	public void testGetMarker() {

		// Constructor arguments
		TGMeasureHeader header = null;
		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		@SuppressWarnings("unused")
		TGMarker methodReturn = constructorInstance.getMarker();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.makeEqual(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#makeEqual(TGMeasure))*/
	public void testMakeEqualTGMeasure_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[149]i<measure.countBeats:TRUE
		 *[149]i<measure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.makeEqual(measure);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.makeEqual(TGMeasure)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#makeEqual(TGMeasure))*/
	public void testMakeEqualTGMeasure_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[149]i<measure.countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGMeasure measure = null;

		// Constructor arguments
		TGMeasureHeader header = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header);

		constructorInstance.makeEqual(measure);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.clone(TGFactory, TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#clone(TGFactory,TGMeasureHeader))*/
	public void testCloneTGFactoryTGMeasureHeader_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]i<countBeats:TRUE
		 *[159]i<countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;
		TGMeasureHeader header = null;

		// Constructor arguments
		TGMeasureHeader header_c = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header_c);

		TGMeasure methodReturn = constructorInstance.clone(factory, header_c);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.song.models.TGMeasure.clone(TGFactory, TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.song.models.TGMeasure#clone(TGFactory,TGMeasureHeader))*/
	public void testCloneTGFactoryTGMeasureHeader_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[159]i<countBeats:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGFactory factory = null;
		TGMeasureHeader header = null;

		// Constructor arguments
		TGMeasureHeader header_c = null;

		TGMeasureImpl constructorInstance = new TGMeasureImpl(header_c);

		TGMeasure methodReturn = constructorInstance.clone(factory, header_c);
		fail("Path 2 assertion not implemented.");
	}

}
