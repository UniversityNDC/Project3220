import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author dips9
 *
 */
class OpenDataCSVReaderTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}


	/**
	 * Test method for {@link OpenDataCSVReader#numberOfRows()}.
	 */
	OpenDataCSVReader test1 = new OpenDataCSVReader("C:\\Users\\dips9\\Desktop\\RoadMaintenance_YTD.csv");
	OpenDataCSVReader test2 = new OpenDataCSVReader("C:\\Users\\dips9\\Desktop\\Community_Centres.csv");
	@Test
	void testNumberOfRows() {
		int a = test1.numberOfRows();
		assertEquals(85, a);
		int b = test2.numberOfRows();
		assertEquals(17, b);
	}

	/**
	 * Test method for {@link OpenDataCSVReader#numberOfFields(int)}.
	 */
	@Test
	void testNumberOfFields() {
		int a = test1.numberOfFields(5);
		assertEquals(9, a);
		int b = test2.numberOfFields(5);
		assertEquals(5, b);
		
	}

	/**
	 * Test method for {@link OpenDataCSVReader#field(int, int)}.
	 */
	@Test
	void testField() {
		String a = test1.field(3, 3);
		assertEquals("Web Intake", a);
		String b = test2.field(2, 2);
		assertEquals("Roseland Golf and Curling Club", b);
	}

}
