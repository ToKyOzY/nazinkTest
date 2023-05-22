package stepDefinions;

public class Grid {
    private int[][] grid;

    public Grid(int[][] grid) {
        this.grid = grid;
    }

    public int getCellValue(int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length) {
            // Cell is out of bounds
            return -1; // or throw an exception, depending on your requirements
        }

        return grid[row][column];
    }
}
