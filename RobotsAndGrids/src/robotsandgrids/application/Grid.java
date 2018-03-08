package robotsandgrids.application;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author asmita chitale
 *
 */

public class Grid {

	private Set<Coordinates> occupiedCoordinates;
	private Coordinates gridSize;
	private List<Robot> squad;

	public Grid(int x, int y) {
		gridSize = new Coordinates(x, y);
		occupiedCoordinates = new HashSet<Coordinates>();
		squad = new LinkedList<Robot>();
	}

	public void traverseGrid(Robot r, String directionSequence) {

		if (null == r || null == r.getCoordinates() || null == r.getDirection()
				|| 0 >= r.getCoordinates().getX()
				|| gridSize.getX() <= r.getCoordinates().getX()
				|| 0 >= r.getCoordinates().getY()
				|| gridSize.getY() <= r.getCoordinates().getY()
				|| occupiedCoordinates.contains(r.getCoordinates())) {
			throw new RuntimeException("Invalid Input Coordinates");
		}

		for (int i = 0; i < directionSequence.length(); i++) {
			char currDirection = directionSequence.charAt(i);
			switch (currDirection) {
			case Constants.LEFT:
				rotateRobot(r, Constants.LEFT);
				break;
			case Constants.RIGHT:
				rotateRobot(r, Constants.RIGHT);
				break;
			case Constants.MOVE:
				moveRobot(r);
				break;
			default:
				break;
			}
		}
		squad.add(r);
		occupiedCoordinates.add(r.getCoordinates());
	}

	private void rotateRobot(Robot r, char direction) {

		if (null == r || null == r.getDirection())
			return;

		int index = Constants.ROTATIONSEQUENCE.indexOf(r.getDirection());
		if (direction == Constants.LEFT) {
			index = index - 1 < 0 ? (Constants.ROTATIONSEQUENCE.size() - 1)
					: index - 1;
			r.setDirection(Constants.ROTATIONSEQUENCE.get(index));
		} else if (direction == Constants.RIGHT) {
			r.setDirection(Constants.ROTATIONSEQUENCE.get((index + 1) % 4));
		} else {
			throw new RuntimeException("Invalid rotation input");
		}
	}

	private void moveRobot(Robot r) {
		if (null == r || null == r.getCoordinates() || null == r.getDirection())
			return;
		int x = r.getCoordinates().getX();
		int y = r.getCoordinates().getY();
		switch (r.getDirection()) {
		case N:
			y = y + 1;
			break;
		case E:
			x = x + 1;
			break;
		case S:
			y = y - 1;
			break;
		case W:
			x = x - 1;
			break;
		default:
			break;
		}
		if (checkValidity(x, y)) {
			r.getCoordinates().setX(x);
			r.getCoordinates().setY(y);
		}

	}

	private boolean checkValidity(int x, int y) {

		return (x >= 0 && x <= gridSize.getX() && y >= 0
				&& y <= gridSize.getY() && !occupiedCoordinates
					.contains(new Coordinates(x, y)));
	}

	public List<String> getGridOutput() {
		List<String> output = new LinkedList<String>();
		for (Robot r : squad) {
			if (null != r) {
				output.add(r.toString());
			}
		}
		return output;
	}

}
