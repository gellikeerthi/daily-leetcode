//see in question they said to change the current matrix
//firstly i had done this problem by taking another matrix like temp and is stored values in it.but the main question is changing the current matrix
//so i again change the values from temp matrix to original matrix


public static void rotateClockwise(int[][] matrix) {
    // write your code here 
    int n=matrix[0].length;
  int temp[][]=new int[n][n];
  int r=0;
       for(int j=0;j<n;j++){
           int c=0;
            for(int i=n-1;i>=0;i--){
          temp[r][c]=matrix[i][j];
            c++;}
            r++;
       }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
             matrix[i][j]=temp[i][j]; 
            }
        
        } 
}
        
