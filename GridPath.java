public class GridPath {
    private int[][] grid;

    public GridPath(int[][] values){
    }
    public Location getNextLoc(int row, int col) {
    int below = grid[row+1][col];
    int right = grid[row][col+1];
    if (below>right) return new Location(row, col+1);
    else return new Location(row+1,col);
    }

    public int sumPath(int row, int col) {
        return 0;    
    }

    public String toString(){
        String S = "";
        for (int[] row:grid){
            for (int col:row){
                S+=col+"";
            }
            S+="\n";
        }
        return S;
    }
}