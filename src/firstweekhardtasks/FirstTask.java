/*1.Napisz program w którym zdefiniowana jest zmienna n. Program ma wyświetlać n elementów ciągu Fibbonaciego. Co to jest ciąg Fibbonaciego znajdziecie na wikipedii. Przykład:
        n = 3
        0 1 1
        n = 8
        0 1 1 2 3 5 8 13
*/
package firstweekhardtasks;
public class FirstTask {
    private static int n = 11;
    public static void main(String[] args) {
    for (int element : fibbonachiSequence(n)) {
        System.out.println(element);
    }

    }
    private static int[] fibbonachiSequence(int length) {
        int[] tab = new int[length];
        for (int i = 0; i < tab.length; i++) {
            if (i == 0) tab[0] = 0;
            else if (i == 1) tab[1] = 1;
            else {
                tab[i] = tab[i-1] + tab[i-2];
            }

        }
        return tab;
    }
}
