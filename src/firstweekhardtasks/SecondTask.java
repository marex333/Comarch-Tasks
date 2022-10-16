        /*
        2.Napisz program który generuje 10 elementową tablicę liczb (0 - 100) a następnie przesuwa tą tablicę o 3 elementy w prawo.
         Program ma wypisywać na ekranie pierwotną oraz przesuniętą tablicę. Przykład:
        [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        [8, 9, 10, 1, 2, 3, 4, 5, 6, 7]
*/
package firstweekhardtasks;
import firstweektasks.Utils;
public class SecondTask extends Utils {
    private static int tabSize = 10;
    private static int elementsToMoveBy = 3;

    public static void main(String[] args) {
        int[] tab = createTab(tabSize);
        tab = fillTabWithRandoms(tab, tabSize);
        showTab(tab);
        System.out.println();
        rescheduleTab(tab, elementsToMoveBy);
        showTab(rescheduleTab(tab, elementsToMoveBy));
    }
    private static int[] rescheduleTab(int[] tab, int elementsToMoveBy) {
        int tmp = tab[0];
        for (int j = 0; j < elementsToMoveBy; j++){
            for (int i = 0; i < tab.length - 1; i++) {
                tab[i] = tmp;
                tmp = tab[i + 1];
                if (tab[i] == tab.length - 2) {
                    tab[0] = tab[i];
                }

            }
        }
        return tab;
    }

}
