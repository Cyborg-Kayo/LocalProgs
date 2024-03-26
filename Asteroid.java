import java.util.*;

class Asteroid{
    public static void main(String[] args) {
        int[] a={10,2,-5};
        int max1=0;
        ArrayList<Integer> x=new ArrayList<>();

        for(int i:a){
            if(i==max1){
                max1+=0;
            }
            else if(i<0 && max1<0){
                x.add(i);
            }
            else if(i>0 && max1>0){
                x.add(i);
            }
            else if(i>0 && max1<0){
                max1=Math.max(max1, i);
                x.add(max1);
            }
            else if(i<0 && max1>0){
                max1=Math.max(max1, i);
                x.add(max1);
            }
        }
        for(int )
        int[] b={max1};
        for(int j:b){
            System.out.println(j);
        }
        
    }
}