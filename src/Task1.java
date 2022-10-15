/*1.
   Napisz program generujący jednowymiarową tablice liczb (10 elementów).
   Program powinien sortować tablicę przy pomocy algorytmu sortowania przez wstawianie lub przez wybieranie
   (do wyboru, dla chętnych oba algorytmy). Wynikiem działania programu ma być wyświetlona tablica przed
   sortowaniem oraz posortowana.*/

    /*
    Plan
    1. Create tab - 10 element
    2. Fill up tab with randoms
    3. Show unsorted tab
    4. Use Selection Sort / Insertion sort (flag)
    5. Show sorted tab
    * */

public class Task1 extends Utils {
    private static int tabSize = 10;
    // change sorter
    private static boolean selectionSortRatherThanInsertion = true;

    public static void main(String[] args) {
        // 1.
        int[] tab = createTab(tabSize);
        // 2.
        tab = fillTabWithRandoms(tab, 1000);
        // 3.
        showTab(tab);
        // 4.
        if (selectionSortRatherThanInsertion) tab = selectionSort(tab);
        else tab = insertionSort(tab);
        // 5.
        System.out.println("====================== New Tab ======================");
        showTab(tab);
    }
    // smallest -> biggest
    private static int[] selectionSort(int[] table) {
        //main loop
        for (int i = 0; i < table.length - 1; i++) {
            //inner loop - starts from i+1 to avoid finding same number
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[i]) {
                    int temp = table[i];
                    table[i] = table[j];
                    table[j] = temp;
                }
            }
        }
        return table;
    }
    private static int[] insertionSort(int[] table) {
        // main loop
        for (int i = 0; i < table.length - 1; i++) {
            boolean flagToStartOver = false;
            // check correct set
            if (table[i] > table[i + 1]) {
                // inner reverse loop - swap until in correct set
                for (;i >= 0 && (table[i] > table[i + 1]) ; i--) {
                    int temp = table[i + 1];
                    table[i + 1] = table[i];
                    table[i] = temp;
                }
                // found incorrect set
                flagToStartOver = true;
            }
            // reset main loop
            if (flagToStartOver) i = 0;
        }
        return table;
        }








}
