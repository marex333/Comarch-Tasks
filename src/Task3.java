/*      3.Napisz program generujący jednowymiarową tablicę liczb (10 elementów) w której
        każda liczba jest podzielna przez 7. Wynikiem działania programu ma być wyświetlona tablica. Zakres losowych
        liczb 0 - 100.
*/
import java.util.Random;

/*
PLAN
1. Create tab - 10 element
2. Fill it with randoms - 0 - 100 && (n/7 == 0)
3. Show tab

*/
public class Task3 extends Utils {
    public static void main(String[] args) {
        // 1.
        int[] tab = createTab(10);
        // 2.
        tab = customFillTab(tab);
        // 3.
        showTab(tab);
    }

    private static int[] customFillTab (int[] tab) {
        Random random = new Random();
        for (int i = 0; i < tab.length - 1; i++) {
            int n = 0;
            do {
                n = random.nextInt(100);
            } while (!(n % 7 == 0 && n >= 7));
            tab[i] = n;
        }
        return tab;
    }
}
