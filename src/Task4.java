       /*
        4.Napisz program generujący dwuwymiarową tablice (5x5) losowych liczb. Wynikiem działania programu
        ma być wyświetlona tablica oraz najmniejsza liczba z tej tablicy. Zakres losowych liczb 0 - 100.
        */

       /*
       PLAN
       1. Create tab[5][5]
       2. Fill tab with randoms (0-100)
       3. Print tab
       4. Print lowest number
       */
public class Task4 extends Utils {
    static int size1 = 5;
    static int size2 = 5;
    static int randomMax = 100;

    public static void main(String[] args) {
        // 1.
        int[][] tab = createTab(size1, size2);
        // 2.
        tab = fillTabWithRandoms(tab,randomMax);
        // 3.
        showTab(tab);


    }
}
