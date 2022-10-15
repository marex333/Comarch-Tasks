/*
        7.Napisz program który generuje jednowymiarową tablicę (10 elementów) losowych liczb. Wynikiem działania
        programu ma być wygenerowana tablica oraz ilość powtórzeń liczby 5. Zakres losowych liczb 0 - 10.
*/
/*
        PLAN:
        1. Create tab[10]
        2. Fill tab with randoms (0-10)
        3. Print tab
        4. Print number of '5' copies

*/

public class Task7 extends Utils{
    static int tabSize = 10;
    static int randomsMax = 10;
    static int copyToCount = 5;

    public static void main(String[] args) {
        // 1.
        int[] tab = createTab(10);
        // 2.
        tab = fillTabWithRandoms(tab, randomsMax);
        // 3.
        showTab(tab);
        // 4.
        System.out.println("\nCopies of " + copyToCount + ": " + calculateCopy(tab, copyToCount));
    }

    private static int calculateCopy (int[] tab, int copyToCount) {
        int copy = 0;
        for (int element : tab) {
            if (element == copyToCount) copy++;
        }
        return copy;
    }
}
