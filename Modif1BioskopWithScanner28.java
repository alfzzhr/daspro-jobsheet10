//Modifikasi kode program untuk memberikan opsi menu sebagai berikut:
//- Menu 1: Input data penonton
//- Menu 2: Tampilkan daftar penonton
//- Menu 3: Exit
import java.util.Scanner;

public class Modif1BioskopWithScanner28 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();
                    penonton[baris - 1][kolom - 1] = nama;
                    break;
                case 2:
                    System.out.println("Daftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Program berakhir.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Menu tidak valid.");
                    break;
            }

            System.out.print("Kembali ke menu utama? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        sc.close();
    }

}
