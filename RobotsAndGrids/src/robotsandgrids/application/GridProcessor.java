package robotsandgrids.application;

/**
 * @author asmita chitale
 *
 */

public class GridProcessor {

	public static Grid processInput(String[] input) throws Exception {
		if (null != input && input.length > 0) {
			String gridSize = input[0];
			if (null != gridSize) {
				String[] dimensions = gridSize.split(Constants.SPACE);
				if (null != dimensions && dimensions.length == 2) {
					int x = Integer.parseInt(dimensions[0]);
					int y = Integer.parseInt(dimensions[1]);

					Grid grid = new Grid(x, y);
					for (int i = 1; i < input.length; i += 2) {
						String[] robotDetails = input[i].split(Constants.SPACE);
						if (null != robotDetails && robotDetails.length == 3) {
							int rx = Integer.parseInt(robotDetails[0]);
							int ry = Integer.parseInt(robotDetails[1]);
							Coordinates rc = new Coordinates(rx, ry);
							Direction rd = Direction.valueOf(robotDetails[2]);
							Robot r = new Robot();
							r.setCoordinates(rc);
							r.setDirection(rd);
							if (i + 1 < input.length) {
								grid.traverseGrid(r, input[i + 1]);
							}
						} else {
							throw new RuntimeException(
									"Invalid robot dimensions");
						}
					}
					return grid;
				} else {
					throw new RuntimeException("Invalid grid dimensions");
				}
			}
		}
		return null;
	}

}
