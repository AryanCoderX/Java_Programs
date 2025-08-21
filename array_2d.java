import java.util.*;

public class array_2d {
    // Staircase Search
    public static boolean StaircaseSearch(int arr[][],int n, int key) {
       int row=0, col=n-1;
        while (row<n && col>=0) {
            if(arr[row][col]==key){
                System.out.println("Element is available in the array");
                return true;
            }
            else if (arr[row][col]>key) {
                col--;
            }
            else
                row++;
        }
        System.out.println("Element is not available");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter order of matrix: ");
        int n = sc.nextInt();
        int m=n;

        int[][] matrix = new int[n][m];
        int arr[][]={{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        int key= 33;
        int nn= arr[0].length;
        StaircaseSearch(arr, nn, key);

        // Input matrix
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Spiral Matrix
        int startRow=0, startCol=0, endRow=n-1 , endCol= m-1;
        while (startRow<= endRow && startCol<= endCol) {
            //top
            for (int j = startRow; j <= endRow; j++) {
                System.out.print(matrix[startRow][j]+" ");  
            }
            //Right
            for (int i = startCol+1; i <= endCol; i++) {
                System.out.print(matrix[i][endCol]+" ");  
            }
            //bottom
            for (int j = endRow-1; j >=startRow; j--) {
                System.out.print(matrix[endRow][j]+" ");  
            }
            //left
            for (int i = endCol-1; i > startCol ; i--) {
                System.out.print(matrix[i][startCol]+" ");  
            }
            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }


        
        
        sc.close();

    }
}