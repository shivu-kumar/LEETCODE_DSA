class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]>q=new LinkedList<>();
        int FreshCount=0;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j,0});
                }
                else if(grid[i][j]==1)
                FreshCount++;
            }
        }
        int timeTaken=0;
        int [][]directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int []cur=q.poll();
            int r=cur[0],c=cur[1],t=cur[2];
            timeTaken=Math.max(timeTaken,t);
            for(int []dir : directions){
            int nr=r+dir[0];
            int nc=c+dir[1];
            if(nr>=0 && nr<row && nc>=0 && nc<col && grid[nr][nc]==1){
                grid[nr][nc]=2;
                FreshCount--;
                q.add(new int[]{nr,nc,t+1});
            }
            
        }

        }

        return FreshCount > 0 ? -1 : timeTaken;

        

    }
}