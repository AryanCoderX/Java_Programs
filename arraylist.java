import java.util.*;

public class arraylist {

    // public static void swap(ArrayList<Integer> list, int n, int m) {
    //     int a= list.get(n);
    //     list.set(n, list.get(m));
    //     list.set(m, a);
    // }

    //0(n^2)
    // public static int waterBF(ArrayList<Integer> wall) { 
    //    int maxArea = Integer.MIN_VALUE;
    //    for (int i = 0; i < wall.size(); i++) {
    //     int area= Integer.MIN_VALUE;
    //     for (int j = 0; j < wall.size(); j++) {
    //         area= Math.min(wall.get(i),wall.get(j))*(j-i);
    //     }
    //     maxArea= Math.max(maxArea, area);
    //    }
    //    return maxArea;

    // }

    // //0(n)
    // public static int water2P(ArrayList<Integer> wall) {
    //    int maxArea = Integer.MIN_VALUE;
    //    int lp=0, rp=wall.size()-1;
    //    while (lp<rp) {
    //     maxArea=Math.max(maxArea, (Math.min(wall.get(lp),wall.get(rp))*(rp-lp)));
    //     if (lp<rp) {
    //         lp++;
    //     }
    //     else
    //     rp--;
    //    }
    //    return maxArea;

    // }

    //0(n^2)
    //     public static boolean pairSumBF(ArrayList<Integer> list, int target) {
    //         for (int i = 0; i < list.size(); i++) {
    //             for (int j = 0; j < list.size(); j++) {
    //                 if (list.get(i)+list.get(j)==target) {
    //                     return true;
    //                 }
    //             }
    //         }
    //         return false;
    //     }

    //     //0(n)
    // public static boolean pairSum2P(ArrayList<Integer> list, int target) {
    //     int st = 0, ed = list.size() - 1;

    //     if (target < list.get(0) + list.get(1) || target > list.get(ed) + list.get(ed - 1)) {
    //         return false;
    //     }

    //     while (st < ed) {
    //         int temp = list.get(st) + list.get(ed);  
    //         if (temp == target) {
    //             return true;
    //         } else if (temp < target) {
    //             st++;
    //         } else {
    //             ed--;
    //         }
    //     }

    //     return false;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // ArrayList<Integer> list = new ArrayList<>();    
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);
        // int target= 10;
        // System.out.println("Is there a pair whose sum is equal to target? "+pairSumBF(list,target));
        
        // ArrayList<Integer> wall = new ArrayList<>();
        // wall.add(1);
        // wall.add(8);
        // wall.add(6);
        // wall.add(2);
        // wall.add(5);
        // wall.add(8);
        // wall.add(5);
        // wall.add(7);
        // System.out.println("Maximum water that can be stored in the containers is :"+waterBF(wall));
        // System.out.println("Maximum water that can be stored in the containers is :"+water2P(wall));
        

        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>(); 
        // ArrayList<Integer> list = new ArrayList<>();
        
        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);

        // mainlist.add(list);
        // ArrayList<Integer> list2 = new ArrayList<>();

        // list2.add(1);
        // list2.add(2);
        
        // mainlist.add(list2);

        // ArrayList<Integer> list3 = new ArrayList<>();

        // list3.add(1);
        // list3.add(2);
        

        // mainlist.add(list3);

        // System.out.println(mainlist);
        

        // int n=1, m=2;
        // swap(list, n, m);   
        // System.out.println(list);

        // Collections.sort(list);
        // System.out.println(list);
        
        

        // for (int i = list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i)+" ");
        // }

        // int max=list.get(0);
        // for (int i = 1; i<list.size();i++) {
        //    max=max>list.get(i)?max:list.get(i);
        // }
        // System.out.println("Maximum in arraylist is "+max);
        


        sc.close();
    }
}