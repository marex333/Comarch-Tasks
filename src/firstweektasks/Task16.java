package firstweektasks;        /*6.
        Napisz program
        który generuje tablicę liczb 0 i 1 (10 elementów). Program ma sprawdzić czy tablica jest symetryczna -
        pierwszy element taki jak ostatni, drugi taki jak przedostatni itd. Wynikime działania programu ma być
        wypisana wygenerowana tablica oraz true albo fale w zależności czy jest symetria czy nie.*/



public class Task16 extends Utils {
    private static int tabSize = 10;
    private static int biggestNumber = 1;
    public static void main(String[] args) {
        int[] tab = createTab(tabSize);
        tab = fillTabWithRandoms(tab, biggestNumber);
        showTab(tab);
        System.out.println("Is symetric? : " + isSymetric(tab));

    }

    private static boolean isSymetric(int[] tab) {

        for (int i = 0; i < tab.length / 2; i++) {
            if(tab[i] != tab[tab.length - 1 - i]) return false;
        }
        return true;

    }
}
