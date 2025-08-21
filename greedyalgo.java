import java.util.*;

public class greedyalgo {
    public static void activitySelection() {
        int st[] = { 1, 3, 0, 5, 8, 5 };
        int ed[] = { 2, 4, 6, 7, 9, 9 };// this has to be sorted
        ArrayList<Integer> index = new ArrayList<>();
        int count = 1;
        index.add(0);
        int chosenE = ed[0];
        for (int i = 1; i < ed.length; i++) {
            if (st[i] >= chosenE) {
                chosenE = ed[i];
                count++;
                index.add(i);
            }
        }
        System.out.println("Maximum number of activities: " + count);
        for (int i = 0; i < index.size(); i++) {
            System.out.print("A" + index.get(i) + " ");
        }
    }

    public static void fractionalKnapsack() {
        int value[] = { 60, 120, 100 };
        int weight[] = { 10, 30, 20 };
        int w = 50;
        double ratio[][] = new double[value.length][2];
        for (int i = 0; i < weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) (value[i] / weight[i]);
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));// for sorting a 2d array
        double mtv = 0.0;
        for (int i = weight.length - 1; w > 0; i--) {
            if (w - weight[(int) ratio[i][0]] >= 0) {
                mtv += ratio[i][1] * weight[(int) ratio[i][0]];
                w -= weight[(int) ratio[i][0]];
            } else {
                mtv += ratio[i][1] * w;
                w = 0;
            }
        }
        System.out.println("Maximum Total Value=" + mtv);

    }

    public static void indianCoins() {
        int coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int v = 1059;
        int note = 0;

        for (int i = coins.length - 1; i>=0 && v > 0; i--) {
            while (coins[i] <= v) {
                System.out.print(coins[i]+ " ");   
                v -= coins[i];
                note++;
            } 
        }
        System.out.println();
        System.out.println("Minimum number of notes needed is " + note);
    }

    public static void main(String[] args) {
        indianCoins();

    }
}