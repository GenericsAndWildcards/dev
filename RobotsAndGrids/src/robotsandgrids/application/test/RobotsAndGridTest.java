package robotsandgrids.application.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import robotsandgrids.application.Grid;
import robotsandgrids.application.GridProcessor;

/**
 * @author asmita chitale
 *
 */

public class RobotsAndGridTest {

	@Test
	public void testGridTraversal() {
		String[] input = new String[5];
		input[0] = "5 5";
		input[1] = "1 2 N";
		input[2] = "LMLMLMLMM";
		input[3] = "3 3 E";
		input[4] = "MMRMMRMRRM";

		try {
			Grid g = GridProcessor.processInput(input);
			if (null != g) {
				System.out.println("Testcase 1 output:");
				List<String> out = g.getGridOutput();
				Assert.assertTrue(out.get(0).equals("1 3 N"));
				System.out.println(out.get(0));
				Assert.assertTrue(out.get(1).equals("5 1 E"));
				System.out.println(out.get(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGridTraversal_interferingInitialPaths() {
		String[] input = new String[5];
		input[0] = "5 5";
		input[1] = "1 2 N";
		input[2] = "LMLMLMLMM";
		input[3] = "1 3 N";
		input[4] = "MMRMMRMRRM";

		try {
			GridProcessor.processInput(input);
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage()
					.equals("Invalid Input Coordinates"));
		}
	}

	@Test
	public void testGridTraversal_interferingPaths() {
		String[] input = new String[5];
		input[0] = "5 5";
		input[1] = "1 2 N";
		input[2] = "LMLMLMLMM";
		input[3] = "2 3 N";
		input[4] = "LMLMRM";

		try {
			Grid g = GridProcessor.processInput(input);
			if (null != g) {
				System.out.println("Testcase 3 output:");
				List<String> out = g.getGridOutput();
				Assert.assertTrue(out.get(0).equals("1 3 N"));
				System.out.println(out.get(0));
				Assert.assertTrue(out.get(1).equals("1 2 W"));
				System.out.println(out.get(1));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGridTraversal_invalidInput() {
		String[] input = new String[4];
		input[0] = "1 2 N";
		input[1] = "LMLMLMLMM";
		input[2] = "2 3 N";
		input[3] = "LMLMRM";

		try {
			GridProcessor.processInput(input);
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage().equals("Invalid grid dimensions"));
		}

	}

	@Test
	public void testGridTraversal_invalidInput2() {
		String[] input = new String[5];
		input[0] = "5 5";
		input[1] = "1 2 N";
		input[2] = "LMLMLMLMM";
		input[3] = "3 3";
		input[4] = "MMRMMRMRRM";

		try {
			GridProcessor.processInput(input);
		} catch (Exception e) {
			Assert.assertTrue(e.getMessage().equals("Invalid robot dimensions"));
		}

	}

}