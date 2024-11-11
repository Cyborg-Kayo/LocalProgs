import java.util.*;

class Solution {
    public static void main(String[] args) {
        String num= "1432219";
        int k=3;

        Stack<Integer> s = new Stack<>();
        int i=1;
        s.push(num.charAt(0)-'0');
        while(i<num.length() && !s.isEmpty() && k>3){
            if(s.peek()>num.charAt(i)){
                s.pop();
                k--;
            }
            s.push(num.charAt(i)-'0');
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        while(sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        sb.reverse();
        System.out.println(sb.toString());
        

    }
}