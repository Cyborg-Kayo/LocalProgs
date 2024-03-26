import java.util.*;

class SplitString {
    public static void main(String[] args) {
        String a="Hello this     is   vishnu";
        String[] b=a.split(" +");
        for(String i:b){
            System.out.println(i);
        }
    }
}
