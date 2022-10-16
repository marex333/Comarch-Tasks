package firstweektasks;

import java.util.Random;

public class Utils {
    public static int[] createTab(int size) {
        return new int[size];
    }

    public static int[][] createTab(int size1, int size2) {
        return new int[size1][size2];
    }
    // randomMax include
    public static int[] fillTabWithRandoms(int[] tab, int randomMax) {
        randomMax++;
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(randomMax);
        }
        return tab;
    }
    // randomMax include
    public static int[][] fillTabWithRandoms(int[][] tab, int randomMax) {
        randomMax++;
        for (int i = 0; i < tab.length; i++) {
            tab[i] = fillTabWithRandoms(tab[i], randomMax);
        }
        return tab;
    }
    public static int[] reverseFillTabWithAnother(int[] tab) {
        int[] reversedTab = createTab(tab.length);
        for (int i = 0; i < tab.length; i++) {
            reversedTab[i] = tab[tab.length -i - 1];
        }
        return reversedTab;
    }

    public static void showTab(int[] tab) {
        for (int element : tab) System.out.println(element);
    }

    public static void showTab(int[] tab, boolean noNewLine) {
        if(noNewLine) {
            for (int element : tab) System.out.print(element + " ");

        } else showTab(tab);
    }

    public static void showTab(int[][] tab) {
        for (int[] element : tab) {
            showTab(element, true);
            System.out.println();
        }
    }
    public static int tossDice() {
        Random random = new Random();
        return random.nextInt(7);
    }

}