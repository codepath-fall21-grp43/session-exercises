
import java.util.*;
public class WeekNine{

  
   public static void main(String...args) {
     
   }
   public static int getIslands(int[][] grid) {
  // Understand: 

  // Plan: 
  // If one is found increment island.
  // Use DFS to search all its neighbors.
  /*
  11110
  11010
  11000
  00000
  */

  int islands = 0; 
  for(int col=0; col<grid[0].length; col++) {

    for(int row=0; row<grid.length; row++) {

      if(grid[row][col] == 1) {
        islands++;
        visitIsland(grid, row, col); 
      }
    }
  }
  // return ?
}
  public static int visitIsland(int[][] grid, int row, int col) {
    grid[row][col] = 0;
  }

}
