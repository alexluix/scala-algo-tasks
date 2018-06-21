package lp.algotasks.bigmachine.datastructurereview.interviewcake;

import java.util.Stack;

/**
 * See test for task description
 */
public class IslandsInTheSea {

    private static class Point {
        final int x;
        final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public int countIslands(int[][] map) {
        if (map == null || map.length < 1) throw new IllegalArgumentException("invalid map");

        // 1. find next island, skipping charted cells
        // input: map, access to charted map
        // output: coordinate with land
        // 2. explore the island, skipping charted cells
        // input: map, access to charted map, new land coordinate

        int numberOfIslands = 0;

        boolean[][] accessedMap = new boolean[map.length][map[0].length];
        Point nextIslandPoint = nextIsland(map, accessedMap);

        while (nextIslandPoint != null) {
            numberOfIslands++;
            exploreIsland(nextIslandPoint, map, accessedMap);
            nextIslandPoint = nextIsland(map, accessedMap);
        }

        return numberOfIslands;
    }

    private void exploreIsland(Point islandPoint, int[][] map, boolean[][] accessedMap) {
        if (map[islandPoint.y][islandPoint.x] != 1) throw new IllegalArgumentException("Out of land");

        Stack<Point> nextPoints = new Stack<>();
        nextPoints.push(islandPoint);

        while (!nextPoints.isEmpty()) {
            Point point = nextPoints.pop();
            int x = point.x;
            int y = point.y;

            if (map[y].length != map[0].length) {
                throw new IllegalArgumentException("invalid map");
            }
            if (map.length > y + 1 && map[y + 1].length != map[0].length) {
                throw new IllegalArgumentException("invalid map");
            }

            if (!accessedMap[y][x]) {
                accessedMap[y][x] = true;

                // east
                if (x + 1 < map[y].length && map[y][x + 1] == 1) {
                    nextPoints.push(new Point(x + 1, y));
                }

                // south
                if (y + 1 < map.length && map[y + 1][x] == 1) {
                    nextPoints.push(new Point(x, y + 1));
                }

                // west
                if (x - 1 >= 0 && map[y][x - 1] == 1) {
                    nextPoints.push(new Point(x - 1, y));
                }

                // north
                if (y - 1 >= 0 && map[y - 1][x] == 1) {
                    nextPoints.push(new Point(x, y - 1));
                }
            }
        }
    }

    private Point nextIsland(int[][] map, boolean[][] accessedMap) {
        for (int i = 0; i < map.length; i++) {
            if (map[i].length != map[0].length) throw new IllegalArgumentException("invalid map");

            for (int j = 0; j < map[i].length; j++) {
                if (!accessedMap[i][j]) {
                    if (map[i][j] == 1) return new Point(j, i);

                    accessedMap[i][j] = true;
                }
            }
        }

        return null;
    }

}
