import java.util.*;

public class sorting {

    public static void printArr(int arr[]) { // printing the output array

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void bubblesort(int arr[]) // Code for bubblesort
    {
        for (int turns = 0; turns < arr.length - 1; turns++) {
            for (int j = 0; j < arr.length - turns - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

    }

    public static void selectionsort(int arr[]) {       //code for selection sort
        for (int i = 0; i < arr.length - 2; i++) {
            int minpos = i;
            for (int j = i ; j < arr.length; j++) {
                if (arr[minpos] > arr[j])
                    minpos = j;
            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }

    public static void insertionsort(int arr[]){        //code for insertionsort
        for (int i = 1; i < arr.length; i++) {
            int curr= arr[i];
            int prev= i-1;
            while (prev>=-0 && arr[prev]>curr) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=curr;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        int[] arr = new int[size]; // for initializing array

        System.out.println("Enter value of " + size + " variables");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // bubblesort(arr);
        // selectionsort(arr);
        // insertionsort(arr);
        Arrays.sort(arr);
        printArr(arr);
        sc.close();
    }
}
