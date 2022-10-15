      /*
        13.Napisz probram który ma 3 zmienna a, b i c.
        Te zmienne to długości boków trójkąta. Program ma sprawdzić czy z podanych boków da się zbudować trójkąt.
        Jeśli się da to program ma wypisać na ekranie true (w przeciwnym wypadku false) i obliczyć obwód tego trójkąta.
        Jak sprawdzić czy z podanych boków da się zbudować trójkąt znajedziecie w google pod hasłem: "Nierówność trójkąta"
        */



public class Task13 {
    private static int a = 2;
    private static int b = 5;
    private static int c = 11;

    public static void main(String[] args) {
        System.out.println("Can be triangle? : " + canTriangle(a, b, c));
        System.out.println("circuit: " + (a+b+c));
    }
    private static boolean canTriangle(int a, int b, int c) {
        if (a + b < c) return false;
        if (b + c < a) return false;
        if (c + a < b) return false;
        return true;
    }
}
