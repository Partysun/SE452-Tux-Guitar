package org.herac.tuxguitar.util;

import junit.framework.TestCase;

public class TGVersionTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.TGVersion(int, int, int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#TGVersion(int,int,int))*/
	public void testTGVersionIntIntInt() {
		// Method under test arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		// Constructor under test arguments// Constructor under test
		TGVersion constructorInstance = new TGVersion(major, minor, revision);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.getMajor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#getMajor())*/
	public void testGetMajor() {

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		int methodReturn = constructorInstance.getMajor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.getMinor()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#getMinor())*/
	public void testGetMinor() {

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		int methodReturn = constructorInstance.getMinor();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.getRevision()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#getRevision())*/
	public void testGetRevision() {

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		int methodReturn = constructorInstance.getRevision();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.isSameVersion(TGVersion)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#isSameVersion(TGVersion))*/
	public void testIsSameVersionTGVersion_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]version==null:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGVersion version = null;

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		boolean methodReturn = constructorInstance.isSameVersion(version);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.isSameVersion(TGVersion)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#isSameVersion(TGVersion))*/
	public void testIsSameVersionTGVersion_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]version==null:FALSE
		 *[33]version.getMajor:==getMajor:TRUE
		 *[33]version.getMinor:==getMinor:TRUE
		 *[33]version.getRevision:==getRevision:TRUE
		 ****************************************************************************/

		// Method under test arguments
		TGVersion version = null;

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		boolean methodReturn = constructorInstance.isSameVersion(version);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.isSameVersion(TGVersion)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#isSameVersion(TGVersion))*/
	public void testIsSameVersionTGVersion_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]version==null:FALSE
		 *[33]version.getMajor:==getMajor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGVersion version = null;

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		boolean methodReturn = constructorInstance.isSameVersion(version);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.isSameVersion(TGVersion)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#isSameVersion(TGVersion))*/
	public void testIsSameVersionTGVersion_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]version==null:FALSE
		 *[33]version.getMajor:==getMajor:TRUE
		 *[33]version.getMinor:==getMinor:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGVersion version = null;

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		boolean methodReturn = constructorInstance.isSameVersion(version);
		fail("Path 4 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.isSameVersion(TGVersion)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#isSameVersion(TGVersion))*/
	public void testIsSameVersionTGVersion_Path5() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[30]version==null:FALSE
		 *[33]version.getMajor:==getMajor:TRUE
		 *[33]version.getMinor:==getMinor:TRUE
		 *[33]version.getRevision:==getRevision:FALSE
		 ****************************************************************************/

		// Method under test arguments
		TGVersion version = null;

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;

		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		boolean methodReturn = constructorInstance.isSameVersion(version);
		fail("Path 5 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.getVersion()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#getVersion())*/
	public void testGetVersion_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]getRevision:>0:FALSE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		String methodReturn = constructorInstance.getVersion();
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.getVersion()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#getVersion())*/
	public void testGetVersion_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[38]getRevision:>0:TRUE
		 ****************************************************************************/

		// Method under test arguments

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		String methodReturn = constructorInstance.getVersion();
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.util.TGVersion.toString()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.util.TGVersion#toString())*/
	public void testToString() {

		// Constructor arguments
		int major = 0;
		int minor = 0;
		int revision = 0;
		TGVersion constructorInstance = new TGVersion(major, minor, revision);

		String methodReturn = constructorInstance.toString();
		fail("Test method not implemented.");
	}

}
