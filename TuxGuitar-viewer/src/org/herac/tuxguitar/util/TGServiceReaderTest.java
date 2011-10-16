package org.herac.tuxguitar.util;

import java.util.Iterator;

import junit.framework.TestCase;

public class TGServiceReaderTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.util.TGServiceReader.lookupProviders(Class)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGServiceReader#lookupProviders(Class))*/
	public void testLookupProvidersClass() {
		// Method under test arguments
		Class spi = null;

		Iterator methodReturn = TGServiceReader.lookupProviders(spi);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGServiceReader.lookupProviders(Class, ClassLoader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGServiceReader#lookupProviders(Class,ClassLoader))*/
	public void testLookupProvidersClassClassLoader_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[25]spi==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Class spi = null;
		ClassLoader loader = null;

		Iterator methodReturn = TGServiceReader.lookupProviders(spi, loader);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGServiceReader.lookupProviders(Class, ClassLoader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGServiceReader#lookupProviders(Class,ClassLoader))*/
	public void testLookupProvidersClassClassLoader_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[25]spi==null:FALSE
		 *[25]loader==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		Class spi = null;
		ClassLoader loader = null;

		Iterator methodReturn = TGServiceReader.lookupProviders(spi, loader);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGServiceReader.lookupProviders(Class, ClassLoader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGServiceReader#lookupProviders(Class,ClassLoader))*/
	public void testLookupProvidersClassClassLoader_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[25]spi==null:FALSE
		 *[25]loader==null:FALSE
		 ****************************************************************************/

		// Method under test arguments
		Class spi = null;
		ClassLoader loader = null;

		Iterator methodReturn = TGServiceReader.lookupProviders(spi, loader);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGServiceReader.lookupProviders(Class, ClassLoader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGServiceReader#lookupProviders(Class,ClassLoader))*/
	public void testLookupProvidersClassClassLoader_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[25]spi==null:FALSE
		 *[25]loader==null:FALSE
		 *[29]IOException ioex caught
		 ****************************************************************************/

		// Method under test arguments
		Class spi = null;
		ClassLoader loader = null;

		Iterator methodReturn = TGServiceReader.lookupProviders(spi, loader);
		fail("Path 4 assertion not implemented.");
	}

}
