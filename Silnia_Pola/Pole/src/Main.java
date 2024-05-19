import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wybierz figurę, której pole chcesz obliczyć:");
        System.out.println("1. Koło");
        System.out.println("2. Trójkąt");
        System.out.println("3. Kwadrat");
        System.out.println("4. Prostokąt");
        System.out.print("Wybierz opcję (1, 2, 3, 4): ");
        int wybor = scanner.nextInt();

        switch (wybor) {
            case 1:
                obliczPoleKola(scanner);
                break;
            case 2:
                obliczPoleTrojkata(scanner);
                break;
            case 3:
                obliczPoleKwadratu(scanner);
                break;
            case 4:
                obliczPoleProstokata(scanner);
                break;
            default:
                System.out.println("Nieprawidłowy wybór.");
        }

        scanner.close();
    }

    public static void obliczPoleKola(Scanner scanner) {
        System.out.print("Podaj promień koła: ");
        double promien = scanner.nextDouble();

        double pole = Math.PI * Math.pow(promien, 2);

        System.out.println("Pole koła wynosi: " + pole);
    }

    public static void obliczPoleTrojkata(Scanner scanner) {
        System.out.print("Podaj podstawę trójkąta: ");
        double podstawa = scanner.nextDouble();

        System.out.print("Podaj wysokość trójkąta: ");
        double wysokosc = scanner.nextDouble();

        double pole = 0.5 * podstawa * wysokosc;

        System.out.println("Pole trójkąta wynosi: " + pole);
    }

    public static void obliczPoleKwadratu(Scanner scanner) {
        System.out.print("Podaj długość boku kwadratu: ");
        double bok = scanner.nextDouble();

        double pole = bok * bok;

        System.out.println("Pole kwadratu wynosi: " + pole);
    }

    public static void obliczPoleProstokata(Scanner scanner) {
        System.out.print("Podaj długość prostokąta: ");
        double dlugosc = scanner.nextDouble();

        System.out.print("Podaj szerokość prostokąta: ");
        double szerokosc = scanner.nextDouble();

        double pole = dlugosc * szerokosc;

        System.out.println("Pole prostokąta wynosi: " + pole);
    }
}