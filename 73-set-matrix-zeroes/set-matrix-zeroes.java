class Solution {
    static class map{
        int key;
        int value;
        map(int key,int value){
            this.key=key;
            this.value=value;
        }

    }
    public void setZeroes(int[][] matrix) {
        ArrayList<map>list = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                list.add(new map(i,j));
            }
        }
        for(map p:list){
            int r = p.key;
            int c = p.value;
            for(int i=0;i<matrix[0].length;i++){
                matrix[r][i]=0;
            }
            for(int j=0;j<matrix.length;j++){
                matrix[j][c]=0;
            }
        }
    }
}