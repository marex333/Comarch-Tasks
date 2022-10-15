import java.util.Random;

public class Utils {
    public static int[] createTab(int size) {
        return new int[size];
    }
    public static int[][] createTab(int size1, int size2) {
        return new int[size1][size2];
    }

    public static int[] fillTabWithRandoms(int[] tab, int randomMax) {
        randomMax++;
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(randomMax);
        }
        return tab;
    }
    public static int[][] fillTabWithRandoms(int[][] tab, int randomMax) {
        randomMax++;
        for (int i = 0; i < tab.length - 1; i++) {
            tab[i] = fillTabWithRandoms(tab[i], randomMax);
        }
        return tab;
    }

    public static void showTab(int[] tab) {
        for (int element : tab) {
            System.out.println(element);
        }
    }


}