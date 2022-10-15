
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
    private static double height = 1.90;

    public static void main(String[] args) {
        System.out.println(BMICalculator(weight, height));
    }

    private static double BMICalculator(double weight, double height) {

        double bmi = weight / (height * height);
        if (bmi < 18.5) System.out.println("Niedowaga");
        if (bmi > 25) System.out.println("Nadwaga");
        else System.out.println("Waga odpowiednia");
        return bmi;
    }
}
