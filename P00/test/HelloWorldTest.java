import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * LEW EN QUAN 21013885, 26/4/2022 10:10AM
 */

/**
 * @author 21013885
 *
 */
public class HelloWorldTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void test() {
	//	fail("Not yet implemented");
		System.out.println("This is the testcase for HelloWorld");
		String str1 = "This is the testcase for HelloWorld";
		String str2 = "This is the testcase for HelloWorld";
		assertEquals(str1, str2);

	}

}
