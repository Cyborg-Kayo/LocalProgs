import java.util.*;

public class missingnum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(1,2);
        a.put(2,5);
        a.put(5,1);
        System.out.println(a.get(1));
        

    }
}
