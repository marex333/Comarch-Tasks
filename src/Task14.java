
       /*
        14.Napisz program który ma dwie zmienne:
        weight - waga, liczba całkowita
        height - wzrost, liczba całkowitaprogram ma wyliczac BMI
        (wskaźnik masy ciała, wzór do znalezienia w internecie,
        gdybyście nie znaleźli to piszcie) i na podstawie wyliczonego
        BMI wypisywać "Nadwaga, Niedowaga, W normie itp.
        */


public class Task14 extends Utils{
    private static int weight = 70;
    private static int height = 190;

    public static void main(String[] args) {
        System.out.println(BMICalculator(weight, height));
    }

    private static double BMICalculator(double weight, double height) {

        return weight /  (100/ height * 100 / height);
    }
}
