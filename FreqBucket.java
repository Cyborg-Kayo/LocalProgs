import java.util.*;

class FreqBucket {
    public static void main(String[] args) {
        String a ="VisIhnVu";
        // int[] x=new int[25];
        String b=a.toLowerCase();
        // for(char c:b.toCharArray()){
        //     x[c-'a']++;
        // }
        // for(int i=0;i<x.length;i++){
        //     if(x[i]>1){
        //         System.out.println((char)(i+'a'));
        //     }
        // }

        HashMap<Character,Integer> y=new HashMap<>();
        // for(char d:b.toCharArray()){
        //     if(y.containsKey(d)){
        //         y.put(d,y.get(d)+1);
        //     }
        //     else{
        //         y.put(d,1);
        //     }
        // }
        // System.out.println(y);

        for(char d:b.toCharArray()){
            y.put(d,y.getOrDefault(d, 0)+1);
        }
        System.out.println(y);


    }
}