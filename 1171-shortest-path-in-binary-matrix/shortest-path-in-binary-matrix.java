class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0]==1 || grid[n-1][n-1]==1)
        return -1;

        if(n==1)
        return 1;

        int [][]dirs = { 
            {-1,-1},{-1,0},{-1,1},//top-left,top,top-right
            {0,-1},{0,1},//left,right
            {1,-1},{1,0},{1,1}//bottom-left,bottom,bottom-right
        };

        Queue<int[]> q = new LinkedList<>();//queue stores {row,col,stepsSoFar}
        boolean [][] visited = new boolean[n][n]; //to avoid revisting cells

        q.offer(new int[]{0,0,1});
        visited[0][0]=true;

        //step 4: BFS loop 
        while(!q.isEmpty()){
            int []cur = q.poll();
            int r = cur[0], c = cur[1] , dist=cur[2];

            //if we reach the destination return the steps taken so far
            if(r==n-1 && c==n-1)
            return dist;

            //try all 8 directions
            for(int[] d:dirs){
                int nr = r + d[0];
                int nc = c + d[1];

                if(nr >= 0 && nr < n && nc >= 0 && nc < n && grid[nr][nc]==0 && !visited[nr][nc]){
                    visited[nr][nc]=true;
                    q.offer(new int[]{nr,nc,dist+1});
                }

            }
        }

        return -1;

        
    }
}