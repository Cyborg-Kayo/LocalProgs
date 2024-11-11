import java.util.*;

public class ereg {
    public static void main(String[] args) {
        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};

        int m=grid.length;
        int n=grid[0].length; 

        int[][] dp=new int[m][n];
        for(int i=0; i<m; i++){
            System.out.println(dp[i]);
            Arrays.fill(dp[i],-1); 
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int one=Integer.MAX_VALUE; 
                int two=Integer.MAX_VALUE;
                if(i==j && i==0){
                    dp[0][0]=grid[0][0];
                    continue; 
                }
                if(i>0) one=dp[i-1][j]+grid[i][j];
                if(j>0) two=dp[i][j-1]+grid[i][j];

                dp[i][j]=Math.min(one,two);
            }
        }

        System.out.println(dp[m-1][n-1]);
    }
}

