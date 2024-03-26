import java.util.*;

public class SpiralMatix {
    public static void main(String[] args) {
        int [][]A = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m=3,n=4;
        List<Integer> x=new ArrayList<>();
        // String b=Arrays.toString(A);
        // System.out.println(b);
        int start_col=0;
        int end_col=n-1;
        int start_row=0;
        int end_row=m-1;
        while(start_col<end_col){
            x.add(A[start_row][start_col]);
            start_col++;
        }
        while(start_row<end_row){
            x.add(A[start_row][start_col]);
            start_row++;
        }
        start_col=n-1;
        end_col=0;
        while(start_col>end_col){
            x.add(A[start_row][start_col]);
            start_col--;
        }
        start_row=m-1;
       
        
    }
}
