/*      11.Napisz program który losuje dwaie tablice (10 elementów, zakres 0 - 100).
        Wynikiem działania programu mają być wypisane obie tablice, oraz trzecia tablica w które każdy element jest sumą
        odpowiadających elementów z dwóch pierwszych tablic.
        Przykład:
        1 4 4 64 45
        23 32 5 23 324 36 9 87 48
        */

        /*
        PLAN
        1. Create tab1, tab2, tab3 [10]
        2. Fill tab1, tab2 with random (0 - 100)
        3. Sum up each iteration at tab1 and tab2 and put that into tab3
        4. Print tab1, 2, 3

        */
public class Task11 extends Utils {
    private static int tabSize = 10;
    private static int randomsSize = 100;

    public static void main(String[] args) {
        // 1.
        int[] tab1 = createTab(tabSize);
        int[] tab2 = createTab(tabSize);
        int[] tab3 = createTab(tabSize);
        // 2.
        tab1 = fillTabWithRandoms(tab1, randomsSize);
        tab2 = fillTabWithRandoms(tab2, randomsSize);
        // 3.
        for (int i = 0; i < tabSize; i++) {
            tab3[i] = tab1[i] + tab2[i];
        }
        // 4.
        showTab(tab1);
        System.out.println();
        showTab(tab2);
        System.out.println();
        showTab(tab3);
    }
}
