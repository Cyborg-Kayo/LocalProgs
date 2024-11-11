import java.util.*;

class RemoveDup{
    public static void main(String[] args) {

        int[] arr={1,1,2,3,3,4,5,5};
        int n=arr.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
                
            }
        }
        int[] out=Arrays.copyOfRange(arr,0,i+1);
        for(int k:out){
            System.out.println(k);
        }
    }
}