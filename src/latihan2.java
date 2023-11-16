import java.util.Scanner;

class TextAnalyzer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = "";

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan buffer

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan teks: ");
                    teks = scanner.nextLine();
                    break;
                case 2:
                    hitungJumlahKarakter(teks);
                    break;
                case 3:
                    hitungJumlahKata(teks);
                    break;
                case 4:
                    cariKata(teks);
                    break;
                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu 1-5.");
            }
        }
    }

    private static void hitungJumlahKarakter(String teks) {
        int jumlahKarakter = teks.length();
        System.out.println("Jumlah karakter: " + jumlahKarakter);
    }

    private static void hitungJumlahKata(String teks) {
        if (teks.isEmpty()) {
            System.out.println("Teks belum dimasukkan.");
        } else {
            String[] kataArray = teks.split("\\s+");
            int jumlahKata = kataArray.length;
            System.out.println("Jumlah kata: " + jumlahKata);
        }
    }

    private static void cariKata(String teks) {
        if (teks.isEmpty()) {
            System.out.println("Teks belum dimasukkan.");
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan kata yang ingin dicari: ");
            String kataCari = scanner.nextLine();

            boolean ditemukan = false;
            String[] kataArray = teks.split("\\s+");
            for (String kata : kataArray) {
                if (kata.equalsIgnoreCase(kataCari)) {
                    ditemukan = true;
                    break;
                }
            }

            if (ditemukan) {
                System.out.println("Kata \"" + kataCari + "\" ditemukan dalam teks.");
            } else {
                System.out.println("Kata \"" + kataCari + "\" tidak ditemukan dalam teks.");
            }
        }
    }
}

