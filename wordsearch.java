import java.util.*;

public class wordsearch {
    public static boolean visited[][];
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        int rows=board.length;
        int cols=board[0].length;
        visited=visited=new boolean[rows][cols];
     
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(word.charAt(0)==board[i][j] && search(i,j,0,board,word)){
                    System.err.println("Yes");
                }
            }
        }
        
    }
    public static boolean search(int i,int j,int index,char[][] board,String word){
        if(index==word.length()){
            return true;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length||word.charAt(index)!=board[i][j] || visited[i][j]){
            return false;
        }
        visited[i][j]=true;
        if(search(i+1,j,index+1,board,word)||search(i-1,j,index+1,board,word)||search(i,j+1,index+1,board,word)||search(i,j-1,index+1,board,word)){
            return true;
        }
        visited[i][j]=false;
        return false;
        
    }
    
}
