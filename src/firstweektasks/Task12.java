package firstweektasks;

/* 12.Napisac program w którym są 3 zmienne:
 s - liczba całkowita - oznacza pierwszą liczbę ciągu arytmetycznego
 k - liczba całkowita - oznacza krok w ciągu arytmetycznym
 n - liczba całkowita - oznacza ilość elementów ciągu.
 Program ma zwracać sumę elementów takiego ciągu. Przykład:
 s = 3, k = 5, n = 4
 program ma wygenerować 4 elementy (n), które wyglądają dla podanych s i k tak:
 3, 8, 13, 18
 następnie je sumuje i podaje wynik: 42.
 Info o tym jak działa ciąg arytmetyczny jest na wikipedii :)

*/
public class Task12 extends Utils {
    //start
    private static int s = 5;
    //jumps
    private static int k = 5;
    //how many
    private static int n = 11;
    public static void main(String[] args) {

        for(int element :arithmeticSequence(s, k, n)) {
            System.out.print(element + " ");
        }
    }
    private static int[] arithmeticSequence(int s, int k, int n) {
        int[] tab = createTab(n);
        for (int i = 0; i < n; i++) {
            tab[i] = s + (k * (i + 1));
        }
        return tab;
    }
}
