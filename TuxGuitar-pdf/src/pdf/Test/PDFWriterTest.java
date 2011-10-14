package pdf.Test;

import static org.junit.Assert.fail;

import java.io.OutputStream;
import java.util.List;

import org.eclipse.swt.graphics.ImageData;
import org.herac.tuxguitar.io.pdf.PDFWriter;
import org.junit.Test;

import com.itextpdf.text.Image;

public class PDFWriterTest {

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.write(OutputStream, List)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#write(OutputStream,List))*/
	@Test
	public void testWriteOutputStreamList_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGFileFormatException
		
		 * 
		 *[31]it.hasNext:TRUE
		 *[31]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments
		OutputStream out = null;
		List pages = null;

		try {

			PDFWriter.write(out, pages);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.write(OutputStream, List)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#write(OutputStream,List))*/
	@Test
	public void testWriteOutputStreamList_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGFileFormatException
		
		 * 
		 *[31]it.hasNext:FALSE
		 ****************************************************************************/

		// Method under test arguments
		OutputStream out = null;
		List pages = null;

		try {

			PDFWriter.write(out, pages);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.write(OutputStream, List)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#write(OutputStream,List))*/
	@Test
	public void testWriteOutputStreamList_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 *Throws:
		 *TGFileFormatException
		
		 * 
		 *[39]Throwable throwable caught
		 ****************************************************************************/

		// Method under test arguments
		OutputStream out = null;
		List pages = null;

		try {

			PDFWriter.write(out, pages);
		} catch (Exception exception) {
			fail("Unexpected exception: " + exception.toString());
		}
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.convertToIText(ImageData)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#convertToIText(ImageData))*/
	@Test
	public void testConvertToITextImageData_Path1() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]y<height:TRUE
		 *[57]x<width:TRUE
		 *[57]x<width:FALSE
		 *[56]y<height:FALSE
		 ****************************************************************************/

		// Method under test arguments
		ImageData data = null;

		Image methodReturn = PDFWriter.convertToIText(data);
		fail("Path 1 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.convertToIText(ImageData)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#convertToIText(ImageData))*/
	@Test
	public void testConvertToITextImageData_Path2() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]y<height:FALSE
		 ****************************************************************************/

		// Method under test arguments
		ImageData data = null;

		Image methodReturn = PDFWriter.convertToIText(data);
		fail("Path 2 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.convertToIText(ImageData)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#convertToIText(ImageData))*/
	@Test
	public void testConvertToITextImageData_Path3() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]y<height:TRUE
		 *[57]x<width:FALSE
		 *[56]y<height:FALSE
		 ****************************************************************************/

		// Method under test arguments
		ImageData data = null;

		Image methodReturn = PDFWriter.convertToIText(data);
		fail("Path 3 assertion not implemented.");
	}

	/**
	Test method for 'org.herac.tuxguitar.io.pdf.PDFWriter.convertToIText(ImageData)'
	@CoViewTest (coview_methodundertest=org.herac.tuxguitar.io.pdf.PDFWriter#convertToIText(ImageData))*/
	@Test
	public void testConvertToITextImageData_Path4() {
		/****************************************************************************
		 *This path executes an independent set of decisions listed below.
		 *To fully unit test this path,
		 *
		 *(1) define the data that causes the decisions to evaluate as specified,
		 *(2) and create the assertion.
		 *
		 *Format: [line number][decision]:[evaluates to]
		 * 
		 *[56]y<height:FALSE
		 *[65]BadElementException e caught
		 ****************************************************************************/

		// Method under test arguments
		ImageData data = null;

		Image methodReturn = PDFWriter.convertToIText(data);
		fail("Path 4 assertion not implemented.");
	}

}
