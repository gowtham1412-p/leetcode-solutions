class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {

        int arr1[][] = new int[n][n];
        for(int i=0;i<n;i++){
            int kpos=rowShift[i]%n;
            for(int j=0;j<n;j++){
                arr1[i][j]=grid[i][(j+kpos)%n];
            }
        }

        int arr2[][]=new int[n][n];
        for(int j=0;j<n;j++){
            int kpos=colShift[j]%n;
            for(int i=0;i<n;i++){
                arr2[i][j]=arr1[(i+kpos)%n][j];
            }
        }
        return arr2;
    }
}