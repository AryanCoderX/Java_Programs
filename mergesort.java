import java.util.*;

public class mergesort {

    public static void mergeSort(int ar[], int st, int ed) {
        if (st >= ed) {
            return;
        }
        int mid = st + (ed - st) / 2;
        mergeSort(ar, st, mid);
        mergeSort(ar, mid + 1, ed);
        merge(ar, st, mid, ed);
    }

    public static void merge(int ar[], int st, int mid, int ed) {
        int temp[] = new int[ed - st + 1];
        int i = st, j = mid + 1, k = 0;

        while (i <= mid && j <= ed) {
            if (ar[i] < ar[j]) {
                temp[k++] = ar[i++];
            } else
                temp[k++] = ar[j++];
        }
        while (i <= mid) {
            temp[k++] = ar[i++];
        }
        while (j <= ed) {
            temp[k++] = ar[j++];
        }

        for (int k2 = 0; k2 < temp.length; k2++) {
            ar[st + k2] = temp[k2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ar[] = { 6, 3, 9, 5, 2, 8 };
        System.out.println("Initial Array");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }

        mergeSort(ar, 0, ar.length - 1);

        System.out.println();
        System.out.println("Array after MergeSort");

        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        sc.close();
    }
}