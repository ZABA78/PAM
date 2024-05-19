import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();

        long wynik = 1;

        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }

        System.out.println("Silnia " + n + " wynosi: " + wynik);
    }
}