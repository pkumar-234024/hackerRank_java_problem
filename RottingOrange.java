import java.util.Queue;
import java.util.LinkedList;

Skip to content
Why GitHub? 
Team
Enterprise
Explore 
Marketplace
Pricing 
Search

Sign in
Sign up
luckykumardev
/
leetcode-solution
1510
Code
Issues
Pull requests
1
Actions
Projects
Security
Insights
Join GitHub today
GitHub is home to over 50 million developers working together to host and review code, manage projects, and build software together.

leetcode-solution/rotton orange.java /
@luckykumardev
luckykumardev rotten orange
Latest commit 6ab48f5 on Jun 14
 History
 1 contributor
54 lines (48 sloc)  1.63 KB
  
class Solution {
    static class Pair {
        int x;
        int y;
        Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
	
    public int orangesRotting(int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        int total = 0, rotten = 0, time = 0;
		
       for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 || grid[i][j] == 2) total++;
                if (grid[i][j] == 2) q.offer(new Pair(i, j));
            }
        }
		
        if (total == 0) return 0;		
        while (! q.isEmpty()) {
            int size = q.size();
            rotten += size;
            if (rotten == total) return time;            			
            for (int i = 0; i < size; i++) {
                Pair p = q.peek();
				
                if (p.x + 1 < grid.length && grid[p.x + 1][p.y] == 1) {
                    grid[p.x + 1][p.y] = 2;
                    q.offer(new Pair(p.x + 1, p.y));
                    tie++;
                }
                if (p.x - 1 >= 0 && grid[p.x - 1][p.y] == 1) {
                    grid[p.x - 1][p.y] = 2;
                    q.offer(new Pair(p.x - 1, p.y));
                    time++;
                }
                if (p.y + 1 < grid[0].length && grid[p.x][p.y + 1] == 1) {
                    grid[p.x][p.y + 1] = 2;
                    q.offer(new Pair(p.x, p.y + 1));
                    time++;
                }
                if (p.y - 1 >= 0 && grid[p.x][p.y - 1] == 1) {
                    grid[p.x][p.y - 1] = 2;
                    q.offer(new Pair(p.x, p.y - 1));
                    time++;
                }
                q.poll();
            }

        }
        return -1;
    }
}


class Rottinggrid{
	public static void main(String[] args) {
		int[][] grid = {
			{2, 1, 1},
			{1, 1, 0},
			{0, 1, 1}
		};
		Solution s = new Solution();
		System.out.println(s.rottingOrange(grid));
	}
}