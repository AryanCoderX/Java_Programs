import java.util.*;

public class backtracking {
    static int  count=0;
    public static void printboard(char board [][]){
        System.out.println("-------------Chess board---------------");
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    // public static boolean isSafe(char board[][], int row, int col) {
    //     for (int i = 0; i < board.length; i++) {
    //         if(board[row+i][col]=='Q')
    //         return false;
    //     }
    //     for (int i = 0; i < board.length; i++) {
    //         if(board[row+i][col+i]=='Q')
    //         return false;
    //     }
    //     for (int i = 0; i < board.length; i++) {
    //         if(board[row+i][col]=='Q')
    //         return false;
    //     }
    //     return true;
    // }

    public static void nqueens(char board[][], int row){
        if(row==board.length)
        {
            // printboard(board);
            count++;
            return;
        }
        for (int col = 0; col < board.length; col++) {
            board[row][col]='Q';
            nqueens(board, row+1);
            board[row][col]='*';
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n=2;
        
        char board[][]= new char [n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='*';
            }
        }
        printboard(board);
        nqueens(board, 0);
        System.out.println("Number of boards:"+count);
        
        sc.close();
    }
}