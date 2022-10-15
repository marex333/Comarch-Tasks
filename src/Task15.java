       /* 15.Napisz program
        który symuluje rzuty dwiema kastkami do gry (takie zwykłe białe kości
        jak w monopoly). Program ma wykońać 10 000 rzutów i wypisać liczbę która wypadała najczęściej
        (ta liczba jest occzywiście sumą oczek na dwóch kościach które symulujemy.
*/
       public class Task15 extends Utils{
    private static int repeats = 1000;

    public static void main(String[] args) {
        // fill tab repeats x toss
        int[] tab = createTab(repeats);
        for(int i = 0; i < repeats; i++) {
            tab[i] = tossDiceTwice();
        }
        int diceNumber = 1;
        int biggestCounter = 0;
        int currentCounter = 0;


        for (int i = 1; i < 13; i++) {
             for (int j = 1; j < repeats; j++) {
                 if (tab[j - 1] == i) currentCounter++;
                 if (biggestCounter < currentCounter) {
                     biggestCounter = currentCounter;
                     diceNumber = i;
                 }
             }
             currentCounter = 0;
        }
        System.out.println("biggest number :" + diceNumber);
        System.out.println("biggest counter :" + biggestCounter);

    }
    private static int tossDiceTwice() {
        return tossDice() + tossDice();
    }

}
