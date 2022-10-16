package firstweektasks;/*
        10.Napisz program który generuje dwie tablice (10 elementów) losowych liczb. Wynikiem
        działania programu mają być wyświetlone obie tablice oraz trzecia tablica będąca połączeniem dwóch wygenerowancyh.
        Przykład:
        3, 5, 12, 34, 45
        45, 21, 65, 23, 1
        3, 5, 12, 34, 45, 45, 21, 65, 23, 1
*/

/*
        PLAN
        1. Create tab1, tab2, tab3
        2. Fill tab1, tab2 with randoms
        3. Merge tab1 and tab2 into tab3
        4. Print tab1, tab2, tab3
*/


public class Task10 extends Utils {
    private static int tabSize = 10;
    private static int randomSize = 100;

    public static void main(String[] args) {
        // 1.
        int[] tab1 = createTab(tabSize);
        int[] tab2 = createTab(tabSize);
        int[] tab3 = createTab(tab1.length + tab2.length);
        // 2.
        tab1 = fillTabWithRandoms(tab1, randomSize);
        tab2 = fillTabWithRandoms(tab2, randomSize);
        // 3.
        for (int i = 0; i < tab1.length; i++) tab3[i] = tab1[i];
        for (int i = 0; i < tab2.length; i++) tab3[i + tab1.length] = tab2[i];
        // 4.
        showTab(tab1);
        System.out.println();
        showTab(tab2);
        System.out.println();
        showTab(tab3);
    }
}
