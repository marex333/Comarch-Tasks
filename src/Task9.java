        /*
        9.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb. Program ma wygenerować druga
        tablicę która jest pierwszą tablicą w odwrotnaj kolejności. Wynikiem działania programu ma być wyświetlona pierwsza i
        druga tablica. Przykłady:
        3, 23, 2, 23, 53
        53, 23, 2, 23, 345, 23, 65, 1, 54
        54, 1, 65, 23, 45
        Zakres losowych liczb 0 - 100.
        */

        /*
        PLAN
        1. Create tab1 [10]
        2. Fill tab with random
        3. Create tab2
        4. Fill it with tab1 in reverse
        5. Print tab1
        6. Print tab2

        */
public class Task9 extends Utils {
    private static int tabSize = 10;

    public static void main(String[] args) {
        // 1.
        int[] tab1 = createTab(tabSize);
        // 2.
        tab1 = fillTabWithRandoms(tab1, 10);
        // 3.
        int[] tab2 = createTab(tab1.length);
        // 4
        tab2 = reverseFillTabWithAnother(tab1);
        // 5.
        showTab(tab1);
        System.out.println();
        // 6.
        showTab(tab2);

    }
}
