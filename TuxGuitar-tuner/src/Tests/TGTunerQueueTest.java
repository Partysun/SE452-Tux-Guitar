package Tests;

import org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue;

import junit.framework.TestCase;

public class TGTunerQueueTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.TGTunerQueue()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#TGTunerQueue())*/
	public void testTGTunerQueue() {

		// Constructor under test
		TGTunerQueue constructorInstance = new TGTunerQueue();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.add(double)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#add(double))*/
	public void testAddDouble() {
		// Method under test arguments
		double newValue = 0.0;

		TGTunerQueue constructorInstance = new TGTunerQueue();

		constructorInstance.add(newValue);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:FALSE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:FALSE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:FALSE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:FALSE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:FALSE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:FALSE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 11 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path12() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 12 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path13() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:TRUE
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:TRUE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:FALSE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 13 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path14() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 14 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path15() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 15 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path16() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:TRUE
		 *[53]this.queue[i]!=-1:TRUE
		 *[54]j<this.QUEUE_SIZE:TRUE
		 *[56]this.queue[i]>this.queue[j]*this.lowerTollerance:TRUE
		 *[57]this.queue[i]<this.queue[j]*this.upperTollerance:FALSE
		 *[61]this.queue[i]/2>this.queue[j]*this.lowerTollerance:TRUE
		 *[62]this.queue[i]/2<this.queue[j]*this.upperTollerance:TRUE
		 *[66]this.queue[i]*2>this.queue[j]*this.lowerTollerance:TRUE
		 *[67]this.queue[i]*2<this.queue[j]*this.upperTollerance:TRUE
		 *[54]j<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:TRUE
		 *[76]this.similars[i]>=this.similars[maxIndex]:TRUE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 16 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.getFreqApproximation()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#getFreqApproximation())*/
	public void testGetFreqApproximation_Path17() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[49]i<this.QUEUE_SIZE:FALSE
		 *[52]i<this.QUEUE_SIZE:FALSE
		 *[75]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		double methodReturn = constructorInstance.getFreqApproximation();
		fail("Path 17 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#clear())*/
	public void testClear_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[100]i<this.QUEUE_SIZE:TRUE
		 *[100]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		constructorInstance.clear();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue.clear()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.tools.custom.tuner.TGTunerQueue#clear())*/
	public void testClear_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[100]i<this.QUEUE_SIZE:FALSE
		 ****************************************************************************/

		// Method under test arguments

		TGTunerQueue constructorInstance = new TGTunerQueue();

		constructorInstance.clear();
		fail("Path 2 assertion not implemented.");
	}

}
