class Solution {
    public int[][] generateMatrix(int n) {
        int mat[][]=new int[n][n];
        int top=0,bottom=n-1;
        int left=0,right=n-1;
        int ans=1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                mat[top][i]=ans++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                mat[i][right]=ans++;
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    mat[bottom][i]=ans++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=ans++;
                }
                left++;
            }
        }
        return mat;
    }
}