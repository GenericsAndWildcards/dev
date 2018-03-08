package robotsandgrids.application;

import java.util.Arrays;
import java.util.List;

/**
 * @author asmita chitale
 *
 */

public class Constants {

	public static final List<Direction> ROTATIONSEQUENCE = Arrays
			.asList(new Direction[] { Direction.N, Direction.E, Direction.S,
					Direction.W });
	public static final char RIGHT = 'R';
	public static final char LEFT = 'L';
	public static final char MOVE = 'M';
	public static final String SPACE = " ";

}
