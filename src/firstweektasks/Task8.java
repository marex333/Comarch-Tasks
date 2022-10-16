package firstweektasks;

/*
     8.Wypisz na ekranie
     liczby od 0 do 99. Jeśli liczba jest podzilena przez 3 obok liczny dopisz "Fizz", jeśli liczba jest podzielna przez 5
     obok liczby dopisz "Buzz", jeśli liczba jest podzielna przez 3 i 5 obok liczby dopisz "Fizz Buzz".
     Przykład:
    1
    2
    3 Fizz
    4
    5 Buzz
    6 Fizz
    7
    8
    9 Fizz
    10
    11
    12 Fizz
    13
    14
    15 Fizz Buzz
    16
    itd.
*/
public class Task8 extends Utils{
    private static int numbersSize = 99;
    public static void main(String[] args) {
        for (int i = 0; i <= numbersSize; i++) {
            String print = Integer.toString(i);
            if (i % 3 == 0) print += " Fizz";
            if (i % 5 == 0) print += " Buzz";
                System.out.println(print);
        }
    }
}
