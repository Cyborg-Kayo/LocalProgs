import java.util.*;
import java.lang.*;

class HavetoSolve{
	public static void main(String[] args) {
		String s="  hello world  ";
		String a=s.trim();
		int i=a.length()-1;
		int j=a.length()-1;
		StringBuilder x=new StringBuilder(20);
		while(j>=0){
			if(a.charAt(i)!=' '){
				i--;
			}
			else{
				for(int k=i+1;k<=j;k++){
					if(x.length()!=0){
						x.append(" "+s.charAt(i));
					}
					else{
						x.append(s.charAt(i));
					}
					
				}
				i--;
				j=i;

			}
		}

	}
}