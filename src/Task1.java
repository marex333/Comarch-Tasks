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

import java.util.Random;

public class Task1 {
    private static int tabSize = 10;
    public static void main(String[] args) {
        // 1.
        int[] tab = createTab(tabSize);
        // 2.
        tab = fillTabWithRandoms(tab, 1000);
        // 3.
        showTab(tab);
        // 4.
        tab = selectionSort(tab);
        tab = insertionSort(tab);
        // 5.
        System.out.println("====================== New Tab ======================");
        showTab(tab);
    }
    private static int[] createTab(int size) {
        return new int[size];
    }
    private static int[] fillTabWithRandoms(int[] tab, int randomMax) {
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(randomMax);
        }
        return tab;
    }
    private static void showTab(int[] tab) {
        for (int element : tab) {
            System.out.println(element);
        }
    }
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
        return table;
        }









}
