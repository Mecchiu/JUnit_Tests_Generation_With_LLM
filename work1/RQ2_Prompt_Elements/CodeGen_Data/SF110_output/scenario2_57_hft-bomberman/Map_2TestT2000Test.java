// Map_2Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getStartPoint(int)} method.
*/
class Map_2Test {
private static final String TEST = "[Test]";
		
	private Vector<Tile> tileVec1 = new Vector<>();
	private Vector<Tile> tileVec2 = new Vector<>();
	private int[] StartPoint = new int[2];

	static {
		Vector<Point> vectorPoint = new Vector<>();
        Vector<Tile> vector1TILE = new Vector<>();

        startPoint(StartPoint[0], StartPoint[1])

        // tile(VectorTile)
        vector1TILE = new Vector();
//        tileTile(tileVec1)
//        tileTile(tileVec2)

        for (int i = 0; i < vectorPoint.size(); ++i) {
            tileVec1.add(new VectorTile());
        }
        for (int i = 0; i < vectorPoint.size(); ++i) {
            tileVec2.add(new VectorTile());
        }
        tileVec1.add(new VectorTile());
        tileVec2.add(new VectorTile());
    }

	private final Player startPoint1 = new Player(-1, -1);
	private final Player startPoint2 = new Player(-1, -1);
	
	private void startPoint(int playerNo1, int playerNo2) {
		startPoint1[playerNo1] = new Point(Constants.TILE_BORDER *
		6, Constants.TILE_BORDER *
		6
		);
		startPoint2[playerNo2] = new Point(Constants.TILE_BORDER *
		6, Constants.TILE_BORDER *
		6);

		String name = "unit #" + playerNo1 + " : " + playerNo2 + " : "
		+ playerNo1 + " " + playerNo2 + " - " + playerNo2 + " - "
		+ Constants.TILE_BORDER + " - " + Constants.TILE_BORDER + " - " + Constants.TILE_BORDER;
		startPoint[playerNo1][playerNo2] = new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo1 - 1) * Constants.TILE_BORDER * 5), // field
			new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo2 - 1) * Constants.TILE_BORDER * 5), // field
				new Point(Constants.TILE_BORDER + 1, Constants.TILE_BORDER + 1); // field
			// player1
			// + player2
			// + player
			// + player
		String name1 = "unit #" + playerNo1 + " : " + playerNo2 + " : "
		+ name + " " + playerNo1 + " - " + playerNo2 + " - " + name;
		String name2 = "unit #" + playerNo2 + " : " + playerNo1 + " : "
		+ name + " " + playerNo1 + " - " + playerNo2 + " - " + name;
		startPoint[playerNo2][playerNo1] = new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo1 - 1) * Constants.TILE_BORDER * 20), // field
			new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo2 - 1) * Constants.TILE_BORDER * 20), // field
		new Point(Constants.TILE_BORDER + 1, Constants.TILE_BORDER + 1) // field player
				+ playerNo1 * 20 + 25 + playerNo2 * 20, // field player
		new Point(Constants.TILE_BORDER + 1, Constants.TILE_BORDER + 1) // field player
				+ playerNo2 * 20 + 25 + playerNo1 * 20); // field player
		String name3 = "unit #" + playerNo1 + " : " + name2 + " : "
		+ playerNo2 + " - " + playerNo1 + " - " + name;
		String name4 = "unit #" + playerNo2 + " : " + name3 + " : "
		+ playerNo1 + " - " + playerNo2 + " - " + name;
		startPoint[playerNo1][playerNo2] = new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo1 - 1) * Constants.TILE_BORDER * 10), // field
			new Point(Constants.TILE_BORDER *
		6 + 15 + (playerNo2 - 1) * Constants.TILE_BORDER * 10), // field
		new Point(Constants.TILE_BORDER + 1, Constants.TILE_BORDER + 1) // field
		+ playerNo1 * 10 + 25 + playerNo2 * 10, // field player
		new Point(Constants.TILE_BORDER + 1, Constants.TILE_BORDER + 1) // field player
		+ playerNo2 * 10 + 25 + playerNo1 * 10); // field player

		// add a tile with both fields
		VectorTile vector1Tile = new VectorTile();
		VectorTile vector2Tile = new VectorTile();
		tileVec1.add(vector1Tile);
		tileVec2.add(vector2Tile);
		VectorTile vector3 = new VectorTile();
		tileVec1.add(vector3);

		int id = 5 + (char) ('0' + playerNo1) + (char) ('0' + playerNo2);
		Tile tile = new Tile(tileVec1, tileVec2, startPoint1, startPoint2, id,
		tileVec1, tileVec2, startPoint, startPoint1, id + 1, tileVec1, tileVec2,
		startPoint2, id, tileVec1, tileVec2, startPoint, startPoint1,
		tileVec1, tileVec2, startPoint, startPoint2);
		startPoint[playerNo1][playerNo2] = new Point(2 *
		Constants.TILE_BORDER * 6 + 25, 2 * Constants.TILE_BORDER * 6 + 15 + (playerNo1 - 1) * Constants.TILE_BORDER * 15
