/*
        6.Napisz program w którym jest zmienna 'w'. Zmienna ta oznacza wysokość choinki.
        Program wyświetla na ekranie wypisaną choinkę o danej wysokości.
        Przykłady:
        dla w = 3 program wypisuje
          *
         ***
        *****
        pierwszy wiersz to: spacja spacja gwiazdka spacja spacja
        drugi wiersz to: spacja gwiazdka gwiazdka gwiazdka spacja
        trzeci wiersz to: gwiazdka gwiazdka gwiazdka gwiazdka gwiazdka
        dla w = 5
            *
           ***
          *****
         *******
        *********

*/
/*
        PLAN
        1. Print christmass Tree with h =  w - variable

*/


public class Task6 {
    static int w = 11;

    public static void main(String[] args) {
        printChristmassTree(w);
    }

    private static void printChristmassTree (int height) {
        String body = "*";
        String background = " ";
        String row;
        int rowSize = (height * 2) + 1;
        // main loop, height + 1 for base
        for (int i = 0; i < height + 1; i++) {
            // reset row String
            row = "";
            // inner loop, row build
            for (int j = 0; j < rowSize; j++) {
                // hardest part here
                if (i + j >= height && i + j < height + 1 + i*2) {
                    row += body;
                }
                else
                row += background;
            }
            System.out.println(row);
        }
    }
}
