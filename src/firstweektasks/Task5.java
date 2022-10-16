package firstweektasks;      /*
       5.Napisz program
        generujący jednowymiarową tablicę (10 elementów) liczb w której każda liczba jest losowa ale nie jest mniejsza
        niż poprzednia liczba. Przykłady:
        23, 34, 53, 60, 80
        0, 10, 70, 70, 70
        nieprawidłowy wynik:
        34, 56, 34, 78, 99 - trzecia liczba jest mniejsza niż poprzednia (druga).
        Wynikiem działania programu ma być wyświetlona wygenerowana tablica. Zakres losowych
        liczb 0 - 20.
        */

      import java.util.Random;

      /*
            PLAN
            1. Create tab[10]
            2. Fill tab with randoms (next number is even or higher than previous) - (0 - 20)
            3. Print tab
            */
public class Task5 extends Utils {
    private static int tabSize = 10;
    private static int randomMax = 20;

    public static void main(String[] args) {
        // 1.
        int[] tab = createTab(tabSize);
        // 2.
        tab = fillTabWithCustomRandoms(tab);
        // 3.
        showTab(tab);
    }
    private static int[] fillTabWithCustomRandoms (int[] tab) {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            if (i != 0) {
                do {
                    tab[i] = random.nextInt(randomMax + 1);
                } while (tab[i] < tab[i - 1]);
            } else tab[i] = random.nextInt(randomMax + 1);
        }
        return tab;
    }
}
