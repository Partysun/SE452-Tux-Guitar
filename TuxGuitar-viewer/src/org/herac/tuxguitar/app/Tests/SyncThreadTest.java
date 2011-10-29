package org.herac.tuxguitar.app.Tests;

import junit.framework.TestCase;

import org.herac.tuxguitar.app.util.SyncThread;
import org.herac.tuxguitar.util.TGSynchronizer;

public class SyncThreadTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.app.util.SyncThread.SyncThread(TGRunnable)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.SyncThread#SyncThread(TGSynchronizer.TGRunnable))*/
	public void testSyncThreadTGRunnable() {
		// Method under test arguments
		TGSynchronizer.TGRunnable runnable = null;

		// Constructor under test arguments// Constructor under test
		SyncThread constructorInstance = new SyncThread(runnable);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.SyncThread.SyncThread(Runnable)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.SyncThread#SyncThread(Runnable))*/
	public void testSyncThreadRunnable() {
		// Method under test arguments
		Runnable runnable = null;

		// Constructor under test arguments// Constructor under test
		SyncThread constructorInstance = new SyncThread(runnable);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.app.util.SyncThread.run()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.app.util.SyncThread#run())*/
	public void testRun() {

		// Constructor arguments
		TGSynchronizer.TGRunnable runnable = null;
		SyncThread constructorInstance = new SyncThread(runnable);

		constructorInstance.run();
		fail("Test method not implemented.");
	}

}
