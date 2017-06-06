/**
 * Created by ryan on 3/6/17.
 * https://leetcode.com/problems/island-perimeter/
 */
public class IslandPerimeter
{
    public static int islandPerimeter(int[][] grid)
    {
        int p = 0;
        // Y
        for (int i = 0; i < grid.length; i++)
        {
            // X
            for (int j = 0; j < grid[i].length; j++)
            {
                if (grid[i][j] == 1)
                {
                    // left
                    if (j-1 < 0 || grid[i][j-1] == 0)
                    {
                        p++;
                    }

                    // right
                    if (j+1 > grid[i].length - 1 || grid[i][j+1] == 0)
                    {
                        p++;
                    }

                    // up
                    if (i-1 < 0 || grid[i-1][j] == 0)
                    {
                        p++;
                    }

                    // down
                    if (i+1 > grid.length-1 || grid[i+1][j] == 0)
                    {
                        p++;
                    }
                }
            }
        }
        return p;
    }

    public static void main(String[] args)
    {
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};

        int[][] grid2 = {{1,0}};

        System.out.println(islandPerimeter(grid2));
    }
}
