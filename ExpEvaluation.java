import java.util.*;

public class ExpEvaluation {
    public static void main(String[] args) {
        
        String a="13+4/2";
        ArrayList<Integer> x=new ArrayList<>();
        ArrayList<Character> y=new ArrayList<>();
        int num=0;
        for(int i=0;i<a.length();i++){
            if(Character.isDigit(a.charAt(i))){
                num=num*10+(a.charAt(i)-'0');
            }
            else{
                x.add(num);
                num=0;
                y.add(a.charAt(i));
            }
        }
        x.add(num);
        for(int i=0;i<y.size();i++){
            int ope=0;
            if(y.get(i)=='/'||y.get(i)=='*'){
                if(y.get(i)=='/'){
                    ope=x.get(i)/x.get(i+1);
                }
                else if(y.get(i)=='*'){
                    ope=x.get(i)*x.get(i+1);
                }
                x.set(i,ope);
                y.remove(i);
                x.remove(i+1);
                i--;
            }
        }
        int result=x.get(0);
        for(int i=0;i<y.size();i++){
            if(y.get(i)=='+'||y.get(i)=='-'){
                if(y.get(i)=='+'){
                    result=x.get(i)+x.get(i+1);
                }
                else if(y.get(i)=='-'){
                    result=x.get(i)-x.get(i+1);
                }
            }
        }
        System.out.println(result);
    }   
}
    
    
