import java.util.*;

public class Firstandlast {
    public static void main(String[] args) {
        int[] arr= {10 ,10, 12, 13 ,13 ,16 ,18, 18, 18, 21};
        int x=10;
        ArrayList<Integer> a=new ArrayList<>();
        int first=0;
        int last=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                if(first==0){
                    first=i;
                }
                else{
                    last=i;
                }
            }
        }
        if(first!=0 && last==0){
            last=first;
        }

        a.add(first);
        a.add(last);
        System.out.println(a);
    }
    
}
