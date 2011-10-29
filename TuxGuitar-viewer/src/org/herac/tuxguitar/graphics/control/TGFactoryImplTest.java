package org.herac.tuxguitar.graphics.control;

import junit.framework.TestCase;

import org.herac.tuxguitar.song.models.TGBeat;
import org.herac.tuxguitar.song.models.TGChord;
import org.herac.tuxguitar.song.models.TGLyric;
import org.herac.tuxguitar.song.models.TGMeasure;
import org.herac.tuxguitar.song.models.TGMeasureHeader;
import org.herac.tuxguitar.song.models.TGNote;
import org.herac.tuxguitar.song.models.TGText;
import org.herac.tuxguitar.song.models.TGTrack;
import org.herac.tuxguitar.song.models.TGVoice;

public class TGFactoryImplTest extends TestCase {

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.TGFactoryImpl()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#TGFactoryImpl())*/
	public void testTGFactoryImpl() {

		// Constructor under test
		TGFactoryImpl constructorInstance = new TGFactoryImpl();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newHeader()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newHeader())*/
	public void testNewHeader() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGMeasureHeader methodReturn = constructorInstance.newHeader();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newTrack()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newTrack())*/
	public void testNewTrack() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGTrack methodReturn = constructorInstance.newTrack();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newMeasure(TGMeasureHeader)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newMeasure(TGMeasureHeader))*/
	public void testNewMeasureTGMeasureHeader() {
		// Method under test arguments
		TGMeasureHeader header = null;

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGMeasure methodReturn = constructorInstance.newMeasure(header);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newNote()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newNote())*/
	public void testNewNote() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGNote methodReturn = constructorInstance.newNote();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newBeat()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newBeat())*/
	public void testNewBeat() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGBeat methodReturn = constructorInstance.newBeat();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newVoice(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newVoice(int))*/
	public void testNewVoiceInt() {
		// Method under test arguments
		int index = 0;

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGVoice methodReturn = constructorInstance.newVoice(index);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newLyric()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newLyric())*/
	public void testNewLyric() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGLyric methodReturn = constructorInstance.newLyric();
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newChord(int)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newChord(int))*/
	public void testNewChordInt() {
		// Method under test arguments
		int length = 0;

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGChord methodReturn = constructorInstance.newChord(length);
		fail("Test method not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.graphics.control.TGFactoryImpl.newText()'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.graphics.control.TGFactoryImpl#newText())*/
	public void testNewText() {

		TGFactoryImpl constructorInstance = new TGFactoryImpl();

		TGText methodReturn = constructorInstance.newText();
		fail("Test method not implemented.");
	}

}
