package Tests;

import junit.framework.TestCase;
import craigl.spectrumanalyzer.FFT;

public class FFTTest extends TestCase {

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.FFT(int)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#FFT(int))*/
	public void testFFTInt_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]bits>LOG2_MAXFFTSIZE:TRUE
		 *[47]i>=0:TRUE
		 *[49]j<bits:TRUE
		 *[51]i&1<<j:!=0:TRUE
		 *[49]j<bits:FALSE
		 *[47]i>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int bits = 0;

		// Constructor under test arguments// Constructor under test
		FFT constructorInstance = new FFT(bits);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.FFT(int)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#FFT(int))*/
	public void testFFTInt_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]bits>LOG2_MAXFFTSIZE:FALSE
		 *[47]i>=0:TRUE
		 *[49]j<bits:TRUE
		 *[51]i&1<<j:!=0:TRUE
		 *[49]j<bits:FALSE
		 *[47]i>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int bits = 0;

		// Constructor under test arguments// Constructor under test
		FFT constructorInstance = new FFT(bits);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.FFT(int)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#FFT(int))*/
	public void testFFTInt_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]bits>LOG2_MAXFFTSIZE:TRUE
		 *[47]i>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int bits = 0;

		// Constructor under test arguments// Constructor under test
		FFT constructorInstance = new FFT(bits);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.FFT(int)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#FFT(int))*/
	public void testFFTInt_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]bits>LOG2_MAXFFTSIZE:TRUE
		 *[47]i>=0:TRUE
		 *[49]j<bits:FALSE
		 *[47]i>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int bits = 0;

		// Constructor under test arguments// Constructor under test
		FFT constructorInstance = new FFT(bits);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.FFT(int)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#FFT(int))*/
	public void testFFTInt_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[43]bits>LOG2_MAXFFTSIZE:TRUE
		 *[47]i>=0:TRUE
		 *[49]j<bits:TRUE
		 *[51]i&1<<j:!=0:FALSE
		 *[49]j<bits:FALSE
		 *[47]i>=0:FALSE
		 ****************************************************************************/

		// Method under test arguments
		int bits = 0;

		// Constructor under test arguments// Constructor under test
		FFT constructorInstance = new FFT(bits);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:FALSE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path6() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 6 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path7() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:FALSE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 7 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path8() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 8 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path9() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:TRUE
		 *[74]k<n:TRUE
		 *[75]i<n2:TRUE
		 *[82]invFlag:TRUE
		 *[75]i<n2:FALSE
		 *[74]k<n:FALSE
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:TRUE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 9 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path10() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:FALSE
		 *[97]k<n:TRUE
		 *[98]i=this.bitreverse[k]:<=k:FALSE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 10 assertion not implemented.");
	}

	/**
	Test method for 'craigl.spectrumanalyzer.FFT.doFFT(double[], double[], boolean)'
	@CoViewTest (coview_methodundertest=craigl.spectrumanalyzer.FFT#doFFT(double[],double[],boolean))*/
	public void testDoFFTDoubleArrayDoubleArrayBoolean_Path11() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[73]l<this.bits:FALSE
		 *[97]k<n:FALSE
		 *[111]!invFlag:TRUE
		 *[114]i<n:TRUE
		 *[114]i<n:FALSE
		 ****************************************************************************/

		// Method under test arguments
		double[] xr = null;
		double[] xi = null;
		boolean invFlag = true;

		// Constructor arguments
		int bits = 0;

		FFT constructorInstance = new FFT(bits);

		constructorInstance.doFFT(xr, xi, invFlag);
		fail("Path 11 assertion not implemented.");
	}

}
