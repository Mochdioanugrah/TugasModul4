import java.util.Scanner;

class Kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        double angka = scanner.nextDouble();

        System.out.println("1. Akar Kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma Natural (basis e)");
        System.out.println("4. Factorial");
        System.out.print("Pilih operasi (1-4): ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                hitungAkar(angka);
                break;
            case 2:
                hitungPangkat(angka);
                break;
            case 3:
                hitungLogaritma(angka);
                break;
            case 4:
                hitungFactorial(angka);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }

    private static void hitungAkar(double angka) {
        double hasilAkar = Math.sqrt(angka);
        System.out.println("Akar Kuadrat dari " + angka + " adalah: " + hasilAkar);
    }

    private static void hitungPangkat(double angka) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan pangkat: ");
        int pangkat = scanner.nextInt();
        double hasilPangkat = Math.pow(angka, pangkat);
        System.out.println(angka + " ^ " + pangkat + " = " + hasilPangkat);
    }

    private static void hitungLogaritma(double angka) {
        double hasilLog = Math.log(angka);
        System.out.println("Logaritma Natural dari " + angka + " adalah: " + hasilLog);
    }

    private static void hitungFactorial(double angka) {
        long hasilFactorial = factorial((int) angka);
        System.out.println(angka + "! = " + hasilFactorial);
    }

    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

