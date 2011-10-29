package org.herac.tuxguitar.app.Tests;

import java.awt.Component;
import java.awt.Graphics;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.editors.TablatureEditor;
import org.herac.tuxguitar.app.editors.tab.Tablature;

public class TablatureEditorTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.TablatureEditor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#TablatureEditor())*/
	public void testTablatureEditor() {

		// Constructor under test
		TablatureEditor constructorInstance = new TablatureEditor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.getPanel()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#getPanel())*/
	public void testGetPanel() {

		TablatureEditor constructorInstance = new TablatureEditor();

		Component methodReturn = constructorInstance.getPanel();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.getScrollBar()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#getScrollBar())*/
	public void testGetScrollBar() {

		TablatureEditor constructorInstance = new TablatureEditor();

		Component methodReturn = constructorInstance.getScrollBar();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.getTablature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#getTablature())*/
	public void testGetTablature() {

		TablatureEditor constructorInstance = new TablatureEditor();

		Tablature methodReturn = constructorInstance.getTablature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.repaint()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#repaint())*/
	public void testRepaint_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]this.loaded:TRUE
		 *[50]this.tablature!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.repaint();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.repaint()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#repaint())*/
	public void testRepaint_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]this.loaded:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.repaint();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.repaint()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#repaint())*/
	public void testRepaint_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[50]this.loaded:TRUE
		 *[50]this.tablature!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.repaint();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:FALSE
		 *[59]this.size.width!=size.width:FALSE
		 *[59]this.size.height!=size.height:FALSE
		 *[66]this.loaded:TRUE
		 *[66]this.started:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:TRUE
		 *[66]this.loaded:TRUE
		 *[66]this.started:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:FALSE
		 *[59]this.size.width!=size.width:TRUE
		 *[66]this.loaded:TRUE
		 *[66]this.started:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:FALSE
		 *[59]this.size.width!=size.width:FALSE
		 *[59]this.size.height!=size.height:TRUE
		 *[66]this.loaded:TRUE
		 *[66]this.started:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:FALSE
		 *[59]this.size.width!=size.width:FALSE
		 *[59]this.size.height!=size.height:FALSE
		 *[66]this.loaded:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paint(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#paint(Graphics))*/
	public void testPaintGraphics_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[59]this.bufferImage==null:FALSE
		 *[59]this.size.width!=size.width:FALSE
		 *[59]this.size.height!=size.height:FALSE
		 *[66]this.loaded:TRUE
		 *[66]this.started:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.paint(g);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.update(Graphics)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#update(Graphics))*/
	public void testUpdateGraphics() {
		// Method under test arguments
		Graphics g = null;

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.update(g);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.loadTablature()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#loadTablature())*/
	public void testLoadTablature() {

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.loadTablature();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#dispose())*/
	public void testDispose_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[97]this.loaded:TRUE
		 *[97]this.tablature!=null:TRUE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.dispose();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#dispose())*/
	public void testDispose_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[97]this.loaded:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.dispose();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.dispose()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#dispose())*/
	public void testDispose_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[97]this.loaded:TRUE
		 *[97]this.tablature!=null:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.dispose();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.start()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#start())*/
	public void testStart() {

		TablatureEditor constructorInstance = new TablatureEditor();

		constructorInstance.start();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.isStarted()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.editors.TablatureEditor#isStarted())*/
	public void testIsStarted() {

		TablatureEditor constructorInstance = new TablatureEditor();

		boolean methodReturn = constructorInstance.isStarted();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.editors.TablatureEditor.paintLoading(TGPainterImpl)'
	 * !!! Auto generated unit tests for non-public methods or in case of non-public class constructors are a premium feature.
	 * Visit <a href="http://www.codign.com/purchase.html">Codign site</a> for details */
	public void testPaintLoadingTGPainterImpl() {
	}

}
